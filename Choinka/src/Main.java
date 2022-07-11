import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		char star = '*';
		char space = ' ';
		
		System.out.println("How many Triangles do you want in your Christmas tree ?");
		int maxTriangle = scanner.nextInt();
		int TriangleCounter = 1;
		
		int Rows = 3;
		int maxStars = (Rows+maxTriangle-1)*2 - 1;
		int SpaceCounter = (maxStars-1)/2;
		int StarCounter = 1;
		
		for(int i = 0; i < Rows; i++)
		{
			for(int j = SpaceCounter; j > 0; j--)
			{
				System.out.print(space);
			}
			for(int j = 0; j < StarCounter; j++)
			{
				System.out.print(star);
			}
			System.out.println();
			StarCounter+=2;
			SpaceCounter--;
			if(i == Rows-1 && TriangleCounter < maxTriangle)
			{
				Rows++;
				StarCounter = 1;
				SpaceCounter = (maxStars-1)/2;
				i = -1;
				TriangleCounter++;
			}
		}

	}

}
