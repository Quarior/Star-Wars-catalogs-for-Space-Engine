//////////////////////////////////////
//         Star Wars Galaxy         //
//////////////////////////////////////

// http://starwars.wikia.com/wiki/The_galaxy/Legends
// http://starwars.wikia.com/wiki/The_galaxy
Galaxy	"Star Wars galaxy/The galaxy"
{
	Type    "SBc"
	RA       0.0873333
	Dec      +24.5855555
	Dist     3.83e8
	// Diameter between 100,000 ly (30660.139 parsecs) and 120,000 ly (36792.1673 parsecs)
	// 100,000 ly is canon sources, we'll increase the radius if some systems are too far away from the edge or the galaxy
	Radius   18429.8994 //15330.0695
	AbsMagn -20.38
    Pitch       0 //-45.05019
    Roll        90 //43.35823
	Axis ( 96.77807, 0.05264891, 0.9979032, -0.03765139) // face the sun, easier to place systems
    Quat ( 0.9770048, 0.2111951, -0.01530767, -0.02498069 )
}

//////////////////////////////////////
//   Star Wars Satellites galaxies  //
//////////////////////////////////////

// http://starwars.wikia.com/wiki/Rishi_Maze
// http://starwars.wikia.com/wiki/Rishi_Maze/Legends
// From Rishi(SWtOR) : https://galacticantics.files.wordpress.com/2015/05/rishi-3.jpg
// X : 12450, Y : -9700.05, Z : 6100
Galaxy	"Rishi Maze/Companion Aurek"
{
	Type    "Scd"
	RA         0.08720883223393608
    Dec        24.584423227604987
    Dist       382993900.27714205
	Radius   3000
	AbsMagn -14.76 //-20.38
	Axis ( 281.1476, 0.4828483, 0.8238676, -0.2968164 )
}

// http://starwars.wikia.com/wiki/Firefist
Galaxy	"Firefist/Companion Besh"
{
	Type    "Sa"
	RA         0.08736076645343194
    Dec        24.587131841144693
    Dist       383007000.15507394
	Radius   2000
	AbsMagn -13.62 //-20.38
    	//Pitch       0 //-45.05019
    	//Roll        90 //43.35823
		Axis ( 151.2355, 0.7726607, 0.07577215, -0.6302811)    
}