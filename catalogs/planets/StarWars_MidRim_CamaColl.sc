// http://starwars.wikia.com/wiki/Boz_Pity
// Region : Mid Rim
// Sector : Halla Sector
// Grid location : S9
// X : 10564.2, Y : 897.09, Z : 557.5383785703177
Planet	"Bruss"
{
	ParentBody     "Cama Coll"
	Class          "Selena"

    Radius          2153      // Radius in km  
	Mass            0.34
    RotationPeriod  45        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.591632     // Orbital period in years 
		SemiMajorAxis  2.324
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Barycenter	"Boz Pity-Mourn"
{
	ParentBody     "Cama Coll"
	Orbit
	{
		//SemiMajorAxis   1.4612
		Period          4.8845610958904	// 778 local days
		Eccentricity    0.005
		Inclination     0.0
		AscendingNode   0
		ArgOfPericen    117.2
		MeanAnomaly     236.5
	}
}

Planet    "Boz Pity"
{ 
     ParentBody      "Boz Pity-Mourn"
     Class           "Terra"

     Radius          5216
     Mass            0.93
     Oblateness      0.0

     Albedo          0.32                   // Albedo 
     Color          (0.768, 0.898, 1.000 )  // Color of a particle 

     RotationPeriod  55        // Rotation period in hours 
     RotationOffset  243.455
     RotationEpoch   2451545.0
     Obliquity       16.58
     EqAscendNode    345.648 
     Precession      12500       // Precession period in years 

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}
      
 	Surface
	{
		Preset         "terra_wet_earth_green.cfg"
		SurfStyle       0.675
		Randomize      (0.395, 0.281, 0.764)
		colorDistMagn   0.076
		colorDistFreq   1291.6
		detailScale     37490
		drivenDarkening 0
		seaLevel        0.3
		snowLevel       1.1298
		tropicLatitude  0.302
		icecapLatitude  2
		icecapHeight    0.659
		climatePole     1
		climateTropic   0.508
		climateEquator  0.625
		climateSteppeMin 0.3125
		climateSteppeMax 0.5625
		climateForestMin 0.5
		climateForestMax 0.6875
		climateGrassMin  0.625
		climateGrassMax  0.8125
		humidity        1
		heightTempGrad  0.4295
		beachWidth      0.0010638
		tropicWidth     1
		mainFreq        1.7939
		venusFreq       0.919
		venusMagn       0
		mareFreq        0.029218
		mareDensity     0.69466
		terraceProb     0.41012
		erosion         0.10639
		montesMagn      0.208
		montesFreq      453.83
		montesSpiky     0.93353
		montesFraction  0.57954
		dunesMagn       0.063
		dunesFreq       72.704
		dunesFraction   0.23756
		hillsMagn       0.23
		hillsFreq       727.18
		hillsFraction   0.81365
		hills2Fraction  0.49117
		riversMagn      71.677
		riversFreq      3.1618
		riversSin       6.1702
		riftsMagn       0
		riftsFreq       3.0697
		riftsSin        6.7263
		canyonsMagn     0.15267
		canyonsFreq     213.74
		canyonsFraction 0.90887
		cracksMagn      0.065
		cracksFreq      0.563
		cracksOctaves   0
		craterMagn      0.827
		craterFreq      23.333
		craterDensity   0
		craterOctaves   4
		craterRayedFactor 0
		volcanoMagn     0.72078
		volcanoFreq     0.62416
		volcanoDensity  0.30473
		volcanoOctaves  3
		volcanoActivity 0.35649
		volcanoFlows    0.67518
		volcanoRadius   0.45985
		volcanoTemp     378.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.9316
		stripeTwist     0.20402
		cycloneMagn     2.041
		cycloneFreq     0.651
		cycloneDensity  0.031
		cycloneOctaves  2
		BumpHeight      14.114
		BumpOffset      2.823
		DiffMapAlpha   "Water"
		SpecBrightWater 2
		SpecBrightIce   2
		RoughnessWater  0.25463
		RoughnessIce    0.25463
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      1.6307
		SpotWidth       0.05
		DayAmbient      0.1
	}

	Ocean
	{
		Depth           4.2341
		Hapke           0
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      2
		ModulateBright  1
	}

	Clouds
	{
		Height          6.2998
		Velocity        75
		BumpHeight      0.5
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      2
		ModulateBright  1
		mainFreq        0.9
		mainOctaves     10
		Coverage        0.1
		stripeZones     2.9316
		stripeTwist     0.20402
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          80
		Density         1.83
		Pressure        1.2
		Greenhouse      26.0197
		Bright          10
		Opacity         1
		SkyLight        1
		Hue             0
		Saturation      1

		Composition
		{
			N2        	77.773
			O2        	20.862
			Ar        	0.9303
			H2O       	0.4
			CO2       	0.0398
		}
	}

	Aurora
	{
		Height         51.49
		NorthLat       67.298
		NorthLon       -3.1784
		NorthRadius    1482.5
		NorthWidth     511.6
		NorthRings     4
		NorthBright    0.3
		NorthFlashFreq 76.588
		NorthMoveSpeed 0.59446
		NorthParticles 50000
		SouthLat       -55.577
		SouthLon       -178.95
		SouthRadius    1166.5
		SouthWidth     324.51
		SouthRings     3
		SouthBright    0.3
		SouthFlashFreq 73.968
		SouthMoveSpeed 1.3766
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		// 493000/2 km with mass ratio 0.84:0.98
		SemiMajorAxis   0.0015206
		//Period          0.0772	// 28.2 days
		Eccentricity    0.02	// no data
		Inclination     24.5	// no data
		AscendingNode   28.6	// no data
		ArgOfPericen    68.5	// no data
		MeanAnomaly     233.2	// no data
	}
}

Planet	"Mourn"
{
	ParentBody     "Boz Pity-Mourn"
	Class          "Terra"

    Radius          5136      // Radius in km  
	Mass            0.34
    RotationPeriod  53        // Rotation period in hours 

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}
	
	Atmosphere
	{
		Composition // values in percent
		{
			N2  77.7729
			O2  20.8625
			Ar  0.9303
			H2O 0.4000
			CO2 0.0398
		}
	}

	Orbit
	{
		// 493000/2 km with mass ratio 0.84:0.98
		SemiMajorAxis   0.0017745
		//Period          0.0772	// 28.2 days
		Eccentricity    0.02	// no data
		Inclination     24.5	// no data
		AscendingNode   28.6	// no data
		ArgOfPericen    248.5	// no data
		MeanAnomaly     233.2	// no data
	}
}

Planet	"Pine"
{
	ParentBody     "Cama Coll"
	Class          "Selena"

    Radius          3245      // Radius in km  
	Mass            0.34
    RotationPeriod  67        // Rotation period in hours 

	NoAtmosphere    true

	Orbit
	{
		Epoch          2454762
		//Period         4.3202     // Orbital period in years 
		SemiMajorAxis  4.616
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Nyss"
{
	ParentBody     "Cama Coll"
	Class          "IceWorld"

    Radius         4280      // Radius in km  
	Mass            0.34
    RotationPeriod  67        // Rotation period in hours 

	NoAtmosphere    true

	NoClouds        true

	Orbit
	{
		Epoch          2454762
		//Period         7.322     // Orbital period in years 
		SemiMajorAxis  6.913
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}
