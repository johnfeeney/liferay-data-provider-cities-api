package com.jfeeney.demo.application;

import java.util.Collections;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;

/**
 * @author jfeen
 */
@ApplicationPath("/cities")
@Component(immediate = true, service = Application.class)
public class EdmMozambiqueCitiesApiApplication extends Application {

	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}

	@GET
	@Produces("text/plain")
	public String working() {
		//return "It works!";
		return "[{\"clientId\":\"Angoche\",\"nameCurrentValue\":\"Angoche\",\"active\":true},{\"clientId\":\"Beira\",\"nameCurrentValue\":\"Beira\",\"active\":true},{\"clientId\":\"Bilene\",\"nameCurrentValue\":\"Bilene\",\"active\":true},{\"clientId\":\"Catandica\",\"nameCurrentValue\":\"Catandica\",\"active\":true},{\"clientId\":\"Chibuto\",\"nameCurrentValue\":\"Chibuto\",\"active\":true},{\"clientId\":\"Chicualacuala\",\"nameCurrentValue\":\"Chicualacuala\",\"active\":true},{\"clientId\":\"Chimoio\",\"nameCurrentValue\":\"Chimoio\",\"active\":true},{\"clientId\":\"Chinde\",\"nameCurrentValue\":\"Chinde\",\"active\":true},{\"clientId\":\"Chokwé\",\"nameCurrentValue\":\"Chokwé\",\"active\":true},{\"clientId\":\"Cuamba\",\"nameCurrentValue\":\"Cuamba\",\"active\":true},{\"clientId\":\"Dondo\",\"nameCurrentValue\":\"Dondo\",\"active\":true},{\"clientId\":\"Gurúè\",\"nameCurrentValue\":\"Dondo\",\"active\":true},{\"clientId\":\"Inhambane\",\"nameCurrentValue\":\"Inhambane\",\"active\":true},{\"clientId\":\"Lichinga\",\"nameCurrentValue\":\"Lichinga\",\"active\":true},{\"clientId\":\"Manica\",\"nameCurrentValue\":\"Manica\",\"active\":true},{\"clientId\":\"Maputo (Capital)\",\"nameCurrentValue\":\"Maputo (Capital)\",\"active\":true},{\"clientId\":\"Marracuene\",\"nameCurrentValue\":\"Marracuene\",\"active\":true},{\"clientId\":\"Matola\",\"nameCurrentValue\":\"Matola\",\"active\":true},{\"clientId\":\"Maxixe\",\"nameCurrentValue\":\"Maxixe\",\"active\":true},{\"clientId\":\"Moatize\",\"nameCurrentValue\":\"Moatize\",\"active\":true},{\"clientId\":\"Moçambique\",\"nameCurrentValue\":\"Moçambique\",\"active\":true},{\"clientId\":\"Mocímboa da Praia\",\"nameCurrentValue\":\"Mocímboa da Praia\",\"active\":true},{\"clientId\":\"Mocuba\",\"nameCurrentValue\":\"Mocuba\",\"active\":true},{\"clientId\":\"Montepuez\",\"nameCurrentValue\":\"Montepuez\",\"active\":true},{\"clientId\":\"Mueda\",\"nameCurrentValue\":\"Mueda\",\"active\":true},{\"clientId\":\"Naamcha\",\"nameCurrentValue\":\"Naamcha\",\"active\":true},{\"clientId\":\"Nacala\",\"nameCurrentValue\":\"Nacala\",\"active\":true},{\"clientId\":\"Nampula\",\"nameCurrentValue\":\"Nampula\",\"active\":true},{\"clientId\":\"Palma\",\"nameCurrentValue\":\"Palma\",\"active\":true},{\"clientId\":\"Pemba\",\"nameCurrentValue\":\"Pemba\",\"active\":true},{\"clientId\":\"Ponta d'Ouro\",\"nameCurrentValue\":\"Ponta d'Ouro\",\"active\":true},{\"clientId\":\"Quelimane\",\"nameCurrentValue\":\"Quelimane\",\"active\":true},{\"clientId\":\"Tete\",\"nameCurrentValue\":\"Tete\",\"active\":true},{\"clientId\":\"Vilankulo\",\"nameCurrentValue\":\"Vilankulo\",\"active\":true},{\"clientId\":\"Xai-Xai\",\"nameCurrentValue\":\"Xai-Xai\",\"active\":true},{\"clientId\":\"Zavala\",\"nameCurrentValue\":\"Zavala\",\"active\":true}]";
	}

	@GET
	@Path("/morning")
	@Produces("text/plain")
	public String hello() {
		return "Good morning!";
	}

	@GET
	@Path("/morning/{name}")
	@Produces("text/plain")
	public String morning(
		@PathParam("name") String name,
		@QueryParam("drink") String drink) {

		String greeting = "Good Morning " + name;

		if (drink != null) {
			greeting += ". Would you like some " + drink + "?";
		}

		return greeting;
	}

}