// http://starwars.wikia.com/wiki/Endor
// Region : Outer Rim
// Sector : Zuma/Moddell Sector
// Grid location : H16
// X : -5148.29, Y : -10245.37, Z : 44.071762501709145
Planet	"Endor"
{
	ParentBody     "Ibleam"
	Class	       "GasGiant"

	Mass            661.8007
	Radius          74000
	InertiaMoment   0.18513

	Oblateness      0.02788417

	RotationPeriod  30
	RotationOffset  269.2099
	Obliquity       -11.42976
	EqAscendNode    202.3225

	Albedo          0.5
	Color          (1.000 1.000 1.000)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Floaters"
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
		twistZones      6.35771
		twistMagn       0.9788751
		cycloneMagn     12.50192
		cycloneFreq     0.2994168
		cycloneDensity  0.1194422
		cycloneOctaves  1
		colorSea       (0.819, 0.964, 0.937, 1.000)
		colorShelf     (0.819, 0.964, 0.937, 1.000)
		colorBeach     (0.352, 0.470, 0.470, 1.000)
		colorDesert    (0.352, 0.470, 0.470, 1.000)
		colorLowland   (0.564, 0.701, 0.678, 1.000)
		colorUpland   (0.564, 0.701, 0.678, 1.000)
		colorRock      (0.819, 0.964, 0.937, 1.000)
		colorSnow      (0.352, 0.470, 0.470, 1.000)
		colorLowPlants (0.164, 0.235, 0.235, 1.000)
		colorUpPlants (0.164, 0.235, 0.235, 1.000)
		SpecularPower   150
		DayAmbient      1
		Lommel          0
		Exposure        2
	}

	Clouds
	{
		Height          432.5781
		DayAmbient      1
		Lommel          0
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        0.7207251
		mainOctaves     10
		Coverage        0.577473
		twistZones      6.35771
		twistMagn       0.9788751
	}

	NoOcean         true

	Atmosphere
	{
		Model          "Earth"
		Height          540.7199
		Density         2.425942e+008
		Pressure        2188530
		Bright          10
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
		Height      734.7172
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
		SemiMajorAxis   0.821
		//Period          1.1
		Eccentricity    0
		Inclination     351.8819
		AscendingNode   325.7146
		ArgOfPericenter 189.6115
		MeanAnomaly     141.9982
		RefPlane       "Ecliptic"
	}
}

DwarfMoon	"Endor 1"
{
	ParentBody      "Endor"
	Albedo          0.0009
	Radius          74
	RotationOffset  282

	Orbit
	{
		//Period         0.000916255022
		SemiMajorAxis  0.0008111096256
		Eccentricity   0.0002
		Inclination    0.589
		AscendingNode  334.279
		ArgOfPericen   133.891
		MeanAnomaly    349.678
	}
}

DwarfMoon	"Endor 2"
{
	ParentBody      "Endor"
	Albedo          0.0051
	Radius          100
	RotationOffset  282

	Orbit
	{
		//Period         0.000916255022
		SemiMajorAxis  0.0012911096256
		Eccentricity   0.0002
		Inclination    0.589
		AscendingNode  334.279
		ArgOfPericen   133.891
		MeanAnomaly    349.678
	}
}

DwarfMoon	"Endor 3"
{
	ParentBody      "Endor"
	Albedo          0.0081
	Radius          74
	RotationOffset  282

	Orbit
	{
		//Period         0.000916255022
		SemiMajorAxis  0.0025511096256
		Eccentricity   0.0002
		Inclination    0.589
		AscendingNode  334.279
		ArgOfPericen   133.891
		MeanAnomaly    349.678
	}
}

Moon	"Endor 4/Forest moon of Endor/Sanctuary Moon"
{
	ParentBody     "Endor"
	Class	       "Terra"

	Mass            0.7195672
	Radius          2450
	InertiaMoment   0.3314455

	Oblateness      0.01011874

	RotationPeriod  18
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
		seaLevel        0.333333
		snowLevel       1
		tropicLatitude  0.206349
		icecapLatitude  0.84746
		climatePole     1
		climateTropic   0.603175
		climateEquator  0.31746
		heightTempGrad  0
		tropicWidth     0.301587
		mainFreq        2.18254
		mareFreq		0
		mareDensity		0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		cycloneMagn     0
		cycloneFreq     0
		cycloneDensity  0
		cycloneOctaves  0
		colorSea       (0.086, 0.114, 0.278, 1.000)
		colorBeach     (0.910, 0.867, 0.725, 0.000)
		colorLowPlants (0.212, 0.282, 0.298, 0.000)
		colorUpPlants  (0.153, 0.231, 0.259, 0.075)
	}

	Ocean
	{
		Height          3.0188
	}

	Atmosphere
	{
		Model          "Earth"
		Height          70.96852
		Density         100
		Pressure        1.550516
		Greenhouse      92.33102
		Bright          5
		Opacity         1
		
		Composition // values in percent
		{
			N2  77.7729
			O2  20.8625
			Ar  0.9303
			H2O 0.4000
			CO2 0.0398
		}
	}

	NoRings         true
	
	Orbit
	{
		SemiMajorAxis   0.0112
		//Period          1.1
		Eccentricity    0.0005060218
		Inclination     0.7317737
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Moon	"Endor 5/Sistermoon"
{
	ParentBody     "Endor"
	Class          "Selena"

    Radius         3282      // Radius in km  
	Mass            0.3
    RotationPeriod  27        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.22     // Orbital period in years 
		SemiMajorAxis  0.01416
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Endor 6"
{
	ParentBody     "Endor"
	Class          "Desert"

    Radius         5211      // Radius in km  
	Mass            1.2
    RotationPeriod  40        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         3     // Orbital period in years 
		SemiMajorAxis  0.030
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Endor 7"
{
	ParentBody     "Endor"
	Class          "Desert"

    Radius         2411      // Radius in km  
	Mass            1.2
    RotationPeriod  40        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         3     // Orbital period in years 
		SemiMajorAxis  0.0510
		Inclination    0.2
		Eccentricity   0.05
		ArgOfPericen   9.2
	}
}

DwarfMoon	"Endor 8"
{
	ParentBody      "Endor"
	Albedo          0.11
	Radius          81
	RotationOffset  282

	Orbit
	{
		//Period         0.000916255022
		SemiMajorAxis  0.0310
		Eccentricity   0.0002
		Inclination    0.932
		AscendingNode  334.279
		ArgOfPericen   133.891
		MeanAnomaly    349.678
	}
}

DwarfMoon	"Endor 9"
{
	ParentBody      "Endor"
	Albedo          0.0020
	Radius          31
	RotationOffset  282

	Orbit
	{
		//Period         0.000916255022
		SemiMajorAxis  0.0350
		Eccentricity   0.0009
		Inclination    0.932
		AscendingNode  334.279
		ArgOfPericen   133.891
		MeanAnomaly    349.678
	}
}

Planet	"Eloggi"
{
	ParentBody     "Ibleam"
	Class          "IceWorld"

    Radius         5213      // Radius in km  
	Mass            0.89
    RotationPeriod  89        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         4     // Orbital period in years 
		SemiMajorAxis  1.421
		Inclination    0.2
		Eccentricity   0.05
		ArgOfPericen   9.2
	}
}

Planet	"Meggido"
{
	ParentBody     "Ibleam"
	Class          "IceWorld"

    Radius         1423      // Radius in km  
	Mass            0.63
    RotationPeriod  30        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         4     // Orbital period in years 
		SemiMajorAxis  2
		Inclination    0.2
		Eccentricity   0.05
		ArgOfPericen   9.2
	}
}

Planet	"Dor"
{
	ParentBody     "Ibleam"
	Class          "IceWorld"

    Radius         8712      // Radius in km  
	Mass            3.21
    RotationPeriod  72        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         7.21    // Orbital period in years 
		SemiMajorAxis  2.9412
		Inclination    0.2
		Eccentricity   0.05
		ArgOfPericen   9.2
	}
}
