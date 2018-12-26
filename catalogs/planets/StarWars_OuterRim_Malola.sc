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

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Subglacial/Terrestrial"
	}

	Surface
	{
		SurfStyle       0.815688
		OceanStyle      0.159424
		Randomize      (0.077, -0.639, 0.626)
		colorDistMagn   0.0775602
		colorDistFreq   539.056
		detailScale     12973.5
		colorConversion true
		drivenDarkening 0
		seaLevel        0.126243
		snowLevel       0.85
		tropicLatitude  0.726978
		icecapLatitude  1
		icecapHeight    0.126243
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.76066
		venusFreq       0.386773
		venusMagn       0
		mareFreq        1.74747
		mareDensity     0.106708
		terraceProb     0.147157
		erosion         0
		montesMagn      0.115058
		montesFreq      4000
		montesSpiky     0.0
		montesFraction  0.866111
		dunesMagn       0.3546772
		dunesFreq       6756.03
		dunesFraction   0.951541
		hillsMagn       0.106274
		hillsFreq       530.672
		hillsFraction   0.667659
		hills2Fraction  0.508054
		riversMagn      65.5511
		riversFreq      2.87813
		riversSin       4.84585
		riversOctaves   0
		canyonsMagn     0.480315
		canyonsFreq     2.14077
		canyonFraction  0
		cracksMagn      0.0628872
		cracksFreq      2.13206
		cracksOctaves   4
		craterMagn      0.679284
		craterFreq      18.2942
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.687189
		volcanoFreq     0.919621
		volcanoDensity  0.184031
		volcanoOctaves  3
		volcanoActivity 0.377768
		volcanoFlows    0.136825
		volcanoRadius   0.424989
		volcanoTemp     1835.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.37119
		stripeTwist     0
		cycloneMagn     2.5694
		cycloneFreq     1.16927
		cycloneDensity  0.193647
		cycloneOctaves  2
		colorSea       (0.831, 0.788, 0.905, 1.000)
		colorShelf     (0.666, 0.619, 0.666, 1.000)
		colorBeach     (0.857, 0.749, 0.796, 1.000)
		colorDesert    (0.784, 0.749, 0.905, 1.000)
		colorLowland   (0.332, 0.285, 0.300, 0.000)
		colorUpland    (0.611, 0.623, 0.745, 1.000)
		colorRock      (0.611, 0.623, 0.745, 1.000)
		colorSnow      (0.247, 0.235, 0.349, 1.000)
		colorLowPlants (0.674, 0.635, 0.768, 1.000)
		colorUpPlants  (0.674, 0.635, 0.768, 1.000)
		BumpHeight      17.2572
		DiffMapAlpha   "Ice"
		SpecBrightWater 1
		SpecBrightIce   1
		SpecularPower   150
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
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
		Pressure        0.8874
		Greenhouse      48.9315
		Bright          10
		Opacity         1
		SkyLight        3.333333
		Composition
		{
			N2    	77.951
			O2    	21.7233
			CO2   	0.258892
			H2O   	0.0497247
			Ar    	0.0170738
		}
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
