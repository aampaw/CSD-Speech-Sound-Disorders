
import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;


public class InfoQuiz {

	
	public static String moreInfo1(int moreInfoOnOptions, Scanner scnr) throws Exception {
		String functionalInfo = null;
		int wantFunctionalInfo;
		int functionalOption = 0;
		System.out.println ("Those with Functional Speech Sound Disorder have difficulty at the phonetic level learning to make a specific speech sound.\nWith Functional disorders, there are two types. We have Articulation disorders and Phonological disorders.");
		System.out.println ("Do you want to learn more? \nPress (1) Yes \nPress (2) No");
		
		wantFunctionalInfo = scnr.nextInt();
		if (wantFunctionalInfo == 1) {
			functionalDisorders(functionalOption, scnr);
		}
		else {
			System.out.println("Ok! Thank you for taking the time to learn more about Speech Sound Disorders!");
			System.exit(1);
		}
		return functionalInfo;
		
	}
	public static String moreInfo2(int moreInfoOnOptions2, Scanner scnr) throws Exception {
		String OrganicInfo = null;
		int wantOrganicInfo;
		int organicOption = 0;
		System.out.println ("Those with Organic Speech Sound Disorder often have it because it's developed or acquired. \nWith Organinc disorders, it can be split into three different types. We have Motor/ Neurological, Structual, or Sensory/Perceptual");
		System.out.println ("Do you want to learn more? \nPress (1) Yes \nPress (2) No");
		
		wantOrganicInfo = scnr.nextInt();
		if (wantOrganicInfo == 1 ) {
			organicDisorders(organicOption, scnr);
		}
		else {
			System.out.println("Ok! Thank you for taking the time to learn more about Speech Sound Disorders!");
			System.exit(1);
		}
			
		return OrganicInfo;
		
	}
	public static String functionalDisorders(int functionalOption, Scanner scnr) throws Exception {
		
		int functionalDecision;
		int websiteDecision;
		String functionalDisorder = null;
		Desktop articulation = Desktop.getDesktop();
		Desktop phonological = Desktop.getDesktop();
		System.out.println ("Welcome to the Functional Speech Disorder Info Sections! \nPress (1) to learn more about Articulation Disorders \nPress (2) to learn more about Phonological Disorders ");
		
		
		functionalDecision = scnr.nextInt();
		
		if (functionalDecision == 1) {
			System.out.println ("Articulation Disorders affect the linguistic aspects of speech production.");
			System.out.println ("Want to know more, like symptoms and causes? \nPress (1) to continue a website \nPress (2) to continue to a youtube video \nPress any key to exit ");
				websiteDecision = scnr.nextInt();
				if (websiteDecision == 1) {
					articulation.browse(new URI ("https://intermountainhealthcare.org/services/pediatrics/services/rehabilitation/services/articulation-disorders/"));
					System.out.println("Thank you for taking the time to learn more about Speech Sound Disorders! I really hope this was helpful to you today!");
					System.exit(1);
				}
				if (websiteDecision == 2) {
					phonological.browse(new URI ("https://www.youtube.com/watch?v=G-chx6_NCp0"));;
					System.out.println("Thank you for taking the time to learn more about Speech Sound Disorders! I really hope this was helpful to you today!");
					System.exit(1);
				}
				else {
					System.out.println("Ok! Thank you for taking the time to learn more about Speech Sound Disorders!");
					System.exit(1);
				}
		}
		if (functionalDecision == 2) {
			System.out.println ("Articulation Disorders affect the motor production of speech sounds.");
			System.out.println ("Want to know more, like symptoms and causes? \nPress (1) to continue a website \nPress (2) to continue to a youtube video \nPress any key to exit ");
				websiteDecision = scnr.nextInt();
				if (websiteDecision == 1) {
					phonological.browse(new URI ("https://intermountainhealthcare.org/services/pediatrics/services/rehabilitation/services/phonological-disorders/"));;
					System.out.println("Thank you for taking the time to learn more about Speech Sound Disorders! I really hope this was helpful to you today!");
					System.exit(1);
				}
				if (websiteDecision == 2) {
					phonological.browse(new URI ("https://www.youtube.com/watch?v=G-chx6_NCp0"));;
					System.out.println("Thank you for taking the time to learn more about Speech Sound Disorders! I really hope this was helpful to you today!");
					System.exit(1);
				}
				else {
					System.out.println("Ok! Thank you for taking the time to learn more about Speech Sound Disorders!");
					System.exit(1);
				}
		}
		
		return functionalDisorder;
	}
	
	
	public static String organicDisorders(int organicOption, Scanner scnr) throws Exception {
		String organicDisorder = null;
		int organicDecision;
		int motorOption = 0;
		int structuralOption = 0;
		int sensoryOption = 0;
		System.out.println ("Welcome to the Organic Speech Disorder Info Sections! \nPress (1) to learn more about Motor/Neurological Disorders \nPress (2) to learn more about Structural Disorders \nPress (3) to learn more about Sensory/Perceptual Disorders ");
		
		organicDecision = scnr.nextInt();
		
		if (organicDecision == 1) {
			motorDisorders(motorOption, scnr);
		}
		if (organicDecision == 2) {
			structuralDisorders(structuralOption, scnr);
		}
		if (organicDecision == 3) {
			sensoryDisorders(sensoryOption, scnr);	
		}
		
		return organicDisorder;
		
	
	}
	
	public static String motorDisorders(int motorOption, Scanner scnr) throws Exception {
		String motorDisorder = null;
		int motorDecision;
		int motorInfoDecision;
		Desktop dysarthria = Desktop.getDesktop();
		Desktop apraxia = Desktop.getDesktop();
		
		System.out.println("Motor/Neurological Disorders include Dysarthria and Apraxia");
		System.out.println("Dysarthria refers to one's speech execution, while Apraxia refers to one's speech planning.");
		System.out.println("Press (1) to learn more about Dysarthia \nPress (2) to learn more about Apraxia \nPress any key to quit");
		
		motorDecision = scnr.nextInt();
		if(motorDecision == 1) {
			System.out.println ("Want to know more, like symptoms and causes of Dysarthria? \nPress (1) to continue a website \nPress (2) to continue to a youtube video \nPress any key to exit ");
			motorInfoDecision = scnr.nextInt();
			if (motorInfoDecision == 1) {
				dysarthria.browse(new URI ("https://my.clevelandclinic.org/health/diseases/17653-dysarthria"));
				
				}
			if (motorInfoDecision == 2) {
				dysarthria.browse(new URI ("https://www.youtube.com/watch?v=gD80xdT_uLE"));
				
				}
			else {
				System.out.println("Thank you for taking the time to learn more about Speech Sound Disorders! I really hope this was helpful to you today!");
				System.exit(1);
				
				}
		}
		if(motorDecision == 2) {
			System.out.println ("Want to know more, like symptoms and causes of Apraxia? \nPress (1) to continue a website \nPress (2) to continue to a youtube video \nPress any key to exit ");
			motorInfoDecision = scnr.nextInt();
			if (motorInfoDecision == 1) {
				apraxia.browse(new URI ("https://www.webmd.com/brain/apraxia-symptoms-causes-tests-treatments"));
				System.out.println("Thank you for taking the time to learn more about Speech Sound Disorders! I really hope this was helpful to you today!");
				System.exit(1);
				}
			if (motorInfoDecision == 2) {
				apraxia.browse(new URI ("https://www.youtube.com/watch?v=KMkgSwHPDt0"));
				System.out.println("Thank you for taking the time to learn more about Speech Sound Disorders! I really hope this was helpful to you today!");
				System.exit(1);
				}
			else {
				System.out.println("Thank you for taking the time to learn more about Speech Sound Disorders! I really hope this was helpful to you today!");
				System.exit(1);
				
				}
			
		}
		else {
			System.out.println("Ok! Thank you for taking the time to learn more about Speech Sound Disorders!");
			System.exit(1);
			
		}
		return motorDisorder;
	}
	
	public static String structuralDisorders(int structuralOption, Scanner scnr) throws Exception {
		String structuralDisorder = null;
		int structuralDecision;
		int structuralInfoDecision;
		Desktop orofacial = Desktop.getDesktop();
		
		
		System.out.println("Structural Disorders include Orofacial anomalies and Structural deficits.");
		System.out.println("Orofacial anomalies refers to things like cleft lip and palates , while Structural deficits refers to what occurs due to trauma or surgery.");
		System.out.println("Press (1) to learn more about Orofacial anomalities \nPress (2) to learn more about Structural deficits \nPress any key to quit");
		
		structuralDecision = scnr.nextInt();
		if(structuralDecision == 1) {
			System.out.println ("Want to know more, like symptoms and causes of Orofacial anomalies? \nPress (1) to continue a website \nPress (2) to continue to a youtube video \nPress any key to exit ");
			structuralInfoDecision = scnr.nextInt();
			if (structuralInfoDecision == 1) {
				orofacial.browse(new URI ("https://onlinelibrary.wiley.com/doi/abs/10.1002/9781444318975.ch21"));
				
				}
			if (structuralInfoDecision == 2) {
				orofacial.browse(new URI ("https://www.youtube.com/watch?v=jMx8Gu7QxpM"));
				
				}
			else {
				System.out.println("Thank you for taking the time to learn more about Speech Sound Disorders! I really hope this was helpful to you today!");
				System.exit(1);
				
				}
			}
		if(structuralDecision == 2) {
			System.out.println ("I am so sorry, but I am having trouble finding more information about Structural deficits for you online." + 
					"\nIF you want to know more I encourage you to do more research or contact your local doctor for more infomation! ");
			System.out.println("Thank you for taking the time to learn more about Speech Sound Disorders! I really hope this was helpful to you today!");
			System.exit(1);	
		}
		else {
			System.out.println("Ok! Thank you for taking the time to learn more about Speech Sound Disorders!");
			System.exit(1);
			
		}
		
		return structuralDisorder;
	}
	
	public static String sensoryDisorders(int sensoryOption, Scanner scnr) throws Exception {
		String sensoryDisorder = null;
		int sensoryDecision;
		Desktop hearing = Desktop.getDesktop();
		
		System.out.println("Sensory/Perceptual Disorders refers to Hearing impairments");
		System.out.println("Hearing impairments refers to when there's a problem with or damage to one or more parts of the ear.");
		System.out.println ("Want to know more, like symptoms and causes of Hearing impairments \nPress (1) to continue a website \nPress (2) to continue to a youtube video \nPress any key to exit ");
		
		
		sensoryDecision = scnr.nextInt();
		if(sensoryDecision == 1) {
			hearing.browse(new URI ("https://kidshealth.org/en/teens/hearing-impairment.html"));
		}
		if(sensoryDecision == 2) {
			hearing.browse(new URI ("https://www.youtube.com/watch?v=f3Qg7zgYyGA"));
		}
		else {
			System.out.println("Ok! Thank you for taking the time to learn more about Speech Sound Disorders!");
			System.exit(1);
		}
		return sensoryDisorder;
	}
	
	
	
	public static void main(String[] args) throws Exception {
		Scanner scnr = new Scanner (System.in); {
		String userName = null;
		int disorderTypeOption;
		int moreInfoOnOptions;
		int moreInfoOnOptions2 = 0;
		int functionalOption;
		int organicOption;
		System.out.println("Hello! Welcome to Speech Sound Disroder informational guide. ");
		System.out.println("Before we begin, What is your name?");
		if (scnr.hasNextLine()) {
			userName = scnr.nextLine().trim();
		}
		if (userName.isEmpty()) {
			userName = Config.DEFAULT_NAME;
			System.out.println("Oh, I didn't catch that! We'll just call you " + Config.DEFAULT_NAME + "!");
		} else {
			System.out.println("Nice to meet you, " + userName + "!");
		
		}
		System.out.println("So " + userName + ", what kind of speech sound disorder do you want to learn about today?");
		System.out.println("You can choose between a Functional or Organic speech Sound Disorder");
		System.out.println("Press (1) for Functional Disorders \nPress (2) for Organic Disorders \npress (3) if you'd like more information about your options");
		disorderTypeOption = scnr.nextInt();
		
		
		if (disorderTypeOption == 3) { 
		System.out.println("What would you like to know more about? \nChoose (1) for Functional disorders \nChoose (2) for Organic disorders" );
		moreInfoOnOptions = scnr.nextInt();
		
			if (moreInfoOnOptions == 1) {
				moreInfo1(moreInfoOnOptions, scnr);
			}
			else if (moreInfoOnOptions == 2) {
				moreInfo2 (moreInfoOnOptions2, scnr);
				
			}
		
			else {
				System.out.println("Ok! Thank you for taking the time to learn more about Speech Sound Disorders!");
				System.exit(1);
			}
		}
		
		if (disorderTypeOption == 1) { 
			System.out.println ("You choose Functional disorders! \nThere are two types of fuctional speech disorder, we have articulation disorders and phonological disorders. ");
			System.out.println ("Would you like to learned more? ");
			System.out.println ("Press (1) Yes \nPress (2) No ");
			
			functionalOption = scnr.nextInt();
			if (functionalOption == 1 ) {
				functionalDisorders(functionalOption, scnr);
			}
			else if (functionalOption == 2 ) {
				System.out.println("Ok! Thank you for taking the time to learn more about Speech Sound Disorders!");
				System.exit(1);
				
			}
				
		}
		if (disorderTypeOption == 2){ 
			System.out.println ("You choose Organic disorders! \nWithin Organic Disorders there are three branches. We have... \n-Motor/Neurological \n-Structural \n-Sensory/Perceptual");
			System.out.println ("Would you like to learned more? ");
			System.out.println ("Press (1) Yes \nPress (2) No ");
			organicOption = scnr.nextInt();
			if (organicOption == 1 ) {
				organicDisorders(organicOption, scnr);
			}
			else if (organicOption == 2 ) {
				System.out.println("Ok! Thank you for taking the time to learn more about Speech Sound Disorders!");
				System.exit(1);
				
			}
			
			
		}

}
	}
}



