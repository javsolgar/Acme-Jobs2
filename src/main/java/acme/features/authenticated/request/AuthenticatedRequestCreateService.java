
package acme.features.authenticated.request;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.request.Request;
import acme.entities.roles.Consumer;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.datatypes.Money;
import acme.framework.services.AbstractCreateService;

@Service
public class AuthenticatedRequestCreateService implements AbstractCreateService<Consumer, Request> {

	//	Internal State ---------------------------------------------------------------------------------------
	@Autowired
	AuthenticatedRequestRepository repository;

	// AbstractCreateService<Consumer, Request> Interface-----------------------------------------------------


	@Override
	public boolean authorise(final acme.framework.components.Request<Request> request) {
		assert request != null;
		return true;
	}

	@Override
	public void bind(final acme.framework.components.Request<Request> request, final Request entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;
		request.bind(entity, errors);
	}

	@Override
	public void unbind(final acme.framework.components.Request<Request> request, final Request entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		request.unbind(entity, model, "title", "description", "reward", "moment", "deadLine", "idRequest");
	}

	@Override
	public Request instantiate(final acme.framework.components.Request<Request> request) {
		assert request != null;

		Request result;
		Date moment;
		Money dinero = new Money();
		dinero.setAmount(200.0);
		dinero.setCurrency("€");

		moment = new Date(System.currentTimeMillis() - 1);
		result = new Request();
		result.setTitle("Title");
		result.setDescription("Description");
		result.setReward(dinero);
		result.setMoment(moment);
		result.setDeadLine(moment);

		return result;
	}

	@Override
	public void validate(final acme.framework.components.Request<Request> request, final Request entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final acme.framework.components.Request<Request> request, final Request entity) {
		assert request != null;
		assert entity != null;

		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);

		entity.setMoment(moment);
		this.repository.save(entity);
	}

}