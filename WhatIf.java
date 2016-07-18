public class WhatIf
{
	public static void main( String[] args )
	{
		int people = 20;
		int cats = 20;
		int dogs = 15;

		if ( people < cats )
		{
			System.out.println( "Too many cats!  The world is doomed!" );
		}

		if ( people > cats )
		{
			System.out.println( "Not many cats!  The world is saved!" );
		}

		if ( people < dogs )
		{
			System.out.println( "The world is drooled on!" );
		}

		if ( people > dogs )
		{
			System.out.println( "The world is dry!" );
		}

		dogs += 5;

		if ( people >= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}

		if ( people <= dogs )
		{
			System.out.println( "People are less than or equal to dogs." );
		}

		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		}
	}
}

/*
1. The If statement forces the code to check it's conditions, if met,
they execute the code imbedded in the if statements block. Otherwise 
proceeds through rest of code.

2. The curly braces contain what the if statement will do if conditions 
are met. Not required for a single command after if statement.
*/
