// http://starwars.wikia.com/wiki/Dantooine
// Region : Outer Rim
// Sector : Raioballo Sector
// Grid location : L4
// X : 14.7, Y : 8378.27, Z : 571.2186377739656
Planet	"Doma/Dina 1"
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

Planet	"Camillo/Dina 2"
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

Moon	"Camillo 1/Dina 2.1"
{
	ParentBody     "Dina 2"

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

Moon	"Camillo 2/Dina 2.2"
{
	ParentBody     "Dina 2"

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

Moon	"Camillo 3/Dina 2.3"
{
	ParentBody     "Dina 2"

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

Planet	"Camooine/Dina 3"
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

Moon	"Camooine 1/Dina 3.1"
{
	ParentBody     "Dina 3"

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

Moon	"Camooine 2/Dina 3.2"
{
	ParentBody     "Dina 3"

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

Moon	"Camooine 3/Dina 3.3"
{
	ParentBody     "Dina 3"

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

Planet	"Dantooine/Dina 4"
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

Moon	"Dantooine 1/Dina 4.1"
{
	ParentBody     "Dina 4"
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

Moon	"Dantooine 2/Dina 4.2"
{
	ParentBody     "Dina 4"
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

Planet	"Bannakon/Dina 5"
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

Moon	"Bannakon 1/Dina 5.1"
{
	ParentBody     "Dina 5"

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

Moon	"Bannakon 2/Dina 5.2"
{
	ParentBody     "Dina 5"

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

Moon	"Bannakon 3/Dina 5.3"
{
	ParentBody     "Dina 5"

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

Moon	"Bannakon 4/Dina 5.4"
{
	ParentBody     "Dina 5"

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

Moon	"Bannakon 5/Dina 5.5"
{
	ParentBody     "Dina 5"

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

Moon	"Bannakon 6/Dina 5.6"
{
	ParentBody     "Dina 5"

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

Moon	"Bannakon 7/Dina 5.7"
{
	ParentBody     "Dina 5"

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

Moon	"Bannakon 8/Dina 5.8"
{
	ParentBody     "Dina 5"

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

Moon	"Bannakon 9/Dina 5.9"
{
	ParentBody     "Dina 5"

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

Moon	"Bannakon 10/Dina 5.10"
{
	ParentBody     "Dina 5"

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

Moon	"Bannakon 11/Dina 5.11"
{
	ParentBody     "Dina 5"

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

Planet	"Tamarena/Dina 6"
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

Moon	"Tamarena 1/Dina 6.1"
{
	ParentBody     "Dina 6"

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

Moon	"Tamarena 2/Dina 6.2"
{
	ParentBody     "Dina 6"

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

Moon	"Tamarena 3/Dina 6.3"
{
	ParentBody     "Dina 6"

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

Moon	"Tamarena 4/Dina 6.4"
{
	ParentBody     "Dina 6"

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

Moon	"Tamarena 5/Dina 6.5"
{
	ParentBody     "Dina 6"

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

Moon	"Tamarena 6/Dina 6.6"
{
	ParentBody     "Dina 6"

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

Moon	"Tamarena 7/Dina 6.7"
{
	ParentBody     "Dina 6"

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

Moon	"Tamarena 8/Dina 6.8"
{
	ParentBody     "Dina 6"

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

Moon	"Tamarena 9/Dina 6.9"
{
	ParentBody     "Dina 6"

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

Moon	"Tamarena 10/Dina 6.10"
{
	ParentBody     "Dina 6"

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

Moon	"Tamarena 11/Dina 6.11"
{
	ParentBody     "Dina 6"

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

Moon	"Tamarena 12/Dina 6.12"
{
	ParentBody     "Dina 6"

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

Moon	"Tamarena 13/Dina 6.13"
{
	ParentBody     "Dina 6"

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

Moon	"Tamarena 14/Dina 6.14"
{
	ParentBody     "Dina 6"

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

Moon	"Tamarena 15/Dina 6.15"
{
	ParentBody     "Dina 6"

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

Moon	"Tamarena 16/Dina 6.16"
{
	ParentBody     "Dina 6"

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

Moon	"Tamarena 17/Dina 6.17"
{
	ParentBody     "Dina 6"

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

Moon	"Tamarena 18/Dina 6.18"
{
	ParentBody     "Dina 6"

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

Moon	"Tamarena 19/Dina 6.19"
{
	ParentBody     "Dina 6"

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

Moon	"Tamarena 20/Dina 6.20"
{
	ParentBody     "Dina 6"

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

Moon	"Tamarena 21/Dina 6.21"
{
	ParentBody     "Dina 6"

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
	
Planet	"Dulbris/Dina 7"
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

Moon	"Dulbris 1/Dina 7.1"
{
	ParentBody     "Dina 7"
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

Moon	"Dulbris 2/Dina 7.2"
{
	ParentBody     "Dina 7"
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

Moon	"Dulbris 3/Dina 7.3"
{
	ParentBody     "Dina 7"
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

Moon	"Dulbris 4/Dina 7.4"
{
	ParentBody     "Dina 7"
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

Moon	"Dulbris 5/Dina 7.5"
{
	ParentBody     "Dina 7"
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

Moon	"Dulbris 6/Dina 7.6"
{
	ParentBody     "Dina 7"
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

Moon	"Dulbris 7/Dina 7.7"
{
	ParentBody     "Dina 7"
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

Moon	"Dulbris 8/Dina 7.8"
{
	ParentBody     "Dina 7"
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

Moon	"Dulbris 9/Dina 7.9"
{
	ParentBody     "Dina 7"
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

Moon	"Dulbris 10/Dina 7.10"
{
	ParentBody     "Dina 7"
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

Moon	"Dulbris 11/Dina 7.11"
{
	ParentBody     "Dina 7"
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

Moon	"Dulbris 12/Dina 7.12"
{
	ParentBody     "Dina 7"
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

Moon	"Dulbris 13/Dina 7.13"
{
	ParentBody     "Dina 7"
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

Moon	"Dulbris 14/Dina 7.14"
{
	ParentBody     "Dina 7"
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

Moon	"Dulbris 15/Dina 7.15"
{
	ParentBody     "Dina 7"
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

Moon	"Dulbris 16/Dina 7.16"
{
	ParentBody     "Dina 7"
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

Moon	"Dulbris 17/Dina 7.17"
{
	ParentBody     "Dina 7"
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

Moon	"Dulbris 18/Dina 7.18"
{
	ParentBody     "Dina 7"
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

Moon	"Dulbris 19/Dina 7.19"
{
	ParentBody     "Dina 7"
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

Moon	"Dulbris 20/Dina 7.20"
{
	ParentBody     "Dina 7"
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

Moon	"Dulbris 21/Dina 7.21"
{
	ParentBody     "Dina 7"
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

Planet	"Purnell/Dina 8"
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

Moon	"Purnell 2/Dina 8.2"
{
	ParentBody     "Dina 8"

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

Moon	"Purnell 3/Dina 8.3"
{
	ParentBody     "Dina 8"

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

Moon	"Purnell 4/Dina 8.4"
{
	ParentBody     "Dina 8"

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

Moon	"Purnell 5/Dina 8.5"
{
	ParentBody     "Dina 8"

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

Moon	"Purnell 6/Dina 8.6"
{
	ParentBody     "Dina 8"

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

Moon	"Purnell 1/Parakus/Dina 8.1"
{
	ParentBody     "Dina 8"
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
