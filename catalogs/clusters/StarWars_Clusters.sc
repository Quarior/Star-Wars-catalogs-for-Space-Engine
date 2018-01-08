// Star solver log level:
// 0 - do not log
// 1 - log errors and warnings only
// 2 - log everything
LogLevel    1

//////////////////////////////////////
//            Deep Core             //
//////////////////////////////////////

Cluster	"Galactic Center Cluster/Star Wars galaxy center cluster"
{
	Galaxy  "Star Wars galaxy"
	Type    "Part"	// part of a galaxy
	RA       0.0873333
	Dec      +24.5855555
	Dist     3.83e8
	Radius   300
	AbsMagn  4.6
	Age      13000 // millions of years // age of the galaxy http://starwars.wikia.com/wiki/Timeline_of_galactic_history/Legends
	NStars   0		// part of a galaxy must have no stars
}

// http://starwars.wikia.com/wiki/Starswarm_Cluster
// Region : Deep Core
// Sector : 
// Grid location : L10
// X : 146.34, Y : -599.47, Z : -361.9035783614696
Cluster "Starswarm Cluster" // system name
{
	Galaxy   "Star Wars galaxy"
	Type     "Open"	// within galaxy disk
    RA         0.08733154052977352
    Dec        24.585784667941773
    Dist       383000361.90666986
	Radius   4 // default
	AbsMagn  1 // default
	CenPow   0.9   // default     // star concentration parameter
	//Age      
	NStars   2000  // default	
}

//////////////////////////////////////
//            Colonies              //
//////////////////////////////////////

// http://starwars.wikia.com/wiki/Zenox_Cluster
// Region : Colonies
// Sector : 
// Grid location : K13
// X : -1112.95, Y : -5428.37, Z : 476.94522256228424
Cluster	"Zenox"
{
	Galaxy     "Star Wars galaxy"
	Type       "Open"	// within galaxy disk
	RA         0.08734409963746173
    Dec        24.585062276970522
    Dist       382999523.07058537
	Radius     4 // default
	AbsMagn    1 // default
	CenPow   0.5        // star concentration parameter
	//Age      
	NStars     1500  // default		
}