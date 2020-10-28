import java.util.Random;
public class RollDice{
	public static void main( String[] args){
		Random randomNumbers = new Random();
		int[][] count=new int[6][6];
		int dice1,dice2; 
		for ( int roll = 1; roll <= 10000; roll++ )
		{ 
			dice1 = 1 + randomNumbers.nextInt( 6 ); 
			dice2 = 1 + randomNumbers.nextInt( 6 );
			count[dice1-1][dice2-1]++;
		} 
		System.out.println("Each pair has rolled the following number of times");				
                for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
				System.out.print("pair "+(i+1)+","+(j+1)+"="+count[i][j]+"  ");
			System.out.println( );
		}
	} 
}