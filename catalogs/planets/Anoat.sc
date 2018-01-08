Planet	"Kyood's World"
{
	ParentBody     "Anoat System"
	Class          "Selena"

    Radius         1234      // Radius in km  
	Mass            0.162
    RotationPeriod  55        // Rotation period in hours 

	NoAtmosphere	true

	Orbit
	{
		Epoch          2454762
		//Period         0.22     // Orbital period in years 
		SemiMajorAxis  0.2313
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Vinza"
{
	ParentBody     "Anoat System"
	Class          "Desert"

    Radius         2812      // Radius in km  
	Mass            0.454
    RotationPeriod  64        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.46     // Orbital period in years 
		SemiMajorAxis  0.4834
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Gentes"
{
	ParentBody     "Anoat System"
	Class          "Terra"

    Radius         4124      // Radius in km  
	Mass            0.6321
    RotationPeriod  14        // Rotation period in hours 

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
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
		Epoch          2454762
		//Period         0.84     // Orbital period in years 
		SemiMajorAxis  0.7232
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Belsus"
{
	ParentBody     "Gentes"
	Class          "Desert"

    Radius         1632      // Radius in km  
	Mass            0.3321
    RotationPeriod  7        // Rotation period in hours 

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
		Epoch          2454762
		//Period         0.00212     // Orbital period in years 
		SemiMajorAxis  0.002015
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Anoat/Anoat Planet"
{
	ParentBody     "Anoat System"
	Class	       "Terra"

	Mass            0.7195672
	Radius          4250
	InertiaMoment   0.3314455

	Oblateness      0.01011874

	RotationPeriod  17
	RotationOffset  269.2099
	Obliquity       -2.195313
	EqAscendNode    360.6983

	Albedo          0.26
	Color          (0.709 0.776 0.839)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}

	Surface
	{
		Style           0.683656
		Randomize      (-0.872, -0.643, -0.705)
		colorDistMagn   0.065
		colorDistFreq   383.231
		detailScale     18072.34
		colorConversion true
		drivenDarkening -1
		seaLevel        5.141
		snowLevel       0.991
		tropicLatitude  0.000
		icecapLatitude  40
		icecapHeight    0.467
		climatePole     1.000
		climateTropic   0.450
		climateEquator  0.625
		tropicWidth     0.070
		mainFreq        1.016
		venusFreq       1.519
		venusMagn       0
		mareFreq        1.016
		mareDensity     0.012
		terraceProb     0.529
		erosion         0.131
		montesMagn      0.205
		montesFreq      174.801
		montesFraction  0.367
		dunesMagn       0.032
		dunesFreq       40.305
		dunesFraction   0.834
		hillsMagn       0.149
		hillsFreq       284.095
		hillsFraction   0.291
		hills2Fraction  0.944
		canyonsMagn     0.025
		canyonsFreq     90.651
		canyonFraction  0.118
		cracksMagn      0.094
		cracksFreq      0.339
		cracksOctaves   1
		craterMagn      0.649
		craterFreq      8.285
		craterDensity   0.014
		craterOctaves   4.000
		craterRayedFactor 0
		twistZones      4.775
		twistMagn       1.613
		cycloneMagn     2.667
		cycloneFreq     0.529
		cycloneDensity  0.059
		cycloneOctaves  1
		colorSea       (0.709, 0.776, 0.839, 1.000)
		colorShelf     (0.709, 0.776, 0.839, 1.000)
		colorBeach     (0.862, 0.807, 0.686, 0.000)
		colorDesert    (0.862, 0.807, 0.686, 0.000)
		colorLowland   (0.713, 0.819, 0.839, 0.000)
		colorUpland    (0.729, 0.819, 0.756, 0.000)
		colorRock      (0.862, 0.807, 0.686, 0.000)
		colorSnow      (0.929, 0.941, 1.000, 0.016)
		colorLowPlants (0.576, 0.768, 0.654, 0.000)
		colorUpPlants  (0.725, 0.890, 0.737, 0.000)
		BumpHeight      25
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
		Height          15.45703
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.925863
		mainOctaves     10
		Coverage        0.312
		twistZones      2.039773
		twistMagn       0.960201
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
		Height          70.96852
		Density         100
		Pressure        1.550516
		Greenhouse      92.33102
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

	NoRings         true
	
	Orbit
	{
		SemiMajorAxis   1.00321
		//Period          0.6023
		Eccentricity    0.0005060218
		Inclination     68.1317737
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Moon	"Anoat 1"
{
	ParentBody     "Anoat Planet"

    Radius         554      // Radius in km  
	Mass            0.119
    RotationPeriod  22        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.00195     // Orbital period in years 
		SemiMajorAxis  0.002015
		Inclination    0.155
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Deyer"
{
	ParentBody     "Anoat System"
	Class          "Oceania"

    Radius         4124      // Radius in km  
	Mass            0.6321
    RotationPeriod  28        // Rotation period in hours 

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine"
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
		Epoch          2454762
		//Period         1.0650467     // Orbital period in years 
		SemiMajorAxis  1.413
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Pujool"
{
	ParentBody     "Anoat System"
	Class          "IceGiant"

    Radius         49000      // Radius in km  
	Mass            185
    RotationPeriod  21        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         12     // Orbital period in years 
		SemiMajorAxis  1.619
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

DwarfMoon	"Pujool 1"
{
	ParentBody      "Pujool"
	Albedo          0.0014
	Radius          69
	RotationOffset  282

	Orbit
	{
		//Period         0.00113421
		SemiMajorAxis  0.001723
		Eccentricity   0.0002
		Inclination    0.731
		AscendingNode  334.279
		ArgOfPericen   133.891
		MeanAnomaly    349.678
	}
}

DwarfMoon	"Pujool 2"
{
	ParentBody      "Pujool"
	Albedo          0.0014
	Radius          33
	RotationOffset  282

	Orbit
	{
		//Period         0.00153421
		SemiMajorAxis  0.00199203
		Eccentricity   0.0002
		Inclination    0.731
		AscendingNode  334.279
		ArgOfPericen   133.891
		MeanAnomaly    349.678
	}
}

DwarfMoon	"Pujool 3"
{
	ParentBody      "Pujool"
	Albedo          0.0949
	Radius          241
	RotationOffset  282

	Orbit
	{
		//Period         0.00153421
		SemiMajorAxis  0.0022142003
		Eccentricity   0.0002
		Inclination    0.731
		AscendingNode  334.279
		ArgOfPericen   133.891
		MeanAnomaly    349.678
	}
}

Moon	"Pujool 4"
{
	ParentBody     "Pujool"
	Class          "Selena"

    Radius         448      // Radius in km  
	Mass            0.1321
    RotationPeriod  24        // Rotation period in hours 

	NoAtmosphere	true

	Orbit
	{
		Epoch          2454762
		//Period         0.002443     // Orbital period in years 
		SemiMajorAxis  0.002821
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Pujool 5"
{
	ParentBody     "Pujool"
	Class          "Desert"

    Radius         1037      // Radius in km  
	Mass            0.421
    RotationPeriod  24        // Rotation period in hours 

	NoAtmosphere	true

	Orbit
	{
		Epoch          2454762
		//Period         0.002543     // Orbital period in years 
		SemiMajorAxis  0.003421
		Inclination    132.322
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

DwarfMoon	"Pujool 6"
{
	ParentBody      "Pujool"
	Albedo          0.0212
	Radius          25
	RotationOffset  282

	Orbit
	{
		//Period         0.00123421
		SemiMajorAxis  0.00375109
		Eccentricity   0.00098
		Inclination    12.42
		AscendingNode  334.279
		ArgOfPericen   133.891
		MeanAnomaly    349.678
	}
}
