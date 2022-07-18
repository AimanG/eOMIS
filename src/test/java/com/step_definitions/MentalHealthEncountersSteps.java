package com.step_definitions;
import io.cucumber.java.en.Then;
import com.utilities.BrowserUtils;
import com.utilities.Pages;
import org.apache.log4j.Logger;

public class MentalHealthEncountersSteps extends BrowserUtils {
    Pages pages = new Pages();
    Logger logger = Logger.getLogger(LoginSteps.class);


    @Then("Enter the Parole Office Destination")
    public void enter_the_parole_office_destination() {
        logger.info("Enter the Parole Office Destination");
        pages.getMentalHealthEncountersPage().paroleOfficeDestination.clear();
        pages.getMentalHealthEncountersPage().paroleOfficeDestination.sendKeys("Test Destination");
    }

    @Then("Enter the Parole Mental Health Clinician")
    public void enter_the_parole_mental_health_clinician() {
        logger.info("Enter the Parole Mental Health Clinician");
        pages.getMentalHealthEncountersPage().paroleMentalHealthDestination.clear();
        pages.getMentalHealthEncountersPage().paroleMentalHealthDestination.sendKeys("Test Mental Health Destination");
    }

    @Then("Enter the Contact Information")
    public void enter_the_contact_information() {
        logger.info("Enter the Contact Information");
        pages.getMentalHealthEncountersPage().contactInformation.clear();
        pages.getMentalHealthEncountersPage().contactInformation.sendKeys("Test Contact Information");
    }

    @Then("Add Timestamp to Individualized strategies to promote offender success; identify resources such as supports and coping skills: what individualized strategies have been identified and used")
    public void add_timestamp_to_individualized_strategies_to_promote_offender_success_identify_resources_such_as_supports_and_coping_skills_what_individualized_strategies_have_been_identified_and_used() {
        logger.info("Add Timestamp to Individualized strategies to promote offender success; identify resources such as supports and coping skills: what individualized strategies have been identified and used");
        pages.getMentalHealthEncountersPage().timestampField1.clear();
        pages.getMedicalEncountersPage().timestamp1.click();
    }

    @Then("Add Timestamp to Describe helpful approaches that increased offenders motivation for change and or independent living skills")
    public void add_timestamp_to_describe_helpful_approaches_that_increased_offenders_motivation_for_change_and_or_independent_living_skills() {
        logger.info("Add Timestamp to Describe helpful approaches that increased offenders motivation for change and or independent living skills");
        pages.getMentalHealthEncountersPage().timestampField2.clear();
        pages.getMedicalEncountersPage().timestamp2.click();
    }

    @Then("Add Timestamp to Current identified barriers and risk factors: Include current danger to self and or others and or grave disability - specify behavior risk factors")
    public void add_timestamp_to_current_identified_barriers_and_risk_factors_include_current_danger_to_self_and_or_others_and_or_grave_disability_specify_behavior_risk_factors() {
        logger.info("Add Timestamp to Current identified barriers and risk factors: Include current danger to self and or others and or grave disability - specify behavior risk factors");
        pages.getMentalHealthEncountersPage().timestampField3.clear();
        pages.getMedicalEncountersPage().timestamp3.click();
    }

    @Then("Add Timestamp to Identify gaps in resources that need to be addressed to promote offender success:")
    public void add_timestamp_to_identify_gaps_in_resources_that_need_to_be_addressed_to_promote_offender_success() {
        logger.info("Add Timestamp to Identify gaps in resources that need to be addressed to promote offender success:");
        pages.getMentalHealthEncountersPage().timestampField4.clear();
        pages.getMedicalEncountersPage().timestamp4.click();
    }

    @Then("Add Timestamp to Describe offenders attitude, motivation toward community success")
    public void add_timestamp_to_describe_offenders_attitude_motivation_toward_community_success() {
        logger.info("Add Timestamp to Describe offenders attitude, motivation toward community success");
        pages.getMentalHealthEncountersPage().timestampField5.clear();
        pages.getMedicalEncountersPage().timestamp5.click();
    }

    @Then("Add Timestamp to Transition Plan: In Reach appointment completed - date and community provider")
    public void add_timestamp_to_transition_plan_in_reach_appointment_completed_date_and_community_provider() {
        logger.info("Add Timestamp to Transition Plan: In Reach appointment completed - date and community provider");
        pages.getMentalHealthEncountersPage().timestampField6.clear();
        pages.getMedicalEncountersPage().timestamp6.click();
    }

    @Then("Select the ROI Obtained to Sex Offender")
    public void select_the_roi_obtained_to_sex_offender() {
        logger.info("Select the ROI Obtained to Sex Offender");
        pages.getMentalHealthEncountersPage().sexOffenderROIObtained.click();
    }

    @Then("Unselect the ROI Obtained to Sex Offender")
    public void unselect_the_roi_obtained_to_sex_offender() {
        logger.info("Unselect the ROI Obtained to Sex Offender");
        pages.getMentalHealthEncountersPage().sexOffenderROIObtained.click();
    }

    @Then("Select the ROI Obtained to Mental Health")
    public void select_the_roi_obtained_to_mental_health() {
        logger.info("Select the ROI Obtained to Mental Health");
        pages.getMentalHealthEncountersPage().mentalHealthROIObtained.click();
    }

    @Then("Unselect the ROI Obtained to Mental Health")
    public void unselect_the_roi_obtained_to_mental_health() {
        logger.info("Unselect the ROI Obtained to Mental Health");
        pages.getMentalHealthEncountersPage().mentalHealthROIObtained.click();
    }

    @Then("Select the ROI Obtained to Substance Use")
    public void select_the_roi_obtained_to_substance_use() {
        logger.info("Select the ROI Obtained to Substance Use");
        pages.getMentalHealthEncountersPage().substanceUseROIObtained.click();
    }

    @Then("Unselect the ROI Obtained to Substance Use")
    public void unselect_the_roi_obtained_to_substance_use() {
        logger.info("Unselect the ROI Obtained to Substance Use");
        pages.getMentalHealthEncountersPage().substanceUseROIObtained.click();
    }

    @Then("Select the ROI Obtained to Parole")
    public void select_the_roi_obtained_to_parole() {
        logger.info("Select the ROI Obtained to Parole");
        pages.getMentalHealthEncountersPage().paroleROIObtained.click();
    }

    @Then("Unselect the ROI Obtained to Parole")
    public void unselect_the_roi_obtained_to_parole() {
        logger.info("Unselect the ROI Obtained to Parole");
        pages.getMentalHealthEncountersPage().paroleROIObtained.click();
    }

    @Then("Select Approved to IBAAP APPROVAL DENIAL")
    public void select_approved_to_ibaap_approval_denial() {
        logger.info("Select Approved to IBAAP APPROVAL DENIAL");
    }

    @Then("Select Denied to IBAAP APPROVAL DENIAL")
    public void select_denied_to_ibaap_approval_denial() {
        logger.info("Select Denied to IBAAP APPROVAL DENIAL");
    }

    @Then("Enter the Level of Education completed")
    public void enter_the_level_of_education_completed() {
      logger.info("Enter the Level of Education completed");
    }
    @Then("Select N to {int}. Are you taking psychiatric medications now?")
    public void select_n_to_are_you_taking_psychiatric_medications_now(Integer int1) {

    }
    @Then("Select Y to {int}. Are you taking psychiatric medications now?")
    public void select_y_to_are_you_taking_psychiatric_medications_now(Integer int1) {

    }
    @Then("Select N to {int}. Have you ever taken a psychiatric medication?")
    public void select_n_to_have_you_ever_taken_a_psychiatric_medication(Integer int1) {

    }
    @Then("Select Y to {int}. Have you ever taken a psychiatric medication?")
    public void select_y_to_have_you_ever_taken_a_psychiatric_medication(Integer int1) {

    }
    @Then("Select N to {int}. Have you ever been hospitalized for mental health problems?")
    public void select_n_to_have_you_ever_been_hospitalized_for_mental_health_problems(Integer int1) {

    }
    @Then("Select Y to {int}. Have you ever been hospitalized for mental health problems?")
    public void select_y_to_have_you_ever_been_hospitalized_for_mental_health_problems(Integer int1) {

    }
    @Then("Select N to {int}. Have you ever been treated for mental health problems?")
    public void select_n_to_have_you_ever_been_treated_for_mental_health_problems(Integer int1) {

    }
    @Then("Select Y to {int}. Have you ever been treated for mental health problems?")
    public void select_y_to_have_you_ever_been_treated_for_mental_health_problems(Integer int1) {

    }
    @Then("Select N to {int}. Is there a history of special placement at SCCF or admissions to CMHI-P?")
    public void select_n_to_is_there_a_history_of_special_placement_at_sccf_or_admissions_to_cmhi_p(Integer int1) {

    }
    @Then("Select Y to {int}. Is there a history of special placement at SCCF or admissions to CMHI-P?")
    public void select_y_to_is_there_a_history_of_special_placement_at_sccf_or_admissions_to_cmhi_p(Integer int1) {

    }
    @Then("Select N to {int}. Has anyone in your family ever been treated for mental health problems?")
    public void select_n_to_has_anyone_in_your_family_ever_been_treated_for_mental_health_problems(Integer int1) {

    }
    @Then("Select Y to {int}. Has anyone in your family ever been treated for mental health problems?")
    public void select_y_to_has_anyone_in_your_family_ever_been_treated_for_mental_health_problems(Integer int1) {

    }
    @Then("Select N to {int}. Have you had a recent death of someone close to you, divorce, or loss of a relationship?")
    public void select_n_to_have_you_had_a_recent_death_of_someone_close_to_you_divorce_or_loss_of_a_relationship(Integer int1) {

    }
    @Then("Select Y to {int}. Have you had a recent death of someone close to you, divorce, or loss of a relationship?")
    public void select_y_to_have_you_had_a_recent_death_of_someone_close_to_you_divorce_or_loss_of_a_relationship(Integer int1) {

    }
    @Then("Select N to {int}. Have you ever tried to kill yourself?")
    public void select_n_to_have_you_ever_tried_to_kill_yourself(Integer int1) {

    }
    @Then("Select Y to {int}. Have you ever tried to kill yourself?")
    public void select_y_to_have_you_ever_tried_to_kill_yourself(Integer int1) {

    }
    @Then("Select N to {int}. Are you thinking about killing yourself now?")
    public void select_n_to_are_you_thinking_about_killing_yourself_now(Integer int1) {

    }
    @Then("Select Y to {int}. Are you thinking about killing yourself now?")
    public void select_y_to_are_you_thinking_about_killing_yourself_now(Integer int1) {

    }
    @Then("Select N to {int}. Have you ever injured yourself on purpose by burning, cutting, or scratching yourself?")
    public void select_n_to_have_you_ever_injured_yourself_on_purpose_by_burning_cutting_or_scratching_yourself(Integer int1) {

    }
    @Then("Select Y to {int}. Have you ever injured yourself on purpose by burning, cutting, or scratching yourself?")
    public void select_y_to_have_you_ever_injured_yourself_on_purpose_by_burning_cutting_or_scratching_yourself(Integer int1) {

    }
    @Then("Select N to {int}. Are you thinking about hurting yourself now?")
    public void select_n_to_are_you_thinking_about_hurting_yourself_now(Integer int1) {

    }
    @Then("Select Y to {int}. Are you thinking about hurting yourself now?")
    public void select_y_to_are_you_thinking_about_hurting_yourself_now(Integer int1) {

    }
    @Then("Select N to {int}. Have you ever been treated for alcohol drug or other substance abuse problems?")
    public void select_n_to_have_you_ever_been_treated_for_alcohol_drug_or_other_substance_abuse_problems(Integer int1) {

    }
    @Then("Select Y to {int}. Have you ever been treated for alcohol drug or other substance abuse problems?")
    public void select_y_to_have_you_ever_been_treated_for_alcohol_drug_or_other_substance_abuse_problems(Integer int1) {

    }
    @Then("Select N to {int}. Have you ever been violent toward another person?")
    public void select_n_to_have_you_ever_been_violent_toward_another_person(Integer int1) {

    }
    @Then("Select Y to {int}. Have you ever been violent toward another person?")
    public void select_y_to_have_you_ever_been_violent_toward_another_person(Integer int1) {

    }
    @Then("Select N to {int}. Have you ever been the victim of domestic violence?")
    public void select_n_to_have_you_ever_been_the_victim_of_domestic_violence(Integer int1) {

    }
    @Then("Select Y to {int}. Have you ever been the victim of domestic violence?")
    public void select_y_to_have_you_ever_been_the_victim_of_domestic_violence(Integer int1) {

    }
    @Then("Select N to {int}. Do you have any concerns for your safety?")
    public void select_n_to_do_you_have_any_concerns_for_your_safety(Integer int1) {

    }
    @Then("Select Y to {int}. Do you have any concerns for your safety?")
    public void select_y_to_do_you_have_any_concerns_for_your_safety(Integer int1) {

    }
    @Then("Select N to {int}. Have you ever experienced prior sexual victimization or molestation?")
    public void select_n_to_have_you_ever_experienced_prior_sexual_victimization_or_molestation(Integer int1) {

    }
    @Then("Select Y to {int}. Have you ever experienced prior sexual victimization or molestation?")
    public void select_y_to_have_you_ever_experienced_prior_sexual_victimization_or_molestation(Integer int1) {

    }
    @Then("Select N to {int}. Have you ever perpetrated sexual assault abuse?")
    public void select_n_to_have_you_ever_perpetrated_sexual_assault_abuse(Integer int1) {

    }
    @Then("Select Y to {int}. Have you ever perpetrated sexual assault abuse?")
    public void select_y_to_have_you_ever_perpetrated_sexual_assault_abuse(Integer int1) {

    }
    @Then("Select N to {int}. Appears unusually emotionally upset, depressed or fearful?")
    public void select_n_to_appears_unusually_emotionally_upset_depressed_or_fearful(Integer int1) {

    }
    @Then("Select Y to {int}. Appears unusually emotionally upset, depressed or fearful?")
    public void select_y_to_appears_unusually_emotionally_upset_depressed_or_fearful(Integer int1) {

    }
    @Then("Select N to {int}. Appears agitated, restless, or is unable to sit still, sleep, or stop talking")
    public void select_n_to_appears_agitated_restless_or_is_unable_to_sit_still_sleep_or_stop_talking(Integer int1) {

    }
    @Then("Select Y to {int}. Appears agitated, restless, or is unable to sit still, sleep, or stop talking")
    public void select_y_to_appears_agitated_restless_or_is_unable_to_sit_still_sleep_or_stop_talking(Integer int1) {

    }
    @Then("Select N to {int}. Appears aggressive, threatening, hostile, belligerent, wont be calmed down, has a history of angry outbursts")
    public void select_n_to_appears_aggressive_threatening_hostile_belligerent_wont_be_calmed_down_has_a_history_of_angry_outbursts(Integer int1) {

    }
    @Then("Select Y to {int}. Appears aggressive, threatening, hostile, belligerent, wont be calmed down, has a history of angry outbursts")
    public void select_y_to_appears_aggressive_threatening_hostile_belligerent_wont_be_calmed_down_has_a_history_of_angry_outbursts(Integer int1) {

    }
    @Then("Select N to {int}. Appears to be distracted, is disoriented, and or unable to understand or follow directions")
    public void select_n_to_appears_to_be_distracted_is_disoriented_and_or_unable_to_understand_or_follow_directions(Integer int1) {

    }
    @Then("Select Y to {int}. Appears to be distracted, is disoriented, and or unable to understand or follow directions")
    public void select_y_to_appears_to_be_distracted_is_disoriented_and_or_unable_to_understand_or_follow_directions(Integer int1) {

    }
    @Then("Select N to {int}. Has bruises, cuts, scrapes, burns, or other physical injuries or appers to have been traumatized in some way")
    public void select_n_to_has_bruises_cuts_scrapes_burns_or_other_physical_injuries_or_appers_to_have_been_traumatized_in_some_way(Integer int1) {

    }
    @Then("Select Y to {int}. Cleared to general population. No Mental Health or Psychiatric referrals")
    public void select_y_to_cleared_to_general_population_no_mental_health_or_psychiatric_referrals(Integer int1) {

    }
    @Then("Select N to {int}. Cleared to general population. No Mental Health or Psychiatric referrals")
    public void select_n_to_cleared_to_general_population_no_mental_health_or_psychiatric_referrals(Integer int1) {

    }
    @Then("Select Y to {int}. Cleared to general population with referral: Mental Health Psychiatry")
    public void select_y_to_cleared_to_general_population_with_referral_mental_health_psychiatry(Integer int1) {

    }
    @Then("Select N to {int}. Cleared to general population with referral: Mental Health Psychiatry")
    public void select_n_to_cleared_to_general_population_with_referral_mental_health_psychiatry(Integer int1) {

    }
    @Then("Select Y to {int}. Referral to Mental Health for emergency evaluation and treatment planning")
    public void select_y_to_referral_to_mental_health_for_emergency_evaluation_and_treatment_planning(Integer int1) {

    }
    @Then("Select N to {int}. Referral to Mental Health for emergency evaluation and treatment planning")
    public void select_n_to_referral_to_mental_health_for_emergency_evaluation_and_treatment_planning(Integer int1) {

    }
    @Then("Select Y to {int}. Referral to Psychiatry for emergency evaluation and treatment planning")
    public void select_y_to_referral_to_psychiatry_for_emergency_evaluation_and_treatment_planning(Integer int1) {

    }
    @Then("Select N to {int}. Referral for Diagnostic Testing and or Special Placement Referral")
    public void select_n_to_referral_for_diagnostic_testing_and_or_special_placement_referral(Integer int1) {

    }
    @Then("Select Y to {int}. Referral for Diagnostic Testing and or Special Placement Referral")
    public void select_y_to_referral_for_diagnostic_testing_and_or_special_placement_referral(Integer int1) {

    }
    @Then("Select N to {int}. Cleared for housing, work assignment, and program participation")
    public void select_n_to_cleared_for_housing_work_assignment_and_program_participation(Integer int1) {

    }
    @Then("Select Y to {int}. Cleared for housing, work assignment, and program participation")
    public void select_y_to_cleared_for_housing_work_assignment_and_program_participation(Integer int1) {

    }

    @Then("Select On Call MENTAL HEALTH CRISIS")
    public void select_on_call_mental_health_crisis() {

    }
    @Then("Select Regular Shift MENTAL HEALTH CRISIS")
    public void select_regular_shift_mental_health_crisis() {

    }
    @Then("Check Threats of Self-Harm to Crisis Type")
    public void check_threats_of_self_harm_to_crisis_type() {

    }
    @Then("Uncheck Threats of Self-Harm to Crisis Type")
    public void uncheck_threats_of_self_harm_to_crisis_type() {

    }
    @Then("Check Hanging to Crisis Type")
    public void check_hanging_to_crisis_type() {

    }
    @Then("Uncheck Hanging to Crisis Type")
    public void uncheck_hanging_to_crisis_type() {

    }
    @Then("Check Lacerations to Crisis Type")
    public void check_lacerations_to_crisis_type() {

    }
    @Then("Uncheck Lacerations to Crisis Type")
    public void uncheck_lacerations_to_crisis_type() {

    }
    @Then("Check Jumping to Crisis Type")
    public void check_jumping_to_crisis_type() {

    }
    @Then("Uncheck Jumping to Crisis Type")
    public void uncheck_jumping_to_crisis_type() {

    }
    @Then("Check Ingestion to Crisis Type")
    public void check_ingestion_to_crisis_type() {

    }
    @Then("Uncheck Ingestion to Crisis Type")
    public void uncheck_ingestion_to_crisis_type() {

    }
    @Then("Check Intentional Overdose to Crisis Type")
    public void check_intentional_overdose_to_crisis_type() {

    }
    @Then("Uncheck Intentional Overdose to Crisis Type")
    public void uncheck_intentional_overdose_to_crisis_type() {

    }
    @Then("Check Head- Banging to Crisis Type")
    public void check_head_banging_to_crisis_type() {

    }
    @Then("Uncheck Head- Banging to Crisis Type")
    public void uncheck_head_banging_to_crisis_type() {

    }
    @Then("Check Other Self- Injurious Behavior to Crisis Type")
    public void check_other_self_injurious_behavior_to_crisis_type() {

    }
    @Then("Uncheck Other Self- Injurious Behavior to Crisis Type")
    public void uncheck_other_self_injurious_behavior_to_crisis_type() {

    }
    @Then("Check Florid Psychosis to Crisis Type")
    public void check_florid_psychosis_to_crisis_type() {

    }
    @Then("Uncheck Florid Psychosis to Crisis Type")
    public void uncheck_florid_psychosis_to_crisis_type() {

    }
    @Then("Check Completed Suicide to Crisis Type")
    public void check_completed_suicide_to_crisis_type() {

    }
    @Then("Uncheck Completed Suicide to Crisis Type")
    public void uncheck_completed_suicide_to_crisis_type() {

    }
    @Then("Select Counsel- Return to Cell")
    public void select_counsel_return_to_cell() {

    }
    @Then("Select Transport for Medical")
    public void select_transport_for_medical() {

    }
    @Then("Select MH Watch Begins")
    public void select_mh_watch_begins() {

    }
    @Then("Select Infirmary Admission")
    public void select_infirmary_admission() {

    }

    @Then("Select Y to {int}. Have you EVER been treated for mental health problems?")
    public void select_Y_to_have_you_ever_been_treated_for_mental_health_problems(Integer int1) {

    }

    @Then("Select N to {int}. Have you EVER been treated for mental health problems?")
    public void select_N_to_have_you_ever_been_treated_for_mental_health_problems(Integer int22) {

    }

    @Then("Select Y to {int}. Have you been treated for mental health problems in the last {int} months?")
    public void select_y_to_have_you_been_treated_for_mental_health_problems_in_the_last_months(Integer int1, Integer int2) {

    }

    @Then("Select N to {int}. Have you been treated for mental health problems in the last {int} months?")
    public void select_n_to_have_you_been_treated_for_mental_health_problems_in_the_last_months(Integer int1, Integer int2) {

    }

    @Then("Select Y to {int}. Have you ever been hospitalized for mental health problems in the Last {int} years?")
    public void select_y_to_have_you_ever_been_hospitalized_for_mental_health_problems_in_the_last_years(Integer int1, Integer int2) {

    }

    @Then("Select N to {int}. Have you ever been hospitalized for mental health problems in the Last {int} years?")
    public void select_n_to_have_you_ever_been_hospitalized_for_mental_health_problems_in_the_last_years(Integer int1, Integer int2) {

    }

    @Then("Select Y to {int}. Have you EVER been prescribed psychiatric medications?")
    public void select_y_to_have_you_ever_been_prescribed_psychiatric_medications(Integer int1) {

    }

    @Then("Select N to {int}. Have you EVER been prescribed psychiatric medications?")
    public void select_n_to_have_you_ever_been_prescribed_psychiatric_medications(Integer int1) {

    }

    @Then("Select Y to {int}. Are you taking psychiatric medication NOW?")
    public void select_y_to_are_you_taking_psychiatric_medication_now(Integer int1) {

    }

    @Then("Select N to {int}. Are you taking psychiatric medication NOW?")
    public void select_n_to_are_you_taking_psychiatric_medication_now(Integer int1) {

    }

    @Then("Select Y to {int}.Has anyone in your family been treated for a mental health problem or attempted committed suicide?")
    public void select_y_to_has_anyone_in_your_family_been_treated_for_a_mental_health_problem_or_attempted_committed_suicide(Integer int1) {

    }

    @Then("Select N to {int}.Has anyone in your family been treated for a mental health problem or attempted committed suicide?")
    public void select_n_to_has_anyone_in_your_family_been_treated_for_a_mental_health_problem_or_attempted_committed_suicide(Integer int1) {

    }

    @Then("Select Y to {int}. Do you currently have a mental health problem you need to talk to someone about?")
    public void select_y_to_do_you_currently_have_a_mental_health_problem_you_need_to_talk_to_someone_about(Integer int1) {

    }

    @Then("Select N to {int}. Do you currently have a mental health problem you need to talk to someone about?")
    public void select_n_to_do_you_currently_have_a_mental_health_problem_you_need_to_talk_to_someone_about(Integer int1) {

    }

    @Then("Select Y to {int}. Do you have a history of of head injury or traumatic brain injury with loss of consciousness?")
    public void select_y_to_do_you_have_a_history_of_of_head_injury_or_traumatic_brain_injury_with_loss_of_consciousness(Integer int1) {

    }

    @Then("Select N to {int}. Do you have a history of of head injury or traumatic brain injury with loss of consciousness?")
    public void select_n_to_do_you_have_a_history_of_of_head_injury_or_traumatic_brain_injury_with_loss_of_consciousness(Integer int1) {

    }

    @Then("Select Y to {int}. Have you ever experienced prior sexual victimization?")
    public void select_y_to_have_you_ever_experienced_prior_sexual_victimization(Integer int1) {

    }

    @Then("Select N to {int}. Have you ever experienced prior sexual victimization?")
    public void select_n_to_have_you_ever_experienced_prior_sexual_victimization(Integer int1) {

    }

    @Then("Select Y to {int}. Have you EVER tried to harm or kill yourself?")
    public void select_y_to_have_you_ever_tried_to_harm_or_kill_yourself(Integer int1) {

    }

    @Then("Select N to {int}. Have you EVER tried to harm or kill yourself?")
    public void select_n_to_have_you_ever_tried_to_harm_or_kill_yourself(Integer int1) {

    }

    @Then("Select Y to In last {int} months")
    public void select_y_to_in_last_months(Integer int1) {

    }

    @Then("Select N to In last {int} months")
    public void select_n_to_in_last_months(Integer int1) {

    }

    @Then("Select Y to In last {int} months to {int} years")
    public void select_y_to_in_last_months_to_years(Integer int1, Integer int2) {

    }

    @Then("Select N to In last {int} months to {int} years")
    public void select_n_to_in_last_months_to_years(Integer int1, Integer int2) {

    }

    @Then("Select Y to Over {int} years")
    public void select_y_to_over_years(Integer int1) {

    }

    @Then("Select N to Over {int} years")
    public void select_n_to_over_years(Integer int1) {

    }

    @Then("Select Y to {int}. Are you thinking of harming or killing yourself NOW?")
    public void select_y_to_are_you_thinking_of_harming_or_killing_yourself_now(Integer int1) {

    }

    @Then("Select N to {int}. Are you thinking of harming or killing yourself NOW?")
    public void select_n_to_are_you_thinking_of_harming_or_killing_yourself_now(Integer int1) {

    }

    @Then("Select Y to {int}. Have you ever been treated for alcohol drug other substance problems?")
    public void select_y_to_have_you_ever_been_treated_for_alcohol_drug_other_substance_problems(Integer int1) {

    }

    @Then("Select N to {int}. Have you ever been treated for alcohol drug other substance problems?")
    public void select_n_to_have_you_ever_been_treated_for_alcohol_drug_other_substance_problems(Integer int1) {

    }

    @Then("Select Y to {int}. Appears unusually emotional upset, anxious or fearful")
    public void select_y_to_appears_unusually_emotional_upset_anxious_or_fearful(Integer int1) {
    }

    @Then("Select N to {int}. Appears unusually emotional upset, anxious or fearful")
    public void select_n_to_appears_unusually_emotional_upset_anxious_or_fearful(Integer int1) {

    }

    @Then("Select Y to {int}. Is unable to sit still, sleep or stop talking")
    public void select_y_to_is_unable_to_sit_still_sleep_or_stop_talking(Integer int1) {

    }

    @Then("Select N to {int}. Is unable to sit still, sleep or stop talking")
    public void select_n_to_is_unable_to_sit_still_sleep_or_stop_talking(Integer int1) {

    }

    @Then("Select Y to {int}. Appears aggressive, threatening, menacing, belligerent, wont be calmed down;  has a history of angry outbursts")
    public void select_y_to_appears_aggressive_threatening_menacing_belligerent_wont_be_calmed_down_has_a_history_of_angry_outbursts(Integer int1) {

    }

    @Then("Select N to {int}. Appears aggressive, threatening, menacing, belligerent, wont be calmed down;  has a history of angry outbursts")
    public void select_n_to_appears_aggressive_threatening_menacing_belligerent_wont_be_calmed_down_has_a_history_of_angry_outbursts(Integer int1) {

    }

    @Then("Select Y to {int}. Is unable to understand or follow directions")
    public void select_y_to_is_unable_to_understand_or_follow_directions(Integer int1) {

    }

    @Then("Select N to {int}. Is unable to understand or follow directions")
    public void select_n_to_is_unable_to_understand_or_follow_directions(Integer int1) {

    }

    @Then("Select Y to {int}. Appears to be distracted, is disoriented is looking at or listening to things that others don't see or hear")
    public void select_y_to_appears_to_be_distracted_is_disoriented_is_looking_at_or_listening_to_things_that_others_don_t_see_or_hear(Integer int1) {

    }

    @Then("Select N to {int}. Appears to be distracted, is disoriented is looking at or listening to things that others don't see or hear")
    public void select_n_to_appears_to_be_distracted_is_disoriented_is_looking_at_or_listening_to_things_that_others_don_t_see_or_hear(Integer int1) {

    }

    @Then("Select Y to {int}. Has bruises, cuts, scrapes, burns on face, arms, back or other physical injuries or appears to have been traumatized in some way")
    public void select_y_to_has_bruises_cuts_scrapes_burns_on_face_arms_back_or_other_physical_injuries_or_appears_to_have_been_traumatized_in_some_way(Integer int1) {

    }

    @Then("Select N to {int}. Has bruises, cuts, scrapes, burns on face, arms, back or other physical injuries or appears to have been traumatized in some way")
    public void select_n_to_has_bruises_cuts_scrapes_burns_on_face_arms_back_or_other_physical_injuries_or_appears_to_have_been_traumatized_in_some_way(Integer int1) {

    }

    @Then("Select Y to {int}. Has been the victim of domestic violence or reports to having been traumatized in some way")
    public void select_y_to_has_been_the_victim_of_domestic_violence_or_reports_to_having_been_traumatized_in_some_way(Integer int1) {

    }

    @Then("Select N to {int}. Cleared to general population")
    public void select_n_to_cleared_to_general_population(Integer int1) {

    }

    @Then("Select Y to {int}. Cleared to general population")
    public void select_y_to_cleared_to_general_population(Integer int1) {

    }

    @Then("Select N to {int}. Cleared to general population with appropriate referral to mental health care services")
    public void select_n_to_cleared_to_general_population_with_appropriate_referral_to_mental_health_care_services(Integer int1) {

    }

    @Then("Select Y to {int}. Cleared to general population with appropriate referral to mental health care services")
    public void select_y_to_cleared_to_general_population_with_appropriate_referral_to_mental_health_care_services(Integer int1) {

    }

    @Then("Select N to {int}. Referral to appropriate mental health care services for emergency treatment")
    public void select_n_to_referral_to_appropriate_mental_health_care_services_for_emergency_treatment(Integer int1) {

    }

    @Then("Select Y to {int}. Referral to appropriate mental health care services for emergency treatment")
    public void select_y_to_referral_to_appropriate_mental_health_care_services_for_emergency_treatment(Integer int1) {

    }

    @Then("Select the Tittle")
    public void select_the_tittle() {

    }

    @Then("Add Timestamp to Presenting Issue")
    public void add_timestamp_to_presenting_issue() {

    }

    @Then("Add Timestamp to Factors")
    public void add_timestamp_to_factors() {

    }

    @Then("Add Timestamp to Considerations")
    public void add_timestamp_to_considerations() {

    }

    @Then("Add Timestamp to Problem Statement")
    public void add_timestamp_to_problem_statement() {

    }

    @Then("Add Timestamp to Goal")
    public void add_timestamp_to_goal() {

    }

    @Then("Add Timestamp to Objective")
    public void add_timestamp_to_objective() {

    }

    @Then("Select the Target Date")
    public void select_the_target_date() {

    }

    @Then("Select the Complete Date")
    public void select_the_complete_date() {

    }

    @Then("Enter the Score for SOMATIC CONCERNS")
    public void enter_the_score_for_somatic_concerns() {

    }

    @Then("Enter the Score for ANXIETY")
    public void enter_the_score_for_anxiety() {

    }

    @Then("Enter the Score for DEPRESSION")
    public void enter_the_score_for_depression() {

    }

    @Then("Enter the Score for SUICIDALITY")
    public void enter_the_score_for_suicidality() {

    }

    @Then("Enter the Score for GUILT")
    public void enter_the_score_for_guilt() {

    }

    @Then("Enter the Score for HOSTILITY")
    public void enter_the_score_for_hostility() {

    }

    @Then("Enter the Score for ELEVATED MOOD")
    public void enter_the_score_for_elevated_mood() {

    }

    @Then("Enter the Score for GRANDIOSITY")
    public void enter_the_score_for_grandiosity() {

    }

    @Then("Enter the Score for SUSPICIOUSNESS")
    public void enter_the_score_for_suspiciousness() {

    }

    @Then("Enter the Score for HALLUCINATIONS")
    public void enter_the_score_for_hallucinations() {

    }

    @Then("Enter the Score for UNUSUAL THOUGHT CONTENT")
    public void enter_the_score_for_unusual_thought_content() {

    }

    @Then("Enter the Score for BIZARRE BEHAVIOR")
    public void enter_the_score_for_bizarre_behavior() {

    }

    @Then("Enter the Score for SELF-NEGLECT")
    public void enter_the_score_for_self_neglect() {

    }

    @Then("Enter the Score for DISORIENTATION")
    public void enter_the_score_for_disorientation() {

    }

    @Then("Enter the Score for CONCEPTUAL DISORGANIZATION")
    public void enter_the_score_for_conceptual_disorganization() {

    }

    @Then("Enter the Score for BLUNTED AFFECT")
    public void enter_the_score_for_blunted_affect() {

    }

    @Then("Enter the Score for EMOTIONAL WITHDRAWAL")
    public void enter_the_score_for_emotional_withdrawal() {

    }

    @Then("Enter the Score for MOTOR RETARDATION")
    public void enter_the_score_for_motor_retardation() {

    }

    @Then("Enter the Score for TENSION")
    public void enter_the_score_for_tension() {

    }

    @Then("Enter the Score for UNCOOPERATIVENESS")
    public void enter_the_score_for_uncooperativeness() {

    }

    @Then("Enter the Score for EXCITEMENT")
    public void enter_the_score_for_excitement() {

    }

    @Then("Enter the Score for DISTRACTIBILITY")
    public void enter_the_score_for_distractibility() {

    }

    @Then("Enter the Score for MOTOR HYPERACTIVITY")
    public void enter_the_score_for_motor_hyperactivity() {

    }

    @Then("Enter the Score for MANNERISMS & POSTURING")
    public void enter_the_score_for_mannerisms_posturing() {

    }

    @Then("Enter the Score for")
    public void enter_the_score_for() {

    }
    @Then("Add Timestamp to General Behavior")
    public void add_timestamp_to_general_behavior() {

    }

    @Then("Add Timestamp to Attitude toward examiner")
    public void add_timestamp_to_attitude_toward_examiner() {

    }

    @Then("Add Timestamp to State of consciousness")
    public void add_timestamp_to_state_of_consciousness() {

    }

    @Then("Add Timestamp to Attention")
    public void add_timestamp_to_attention() {

    }

    @Then("Add Timestamp to Orientation")
    public void add_timestamp_to_orientation() {

    }

    @Then("Add Timestamp to Psychomotor Activity")
    public void add_timestamp_to_psychomotor_activity() {

    }
    @Then("Add Timestamp to Mood")
    public void add_timestamp_to_mood() {

    }

    @Then("Add Timestamp to Affect")
    public void add_timestamp_to_affect() {

    }

    @Then("Add Timestamp to Speech")
    public void add_timestamp_to_speech() {

    }

    @Then("Add Timestamp to Form of thought")
    public void add_timestamp_to_form_of_thought() {

    }

    @Then("Add Timestamp to Content of thought")
    public void add_timestamp_to_content_of_thought() {

    }

    @Then("Add Timestamp to Perceptions")
    public void add_timestamp_to_perceptions() {

    }

    @Then("Add Timestamp to Judgment")
    public void add_timestamp_to_judgment() {

    }

    @Then("Add Timestamp to Memory")
    public void add_timestamp_to_memory() {

    }

    @Then("Add Timestamp to Insight")
    public void add_timestamp_to_insight() {

    }

    @Then("Add Timestamp to Intellectual Functioning")
    public void add_timestamp_to_intellectual_functioning() {

    }

    @Then("Select none in last {int} mos for Crisis frequency")
    public void select_none_in_last_mos_for_crisis_frequency(Integer int1) {

    }

    @Then("Select {int} incident in last {int} mos for Crisis frequency")
    public void select_incident_in_last_mos_for_crisis_frequency(Integer int1, Integer int2) {

    }

    @Then("Enter the score for Crisis frequency")
    public void enter_the_score_for_crisis_frequency() {

    }

    @Then("Select none in last {int} mos for Crisis recency")
    public void select_none_in_last_mos_for_crisis_recency(Integer int1) {

    }

    @Then("Select {int} incident in last {int} mos for Crisis recency")
    public void select_incident_in_last_mos_for_crisis_recency(Integer int1, Integer int2) {

    }

    @Then("Enter the score for Crisis recency")
    public void enter_the_score_for_crisis_recency() {

    }

    @Then("Select none in last {int} mos for Self-injury episode frequency")
    public void select_none_in_last_mos_for_self_injury_episode_frequency(Integer int1) {

    }

    @Then("Select {int} incident in last {int} mos for Self-injury episode frequency")
    public void select_incident_in_last_mos_for_self_injury_episode_frequency(Integer int1, Integer int2) {

    }

    @Then("Enter the score for Self-injury episode frequency")
    public void enter_the_score_for_self_injury_episode_frequency() {

    }

    @Then("Select none in last {int} mos for Self-injury threat frequency")
    public void select_none_in_last_mos_for_self_injury_threat_frequency(Integer int1) {

    }

    @Then("Select {int} incident in last {int} mos for Self-injury threat frequency")
    public void select_incident_in_last_mos_for_self_injury_threat_frequency(Integer int1, Integer int2) {

    }

    @Then("Enter the score for Self-injury threat frequency")
    public void enter_the_score_for_self_injury_threat_frequency() {

    }

    @Then("Select none in last {int} mos for Placement in 4pt restraint frequency")
    public void select_none_in_last_mos_for_placement_in_4pt_restraint_frequency(Integer int1) {

    }

    @Then("Select {int} incident in last {int} mos for Placement in 4pt restraint frequency")
    public void select_incident_in_last_mos_for_placement_in_4pt_restraint_frequency(Integer int1, Integer int2) {

    }

    @Then("Enter the score for Placement in 4pt restraint frequency")
    public void enter_the_score_for_placement_in_4pt_restraint_frequency() {

    }

    @Then("Select none in last {int} mos for Placement in 4pt restraint recency")
    public void select_none_in_last_mos_for_placement_in_4pt_restraint_recency(Integer int1) {

    }

    @Then("Select {int} incident in last {int} mos for Placement in 4pt restraint recency")
    public void select_incident_in_last_mos_for_placement_in_4pt_restraint_recency(Integer int1, Integer int2) {
    }

    @Then("Enter the score for Placement in 4pt restraint recency")
    public void enter_the_score_for_placement_in_4pt_restraint_recency() {

    }

    @Then("Select none in last {int} mos for Placement in ambulatory restraints")
    public void select_none_in_last_mos_for_placement_in_ambulatory_restraints(Integer int1) {

    }

    @Then("Select {int} incident in last {int} mos for Placement in ambulatory restraints")
    public void select_incident_in_last_mos_for_placement_in_ambulatory_restraints(Integer int1, Integer int2) {
    }

    @Then("Enter the score for Placement in ambulatory restraints")
    public void enter_the_score_for_placement_in_ambulatory_restraints() {

    }

    @Then("Select none in last {int} mos for Placement in stripped cell")
    public void select_none_in_last_mos_for_placement_in_stripped_cell(Integer int1) {

    }

    @Then("Select {int} incident in last {int} mos for Placement in stripped cell")
    public void select_incident_in_last_mos_for_placement_in_stripped_cell(Integer int1, Integer int2) {

    }

    @Then("Enter the score for Placement in stripped cell")
    public void enter_the_score_for_placement_in_stripped_cell() {

    }

    @Then("Select none in last {int} mos for Infirmary admissions")
    public void select_none_in_last_mos_for_infirmary_admissions(Integer int1) {
    }

    @Then("Select {int} incident in last {int} mos for Infirmary admissions")
    public void select_incident_in_last_mos_for_infirmary_admissions(Integer int1, Integer int2) {

    }

    @Then("Enter the score for Infirmary admissions")
    public void enter_the_score_for_infirmary_admissions() {

    }

    @Then("Select none in last {int} mos for Patient at CMHIP or housed at a CDOC SNU F")
    public void select_none_in_last_mos_for_patient_at_cmhip_or_housed_at_a_cdoc_snu_f(Integer int1) {
    }

    @Then("Select {int} incident in last {int} mos for Patient at CMHIP or housed at a CDOC SNU F")
    public void select_incident_in_last_mos_for_patient_at_cmhip_or_housed_at_a_cdoc_snu_f(Integer int1, Integer int2) {

    }

    @Then("Select {int} incident in last {int} mos for CMHIP or housed at a CDOC SNU F")
    public void select_incident_in_last_mos_for_cmhip_or_housed_at_a_cdoc_snu_f(Integer int1, Integer int2) {

    }

    @Then("Enter the score for CMHIP or housed at a CDOC SNU F")
    public void enter_the_score_for_cmhip_or_housed_at_a_cdoc_snu_f() {

    }


}
