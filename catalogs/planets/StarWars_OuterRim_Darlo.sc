// http://starwars.wikia.com/wiki/Dagobah
// Region : Outer Rim
// Sector : Sluis Sector
// Grid location : M19
// X : 2460.87, Y : -14267.52, Z : -337.2718411166642
Planet	"Ness"
{
	ParentBody     "Darlo"
	Class          "Desert"

    Radius         6232      // Radius in km  
	Mass            0.7
    RotationPeriod  45        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.05     // Orbital period in years 
		SemiMajorAxis  0.4896
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Dagobah"
{
	ParentBody     "Darlo"
	Class	       "Terra"

	Mass            0.9234
	Radius          4450
	InertiaMoment   0.3314455

	Oblateness      0.02011874

	RotationPeriod  23
	RotationOffset  269.2099
	Obliquity       -2.195313
	EqAscendNode    269.6983

	Albedo          0.26
	Color          (0.738 0.603 0.595)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}

	Surface
	{
		Style           0.683656
		Randomize      (-0.514, -0.908, -0.718)
		colorDistMagn   0.05172634
		colorDistFreq   576.2198
		detailScale     18072.34
		colorConversion true
		drivenDarkening -1
		seaLevel        0.1111111
		snowLevel       0.9909271
		tropicLatitude  0.5749153
		icecapLatitude  10
		icecapHeight    0.2336271
		climatePole     0.45
		climateTropic   0.6984127
		climateEquator  0.45
		tropicWidth     0.5961905
		mainFreq        0.9108183
		venusFreq       0.8259138
		venusMagn       0
		mareFreq        5.421675
		mareDensity     0.01706513
		terraceProb     0.540899
		erosion         0.1170817
		montesMagn      0.1565344
		montesFreq      125.8035
		montesFraction  -0.5165958
		dunesMagn       0.07437452
		dunesFreq       51.25729
		dunesFraction   0.3309036
		hillsMagn       0.1132356
		hillsFreq       391.6493
		hillsFraction   -0.3309036
		hills2Fraction  0
		canyonsMagn     0.06051871
		canyonsFreq     109.8331
		canyonFraction  0.5165958
		cracksMagn      0.1145637
		cracksFreq      0.3113596
		cracksOctaves   1
		craterMagn      0.0720275
		craterFreq      8.383234
		craterDensity   0
		craterOctaves   1
		craterRayedFactor 0
		twistZones      2.039773
		twistMagn       0.960201
		cycloneMagn     4.03878
		cycloneFreq     0.5158418
		cycloneDensity  0.04512824
		cycloneOctaves  1
		colorSea       (0.105, 0.266, 0.203, 1.000)
		colorShelf     (0.105, 0.266, 0.203, 1.000)
		colorBeach     (0.427, 0.564, 0.486, 0.000)
		colorDesert    (0.427, 0.564, 0.486, 0.000)
		colorLowland   (0.211, 0.258, 0.203, 0.000)
		colorUpland    (0.149, 0.215, 0.141, 0.000)
		colorRock      (0.349, 0.380, 0.321, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.016)
		colorLowPlants (0.156, 0.211, 0.160, 0.000)
		colorUpPlants  (0.266, 0.368, 0.262, 0.000)
		BumpHeight      20
		BumpOffset      4
		DiffMapAlpha   "Water"
		SpecularBright  20
		SpecularPower   150
		DayAmbient      0.07
		Lommel          0
		Exposure        2
	}


	Clouds
	{
		Height          23.20117
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.428571
		mainOctaves     8
		Coverage        0.3
		twistZones      6.234271
		twistMagn       0
	}

	Clouds
	{
		Height          39.97998
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.428571
		mainOctaves     8
		Coverage        0.4
		twistZones      6.234271
		twistMagn       0
	}

	Ocean
	{
		Height          1.721191
		DayAmbient      2
		Lommel          0
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
	}

	Atmosphere
	{
		Model          "Earth"
		Height          153.96852
		Density         100
		Pressure        1.550516
		Greenhouse      92.33102
		Bright          10
		Opacity         1
		SkyLight        3.333333
	}

	NoRings         true
	
	Orbit
	{
		SemiMajorAxis   0.6821
		//Period          0.61209
		Eccentricity    0.0005060218
		Inclination     0.123
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Moon	"Dagobah 1"
{
	ParentBody     "Dagobah"

    Radius         1750      // Radius in km  
	Mass            0.3
    RotationPeriod  26        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.00173     // Orbital period in years 
		SemiMajorAxis  0.01841
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Undar"
{
	ParentBody     "Darlo"
	Class	       "Selena"

    Radius         2723      // Radius in km  
	Mass            0.7
    RotationPeriod  20        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         1.021     // Orbital period in years 
		SemiMajorAxis  0.9241
		Inclination    0.127
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Undar 1"
{
	ParentBody     "Undar"
	Class	       "Desert"

    Radius         971      // Radius in km  
	Mass            0.13
    RotationPeriod  20        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.0100     // Orbital period in years 
		SemiMajorAxis  0.001832
		Inclination    0.127
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Undar 2"
{
	ParentBody     "Undar"
	Class	       "Selena"

    Radius         2123      // Radius in km  
	Mass            0.397
    RotationPeriod  20        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.022     // Orbital period in years 
		SemiMajorAxis  0.002415
		Inclination    0.217
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Bubbok"
{
	ParentBody     "Darlo"
	Class	       "Titan"

    Radius         5288      // Radius in km  
	Mass            1.24
    RotationPeriod  20        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         5.3247     // Orbital period in years 
		SemiMajorAxis  1.379
		Inclination    0.127
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Bubbok 1"
{
	ParentBody     "Bubbok"
	Class	       "Desert"

    Radius         4121      // Radius in km  
	Mass            0.927
    RotationPeriod  20        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.001235     // Orbital period in years 
		SemiMajorAxis  0.0015
		Inclination    0.127
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Bubbok 2"
{
	ParentBody     "Bubbok"
	Class	       "Selena"

    Radius         1233      // Radius in km  
	Mass            0.312
    RotationPeriod  20        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.00032423     // Orbital period in years 
		SemiMajorAxis  0.0028
		Inclination    0.009
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

DwarfMoon	"Bubbok 3"
{
	ParentBody      "Bubbok"
	Albedo          0.0009
	Radius          202
	RotationOffset  282

	Orbit
	{
		//Period         0.000916255022
		SemiMajorAxis  0.00352321
		Eccentricity   0.0005
		Inclination    0.589
		AscendingNode  334.279
		ArgOfPericen   133.891
		MeanAnomaly    349.678
	}
}

Planet	"Sty"
{
	ParentBody     "Darlo"
	Class	       "IceGiant"

    Radius         42000      // Radius in km  
	Mass            235
    RotationPeriod  12        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         11.32     // Orbital period in years 
		SemiMajorAxis  1.8344
		Inclination    0.127
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}
