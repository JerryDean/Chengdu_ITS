package com.ste.emer.model;

public enum EmergencyIncidentTypeSubEnum {
	All	(0),
	Traffic_accident(1),
	Fire_accident(2),
	Safety_accidents(3),
	Hazardous_chemical_leakage (4),
	Accidents_of_public_facilities(5),
	Nuclear_and_radiation_accidents(6),
	Environmental_pollution_and_ecological_damage_accident(7),
	Flood_and_drought_disasters(8),
	Meteorological_disasters (9),
	Earthquake_disaster (10),
	Geological_disasters (11),
	Biological_disasters (12),
	Forest_fire(13),
	Transmission_of_infectious_diseases (14),
	Group_unknown_cause_disease (15),
	Food_safety_and_occupational_hazard (16),
	Animal_epidemic (17),
	Serious_impact_on_public_health(18),
	Terrorist_attacks (19),
	Family_religious_events (20),
	Economic_security_incident (21),
	Foreign_events (22),
	Group_events (23);
	public Integer value;
	private EmergencyIncidentTypeSubEnum(Integer value){
		this.value=value;
	}
}
