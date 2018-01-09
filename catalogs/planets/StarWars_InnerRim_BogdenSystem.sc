// http://starwars.wikia.com/wiki/Bogden/Legends
// Region : Inner Rim
// Sector : 
// Grid location : M8
// X : 1588.65, Y : 2669.82, Z : -268.1054535091305
Planet	"Bogden/Bogden Planet/Bogg"
{
	ParentBody     "Bogden System"
	Class	       "Terra"

	Mass            0.9234
	Radius          9731
	InertiaMoment   0.3314455

	Oblateness      0.02011874

	RotationPeriod  23
	RotationOffset  269.2099
	Obliquity       -2.195313
	EqAscendNode    269.6983

	Albedo          0.26
	Color          (0.133 0.694 0.298)

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
		colorUpland    (0.133, 0.694, 0.298, 0.000)
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
		Height          24.66016
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 0.584 0.301 1.000)
		mainFreq        6.925863
		mainOctaves     10
		Coverage        0.1567
		twistZones      1.5214
		twistMagn       0.910201
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
		Model          "Mars"
		Height          153.96852
		Density         100
		Pressure        1.550516
		Greenhouse      92.33102
		Bright          15
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
		SemiMajorAxis   1.483
		//Period          0.71209
		Eccentricity    0.0005060218
		Inclination     0.123
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Bogg 1"
{
	ParentBody      "Bogden Planet"
	Albedo          0.06
	Radius          32
	RotationOffset  242.9
	Obliquity       0.1
	EqAscendNode    346.7

	Orbit
	{
		//Period         0.0008060295333
		SemiMajorAxis  0.0003423729946
		Eccentricity   0.0004
		Inclination    5.167
		AscendingNode  8.998
		ArgOfPericen   30.956
		MeanAnomaly    7.538
	}
}

Moon	"Bogg 2"
{
	ParentBody     "Bogden Planet"
	Class          "Titan"

    Radius          3521      // Radius in km  
	Mass            0.2
    RotationPeriod  21        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.00090     // Orbital period in years 
		SemiMajorAxis  0.00071824
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Bogg 3"
{
	ParentBody     "Bogden Planet"
	Class          "Desert"

    Radius          1234      // Radius in km  
	Mass            0.2
    RotationPeriod  15        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.00114     // Orbital period in years 
		SemiMajorAxis  0.00075824
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Bogg 4"
{
	ParentBody     "Bogden Planet"
	Class          "Terra"

    Radius          5221      // Radius in km  
	Mass            0.6
    RotationPeriod  15        // Rotation period in hours 

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
        //Period         0.00152     // Orbital period in years 
		SemiMajorAxis  0.00079824
		Inclination    5.3
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Moon	"Bogg 5/Bogg V"
{
	ParentBody     "Bogden Planet"
	Class          "Terra"

    Radius          4218      // Radius in km  
	Mass            0.821
    RotationPeriod  20        // Rotation period in hours 

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
        //Period         0.00173     // Orbital period in years 
		SemiMajorAxis  0.00104824
		Inclination    62
		Eccentricity   0.07
		ArgOfPericen   9.2
	}
}

DwarfMoon	"Bogg 6"
{
	ParentBody      "Bogden Planet"
	Albedo          0.06
	Radius          62
	RotationOffset  242.9
	Obliquity       0.1
	EqAscendNode    346.7

	Orbit
	{
		//Period         0.00224
		SemiMajorAxis  0.0013421
		Eccentricity   0.0004
		Inclination    5.167
		AscendingNode  8.998
		ArgOfPericen   30.956
		MeanAnomaly    7.538
	}
}

DwarfMoon	"Bogg 7"
{
	ParentBody      "Bogden Planet"
	Albedo          0.06
	Radius          23
	RotationOffset  242.9
	Obliquity       0.1
	EqAscendNode    346.7

	Orbit
	{
		//Period         0.00229
		SemiMajorAxis  0.0015421
		Eccentricity   0.0001
		Inclination    23.321
		AscendingNode  8.998
		ArgOfPericen   30.956
		MeanAnomaly    7.538
	}
}

DwarfMoon	"Bogg 8"
{
	ParentBody      "Bogden Planet"
	Albedo          0.06
	Radius          66
	RotationOffset  242.9
	Obliquity       0.1
	EqAscendNode    346.7

	Orbit
	{
		//Period         0.00231
		SemiMajorAxis  0.0016194
		Eccentricity   0.0001
		Inclination    24.321
		AscendingNode  8.998
		ArgOfPericen   30.956
		MeanAnomaly    7.538
	}
}

Moon	"Bogg 9"
{
	ParentBody     "Bogden Planet"
	Class          "Titan"

    Radius          2521      // Radius in km  
	Mass            0.495
    RotationPeriod  25        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.002831     // Orbital period in years 
		SemiMajorAxis  0.0018412
		Inclination    0.1
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

DwarfMoon	"Bogg 10"
{
	ParentBody      "Bogden Planet"
	Albedo          0.06
	Radius          72
	RotationOffset  242.9
	Obliquity       0.1
	EqAscendNode    346.7

	Orbit
	{
		//Period         0.00342
		SemiMajorAxis  0.002589289109
		Eccentricity   0.0001
		Inclination    24.321
		AscendingNode  8.998
		ArgOfPericen   30.956
		MeanAnomaly    7.538
	}
}

Moon	"Bogg 11"
{
	ParentBody     "Bogden Planet"
	Class          "Desert"

    Radius          4216      // Radius in km  
	Mass            0.7
    RotationPeriod  25        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
        //Period         0.002831     // Orbital period in years 
		SemiMajorAxis  0.0026413
		Inclination    66.29
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

DwarfMoon	"Bogg 12"
{
	ParentBody      "Bogden Planet"
	Albedo          0.06
	Radius          14
	RotationOffset  242.9
	Obliquity       0.1
	EqAscendNode    346.7

	Orbit
	{
		//Period         0.00342
		SemiMajorAxis  0.003189289109
		Eccentricity   0.0005
		Inclination    0.12
		AscendingNode  8.998
		ArgOfPericen   30.956
		MeanAnomaly    7.538
	}
}

DwarfMoon	"Bogg 13"
{
	ParentBody      "Bogden Planet"
	Albedo          0.06
	Radius          14
	RotationOffset  242.9
	Obliquity       0.1
	EqAscendNode    346.7

	Orbit
	{
		//Period         0.004402
		SemiMajorAxis  0.003389289109
		Eccentricity   0.0005
		Inclination    0.12
		AscendingNode  8.998
		ArgOfPericen   30.956
		MeanAnomaly    7.538
	}
}

DwarfMoon	"Bogg 14"
{
	ParentBody      "Bogden Planet"
	Albedo          0.06
	Radius          14
	RotationOffset  242.9
	Obliquity       0.1
	EqAscendNode    346.7

	Orbit
	{
		//Period         0.00452
		SemiMajorAxis  0.003989289109
		Eccentricity   0.0005
		Inclination    0.12
		AscendingNode  8.998
		ArgOfPericen   30.956
		MeanAnomaly    7.538
	}
}

Planet	"Bog moon of Bogden/Bogg 15"
{
	ParentBody     "Bogden Planet"
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
		Biome   "Marine/Terrestrial"
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
		Height          14.66016
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        6.925863
		mainOctaves     10
		Coverage        0.1
		twistZones      1.5214
		twistMagn       0.910201
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
		SemiMajorAxis   0.0043
		//Period          0.0061209
		Eccentricity    0.0005060218
		Inclination     0.123
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Bogg 16"
{
	ParentBody      "Bogden Planet"
	Albedo          0.06
	Radius          14
	RotationOffset  242.9
	Obliquity       0.1
	EqAscendNode    346.7

	Orbit
	{
		//Period         0.007312
		SemiMajorAxis  0.0048132
		Eccentricity   0.0005
		Inclination    0.12
		AscendingNode  8.998
		ArgOfPericen   30.956
		MeanAnomaly    7.538
	}
}

Moon	"Bogg 17"
{
	ParentBody     "Bogden Planet"
	Class          "Selena"

    Radius          1428.9      // Radius in km  
	Mass            0.25
    RotationPeriod  33        // Rotation period in hours 

	Orbit
	{
		Epoch          2454762
		//Period         0.002831     // Orbital period in years 
		SemiMajorAxis  0.005342819
		Inclination    66.29
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}

Planet	"Kohlma/Bogg 18"
{
	ParentBody     "Bogden Planet"
	Class	       "Terra"

	Mass            0.7195672
	Radius          5412
	InertiaMoment   0.3314455

	Oblateness      0.01011874

	RotationPeriod  21
	RotationOffset  269.2099
	Obliquity       -2.195313
	EqAscendNode    269.6983

	Albedo          0.26
	Color          (0.364 0.478 0.509)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		Style           0.683656
		Randomize      (-0.395, -0.105, -0.234)
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
		cycloneMagn     2.967
		cycloneFreq     0.529
		cycloneDensity  0.059
		cycloneOctaves  1
		colorSea       (0.956, 0.623, 0.501, 1.000)
		colorShelf     (0.956, 0.623, 0.501, 1.000)
		colorBeach     (0.482, 0.521, 0.490, 0.000)
		colorDesert    (0.439, 0.509, 0.415, 0.000)
		colorLowland   (0.564, 0.745, 0.635, 0.000)
		colorUpland    (0.364, 0.478, 0.509, 0.000)
		colorRock      (0.490, 0.560, 0.560, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.016)
		colorLowPlants (0.576, 0.768, 0.654, 0.000)
		colorUpPlants  (0.356, 0.517, 0.494, 0.000)
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
		Color          (0.925 0.909 0.823 1.000)
		mainFreq        1.925863
		mainOctaves     10
		Coverage        0.212
		twistZones      2.089773
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
		SemiMajorAxis   0.006042819
		//Period          0.00353
		Eccentricity    0.0005060218
		Inclination     0.1317737
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Bogg 19"
{
	ParentBody      "Bogden Planet"
	Albedo          0.06
	Radius          12
	RotationOffset  242.9
	Obliquity       0.1
	EqAscendNode    346.7

	Orbit
	{
		//Period         0.00312
		SemiMajorAxis  0.006143921
		Eccentricity   0.0005
		Inclination    0.12
		AscendingNode  8.998
		ArgOfPericen   30.956
		MeanAnomaly    7.538
	}
}

Planet	"Bogden 3"
{
	ParentBody     "Bogden System"
	Class          "Terra"

    Radius          6321     // Radius in km  
	Mass            0.75
    RotationPeriod  13       // Rotation period in hours 

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Atmosphere
	{
		Model "Earth"
		
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
        //Period         1.4     // Orbital period in years 
		SemiMajorAxis  1.621
		Inclination    5.3
		Eccentricity   0.03
		ArgOfPericen   9.2
	}
}
