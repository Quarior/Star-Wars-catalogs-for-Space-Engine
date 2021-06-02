// Star solver log level:
// 0 - do not log
// 1 - log errors and warnings only
// 2 - log everything
LogLevel    1

// http://starwars.wikia.com/wiki/Bittelari_Cluster
// Region : ?
// Sector : ?
// Grid location : ?
// Not enough sources about its location

// http://starwars.wikia.com/wiki/Mooshie_Cluster
// Region : ?
// Sector : ?
// Grid location : ?
// Not enough sources about its location


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

// http://starwars.wikia.com/wiki/Novoil_Cluster
// Region : Colonies
// Sector : 
// Grid location : N12

// http://starwars.wikia.com/wiki/Zenox_Cluster
// http://starwars.wikia.com/wiki/Zenox_Star_Cluster
// Region : Colonies
// Sector : 
// Grid location : K13
// X : -1112.95, Y : -5428.37, Z : 476.94522256228424
Cluster	"Zenox Cluster"
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

// Koornacht Cluster is cut in 2 parts since it’s not spherical
// source : http://soeempire.freeservers.com/cgi-bin/i/images/farlax.jpg

// http://starwars.wikia.com/wiki/Koornacht_Cluster
// Region : Core Worlds
// Sector : Farlax sector
// Grid location : K10
// X : -1410.7, Y : -855.47, Z : -334.76137882230626
Cluster "Koornacht Cluster (Part A)"
{
	Galaxy     "Star Wars galaxy"
	Type       "Open"	// within galaxy disk
    RA         0.08734706911845287
    Dec        24.58574637107359
    Dist       383000334.7661021
	Radius   37
	AbsMagn    1 // default
	CenPow   0.5 // default star concentration parameter
	//Age      
	NStars   2000  // default
	
}

// http://starwars.wikia.com/wiki/Koornacht_Cluster
// Region : 
// Sector : 
// Grid location : 
// X : -1388.3, Y : -837.47, Z : -221.93460982457782
Cluster "Koornacht Cluster (Part B)"
{
	Galaxy     "Star Wars galaxy"
	Type       "Open"	// within galaxy disk
    RA         0.08734684572403915
    Dec        24.585749063880296
    Dist       383000221.9393116
    Radius   30.3
	AbsMagn    1 // default
	CenPow   0.5 // default star concentration parameter
	//Age      
	NStars   2000  // default
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// http://starwars.wikia.com/wiki/Ringali_Shell
// Region : Core Worlds
// Sector : Bormea/Darpa
// Grid location : L9
// X : 907.48, Y : 538.41, Z : -88.30110858544464
// Arbitrary centered on Brentaal, radius distance between Brentaal and barycenter Corulag-Anaxes 389.676161095pcs
Cluster "Ringali Shell"
{
	Galaxy     "Star Wars galaxy"
	Type       "Open"	// within galaxy disk
    RA         	0.08732394956274935
    Dec        	24.585954891882402
    Dist       	383000088.3114888
    Radius   	389.676161095
	AbsMagn    	1 // default
	CenPow   	0.5 // default star concentration parameter
	//Age      
	NStars   	2000  // default
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

//////////////////////////////////////
//            Deep Core             //
//////////////////////////////////////

// http://starwars.wikia.com/wiki/Galactic_Center
// Region : Deep Core
// Region wiki : http://starwars.wikia.com/wiki/Deep_Core
// Sector : 
// Sector wiki : 
// System wiki : 
// Grid location : K-11
// Known body : Galactic Center
// X : 0, Y : 0, Z : 0
Cluster	"Galactic center Cluster/Star Wars galaxy center cluster"
{
	Galaxy  "Star Wars galaxy"
	Type    "Part"	// part of a galaxy
    RA       0.087333
    Dec      24.5855555
	Dist     3.83e8
	Radius   300
	AbsMagn  4.6
	Age      13000 // millions of years // age of the galaxy http://starwars.wikia.com/wiki/Timeline_of_galactic_history/Legends
	NStars   0		// part of a galaxy must have no stars
}

// http://starwars.wikia.com/wiki/Starswarm_Cluster
// Region : Deep Core
// Region wiki : http://starwars.wikia.com/wiki/Deep_Core
// Sector : 
// Sector wiki : 
// System wiki : 
// Grid location : L-10
// Known body : Starswarm Cluster
// X : 146.34, Y : 1531.8900000000003, Z : 3056.737993758868
Cluster "Starswarm Cluster"
{
	Galaxy   "Star Wars galaxy"
	Type     "Open"	// within galaxy disk
    RA         0.08733154051674624
    Dec        24.58578466849135
    Dist       382996943.26509774
	Radius   40 // default
	CenPow   10  // star concentration parameter
	//Age      
	NStars   2000  // default
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle "Dense Star cluster within galactic deep core (more than 20 white stars)"
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

// http://starwars.wikia.com/wiki/Chaykin_Cluster
// Region : Expansion Region
// Sector : Chaykin
// Grid location : O14
// Near corbantis system, not found on any map

// http://starwars.wikia.com/wiki/Greater_Plooriod_Cluster
// Region : Expansion Region
// Sector : Ploo
// Grid location : N7
// X : 2848.04, Y : 3501.22, Z : -525.6521815685704
Cluster "Greater Plooriod Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08730459609261569
    Dec        24.586398119299687
    Dist       383000525.7041886
    Class      "Arbitrary centered on Corsin System"
	Radius		4			// default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}


// http://starwars.wikia.com/wiki/Rainos_Cluster
// Region : Expansion Region
// Sector : Rocantor
// Grid location : L15
// X : 940.32, Y : -8544.97, Z : -438.60574901192246
Cluster "Rainos Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08732362205296895
    Dec        24.584596043627606
    Dist       383000438.66060334
    Radius		4			// default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// http://starwars.wikia.com/wiki/Zuni_Cluster
// Region : Expansion Region
// Sector : 
// Grid location : N14
// X : 4022, Y : -7200, Z : -500
// Arbitrary located near Vernet system
Cluster "Zuni Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08729288802012997
    Dec        24.584797247447078
    Dist       383000500.0546572
	Radius		4			// default radius
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

// http://starwars.wikia.com/wiki/Gelviddis_Cluster
// Region : Inner Rim
// Sector : 
// Grid location : N9
// X : 3882.27, Y : 401.17, Z : -538.5059289928776
Cluster "Gelviddis System"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08729428157124959
    Dec        24.585934360703465
    Dist       383000538.5339783
	Radius		4.68       // default radius
    AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

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

// http://starwars.wikia.com/wiki/Shasfath_Cluster
// Region : Inner Rim
// Sector : 
// Grid location : J14
// X : -2786.8, Y : -6855.08, Z : -502.9989099912457
Cluster "Shasfath Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08736079315381119
    Dec        24.584848846498215
    Dist       383000503.0381785
    Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// http://starwars.wikia.com/wiki/Zeemacht_Cluster
// Region : Inner Rim
// Sector : 
// Grid location : N8
// X : 3936.91, Y : 1792.53, Z : 253.7672676357372 // centered on Tirahnn system
Cluster "Zeemacht Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08729373655756804
    Dec        24.586142505373857
    Dist       382999746.27306694
	Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

//////////////////////////////////////
//            Mid Rim               //
//////////////////////////////////////

// No known systems are included in this cluster since it's not mentioned in wookieepedia
// So it was arbitrary located in order not to include those systems
// X : Grakouine system,  Y : Talay system
//
// http://starwars.wikia.com/wiki/Baylin_Cluster
// Region : Mid Rim
// Sector : Trans-Nebular
// Grid location : R16
// X : 9638.65, Y : -9171.82, Z : 114.71441859282857
Cluster "Baylin Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA          0.0872368722140129
    Dec         24.584502267123636
    Dist        382999885.4715756
    Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// http://starwars.wikia.com/wiki/Bortele_Cluster
// Region : Mid Rim
// Sector : Bortele sector
// Grid location : R8
// X : 10219.87, Y : 2545.34, Z : 390.98372540692753 // arbitrary centered on Ingo system
Cluster "Bortele Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08723107554120182
    Dec        24.586255124069282
    Dist       382999609.1811799
    Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// http://starwars.wikia.com/wiki/Bright_Jewel_Cluster
// Region : Mid Rim
// Sector : Bright Jewel
// Grid location : L7
// X : 71.13, Y : 3824.46, Z : 130.29783200959514 // arbitrary centered on Bright Jewel system
Cluster "Bright Jewel Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08733229060919351
    Dec        24.586446476601992
    Dist       382999869.7484826
    Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// http://starwars.wikia.com/wiki/Corbett_Cluster
// Region : Mid Rim
// Sector : Corbett sector
// Grid location : I17
// X : -3576.85, Y : -10669.73, Z : -72.7875581797465
Cluster "Corbett Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08736867247519542
    Dec        24.58427818433705
    Dist       383000072.89943475
    Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// http://starwars.wikia.com/wiki/Delphidian_Cluster
// Region : Mid Rim
// Sector : ?
// Grid location : ?
// Not enough sources about its location aside beneath wookieepedia description
// The Delphidian Cluster was a stellar nursery situated in the galaxy's Mid Rim, on the fringes of Wild Space.

// http://starwars.wikia.com/wiki/Lesser_Plooriod_Cluster
// Region : Mid Rim
// Sector : Ottega
// Grid location : M6
// X : 1336.51, Y : 4825.1, Z : 449.46077648796654
// Urce Space and the Ottega sector lay in the cluster 
// Arbitrary Y_Ithor, X(Generis+(2x Per lupelo-Generis)). Radius : Ithor-Genassa : 386"
Cluster "Lesser Plooroid Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08731967076202936
    Dec        24.58659617059793
    Dist       382999550.604731
	Radius		386
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// http://starwars.wikia.com/wiki/Mektrun_Cluster
// Region : Mid Rim
// Sector : Senex/Juvex
// Grid location : L17
// X : 471.65, Y : -11734.88, Z : 348.1338497694437
// The Mektrun Cluster was in the Mid Rim, possibly in Senex sector or Juvex sector. The cluster contained the planet Veron. 
// Veron is in Senex sector. Arbitrary centered Mektrun cluster on Veron
Cluster "Mektrun Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.0873282961568371
    Dec        24.584118839186566
    Dist       382999651.9868421
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

// http://starwars.wikia.com/wiki/Bekkra_Star_Cluster
// Region : Outer Rim
// Sector : ?
// Grid location : ?
// Not enough sources about its location

// http://starwars.wikia.com/wiki/Bi-Boran_Cluster
// Region : Outer Rim Territories
// Sector : Toblain
// Grid location : O18
// X : 4854.33, Y : -12089.32, Z : -488.1793910313817
Cluster "Bi-Boran Cluster" // Centered on Shadda-Bi Boran system
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08728458707278747
    Dec        24.58406581911164
    Dist       383000488.3396066
    Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// http://starwars.wikia.com/wiki/Cron_Cluster
// Region : Outer Rim Territories
// Sector : Auril
// Grid location : R6
// X : 10423.56, Y : 4688.15, Z : 444.54064232783367
// Arbitrary located on X_Yutusk and Y_Belderone
Cluster "Cron Cluster" // Was destroyed by the Sith sorceress Aleema Keto during the great Sith War
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08722904409250769
    Dec        24.586575683205684
    Dist       382999555.661912
	Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// http://starwars.wikia.com/wiki/Gevarno_Cluster
// Region : Outer Rim Territories
// Sector : Brema
// Grid location : M17
// X : ?, Y : ?, Z : ?
// Contains systems of Gevarno Loop
// Gevarno Cluster

// http://starwars.wikia.com/wiki/Greeb-Streebling_Cluster
// Region : Outer Rim Territories
// Sector : Bozhnee sector
// Grid location : L18
// X : 475.15, Y : -12255.84, Z : -320.4538010585476
// Ninth Quadrant (include Belsavis) near Senex and Juvex cluster. Arbitrary X Yetoom and Y Ossel
Cluster "Greeb-Streebling Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08732826125903265
    Dec        24.58404090753182
    Dist       383000320.58791405
    Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// http://starwars.wikia.com/wiki/Iti_Cluster
// Region : Outer Rim Territories
// Sector : Tammuz
// Grid location : T14
// X : ?, Y : ?, Z : ?
// Not enough data except it contains Iti system
// Gevarno Cluster

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

// http://starwars.wikia.com/wiki/Minos_Cluster/Legends
// Region : Outer Rim Territories
// Sector : 
// Grid location : M20
// X : 2436.12, Y : -16048.04, Z : -481.5987720179705
// Arbitrary centered on Karideph, Radius : Arbitrary Adarlon-Pergitor : 415.5
Cluster "Minos Cluster System"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08730870422647984
    Dec        24.583473605867134
    Dist       383000481.85935706
    Radius		415.5      // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// http://starwars.wikia.com/wiki/Naps_Fral_Cluster
// Region : Outer Rim Territories
// Sector : Ferra
// Grid location : S16
// Between Ryloth and Nal hutta (on hyperlanes)

// http://starwars.wikia.com/wiki/Pacanth_Reach
// Region : Outer Rim Territories
// Sector : 
// Grid location : H16
// X : -5726.08, Y : -9422.715, Z : 17
// Arbitrary centered on Panatha-Bunduki barycenter, radius is half Panatha-Bunduki distance i.e. 397.9490840832pcs
Cluster "Pacanth Reach"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.0873901070899377
    Dec        24.58446473416719
    Dist       382999983.1122085
    Radius		397.9490840832
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

// http://starwars.wikia.com/wiki/Thandon_Cluster
// Region : Outer Rim Territories
// Sector : Corporate
// Grid location : S3
// X : 11200.36, Y : 9298.05, Z : -405.45679722885967
// Arbitrary centered on Brosi system
Cluster "Thandon Cluster/Thandon Nebula"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08722129718407584
    Dec        24.587265308968238
    Dist       383000405.7911046
	Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// http://starwars.wikia.com/wiki/Tion_Cluster/Legends
// Region : Outer Rim Territories
// Sector : 
// Grid location : S5
// X : 11458.05, Y : 5583.52, Z : 555.210767863819
// Arbitrary centered on Jaminere system, radius : jaminere-desevro x2 : 919.2963066574pcs
Cluster "Tion Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.0872187269176782
    Dec        24.586709628660923
    Dist       382999445.03832704
	Radius		919.2963066574
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// http://starwars.wikia.com/wiki/Vallusk_Cluster
// Region : Outer Rim Territories
// Sector : Gordian Reach
// Grid location : Q6
// X : 7520.32, Y : 5746.59, Z : -489.9834562441322
Cluster "Vallusk Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08725799877366544
    Dec        24.586734020317635
    Dist       383000490.1383092
    Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// http://starwars.wikia.com/wiki/Vorzyd_Cluster
// Region : Outer Rim Territories
// Sector : Vorzyd
// Grid location : R6
// X : 9225.64, Y : 5161.03, Z : -46.55953379920334
// Arbitrary centered on Vorzyd
Cluster "Vorzyd Cluster System"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08724099126702409
    Dec        24.586646423476967
    Dist       383000046.74007094
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

// http://starwars.wikia.com/wiki/Nihil_Retreat
// Region : Unknown Regions
// Sector : ?
// Grid location : ?
// 12 star clusters surrounding Perann Nebula

// http://starwars.wikia.com/wiki/Ssi-ruuk_Star_Cluster
// Region : Unknown Regions
// Sector : 
// Grid location : C16
// X : -12229.03, Y : -9521.08, Z : -203.57308510503975
// Arbitrary centered on Lwhekk
Cluster "Ssi-ruuk Star Cluster/Ssi-Ruuvi Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.0874549619554183
    Dec        24.58445001966129
    Dist       383000203.8396085
	Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// http://starwars.wikia.com/wiki/Unidentified_Unknown_Regions_star_cluster
// Region : Unknown Regions
// Sector : ?
// Grid location : ?


//////////////////////////////////////
//           Wild Space             //
//////////////////////////////////////

// http://starwars.wikia.com/wiki/Cosm%27s_Well
// Region : Wild Space/Far above Inner Rim
// Sector : 
// Grid location : N8
// X : 3936.91, Y : 1792.53, Z : 4265 // Far above Zeemacht Cluster
Cluster "Cosm's Well"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Globular"	// out of galaxy disk
    RA         0.08729373614634987
    Dec        24.586142511521746
    Dist       382995735.040335
    Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// http://starwars.wikia.com/wiki/Morellian_Commonwealth/Legends
// Region : Wild Space
// Sector : 
// Grid location : S3
// X : 11474.7, Y : 9763.99, Z : 403.81962518371313
// Arbitrary centered on Morellia system
Cluster "Morellian Commonwealth"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.0872185609096304
    Dec        24.587335016037006
    Dist       382999596.5369918
	Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// http://starwars.wikia.com/wiki/Parthovian_Cluster
// Region : Wild Space
// Region wiki : http://starwars.wikia.com/wiki/Wild_Space
// Sector : 
// Sector wiki : 
// System wiki : 
// Grid location : T-4
// Known planet : Parthovian Cluster
// X : 12456.285, Y : 10942.365, Z : 851.7214899987312
Cluster "Parthovian Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08720877125399741
    Dec        24.587192452288377
    Dist       382999148.6373807
    Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// http://starwars.wikia.com/wiki/The_Redoubt
// Region : Unknown Regions
// Region wiki : http://starwars.wikia.com/wiki/Unknown_Regions
// Sector : 
// Sector wiki : https://starwars.fandom.com/wiki/Chiss_Ascendancy/Legends
// System wiki : 
// Grid location : H-7
// Known planet : The Redoubt/Chiss Redoubt
// X : -4835.3099999999995, Y : 5287.155000000001, Z : 3713.5034893197026
Cluster "The Redoubt/Chiss Redoubt"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA          0.08738122376706868
    Dec         24.586346451969494
    Dist        382996286.5635273
    Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}
