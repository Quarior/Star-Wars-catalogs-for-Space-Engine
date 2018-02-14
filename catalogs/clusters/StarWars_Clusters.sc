// Star solver log level:
// 0 - do not log
// 1 - log errors and warnings only
// 2 - log everything
LogLevel    1


//////////////////////////////////////
//            Colonies              //
//////////////////////////////////////

// http://starwars.wikia.com/wiki/Anarid_Cluster
// Region : Colonies
// Sector : Duluur
// Grid location : M13
// Location is arbitrary centered on Kelada system for X-Y coords
// X : 1816.82, Y : -5299, Z : 14.913586246782756
Cluster "Anarid Cluster"
{
	Galaxy     "Star Wars galaxy"
	Type       "Open"	// within galaxy disk
    RA         0.08731488057055047
    Dec        24.585081630973573
    Dist       382999985.103822
    Radius     200 // not far from bestine
	AbsMagn    1 // default
	CenPow   0.5 // default star concentration parameter
	//Age      
	NStars     1500  // default
}

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
	CenPow   0.5 // default star concentration parameter
	//Age      
	NStars     1500  // default		
}

//////////////////////////////////////
//              Core                //
//////////////////////////////////////



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
Cluster "Starswarm Cluster"
{
	Galaxy   "Star Wars galaxy"
	Type     "Open"	// within galaxy disk
    RA         0.08733154052977352
    Dec        24.585784667941773
    Dist       383000361.90666986
	Radius   40 // default
	CenPow   10  // star concentration parameter
	//Age      
	NStars   2000  // default	
}

//////////////////////////////////////
//         Expansion Region         //
//////////////////////////////////////

// http://starwars.wikia.com/wiki/Aramand_Cluster
// Region : Expansion Region
// Sector : Brak
// Grid location : O14
// Based on these maps :
// http://soeempire.freeservers.com/cgi-bin/i/images/brak.jpg
// http://pro.bols.netdna-cdn.com/wp-content/uploads/2017/03/brak-sector.png 
// Average coordinates of Aramand, Orma, Cirra, Mila, Lota
// X : 5739.2118181818, Y : -6975, Z : 4.875
Cluster "Aramand Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08727576405882764
    Dec        24.584830905850115
    Dist       382999996.07362515
    Radius		4
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}


//////////////////////////////////////
//           Hutt Space             //
//////////////////////////////////////

// http://starwars.wikia.com/wiki/Si%27Klaata_Cluster
// Region : Hutt Space
// Sector :
// Grid location : S12
// Coordinates are barycenter 1/4 Vontor coords, 1/4 Klatooine coords, 1/2 Tas-la coord 
// X : 11613.2250237408, Y : 1438.6055055271, Z : 0
// Based on this map : https://vignette.wikia.nocookie.net/starwars/images/b/b5/Sisar_Run.png/revision/latest?cb=20080330194644
Cluster "Si'Klaata Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08721717949866106
    Dec        24.586089558823566
    Dist       383000000.19270456
	Radius		54.202606641 // 3 times cluster center-vontor distance
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

/////////////////////////////////////
//           Inner Rim             //
/////////////////////////////////////

// Cluster is centered on Millinar (X and Y)
// Data are set according to these maps
// https://www.starwars-universe.com/images/chronologie/anciennerep/grand_conflits1/hapes.jpg
// http://www.hapes.org/images/revelations/hapescluster.jpg
// https://vignette.wikia.nocookie.net/starwars/images/2/21/HapesClusterMap-TEA.jpg/revision/latest?cb=20090903052149
//
// http://starwars.wikia.com/wiki/Hapes_Cluster
// Region : Inner Rim
// Sector : 
// Grid location : O9
// X : 5214.54, Y : 803.56, Z : 0
Cluster "Hapes Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08728099458066428
    Dec        24.585994557708
    Dist       383000000.04674315
    Radius		1012 // according to this map http://holocron.swcombine.com/images/0/04/HapesCluster.jpg
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// http://starwars.wikia.com/wiki/Inner_Cluster
// Region : Inner Rim
// Sector : Inner Cluster Sector
// Grid location : O11
// X : 4904.13, Y : -1802.26, Z : 137.4087407418673 // Cluster center is Teke Ro System
Cluster "Inner Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         	0.08728409033037816
    Dec        	24.585604733996767
    Dist       	382999862.62279814
	Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

//////////////////////////////////////
//           Outer Rim              //
//////////////////////////////////////

// http://starwars.wikia.com/wiki/Aturi_Cluster
// Region : Outer Rim Territories
// Sector : Sarin
// Grid location : P19
// Arbitrary placed within the hook nebula/Sarin sector
// X : 5588, Y : -12089, Z : 0
Cluster "Aturi Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08727727000593621
    Dec        24.58406586508401
    Dist       383000000.17020905
    Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// http://starwars.wikia.com/wiki/Jaga%27s_Cluster
// Region : Outer Rim
// Sector : Esstran Sector
// Grid location : Q5
// X : 8697.2, Y : 6973.15, Z : 180.0175011215423 // Cluster center is Jagomir System
Cluster "Jaga's Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08724626142946693
    Dec        24.58691751257332
    Dist       382999820.1894619
	Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// http://starwars.wikia.com/wiki/Skustell
// http://starwars.wikia.com/wiki/Skustell_Cluster
// Region : Outer Rim
// Sector : Tarabba Sector
// Grid location : N19
// X : 3351.22, Y : -14395.61, Z : 196.75751906411347 // Cluster center is Skustell System
Cluster "Skustell Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.0872995777439763
    Dec        24.58372080143163
    Dist       382999803.4535023
	Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}


//////////////////////////////////////
//           Unknown Regions        //
//////////////////////////////////////


//////////////////////////////////////
//           Wild Space             //
//////////////////////////////////////
