package Quiz;
import java.util.*;
public class QuizQuestion 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int score=0;
		System.out.println("\n\tWelcome to Quiz Competition\n");
		System.out.println("Q1.What is the national animal of India?");
		System.out.println("(1) Lion (2) Tiger (3) Elephant (4) Leopard");
		System.out.print("👉 Choose the Answer: ");
		int ans1=sc.nextInt();
		if(ans1==2)
		{
			System.out.println("\t✔ Correct!");
			score++;
		}
		else
		{
			System.out.println("\t❌ Wrong!");
		}
		System.out.println("\nQ2.Which is the largest desert in the world?");
		System.out.println("(1) Sahara (2) Thar (3) Gobi (4) Kalahari");
		System.out.print("👉 Choose the Answer: ");
		int ans2=sc.nextInt();
		if(ans2==1)
		{
			System.out.println("\t✔ Correct!");
			score++;
		}
		else
		{
			System.out.println("\t❌ Wrong!");
		}
		System.out.println("\nQ3.Which festival is known as the festival of lights?");
		System.out.println("(1) Holi  (2) Christmas  (3) Diwali  (4) Eid");
		System.out.print("👉 Choose the Answer: ");
		int ans3=sc.nextInt();
		if(ans3==3)
		{
			System.out.println("\t✔ Correct!");
			score++;
		}
		else
		{
			System.out.println("\t❌ Wrong!");
		}
		System.out.println("\nQ4.Who wrote the Indian national anthem?");
		System.out.println("(1) Bankim Chandra Chatterjee (2) Rabindranath Tagore (3) Sarojini Naidu (4) Subhash Chandra Bose");
		System.out.print("👉 Choose the Answer: ");
		int ans4=sc.nextInt();
		if(ans4==2)
		{
			System.out.println("\t✔ Correct!");
			score++;
		}
		else
		{
			System.out.println("\t❌ Wrong!");
		}
		System.out.println("\nQ5.How many states are there in India?");
		System.out.println("(1) 26 (2) 27 (3) 30 (4) 28");
		System.out.print("👉 Choose the Answer: ");
		int ans5=sc.nextInt();
		if(ans5==4)
		{
			System.out.println("\t✔ Correct!");
			score++;
		}
		else
		{
			System.out.println("\t❌ Wrong!");
		}
		
		System.out.println("\n------------------------------------------------------");
        System.out.println("\tQuiz Completed!");
        System.out.println("\tYour score: " + score + " out of 5");
		switch(score)
		{
			case 1: System.out.println("\n\tOof! Lets try again...\n");
					break;
			case 2: System.out.println("\n\tNot Bad...Time to hit the book...\n");
					break;
			case 3: System.out.println("\n\tGood Effort, A little more practice...\n");
					break;
			case 4: System.out.println("\n\tGood Job! Just missed one...\n");
					break;
			case 5: System.out.println("\n\tExcellent! You nailed it...\n");
					break;
			default:System.out.println("\n\tKeep trying, you will get better...\n");
		}
		System.out.println("------------------------------------------------------");
	}
}
