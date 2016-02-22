package com.guillermods.velocitysample.webapp.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class InputSample {

	@NotBlank(message = "Mandatorio")
	private String sampleProperty;
	
	@NotBlank(message="Mandatorio")
	@Size(min=5, max=10, message="Tamaño entre 5 o 10")
	private String description;
	
	@NotNull(message = "Debe marcar almenos uno")
	private String checkedElemnts[];
	
	@NotBlank(message = "Debe seleccionar una opcion")
	private String selectedOption;
	
	@NotNull(message = "Debe  seleccionar al menos uno")
	private String selectedOptions[];
	
	@NotBlank(message = "Debe seleccionar al menos uno")
	private String selectedRadio;
	
	

	public String getSampleProperty() {
		return sampleProperty;
	}

	public void setSampleProperty(String sampleProperty) {
		this.sampleProperty = sampleProperty;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String[] getCheckedElemnts() {
		return checkedElemnts;
	}

	public void setCheckedElemnts(String[] checkedElemnts) {
		this.checkedElemnts = checkedElemnts;
	}

	public String getSelectedOption() {
		return selectedOption;
	}

	public void setSelectedOption(String selectedOption) {
		this.selectedOption = selectedOption;
	}

	public String[] getSelectedOptions() {
		return selectedOptions;
	}

	public void setSelectedOptions(String[] selectedOptions) {
		this.selectedOptions = selectedOptions;
	}

	public String getSelectedRadio() {
		return selectedRadio;
	}

	public void setSelectedRadio(String selectedRadio) {
		this.selectedRadio = selectedRadio;
	}

	
	
	
	
	
	
	
	
	
}
