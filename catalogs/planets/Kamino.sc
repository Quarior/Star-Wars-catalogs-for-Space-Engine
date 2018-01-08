Planet	"Kas"
{
	ParentBody     "Kamino System"
	Class	       "Selena"

	Mass            0.2
	Radius          975.020
	InertiaMoment   0.3975344

	Albedo          0.3
	Color          (1.000 1.000 1.000)
	
	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Orbit
	{
		SemiMajorAxis   0.190
		//Period          0.14
		Eccentricity    0.0635060218
		Inclination     0.7317737
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Planet	"Yuka Major"
{
	ParentBody     "Kamino System"
	Class          "Selena"

    Radius          1025       // Radius in km  
	Mass            0.24
    RotationPeriod  21        // Rotation period in hours 

	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Orbit
	{
		Epoch          2454762
		SemiMajorAxis  0.3811
        //Period         0.45954     // Orbital period in years 
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Jomon"
{
	ParentBody     "Kamino System"
	Class          "Selena"

    Radius          1169      // Radius in km  
	Mass            0.2457
    RotationPeriod  17        // Rotation period in hours 

	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Orbit
	{
		Epoch          2454762
		SemiMajorAxis  0.4215
        //Period         0.653     // Orbital period in years 
		Inclination    0.0689
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Faa"
{
	ParentBody     "Kamino System"
	Class          "Terra"

    Radius          4295      // Radius in km  
	Mass            0.622
    RotationPeriod  20        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		SemiMajorAxis  0.6957
        //Period         0.75954     // Orbital period in years 
		Inclination    0.0689
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

DwarfMoon	"Faa 1"
{
	ParentBody     "Faa"
	Class	       "Asteroid"

	Mass            3.594917e-006
	Radius          57.16425
	InertiaMoment   0.3983172

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.001378878
		//Period          0.001037225
		Eccentricity    0.0005060218
		Inclination     0.7317737
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Faa 2"
{
	ParentBody     "Faa"
	Class	       "Asteroid"

	Mass            3.624917e-006
	Radius          86.16425
	InertiaMoment   0.3983172

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.001678878
		//Period          0.002237225
		Eccentricity    0.0004060218
		Inclination     0.6317737
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Planet	"Kamino/Kamino Planet"
{
	ParentBody     "Kamino System"
	Class          "Oceania"

    Radius          9635      // Radius in km  
	Mass            0.622
    RotationPeriod  27        // Rotation period in hours 

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine"
	}

	Surface
	{
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.690, 0.470, 0.320, 0.000)
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
		Coverage        0.6
		twistZones      6.234271
		twistMagn       0
	}

	Atmosphere
	{
		Model          "Earth"
		Height          166.78
		Density         100
		Pressure        0.946
		Greenhouse      83.76289
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
	
	NoRings true
	
	Orbit
	{
		Epoch          2454762
		SemiMajorAxis  0.81455
        //Period         1.267651     // Orbital period in years 
		Inclination    0.0389
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

DwarfMoon	"Korosa/Kamino 1"
{
	ParentBody     "Kamino Planet"
	Class          "IceWorld"

    Radius          675      // Radius in km  
	Mass            0.622
    RotationPeriod  27        // Rotation period in hours 

	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Orbit
	{
		Epoch          2454762
		SemiMajorAxis  0.000635035777
        //Period         0.0191653649     // Orbital period in years 
		Inclination    0.0689
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Kamino 2"
{
	ParentBody     "Kamino Planet"
	Class	       "Selena"

	Radius          725

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.00083557339
		//Period          0.0342238658
		Eccentricity    0.0004060218
		Inclination     0.6317737
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Kamino 3"
{
	ParentBody     "Kamino Planet"
	Class          "IceWorld"

    Radius          802      // Radius in km  
	Mass            0.422
    RotationPeriod  27        // Rotation period in hours 

	NoClouds			true
	
	NoAurora			true

	Orbit
	{
		Epoch          2454762
		SemiMajorAxis  0.00109246207
        //Period         0.0479134121     // Orbital period in years 
		Inclination    0.0689
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Mira"
{
	ParentBody     "Kamino System"
	Class	       "Selena"

	Radius          1250

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Orbit
	{
		SemiMajorAxis   1.14530
		//Period          1.5309
		Eccentricity    0.0004060218
		Inclination     0.6317737
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Planet	"Myuu"
{
	ParentBody     "Kamino System"
	Class	       "Selena"

	Radius          2964.50

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Orbit
	{
		SemiMajorAxis   1.71056
		//Period          1.8309
		Eccentricity    0.0004060218
		Inclination     0.2317737
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Planet	"Donoa"
{
	ParentBody     "Kamino System"
	Class	       "Selena"

	Radius          6405

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Orbit
	{
		SemiMajorAxis   2.05398
		//Period          2.1950
		Eccentricity    0.0002060218
		Inclination     0.2917737
		AscendingNode   348.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Planet	"Casna Aura"
{
	ParentBody     "Kamino System"
	Class	       "GasGiant"

	Radius          62178.5
	Mass		65
	RotationPeriod	6.54908

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   2.48398
		//Period          2.8435
		Eccentricity    0.0002060218
		Inclination     0.5917737
		AscendingNode   348.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Planet	"Casna Besh"
{
	ParentBody     "Kamino System"
	Class	       "GasGiant"

	Radius          88226
	Mass		155
	RotationPeriod	6.54908

	Obliquity       5.008956e-006
	EqAscendNode    343.4993

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   2.958
		//Period          4.795
		Eccentricity    0.0002060218
		Inclination     0.5917737
		AscendingNode   348.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Planet	"Imoco"
{
	ParentBody     "Kamino System"
	Class          "IceWorld"

    Radius          4250      // Radius in km  
	Mass            0.722
    RotationPeriod  19        // Rotation period in hours 

	NoClouds			true
	
	NoAurora			true

	Orbit
	{
		Epoch          2454762
		SemiMajorAxis  3.429580956
        //Period         6.015     // Orbital period in years 
		Inclination    0.0449
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Talita"
{
	ParentBody     "Kamino System"
	Class          "IceWorld"

    Radius          4269      // Radius in km  
	Mass            0.961522

	NoClouds			true
	
	NoAurora			true

	Orbit
	{
		Epoch          2454762
		SemiMajorAxis  3.85
        //Period         6.015     // Orbital period in years 
		Inclination    3.649
		Eccentricity   0.04
		ArgOfPericen   9.2
	}
}

Planet	"Yuka"
{
	ParentBody     "Kamino System"
	Class          "IceWorld"

    Radius          3227.525      // Radius in km  
	Mass            0.522

	Orbit
	{
		Epoch          2454762
		SemiMajorAxis  4.786
        //Period         9.937     // Orbital period in years 
		Inclination   -5.44
		Eccentricity   0.039
		ArgOfPericen   6.2
	}
}

