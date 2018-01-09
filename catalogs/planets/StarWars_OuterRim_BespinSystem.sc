// http://starwars.wikia.com/wiki/Bespin
// Region : Outer Rim
// Sector : Anoat Sector
// Grid location : K18
// X : -1429.96, Y : -12747.85, Z : 290.8022723685475
Planet	"Miser"
{
	ParentBody     "Bespin System"
	Class          "Selena"

    Radius          2562      // Radius in km  
	Mass            0.2
    RotationPeriod  72        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.32     // Orbital period in years 
		SemiMajorAxis  0.2824
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Orin"
{
	ParentBody     "Bespin System"
	Class          "Desert"

    Radius          5123      // Radius in km  
	Mass            1.1
    RotationPeriod  15        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.666     // Orbital period in years 
		SemiMajorAxis  0.451
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Bespin/Bespin Planet"
{
	ParentBody     "Bespin System"
	Class	       "GasGiant"

	Mass            261
	Radius          59000
	InertiaMoment   0.18513

	Oblateness      0.01963127

	RotationPeriod  12
	RotationOffset  269.2099
	Obliquity       -11.42976
	EqAscendNode    202.3225

	Albedo          0.5
	Color          (1.000 1.000 1.000)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}

	Surface
	{
		Style           0.5600444
		Randomize      (0.324, -0.555, -0.077)
		colorDistMagn   0.4379937
		colorDistFreq   0.4388849
		detailScale     397360.6
		colorConversion true
		tropicLatitude  0.9293503
		icecapLatitude  1
		climatePole     0.45
		climateTropic   0.45
		climateEquator  0.45
		tropicWidth     0.07
		mainFreq        0.0127034
		montesFraction  0
		hillsFraction   0
		hills2Fraction  0
		canyonFraction  0
		craterOctaves   0
		twistZones      3.35771
		twistMagn       0.6788751
		cycloneMagn     8.50192
		cycloneFreq     0.31174168
		cycloneDensity  0.2194422
		cycloneOctaves  1
		colorSea       (0.894, 0.572, 0.274, 1.000)
		colorShelf     (0.894, 0.572, 0.274, 1.000)
		colorBeach     (0.894, 0.572, 0.274, 1.000)
		colorDesert    (0.729, 0.360, 0.227, 1.000)
		colorLowland   (0.788, 0.447, 0.235, 1.000)
		colorUpland    (0.913, 0.631, 0.239, 1.000)
		colorRock      (0.815, 0.376, 0.231, 1.000)
		colorSnow      (0.576  0.325, 0.176, 1.000)
		colorLowPlants (0.839, 0.498, 0.235, 1.000)
		colorUpPlants  (0.839, 0.498, 0.235, 1.000)
		SpecularPower   150
		DayAmbient      1
		Lommel          0
		Exposure        2
	}

	Clouds
	{
		Height          100
		DayAmbient      1
		Lommel          0
		Exposure        2
		Color          (0.972 0.913 0.882 1.000)
		mainFreq        0.7207251
		mainOctaves     10
		Coverage        0.577473
		twistZones      6.35771
		twistMagn       0.9788751
	}

	NoOcean         true

	Atmosphere
	{
		Model          "Mars"
		Height          712.7199
		Density         2.425942e+008
		Pressure        2188530
		Bright          13
		Opacity         1
		SkyLight        3.333333
		
		Composition // values in percent
		{
			N2  77.7729
			O2  20.8625
			Ar  0.9303
			H2O 0.4000
			CO2 0.0398
		}
	}

	Aurora
	{
		Height      864.7172
		NorthLat    82.27219
		NorthLon    55.74376
		NorthRadius 14352.16
		NorthWidth  5122.647
		NorthRings  3
		NorthBright 1
		NorthParticles 50000
		SouthLat    -82.97605
		SouthLon    227.4492
		SouthRadius 14977.43
		SouthWidth  5210.769
		SouthRings  3
		SouthBright 1
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings			true

	NoCometTail     true

	Orbit
	{
		SemiMajorAxis   0.921
		//Period          1.1
		Eccentricity    0
		Inclination     351.8819
		AscendingNode   325.7146
		ArgOfPericenter 189.6115
		MeanAnomaly     141.9982
		RefPlane       "Ecliptic"
	}
}

Moon	"H'gaard"
{
	ParentBody     "Bespin Planet"
	Class          "IceWorld"

    Radius          2500      // Radius in km  
	Mass            0.4023
    RotationPeriod  36        // Rotation period in hours 

	Surface
	{
		Style           0.5600444
		Randomize      (0.324, -0.555, -0.077)
		colorDistMagn   0.4379937
		colorDistFreq   0.4388849
		detailScale     397360.6
		colorConversion true
		tropicLatitude  0.9293503
		icecapLatitude  1
		climatePole     0.45
		climateTropic   0.45
		climateEquator  0.45
		tropicWidth     0.07
		mainFreq        0.0127034
		montesFraction  0
		hillsFraction   0
		hills2Fraction  0
		canyonFraction  0
		craterOctaves   0
		twistZones      3.35771
		twistMagn       0.6788751
		cycloneMagn     8.50192
		cycloneFreq     0.31174168
		cycloneDensity  0.2194422
		cycloneOctaves  1
		colorSea       (0.678, 0.933, 0.568, 1.000)
		colorShelf     (0.678, 0.933, 0.568, 1.000)
		colorBeach     (0.749, 0.933, 0.666, 1.000)
		colorDesert    (0.749, 0.933, 0.666, 1.000)
		colorLowland   (0.474, 0.650, 0.396, 1.000)
		colorUpland    (0.474, 0.650, 0.396, 1.000)
		colorRock      (0.262, 0.564, 0.137, 1.000)
		colorSnow      (0.262, 0.564, 0.137, 1.000)
		colorLowPlants (0.678, 0.933, 0.568, 1.000)
		colorUpPlants  (0.678, 0.933, 0.568, 1.000)
		SpecularPower   150
		DayAmbient      1
		Lommel          0
		Exposure        2
	}

	NoClouds	true
	NoOcean         true

	Atmosphere
	{
		Model          "Greenworld"
		Height          98
		Density         0.3
		Pressure        0.22
		Greenhouse      92.33102
		Bright          3
		Opacity         1
		SkyLight        3.333333
	}

	NoAurora        true

	NoRings			true

	NoCometTail     true

	Orbit
	{
		Epoch          2454762
        //Period         0.12     // Orbital period in years 
		SemiMajorAxis  0.01916
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Drudonna"
{
	ParentBody     "Bespin Planet"
	Class          "Selena"

    Radius          1250      // Radius in km  
	Mass            0.1
    RotationPeriod  10        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.22     // Orbital period in years 
		SemiMajorAxis  0.02516
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

DwarfMoon	"Bespin 3"
{
	ParentBody      "Bespin Planet"
	Albedo          0.0081
	Radius          74
	RotationOffset  282

	Orbit
	{
		//Period         0.000916255022
		SemiMajorAxis  0.02810
		Eccentricity   0.0006
		Inclination    0.812
		AscendingNode  334.279
		ArgOfPericen   133.891
		MeanAnomaly    349.678
	}
}

DwarfMoon	"Bespin 4"
{
	ParentBody      "Bespin Planet"
	Albedo          0.0081
	Radius          261
	RotationOffset  282

	Orbit
	{
		//Period         0.000216255022
		SemiMajorAxis  0.03212
		Eccentricity   0.0004
		Inclination    0.589
		AscendingNode  334.279
		ArgOfPericen   133.891
		MeanAnomaly    349.678
	}
}

DwarfMoon	"Bespin 5"
{
	ParentBody      "Bespin Planet"
	Albedo          0.0081
	Radius          5
	RotationOffset  282

	Orbit
	{
		//Period         0.0015
		SemiMajorAxis  0.03521
		Eccentricity   0.0004
		Inclination    0.03
		AscendingNode  334.279
		ArgOfPericen   133.891
		MeanAnomaly    349.678
	}
}
