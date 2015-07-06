/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.parameter;

import org.openmrs.*;

import java.util.Collection;
import java.util.Date;

public class EncounterSearchCriteriaBuilder {
    private Patient patient;
    private Location location;
    private Date fromDate;
    private Date toDate;
    private Date dateChanged;
    private Collection<Form> enteredViaForms;
    private Collection<EncounterType> encounterTypes;
    private Collection<Provider> providers;
    private Collection<VisitType> visitTypes;
    private Collection<Visit> visits;
    private boolean includeVoided;

    public EncounterSearchCriteriaBuilder setPatient(Patient patient) {
        this.patient = patient;
        return this;
    }

    public EncounterSearchCriteriaBuilder setLocation(Location location) {
        this.location = location;
        return this;
    }

    public EncounterSearchCriteriaBuilder setFromDate(Date fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    public EncounterSearchCriteriaBuilder setToDate(Date toDate) {
        this.toDate = toDate;
        return this;
    }

    public EncounterSearchCriteriaBuilder setDateChanged(Date dateChanged) {
        this.dateChanged = dateChanged;
        return this;
    }

    public EncounterSearchCriteriaBuilder setEnteredViaForms(Collection<Form> enteredViaForms) {
        this.enteredViaForms = enteredViaForms;
        return this;
    }

    public EncounterSearchCriteriaBuilder setEncounterTypes(Collection<EncounterType> encounterTypes) {
        this.encounterTypes = encounterTypes;
        return this;
    }

    public EncounterSearchCriteriaBuilder setProviders(Collection<Provider> providers) {
        this.providers = providers;
        return this;
    }

    public EncounterSearchCriteriaBuilder setVisitTypes(Collection<VisitType> visitTypes) {
        this.visitTypes = visitTypes;
        return this;
    }

    public EncounterSearchCriteriaBuilder setVisits(Collection<Visit> visits) {
        this.visits = visits;
        return this;
    }

    public EncounterSearchCriteriaBuilder setIncludeVoided(boolean includeVoided) {
        this.includeVoided = includeVoided;
        return this;
    }

    public EncounterSearchCriteria createEncounterSearchCriteria() {
        return new EncounterSearchCriteria(patient, location, fromDate, toDate, dateChanged, enteredViaForms,
                encounterTypes, providers, visitTypes, visits, includeVoided);
    }
}