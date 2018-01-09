// http://starwars.wikia.com/wiki/Mygeeto
// Region : Outer Rim
// Sector : Albarrio Sector
// Grid location : K5
// X : -763.84, Y : 7409.65, Z : -547.9929537703749
Planet	"Reerez"
{
	ParentBody     "Malola"
	Class	       "Selena"

	Albedo          0.45
	Color          (1.000 1.000 1.000)
	
	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Orbit
	{
		SemiMajorAxis   0.6984
		//Period          0.433
		Eccentricity    0.002
		Inclination     0.025
		AscendingNode   320
		ArgOfPericenter 8.2
		MeanAnomaly     145
		RefPlane       "Equator"
	}
}

Planet	"Pergoomi"
{
	ParentBody     "Malola"
	Class	       "Selena"
	Radius          2044

	Albedo          0.45
	Color          (1.000 1.000 1.000)
	
	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Orbit
	{
		SemiMajorAxis   1.45
		//Period          1.3
		Eccentricity    0.004
		Inclination     0.001
		AscendingNode   315
		ArgOfPericenter 8.3
		MeanAnomaly     142
		RefPlane       "Equator"
	}
}

Planet	"Mygeeto"
{
	ParentBody     "Malola"
	Class	       "IceWorld"

	Mass            0.84
	Radius          5044

	RotationPeriod  12

	Albedo          0.6
	Color          (0.950 0.950 1.000)

	Surface
	{
		colorSea       (0.831, 0.788, 0.905, 1.000)
		colorShelf     (0.666, 0.619, 0.666, 1.000)
		colorBeach     (0.857, 0.749, 0.796, 1.000)
		colorDesert    (0.784, 0.749, 0.905, 1.000)
		colorLowLand   (0.839, 0.921, 1.000, 1.000)
		colorUpland    (0.611, 0.623, 0.745, 1.000)
		colorRock      (0.611, 0.623, 0.745, 1.000)
		colorSnow      (0.247, 0.235, 0.349, 1.000)
		colorLowPlants (0.674, 0.635, 0.768, 1.000)
		colorUpPlants  (0.674, 0.635, 0.768, 1.000)
		SpecularPower   150
		DayAmbient      1
		Lommel          0
		Exposure        2
	}

	Clouds
	{
		Height          24.5
		DayAmbient      1
		Lommel          0
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        0.9
		mainOctaves     10
		Coverage        0.1666667
		twistZones      4.108271
		twistMagn       4.2509
	}

	NoOcean         true

	Atmosphere
	{
		Model          "Jupiter"
		Height          66.556565
		Density         1.03
		Pressure        1
		Greenhouse      0
		Bright          10
		Opacity         1
		SkyLight        3.333333
	}

	NoRings		true

	NoCometTail     true

	NoAurora	true

	Orbit
	{
		Epoch           2356307
		SemiMajorAxis   1.9844
		//Period          0.457230847
		Eccentricity    0.01
		Inclination     4.5
		RefPlane       "Ecliptic"
	}
}

Moon	"Mygeeto 1"
{
	ParentBody     "Mygeeto"
	Class	       "IceWorld"

	Albedo          0.45
	Color          (1.000 1.000 1.000)
	
	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Orbit
	{
		SemiMajorAxis   0.0005615
		//Period          0.00048
		Eccentricity    0.004
		Inclination     0.001
		AscendingNode   315
		ArgOfPericenter 8.3
		MeanAnomaly     142
		RefPlane       "Equator"
	}
}

Moon	"Mygeeto 2"
{
	ParentBody     "Mygeeto"
	Class	       "IceWorld"

	Albedo          0.45
	Color          (1.000 1.000 1.000)
	
	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Orbit
	{
		SemiMajorAxis   0.0009615
		//Period          0.00078
		Eccentricity    0.004
		Inclination     2.001
		AscendingNode   315
		ArgOfPericenter 8.3
		MeanAnomaly     142
		RefPlane       "Equator"
	}
}

Planet	"Itzeho"
{
	ParentBody     "Malola"
	Class	       "IceWorld"
	Radius          1872

	Albedo          0.45
	Color          (1.000 1.000 1.000)
	
	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Orbit
	{
		SemiMajorAxis   2.4553
		//Period          1.2344903
		Eccentricity    0.004
		Inclination     0.001
		AscendingNode   315
		ArgOfPericenter 8.3
		MeanAnomaly     142
		RefPlane       "Equator"
	}
}
