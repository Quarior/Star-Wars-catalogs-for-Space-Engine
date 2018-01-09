// http://starwars.wikia.com/wiki/Geonosis
// Region : Outer Rim
// Sector : Arkanis Sector
// Grid location : R16
// X : 9674.4, Y : -10099.46, Z : -120.62305587004028
Planet	"Geriss"
{
	ParentBody     "Ea"
	Class          "Selena"

    Radius         1874      // Radius in km  
	Mass            0.14
    RotationPeriod  33        // Rotation period in hours

	NoAtmosphere	true 

	Orbit
	{
		Epoch          2454762
		//Period         0.4     // Orbital period in years 
		SemiMajorAxis  0.56918
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Geonosis"
{
	ParentBody     "Ea"
	Class	       "Desert"

	Mass            0.7981451
	Radius          5685
	InertiaMoment   0.330512

	Oblateness      0.00738758

	RotationPeriod  30
	RotationOffset  8.18
	Obliquity       -68.5716
	EqAscendNode    40

	Albedo          0.2767181
	Color          (0.816 0.612 0.895)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}

	Surface
	{
		Style           0.03656019
		Randomize      (0.166, 0.601, 0.034)
		colorDistMagn   0.09013649
		colorDistFreq   533.4974
		detailScale     26916.58
		colorConversion true
		drivenDarkening -1
		seaLevel        0.423
		snowLevel       0.9883075
		tropicLatitude  0.7158645
		icecapLatitude  1
		icecapHeight    0.1252777
		climatePole     1
		climateTropic   0.45
		climateEquator  0.6129227
		tropicWidth     0.07
		mainFreq        0.01
		venusFreq       1.081553
		venusMagn       0.3538713
		mareFreq        2.041626
		mareDensity     0
		terraceProb     0.7443396
		erosion         0
		montesMagn      0.5757629
		montesFreq      699.4542
		montesFraction  0.3138253
		dunesMagn       0.06606267
		dunesFreq       59.79757
		dunesFraction   0.297365
		hillsMagn       0.1238402
		hillsFreq       727.8046
		hillsFraction   -0.297365
		hills2Fraction  0
		canyonsMagn     0.6595129
		canyonsFreq     308.9345
		canyonFraction  0
		cracksMagn      0
		cracksFreq      0
		cracksOctaves   1
		craterMagn      0
		craterFreq      0
		craterDensity   0
		craterOctaves   1
		craterRayedFactor 0
		twistZones      7.328156
		twistMagn       0
		cycloneMagn     0
		cycloneFreq     0
		cycloneDensity  0
		cycloneOctaves  1
		colorSea       (0.360, 0.260, 0.270, 0.000)
		colorShelf     (0.901, 0.352, 0.192, 0.000)
		colorBeach     (0.964, 0.768, 0.486, 0.000)
		colorDesert    (0.941, 0.392, 0.200, 0.000)
		colorLowland   (0.952, 0.713, 0.403, 0.000)
		colorUpland    (0.498, 0.082, 0.035, 0.000)
		colorRock      (0.741, 0.466, 0.427, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.200)
		colorLowPlants (0.949, 0.603, 0.392, 0.000)
		colorUpPlants  (0.831, 0.403, 0.184, 0.000)
		BumpHeight      18.36556
		BumpOffset      3.673113
		DiffMapAlpha   "Ice"
		SpecularBright  0.3
		SpecularPower   150
		DayAmbient      0.07
		Lommel          0
		Exposure        2
	}

	Clouds
	{
		Height          18.15967
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.826782
		mainOctaves     10
		Coverage        0.03668254
		twistZones      7.328156
		twistMagn       0
	}

	Ocean
	{
		Height          10.422363
		DayAmbient      2
		Lommel          0
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
	}

	Atmosphere
	{
		Model          "Mars"
		Height          39.37659
		Density         100
		Pressure        0.90
		Greenhouse      61.29678
		Bright          10
		Opacity         1
		SkyLight        0
		
		Composition // values in percent
		{
			N2  77.7729
			O2  20.8625
			Ar  0.9303
			H2O 0.4000
			CO2 0.0398
		}
	}

	NoAurora        true

	// NoRings         true

	NoCometTail     true

	Rings       // Rings tag 
     	{ 
         InnerRadius      7818.5  // Inner raduis of rings system in km 
         OuterRadius      27438.3 // Outer radius of rings system in km 
         RotationPeriod   43.3    // Rings rotation period in hours 
         RotationOffset   60.0    // Rings rotation phase in degrees 
         FrontBright      1.0     // Direct lighting brightness 
         BackBright       5.0     // Back lighting brightness (scattering) 
         Density          1.0     // Density (opacity) 
         Exposure         2.0     // Global brightness 
     	} 

	Orbit
	{
		Epoch           2356307
		SemiMajorAxis   0.873
		//Period          0.835
		Eccentricity    0
		Inclination     245.7143
		AscendingNode   -40
		ArgOfPericenter 217.1429
		MeanAnomaly     120
		RefPlane       "Ecliptic"
	}
}

Moon	"Geonosis 1"
{
	ParentBody     "Geonosis"
	Class          "Desert"

    Radius         3414      // Radius in km  
	Mass            0.6
    RotationPeriod  17        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.008133     // Orbital period in years 
		SemiMajorAxis  0.0008291
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Geonosis 2"
{
	ParentBody     "Geonosis"
	Class          "Desert"

    Radius         3004      // Radius in km  
	Mass            0.7
    RotationPeriod  19        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.008633     // Orbital period in years 
		SemiMajorAxis  0.001253
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Geonosis 3"
{
	ParentBody     "Geonosis"
	Class          "Selena"

    Radius         1244      // Radius in km  
	Mass            1.1
    RotationPeriod  14        // Rotation period in hours 

	NoAtmosphere    true

	Orbit
	{
		Epoch          2454762
		//Period         0.008733     // Orbital period in years 
		SemiMajorAxis  0.001553
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Geonosis 4"
{
	ParentBody     "Geonosis"
	Class          "Selena"

    Radius         763      // Radius in km  
	Mass            0.14
    RotationPeriod  18        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.01042     // Orbital period in years 
		SemiMajorAxis  0.002053
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Conus"
{
	ParentBody     "Ea"
	Class          "Desert"

    Radius         3409      // Radius in km  
	Mass            0.83
    RotationPeriod  18        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.01042     // Orbital period in years 
		SemiMajorAxis  1.2499
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Conus 1"
{
	ParentBody     "Conus"
	Class          "Terra"

    Radius         3414      // Radius in km  
	Mass            0.6
    RotationPeriod  17        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.008133     // Orbital period in years 
		SemiMajorAxis  0.0008291
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Conus 2"
{
	ParentBody     "Conus"
	Class          "Desert"

    Radius         3004      // Radius in km  
	Mass            0.7
    RotationPeriod  19        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.008633     // Orbital period in years 
		SemiMajorAxis  0.001453
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Conus 3"
{
	ParentBody     "Conus"
	Class          "Desert"

    Radius         1244      // Radius in km  
	Mass            1.1
    RotationPeriod  14        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.008733     // Orbital period in years 
		SemiMajorAxis  0.001553
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Conus 4"
{
	ParentBody     "Conus"
	Class          "Selena"

    Radius         763      // Radius in km  
	Mass            0.14
    RotationPeriod  18        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.01042     // Orbital period in years 
		SemiMajorAxis  0.002253
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Mabonte"
{
	ParentBody     "Ea"
	Class          "Titan"

    Radius         3938      // Radius in km  
	Mass            0.83
    RotationPeriod  26        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.01042     // Orbital period in years 
		SemiMajorAxis  1.55986
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Mabonte 1"
{
	ParentBody     "Mabonte"
	Class          "Selena"

    Radius         2004      // Radius in km  
	Mass            0.7
    RotationPeriod  19        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.008633     // Orbital period in years 
		SemiMajorAxis  0.001453
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Mabonte 2"
{
	ParentBody     "Mabonte"
	Class          "Selena"

    Radius         863      // Radius in km  
	Mass            0.24
    RotationPeriod  15        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.01042     // Orbital period in years 
		SemiMajorAxis  0.002253
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

DwarfMoon	"Mabonte 3"
{
	ParentBody      "Mabonte"
	Albedo          0.06
	Radius          67
	RotationOffset  242.9
	Obliquity       0.1
	EqAscendNode    346.7

	Orbit
	{
		//Period         0.00142
		SemiMajorAxis  0.00266321
		Eccentricity   0.0004
		Inclination    60.66
		AscendingNode  8.998
		ArgOfPericen   30.956
		MeanAnomaly    7.538
	}
}

Planet	"Habon"
{
	ParentBody     "Ea"
	Class          "GasGiant"

    Radius         35000      // Radius in km  
	Mass            99
    RotationPeriod  16        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.01042     // Orbital period in years 
		SemiMajorAxis  1.95986
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Abyssissa"
{
	ParentBody     "Ea"
	Class          "IceWorld"

    Radius         2631      // Radius in km  
	Mass            0.421
    RotationPeriod  16        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.01042     // Orbital period in years 
		SemiMajorAxis  2.255
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Abyssissa 1"
{
	ParentBody     "Abyssissa"
	Class          "IceWorld"

    Radius         541      // Radius in km  
	Mass            0.08
    RotationPeriod  13        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.01056     // Orbital period in years 
		SemiMajorAxis  0.0009321
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}
