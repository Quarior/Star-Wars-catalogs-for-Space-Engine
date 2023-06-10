// http://starwars.wikia.com/wiki/Malastare
// Region : Mid Rim
// Sector : Dustig Sector
// Grid location : N16
// X : 3124.93, Y : -10253.47, Z : 217.48959317312188
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

	Surface
	{
		volcanoMagn     0.56133
		volcanoFreq     1.1908
		volcanoDensity  0.48092
		volcanoOctaves  4
		volcanoActivity 1.2214
		volcanoFlows    0.51602
		volcanoRadius   0.49725
		volcanoTemp     1305.3
		lavaCoverTidal  0
		lavaCoverSun    0.2
		lavaCoverYoung  0
	}

	NoAtmosphere		true

	Orbit
	{
		RefPlane        "Equator"
		//Period          0.462369251
		SemiMajorAxis   0.590190706
		Eccentricity    0.0009
		Inclination     0.374
		AscendingNode   339
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
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
	Mass            1.633
	Radius          9440
	InertiaMoment   0.3309
	Oblateness      0.0056313
	RotationPeriod  26
	Obliquity       -19.237
	EqAscendNode    18.051

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		Preset         "terra_wet_yellow_green_plants.cfg"
		SurfStyle       0.074862
		Randomize      (0.540, 0.084, 0.478)
		colorDistMagn   0.077985
		colorDistFreq   1056.2
		detailScale     32768
		drivenDarkening 0
		seaLevel        0.12214
		snowLevel       2
		tropicLatitude  0.26239
		icecapLatitude  2
		icecapHeight    0.46938
		climatePole     0.56489
		climateTropic   0.55725
		climateEquator  0.53435
		climateSteppeMin 0.3125
		climateSteppeMax 0.5625
		climateForestMin 0.5
		climateForestMax 0.6875
		climateGrassMin  0.625
		climateGrassMax  0.8125
		humidity        0.74046
		heightTempGrad  0.375
		beachWidth      0.0010631
		tropicWidth     0.5
		mainFreq        1.8321
		venusFreq       0.98442
		venusMagn       0
		mareFreq        7.2682
		mareDensity     0
		terraceProb     0.39646
		erosion         0.13266
		montesMagn      0.21992
		montesFreq      530.52
		montesSpiky     0.88466
		montesFraction  0.07223
		dunesMagn       0.060038
		dunesFreq       75.337
		dunesFraction   0.28859
		hillsMagn       0.12577
		hillsFreq       721.04
		hillsFraction   0.40144
		hills2Fraction  0.35662
		riversMagn      51.982
		riversFreq      2.9314
		riversSin       8.7837
		riftsMagn       0
		riftsFreq       2.8918
		riftsSin        6.2445
		canyonsMagn     0.041852
		canyonsFreq     263.36
		canyonsFraction 0.65542
		cracksMagn      0.13889
		cracksFreq      0.85517
		cracksOctaves   0
		craterMagn      0.60257
		craterFreq      25.611
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.27481
		volcanoFreq     0.676
		volcanoDensity  0.38658
		volcanoOctaves  1
		volcanoActivity 0.35115
		volcanoFlows    0.39853
		volcanoRadius   0.50736
		volcanoTemp     364.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     0.076336
		stripeTwist     -1.0687
		cycloneMagn     0.61069
		cycloneFreq     0.16794
		cycloneDensity  0.068702
		cycloneOctaves  1
		BumpHeight      18.178
		BumpOffset      9.2527
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      1.0035
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           2.2195
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		ModulateBright  1
	}

	Clouds
	{
		Height          66.93
		Velocity        180.52
		BumpHeight      2.1355
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      2
		ModulateBright  1
		mainFreq        0.41221
		mainOctaves     8
		Coverage        0.29771
		stripeZones     0.076336
		stripeTwist     -1.0687
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          51.277
		Density         100
		Pressure        1.374
		Greenhouse      9.1603
		Bright          10.476
		Opacity         1
		SkyLight        2.3016
		Hue             0
		Saturation      1

		Composition
		{
			N2        	77.773
			O2        	20.862
			Ar        	0.9303
			H2O       	0.4
			CO2       	0.0398
		}
	}

	Aurora
	{
		Height         147.07
		NorthLat       70.638
		NorthLon       97.172
		NorthRadius    1706.5
		NorthWidth     718.11
		NorthRings     5
		NorthBright    0.6325
		NorthFlashFreq 80.246
		NorthMoveSpeed 1.113
		NorthParticles 50000
		SouthLat       -60.318
		SouthLon       -105.48
		SouthRadius    2445.7
		SouthWidth     662.7
		SouthRings     4
		SouthBright    0.6325
		SouthFlashFreq 68.196
		SouthMoveSpeed 0.82717
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Epoch           2454762
		Period          0.647284247
		//SemiMajorAxis   0.738579065
		Eccentricity    0.01
		Inclination     2.7480916
		AscendingNode   17
		ArgOfPericenter 4.2
		MeanAnomaly     -21.2
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
	Class	       "IceGiant"
	Mass		11.3

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

DwarfMoon	"Bingsang 1"
{
	ParentBody     "Bingsang"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.28808881
		SemiMajorAxisKm 44503.7238
		Eccentricity    4.31286799e-05
		Inclination     -0.00367153941
		AscendingNode   -23.3902885
		ArgOfPericenter -145.808946
		MeanAnomaly     4.95370704
	}
}

DwarfMoon	"Bingsang 2"
{
	ParentBody     "Bingsang"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.377293035
		SemiMajorAxisKm 53271.8711
		Eccentricity    5.54808641e-05
		Inclination     0.00638221388
		AscendingNode   150.356709
		ArgOfPericenter 36.6077687
		MeanAnomaly     -133.939862
	}
}

DwarfMoon	"Bingsang 3"
{
	ParentBody     "Bingsang"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.395994497
		SemiMajorAxisKm 55018.0076
		Eccentricity    4.26486305e-05
		Inclination     0.00246842836
		AscendingNode   -76.0247377
		ArgOfPericenter 151.632095
		MeanAnomaly     48.5064187
	}
}

DwarfMoon	"Bingsang 4"
{
	ParentBody     "Bingsang"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.440411938
		SemiMajorAxisKm 59058.8266
		Eccentricity    2.30361675e-05
		Inclination     -0.0121242428
		AscendingNode   153.627689
		ArgOfPericenter 113.183694
		MeanAnomaly     -145.601088
	}
}

DwarfMoon	"Bingsang 5"
{
	ParentBody     "Bingsang"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.451537872
		SemiMajorAxisKm 60049.3365
		Eccentricity    9.19741049e-05
		Inclination     -0.00777978372
		AscendingNode   -38.9592335
		ArgOfPericenter -146.849134
		MeanAnomaly     66.9047855
	}
}

DwarfMoon	"Bingsang 6"
{
	ParentBody     "Bingsang"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.483001637
		SemiMajorAxisKm 62807.4498
		Eccentricity    6.15616369e-05
		Inclination     -0.0111326737
		AscendingNode   56.7369288
		ArgOfPericenter -40.0930098
		MeanAnomaly     -118.585906
	}
}

Moon	"Bingsang 7"
{
	ParentBody     "Bingsang"
	Class          "Aquaria"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.907478256
		SemiMajorAxisKm 95632.1936
		Eccentricity    0.000578483916
		Inclination     -1.45981925
		AscendingNode   19.9065341
		ArgOfPericenter -109.764069
		MeanAnomaly     -111.287001
	}
}

DwarfMoon	"Bingsang 8"
{
	ParentBody     "Bingsang"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      8.41645496
		SemiMajorAxisKm 422148.154
		Eccentricity    0.0861696384
		Inclination     167.47526
		AscendingNode   11.225032
		ArgOfPericenter -99.9899658
		MeanAnomaly     71.3523528
	}
}

DwarfMoon	"Bingsang 9"
{
	ParentBody     "Bingsang"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      9.92242804
		SemiMajorAxisKm 471111.889
		Eccentricity    0.302894496
		Inclination     194.991372
		AscendingNode   151.088046
		ArgOfPericenter 83.8561339
		MeanAnomaly     34.0447388
	}
}

DwarfMoon	"Bingsang 10"
{
	ParentBody     "Bingsang"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      11.2448262
		SemiMajorAxisKm 512091.134
		Eccentricity    0.18446581
		Inclination     135.98296
		AscendingNode   171.818477
		ArgOfPericenter -50.3508231
		MeanAnomaly     -5.22405812
	}
}

DwarfMoon	"Bingsang 11"
{
	ParentBody     "Bingsang"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      14.5871954
		SemiMajorAxisKm 609106.581
		Eccentricity    0.151218901
		Inclination     162.668535
		AscendingNode   41.407413
		ArgOfPericenter 68.7347248
		MeanAnomaly     -40.9719147
	}
}

DwarfMoon	"Bingsang 12"
{
	ParentBody     "Bingsang"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      18.6962291
		SemiMajorAxisKm 718700.764
		Eccentricity    0.0620729327
		Inclination     168.741029
		AscendingNode   -16.149233
		ArgOfPericenter 178.147285
		MeanAnomaly     122.983466
	}
}

DwarfMoon	"Bingsang 13"
{
	ParentBody     "Bingsang"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      20.2501977
		SemiMajorAxisKm 757992.571
		Eccentricity    0.0570316124
		Inclination     134.471673
		AscendingNode   -144.788541
		ArgOfPericenter 47.3303528
		MeanAnomaly     98.9123037
	}
}

DwarfMoon	"Bingsang 14"
{
	ParentBody     "Bingsang"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      24.9836216
		SemiMajorAxisKm 871931.498
		Eccentricity    0.214488688
		Inclination     150.99727
		AscendingNode   -67.5833197
		ArgOfPericenter 53.3638035
		MeanAnomaly     -160.275365
	}
}

DwarfMoon	"Bingsang 15"
{
	ParentBody     "Bingsang"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      28.7814616
		SemiMajorAxisKm 958195.222
		Eccentricity    0.0607120105
		Inclination     144.708768
		AscendingNode   -69.6938578
		ArgOfPericenter -161.080917
		MeanAnomaly     36.3388678
	}
}

DwarfMoon	"Bingsang 16"
{
	ParentBody     "Bingsang"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      31.937209
		SemiMajorAxisKm 1027014.93
		Eccentricity    0.144196576
		Inclination     189.195083
		AscendingNode   -66.3735395
		ArgOfPericenter 129.505271
		MeanAnomaly     69.1142305
	}
}

Planet	"Melambo"
{
	ParentBody     "Striar"
	Class	       "GasGiant"
	Mass		306

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

DwarfMoon	"Melambo 1"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.331758126
		SemiMajorAxisKm 127996.56
		Eccentricity    4.72623847e-05
		Inclination     -0.0117826635
		AscendingNode   -178.135502
		ArgOfPericenter 62.0624974
		MeanAnomaly     -151.285768
	}
}

DwarfMoon	"Melambo 2"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.396994523
		SemiMajorAxisKm 144269.19
		Eccentricity    7.96991299e-05
		Inclination     -0.0106154038
		AscendingNode   -71.0092229
		ArgOfPericenter -38.0665985
		MeanAnomaly     98.2329235
	}
}

DwarfMoon	"Melambo 3"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.00441036
		SemiMajorAxisKm 268032.892
		Eccentricity    5.67131428e-05
		Inclination     0.137141288
		AscendingNode   -97.6994415
		ArgOfPericenter 100.089322
		MeanAnomaly     82.1371713
	}
}

Moon	"Melambo 4"
{
	ParentBody     "Melambo"
	Class          "Aquaria"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      2.16976562
		SemiMajorAxisKm 447636.863
		Eccentricity    0.00495238835
		Inclination     0.0625732807
		AscendingNode   177.998515
		ArgOfPericenter 146.61233
		MeanAnomaly     -177.231065
	}
}

Moon	"Melambo 5"
{
	ParentBody     "Melambo"
	Class          "Aquaria"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.6738526
		SemiMajorAxisKm 747590.193
		Eccentricity    0.00188940088
		Inclination     -0.468144547
		AscendingNode   -119.250764
		ArgOfPericenter -70.1782351
		MeanAnomaly     -72.8684491
	}
}

Moon	"Melambo 6"
{
	ParentBody     "Melambo"
	Class          "Aquaria"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      10.1068036
		SemiMajorAxisKm 1248536.8
		Eccentricity    0.0376560092
		Inclination     -1.41073098
		AscendingNode   145.255549
		ArgOfPericenter -75.1543133
		MeanAnomaly     177.901684
	}
}

Moon	"Melambo 7"
{
	ParentBody     "Melambo"
	Class          "Aquaria"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      21.805214
		SemiMajorAxisKm 2085158.62
		Eccentricity    0.00857681863
		Inclination     -1.42991612
		AscendingNode   113.946578
		ArgOfPericenter 117.312272
		MeanAnomaly     -67.0999881
	}
}

DwarfMoon	"Melambo 8"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      288.453298
		SemiMajorAxisKm 11660063.7
		Eccentricity    0.192172484
		Inclination     54.5155217
		AscendingNode   -18.4960358
		ArgOfPericenter -56.6900804
		MeanAnomaly     171.051308
	}
}

DwarfMoon	"Melambo 9"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      289.6856
		SemiMajorAxisKm 11693248.8
		Eccentricity    0.227368203
		Inclination     -27.0088879
		AscendingNode   -117.662223
		ArgOfPericenter -29.3498281
		MeanAnomaly     -106.010636
	}
}

DwarfMoon	"Melambo 10"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      291.723088
		SemiMajorAxisKm 11748013.9
		Eccentricity    0.439416961
		Inclination     149.898972
		AscendingNode   133.373787
		ArgOfPericenter -162.275057
		MeanAnomaly     7.62451314
	}
}

DwarfMoon	"Melambo 11"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      293.544984
		SemiMajorAxisKm 11796876.3
		Eccentricity    0.386530918
		Inclination     9.50955133
		AscendingNode   -47.9037335
		ArgOfPericenter -146.004334
		MeanAnomaly     -117.012331
	}
}

DwarfMoon	"Melambo 12"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      297.252095
		SemiMajorAxisKm 11895988.4
		Eccentricity    0.0570465177
		Inclination     132.54716
		AscendingNode   -19.7690242
		ArgOfPericenter -158.796415
		MeanAnomaly     -150.07907
	}
}

DwarfMoon	"Melambo 13"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      300.865616
		SemiMajorAxisKm 11992202.6
		Eccentricity    0.210458423
		Inclination     53.2017511
		AscendingNode   -116.745563
		ArgOfPericenter 92.9376371
		MeanAnomaly     16.9481912
	}
}

DwarfMoon	"Melambo 14"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      304.24198
		SemiMajorAxisKm 12081754.6
		Eccentricity    0.357613607
		Inclination     226.609394
		AscendingNode   -77.0889742
		ArgOfPericenter -147.477375
		MeanAnomaly     160.247306
	}
}

DwarfMoon	"Melambo 15"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      307.537307
		SemiMajorAxisKm 12168838.4
		Eccentricity    0.4972531
		Inclination     199.295159
		AscendingNode   -117.887128
		ArgOfPericenter 143.602719
		MeanAnomaly     -66.4011783
	}
}

DwarfMoon	"Melambo 16"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      310.452738
		SemiMajorAxisKm 12245623.8
		Eccentricity    0.0729332591
		Inclination     -13.4350911
		AscendingNode   79.3464602
		ArgOfPericenter -178.813732
		MeanAnomaly     -28.4024234
	}
}

DwarfMoon	"Melambo 17"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      313.467622
		SemiMajorAxisKm 12324776.2
		Eccentricity    0.115362849
		Inclination     -16.5576753
		AscendingNode   15.2867832
		ArgOfPericenter 105.123016
		MeanAnomaly     157.718737
	}
}

DwarfMoon	"Melambo 18"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      317.100638
		SemiMajorAxisKm 12419820.7
		Eccentricity    0.415599265
		Inclination     209.822977
		AscendingNode   -60.6530198
		ArgOfPericenter -159.255713
		MeanAnomaly     17.2501799
	}
}

DwarfMoon	"Melambo 19"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      320.854386
		SemiMajorAxisKm 12517643.3
		Eccentricity    0.0865477549
		Inclination     12.0207518
		AscendingNode   179.141634
		ArgOfPericenter -96.9623476
		MeanAnomaly     -25.9461059
	}
}

DwarfMoon	"Melambo 20"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      322.115354
		SemiMajorAxisKm 12550418.3
		Eccentricity    0.220504816
		Inclination     229.571577
		AscendingNode   17.8972171
		ArgOfPericenter 84.9901753
		MeanAnomaly     90.2724561
	}
}

DwarfMoon	"Melambo 21"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      325.415412
		SemiMajorAxisKm 12635991.6
		Eccentricity    0.0214845174
		Inclination     205.53994
		AscendingNode   -10.4434369
		ArgOfPericenter -119.033584
		MeanAnomaly     43.2340493
	}
}

DwarfMoon	"Melambo 22"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      327.302536
		SemiMajorAxisKm 12684796.3
		Eccentricity    0.490268585
		Inclination     182.197609
		AscendingNode   -112.962054
		ArgOfPericenter -12.5560997
		MeanAnomaly     -78.3765804
	}
}

DwarfMoon	"Melambo 23"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      330.822462
		SemiMajorAxisKm 12775578.6
		Eccentricity    0.0923692584
		Inclination     171.940797
		AscendingNode   98.4326762
		ArgOfPericenter 175.614936
		MeanAnomaly     175.360785
	}
}

DwarfMoon	"Melambo 24"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      332.303576
		SemiMajorAxisKm 12813681.5
		Eccentricity    0.378268769
		Inclination     173.947762
		AscendingNode   136.026257
		ArgOfPericenter 154.541576
		MeanAnomaly     70.4281339
	}
}

DwarfMoon	"Melambo 25"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      335.878476
		SemiMajorAxisKm 12905416.7
		Eccentricity    0.0311129789
		Inclination     169.523959
		AscendingNode   -61.8975741
		ArgOfPericenter -38.2830638
		MeanAnomaly     -134.613612
	}
}

DwarfMoon	"Melambo 26"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      339.511781
		SemiMajorAxisKm 12998317.8
		Eccentricity    0.253319884
		Inclination     218.632837
		AscendingNode   -107.232403
		ArgOfPericenter 23.8000806
		MeanAnomaly     -50.0778908
	}
}

DwarfMoon	"Melambo 27"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      342.875059
		SemiMajorAxisKm 13084019.4
		Eccentricity    0.246910964
		Inclination     186.283128
		AscendingNode   -9.96531668
		ArgOfPericenter -99.4391965
		MeanAnomaly     -73.7642898
	}
}

DwarfMoon	"Melambo 28"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      344.557567
		SemiMajorAxisKm 13126787.2
		Eccentricity    0.404852766
		Inclination     -4.18284982
		AscendingNode   -102.741876
		ArgOfPericenter -25.117894
		MeanAnomaly     -136.168426
	}
}

DwarfMoon	"Melambo 29"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      346.665363
		SemiMajorAxisKm 13180267.3
		Eccentricity    0.330742573
		Inclination     195.745578
		AscendingNode   -137.674157
		ArgOfPericenter 20.5029007
		MeanAnomaly     -30.8163978
	}
}

DwarfMoon	"Melambo 30"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      350.056121
		SemiMajorAxisKm 13266072.5
		Eccentricity    0.408820084
		Inclination     169.979719
		AscendingNode   -78.7963124
		ArgOfPericenter -54.3041813
		MeanAnomaly     93.0106671
	}
}

DwarfMoon	"Melambo 31"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      353.289191
		SemiMajorAxisKm 13347629.7
		Eccentricity    0.150038575
		Inclination     145.853648
		AscendingNode   -135.280496
		ArgOfPericenter 38.6024378
		MeanAnomaly     156.770318
	}
}

DwarfMoon	"Melambo 32"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      354.910482
		SemiMajorAxisKm 13388434.6
		Eccentricity    0.0403307497
		Inclination     15.715764
		AscendingNode   110.687417
		ArgOfPericenter -171.650348
		MeanAnomaly     178.536185
	}
}

DwarfMoon	"Melambo 33"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      356.991557
		SemiMajorAxisKm 13440720.4
		Eccentricity    0.36424678
		Inclination     167.072228
		AscendingNode   -2.66875832
		ArgOfPericenter 107.514577
		MeanAnomaly     -89.963814
	}
}

DwarfMoon	"Melambo 34"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      360.923726
		SemiMajorAxisKm 13539237.5
		Eccentricity    0.110157862
		Inclination     151.791443
		AscendingNode   60.7415713
		ArgOfPericenter -3.61480513
		MeanAnomaly     -51.0323417
	}
}

DwarfMoon	"Melambo 35"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      362.868597
		SemiMajorAxisKm 13587832.2
		Eccentricity    0.0417217434
		Inclination     197.660092
		AscendingNode   117.787303
		ArgOfPericenter 85.3217885
		MeanAnomaly     35.9488505
	}
}

DwarfMoon	"Melambo 36"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      364.087802
		SemiMajorAxisKm 13618251.1
		Eccentricity    0.00283946318
		Inclination     224.459695
		AscendingNode   160.567465
		ArgOfPericenter 20.3588562
		MeanAnomaly     -35.0483079
	}
}

DwarfMoon	"Melambo 37"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      367.967315
		SemiMajorAxisKm 13714819
		Eccentricity    0.231029689
		Inclination     159.843395
		AscendingNode   -176.081946
		ArgOfPericenter -68.827594
		MeanAnomaly     -156.736915
	}
}

DwarfMoon	"Melambo 38"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      370.933384
		SemiMajorAxisKm 13788420.9
		Eccentricity    0.477947846
		Inclination     146.754226
		AscendingNode   72.6621806
		ArgOfPericenter 58.2402728
		MeanAnomaly     -18.7798602
	}
}

DwarfMoon	"Melambo 39"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      373.591754
		SemiMajorAxisKm 13854220.8
		Eccentricity    0.217757198
		Inclination     29.4822866
		AscendingNode   -153.517112
		ArgOfPericenter 67.3865275
		MeanAnomaly     54.3095372
	}
}

DwarfMoon	"Melambo 40"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      377.178467
		SemiMajorAxisKm 13942752.3
		Eccentricity    0.233834137
		Inclination     150.833677
		AscendingNode   -154.093385
		ArgOfPericenter 9.36303218
		MeanAnomaly     -126.828011
	}
}

DwarfMoon	"Melambo 41"
{
	ParentBody     "Melambo"
	Class          "Asteroid"
	Mass            4.3437e-06

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      380.59072
		SemiMajorAxisKm 14026717.4
		Eccentricity    0.24296934
		Inclination     167.859615
		AscendingNode   80.8257762
		ArgOfPericenter -99.3638229
		MeanAnomaly     -69.844685
	}
}

DwarfMoon	"Melambo 42"
{
	ParentBody     "Melambo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      382.720759
		SemiMajorAxisKm 14079003.9
		Eccentricity    0.206342747
		Inclination     174.643356
		AscendingNode   -97.7008491
		ArgOfPericenter 32.2911034
		MeanAnomaly     -100.803276
	}
}

Planet	"Allmittal"
{
	ParentBody     "Striar"
	Class	       "IceGiant"
	Mass		12.122

	Orbit
	{
		SemiMajorAxis   4.865
		//Period          10.5
		Eccentricity    0.001
		Inclination     0.2
		AscendingNode   340
		ArgOfPericenter 6.2
		MeanAnomaly     135
		RefPlane       "Equator"
	}
}

DwarfMoon	"Allmittal 1"
{
	ParentBody     "Allmittal"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.253148283
		SemiMajorAxisKm 38468.5135
		Eccentricity    9.11046057e-05
		Inclination     -0.0110010091
		AscendingNode   96.2134924
		ArgOfPericenter 77.7447146
		MeanAnomaly     -111.552045
	}
}

DwarfMoon	"Allmittal 2"
{
	ParentBody     "Allmittal"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.268285955
		SemiMajorAxisKm 39987.1734
		Eccentricity    5.03032169e-05
		Inclination     -0.00636852375
		AscendingNode   110.89151
		ArgOfPericenter 74.5833409
		MeanAnomaly     56.2508521
	}
}

DwarfMoon	"Allmittal 3"
{
	ParentBody     "Allmittal"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.321922974
		SemiMajorAxisKm 45153.3589
		Eccentricity    2.56732288e-05
		Inclination     0.00633911513
		AscendingNode   146.626241
		ArgOfPericenter 3.39586973
		MeanAnomaly     49.3467857
	}
}

DwarfMoon	"Allmittal 4"
{
	ParentBody     "Allmittal"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.360247491
		SemiMajorAxisKm 48669.4073
		Eccentricity    4.57022429e-05
		Inclination     -0.000920465821
		AscendingNode   -106.306218
		ArgOfPericenter 26.0552338
		MeanAnomaly     87.9452703
	}
}

DwarfMoon	"Allmittal 5"
{
	ParentBody     "Allmittal"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.396770746
		SemiMajorAxisKm 51905.7149
		Eccentricity    9.01354905e-05
		Inclination     -0.00698671095
		AscendingNode   44.3499036
		ArgOfPericenter 127.707074
		MeanAnomaly     8.29644657
	}
}

DwarfMoon	"Allmittal 6"
{
	ParentBody     "Allmittal"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.404140219
		SemiMajorAxisKm 52546.4599
		Eccentricity    9.36153337e-05
		Inclination     0.00455420375
		AscendingNode   -8.51989822
		ArgOfPericenter 25.9162171
		MeanAnomaly     -18.5923666
	}
}

DwarfMoon	"Allmittal 7"
{
	ParentBody     "Allmittal"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.465973856
		SemiMajorAxisKm 57778.0812
		Eccentricity    9.52994324e-05
		Inclination     -0.00402925369
		AscendingNode   -162.035426
		ArgOfPericenter 3.47676147
		MeanAnomaly     67.2208579
	}
}

Moon	"Allmittal 8"
{
	ParentBody     "Allmittal"
	Class          "Aquaria"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.776258215
		SemiMajorAxisKm 81194.5548
		Eccentricity    0.000483829761
		Inclination     -0.763971335
		AscendingNode   171.942799
		ArgOfPericenter 146.879351
		MeanAnomaly     -68.1796297
	}
}

DwarfMoon	"Allmittal 9"
{
	ParentBody     "Allmittal"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.24586171
		SemiMajorAxisKm 111301.779
		Eccentricity    0.00277383695
		Inclination     1.21839707
		AscendingNode   61.7166669
		ArgOfPericenter 33.1911268
		MeanAnomaly     140.020671
	}
}

Moon	"Allmittal 10"
{
	ParentBody     "Allmittal"
	Class          "Aquaria"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.99905559
		SemiMajorAxisKm 152572.868
		Eccentricity    0.000905936991
		Inclination     1.05782618
		AscendingNode   -118.372404
		ArgOfPericenter -45.6005371
		MeanAnomaly     19.7313885
	}
}

Moon	"Allmittal 11"
{
	ParentBody     "Allmittal"
	Class          "Aquaria"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      3.20912348
		SemiMajorAxisKm 209147.42
		Eccentricity    0.00641362555
		Inclination     -1.12166967
		AscendingNode   107.900392
		ArgOfPericenter -6.51846905
		MeanAnomaly     64.6893189
	}
}

Moon	"Allmittal 12"
{
	ParentBody     "Allmittal"
	Class          "Aquaria"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.14832678
		SemiMajorAxisKm 286700.013
		Eccentricity    0.00942242984
		Inclination     0.569432288
		AscendingNode   -103.640141
		ArgOfPericenter 60.023552
		MeanAnomaly     119.266226
	}
}

DwarfMoon	"Allmittal 13"
{
	ParentBody     "Allmittal"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      46.2040564
		SemiMajorAxisKm 1237776.27
		Eccentricity    0.262811673
		Inclination     1.09153852
		AscendingNode   122.817976
		ArgOfPericenter -118.922389
		MeanAnomaly     116.408006
	}
}

DwarfMoon	"Allmittal 14"
{
	ParentBody     "Allmittal"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      49.629285
		SemiMajorAxisKm 1298217.4
		Eccentricity    0.400246319
		Inclination     -24.7298401
		AscendingNode   128.149067
		ArgOfPericenter 165.693874
		MeanAnomaly     -148.933251
	}
}

DwarfMoon	"Allmittal 15"
{
	ParentBody     "Allmittal"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      52.3501109
		SemiMajorAxisKm 1345242.21
		Eccentricity    0.318418879
		Inclination     220.849558
		AscendingNode   58.4418905
		ArgOfPericenter -66.5068811
		MeanAnomaly     -47.2674135
	}
}

DwarfMoon	"Allmittal 16"
{
	ParentBody     "Allmittal"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      56.628109
		SemiMajorAxisKm 1417566.59
		Eccentricity    0.110179919
		Inclination     215.163937
		AscendingNode   -35.3463036
		ArgOfPericenter -173.583289
		MeanAnomaly     78.9523146
	}
}
