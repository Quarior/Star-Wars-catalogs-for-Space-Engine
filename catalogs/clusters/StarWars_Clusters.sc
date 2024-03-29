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
// Region wiki : http://starwars.wikia.com/wiki/Colonies
// Sector : Duluur sector, Anarid Cluster
// Sector wiki : https://starwars.fandom.com/wiki/Duluur_sector/Legends, https://starwars.fandom.com/wiki/Anarid_Cluster
// Grid location : M-13
// Location is arbitrary centered on Kelada system
// X : 1816.8149999999998, Y : -3167.64, Z : 3381.1172088284184
Cluster "Anarid Cluster"
{
	Galaxy     "Star Wars galaxy"
	Type       "Open"	// within galaxy disk
    RA         0.08731488046116283
    Dec        24.585081625312696
    Dist       382996618.9001996
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
// Region : Colonies
// Region wiki : http://starwars.wikia.com/wiki/Colonies
// Sector : 
// Sector wiki : 
// System wiki : 
// Grid location : K-13
// Known planet : 
// X : -1112.955, Y : -3297.015, Z : 7372.1926199340505
Cluster	"Zenox Star Cluster" // system name
{
	Galaxy     "Star Wars galaxy"
	Type       "Open"	// within galaxy disk
    RA         0.08734409988716195
    Dec        24.585062265846727
    Dist       382992627.8231885
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


// https://starwars.fandom.com/wiki/Rainos_Cluster
// Region : Expansion Region
// Region wiki : https://starwars.fandom.com/wiki/Expansion_Region
// Sector : Rocantor Sector
// Sector wiki : http://starwars.wikia.com/wiki/Rocantor_sector
// System wiki : 
// Grid location : L-15
// Known planet : 
// X : 940.32, Y : -6413.594999999999, Z : -2400.279067654189
Cluster "Rainos Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08732362210100121
    Dec        24.58459604928976
    Dist       383002400.3339216
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

// https://starwars.fandom.com/wiki/Si%27Klaata_Cluster/Legends
// Region : Hutt Space
// Region wiki : http://starwars.wikia.com/wiki/Hutt_Space
// Sector : Hutt Space, Si'Klaata Cluster
// Sector wiki : http://starwars.wikia.com/wiki/Hutt_Space
// System wiki : 
// Grid location : S-9
// X : 11621.500000000005, Y : 3449.245000000001, Z : 7348.944967633572
Star Cluster "Si'Klaata Cluster" // system name. Centered on 2/3 vontor, 1/3 vodran (https://starwars.fandom.com/wiki/Si%27Klaata_Cluster/Legends?file=Sisar_Run.png)
{
    Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA          0.08721709474706234
    Dec         24.5860715077627
    Dist        382992651.24688536
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
// Region wiki : http://starwars.wikia.com/wiki/Mid_Rim
// Sector : Corbett Sector
// Sector wiki : http://starwars.wikia.com/wiki/Corbett_sector
// System wiki : https://starwars.fandom.com/wiki/Corbett_Cluster/Legends
// Grid location : I-17
// Known planet : 
// X : -3576.855, Y : -8538.36, Z : -3927.8798817905863
Cluster "Corbett Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08736867216600253
    Dec        24.58427819719376
    Dist       383003927.9917572
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

// http://starwars.wikia.com/wiki/Gelviddis_Cluster
// Region : Inner Rim
// Region wiki : http://starwars.wikia.com/wiki/Inner_Rim
// Sector : 
// Sector wiki : 
// System wiki : 
// Grid location : N-9
// Known planet : 
// X : 3882.2699999999995, Y : 2532.5400000000004, Z : 2579.3237073414284
Cluster "Gelviddis Cluster" // system name
{
    Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// Default // within galaxy disk
    RA         0.08729428125605826
    Dec        24.585934363787622
    Dist       382997420.7043422
    Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

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

// http://starwars.wikia.com/wiki/Rearqu_Cluster
// Region : Mid Rim
// Region wiki : http://starwars.wikia.com/wiki/Mid_Rim
// Sector : Taldot Sector
// Sector wiki : http://starwars.wikia.com/wiki/Taldot_sector
// System wiki : http://starwars.wikia.com/wiki/Rearqu_Cluster
// Grid location : P-8
// Known planet : 
// X : 7248.96, Y : 4154.67, Z : -8253.398087620004
Star "Rearqu Cluster"
{
    Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.0872607065511209
    Dec        24.58617701416882
    Dist       383008253.4892197
    Class      "M8 IV" // random
    Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// https://starwars.fandom.com/wiki/Shasfath_Cluster
// Region : Inner Rim
// Region wiki : http://starwars.wikia.com/wiki/Inner_Rim
// Sector : 
// Sector wiki : 
// System wiki : 
// Grid location : J-14
// Known planet : 
// X : -2786.79, Y : -4723.7249999999985, Z : -7164.474908211253
Cluster "Shasfath Cluster system" // system name
{
    Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08736079257068734
    Dec        24.584848856544813
    Dist       383007164.51417613
    Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}


// http://starwars.wikia.com/wiki/Tyus_Cluster
// Region : Mid Rim
// Region wiki : http://starwars.wikia.com/wiki/Mid_Rim
// Sector : Tyus Sector
// Sector wiki : http://starwars.wikia.com/wiki/Tyus_sector
// System wiki : http://starwars.wikia.com/wiki/Tyus_Cluster
// Grid location : N-16
// Known planet : Tyus Cluster
// X : 3129.6899999999996, Y : -7457.4, Z : 6091.336884219051
Cluster "Tyus Cluster" // system name
{
    Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08730178661790275
    Dec        24.584439875086858
    Dist       382993908.7485059
    Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// https://starwars.fandom.com/wiki/Zeemacht_Cluster
// Region : Inner Rim
// Region wiki : 
// Sector : 
// Sector wiki : 
// System wiki : https://starwars.fandom.com/wiki/Zeemacht_Cluster
// Grid location : N-8
// Known planet : 
// X : 3936.8999999999996, Y : 3923.8950000000004, Z : 2666.0022521854453
Cluster "Zeemacht Cluster system" // system name
{
    Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08729373641000707
    Dec        24.586142508323004
    Dist       382997334.0380825
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

// http://starwars.wikia.com/wiki/Jagomir
// Region : Outer Rim
// Region wiki : http://starwars.wikia.com/wiki/Outer_Rim
// Sector : Esstran Sector
// Sector wiki : http://starwars.wikia.com/wiki/Esstran_sector
// System wiki : https://starwars.fandom.com/wiki/Jaga%27s_Cluster
// Grid location : Q-5
// Known planet : Jagomir
// X : 8697.195, Y : 9104.52, Z : 8031.299400827433 // Cluster center is Jagomir System
Cluster "Jaga's Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08724625970120517
    Dec        24.586917540494387
    Dist       382991968.9075663
	Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// https://starwars.fandom.com/wiki/The_Maw
// Region : Outer Rim Territories, Maw Nebulae
// Region wiki : http://starwars.wikia.com/wiki/Outer_Rim, https://starwars.fandom.com/wiki/Maw_Nebulae
// Sector : Kessel sector
// Sector wiki : https://starwars.fandom.com/wiki/Kessel_sector/Legends
// System wiki : 
// Grid location : T-10
// Known planet : 
// X : 12446.445, Y : 1987.9500000000003, Z : -5809.4283090287245
Cluster "Maw Cluster/The Maw"
{
    Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08720887154891895
    Dec        24.585852887512353
    Dist       383005809.63570267
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
// Region : Outer Rim
// Region wiki : http://starwars.wikia.com/wiki/Outer_Rim
// Sector : Gordian Reach
// Sector wiki : https://starwars.fandom.com/wiki/Gordian_Reach
// System wiki : 
// Grid location : Q-6
// Known planet : 
// X : 7520.325000000001, Y : 7877.955, Z : 8567.379990592795
Cluster "Vallusk Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08725799695009473
    Dec        24.586734047440455
    Dist       382991432.774866
    Radius		4.68       // default radius
	AbsMagn 	-3.6        // default absolute magnitude
	CenPow   	0.5        // default star concentration parameter
	Age      	760        // default age
	NStars   	1500       // default number of stars
	Color   	(0.86 0.92 1.00)  // default color of the star-like particle
}

// https://starwars.fandom.com/wiki/Vorzyd_Cluster
// Region : Outer Rim
// Region wiki : http://starwars.wikia.com/wiki/Outer_Rim
// Sector : Vorzyd Sector
// Sector wiki : http://starwars.wikia.com/wiki/Vorzyd_sector
// System wiki : 
// Grid location : R-6
// Known planet : 
// X : 9225.645, Y : 7292.4, Z : -7146.591057929125
// Arbitrary centered on Vorzyd
Cluster "Vorzyd Cluster"
{
	Galaxy     	"Star Wars galaxy"
	Type       	"Open"	// within galaxy disk
    RA         0.08724099292277991
    Dec        24.58664640325387
    Dist       383007146.77159196
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
