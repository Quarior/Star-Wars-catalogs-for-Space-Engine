// http://starwars.wikia.com/wiki/Dantooine
// Region : Outer Rim
// Sector : Raioballo Sector
// Grid location : L4
// X : 14.7, Y : 8378.27, Z : 571.2186377739656
Planet	"Doma"
{
	ParentBody     "Dina"
	Class          "Ferria"
	Mass			0.235

	NoAtmosphere	true

	Orbit
	{
		RefPlane        "Equator"
		//Period          0.0579520219
		SemiMajorAxis   0.155971535
		Eccentricity    0.0982159323
		Inclination     -2.20891059
		AscendingNode   147.795714
		ArgOfPericenter 118.051338
		MeanAnomaly     60.0506649
	}
}

Planet	"Camillo"
{
	ParentBody     "Dina"
	Class          "Terra"
	Mass			0.818

	NoOcean         true

	Atmosphere
	{
		Model          "Mars"
		Height          605.93
		Density         299.77
		Pressure        607.52
		Greenhouse      545.57
		Bright          10
		Opacity         1
		SkyLight        3.3333
		Hue             -0.0091768
		Saturation      0.90237
	}

	Orbit
	{
		RefPlane        "Equator"
		//Period          0.160469267
		SemiMajorAxis   0.307558407
		Eccentricity    0.0269098568
		Inclination     1.32541483
		AscendingNode   -26.8678917
		ArgOfPericenter 336.031906
		MeanAnomaly     206.803581
	}
}

DwarfMoon	"Camillo 1"
{
	ParentBody     "Camillo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.154477341
		SemiMajorAxisKm 10777.61758
		Eccentricity    6.98635413e-05
		Inclination     0.00495993892
		AscendingNode   -12.0274752
		ArgOfPericenter -170.993325
		MeanAnomaly     11.8882108
	}
}

DwarfMoon	"Camillo 2"
{
	ParentBody     "Camillo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.337790091
		SemiMajorAxisKm 16787.6128
		Eccentricity    3.4939446e-05
		Inclination     0.000401278683
		AscendingNode   -121.891094
		ArgOfPericenter 132.356422
		MeanAnomaly     -87.8979124
	}
}

DwarfMoon	"Camillo 3"
{
	ParentBody     "Camillo"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      2.90527315
		SemiMajorAxisKm 62076.1509
		Eccentricity    0.0876067281
		Inclination     13.7081504
		AscendingNode   -133.472245
		ArgOfPericenter 102.933476
		MeanAnomaly     75.6622448
	}
}

Planet	"Camooine"
{
	ParentBody     "Dina"
	Class          "Terra"
	Mass			1.109

	Orbit
	{
		RefPlane        "Equator"
		//Period          0.22060057
		SemiMajorAxis   0.680259079
		Eccentricity    0.016018341
		Inclination     -0.931245388
		AscendingNode   -99.0041352
		ArgOfPericenter 5.11410523
		MeanAnomaly     207.107902
	}
}

DwarfMoon	"Camooine 1"
{
	ParentBody     "Camooine"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.284492491
		SemiMajorAxisKm 17141.8733
		Eccentricity    2.89818128e-06
		Inclination     -0.0041976427
		AscendingNode   9.85957805
		ArgOfPericenter 12.9092458
		MeanAnomaly     -80.8607333
	}
}

DwarfMoon	"Camooine 2"
{
	ParentBody     "Camooine"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.338903522
		SemiMajorAxisKm 19263.2013
		Eccentricity    9.14471977e-05
		Inclination     0.0122909511
		AscendingNode   -11.095017
		ArgOfPericenter -6.30892801
		MeanAnomaly     151.782922
	}
}

Moon	"Camooine 3"
{
	ParentBody     "Camooine"
	Class          "Terra"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.865535568
		SemiMajorAxisKm 36102.7116
		Eccentricity    9.99808326e-05
		Inclination     1.22687634
		AscendingNode   -140.291203
		ArgOfPericenter -149.923044
		MeanAnomaly     -169.87455
	}
}

Planet	"Dantooine"
{
	ParentBody     "Dina"
	Class          "Terra"
	Mass            0.88177
	Radius          4915
	InertiaMoment   0.33088
	Oblateness      0.0039328
	RotationPeriod  25
	RotationEpoch   0
	Obliquity       -58.968
	EqAscendNode    55.892

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
		Preset         "terra_wet_yellow_plants.cfg"
		SurfStyle       0.78795
		Randomize      (-0.998, 0.995, 0.759)
		colorDistMagn   0.043688
		colorDistFreq   627.21
		detailScale     13934
		drivenDarkening -1
		seaLevel        0.1
		snowLevel       0.15079
		tropicLatitude  0.18254
		icecapLatitude  1.6641
		icecapHeight    0.25961
		climatePole     0.45
		climateTropic   0.54962
		climateEquator  0.59542
		climateSteppeMin 0.3125
		climateSteppeMax 0.5625
		climateForestMin 0.5
		climateForestMax 0.6875
		climateGrassMin  0.625
		climateGrassMax  0.8125
		humidity        1
		heightTempGrad  0.2395
		beachWidth      0.0015638
		tropicWidth     0.54444
		mainFreq        2.2519
		venusFreq       0.61322
		venusMagn       0.202
		mareFreq        4.4063
		mareDensity     0.019103
		terraceProb     0.55775
		erosion         0.8626
		montesMagn      0.21396
		montesFreq      423.37
		montesSpiky     0.62595
		montesFraction  0.349
		dunesMagn       0.068539
		dunesFreq       63.622
		dunesFraction   0.66166
		hillsMagn       0.14949
		hillsFreq       547.51
		hillsFraction   0
		hills2Fraction  0.32111
		riversMagn      56.576
		riversFreq      3.8463
		riversSin       7.2931
		riftsMagn       0
		riftsFreq       3.005
		riftsSin        5.6793
		canyonsMagn     0
		canyonsFreq     95.257
		canyonsFraction 0.11952
		cracksMagn      0
		cracksFreq      0
		cracksOctaves   1
		craterMagn      0.33262
		craterFreq      19.181
		craterDensity   0
		craterOctaves   1
		craterRayedFactor 0
		volcanoMagn     0.70093
		volcanoFreq     0.24427
		volcanoDensity  0.27594
		volcanoOctaves  1
		volcanoActivity 0.53908
		volcanoFlows    0.441
		volcanoRadius   0.43554
		volcanoTemp     330.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     0
		stripeTwist     -5.9542
		cycloneMagn     5.0382
		cycloneFreq     0.62712
		cycloneDensity  0.041865
		cycloneOctaves  1
		BumpHeight      25
		BumpOffset      14
		DiffMapAlpha   "Water"
		SpecBrightWater 2
		SpecBrightIce   2
		RoughnessWater  0.25463
		RoughnessIce    0.25463
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      2.2685
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           2.5
		Hapke           0
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      2
		ModulateBright  1
	}

	Clouds
	{
		Height          28.432
		Velocity        93.533
		BumpHeight      2.5745
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      2
		ModulateBright  1
		mainFreq        0.57252
		mainOctaves     17
		Coverage        0.38931
		stripeZones     0
		stripeTwist     -5.9542
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          64.495
		Density         100
		Pressure        0.896
		Greenhouse      10.857
		Bright          10
		Opacity         1
		SkyLight        3.2824
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
		Height         33.82
		NorthLat       86.183
		NorthLon       -99.607
		NorthRadius    1331.5
		NorthWidth     329.67
		NorthRings     5
		NorthBright    0.3
		NorthFlashFreq 78.27
		NorthMoveSpeed 0.93602
		NorthParticles 50000
		SouthLat       -64.854
		SouthLon       66.711
		SouthRadius    830.43
		SouthWidth     259.24
		SouthRings     4
		SouthBright    0.3
		SouthFlashFreq 62.801
		SouthMoveSpeed 0.95765
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
		Period          1.07869808
		SemiMajorAxis   1.09546778
		Eccentricity    0.029678032
		Inclination     -0.646970369
		AscendingNode   46.4951864
		ArgOfPericenter 298.895085
		MeanAnomaly     94.6212847
	}
}

Moon	"Dantooine 1"
{
	ParentBody     "Dantooine"
	Class          "Terra"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.951598482
		SemiMajorAxisKm 29043.4987
		Eccentricity    0.000222425544
		Inclination     -0.0569400438
		AscendingNode   -85.2997396
		ArgOfPericenter -86.8845354
		MeanAnomaly     175.949768
	}
}

Moon	"Dantooine 2"
{
	ParentBody     "Dantooine"
	Class          "Terra"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      2.33331713
		SemiMajorAxisKm 52745.5706
		Eccentricity    4.3625633e-05
		Inclination     0.00148409366
		AscendingNode   -93.4659423
		ArgOfPericenter -19.2486286
		MeanAnomaly     -152.580456
	}
}

Planet	"Bannakon"
{
	ParentBody     "Dina"
	Class          "Neptune"
	Mass			54.063

	Orbit
	{
		RefPlane        "Equator"
		//Period          1.12689415
		SemiMajorAxis   1.82791343
		Eccentricity    0.0416818977
		Inclination     -0.750349771
		AscendingNode   24.6348313
		ArgOfPericenter 28.9467083
		MeanAnomaly     82.1144194
	}
}

DwarfMoon	"Bannakon 1"
{
	ParentBody     "Bannakon"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.119284426
		SemiMajorAxisKm 38705.2802
		Eccentricity    8.33998457e-05
		Inclination     0.014049181
		AscendingNode   -87.2083263
		ArgOfPericenter 164.325818
		MeanAnomaly     -74.2890378
	}
}

DwarfMoon	"Bannakon 2"
{
	ParentBody     "Bannakon"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.171024263
		SemiMajorAxisKm 49213.721
		Eccentricity    9.04489349e-05
		Inclination     0.0102332287
		AscendingNode   -112.936952
		ArgOfPericenter 39.6433981
		MeanAnomaly     -54.9852272
	}
}

DwarfMoon	"Bannakon 3"
{
	ParentBody     "Bannakon"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.214556981
		SemiMajorAxisKm 57245.6932
		Eccentricity    9.90478098e-05
		Inclination     0.00452253804
		AscendingNode   38.2239292
		ArgOfPericenter 100.934948
		MeanAnomaly     170.814146
	}
}

DwarfMoon	"Bannakon 4"
{
	ParentBody     "Bannakon"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.304660631
		SemiMajorAxisKm 72320.032
		Eccentricity    6.54396825e-05
		Inclination     0.00993780661
		AscendingNode   -119.862705
		ArgOfPericenter -26.4702256
		MeanAnomaly     135.690535
	}
}

DwarfMoon	"Bannakon 5"
{
	ParentBody     "Bannakon"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.328333811
		SemiMajorAxisKm 76019.4618
		Eccentricity    4.33610098e-05
		Inclination     -0.00374197388
		AscendingNode   -64.5186267
		ArgOfPericenter 51.5134853
		MeanAnomaly     -102.115855
	}
}

DwarfMoon	"Bannakon 6"
{
	ParentBody     "Bannakon"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.349752162
		SemiMajorAxisKm 79290.5304
		Eccentricity    9.52589624e-05
		Inclination     0.00386523272
		AscendingNode   -135.506586
		ArgOfPericenter 44.949064
		MeanAnomaly     25.2571274
	}
}

Moon	"Bannakon 7"
{
	ParentBody     "Bannakon"
	Class          "Terra"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.891877658
		SemiMajorAxisKm 148004.101
		Eccentricity    0.000129032967
		Inclination     -0.122960203
		AscendingNode   17.8094317
		ArgOfPericenter 132.751116
		MeanAnomaly     129.365583
	}
}

Moon	"Bannakon 8"
{
	ParentBody     "Bannakon"
	Class          "Terra"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      1.75193402
		SemiMajorAxisKm 232129.107
		Eccentricity    0.0013752029
		Inclination     0.82959159
		AscendingNode   -148.78632
		ArgOfPericenter 176.170599
		MeanAnomaly     -63.8592444
	}
}

DwarfMoon	"Bannakon 9"
{
	ParentBody     "Bannakon"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      19.9408735
		SemiMajorAxisKm 1174565.31
		Eccentricity    0.44112466
		Inclination     137.721684
		AscendingNode   93.585452
		ArgOfPericenter -150.049977
		MeanAnomaly     169.396726
	}
}

DwarfMoon	"Bannakon 10"
{
	ParentBody     "Bannakon"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      21.2283112
		SemiMajorAxisKm 1224591.81
		Eccentricity    0.148156275
		Inclination     155.400456
		AscendingNode   115.457249
		ArgOfPericenter -159.294586
		MeanAnomaly     -118.019546
	}
}

DwarfMoon	"Bannakon 11"
{
	ParentBody     "Bannakon"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      23.6592736
		SemiMajorAxisKm 1316382.17
		Eccentricity    0.208545361
		Inclination     153.996144
		AscendingNode   95.4256291
		ArgOfPericenter 101.455167
		MeanAnomaly     -49.8094433
	}
}

Planet	"Tamarena"
{
	ParentBody     "Dina"
	Class          "Jupiter"
	Mass			99.89

	Orbit
	{
		RefPlane        "Equator"
		//Period          1.91206959
		SemiMajorAxis   2.60449288
		Eccentricity    0.0940077028
		Inclination     0.86029276
		AscendingNode   -54.0320859
		ArgOfPericenter 106.984924
		MeanAnomaly     135.473256
	}
}

DwarfMoon	"Tamarena 1"
{
	ParentBody     "Tamarena"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.501765207
		SemiMajorAxisKm 131061.903
		Eccentricity    6.20634366e-05
		Inclination     0.00435927759
		AscendingNode   -116.173142
		ArgOfPericenter 177.437537
		MeanAnomaly     -94.4807363
	}
}

DwarfMoon	"Tamarena 2"
{
	ParentBody     "Tamarena"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.540901163
		SemiMajorAxisKm 137791.169
		Eccentricity    1.58877798e-05
		Inclination     0.00337686288
		AscendingNode   -66.5249642
		ArgOfPericenter -24.9057785
		MeanAnomaly     18.9210076
	}
}

Moon	"Tamarena 3"
{
	ParentBody     "Tamarena"
	Class          "Aquaria"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      1.22361581
		SemiMajorAxisKm 237474.922
		Eccentricity    0.000186164136
		Inclination     -1.15264718
		AscendingNode   42.3544225
		ArgOfPericenter 99.1935384
		MeanAnomaly     -159.903123
	}
}

Moon	"Tamarena 4"
{
	ParentBody     "Tamarena"
	Class          "Aquaria"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      2.67972465
		SemiMajorAxisKm 400438.929
		Eccentricity    0.00591771491
		Inclination     1.44322614
		AscendingNode   -113.113867
		ArgOfPericenter -152.002924
		MeanAnomaly     -54.5421889
	}
}

DwarfMoon	"Tamarena 5"
{
	ParentBody     "Tamarena"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      5.86770248
		SemiMajorAxisKm 675234.82
		Eccentricity    0.0128547607
		Inclination     -0.96532181
		AscendingNode   52.4041061
		ArgOfPericenter -170.639793
		MeanAnomaly     29.7542809
	}
}

DwarfMoon	"Tamarena 6"
{
	ParentBody     "Tamarena"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      95.5115255
		SemiMajorAxisKm 4336905.51
		Eccentricity    0.224633974
		Inclination     211.133584
		AscendingNode   -149.932018
		ArgOfPericenter -22.7753454
		MeanAnomaly     172.976202
	}
}

DwarfMoon	"Tamarena 7"
{
	ParentBody     "Tamarena"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      98.7556315
		SemiMajorAxisKm 4434561.54
		Eccentricity    0.215188947
		Inclination     -26.6492521
		AscendingNode   -60.1617252
		ArgOfPericenter 24.1362593
		MeanAnomaly     -130.729656
	}
}

DwarfMoon	"Tamarena 8"
{
	ParentBody     "Tamarena"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      102.113496
		SemiMajorAxisKm 4534522.23
		Eccentricity    0.0823146587
		Inclination     227.030148
		AscendingNode   134.88341
		ArgOfPericenter -38.478505
		MeanAnomaly     12.5795146
	}
}

DwarfMoon	"Tamarena 9"
{
	ParentBody     "Tamarena"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      105.152841
		SemiMajorAxisKm 4624059.84
		Eccentricity    0.490516949
		Inclination     195.863971
		AscendingNode   -64.8256904
		ArgOfPericenter -75.3677252
		MeanAnomaly     -17.3717549
	}
}

DwarfMoon	"Tamarena 10"
{
	ParentBody     "Tamarena"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      107.821225
		SemiMajorAxisKm 4701960.32
		Eccentricity    0.00602933276
		Inclination     1.04042273
		AscendingNode   -164.12569
		ArgOfPericenter 7.95711452
		MeanAnomaly     170.939315
	}
}

DwarfMoon	"Tamarena 11"
{
	ParentBody     "Tamarena"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      109.305019
		SemiMajorAxisKm 4744999.67
		Eccentricity    0.451762954
		Inclination     201.129441
		AscendingNode   80.1492189
		ArgOfPericenter 112.621035
		MeanAnomaly     -136.385487
	}
}

DwarfMoon	"Tamarena 12"
{
	ParentBody     "Tamarena"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      112.04147
		SemiMajorAxisKm 4823866.78
		Eccentricity    0.413135441
		Inclination     3.62362841
		AscendingNode   130.922687
		ArgOfPericenter -24.4567223
		MeanAnomaly     -29.5955359
	}
}

DwarfMoon	"Tamarena 13"
{
	ParentBody     "Tamarena"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      114.99004
		SemiMajorAxisKm 4908132.24
		Eccentricity    0.07446617
		Inclination     -37.5408873
		AscendingNode   -154.048109
		ArgOfPericenter 139.72783
		MeanAnomaly     -3.05748803
	}
}

DwarfMoon	"Tamarena 14"
{
	ParentBody     "Tamarena"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      118.123432
		SemiMajorAxisKm 4996894.09
		Eccentricity    0.190625437
		Inclination     -29.2936369
		AscendingNode   -169.401468
		ArgOfPericenter 35.0617687
		MeanAnomaly     -12.9823282
	}
}

DwarfMoon	"Tamarena 15"
{
	ParentBody     "Tamarena"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      121.306478
		SemiMajorAxisKm 5086262.49
		Eccentricity    0.123625033
		Inclination     212.199906
		AscendingNode   -27.3298588
		ArgOfPericenter -131.003593
		MeanAnomaly     -108.23836
	}
}

DwarfMoon	"Tamarena 16"
{
	ParentBody     "Tamarena"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      122.76234
		SemiMajorAxisKm 5126876.77
		Eccentricity    0.498837724
		Inclination     153.135323
		AscendingNode   -66.2932983
		ArgOfPericenter 156.486266
		MeanAnomaly     72.6248699
	}
}

DwarfMoon	"Tamarena 17"
{
	ParentBody     "Tamarena"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      126.273719
		SemiMajorAxisKm 5224179.47
		Eccentricity    0.160533144
		Inclination     220.692355
		AscendingNode   61.0875836
		ArgOfPericenter 8.56084524
		MeanAnomaly     -104.983293
	}
}

DwarfMoon	"Tamarena 18"
{
	ParentBody     "Tamarena"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      127.618444
		SemiMajorAxisKm 5261203.14
		Eccentricity    0.231417588
		Inclination     164.764499
		AscendingNode   -164.666211
		ArgOfPericenter 68.9042177
		MeanAnomaly     99.484588
	}
}

DwarfMoon	"Tamarena 19"
{
	ParentBody     "Tamarena"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      131.162295
		SemiMajorAxisKm 5358157.12
		Eccentricity    0.20586521
		Inclination     204.812744
		AscendingNode   56.9805093
		ArgOfPericenter -122.18257
		MeanAnomaly     -32.6926944
	}
}

DwarfMoon	"Tamarena 20"
{
	ParentBody     "Tamarena"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      134.368826
		SemiMajorAxisKm 5445132.53
		Eccentricity    0.131528137
		Inclination     35.1200685
		AscendingNode   -52.605
		ArgOfPericenter 52.9387166
		MeanAnomaly     -172.622671
	}
}

DwarfMoon	"Tamarena 21"
{
	ParentBody     "Tamarena"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      138.036605
		SemiMajorAxisKm 5543775.29
		Eccentricity    0.0590129767
		Inclination     229.073136
		AscendingNode   -132.08524
		ArgOfPericenter -33.9034708
		MeanAnomaly     101.247191
	}
}

Planet	"Dulbris"
{
	ParentBody     "Dina"
	Class          "Neptune"
	Mass			8.324

	Orbit
	{
		RefPlane        "Equator"
		//Period          6.04076649
		SemiMajorAxis   3.95459741
		Eccentricity    0.0235029011
		Inclination     -4.25888008
		AscendingNode   -3.53353419
		ArgOfPericenter 198.349614
		MeanAnomaly     258.188536
	}
}

DwarfMoon	"Dulbris 1"
{
	ParentBody     "Dulbris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.152331623
		SemiMajorAxisKm 24418.393
		Eccentricity    3.35227933e-05
		Inclination     0.00992979858
		AscendingNode   -89.8137733
		ArgOfPericenter 8.49503246
		MeanAnomaly     13.9721563
	}
}

DwarfMoon	"Dulbris 2"
{
	ParentBody     "Dulbris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.316295967
		SemiMajorAxisKm 39742.2821
		Eccentricity    1.7196782e-05
		Inclination     -0.00921945115
		AscendingNode   -76.1537271
		ArgOfPericenter 12.3032009
		MeanAnomaly     -97.6464954
	}
}

Moon	"Dulbris 3"
{
	ParentBody     "Dulbris"
	Class          "Terra"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.470325019
		SemiMajorAxisKm 51775.5921
		Eccentricity    0.000151712302
		Inclination     0.351721619
		AscendingNode   -43.5473719
		ArgOfPericenter 106.35593
		MeanAnomaly     35.7328015
	}
}

Moon	"Dulbris 4"
{
	ParentBody     "Dulbris"
	Class          "Terra"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.968696744
		SemiMajorAxisKm 83814.6349
		Eccentricity    0.000819160894
		Inclination     0.226983377
		AscendingNode   65.8140166
		ArgOfPericenter 34.2875734
		MeanAnomaly     80.889857
	}
}

Moon	"Dulbris 5"
{
	ParentBody     "Dulbris"
	Class          "Terra"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      1.99032997
		SemiMajorAxisKm 135679.627
		Eccentricity    0.00079941313
		Inclination     1.34106254
		AscendingNode   -88.4903264
		ArgOfPericenter 122.014047
		MeanAnomaly     84.4879092
	}
}

Moon	"Dulbris 6"
{
	ParentBody     "Dulbris"
	Class          "Terra"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      4.10923302
		SemiMajorAxisKm 219638.984
		Eccentricity    0.0169900768
		Inclination     -1.09773282
		AscendingNode   127.280412
		ArgOfPericenter 157.224612
		MeanAnomaly     72.5201918
	}
}

Moon	"Dulbris 7"
{
	ParentBody     "Dulbris"
	Class          "Terra"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      8.46338841
		SemiMajorAxisKm 355552.887
		Eccentricity    0.00687637978
		Inclination     -1.45255083
		AscendingNode   -51.487477
		ArgOfPericenter 95.0206898
		MeanAnomaly     -147.750902
	}
}

DwarfMoon	"Dulbris 8"
{
	ParentBody     "Dulbris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      109.943234
		SemiMajorAxisKm 1964729.45
		Eccentricity    0.0590801666
		Inclination     157.142225
		AscendingNode   -19.4087332
		ArgOfPericenter 57.788345
		MeanAnomaly     163.289162
	}
}

DwarfMoon	"Dulbris 9"
{
	ParentBody     "Dulbris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      112.854639
		SemiMajorAxisKm 1999263.6
		Eccentricity    0.133040849
		Inclination     131.428874
		AscendingNode   4.98807234
		ArgOfPericenter 89.3548428
		MeanAnomaly     176.092185
	}
}

DwarfMoon	"Dulbris 10"
{
	ParentBody     "Dulbris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      120.655729
		SemiMajorAxisKm 2090365.99
		Eccentricity    0.0696763106
		Inclination     201.96456
		AscendingNode   122.664216
		ArgOfPericenter -145.203098
		MeanAnomaly     139.777035
	}
}

DwarfMoon	"Dulbris 11"
{
	ParentBody     "Dulbris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      124.228101
		SemiMajorAxisKm 2131426.01
		Eccentricity    0.481304949
		Inclination     -53.1994322
		AscendingNode   57.9928965
		ArgOfPericenter 115.733737
		MeanAnomaly     -48.9951483
	}
}

DwarfMoon	"Dulbris 12"
{
	ParentBody     "Dulbris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      129.818473
		SemiMajorAxisKm 2194899.79
		Eccentricity    0.23641162
		Inclination     206.78123
		AscendingNode   -86.9743146
		ArgOfPericenter 142.523731
		MeanAnomaly     -76.0099743
	}
}

DwarfMoon	"Dulbris 13"
{
	ParentBody     "Dulbris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      134.614443
		SemiMajorAxisKm 2248630.71
		Eccentricity    0.479026297
		Inclination     161.161519
		AscendingNode   -62.0118633
		ArgOfPericenter 80.5217532
		MeanAnomaly     68.1930734
	}
}

DwarfMoon	"Dulbris 14"
{
	ParentBody     "Dulbris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      141.952805
		SemiMajorAxisKm 2329626.79
		Eccentricity    0.0821847682
		Inclination     197.118852
		AscendingNode   -159.123048
		ArgOfPericenter -55.4994459
		MeanAnomaly     34.3338187
	}
}

DwarfMoon	"Dulbris 15"
{
	ParentBody     "Dulbris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      147.53653
		SemiMajorAxisKm 2390323.84
		Eccentricity    0.0589088615
		Inclination     180.450676
		AscendingNode   128.033714
		ArgOfPericenter -151.888791
		MeanAnomaly     83.0998892
	}
}

DwarfMoon	"Dulbris 16"
{
	ParentBody     "Dulbris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      155.447085
		SemiMajorAxisKm 2475020.23
		Eccentricity    0.0791436973
		Inclination     -21.3588059
		AscendingNode   137.570175
		ArgOfPericenter 45.2576305
		MeanAnomaly     -79.0744745
	}
}

DwarfMoon	"Dulbris 17"
{
	ParentBody     "Dulbris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      162.021751
		SemiMajorAxisKm 2544324.97
		Eccentricity    0.366089478
		Inclination     142.597498
		AscendingNode   117.520117
		ArgOfPericenter 170.260145
		MeanAnomaly     -102.784299
	}
}

DwarfMoon	"Dulbris 18"
{
	ParentBody     "Dulbris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      167.669861
		SemiMajorAxisKm 2603117.08
		Eccentricity    0.370365304
		Inclination     212.678031
		AscendingNode   30.5927651
		ArgOfPericenter 33.6831281
		MeanAnomaly     147.390558
	}
}

DwarfMoon	"Dulbris 19"
{
	ParentBody     "Dulbris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      176.396235
		SemiMajorAxisKm 2692670.66
		Eccentricity    0.18232146
		Inclination     228.444534
		AscendingNode   64.7252834
		ArgOfPericenter -163.87485
		MeanAnomaly     97.4027732
	}
}

DwarfMoon	"Dulbris 20"
{
	ParentBody     "Dulbris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      182.758384
		SemiMajorAxisKm 2757032.62
		Eccentricity    0.243108187
		Inclination     165.073414
		AscendingNode   22.7743861
		ArgOfPericenter -174.840496
		MeanAnomaly     -99.9482374
	}
}

DwarfMoon	"Dulbris 21"
{
	ParentBody     "Dulbris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      189.580404
		SemiMajorAxisKm 2825222.54
		Eccentricity    0.195075407
		Inclination     201.986894
		AscendingNode   150.341529
		ArgOfPericenter -59.9460103
		MeanAnomaly     157.936429
	}
}

DwarfMoon	"Dulbris 22"
{
	ParentBody     "Dulbris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      192.75162
		SemiMajorAxisKm 2856641.38
		Eccentricity    0.0977608887
		Inclination     11.0305339
		AscendingNode   -14.8828689
		ArgOfPericenter 100.265003
		MeanAnomaly     -142.341788
	}
}

DwarfMoon	"Dulbris 23"
{
	ParentBody     "Dulbris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      196.67085
		SemiMajorAxisKm 2895234.17
		Eccentricity    0.455023398
		Inclination     -37.7907386
		AscendingNode   173.829112
		ArgOfPericenter -131.090478
		MeanAnomaly     -172.849225
	}
}

DwarfMoon	"Dulbris 24"
{
	ParentBody     "Dulbris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      206.067184
		SemiMajorAxisKm 2986732.01
		Eccentricity    0.289891786
		Inclination     27.8803125
		AscendingNode   -155.100299
		ArgOfPericenter 148.211536
		MeanAnomaly     0.196418334
	}
}

DwarfMoon	"Dulbris 25"
{
	ParentBody     "Dulbris"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      212.719989
		SemiMajorAxisKm 3050674.7
		Eccentricity    0.0884349842
		Inclination     165.424043
		AscendingNode   71.4740128
		ArgOfPericenter -160.809578
		MeanAnomaly     86.2140696
	}
}

Planet	"Purnell"
{
	ParentBody     "Dina"
	Class          "Neptune"
	Mass			15.051

	Orbit
	{
		RefPlane        "Equator"
		Period          39.7743082
		SemiMajorAxis   9.5684739
		Eccentricity    0.0354363836
		Inclination     -0.69549881
		AscendingNode   -152.534746
		ArgOfPericenter 215.628616
		MeanAnomaly     38.8827387
	}
}

DwarfMoon	"Purnell 1"
{
	ParentBody     "Purnell"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.297212711
		SemiMajorAxisKm 46524.9772
		Eccentricity    1.1400138e-07
		Inclination     -0.0145628345
		AscendingNode   -137.009409
		ArgOfPericenter 77.2674591
		MeanAnomaly     178.910279
	}
}

DwarfMoon	"Purnell 2"
{
	ParentBody     "Purnell"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.347287194
		SemiMajorAxisKm 51613.9499
		Eccentricity    6.07253522e-05
		Inclination     0.00126565605
		AscendingNode   61.4460473
		ArgOfPericenter 101.996604
		MeanAnomaly     46.8734906
	}
}

DwarfMoon	"Purnell 3"
{
	ParentBody     "Purnell"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.404954462
		SemiMajorAxisKm 57180.1613
		Eccentricity    9.31528573e-05
		Inclination     -0.0135982002
		AscendingNode   47.4516334
		ArgOfPericenter 93.4198923
		MeanAnomaly     155.102632
	}
}

DwarfMoon	"Purnell 4"
{
	ParentBody     "Purnell"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.461195738
		SemiMajorAxisKm 62358.8513
		Eccentricity    9.36498667e-05
		Inclination     0.00329362792
		AscendingNode   60.5361235
		ArgOfPericenter 28.660515
		MeanAnomaly     -24.0696032
	}
}

DwarfMoon	"Purnell 5"
{
	ParentBody     "Purnell"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.908900624
		SemiMajorAxisKm 98020.953
		Eccentricity    0.00129309692
		Inclination     1.12707163
		AscendingNode   92.1037251
		ArgOfPericenter -165.309591
		MeanAnomaly     157.99714
	}
}

Moon	"Parakus/Purnell 6"
{
	ParentBody     "Purnell"
	Class          "Aquaria"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      1.70368018
		SemiMajorAxisKm 149017.584
		Eccentricity    0.0017040472
		Inclination     0.609975172
		AscendingNode   49.0952581
		ArgOfPericenter 27.2017714
		MeanAnomaly     9.4391987
	}
}
