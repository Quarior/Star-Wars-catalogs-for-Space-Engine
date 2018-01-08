Planet	"Saba Reese"
{
	ParentBody     "Striar"
	Class	       "Selena"

	Mass            0.22
	Radius          2693.5
	InertiaMoment   0.3975344

	Albedo          0.5
	Color          (1.000 1.000 1.000)
	
	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Orbit
	{
		SemiMajorAxis   0.3032
		//Period          0.43
		Eccentricity    0.002
		Inclination     0.024555
		AscendingNode   339
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Saba Reese 1"
{
	ParentBody     "Saba Reese"
	Class          "Asteroid"

    Radius          39      // Radius in km  
    RotationPeriod  22        // Rotation period in hours 

	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Orbit
	{
		Epoch          2454762
		SemiMajorAxis  0.000503015181
        //Period         0.00752925048     // Orbital period in years 
		Inclination    6.289
		Eccentricity   0.03
		ArgOfPericen   5.2
	}
}

Planet	"Lacca"
{
	ParentBody     "Striar"
	Class	       "Selena"

	Mass            0.36
	Radius          2767.11
	InertiaMoment   0.23

	Albedo          0.450
	Color          (1.000 1.000 1.000)
	
	NoAurora			true

	Atmosphere
	{
		Greenhouse	83
	}

	Orbit
	{
		SemiMajorAxis   0.7164
		//Period          0.343
		Eccentricity    0.0009
		Inclination     0.374
		AscendingNode   339
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Moon	"Lacca 1"
{
	ParentBody     "Lacca"
	Class          "Selena"

    Radius          844      // Radius in km  
	Mass            0.122
    RotationPeriod  23        // Rotation period in hours 

	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Orbit
	{
		Epoch          2454762
		SemiMajorAxis  0.000675035777
        //Period         0.0201653649     // Orbital period in years 
		Inclination    0.689
		Eccentricity   0.03
		ArgOfPericen   5.2
	}
}

Planet	"Malastare"
{
	ParentBody     "Striar"
	Class          "Terra"

    Radius          9440      // Radius in km  
	Mass            1.633
    RotationPeriod  26        // Rotation period in hours 

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
   		seaLevel        0.452
   		snowLevel       0.000
   		colorSea       (0.490, 0.549, 0.670, 1.000)
   		colorShelf     (0.150, 0.480, 0.460, 1.000)
   		colorBeach     (0.282, 0.250, 0.031, 0.000)
   		colorDesert    (0.321, 0.435, 0.215, 0.000)
   		colorLowland   (0.211, 0.298, 0.066, 0.000) 
   		colorUpland    (0.309, 0.392, 0.098, 0.000)
   		colorRock      (0.231, 0.313, 0.090, 0.000)
   		colorSnow      (1.000, 1.000, 1.000, 0.016)
   		colorLowPlants (0.282, 0.250, 0.031, 0.000)
   		colorUpPlants  (0.321, 0.435, 0.215, 0.000)
	}

	Clouds
	{
		Height          66.93
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.628571
		mainOctaves     8
		Coverage        0.1666667
		twistZones      2.234271
		twistMagn       0
	}

	Atmosphere
	{
		Model          "Earth"
		Height          194.78
		Density         100
		Pressure        1.374
		Greenhouse      53.76289
		Bright          10.47619
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
		SemiMajorAxis  0.80455
        //Period         0.550319762
		Inclination   -85.714
		AscendingNode  17
		Eccentricity   0.01
		ArgOfPericen   4.2
	}
}

Moon	"Malastare 1"
{
	ParentBody     "Malastare"
	Class          "Selena"

    Radius          949      // Radius in km  
	Mass            0.162
    RotationPeriod  26        // Rotation period in hours 

	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Orbit
	{
		Epoch          2454762
		SemiMajorAxis  0.000685571255
        //Period         0.0201653649     // Orbital period in years 
		Inclination    32.2
		Eccentricity   0.03
		ArgOfPericen   5.2
	}
}

Moon	"Malastare 2"
{
	ParentBody     "Malastare"
	Class          "Selena"

    Radius          774      // Radius in km  
	Mass            0.133
    RotationPeriod  26        // Rotation period in hours 

	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Orbit
	{
		Epoch          2454762
		SemiMajorAxis  0.000971404201
        //Period         0.0219032741     // Orbital period in years 
		Inclination    0.273
		Eccentricity   0.05
		ArgOfPericen   3.2
	}
}

Planet	"Cogalle"
{
	ParentBody     "Striar"
	Class	       "Oceania"

	Mass            1.04
	Radius          5235
	InertiaMoment   0.3975344

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   1.155423
		//Period          1.0954
		Eccentricity    0.002
		Inclination     0.24555
		AscendingNode   345
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Moon	"Cogalle 1"
{
	ParentBody     "Cogalle"
	Class          "Desert"

    Radius          1095      // Radius in km  
	Mass            0.322
    RotationPeriod  33        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		SemiMajorAxis  0.000523068942
        //Period         0.0164274556     // Orbital period in years 
		Inclination    0.834
		Eccentricity   0.08
		ArgOfPericen   9.2
	}
}

Moon	"Cogalle 2"
{
	ParentBody     "Cogalle"
	Class          "Selena"

    Radius          999      // Radius in km  
	Mass            0.122
    RotationPeriod  31        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		SemiMajorAxis  0.000583068942
        //Period         0.0199274556     // Orbital period in years 
		Inclination    8.34
		Eccentricity   0.01
		ArgOfPericen   8.2
	}
}

Planet	"Hespry"
{
	ParentBody     "Striar"
	Class	       "IceWorld"

	Mass            0.74
	Radius          2857
	InertiaMoment   0.3975344

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   1.551
		//Period          1.24
		Eccentricity    0.01
		Inclination     8.64555
		AscendingNode   337
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Planet	"Bingsang"
{
	ParentBody     "Striar"
	Class	       "GasGiant"

	Mass            301
	Radius          58330
	InertiaMoment   0.3975344

	Albedo          0.5
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   1.972
		//Period          5.225
		Eccentricity    0.02
		Inclination     9.64555
		AscendingNode   337
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Planet	"Melambo"
{
	ParentBody     "Striar"
	Class	       "GasGiant"

	Mass            265
	Radius          48750
	InertiaMoment   0.3975344

	Albedo          0.5
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   2.644
		//Period          8.33
		Eccentricity    0.004
		Inclination     0.1
		AscendingNode   345
		ArgOfPericenter 9.2
		MeanAnomaly     140
		RefPlane       "Equator"
	}
}

Planet	"Allmittal"
{
	ParentBody     "Striar"
	Class	       "GasGiant"

	Mass            73
	Radius          48750
	InertiaMoment   0.3975344

	Albedo          0.5
	Color          (1.000 1.000 1.000)

	Rings
	{
	        InnerRadius      55855
         	OuterRadius      143500
	}

	Orbit
	{
		SemiMajorAxis   3.015
		//Period          10.5
		Eccentricity    0.001
		Inclination     0.2
		AscendingNode   340
		ArgOfPericenter 6.2
		MeanAnomaly     135
		RefPlane       "Equator"
	}
}
