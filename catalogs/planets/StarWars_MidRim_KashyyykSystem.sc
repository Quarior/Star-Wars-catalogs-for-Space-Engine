// http://starwars.wikia.com/wiki/Kashyyyk
// Region : Mid Rim
// Sector : Mytaranor Sector
// Grid location : P9
// X : 7087.76, Y : 167.46, Z : -427.3491654564043
Planet	"Taakarroo"
{
	ParentBody     "Kashyyyk System"
	Class	       "Selena"

	Mass            0.15
	Radius          1285.5
	InertiaMoment   0.3975344

	Albedo          0.3
	Color          (1.000 1.000 1.000)
	
	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Orbit
	{
		SemiMajorAxis   0.251
		//Period          0.24
		Eccentricity    0.004
		Inclination     0.24555
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Taakarroo 1"
{
	ParentBody     "Taakarroo"
	Class	       "Asteroid"

	Mass            3.194917e-006
	Radius          77.16425
	InertiaMoment   0.3983172

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.000381021466
		//Period          0.00958268243
		Eccentricity    0.0001060218
		Inclination     20.3485
		AscendingNode   340.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Planet	"Kallalarra"
{
	ParentBody     "Kashyyyk System"
	Class	       "Desert"

	Mass            0.765
	Radius          4685
	InertiaMoment   0.3975344

	Albedo          0.5
	Color          (1.000 1.000 1.000)
	
	Atmosphere
	{
		Greenhouse	175
	}
	
	NoAurora			true

	Orbit
	{
		SemiMajorAxis   0.573
		//Period          0.694
		Eccentricity    0.002
		Inclination     0.8563
		AscendingNode   340.4993
		ArgOfPericenter 25.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Kallalarra 1"
{
	ParentBody     "Kallalarra"
	Class	       "Asteroid"

	Mass            4.194917e-006
	Radius          53.16425
	InertiaMoment   0.3983172

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.000556244548
		//Period          0.0116361144
		Eccentricity    0.00065
		Inclination     2.3485
		AscendingNode   340.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Kallalarra 2"
{
	ParentBody     "Kallalarra"
	Class	       "Asteroid"

	Mass            1.694917e-006
	Radius          20.16425
	InertiaMoment   0.3983172

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.000677950826
		//Period          0.0116361144
		Eccentricity    0.00035
		Inclination     9.3485
		AscendingNode   340.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Kallalarra 3"
{
	ParentBody     "Kallalarra"
	Class	       "Selena"

	Mass            0.003504
	Radius          295
	InertiaMoment   0.3983172

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.35
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.000842086184
		//Period          0.0186361144
		Eccentricity    0.00025
		Inclination     34.3485
		AscendingNode   335.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Planet	"Kashyyyk/Kashyyyk Planet"
{
	ParentBody     "Kashyyyk System"
	Class          "Terra"

    Radius          6382.5      // Radius in km  
	Mass            0.743
    RotationPeriod  26        // Rotation period in hours 

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		tropicLatitude  0.1825397
		icecapLatitude  85
		icecapHeight    0.1430
		climatePole     0.45
		climateTropic   0.45
		climateEquator  0.45
		tropicWidth     0.07
		seaLevel        0.600
		colorSea       (0.305, 0.462, 0.560, 0.850)
		colorShelf     (0.690, 0.827, 0.800, 1.000)
		colorBeach     (0.580, 0.584, 0.560, 1.000)
		colorDesert    (0.415, 0.580, 0.533, 0.900)
		colorLowland   (0.447, 0.549, 0.329, 1.000)
		colorUpland    (0.290, 0.403, 0.172, 1.000)
		colorRock      (0.349, 0.341, 0.317, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		colorLowPlants (0.439, 0.623, 0.415, 0.900)
		colorUpPlants  (0.537, 0.705, 0.478, 0.800)
	}

	Clouds
	{
		Height          41.97998
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.428571
		mainOctaves     8
		Coverage        0.1716667
		twistZones      4.234271
		twistMagn       0
	}

	Atmosphere
	{
		Model          "Earth"
		Height          144.78
		Density         100
		Pressure        0.976
		Greenhouse      25.76289
		Bright          10.27619
		Opacity         1
		SkyLight        2.301587
		
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
		SemiMajorAxis  0.85455
        //Period         1.184651     // Orbital period in years 
		Inclination    0.0889
		Eccentricity   0.02
		ArgOfPericen   9.2
	}
}

Moon	"Kashyyyk 1/Wookiee Colony 1"
{
	ParentBody     "Kashyyyk Planet"
	Class          "Terra"

    Radius          4324      // Radius in km  
	Mass            0.6121
    RotationPeriod  26        // Rotation period in hours 

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Atmosphere
	{
		Greenhouse	21
		
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
        //Period         0.00889820511     // Orbital period in years 
		SemiMajorAxis  0.000843413924
		Inclination    0.1
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Kashyyyk 2/Wookiee Colony 2"
{
	ParentBody     "Kashyyyk Planet"
	Class          "Terra"

    Radius          3765      // Radius in km  
	Mass            0.4921
    RotationPeriod  26        // Rotation period in hours 

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Atmosphere
	{
		Greenhouse	17.5
		
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
        //Period         0.01289820511     // Orbital period in years 
		SemiMajorAxis  0.000965116419
		Inclination    0.2
		Eccentricity   0.04
		ArgOfPericen   9.2
	}
}

DwarfMoon	"Kashyyyk 3"
{
	ParentBody     "Kashyyyk Planet"
	Class	       "Selena"

	Mass            0.07504
	Radius          575
	InertiaMoment   0.3983172

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.35
	Color          (1.000 1.000 1.000)

	NoClouds	true

	NoAtmosphere	true

	NoAurora	true

	Orbit
	{
		SemiMajorAxis   0.00103195319
		//Period          0.0176595148
		Eccentricity    0.00065
		Inclination     15
		ArgOfPericenter 5.2
		MeanAnomaly     140.8083
		RefPlane       "Equator"
	}
}

Planet	"Trandosha/Dosha/Hsskhor"
{
	ParentBody     "Kashyyyk System"
	Class          "Terra"

    Radius          6935.25      // Radius in km  
	Mass            0.843
    RotationPeriod  25        // Rotation period in hours 

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}

	Surface
	{
		tropicLatitude  0.1825397
		icecapLatitude  85
		icecapHeight    0.1430
		climatePole     0.45
		climateTropic   0.45
		climateEquator  0.45
		tropicWidth     0.07
		seaLevel        0.500
		colorSea       (0.305, 0.462, 0.560, 0.850)
		colorShelf     (0.690, 0.827, 0.800, 1.000)
		colorBeach     (0.580, 0.584, 0.560, 1.000)
		colorDesert    (0.415, 0.580, 0.533, 1.000)
		colorLowland   (0.235, 0.254, 0.172, 1.000)
		colorUpland    (0.223, 0.239, 0.176, 1.000)
		colorRock      (0.349, 0.341, 0.317, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		colorLowPlants (0.235, 0.254, 0.172, 1.000)
		colorUpPlants  (0.223, 0.239, 0.176, 1.000)
	}

	Clouds
	{
		Height          37.5
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (0.745 0.760 0.654 1.000)
		mainFreq        1.728571
		mainOctaves     9
		Coverage        0.1716667
		twistZones      9.234271
		twistMagn       2.5
	}

	Atmosphere
	{
		Model          "Greenworld"
		Height          152.78
		Density         100
		Pressure        0.976
		Greenhouse      53.76289
		Bright          9.27619
		Opacity         1
		SkyLight        2.301587
		
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
		SemiMajorAxis  1.1544
        //Period         1.584651     // Orbital period in years 
		Inclination    0.0589
		Eccentricity   0.04
		ArgOfPericen   1.2
	}
}

Moon	"Akoshisss"
{
	ParentBody     "Trandosha"
	Class	       "Desert"

	Mass            0.64
	Radius          3285.5
	InertiaMoment   0.3975344

	Albedo          0.3
	Color          (1.000 1.000 1.000)
	
	NoAurora		true

	Surface
	{
		colorSea       (0.360, 0.260, 0.270, 0.000)

		colorShelf     (0.260, 0.220, 0.270, 0.000)

		colorBeach     (0.850, 0.740, 0.550, 0.000)

		colorDesert    (0.770, 0.670, 0.470, 0.000)

		colorLowland   (0.440, 0.290, 0.170, 0.000)

		colorUpland    (0.640, 0.570, 0.470, 0.000)

		colorRock      (0.220, 0.200, 0.200, 0.000)

		colorSnow      (1.000, 1.000, 1.000, 1.000)

		colorLowPlants (0.440, 0.290, 0.170, 0.000)

		colorUpPlants  (0.640, 0.570, 0.470, 0.000)

	}

	Orbit
	{
		SemiMajorAxis   0.00102608412
		//Period          0.0164274556
		Eccentricity    0.002
		Inclination     0.44555
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Moon	"Wasskah"
{
	ParentBody     "Trandosha"
	Class          "Terra"

    Radius          3242      // Radius in km  
	Mass            0.443
    RotationPeriod  25        // Rotation period in hours 

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}

	Surface
	{
		Randomize      (-0.472, -0.143, -0.505)
		tropicLatitude  0.1825397
		icecapLatitude  85
		icecapHeight    0.1430
		climatePole     0.45
		climateTropic   0.45
		climateEquator  0.45
		tropicWidth     0.07
		seaLevel        0.200
		colorSea       (0.305, 0.462, 0.560, 0.850)
		colorShelf     (0.690, 0.827, 0.800, 1.000)
		colorBeach     (0.580, 0.584, 0.560, 1.000)
		colorDesert    (0.415, 0.580, 0.533, 1.000)
		colorLowland   (0.235, 0.254, 0.172, 1.000)
		colorUpland    (0.223, 0.239, 0.176, 1.000)
		colorRock      (0.349, 0.341, 0.317, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		colorLowPlants (0.235, 0.254, 0.172, 1.000)
		colorUpPlants  (0.223, 0.239, 0.176, 1.000)
	}

	Clouds
	{
		Height          37.5
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.728571
		mainOctaves     9
		Coverage        0.1716667
		twistZones      9.234271
		twistMagn       2.5
	}

	Atmosphere
	{
		Model          "Greenworld"
		Height          95.78
		Density         100
		Pressure        0.976
		Greenhouse      53.76289
		Bright          10.27619
		Opacity         1
		SkyLight        2.301587
		
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
		SemiMajorAxis  0.00117182483
        //Period         0.0492823668     // Orbital period in years 
		Inclination    5.89
		Eccentricity   0.02
		ArgOfPericen   3.2
	}
}

Planet	"Alaris"
{
	ParentBody     "Kashyyyk System"
	Class	       "GasGiant"

	Mass            215
	Radius          66000
	InertiaMoment   0.3975344

	Albedo          0.3
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   1.29644
		//Period          3.455
		Eccentricity    0.004
		Inclination     0.34555
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Moon	"Alaris Prime/Wookiee Colony 3"
{
	ParentBody     "Alaris"
	Class          "Terra"

    Radius          7844      // Radius in km  
	Mass            0.443
    RotationPeriod  25        // Rotation period in hours 

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		Randomize      (-0.923, -0.782, -0.123)
		tropicLatitude  0.1825397
		icecapLatitude  85
		icecapHeight    0.1430
		climatePole     0.45
		climateTropic   0.45
		climateEquator  0.45
		tropicWidth     0.07
		seaLevel        0.200
		colorSea       (0.305, 0.462, 0.560, 0.850)
		colorShelf     (0.690, 0.827, 0.800, 1.000)
		colorBeach     (0.580, 0.584, 0.560, 1.000)
		colorDesert    (0.415, 0.580, 0.533, 1.000)
		colorLowland   (0.235, 0.254, 0.172, 1.000)
		colorUpland    (0.223, 0.239, 0.176, 1.000)
		colorRock      (0.349, 0.341, 0.317, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		colorLowPlants (0.235, 0.254, 0.172, 1.000)
		colorUpPlants  (0.223, 0.239, 0.176, 1.000)
	}

	Clouds
	{
		Height          37.5
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.728571
		mainOctaves     9
		Coverage        0.2116667
		twistZones      9.234271
		twistMagn       2.5
	}

	Atmosphere
	{
		Model          "Earth"
		Height          100
		Density         100
		Pressure        0.976
		Greenhouse      53.76289
		Bright          10.27619
		Opacity         1
		SkyLight        2.301587
		
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
		SemiMajorAxis  0.00147182483
        //Period         0.0728     // Orbital period in years 
		Inclination    5.89
		Eccentricity   0.02
		ArgOfPericen   3.2
	}
}

Planet	"Shurr"
{
	ParentBody     "Kashyyyk System"
	Class	       "GasGiant"

	Mass            186
	Radius          45000
	InertiaMoment   0.3975344

	Albedo          0.3
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   1.743
		//Period          6.455
		Eccentricity    0.002
		Inclination     0.64555
		AscendingNode   340.4993
		ArgOfPericenter 7.589897
		MeanAnomaly     139
		RefPlane       "Equator"
	}
}

Planet	"Kuhurrik"
{
	ParentBody     "Kashyyyk System"
	Class	       "IceGiant"

	Mass            175
	Radius          39550
	InertiaMoment   0.3975344

	Albedo          0.6777
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   2.4321
		//Period          9.322
		Eccentricity    0.002
		Inclination     0.64555
		AscendingNode   340.4993
		ArgOfPericenter 7.589897
		MeanAnomaly     139
		RefPlane       "Equator"
	}
}