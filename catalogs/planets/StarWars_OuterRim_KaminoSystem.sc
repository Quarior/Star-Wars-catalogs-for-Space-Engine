// http://starwars.wikia.com/wiki/Kamino
// Region : Outer Rim
// Sector : 
// Grid location : S15
// X : 10657.33, Y : -7961.67, Z : -81.29159611949729
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
		SemiMajorAxis  0.5215
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
		SemiMajorAxis  0.7957
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

Planet	"Kamino"
{
	ParentBody		"Kamino System"
	Class	       	"Terra"

	Mass            0.622
	Radius          9635
	InertiaMoment   0.331229

	Oblateness      0.0145935

	RotationPeriod  27
	Obliquity       41.2731
	EqAscendNode    5.21515
	Precession      0

	AlbedoBond      0.68
	AlbedoGeom      0.816
	Brightness      2
	Color          (1.032 1.036 1.039)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		SurfStyle       0.388889
		OceanStyle      0
		Randomize      (-0.159, 0.508, 1.492)
		colorDistMagn   0.0444129
		colorDistFreq   1111.33
		detailScale     24781.8
		colorConversion true
		drivenDarkening -1
		seaLevel        0.992529
		snowLevel       1
		tropicLatitude  0.660159
		icecapLatitude  0.946754
		icecapHeight    0.350875
		climatePole     0.9375
		climateTropic   0.00793651
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.444444
		mainFreq        0.119048
		venusFreq       1
		venusMagn       1.19048
		mareFreq        5.61385
		mareDensity     0.00454748
		terraceProb     0.36845
		erosion         0.333333
		montesMagn      1.03175
		montesFreq      115.079
		montesSpiky     0.746032
		montesFraction  0.880952
		dunesMagn       0.0520476
		dunesFreq       52.0176
		dunesFraction   0.164054
		hillsMagn       4.04762
		hillsFreq       476.19
		hillsFraction   0.698413
		hills2Fraction  0.595238
		riversMagn      52.0654
		riversFreq      2.74413
		riversSin       6.15932
		riversOctaves   2
		canyonsMagn     0.0295663
		canyonsFreq     100
		canyonFraction  0.495517
		cracksMagn      0.0846368
		cracksFreq      0.964664
		cracksOctaves   0
		craterMagn      0.53824
		craterFreq      20.5395
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.7
		volcanoFreq     0.825397
		volcanoDensity  0.404762
		volcanoOctaves  5
		volcanoActivity 0.73171
		volcanoFlows    0.635894
		volcanoRadius   1
		volcanoTemp     1329.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.27879
		stripeFluct     0
		stripeTwist     0.0385466
		cycloneMagn     2.78912
		cycloneFreq     0.910219
		cycloneDensity  0.492844
		cycloneOctaves  4
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.250, 0.550, 0.390, 0.000)
		colorDesert    (0.250, 0.430, 0.280, 0.000)
		colorLowland   (0.140, 0.120, 0.100, 0.000)
		colorUpland    (0.610, 0.410, 0.250, 0.000)
		colorRock      (0.260, 0.260, 0.140, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.100, 0.160, 0.070, 0.000)
		colorUpPlants  (0.090, 0.110, 0.040, 0.000)
		BumpHeight      19.1429
		BumpOffset      21.4286
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          41.9805
		Velocity        80.6448
		BumpHeight      4.67268
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.42857
		mainOctaves     8
		Coverage        0.8
		stripeZones     2.27879
		stripeFluct     0
		stripeTwist     0.0385466
	}

	Ocean
	{
		Height          19
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          166.78
		Density         100
		Pressure        0.946
		Greenhouse      83.7629
		Bright          10.4762
		Opacity         1
		SkyLight        2.30159
		Hue             0
		Saturation      1

		Composition
		{
			N2    	77.7729
			O2    	20.8625
			Ar    	0.9303
			H2O   	0.4
			CO2   	0.0398
		}
	}

	Aurora
	{
		Height      219.303
		NorthLat    68.99
		NorthLon    -85.3579
		NorthRadius 3139.98
		NorthWidth  692.596
		NorthRings  3
		NorthBright 0.3
		NorthParticles 0
		SouthLat    -72.4796
		SouthLon    77.6318
		SouthRadius 2933
		SouthWidth  885.739
		SouthRings  2
		SouthBright 0.3
		SouthParticles 0
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Extrasolar"
		Epoch           2.45476e+006
		Period          1.26765
		Eccentricity    0.03
		Inclination     0.0389
		AscendingNode   0
		ArgOfPericenter 9.2
		MeanAnomaly     -9.2
	}
}

Moon	"Kamino 2"
{
	ParentBody     "Kamino"
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
	ParentBody     "Kamino"
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
		SemiMajorAxis   1.44530
		Eccentricity    0.0004060218
		Inclination     0.6317737
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
	}
}

Planet	"Miyuu"
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

