package com.prueba.util;

import java.util.concurrent.TimeUnit;

import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;

import com.prueba.gui.MessageManager;

public class LoginErrorPhaseListener implements PhaseListener {
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginErrorPhaseListener.class);

	public long startTime;

	public void afterPhase(PhaseEvent arg0) {
		if (PhaseId.RENDER_RESPONSE == arg0.getPhaseId()
				&& arg0.getFacesContext().getViewRoot().getViewId()
						.indexOf("xhtml") > 0) {
			long time = (System.nanoTime() - startTime);
			long millis = TimeUnit.MILLISECONDS.convert(time,
					TimeUnit.NANOSECONDS);
			LOGGER.debug("Runtime = " + millis / Constants.TIME + " seconds.");
		}
	}

	public void beforePhase(PhaseEvent arg0) {
		if (PhaseId.RENDER_RESPONSE == arg0.getPhaseId()
				&& arg0.getFacesContext().getViewRoot().getViewId()
						.indexOf("xhtml") > 0) {
			startTime = System.nanoTime();
			LOGGER.debug("Page : "
					+ arg0.getFacesContext().getViewRoot().getViewId());
		}
						Exception e = (Exception) FacesContext.getCurrentInstance()
				.getExternalContext().getSessionMap()
				.get(WebAttributes.AUTHENTICATION_EXCEPTION);

		if (e instanceof BadCredentialsException) {
			FacesContext.getCurrentInstance().getExternalContext()
					.getSessionMap().put(
							WebAttributes.AUTHENTICATION_EXCEPTION, null);
			MessageManager.createErrorMessage(null,JSFUtils
					.getStringFromBundle("error.user.password.login"));
		} else if (e instanceof AuthenticationServiceException) {
			FacesContext.getCurrentInstance().getExternalContext()
					.getSessionMap().put(
							WebAttributes.AUTHENTICATION_EXCEPTION, null);
			MessageManager.createErrorMessage(null,JSFUtils
					.getStringFromBundle("error.user.password.login"));
		} else if (e instanceof LockedException) {
			FacesContext.getCurrentInstance().getExternalContext()
					.getSessionMap().put(
							WebAttributes.AUTHENTICATION_EXCEPTION, null);
			MessageManager.createErrorMessage(null,JSFUtils
					.getStringFromBundle("error.user.locked"));
		} else if (e instanceof DisabledException) {
			FacesContext.getCurrentInstance().getExternalContext()
					.getSessionMap().put(
							WebAttributes.AUTHENTICATION_EXCEPTION, null);
			MessageManager.createErrorMessage(null,JSFUtils
					.getStringFromBundle("error.user.disabled"));
		} else if (e instanceof SessionAuthenticationException) {
			FacesContext.getCurrentInstance().getExternalContext()
					.getSessionMap().put(
							WebAttributes.AUTHENTICATION_EXCEPTION, null);
			MessageManager.createErrorMessage(null,JSFUtils
					.getStringFromBundle("error.user.duplicate"));
		}
			}

	public PhaseId getPhaseId() {
		return PhaseId.RENDER_RESPONSE;

	}
}
