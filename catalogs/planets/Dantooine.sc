Planet	"Doma"
{
	ParentBody     "Dina"
	Class          "Selena"

    Radius         4141.56      // Radius in km  
	Mass            0.11
    RotationPeriod  25.12        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.12     // Orbital period in years 
		SemiMajorAxis  0.101
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Planet	"Camillo"
{
	ParentBody     "Dina"
	Class          "Desert"

    Radius         6141.56      // Radius in km  
	Mass            0.7
    RotationPeriod  57.12        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.31     // Orbital period in years 
		SemiMajorAxis  0.381
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Camillo 1"
{
	ParentBody     "Camillo"

    Radius         3113.56      // Radius in km  
	Mass            0.5
    RotationPeriod  23.12        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.12     // Orbital period in years 
		SemiMajorAxis  0.006
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Camillo 2"
{
	ParentBody     "Camillo"

    Radius         1113.56      // Radius in km  
	Mass            0.5
    RotationPeriod  23.12        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.22     // Orbital period in years 
		SemiMajorAxis  0.012
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Camillo 3"
{
	ParentBody     "Camillo"

    Radius         1743.56      // Radius in km  
	Mass            0.2
    RotationPeriod  32.12        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.42     // Orbital period in years 
		SemiMajorAxis  0.021
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Planet	"Camooine"
{
	ParentBody     "Dina"
	Class	       "Terra"

    Radius         7311.23      // Radius in km  
	Mass            2.82
    RotationPeriod  30.12        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.985     // Orbital period in years 
		SemiMajorAxis  0.791
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Camooine 1"
{
	ParentBody     "Camooine"

    Radius         2243.56      // Radius in km  
	Mass            0.3
    RotationPeriod  12.12        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.33     // Orbital period in years 
		SemiMajorAxis  0.003
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Camooine 2"
{
	ParentBody     "Camooine"

    Radius         4143.56      // Radius in km  
	Mass            0.7
    RotationPeriod  19.31        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.10     // Orbital period in years 
		SemiMajorAxis  0.008
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Camooine 3"
{
	ParentBody     "Camooine"

    Radius         3743.56      // Radius in km  
	Mass            0.459
    RotationPeriod  12.31        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.50     // Orbital period in years 
		SemiMajorAxis  0.010
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Planet	"Dantooine"
{
	ParentBody     "Dina"
	Class	       "Terra"

	Mass            0.6562
	Radius          4915
	InertiaMoment   0.3293593

	Oblateness      0.004681116

	RotationPeriod  25.211
	RotationOffset  155.3009
	Obliquity       -137.40952
	EqAscendNode    93.85714

	Albedo          0.26
	Color          (0.723 0.666 0.666)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		Style           0.7879496
		Randomize      (-0.998, 0.995, 0.759)
		colorDistMagn   0.04368786
		colorDistFreq   627.2053
		detailScale     13933.94
		colorConversion true
		drivenDarkening -1
		seaLevel        0.222
		snowLevel       0.1507937
		tropicLatitude  0.1825397
		icecapLatitude  32
		icecapHeight    0.2596103
		climatePole     0.45
		climateTropic   0.698
		climateEquator  0.45
		tropicWidth     0.5444444
		mainFreq        0.944191
		venusFreq       0.613223
		venusMagn       0.2019961
		mareFreq        4.406314
		mareDensity     0.01910314
		terraceProb     0.5577481
		erosion         0.1282448
		montesMagn      0.2139626
		montesFreq      423.366
		montesFraction  0.349
		dunesMagn       0.068539
		dunesFreq       63.62164
		dunesFraction   0.6616587
		hillsMagn       0.1494918
		hillsFreq       547.5091
		hillsFraction   -0.6604101
		hills2Fraction  0.3211142
		canyonsMagn     0.05358123
		canyonsFreq     95.25735
		canyonFraction  0.1195226
		cracksMagn      0
		cracksFreq      0
		cracksOctaves   1
		craterMagn      0.3326186
		craterFreq      19.18134
		craterDensity   0
		craterOctaves   1
		craterRayedFactor 0
		twistZones      6.234271
		twistMagn       0
		cycloneMagn     2.220736
		cycloneFreq     0.6271228
		cycloneDensity  0.0418652
		cycloneOctaves  1
		colorSea       (0.356, 0.454, 0.541, 1.000)
		colorShelf     (0.250, 0.480, 0.460, 1.000)
		colorBeach     (0.980, 0.898, 0.917, 0.000)
		colorDesert    (0.862, 0.827, 0.835, 0.000)
		colorLowland   (0.682, 0.619, 0.658, 0.000)
		colorUpland    (0.611, 0.611, 0.470, 0.000)
		colorRock      (0.730, 0.550, 0.390, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.016)
		colorLowPlants (0.490, 0.521, 0.313, 0.000)
		colorUpPlants  (0.729, 0.721, 0.596, 0.000)
		BumpHeight      25
		BumpOffset      14
		DiffMapAlpha   "Water"
		SpecularBright  20
		SpecularPower   150
		DayAmbient      0.07
		Lommel          0
		Exposure        2
	}

	Clouds
	{
		Height          28.43164
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.190476
		mainOctaves     12
		Coverage        0.2222222
		twistZones      5.476191
		twistMagn       0.5952381
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
		Model          "Earth"
		Height          64.49467
		Density         100
		Pressure        0.896
		Greenhouse      10.85714
		Bright          16.85714
		Opacity         0.6507937
		SkyLight        4.047619
		
		Composition // values in percent
		{
			N2  77.7729
			O2  20.8625
			Ar  0.9303
			H2O 0.4000
			CO2 0.0398
		}
	}

	NoRings			true

	NoCometTail     true

	Orbit
	{
		SemiMajorAxis   1.201
		//Period          1.657423
		Eccentricity    0.014
		AscendingNode   241.0947
		ArgOfPericenter 127.5128
		MeanAnomaly     118.5491
		RefPlane       "Ecliptic"
	}
}

Moon	"Dantooine 1"
{
	ParentBody     "Dantooine"
	Class	       "Selena"

    Radius         3243.56      // Radius in km  
	Mass            0.5
    RotationPeriod  21.12        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.33     // Orbital period in years 
		SemiMajorAxis  0.0006
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Dantooine 2"
{
	ParentBody     "Dantooine"
	Class	       "Selena"

    Radius         3013.56      // Radius in km  
	Mass            0.5
    RotationPeriod  10.12        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.40     // Orbital period in years 
		SemiMajorAxis  0.00085
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Planet	"Bannakon"
{
	ParentBody     "Dina"
	Class          "GasGiant"

    Radius         50132.56      // Radius in km  
	Mass            251
    RotationPeriod  8.02        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         7.21     // Orbital period in years 
		SemiMajorAxis  1.485
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Bannakon 1"
{
	ParentBody     "Bannakon"

    Radius         7143.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.50     // Orbital period in years 
		SemiMajorAxis  0.001
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Bannakon 2"
{
	ParentBody     "Bannakon"

    Radius         2143.56      // Radius in km  
	Mass            0.159
    RotationPeriod  42        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.20     // Orbital period in years 
		SemiMajorAxis  0.0019
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Bannakon 3"
{
	ParentBody     "Bannakon"

    Radius         5143.56      // Radius in km  
	Mass            0.859
    RotationPeriod  37        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.70     // Orbital period in years 
		SemiMajorAxis  0.0041
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Bannakon 4"
{
	ParentBody     "Bannakon"

    Radius         1143.56      // Radius in km  
	Mass            0.259
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.50     // Orbital period in years 
		SemiMajorAxis  0.0082
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Bannakon 5"
{
	ParentBody     "Bannakon"

    Radius         7843.56      // Radius in km  
	Mass            0.459
    RotationPeriod  30        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.10     // Orbital period in years 
		SemiMajorAxis  0.01
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Bannakon 6"
{
	ParentBody     "Bannakon"

    Radius         6643.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.90     // Orbital period in years 
		SemiMajorAxis  0.0131
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Bannakon 7"
{
	ParentBody     "Bannakon"

    Radius         6921.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         1.00     // Orbital period in years 
		SemiMajorAxis  0.0182
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Bannakon 8"
{
	ParentBody     "Bannakon"

    Radius         7043.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         1.3     // Orbital period in years 
		SemiMajorAxis  0.0211
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Bannakon 9"
{
	ParentBody     "Bannakon"

    Radius         7143.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.578     // Orbital period in years 
		SemiMajorAxis  0.0241
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Bannakon 10"
{
	ParentBody     "Bannakon"

    Radius         7143.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.50     // Orbital period in years 
		SemiMajorAxis  0.03
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Bannakon 11"
{
	ParentBody     "Bannakon"

    Radius         7143.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.69     // Orbital period in years 
		SemiMajorAxis  0.036
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Planet	"Tamarena"
{
	ParentBody     "Dina"
	Class          "GasGiant"

    Radius         8710.20      // Radius in km  
	Mass            322
    RotationPeriod  12.02        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         13.21     // Orbital period in years 
		SemiMajorAxis  1.998
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Tamarena 1"
{
	ParentBody     "Tamarena"

    Radius         7143.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.50     // Orbital period in years 
		SemiMajorAxis  0.001
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Tamarena 2"
{
	ParentBody     "Tamarena"

    Radius         2143.56      // Radius in km  
	Mass            0.159
    RotationPeriod  42        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.20     // Orbital period in years 
		SemiMajorAxis  0.0019
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Tamarena 3"
{
	ParentBody     "Tamarena"

    Radius         5143.56      // Radius in km  
	Mass            0.859
    RotationPeriod  37        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.70     // Orbital period in years 
		SemiMajorAxis  0.0041
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Tamarena 4"
{
	ParentBody     "Tamarena"

    Radius         1143.56      // Radius in km  
	Mass            0.259
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.50     // Orbital period in years 
		SemiMajorAxis  0.0082
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Tamarena 5"
{
	ParentBody     "Tamarena"

    Radius         7843.56      // Radius in km  
	Mass            0.459
    RotationPeriod  30        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.10     // Orbital period in years 
		SemiMajorAxis  0.01
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Tamarena 6"
{
	ParentBody     "Tamarena"

    Radius         6643.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.90     // Orbital period in years 
		SemiMajorAxis  0.0131
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Tamarena 7"
{
	ParentBody     "Tamarena"

    Radius         6921.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         1.00     // Orbital period in years 
		SemiMajorAxis  0.0182
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Tamarena 8"
{
	ParentBody     "Tamarena"

    Radius         7043.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         1.3     // Orbital period in years 
		SemiMajorAxis  0.0211
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Tamarena 9"
{
	ParentBody     "Tamarena"

    Radius         7143.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.578     // Orbital period in years 
		SemiMajorAxis  0.0241
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Tamarena 10"
{
	ParentBody     "Tamarena"

    Radius         7143.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.50     // Orbital period in years 
		SemiMajorAxis  0.03
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Tamarena 11"
{
	ParentBody     "Tamarena"

    Radius         7143.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.69     // Orbital period in years 
		SemiMajorAxis  0.036
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Tamarena 12"
{
	ParentBody     "Tamarena"

    Radius         7143.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.50     // Orbital period in years 
		SemiMajorAxis  0.039
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Tamarena 13"
{
	ParentBody     "Tamarena"

    Radius         2143.56      // Radius in km  
	Mass            0.159
    RotationPeriod  42        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.20     // Orbital period in years 
		SemiMajorAxis  0.044
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Tamarena 14"
{
	ParentBody     "Tamarena"

    Radius         5143.56      // Radius in km  
	Mass            0.859
    RotationPeriod  37        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.70     // Orbital period in years 
		SemiMajorAxis  0.052
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Tamarena 15"
{
	ParentBody     "Tamarena"

    Radius         1143.56      // Radius in km  
	Mass            0.259
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.50     // Orbital period in years 
		SemiMajorAxis  0.06
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Tamarena 16"
{
	ParentBody     "Tamarena"

    Radius         7843.56      // Radius in km  
	Mass            0.459
    RotationPeriod  30        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.10     // Orbital period in years 
		SemiMajorAxis  0.068
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Tamarena 17"
{
	ParentBody     "Tamarena"

    Radius         6643.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.90     // Orbital period in years 
		SemiMajorAxis  0.076
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Tamarena 18"
{
	ParentBody     "Tamarena"

    Radius         6921.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         1.00     // Orbital period in years 
		SemiMajorAxis  0.081
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Tamarena 19"
{
	ParentBody     "Tamarena"

    Radius         7043.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         1.3     // Orbital period in years 
		SemiMajorAxis  0.099
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Tamarena 20"
{
	ParentBody     "Tamarena"

    Radius         7143.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.578     // Orbital period in years 
		SemiMajorAxis  0.12
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Tamarena 21"
{
	ParentBody     "Tamarena"

    Radius         7143.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.50     // Orbital period in years 
		SemiMajorAxis  0.14
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}
	
Planet	"Dulbris"
{
	ParentBody     "Dina"
	Class          "GasGiant"

    Radius         102311.20      // Radius in km  
	Mass            340
    RotationPeriod  16.61        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         21.21     // Orbital period in years 
		SemiMajorAxis  2.293
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Dulbris 1"
{
	ParentBody     "Dulbris"

    Radius         7143.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.50     // Orbital period in years 
		SemiMajorAxis  0.0022
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Dulbris 2"
{
	ParentBody     "Dulbris"

    Radius         2143.56      // Radius in km  
	Mass            0.159
    RotationPeriod  42        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.20     // Orbital period in years 
		SemiMajorAxis  0.0029
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Dulbris 3"
{
	ParentBody     "Dulbris"

    Radius         5143.56      // Radius in km  
	Mass            0.859
    RotationPeriod  37        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.70     // Orbital period in years 
		SemiMajorAxis  0.0041
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Dulbris 4"
{
	ParentBody     "Dulbris"

    Radius         1143.56      // Radius in km  
	Mass            0.259
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.50     // Orbital period in years 
		SemiMajorAxis  0.0082
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Dulbris 5"
{
	ParentBody     "Dulbris"

    Radius         7843.56      // Radius in km  
	Mass            0.459
    RotationPeriod  30        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.10     // Orbital period in years 
		SemiMajorAxis  0.01
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Dulbris 6"
{
	ParentBody     "Dulbris"

    Radius         6643.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.90     // Orbital period in years 
		SemiMajorAxis  0.0131
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Dulbris 7"
{
	ParentBody     "Dulbris"

    Radius         6921.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         1.00     // Orbital period in years 
		SemiMajorAxis  0.0182
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Dulbris 8"
{
	ParentBody     "Dulbris"

    Radius         7043.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         1.3     // Orbital period in years 
		SemiMajorAxis  0.0211
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Dulbris 9"
{
	ParentBody     "Dulbris"

    Radius         7143.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.578     // Orbital period in years 
		SemiMajorAxis  0.0241
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Dulbris 10"
{
	ParentBody     "Dulbris"

    Radius         7143.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.50     // Orbital period in years 
		SemiMajorAxis  0.03
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Dulbris 11"
{
	ParentBody     "Dulbris"

    Radius         7143.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.69     // Orbital period in years 
		SemiMajorAxis  0.036
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Dulbris 12"
{
	ParentBody     "Dulbris"

    Radius         7143.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.50     // Orbital period in years 
		SemiMajorAxis  0.039
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Dulbris 13"
{
	ParentBody     "Dulbris"

    Radius         2143.56      // Radius in km  
	Mass            0.159
    RotationPeriod  42        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.20     // Orbital period in years 
		SemiMajorAxis  0.044
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Dulbris 14"
{
	ParentBody     "Dulbris"

    Radius         5143.56      // Radius in km  
	Mass            0.859
    RotationPeriod  37        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.70     // Orbital period in years 
		SemiMajorAxis  0.052
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Dulbris 15"
{
	ParentBody     "Dulbris"

    Radius         1143.56      // Radius in km  
	Mass            0.259
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.50     // Orbital period in years 
		SemiMajorAxis  0.06
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Dulbris 16"
{
	ParentBody     "Dulbris"

    Radius         7843.56      // Radius in km  
	Mass            0.459
    RotationPeriod  30        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.10     // Orbital period in years 
		SemiMajorAxis  0.068
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Dulbris 17"
{
	ParentBody     "Dulbris"

    Radius         6643.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.90     // Orbital period in years 
		SemiMajorAxis  0.076
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Dulbris 18"
{
	ParentBody     "Dulbris"

    Radius         6921.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         1.00     // Orbital period in years 
		SemiMajorAxis  0.081
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Dulbris 19"
{
	ParentBody     "Dulbris"

    Radius         7043.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         1.3     // Orbital period in years 
		SemiMajorAxis  0.099
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Dulbris 20"
{
	ParentBody     "Dulbris"

    Radius         7143.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.578     // Orbital period in years 
		SemiMajorAxis  0.12
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Dulbris 21"
{
	ParentBody     "Dulbris"

    Radius         7143.56      // Radius in km  
	Mass            0.459
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.50     // Orbital period in years 
		SemiMajorAxis  0.14
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Planet	"Purnell"
{
	ParentBody     "Dina"
	Class          "IceGiant"

    Radius         40122.20      // Radius in km  
	Mass            88
    RotationPeriod  5.911        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         51.21     // Orbital period in years 
		SemiMajorAxis  2.621
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Purnell 2"
{
	ParentBody     "Purnell"

    Radius         7843.56      // Radius in km  
    RotationPeriod  30        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.10     // Orbital period in years 
		SemiMajorAxis  0.068
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Purnell 3"
{
	ParentBody     "Purnell"

    Radius         6643.56      // Radius in km  
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.90     // Orbital period in years 
		SemiMajorAxis  0.076
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Purnell 4"
{
	ParentBody     "Purnell"

    Radius         6921.56      // Radius in km  
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         1.00     // Orbital period in years 
		SemiMajorAxis  0.081
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Purnell 5"
{
	ParentBody     "Purnell"

    Radius         7043.56      // Radius in km  
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         1.3     // Orbital period in years 
		SemiMajorAxis  0.099
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Purnell 6"
{
	ParentBody     "Purnell"

    Radius         7143.56      // Radius in km  
    RotationPeriod  52        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.578     // Orbital period in years 
		SemiMajorAxis  0.12
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}

Moon	"Purnell 1/Parakus"
{
	ParentBody     "Purnell"
	Class	       "IceWorld"

    Radius         5143.56      // Radius in km  
    RotationPeriod  21        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.69     // Orbital period in years 
		SemiMajorAxis  0.001
		Eccentricity   0.01
		ArgOfPericen   9.2
	}
}
