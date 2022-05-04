package com.step_definitions;

import com.utilities.BrowserUtils;
import com.utilities.Pages;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;

public class SOTMPEncountersSteps extends BrowserUtils {

    Pages pages = new Pages();
    Logger logger = Logger.getLogger(LoginSteps.class);

    @Then("Add Timestamp to Incidental Comments")
    public void add_timestamp_to_incidental_comments() {

        logger.info("Add Timestamp to Incidental Comments");
        scrollDown(0,250);
        pages.getMedicalEncountersPage().timestamp1.click();
    }

    @Then("Click Yes to ADS Information")
    public void click_yes_to_ads_information() {
        logger.info("Click Yes to ADS Information");
    }

    @Then("Enter the Jurisdiction")
    public void enter_the_jurisdiction() {
        logger.info("Enter the Jurisdiction");
    }

    @Then("Enter the Case Number")
    public void enter_the_case_number() {
        logger.info("Enter the Case Number");
    }

    @Then("Enter the Conviction")
    public void enter_the_conviction() {
        logger.info("Enter the Conviction");
    }

    @Then("Enter the Source")
    public void enter_the_source() {
        logger.info("Enter the Source");
    }

    @Then("Select the Sexual Victimization")
    public void select_the_sexual_victimization() {
        logger.info("Select the Sexual Victimization");
    }

    @Then("Select the Notes")
    public void select_the_notes() {
        logger.info("Select the Notes");
    }

    @Then("Select the S101 None")
    public void select_the_s101_none() {
        logger.info("Select the S101 None");
    }

    @Then("Unselect the S101 None")
    public void unselect_the_s101_none() {
        logger.info("Unselect the S101 None");
    }

    @Then("Select the S230 Not recommended for treatment after sex offender classification review, or acquittal")
    public void select_the_s230_not_recommended_for_treatment_after_sex_offender_classification_review_or_acquittal() {
        logger.info("Select the S230 Not recommended for treatment after sex offender classification review, or acquittal");
    }

    @Then("Unselect the S230 Not recommended for treatment after sex offender classification review, or acquittal")
    public void unselect_the_s230_not_recommended_for_treatment_after_sex_offender_classification_review_or_acquittal() {
        logger.info("Unselect the S230 Not recommended for treatment after sex offender classification review, or acquittal");
    }

    @Then("Select the S235 Not recommended for treatment based upon Judicial finding of no sexual factual basis")
    public void select_the_s235_not_recommended_for_treatment_based_upon_judicial_finding_of_no_sexual_factual_basis() {
        logger.info("Select the S235 Not recommended for treatment based upon Judicial finding of no sexual factual basis");
    }

    @Then("Unselect the S235 Not recommended for treatment based upon Judicial finding of no sexual factual basis")
    public void unselect_the_s235_not_recommended_for_treatment_based_upon_judicial_finding_of_no_sexual_factual_basis() {
        logger.info("Unselect the S235 Not recommended for treatment based upon Judicial finding of no sexual factual basis");
    }

    @Then("Select the S240 Arrested or charged for sexual nature crime, and dismissed or dropped")
    public void select_the_s240_arrested_or_charged_for_sexual_nature_crime_and_dismissed_or_dropped() {
        logger.info("Select the S240 Arrested or charged for sexual nature crime, and dismissed or dropped");
    }

    @Then("Unselect the S240 Arrested or charged for sexual nature crime, and dismissed or dropped")
    public void unselect_the_s240_arrested_or_charged_for_sexual_nature_crime_and_dismissed_or_dropped() {
        logger.info("Unselect the S240 Arrested or charged for sexual nature crime, and dismissed or dropped");
    }

    @Then("Select the S245 Other sexual nature crime allegations")
    public void select_the_s245_other_sexual_nature_crime_allegations() {
        logger.info("Select the S245 Other sexual nature crime allegations");
    }

    @Then("Unselect the S245 Other sexual nature crime allegations")
    public void unselect_the_s245_other_sexual_nature_crime_allegations() {
        logger.info("Unselect the S245 Other sexual nature crime allegations");
    }

    @Then("Select the S250 Rape allegation in prison, institution or CJ Supervision")
    public void select_the_s250_rape_allegation_in_prison_institution_or_cj_supervision() {
        logger.info("Select the S250 Rape allegation in prison, institution or CJ Supervision");
    }

    @Then("Unselect the S250 Rape allegation in prison, institution or CJ Supervision")
    public void unselect_the_s250_rape_allegation_in_prison_institution_or_cj_supervision() {
        logger.info("Unselect the S250 Rape allegation in prison, institution or CJ Supervision");
    }

    @Then("Select the S255 All other sexual allegations in prison, institution or CJ supervision")
    public void select_the_s255_all_other_sexual_allegations_in_prison_institution_or_cj_supervision() {
        logger.info("Select the S255 All other sexual allegations in prison, institution or CJ supervision");
    }

    @Then("Unselect the S255 All other sexual allegations in prison, institution or CJ supervision")
    public void unselect_the_s255_all_other_sexual_allegations_in_prison_institution_or_cj_supervision() {
        logger.info("Unselect the S255 All other sexual allegations in prison, institution or CJ supervision");
    }

    @Then("Select the S260 Charged with sexual nature crime, case pending")
    public void select_the_s260_charged_with_sexual_nature_crime_case_pending() {
        logger.info("Select the S260 Charged with sexual nature crime, case pending");
    }

    @Then("Unselect the S260 Charged with sexual nature crime, case pending")
    public void unselect_the_s260_charged_with_sexual_nature_crime_case_pending() {
        logger.info("Unselect the S260 Charged with sexual nature crime, case pending");
    }

    @Then("Select the S335 Convicted of sexual abuse or rape under Code of Penal Discipline")
    public void select_the_s335_convicted_of_sexual_abuse_or_rape_under_code_of_penal_discipline() {
        logger.info("Select the S335 Convicted of sexual abuse or rape under Code of Penal Discipline");
    }

    @Then("Unselect the S335 Convicted of sexual abuse or rape under Code of Penal Discipline")
    public void unselect_the_s335_convicted_of_sexual_abuse_or_rape_under_code_of_penal_discipline() {
        logger.info("Unselect the S335 Convicted of sexual abuse or rape under Code of Penal Discipline");
    }

    @Then("Select the S340 DOC COPD I09 Rape or non-DOC equivalent before 712008 or with classification review on or after 712008")
    public void select_the_s340_doc_copd_i_rape_or_non_doc_equivalent_before_or_with_classification_review_on_or_after() {
        logger.info("Select the S340 DOC COPD I09 Rape or non-DOC equivalent before 712008 or with classification review on or after 712008");
    }

    @Then("Unselect the S340 DOC COPD I09 Rape or non-DOC equivalent before 712008 or with classification review on or after 712008")
    public void unselect_the_s340_doc_copd_i_rape_or_non_doc_equivalent_before_or_with_classification_review_on_or_after() {
        logger.info("Unselect the S340 DOC COPD I09 Rape or non-DOC equivalent before 712008 or with classification review on or after 712008");
    }

    @Then("Select the S345 1,2 Institutional violation convictions for masturbation or exposing of genitals to a victim with either before 712008 or victim with classification review on or after 712008")
    public void select_the_s345_institutional_violation_convictions_for_masturbation_or_exposing_of_genitals_to_a_victim_with_either_before_or_victim_with_classification_review_on_or_after() {
        logger.info("Select the S345 1,2 Institutional violation convictions for masturbation or exposing of genitals to a victim with either before 712008 or victim with classification review on or after 712008");
    }

    @Then("Unselect the S345 1,2 Institutional violation convictions for masturbation or exposing of genitals to a victim with either before 712008 or victim with classification review on or after 712008")
    public void unselect_the_s345_institutional_violation_convictions_for_masturbation_or_exposing_of_genitals_to_a_victim_with_either_before_or_victim_with_classification_review_on_or_after() {
        logger.info("Unselect the S345 1,2 Institutional violation convictions for masturbation or exposing of genitals to a victim with either before 712008 or victim with classification review on or after 712008");
    }

    @Then("Select the S350 3 Institutional violation convictions for masturbation or exposing of genitals to a victim before 712008 or with classification review on or after 712008")
    public void select_the_s350_institutional_violation_convictions_for_masturbation_or_exposing_of_genitals_to_a_victim_before_or_with_classification_review_on_or_after() {
        logger.info("Select the S350 3 Institutional violation convictions for masturbation or exposing of genitals to a victim before 712008 or with classification review on or after 712008");
    }

    @Then("Unselect the S350 3 Institutional violation convictions for masturbation or exposing of genitals to a victim before 712008 or with classification review on or after 712008")
    public void unselect_the_s350_institutional_violation_convictions_for_masturbation_or_exposing_of_genitals_to_a_victim_before_or_with_classification_review_on_or_after() {
        logger.info("Unselect the S350 3 Institutional violation convictions for masturbation or exposing of genitals to a victim before 712008 or with classification review on or after 712008");
    }

    @Then("Select the S353 Institutional violation convictions for sexual abuse before 712008 or with classification review after 712008")
    public void select_the_s353_institutional_violation_convictions_for_sexual_abuse_before_or_with_classification_review_after() {
        logger.info("Select the S353 Institutional violation convictions for sexual abuse before 712008 or with classification review after 712008");
    }

    @Then("Unselect the S353 Institutional violation convictions for sexual abuse before 712008 or with classification review after 712008")
    public void unselect_the_s353_institutional_violation_convictions_for_sexual_abuse_before_or_with_classification_review_after() {
        logger.info("Unselect the S353 Institutional violation convictions for sexual abuse before 712008 or with classification review after 712008");
    }

    @Then("Select the S354 Institutional violation convictions sexual misconduct before 712008 or with classification review on or after 712008")
    public void select_the_s354_institutional_violation_convictions_sexual_misconduct_before_or_with_classification_review_on_or_after() {
        logger.info("Select the S354 Institutional violation convictions sexual misconduct before 712008 or with classification review on or after 712008");
    }

    @Then("Unselect the S354 Institutional violation convictions sexual misconduct before 712008 or with classification review on or after 712008")
    public void unselect_the_s354_institutional_violation_convictions_sexual_misconduct_before_or_with_classification_review_on_or_after() {
        logger.info("Unselect the S354 Institutional violation convictions sexual misconduct before 712008 or with classification review on or after 712008");
    }

    @Then("Select the S355 Institutional violation convictions sexual harassment that does not include masturbation or exposing with any before 712008 or with classification review on or after 712008")
    public void select_the_s355_institutional_violation_convictions_sexual_harassment_that_does_not_include_masturbation_or_exposing_with_any_before_or_with_classification_review_on_or_after() {
        logger.info("Select the S355 Institutional violation convictions sexual harassment that does not include masturbation or exposing with any before 712008 or with classification review on or after 712008");
    }

    @Then("Unselect the S355 Institutional violation convictions sexual harassment that does not include masturbation or exposing with any before 712008 or with classification review on or after 712008")
    public void unselect_the_s355_institutional_violation_convictions_sexual_harassment_that_does_not_include_masturbation_or_exposing_with_any_before_or_with_classification_review_on_or_after() {
        logger.info("Unselect the S355 Institutional violation convictions sexual harassment that does not include masturbation or exposing with any before 712008 or with classification review on or after 712008");
    }

    @Then("Select the S450 Arrested or charged for a sexual nature crime, and was dismissed or dropped and is recommended for sexual violence behavioral health treatment after classification review was upheld")
    public void select_the_s450_arrested_or_charged_for_a_sexual_nature_crime_and_was_dismissed_or_dropped_and_is_recommended_for_sexual_violence_behavioral_health_treatment_after_classification_review_was_upheld() {
        logger.info("Select the S450 Arrested or charged for a sexual nature crime, and was dismissed or dropped and is recommended for sexual violence behavioral health treatment after classification review was upheld");
    }

    @Then("Unselect the S450 Arrested or charged for a sexual nature crime, and was dismissed or dropped and is recommended for sexual violence behavioral health treatment after classification review was upheld")
    public void unselect_the_s450_arrested_or_charged_for_a_sexual_nature_crime_and_was_dismissed_or_dropped_and_is_recommended_for_sexual_violence_behavioral_health_treatment_after_classification_review_was_upheld() {
        logger.info("Unselect the S450 Arrested or charged for a sexual nature crime, and was dismissed or dropped and is recommended for sexual violence behavioral health treatment after classification review was upheld");
    }

    @Then("Select the S455 Other sexual allegations and was classified as a sex offender after classification review")
    public void select_the_s455_other_sexual_allegations_and_was_classified_as_a_sex_offender_e_g_self_report_etc_after_classification_review() {
        logger.info("Select the S455 Other sexual allegations and was classified as a sex offender after classification review");
    }

    @Then("Unselect the S455 Other sexual allegations and was classified as a sex offender after classification review")
    public void unselect_the_s455_other_sexual_allegations_and_was_classified_as_a_sex_offender_e_g_self_report_etc_after_classification_review() {
        logger.info("Unselect the S455 Other sexual allegations and was classified as a sex offender after classification review");
    }

    @Then("Select the S560 Past adult felony sex conviction")
    public void select_the_s560_past_adult_felony_sex_conviction() {
        logger.info("Select the S560 Past adult felony sex conviction");
    }

    @Then("Unselect the S560 Past adult felony sex conviction")
    public void unselect_the_s560_past_adult_felony_sex_conviction() {
        logger.info("Unselect the S560 Past adult felony sex conviction");
    }

    @Then("Select the S565 Active adult felony sex offender")
    public void select_the_s565_active_adult_felony_sex_offender() {
        logger.info("Select the S565 Active adult felony sex offender");
    }

    @Then("Unselect the S565 Active adult felony sex offender")
    public void unselect_the_s565_active_adult_felony_sex_offender() {
        logger.info("Unselect the S565 Active adult felony sex offender");
    }

    @Then("Select the S570 Past or active juvenile sex adjudication")
    public void select_the_s570_past_or_active_juvenile_sex_adjudication() {
        logger.info("Select the S570 Past or active juvenile sex adjudication");
    }

    @Then("Unselect the S570 Past or active juvenile sex adjudication")
    public void unselect_the_s570_past_or_active_juvenile_sex_adjudication() {
        logger.info("Unselect the S570 Past or active juvenile sex adjudication");
    }

    @Then("Select the S575 Past or active Deferred Judgement and Sentence on sex crime")
    public void select_the_s575_past_or_active_deferred_judgement_and_sentence_on_sex_crime() {
        logger.info("Select the S575 Past or active Deferred Judgement and Sentence on sex crime");
    }

    @Then("Unselect the S575 Past or active Deferred Judgement and Sentence on sex crime")
    public void unselect_the_s575_past_or_active_deferred_judgement_and_sentence_on_sex_crime() {
        logger.info("Unselect the S575 Past or active Deferred Judgement and Sentence on sex crime");
    }

    @Then("Select the S580 Past or active adult misdemeanor sex conviction")
    public void select_the_s580_past_or_active_adult_misdemeanor_sex_conviction() {
        logger.info("Select the S580 Past or active adult misdemeanor sex conviction");
    }

    @Then("Unselect the S580 Past or active adult misdemeanor sex conviction")
    public void unselect_the_s580_past_or_active_adult_misdemeanor_sex_conviction() {
        logger.info("Unselect the S580 Past or active adult misdemeanor sex conviction");
    }

    @Then("Select the S585 Past or active mittimus with established sexual factual basis")
    public void select_the_s585_past_or_active_mittimus_with_established_sexual_factual_basis() {
        logger.info("Select the S585 Past or active mittimus with established sexual factual basis");
    }

    @Then("Unselect the S585 Past or active mittimus with established sexual factual basis")
    public void unselect_the_s585_past_or_active_mittimus_with_established_sexual_factual_basis() {
        logger.info("Unselect the S585 Past or active mittimus with established sexual factual basis");
    }

    @Then("Select the S590 Past or active felony or misdemeanor conviction for any institutional sexual assault")
    public void select_the_s590_past_or_active_felony_or_misdemeanor_conviction_for_any_institutional_sexual_assault() {
        logger.info("Select the S590 Past or active felony or misdemeanor conviction for any institutional sexual assault");
    }

    @Then("Unselect the S590 Past or active felony or misdemeanor conviction for any institutional sexual assault")
    public void unselect_the_s590_past_or_active_felony_or_misdemeanor_conviction_for_any_institutional_sexual_assault() {
        logger.info("Unselect the S590 Past or active felony or misdemeanor conviction for any institutional sexual assault");
    }

    @Then("Select the Static-99R Status")
    public void select_the_static_99r_status() {
        logger.info("Select the Static-99R Status");
    }

    @Then("Select the SOTIPS Eligible")
    public void select_the_sotips_eligible() {
        logger.info("Select the SOTIPS Eligible");
    }

    @Then("Select the Qualifier")
    public void select_the_qualifier() {
        logger.info("Select the Qualifier");
    }

    @Then("Add Timestamp to Notes")
    public void add_timestamp_to_notes() {
        logger.info("Add Timestamp to Notes");
    }


}
