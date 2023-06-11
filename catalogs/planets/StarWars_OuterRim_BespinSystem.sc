// http://starwars.wikia.com/wiki/Bespin
// Region : Outer Rim
// Sector : Anoat Sector
// Grid location : K18
// X : -1429.96, Y : -12747.85, Z : 290.8022723685475
Planet	"Miser"
{
	ParentBody     "Bespin system"
	Class          "Ferria"

	NoAtmosphere	true

	Orbit
	{
		RefPlane        "Equator"
		//Period          1.22462861
		SemiMajorAxis   1.19216366
		Eccentricity    0.03
		Inclination     0.1059
		AscendingNode   58.4345368
		ArgOfPericenter -129.160305
		MeanAnomaly     151.145038
	}
}

Planet	"Orin"
{
	ParentBody     "Bespin system"
	Class          "Terra"
	Mass            1.2838
	Radius          6783.8
	InertiaMoment   0.32867
	Oblateness      0.0086528
	RotationPeriod  14.352
	Obliquity       16.661
	EqAscendNode    47.804

	AlbedoBond      0.15
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "terra_arid_mars2_black.cfg"
		SurfStyle       0.70289
		Randomize      (-0.335, 0.650, -0.124)
		colorDistMagn   0.065013
		colorDistFreq   960.89
		detailScale     32768
		drivenDarkening 0
		seaLevel        0.13996
		snowLevel       2
		tropicLatitude  0.50571
		icecapLatitude  2
		icecapHeight    0.46948
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.5625
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0
		heightTempGrad  0.375
		beachWidth      0.00073542
		tropicWidth     0.5
		mainFreq        1.6794
		venusFreq       0.74809
		venusMagn       1.2214
		mareFreq        0.0048643
		mareDensity     0.12977
		terraceProb     0.29605
		erosion         0
		montesMagn      0.20204
		montesFreq      234.26
		montesSpiky     0.57252
		montesFraction  0.46304
		dunesMagn       1.2977
		dunesFreq       7633.6
		dunesFraction   0.56394
		hillsMagn       0.12067
		hillsFreq       699.89
		hillsFraction   0
		hills2Fraction  0
		riversMagn      0
		riversFreq      3.7843
		riversSin       5.8642
		riftsMagn       62.466
		riftsFreq       3.1684
		riftsSin        6.8976
		canyonsMagn     3.7405
		canyonsFreq     297.71
		canyonsFraction 0.1145
		cracksMagn      2.6718
		cracksFreq      6.1832
		cracksOctaves   2
		craterMagn      0.64325
		craterFreq      20.568
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.83969
		volcanoFreq     0.44275
		volcanoDensity  0.73282
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.75573
		volcanoRadius   0.73282
		volcanoTemp     3000
		lavaCoverTidal  0
		lavaCoverSun    0.61069
		lavaCoverYoung  0
		stripeZones     1.8529
		stripeTwist     0.11651
		cycloneMagn     4.1221
		cycloneFreq     1.374
		cycloneDensity  0.28244
		cycloneOctaves  7
		BumpHeight      24.943
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      1.2571
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          59.624
		Velocity        412.21
		BumpHeight      7.4083
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        1.0076
		mainOctaves     10
		Coverage        1
		stripeZones     1.8529
		stripeTwist     0.11651
	}

	Clouds
	{
		Height          59.624
		Velocity        115.29
		BumpHeight      6.1435
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        1.0076
		mainOctaves     10
		Coverage        1
		stripeZones     1.8529
		stripeTwist     0.11651
	}

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          748.79
		Density         20.88
		Pressure        93.07
		Greenhouse      762.08
		Bright          10
		Opacity         1
		SkyLight        3.3333
		Hue             0
		Saturation      1

		Composition
		{
			CO2       	76.105
			N2        	12.142
			H2O       	10.254
			SO2       	0.81599
			C2H2      	0.37788
			H2S       	0.13987
			C2H4      	0.086852
			NH3       	0.058427
			C2H6      	0.0088448
			CO        	0.006622
			CH4       	0.003284
			C3H8      	0.00012377
			Ar        	9.7861e-05
			C8H18     	3.0204e-05
		}
	}

	Aurora
	{
		Height         125.16
		NorthLat       71.126
		NorthLon       81.437
		NorthRadius    1514.5
		NorthWidth     411.19
		NorthRings     5
		NorthBright    0.34198
		NorthFlashFreq 67.88
		NorthMoveSpeed 0.95387
		NorthParticles 50000
		SouthLat       -70.958
		SouthLon       -89.524
		SouthRadius    2296.4
		SouthWidth     740.18
		SouthRings     4
		SouthBright    0.34198
		SouthFlashFreq 71.715
		SouthMoveSpeed 1.3791
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
		//Period          3.86791025
		SemiMajorAxis   3.42256059
		Eccentricity    0.345343511
		Inclination     -13.740458
		AscendingNode   52.2137405
		ArgOfPericenter 101.679389
		MeanAnomaly     -9.2
	}
}

Planet	"Bespin"
{
	ParentBody     "Bespin system"
	Class          "Jupiter"
	Mass            100.75
	Radius          59000
	InertiaMoment   0.28262
	OblatenessInfo  0.087979
	RotationPeriod  12
	Obliquity       1.2461
	EqAscendNode    324.96

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial/Aerial"
	}

	Surface
	{
		Preset         "jupiter_cold_default.cfg"
		SurfStyle       0.40938
		Randomize      (0.358, 0.508, -0.089)
		detailScale     256
		tropicLatitude  0.16271
		icecapLatitude  1
		mareDensity     0
		montesFraction  0
		dunesFraction   0
		hillsFraction   0
		hills2Fraction  0
		canyonsFraction 0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     0.22901
		stripeFluct     0.35115
		stripeTwist     5.3435
		cycloneMagn     7.3282
		cycloneFreq     1.3893
		cycloneDensity  0.19847
		cycloneOctaves  3
		cycloneMagn2     0.56333
		cycloneFreq2     0.53435
		cycloneLatitude2 0.92178
		cycloneOctaves2  3
		BumpHeight      30.8
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          476.83
		Velocity        926.7
		BumpHeight      56.664
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.66412
		mainOctaves     12
		Coverage        0.50382
		stripeZones     0.22901
		stripeFluct     0.35115
		stripeTwist     5.3435
	}

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          795.73
		Density         5377.1
		Pressure        1e+06
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             0
		Saturation      1

		Composition
		{
			H2        	92.923
			He        	6.7262
			CH4       	0.27377
			N2        	0.038901
			NH3       	0.022665
			O2        	0.0081847
			C2H2      	0.0030204
			C2H4      	0.0012214
			Ne        	0.00099603
			Ar        	0.00081998
			C2H6      	0.00052997
			C3H8      	0.00031675
			C8H18     	0.00031529
			H2O       	3.1561e-06
			CO2       	1.7408e-06
			H2S       	1.4851e-06
			Kr        	3.7027e-07
			Xe        	3.8844e-08
			SO2       	8.3685e-09
			CO        	3.4284e-10
			Cl2       	3.3335e-10
		}
	}

	Aurora
	{
		Height         1076.7
		NorthLat       84.132
		NorthLon       46.608
		NorthRadius    14775
		NorthWidth     8352
		NorthRings     5
		NorthBright    1
		NorthFlashFreq 76.414
		NorthMoveSpeed 0.84668
		NorthParticles 10000
		SouthLat       -82.583
		SouthLon       -132.16
		SouthRadius    14251
		SouthWidth     7811.2
		SouthRings     4
		SouthBright    1
		SouthFlashFreq 79.892
		SouthMoveSpeed 0.94646
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          14
		SemiMajorAxis   8.06866531
		Eccentricity    0.0152671756
		Inclination     351.8819
		AscendingNode   325.7146
		ArgOfPericenter 189.6115
		MeanAnomaly     141.9982
	}
}

DwarfMoon	"Bespin 1"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.258075633
		SemiMajorAxisKm 80971.0917
		Eccentricity    1.4230435e-05
		Inclination     -0.00462922324
		AscendingNode   143.454262
		ArgOfPericenter 166.592873
		MeanAnomaly     -29.4831729
	}
}

DwarfMoon	"Bespin 2"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.387038662
		SemiMajorAxisKm 106088.48
		Eccentricity    4.40591403e-05
		Inclination     -0.0058729781
		AscendingNode   -78.7928733
		ArgOfPericenter -174.476353
		MeanAnomaly     57.6095766
	}
}

DwarfMoon	"Bespin 3"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      0.569998946
		SemiMajorAxisKm 137324.501
		Eccentricity    0.00158331962
		Inclination     -0.989880997
		AscendingNode   -63.5421914
		ArgOfPericenter -13.1002855
		MeanAnomaly     158.867318
	}
}

DwarfMoon	"Bespin 4"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      1.19682243
		SemiMajorAxisKm 225174.12
		Eccentricity    0.0016688566
		Inclination     -0.627874298
		AscendingNode   128.583134
		ArgOfPericenter 89.4195401
		MeanAnomaly     -154.540302
	}
}

Moon	"H'gaard/Bespin 5"
{
	ParentBody     "Bespin"
	Class          "Aquaria"
	Radius		2500

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      2.5129459
		SemiMajorAxisKm 369223.146
		Eccentricity    0.00264428626
		Inclination     -0.509101567
		AscendingNode   -104.467454
		ArgOfPericenter 18.7205655
		MeanAnomaly     35.7532952
	}
}

Moon	"Drudonna/Bespin 6"
{
	ParentBody     "Bespin"
	Class          "Aquaria"
	Radius		1250

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      5.27640048
		SemiMajorAxisKm 605423.623
		Eccentricity    0.0149825923
		Inclination     1.14799127
		AscendingNode   11.857252
		ArgOfPericenter 5.85493773
		MeanAnomaly     137.292093
	}
}

DwarfMoon	"Bespin 7"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      66.3850455
		SemiMajorAxisKm 3275006.49
		Eccentricity    0.397583352
		Inclination     198.348054
		AscendingNode   44.1565692
		ArgOfPericenter -49.7400627
		MeanAnomaly     38.3873028
	}
}

DwarfMoon	"Bespin 8"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      67.5008396
		SemiMajorAxisKm 3311601.8
		Eccentricity    0.267018165
		Inclination     -46.1743127
		AscendingNode   8.40656768
		ArgOfPericenter 69.8831559
		MeanAnomaly     -172.954648
	}
}

DwarfMoon	"Bespin 9"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      68.5427598
		SemiMajorAxisKm 3345592.57
		Eccentricity    0.0865104912
		Inclination     194.422467
		AscendingNode   -51.3672236
		ArgOfPericenter 18.3768956
		MeanAnomaly     -142.952606
	}
}

DwarfMoon	"Bespin 10"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      71.6099679
		SemiMajorAxisKm 3444670.29
		Eccentricity    0.106025403
		Inclination     226.29462
		AscendingNode   33.2901952
		ArgOfPericenter -58.2056532
		MeanAnomaly     167.141435
	}
}

DwarfMoon	"Bespin 11"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      72.7789674
		SemiMajorAxisKm 3482057.35
		Eccentricity    0.293104954
		Inclination     205.01225
		AscendingNode   174.194572
		ArgOfPericenter -153.501089
		MeanAnomaly     105.624584
	}
}

DwarfMoon	"Bespin 12"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      74.3444694
		SemiMajorAxisKm 3531813.57
		Eccentricity    0.33784254
		Inclination     206.081018
		AscendingNode   24.3031662
		ArgOfPericenter -123.387069
		MeanAnomaly     112.742958
	}
}

DwarfMoon	"Bespin 13"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      77.3984061
		SemiMajorAxisKm 3627883.55
		Eccentricity    0.369283053
		Inclination     170.474039
		AscendingNode   -138.215431
		ArgOfPericenter -105.682016
		MeanAnomaly     84.8493891
	}
}

DwarfMoon	"Bespin 14"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      80.5814591
		SemiMajorAxisKm 3726679.79
		Eccentricity    0.219186302
		Inclination     199.852829
		AscendingNode   37.2525944
		ArgOfPericenter -45.1182609
		MeanAnomaly     119.693961
	}
}

DwarfMoon	"Bespin 15"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      82.4608932
		SemiMajorAxisKm 3784402.75
		Eccentricity    0.194091228
		Inclination     224.737469
		AscendingNode   -8.96077425
		ArgOfPericenter 118.286371
		MeanAnomaly     172.222342
	}
}

DwarfMoon	"Bespin 16"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      84.917819
		SemiMajorAxisKm 3859205.29
		Eccentricity    0.44161839
		Inclination     159.688491
		AscendingNode   97.3816286
		ArgOfPericenter -70.6664553
		MeanAnomaly     -79.7430592
	}
}

DwarfMoon	"Bespin 17"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      88.0896346
		SemiMajorAxisKm 3954715.07
		Eccentricity    0.121948235
		Inclination     134.562983
		AscendingNode   -37.6017756
		ArgOfPericenter 148.100956
		MeanAnomaly     -130.564129
	}
}

DwarfMoon	"Bespin 18"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      89.1146829
		SemiMajorAxisKm 3985335.04
		Eccentricity    0.220412659
		Inclination     165.907409
		AscendingNode   -147.271172
		ArgOfPericenter 42.6254368
		MeanAnomaly     136.784727
	}
}

DwarfMoon	"Bespin 19"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      92.4833783
		SemiMajorAxisKm 4085147.9
		Eccentricity    0.46213733
		Inclination     207.54965
		AscendingNode   141.713845
		ArgOfPericenter -154.312374
		MeanAnomaly     -77.703825
	}
}

DwarfMoon	"Bespin 20"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      94.7339791
		SemiMajorAxisKm 4151157.2
		Eccentricity    0.414672312
		Inclination     194.452766
		AscendingNode   -130.012464
		ArgOfPericenter 67.5731959
		MeanAnomaly     47.8923552
	}
}

DwarfMoon	"Bespin 21"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      95.9980897
		SemiMajorAxisKm 4188003.68
		Eccentricity    0.489548458
		Inclination     168.892973
		AscendingNode   -72.6396611
		ArgOfPericenter -113.314351
		MeanAnomaly     -126.854904
	}
}

DwarfMoon	"Bespin 22"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      98.3178174
		SemiMajorAxisKm 4255201.65
		Eccentricity    0.178697087
		Inclination     153.024339
		AscendingNode   -107.134743
		ArgOfPericenter 169.885669
		MeanAnomaly     147.128944
	}
}

DwarfMoon	"Bespin 23"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      101.248489
		SemiMajorAxisKm 4339346.82
		Eccentricity    0.486670443
		Inclination     29.5819732
		AscendingNode   -20.1566929
		ArgOfPericenter -155.567955
		MeanAnomaly     45.7819975
	}
}

DwarfMoon	"Bespin 24"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      103.472192
		SemiMajorAxisKm 4402652.7
		Eccentricity    0.144600439
		Inclination     6.5574378
		AscendingNode   -177.056969
		ArgOfPericenter -6.60085495
		MeanAnomaly     134.149567
	}
}

DwarfMoon	"Bespin 25"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      105.343639
		SemiMajorAxisKm 4455579.59
		Eccentricity    0.316833173
		Inclination     7.93171701
		AscendingNode   -26.0909281
		ArgOfPericenter -103.554036
		MeanAnomaly     42.8856349
	}
}

DwarfMoon	"Bespin 26"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      108.180846
		SemiMajorAxisKm 4535225.73
		Eccentricity    0.136176733
		Inclination     147.875067
		AscendingNode   -176.965192
		ArgOfPericenter -72.1882716
		MeanAnomaly     -101.612867
	}
}

DwarfMoon	"Bespin 27"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      110.238643
		SemiMajorAxisKm 4592557.11
		Eccentricity    0.0286997851
		Inclination     -48.5336449
		AscendingNode   153.154054
		ArgOfPericenter 33.413061
		MeanAnomaly     -124.063965
	}
}

DwarfMoon	"Bespin 28"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      111.967835
		SemiMajorAxisKm 4640458.03
		Eccentricity    0.414018431
		Inclination     146.032046
		AscendingNode   -96.9531787
		ArgOfPericenter -121.082285
		MeanAnomaly     -104.775744
	}
}

DwarfMoon	"Bespin 29"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      113.801757
		SemiMajorAxisKm 4690991.42
		Eccentricity    0.49200886
		Inclination     12.1611948
		AscendingNode   -152.865855
		ArgOfPericenter 10.6698671
		MeanAnomaly     127.636368
	}
}

DwarfMoon	"Bespin 30"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      115.742135
		SemiMajorAxisKm 4744163.56
		Eccentricity    0.451883275
		Inclination     151.48651
		AscendingNode   68.3369668
		ArgOfPericenter -138.658031
		MeanAnomaly     -165.334869
	}
}

DwarfMoon	"Bespin 31"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      117.493243
		SemiMajorAxisKm 4791894.57
		Eccentricity    0.0645666026
		Inclination     47.8905915
		AscendingNode   150.974087
		ArgOfPericenter 42.1881693
		MeanAnomaly     66.8348251
	}
}

DwarfMoon	"Bespin 32"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      120.370193
		SemiMajorAxisKm 4869801.93
		Eccentricity    0.244311481
		Inclination     178.963383
		AscendingNode   -49.4258257
		ArgOfPericenter -106.225707
		MeanAnomaly     2.5074113
	}
}

DwarfMoon	"Bespin 33"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      122.452768
		SemiMajorAxisKm 4925810.85
		Eccentricity    0.290489033
		Inclination     226.010493
		AscendingNode   -32.5231577
		ArgOfPericenter 77.059383
		MeanAnomaly     -164.05351
	}
}

DwarfMoon	"Bespin 34"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      125.549502
		SemiMajorAxisKm 5008511.3
		Eccentricity    0.145492921
		Inclination     -48.959842
		AscendingNode   81.0977841
		ArgOfPericenter -83.2961923
		MeanAnomaly     174.014083
	}
}

DwarfMoon	"Bespin 35"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      127.853023
		SemiMajorAxisKm 5069587.95
		Eccentricity    0.129694175
		Inclination     -9.82772116
		AscendingNode   171.732972
		ArgOfPericenter 178.478927
		MeanAnomaly     -129.124781
	}
}

DwarfMoon	"Bespin 36"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      130.66135
		SemiMajorAxisKm 5143555.39
		Eccentricity    0.239384313
		Inclination     137.784188
		AscendingNode   126.776921
		ArgOfPericenter 92.6533254
		MeanAnomaly     80.0853383
	}
}

DwarfMoon	"Bespin 37"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      133.371547
		SemiMajorAxisKm 5214437.33
		Eccentricity    0.218644238
		Inclination     137.950785
		AscendingNode   58.2300106
		ArgOfPericenter -154.769399
		MeanAnomaly     73.4355088
	}
}

DwarfMoon	"Bespin 38"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      136.781204
		SemiMajorAxisKm 5302934.64
		Eccentricity    0.24107641
		Inclination     198.376549
		AscendingNode   -151.630128
		ArgOfPericenter 48.9137242
		MeanAnomaly     -14.069549
	}
}

DwarfMoon	"Bespin 39"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      139.736027
		SemiMajorAxisKm 5379033.56
		Eccentricity    0.162337811
		Inclination     208.080708
		AscendingNode   110.461838
		ArgOfPericenter -124.329045
		MeanAnomaly     176.274379
	}
}

DwarfMoon	"Bespin 40"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      143.449368
		SemiMajorAxisKm 5473911.27
		Eccentricity    0.429411183
		Inclination     180.5038
		AscendingNode   -98.6165439
		ArgOfPericenter -57.2216761
		MeanAnomaly     -57.7603474
	}
}

DwarfMoon	"Bespin 41"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      146.110552
		SemiMajorAxisKm 5541402.74
		Eccentricity    0.357552048
		Inclination     54.2245279
		AscendingNode   -66.9619409
		ArgOfPericenter -65.7863279
		MeanAnomaly     -139.706758
	}
}

DwarfMoon	"Bespin 42"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      149.756126
		SemiMajorAxisKm 5633198.55
		Eccentricity    0.110849014
		Inclination     221.736322
		AscendingNode   -40.567595
		ArgOfPericenter 109.277261
		MeanAnomaly     -131.143993
	}
}

DwarfMoon	"Bespin 43"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      151.36009
		SemiMajorAxisKm 5673350.02
		Eccentricity    0.347334854
		Inclination     148.865655
		AscendingNode   -13.7066253
		ArgOfPericenter 100.313936
		MeanAnomaly     64.5697814
	}
}

DwarfMoon	"Bespin 44"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      153.494632
		SemiMajorAxisKm 5726564.03
		Eccentricity    0.114585878
		Inclination     226.362026
		AscendingNode   -79.9012655
		ArgOfPericenter 11.4118617
		MeanAnomaly     110.947283
	}
}

DwarfMoon	"Bespin 45"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      155.695582
		SemiMajorAxisKm 5781176.12
		Eccentricity    0.206747072
		Inclination     215.254702
		AscendingNode   -76.6030406
		ArgOfPericenter -80.0471893
		MeanAnomaly     88.7798231
	}
}

DwarfMoon	"Bespin 46"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      158.549038
		SemiMajorAxisKm 5851596.91
		Eccentricity    0.318920534
		Inclination     226.519163
		AscendingNode   -126.708879
		ArgOfPericenter 92.8890212
		MeanAnomaly     -52.3221652
	}
}

DwarfMoon	"Bespin 47"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      161.600266
		SemiMajorAxisKm 5926432.94
		Eccentricity    0.459854675
		Inclination     148.622269
		AscendingNode   9.96183484
		ArgOfPericenter -0.378385847
		MeanAnomaly     -151.880786
	}
}

DwarfMoon	"Bespin 48"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      164.099881
		SemiMajorAxisKm 5987389.4
		Eccentricity    0.208871714
		Inclination     212.079141
		AscendingNode   -87.895725
		ArgOfPericenter 53.3555744
		MeanAnomaly     173.380471
	}
}

DwarfMoon	"Bespin 49"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      167.113404
		SemiMajorAxisKm 6060468.29
		Eccentricity    0.0279709479
		Inclination     180.084269
		AscendingNode   -133.845754
		ArgOfPericenter 22.8062929
		MeanAnomaly     80.7256952
	}
}

DwarfMoon	"Bespin 50"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      171.033675
		SemiMajorAxisKm 6154882.21
		Eccentricity    0.465045305
		Inclination     229.279332
		AscendingNode   146.178319
		ArgOfPericenter 26.132673
		MeanAnomaly     31.2283331
	}
}

DwarfMoon	"Bespin 51"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      173.190136
		SemiMajorAxisKm 6206509.58
		Eccentricity    0.209148679
		Inclination     159.72024
		AscendingNode   -68.696966
		ArgOfPericenter 28.9717976
		MeanAnomaly     147.600777
	}
}

DwarfMoon	"Bespin 52"
{
	ParentBody     "Bespin"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		//PeriodDays      176.343689
		SemiMajorAxisKm 6281624.06
		Eccentricity    0.0837515417
		Inclination     -35.0835208
		AscendingNode   -162.441841
		ArgOfPericenter -21.5498398
		MeanAnomaly     19.4067698
	}
}
