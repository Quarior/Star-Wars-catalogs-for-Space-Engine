// http://starwars.wikia.com/wiki/Ahch-To
// Region : Unknown Regions
// Sector : 
// Grid location : E13
// X : -9774.08, Y : -5568.55, Z : 340.9318283986788

Planet	"Ahch-To/Ahch-To System 2"
{
	ParentBody     "Ahch-To System"
	Class	       "Terra"

	Mass            1
	Radius          6429
	InertiaMoment   0.329536

	Oblateness      0.00821657

	RotationPeriod  20.4723
	Obliquity       -194.286
	EqAscendNode    -68.1594

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      1.19048
	Color          (0.694 0.707 0.760)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
		Panspermia "false"
	}

	Surface
	{
		SurfStyle       0.807936
		OceanStyle      0
		Randomize      (-0.969, 0.220, 0.938)
		colorDistMagn   0.0600675
		colorDistFreq   733.762
		detailScale     16535.7
		colorConversion true
		drivenDarkening -1
		seaLevel        0.82673
		snowLevel       1.25
		tropicLatitude  0.360069
		icecapLatitude  0.809524
		icecapHeight    0.888603
		climatePole     0.9375
		climateTropic   0.4125
		climateEquator  0.6875
		heightTempGrad  0
		tropicWidth     0.07
		mainFreq        50
		venusFreq       1.88889
		venusMagn       0.238095
		mareFreq        6.05376
		mareDensity     0.0599755
		terraceProb     0.446393
		erosion         0.72403
		montesMagn      0.134921
		montesFreq      69.3651
		montesSpiky     0.452381
		montesFraction  0.861905
		dunesMagn       0.0593283
		dunesFreq       54.5411
		dunesFraction   0.390908
		hillsMagn       2.4127
		hillsFreq       62.381
		hillsFraction   0.31568
		hills2Fraction  0.708748
		riversMagn      5.1893
		riversFreq      1.78733
		riversSin       4.50243
		riversOctaves   2
		canyonsMagn     0.0323704
		canyonsFreq     70
		canyonFraction  0.368932
		cracksMagn      0.12433
		cracksFreq      0.484546
		cracksOctaves   0
		craterMagn      0.642368
		craterFreq      17.7416
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.893651
		volcanoFreq     1.25397
		volcanoDensity  0.054286
		volcanoOctaves  5
		volcanoActivity 0.396825
		volcanoFlows    0.667558
		volcanoRadius   0.888889
		volcanoTemp     1698.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.27879
		stripeFluct     0
		stripeTwist     0.0385466
		cycloneMagn     1.94412
		cycloneFreq     0.861255
		cycloneDensity  0.310285
		cycloneOctaves  4
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.820, 0.730, 0.570, 0.000)
		colorDesert    (0.380, 0.320, 0.220, 0.000)
		colorLowland   (0.220, 0.230, 0.220, 0.000)
		colorUpland    (0.620, 0.620, 0.620, 0.000)
		colorRock      (0.100, 0.100, 0.100, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.100, 0.160, 0.070, 0.000)
		colorUpPlants  (0.090, 0.110, 0.040, 0.000)
		BumpHeight      8.93651
		BumpOffset      1.5873
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
		BumpHeight      2.38095
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.666667
		mainOctaves     17
		Coverage        0.642857
		stripeZones     2.27879
		stripeFluct     0
		stripeTwist     0.0385466
	}

	Ocean
	{
		Height          7.38808
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	Atmosphere
	{
		Model          "Earth"
		Height          621.8
		Density         1
		Pressure        1
		Greenhouse      66.6667
		Bright          4.60341
		Opacity         0.849349
		SkyLight        7.77817
		Hue             -0.00793651
		Saturation      1.4127

		Composition
		{
			N2    	78.951
			O2    	20.7233
			CO2   	0.258892
			H2O   	0.0497247
			Ne    	0.0170738
		}
	}

	Aurora
	{
		Height      101.147
		NorthLat    54.3051
		NorthLon    -72.4866
		NorthRadius 1437.86
		NorthWidth  255.45
		NorthRings  2
		NorthBright 0.3
		NorthParticles 0
		SouthLat    -35.2371
		SouthLon    101.321
		SouthRadius 2401.61
		SouthWidth  481.227
		SouthRings  5
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
		RefPlane        "Equator"
		SemiMajorAxis   1.7
		Period          2.41072
		Eccentricity    0.0267387
		Inclination     -12.1434
		AscendingNode   -73.8178
		ArgOfPericenter 142.31
		MeanAnomaly     219.461
	}
}

Moon	"Ahch-To's Moon/Ahch-To System 2.1"
{
	ParentBody     "Ahch-To System 2"
	Class	       "Selena"

	Mass            0.007083
	Radius          1578.81
	InertiaMoment   0.381806

	Oblateness      0.0113185

	Obliquity       1.16698
	EqAscendNode    -89.3984
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.670 0.668 0.665)

	Surface
	{
		SurfStyle       0.804256
		OceanStyle      0.972388
		Randomize      (0.292, -0.183, -0.421)
		colorDistMagn   0.0565949
		colorDistFreq   194.872
		detailScale     4060.8
		colorConversion true
		drivenDarkening 0
		seaLevel        0.263038
		snowLevel       2
		tropicLatitude  0.02895
		icecapLatitude  10
		icecapHeight    0.202794
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.87011
		venusFreq       1.1399
		venusMagn       0
		mareFreq        0.729643
		mareDensity     0.002004
		terraceProb     0.243709
		erosion         0
		montesMagn      0.0647608
		montesFreq      65.3174
		montesSpiky     0.962869
		montesFraction  0.158491
		dunesMagn       0.0529556
		dunesFreq       2078.82
		dunesFraction   0.710678
		hillsMagn       0.115288
		hillsFreq       209.422
		hillsFraction   0.184838
		hills2Fraction  0
		riversMagn      60.2298
		riversFreq      2.992
		riversSin       6.95829
		riversOctaves   0
		canyonsMagn     0.639267
		canyonsFreq     0.533651
		canyonFraction  0.365672
		cracksMagn      0.0485774
		cracksFreq      0.399368
		cracksOctaves   0
		craterMagn      0.665046
		craterFreq      2.83105
		craterDensity   0.601245
		craterOctaves   6.83412
		craterRayedFactor 0.146174
		volcanoMagn     0.216753
		volcanoFreq     0.696143
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.274027
		volcanoRadius   0.180783
		volcanoTemp     1658.61
		lavaCoverTidal  0.420796
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.400, 0.350, 0.320, 0.000)
		colorShelf     (0.470, 0.410, 0.380, 0.000)
		colorBeach     (0.375, 0.314, 0.279, 0.000)
		colorDesert    (0.342, 0.294, 0.246, 0.000)
		colorLowland   (0.261, 0.227, 0.186, 0.000)
		colorUpland    (0.442, 0.401, 0.346, 0.000)
		colorRock      (0.670, 0.620, 0.550, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000613922
		Period          0.00238751
		Eccentricity    0.0406848
		Inclination     1.16698
		AscendingNode   -89.3984
		ArgOfPericenter -85.0749
		MeanAnomaly     -70.6778
	}
}

///////////////
// GENERATED //
///////////////

/*Barycenter	"Ahch-To System"
{
	ParentBody     "Ahch-To System"
	Mass            518858
	Radius          2.37433e+008
	RotationPeriod  24
	Obliquity       0
	EqAscendNode    0


	Orbit
	{
		RefPlane        "Static"
		SemiMajorAxis   0
		Period          0
		Eccentricity    0
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}*/

Star	"Ahch-To System A"
{
	ParentBody     "Ahch-To System"
	Class	       "G4.3 V"
	Luminosity      1.15448
	MassSol         1.08792
	RadSol          1.21194
	Teff            5791

	Age             2.13617

	InertiaMoment   0.0579779

	Obliquity       -13.2194
	EqAscendNode    -75.0602
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.869 0.818)

	Surface
	{
		Randomize      (0.483, 0.678, -0.754)
		colorDistMagn   0.63939
		colorDistFreq   11.1971
		detailScale     2.16955e+006
		colorConversion true
		tropicLatitude  0.5
		icecapLatitude  1
		mareFreq        36.5378
		mareDensity     0.0109742
		erosion         1
		montesFreq      537
		dunesMagn       0.5
		hillsMagn       0.03
		hillsFreq       5062.94
		craterOctaves   0
		BumpHeight      696.063
		BumpOffset      696.063
		SpecBrightWater 0
		SpecBrightIce   0
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          8435.09
		Density         0
		Pressure        1
		Bright          10
		Opacity         0
		SkyLight        0
		Hue             0
		Saturation      1
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	Corona
	{
		Radius      4.5005e+006
		Period      0.0258964
		Brightness  0.5
		RayDensity  3.4278
		RayCurv     18.2563
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0959486
		Period          0.175199
		Eccentricity    0.197474
		Inclination     -13.2194
		AscendingNode   -75.0602
		ArgOfPericenter -39.5097
		MeanAnomaly     -119.229
	}
}

Star	"Ahch-To System B"
{
	ParentBody     "Ahch-To System"
	Class	       "M1.1 V"
	Luminosity      0.0211155
	MassSol         0.460734
	RadSol          0.530744
	Teff            3706

	Age             2.13617

	InertiaMoment   0.0822175

	Obliquity       -13.2194
	EqAscendNode    -75.0602
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (1.000 0.586 0.300)

	Surface
	{
		Randomize      (-0.491, 0.524, -0.968)
		colorDistMagn   0.443632
		colorDistFreq   9.21467
		detailScale     950113
		colorConversion true
		tropicLatitude  0.53528
		icecapLatitude  1.02352
		mareFreq        21.4289
		mareDensity     0.0136313
		erosion         1
		montesFreq      537
		dunesMagn       0.532276
		hillsMagn       0.03
		hillsFreq       2458.34
		craterOctaves   0
		BumpHeight      468.411
		BumpOffset      468.411
		SpecBrightWater 0
		SpecBrightIce   0
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          3693.98
		Density         0
		Pressure        1
		Bright          10
		Opacity         0
		SkyLight        0
		Hue             0
		Saturation      1
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	Corona
	{
		Radius      2.06086e+006
		Period      0.03629
		Brightness  0.5
		RayDensity  2.55451
		RayCurv     13.5049
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.22656
		Period          0.175199
		Eccentricity    0.197474
		Inclination     -13.2194
		AscendingNode   -75.0602
		ArgOfPericenter 140.49
		MeanAnomaly     -119.229
	}
}

DwarfPlanet	"Ahch-To System B1"
{
	ParentBody     "Ahch-To System B"
	Class	       "Selena"

	Mass            0.00225725
	Radius          783.366
	InertiaMoment   0.399573

	Obliquity       2.39272
	EqAscendNode    37.6681
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.900 0.735 0.462)

	Surface
	{
		SurfStyle       0.596304
		OceanStyle      0.0619597
		Randomize      (0.715, -0.450, -0.927)
		colorDistMagn   0.0545087
		colorDistFreq   83.8824
		detailScale     2014.86
		colorConversion true
		drivenDarkening 0
		seaLevel        0.220901
		snowLevel       2
		tropicLatitude  0.0789652
		icecapLatitude  10
		icecapHeight    0.163157
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.6834
		venusFreq       1.27302
		venusMagn       0
		mareFreq        0.131074
		mareDensity     0.00298184
		terraceProb     0.181175
		erosion         0
		montesMagn      0.0758609
		montesFreq      37.5708
		montesSpiky     0.978557
		montesFraction  0.653325
		dunesMagn       0.0482445
		dunesFreq       1051.88
		dunesFraction   0.0690301
		hillsMagn       0.12965
		hillsFreq       92.5163
		hillsFraction   0.536165
		hills2Fraction  0
		riversMagn      57.8904
		riversFreq      3.75815
		riversSin       6.50425
		riversOctaves   0
		canyonsMagn     0.524177
		canyonsFreq     0.248609
		canyonFraction  0.627901
		cracksMagn      0.0276996
		cracksFreq      0.215518
		cracksOctaves   0
		craterMagn      0.598756
		craterFreq      1.78361
		craterDensity   0.876013
		craterOctaves   10
		craterRayedFactor 0.072653
		volcanoMagn     0.156946
		volcanoFreq     0.593076
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.6833
		volcanoFlows    0.242515
		volcanoRadius   0.1655
		volcanoTemp     1443.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.306, 0.298, 0.261, 0.000)
		colorDesert    (0.320, 0.303, 0.265, 0.000)
		colorLowland   (0.251, 0.225, 0.203, 0.000)
		colorUpland    (0.370, 0.347, 0.299, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0300847
		Period          0.00768764
		Eccentricity    0.0768164
		Inclination     2.48935
		AscendingNode   36.3374
		ArgOfPericenter 334.34
		MeanAnomaly     117.898
	}
}

Planet	"Ahch-To System 1"
{
	ParentBody     "Ahch-To System"
	Class	       "GasGiant"

	Mass            99.7732
	Radius          59972.3
	InertiaMoment   0.201235

	Oblateness      0.0801743

	RotationPeriod  11.2833
	Obliquity       20.8126
	EqAscendNode    -69.5276

	AlbedoBond      0.493253
	AlbedoGeom      0.591904
	Brightness      2

	Surface
	{
		SurfStyle       0.613244
		Randomize      (-0.474, -0.789, 0.605)
		detailScale     154252
		colorConversion true
		tropicLatitude  0.368553
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     7.59211
		stripeFluct     0.370859
		stripeTwist     14.0046
		cycloneMagn     15.0147
		cycloneFreq     0.513412
		cycloneDensity  0.230693
		cycloneOctaves  5
		colorLayer0    (0.570, 0.550, 0.480, 1.100)
		colorLayer1    (0.850, 0.860, 0.870, 0.700)
		colorLayer2    (0.450, 0.390, 0.260, 0.200)
		colorLayer3    (0.430, 0.330, 0.170, 0.020)
		colorLayer4    (0.830, 0.830, 0.830, 0.000)
		colorLayer5    (0.510, 0.400, 0.140, 0.000)
		colorLayer6    (0.370, 0.350, 0.280, 0.000)
		colorLayer7    (0.420, 0.390, 0.310, 1.000)
		colorLowPlants (0.830, 0.830, 0.830, 0.000)
		colorUpPlants  (0.510, 0.400, 0.140, 0.000)
		BumpHeight      18.8269
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          251.184
		Velocity        -174.721
		BumpHeight      56.4697
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.24554
		mainOctaves     12
		Coverage        0.432532
		stripeZones     7.59211
		stripeFluct     0.370859
		stripeTwist     14.0046
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          599.723
		Density         5368
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.00797207
		Saturation      0.679051

		Composition
		{
			H2    	93.1538
			He    	6.48483
			CH4   	0.283469
			N2    	0.0399169
			NH3   	0.0244111
			O2    	0.00670491
			C2H2  	0.00294651
			Ne    	0.0011788
			C2H4  	0.00110408
			Ar    	0.000762301
			C2H6  	0.00052297
			C3H8  	0.000333349
		}
	}

	Aurora
	{
		Height      2051.74
		NorthLat    84.9881
		NorthLon    -28.7487
		NorthRadius 17537.5
		NorthWidth  10074.8
		NorthRings  2
		NorthBright 1
		NorthParticles 10000
		SouthLat    -84.8595
		SouthLon    161.695
		SouthRadius 17745.5
		SouthWidth  10843.1
		SouthRings  5
		SouthBright 1
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
		SemiMajorAxis   1.19413
		Period          1.04847
		Eccentricity    0.0579553
		Inclination     -15.1577
		AscendingNode   -72.8606
		ArgOfPericenter 54.3067
		MeanAnomaly     235.209
	}
}

Moon	"Ahch-To System 1.1"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Selena"

	Mass            0.006136
	Radius          1391.97
	InertiaMoment   0.385577

	Oblateness      0.0196997

	Obliquity       -0.965797
	EqAscendNode    -82.6261
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.487 0.378 0.335)

	Surface
	{
		SurfStyle       0.690643
		OceanStyle      0.579847
		Randomize      (-0.839, -0.450, -0.822)
		colorDistMagn   0.0742369
		colorDistFreq   168.186
		detailScale     3580.22
		colorConversion true
		drivenDarkening 0
		seaLevel        0.198639
		snowLevel       2
		tropicLatitude  0.0253181
		icecapLatitude  10
		icecapHeight    0.127743
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.99658
		venusFreq       1.47089
		venusMagn       0
		mareFreq        0.620301
		mareDensity     0.00227926
		terraceProb     0.255719
		erosion         0
		montesMagn      0.0624625
		montesFreq      63.8642
		montesSpiky     0.896182
		montesFraction  0.224312
		dunesMagn       0.0404923
		dunesFreq       1836.36
		dunesFraction   0.593749
		hillsMagn       0.119474
		hillsFreq       194.241
		hillsFraction   0.620863
		hills2Fraction  0
		riversMagn      64.7521
		riversFreq      3.7212
		riversSin       7.05854
		riversOctaves   0
		canyonsMagn     0.720497
		canyonsFreq     0.414347
		canyonFraction  0.419957
		cracksMagn      0.028374
		cracksFreq      0.535272
		cracksOctaves   0
		craterMagn      0.582345
		craterFreq      3.4059
		craterDensity   0.750576
		craterOctaves   8.72684
		craterRayedFactor 0.0641124
		volcanoMagn     0.196967
		volcanoFreq     0.846376
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.18132
		volcanoRadius   0.158035
		volcanoTemp     1532.2
		lavaCoverTidal  0.229612
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.302, 0.231, 0.181, 0.000)
		colorDesert    (0.317, 0.235, 0.184, 0.000)
		colorLowland   (0.248, 0.174, 0.140, 0.000)
		colorUpland    (0.365, 0.269, 0.207, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000922046
		Period          0.00162102
		Eccentricity    0.004579
		Inclination     -0.965797
		AscendingNode   -82.6261
		ArgOfPericenter 148.464
		MeanAnomaly     -98.786
	}
}

DwarfMoon	"Ahch-To System 1.D1"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            4.73195e-010
	Radius          10.9885
	InertiaMoment   0.397512

	Oblateness      0.0295083

	Obliquity       -1.45508
	EqAscendNode    -9.82658
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.741 0.737 0.735)

	Surface
	{
		SurfStyle       0.541794
		OceanStyle      0.707827
		Randomize      (0.671, -0.542, -0.624)
		colorDistMagn   0.775261
		colorDistFreq   0.0335827
		detailScale     300.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0.050584
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.342974
		terraceProb     0.224295
		erosion         0
		montesMagn      0.547973
		montesFreq      1.95779
		montesSpiky     0.998828
		montesFraction  0.39701
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.299493
		hillsFraction   0.628906
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.203763
		craterFreq      0.186694
		craterDensity   1.05566
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.659025
		volcanoTemp     1316.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.289, 0.251, 0.206, 0.000)
		colorShelf     (0.296, 0.258, 0.235, 0.000)
		colorBeach     (0.348, 0.302, 0.279, 0.000)
		colorDesert    (0.378, 0.324, 0.272, 0.000)
		colorLowland   (0.415, 0.347, 0.309, 0.000)
		colorUpland    (0.459, 0.420, 0.375, 0.000)
		colorRock      (0.496, 0.457, 0.404, 0.000)
		colorSnow      (0.541, 0.487, 0.426, 1.000)
		BumpHeight      9.88967
		BumpOffset      1.97793
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00151699
		Period          0.00342095
		Eccentricity    0.0498971
		Inclination     -1.45508
		AscendingNode   -9.82658
		ArgOfPericenter -16.4966
		MeanAnomaly     101.503
	}
}

DwarfMoon	"Ahch-To System 1.D2"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            6.98146e-010
	Radius          12.0035
	InertiaMoment   0.398844

	RotationPeriod  289.329
	Obliquity       -39.3239
	EqAscendNode    86.5258

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.435 0.430 0.425)

	Surface
	{
		SurfStyle       0.439163
		OceanStyle      0.0222045
		Randomize      (-0.461, -0.328, -0.748)
		colorDistMagn   0.15947
		colorDistFreq   0.0287755
		detailScale     327.775
		colorConversion true
		snowLevel       2
		tropicLatitude  0.818796
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.751118
		terraceProb     0.271697
		erosion         0
		montesMagn      0.549661
		montesFreq      2.51092
		montesSpiky     0.889536
		montesFraction  0.347821
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.317328
		hillsFraction   0.622149
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241872
		craterFreq      0.240079
		craterDensity   0.990123
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.586656
		volcanoTemp     1712.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.172, 0.170, 0.000)
		colorShelf     (0.185, 0.183, 0.181, 0.000)
		colorBeach     (0.196, 0.193, 0.191, 0.000)
		colorDesert    (0.206, 0.204, 0.202, 0.000)
		colorLowland   (0.217, 0.215, 0.213, 0.000)
		colorUpland    (0.228, 0.226, 0.223, 0.000)
		colorRock      (0.239, 0.236, 0.234, 0.000)
		colorSnow      (0.250, 0.247, 0.245, 1.000)
		BumpHeight      10.8031
		BumpOffset      2.16063
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00900905
		Period          0.0495098
		Eccentricity    0.158976
		Inclination     -39.3239
		AscendingNode   86.5258
		ArgOfPericenter 27.2209
		MeanAnomaly     -62.9538
	}
}

DwarfMoon	"Ahch-To System 1.D3"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            1.013e-009
	Radius          17.0727
	InertiaMoment   0.399782

	Obliquity       -25.0457
	EqAscendNode    70.1029
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.411 0.405 0.403)

	Surface
	{
		SurfStyle       0.15771
		OceanStyle      0.188754
		Randomize      (0.791, 0.138, -0.134)
		colorDistMagn   0.445625
		colorDistFreq   0.174911
		detailScale     466.197
		colorConversion true
		snowLevel       2
		tropicLatitude  0.65017
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.390559
		terraceProb     0.784749
		erosion         0
		montesMagn      0.519141
		montesFreq      3.50516
		montesSpiky     0.99665
		montesFraction  0.505421
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.734842
		hillsFraction   0.886718
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228748
		craterFreq      0.223635
		craterDensity   0.892849
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530503
		volcanoTemp     1528.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.164, 0.162, 0.161, 0.000)
		colorShelf     (0.175, 0.172, 0.171, 0.000)
		colorBeach     (0.185, 0.182, 0.181, 0.000)
		colorDesert    (0.195, 0.193, 0.191, 0.000)
		colorLowland   (0.205, 0.203, 0.202, 0.000)
		colorUpland    (0.216, 0.213, 0.212, 0.000)
		colorRock      (0.226, 0.223, 0.222, 0.000)
		colorSnow      (0.236, 0.233, 0.232, 1.000)
		BumpHeight      15.3654
		BumpOffset      3.07308
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00945204
		Period          0.053206
		Eccentricity    0.0920612
		Inclination     -25.0457
		AscendingNode   70.1029
		ArgOfPericenter 159.184
		MeanAnomaly     -115.71
	}
}

DwarfMoon	"Ahch-To System 1.D4"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            1.44959e-009
	Radius          16.8081
	InertiaMoment   0.397763

	RotationPeriod  1009.57
	Obliquity       25.2609
	EqAscendNode    -137.632

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.553 0.548 0.542)

	Surface
	{
		SurfStyle       0.687232
		OceanStyle      0.491492
		Randomize      (0.397, 0.234, 0.001)
		colorDistMagn   0.316481
		colorDistFreq   0.130292
		detailScale     458.973
		colorConversion true
		snowLevel       2
		tropicLatitude  0.304725
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.571968
		terraceProb     0.342261
		erosion         0
		montesMagn      0.656764
		montesFreq      3.12709
		montesSpiky     0.958422
		montesFraction  0.346633
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.659128
		hillsFraction   0.475117
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239818
		craterFreq      0.24452
		craterDensity   0.924322
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509449
		volcanoTemp     1642.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.186, 0.152, 0.000)
		colorShelf     (0.221, 0.192, 0.173, 0.000)
		colorBeach     (0.260, 0.225, 0.206, 0.000)
		colorDesert    (0.282, 0.241, 0.201, 0.000)
		colorLowland   (0.309, 0.258, 0.228, 0.000)
		colorUpland    (0.343, 0.312, 0.276, 0.000)
		colorRock      (0.370, 0.340, 0.298, 0.000)
		colorSnow      (0.403, 0.362, 0.314, 1.000)
		BumpHeight      15.1273
		BumpOffset      3.02546
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00996385
		Period          0.0575855
		Eccentricity    0.166501
		Inclination     25.2609
		AscendingNode   -137.632
		ArgOfPericenter -87.853
		MeanAnomaly     -120.825
	}
}

DwarfMoon	"Ahch-To System 1.D5"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            2.0505e-009
	Radius          18.0168
	InertiaMoment   0.398989

	Obliquity       11.2223
	EqAscendNode    -145.733
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.537 0.533 0.526)

	Surface
	{
		SurfStyle       0.626527
		OceanStyle      0.24419
		Randomize      (-0.600, 0.134, -0.848)
		colorDistMagn   0.319783
		colorDistFreq   0.19823
		detailScale     491.978
		colorConversion true
		snowLevel       2
		tropicLatitude  0.11448
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.427657
		terraceProb     0.531095
		erosion         0
		montesMagn      0.503812
		montesFreq      4.03609
		montesSpiky     0.810786
		montesFraction  0.814597
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.777117
		hillsFraction   0.449104
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240439
		craterFreq      0.223594
		craterDensity   0.927861
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.403451
		volcanoTemp     1395.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.181, 0.147, 0.000)
		colorShelf     (0.215, 0.186, 0.168, 0.000)
		colorBeach     (0.252, 0.218, 0.200, 0.000)
		colorDesert    (0.274, 0.234, 0.195, 0.000)
		colorLowland   (0.301, 0.250, 0.221, 0.000)
		colorUpland    (0.333, 0.304, 0.268, 0.000)
		colorRock      (0.360, 0.330, 0.289, 0.000)
		colorSnow      (0.392, 0.351, 0.305, 1.000)
		BumpHeight      16.2151
		BumpOffset      3.24302
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0105386
		Period          0.0626397
		Eccentricity    0.0446186
		Inclination     11.2223
		AscendingNode   -145.733
		ArgOfPericenter 53.5305
		MeanAnomaly     174.014
	}
}

DwarfMoon	"Ahch-To System 1.D6"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            2.8726e-009
	Radius          19.3585
	InertiaMoment   0.399908

	Obliquity       -49.4188
	EqAscendNode    88.187
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.658 0.657 0.654)

	Surface
	{
		SurfStyle       0.0456904
		OceanStyle      0.0182241
		Randomize      (0.013, 0.795, -0.223)
		colorDistMagn   0.0511516
		colorDistFreq   0.223493
		detailScale     528.615
		colorConversion true
		snowLevel       2
		tropicLatitude  0.914346
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.311459
		terraceProb     0.218782
		erosion         0
		montesMagn      0.459883
		montesFreq      2.47725
		montesSpiky     0.967995
		montesFraction  0.525971
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.736585
		hillsFraction   0.551699
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253066
		craterFreq      0.23817
		craterDensity   0.921546
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.500969
		volcanoTemp     1377.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.263, 0.262, 0.000)
		colorShelf     (0.280, 0.279, 0.278, 0.000)
		colorBeach     (0.296, 0.295, 0.294, 0.000)
		colorDesert    (0.313, 0.312, 0.311, 0.000)
		colorLowland   (0.329, 0.328, 0.327, 0.000)
		colorUpland    (0.346, 0.345, 0.343, 0.000)
		colorRock      (0.362, 0.361, 0.360, 0.000)
		colorSnow      (0.379, 0.378, 0.376, 1.000)
		BumpHeight      17.4226
		BumpOffset      3.48452
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0111794
		Period          0.0684385
		Eccentricity    0.0795883
		Inclination     -49.4188
		AscendingNode   88.187
		ArgOfPericenter 105.832
		MeanAnomaly     -176.386
	}
}

DwarfMoon	"Ahch-To System 1.D7"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            3.99209e-009
	Radius          20.0093
	InertiaMoment   0.397983

	RotationPeriod  3839.23
	Obliquity       17.7557
	EqAscendNode    -165.051

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.791 0.789 0.785)

	Surface
	{
		SurfStyle       0.907278
		OceanStyle      0.928239
		Randomize      (0.337, 0.247, -0.270)
		colorDistMagn   0.878622
		colorDistFreq   0.0941243
		detailScale     546.387
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0792791
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.629088
		terraceProb     0.113382
		erosion         0
		montesMagn      0.683479
		montesFreq      3.06899
		montesSpiky     0.894156
		montesFraction  0.36939
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.698755
		hillsFraction   0.479569
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201897
		craterFreq      0.172101
		craterDensity   0.951256
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495579
		volcanoTemp     1583.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.276, 0.314, 0.050)
		colorShelf     (0.317, 0.323, 0.361, 0.040)
		colorBeach     (0.364, 0.371, 0.408, 0.030)
		colorDesert    (0.411, 0.418, 0.463, 0.020)
		colorLowland   (0.459, 0.465, 0.510, 0.030)
		colorUpland    (0.506, 0.513, 0.557, 0.050)
		colorRock      (0.554, 0.560, 0.620, 0.020)
		colorSnow      (0.554, 0.560, 0.620, 1.000)
		BumpHeight      18.0084
		BumpOffset      3.60167
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0116704
		Period          0.0729963
		Eccentricity    0.352405
		Inclination     17.7557
		AscendingNode   -165.051
		ArgOfPericenter 67.1943
		MeanAnomaly     -91.7412
	}
}

DwarfMoon	"Ahch-To System 1.D8"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            5.51119e-009
	Radius          26.4572
	InertiaMoment   0.399129

	RotationPeriod  1373.96
	Obliquity       -75.6552
	EqAscendNode    55.1749

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.551 0.443 0.357)

	Surface
	{
		SurfStyle       0.598811
		OceanStyle      0.349349
		Randomize      (-0.229, 0.205, -0.387)
		colorDistMagn   0.67877
		colorDistFreq   0.183718
		detailScale     722.459
		colorConversion true
		snowLevel       2
		tropicLatitude  0.880182
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.44506
		terraceProb     0.312906
		erosion         0
		montesMagn      0.495349
		montesFreq      2.48503
		montesSpiky     0.971109
		montesFraction  0.256593
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.964
		hillsFraction   0.57828
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249273
		craterFreq      0.254098
		craterDensity   0.794083
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.38375
		volcanoTemp     1408.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.151, 0.100, 0.000)
		colorShelf     (0.220, 0.155, 0.114, 0.000)
		colorBeach     (0.259, 0.182, 0.136, 0.000)
		colorDesert    (0.281, 0.195, 0.132, 0.000)
		colorLowland   (0.308, 0.208, 0.150, 0.000)
		colorUpland    (0.342, 0.253, 0.182, 0.000)
		colorRock      (0.369, 0.275, 0.197, 0.000)
		colorSnow      (0.402, 0.292, 0.207, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0122364
		Period          0.0783702
		Eccentricity    0.405328
		Inclination     -75.6552
		AscendingNode   55.1749
		ArgOfPericenter -50.7529
		MeanAnomaly     105.122
	}
}

DwarfMoon	"Ahch-To System 1.D9"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            7.56739e-009
	Radius          28.0036
	InertiaMoment   0.395033

	RotationPeriod  2160.18
	Obliquity       37.8882
	EqAscendNode    43.7817

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.605 0.599 0.594)

	Surface
	{
		SurfStyle       0.846519
		OceanStyle      0.647584
		Randomize      (0.189, -0.018, 0.884)
		colorDistMagn   0.586592
		colorDistFreq   0.516266
		detailScale     764.684
		colorConversion true
		snowLevel       2
		tropicLatitude  0.93654
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.369884
		terraceProb     0.389693
		erosion         0
		montesMagn      0.429157
		montesFreq      2.71941
		montesSpiky     0.906959
		montesFraction  0.536599
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.70847
		hillsFraction   0.734358
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255599
		craterFreq      0.242635
		craterDensity   0.884884
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494756
		volcanoTemp     1570.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.204, 0.166, 0.000)
		colorShelf     (0.242, 0.210, 0.190, 0.000)
		colorBeach     (0.284, 0.246, 0.226, 0.000)
		colorDesert    (0.308, 0.264, 0.220, 0.000)
		colorLowland   (0.339, 0.282, 0.250, 0.000)
		colorUpland    (0.375, 0.342, 0.303, 0.000)
		colorRock      (0.405, 0.371, 0.327, 0.000)
		colorSnow      (0.441, 0.395, 0.345, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0126261
		Period          0.0821443
		Eccentricity    0.306671
		Inclination     37.8882
		AscendingNode   43.7817
		ArgOfPericenter -174.639
		MeanAnomaly     -59.4059
	}
}

DwarfMoon	"Ahch-To System 1.D10"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            1.03464e-008
	Radius          29.8556
	InertiaMoment   0.39818

	RotationPeriod  1501.28
	Obliquity       -2.76998
	EqAscendNode    -58.0569

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.630 0.625 0.620)

	Surface
	{
		SurfStyle       0.394141
		OceanStyle      0.874388
		Randomize      (0.287, -0.297, 0.403)
		colorDistMagn   0.910761
		colorDistFreq   0.594002
		detailScale     815.257
		colorConversion true
		snowLevel       2
		tropicLatitude  0.084436
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.412551
		terraceProb     0.1631
		erosion         0
		montesMagn      0.443466
		montesFreq      2.93509
		montesSpiky     0.793801
		montesFraction  0.325416
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.21755
		hillsFraction   0.632466
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264465
		craterFreq      0.200947
		craterDensity   1.02316
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.41361
		volcanoTemp     1450.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.252, 0.250, 0.248, 0.000)
		colorShelf     (0.268, 0.266, 0.264, 0.000)
		colorBeach     (0.283, 0.281, 0.279, 0.000)
		colorDesert    (0.299, 0.297, 0.295, 0.000)
		colorLowland   (0.315, 0.313, 0.310, 0.000)
		colorUpland    (0.331, 0.328, 0.326, 0.000)
		colorRock      (0.346, 0.344, 0.341, 0.000)
		colorSnow      (0.362, 0.360, 0.357, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0129811
		Period          0.0856327
		Eccentricity    0.378987
		Inclination     -2.76998
		AscendingNode   -58.0569
		ArgOfPericenter 91.9206
		MeanAnomaly     -152.388
	}
}

DwarfMoon	"Ahch-To System 1.D11"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            1.40997e-008
	Radius          31.1894
	InertiaMoment   0.399264

	RotationPeriod  1316.75
	Obliquity       -36.1331
	EqAscendNode    -46.1971

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.786 0.785 0.783)

	Surface
	{
		SurfStyle       0.261326
		OceanStyle      0.216106
		Randomize      (-0.165, 0.424, -0.867)
		colorDistMagn   0.505566
		colorDistFreq   0.385345
		detailScale     851.678
		colorConversion true
		snowLevel       2
		tropicLatitude  0.911353
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.66432
		terraceProb     0.215841
		erosion         0
		montesMagn      0.661954
		montesFreq      3.48725
		montesSpiky     0.972755
		montesFraction  0.504608
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.90502
		hillsFraction   0.699597
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243923
		craterFreq      0.208806
		craterDensity   0.912525
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.434942
		volcanoTemp     1390.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.314, 0.314, 0.313, 0.000)
		colorShelf     (0.334, 0.333, 0.333, 0.000)
		colorBeach     (0.354, 0.353, 0.353, 0.000)
		colorDesert    (0.373, 0.373, 0.372, 0.000)
		colorLowland   (0.393, 0.392, 0.392, 0.000)
		colorUpland    (0.413, 0.412, 0.411, 0.000)
		colorRock      (0.432, 0.432, 0.431, 0.000)
		colorSnow      (0.452, 0.451, 0.450, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0134316
		Period          0.0901285
		Eccentricity    0.118712
		Inclination     -36.1331
		AscendingNode   -46.1971
		ArgOfPericenter -14.6956
		MeanAnomaly     -134.758
	}
}

DwarfMoon	"Ahch-To System 1.D12"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            1.91702e-008
	Radius          40.4709
	InertiaMoment   0.396279

	Obliquity       69.4862
	EqAscendNode    137.122
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.602 0.500 0.336)

	Surface
	{
		SurfStyle       0.369735
		OceanStyle      0.705826
		Randomize      (-0.359, -0.146, -0.377)
		colorDistMagn   0.521692
		colorDistFreq   1.14535
		detailScale     1105.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.643293
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.53023
		terraceProb     0.232694
		erosion         0
		montesMagn      0.520975
		montesFreq      2.15474
		montesSpiky     0.906672
		montesFraction  0.385883
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.98726
		hillsFraction   0.548321
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24667
		craterFreq      0.206199
		craterDensity   0.987719
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57014
		volcanoTemp     1376.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.200, 0.134, 0.000)
		colorShelf     (0.256, 0.212, 0.143, 0.000)
		colorBeach     (0.271, 0.225, 0.151, 0.000)
		colorDesert    (0.286, 0.237, 0.160, 0.000)
		colorLowland   (0.301, 0.250, 0.168, 0.000)
		colorUpland    (0.316, 0.262, 0.176, 0.000)
		colorRock      (0.331, 0.275, 0.185, 0.000)
		colorSnow      (0.346, 0.287, 0.193, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0139673
		Period          0.0955746
		Eccentricity    0.105068
		Inclination     69.4862
		AscendingNode   137.122
		ArgOfPericenter -179.963
		MeanAnomaly     0.191247
	}
}

DwarfMoon	"Ahch-To System 1.D13"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            2.6027e-008
	Radius          42.5216
	InertiaMoment   0.398362

	Obliquity       -38.6686
	EqAscendNode    -16.0989
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.667 0.548 0.384)

	Surface
	{
		SurfStyle       0.217262
		OceanStyle      0.279925
		Randomize      (-0.435, -0.484, -0.329)
		colorDistMagn   0.152119
		colorDistFreq   1.25865
		detailScale     1161.12
		colorConversion true
		snowLevel       2
		tropicLatitude  0.972111
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.438961
		terraceProb     0.152974
		erosion         0
		montesMagn      0.412533
		montesFreq      3.90479
		montesSpiky     0.961337
		montesFraction  0.496243
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.93984
		hillsFraction   0.727701
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250224
		craterFreq      0.214645
		craterDensity   1.06125
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488429
		volcanoTemp     1466.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.219, 0.154, 0.000)
		colorShelf     (0.284, 0.233, 0.163, 0.000)
		colorBeach     (0.300, 0.247, 0.173, 0.000)
		colorDesert    (0.317, 0.260, 0.182, 0.000)
		colorLowland   (0.334, 0.274, 0.192, 0.000)
		colorUpland    (0.350, 0.288, 0.202, 0.000)
		colorRock      (0.367, 0.301, 0.211, 0.000)
		colorSnow      (0.384, 0.315, 0.221, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0142892
		Period          0.0988974
		Eccentricity    0.170968
		Inclination     -38.6686
		AscendingNode   -16.0989
		ArgOfPericenter -113.783
		MeanAnomaly     1.88366
	}
}

DwarfMoon	"Ahch-To System 1.D14"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            3.53171e-008
	Radius          45.2183
	InertiaMoment   0.399396

	Obliquity       -46.3659
	EqAscendNode    -23.5055
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.541 0.538 0.535)

	Surface
	{
		SurfStyle       0.505831
		OceanStyle      0.294437
		Randomize      (0.815, 0.563, 0.934)
		colorDistMagn   0.413625
		colorDistFreq   0.785324
		detailScale     1234.76
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999991
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.445368
		terraceProb     0.101874
		erosion         0
		montesMagn      0.302005
		montesFreq      2.68553
		montesSpiky     0.887328
		montesFraction  0.823044
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.20647
		hillsFraction   0.562862
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242583
		craterFreq      0.197694
		craterDensity   0.84332
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509319
		volcanoTemp     1742.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.183, 0.150, 0.000)
		colorShelf     (0.216, 0.188, 0.171, 0.000)
		colorBeach     (0.254, 0.221, 0.203, 0.000)
		colorDesert    (0.276, 0.237, 0.198, 0.000)
		colorLowland   (0.303, 0.253, 0.225, 0.000)
		colorUpland    (0.335, 0.307, 0.273, 0.000)
		colorRock      (0.362, 0.334, 0.294, 0.000)
		colorSnow      (0.395, 0.355, 0.311, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0145328
		Period          0.101437
		Eccentricity    0.253597
		Inclination     -46.3659
		AscendingNode   -23.5055
		ArgOfPericenter 45.7586
		MeanAnomaly     151.42
	}
}

DwarfMoon	"Ahch-To System 1.D15"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            4.7938e-008
	Radius          47.5338
	InertiaMoment   0.396827

	Obliquity       38.5098
	EqAscendNode    -166.716
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.804 0.776 0.749)

	Surface
	{
		SurfStyle       0.958942
		OceanStyle      0.999738
		Randomize      (-0.247, -0.030, 0.638)
		colorDistMagn   0.716158
		colorDistFreq   1.24582
		detailScale     1297.99
		colorConversion true
		snowLevel       2
		tropicLatitude  0.143667
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.62661
		terraceProb     0.321612
		erosion         0
		montesMagn      0.422326
		montesFreq      3.12088
		montesSpiky     0.84526
		montesFraction  0.693455
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.35886
		hillsFraction   0.668598
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247721
		craterFreq      0.276212
		craterDensity   0.859221
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.437018
		volcanoTemp     1775.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.272, 0.300, 0.050)
		colorShelf     (0.321, 0.318, 0.345, 0.040)
		colorBeach     (0.370, 0.365, 0.389, 0.030)
		colorDesert    (0.418, 0.411, 0.442, 0.020)
		colorLowland   (0.466, 0.458, 0.487, 0.030)
		colorUpland    (0.514, 0.504, 0.532, 0.050)
		colorRock      (0.563, 0.551, 0.592, 0.020)
		colorSnow      (0.563, 0.551, 0.592, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0151077
		Period          0.107515
		Eccentricity    0.0814957
		Inclination     38.5098
		AscendingNode   -166.716
		ArgOfPericenter -51.2247
		MeanAnomaly     39.5537
	}
}

DwarfMoon	"Ahch-To System 1.D16"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            6.51458e-008
	Radius          61.5177
	InertiaMoment   0.398531

	RotationPeriod  4950.5
	Obliquity       3.07584
	EqAscendNode    -79.3936

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.463 0.457 0.449)

	Surface
	{
		SurfStyle       0.46671
		OceanStyle      0.221736
		Randomize      (-0.196, -0.080, 0.842)
		colorDistMagn   0.704441
		colorDistFreq   2.27536
		detailScale     1679.84
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0825018
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.34561
		terraceProb     0.225553
		erosion         0
		montesMagn      0.280998
		montesFreq      2.9763
		montesSpiky     0.921532
		montesFraction  0.226862
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.36128
		hillsFraction   0.596878
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217882
		craterFreq      0.242904
		craterDensity   0.758914
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529709
		volcanoTemp     1394.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.185, 0.183, 0.180, 0.000)
		colorShelf     (0.197, 0.194, 0.191, 0.000)
		colorBeach     (0.208, 0.206, 0.202, 0.000)
		colorDesert    (0.220, 0.217, 0.213, 0.000)
		colorLowland   (0.231, 0.229, 0.225, 0.000)
		colorUpland    (0.243, 0.240, 0.236, 0.000)
		colorRock      (0.254, 0.251, 0.247, 0.000)
		colorSnow      (0.266, 0.263, 0.258, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0156126
		Period          0.11295
		Eccentricity    0.145536
		Inclination     3.07584
		AscendingNode   -79.3936
		ArgOfPericenter -157.442
		MeanAnomaly     -108.117
	}
}

Moon	"Ahch-To System 1.2"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Selena"

	Mass            0.010336
	Radius          1787.25
	InertiaMoment   0.374373

	RotationPeriod  2097.49
	Obliquity       12.0605
	EqAscendNode    161.665

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.426 0.423 0.420)

	Surface
	{
		SurfStyle       0.686197
		OceanStyle      0.936832
		Randomize      (-0.952, 0.533, -0.278)
		colorDistMagn   0.0670293
		colorDistFreq   214.312
		detailScale     4596.9
		colorConversion true
		drivenDarkening 0
		seaLevel        0.240066
		snowLevel       2
		tropicLatitude  0.0665406
		icecapLatitude  8.77448
		icecapHeight    0.167196
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.01337
		venusFreq       1.38907
		venusMagn       0
		mareFreq        1.02426
		mareDensity     0.00219899
		terraceProb     0.766957
		erosion         0
		montesMagn      0.108288
		montesFreq      85.8035
		montesSpiky     0.943227
		montesFraction  0.730321
		dunesMagn       0.0463332
		dunesFreq       2286.16
		dunesFraction   0.13139
		hillsMagn       0.114217
		hillsFreq       214.978
		hillsFraction   0.649901
		hills2Fraction  0
		riversMagn      53.3865
		riversFreq      4.15983
		riversSin       5.11816
		riversOctaves   0
		canyonsMagn     0.259663
		canyonsFreq     0.609088
		canyonFraction  0.731563
		cracksMagn      0.0515778
		cracksFreq      0.570499
		cracksOctaves   0
		craterMagn      0.636347
		craterFreq      5.41307
		craterDensity   0.917924
		craterOctaves   11
		craterRayedFactor 0.21399
		volcanoMagn     0.266275
		volcanoFreq     0.698003
		volcanoDensity  0.215462
		volcanoOctaves  3
		volcanoActivity 0.135808
		volcanoFlows    0.131033
		volcanoRadius   0.213652
		volcanoTemp     1515.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.264, 0.258, 0.227, 0.000)
		colorDesert    (0.277, 0.262, 0.231, 0.000)
		colorLowland   (0.217, 0.195, 0.176, 0.000)
		colorUpland    (0.320, 0.300, 0.260, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0162238
		Period          0.11964
		Eccentricity    0.452761
		Inclination     12.0605
		AscendingNode   161.665
		ArgOfPericenter -153.465
		MeanAnomaly     47.1575
	}
}

DwarfMoon	"Ahch-To System 1.D17"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            1.21171e-007
	Radius          68.5926
	InertiaMoment   0.397207

	Obliquity       7.62869
	EqAscendNode    -105.939
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.787 0.786 0.784)

	Surface
	{
		SurfStyle       0.992483
		OceanStyle      0.686239
		Randomize      (0.827, 0.514, 0.041)
		colorDistMagn   0.655291
		colorDistFreq   2.95133
		detailScale     1873.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0.159386
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48665
		terraceProb     0.645936
		erosion         0
		montesMagn      0.425978
		montesFreq      3.23001
		montesSpiky     0.813083
		montesFraction  0.523868
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.5229
		hillsFraction   0.640829
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211014
		craterFreq      0.173229
		craterDensity   0.785069
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52781
		volcanoTemp     1345.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.275, 0.314, 0.050)
		colorShelf     (0.315, 0.322, 0.361, 0.040)
		colorBeach     (0.362, 0.369, 0.408, 0.030)
		colorDesert    (0.409, 0.417, 0.463, 0.020)
		colorLowland   (0.456, 0.464, 0.510, 0.030)
		colorUpland    (0.504, 0.511, 0.557, 0.050)
		colorRock      (0.551, 0.558, 0.620, 0.020)
		colorSnow      (0.551, 0.558, 0.620, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0168587
		Period          0.126738
		Eccentricity    0.00902284
		Inclination     7.62869
		AscendingNode   -105.939
		ArgOfPericenter 27.7955
		MeanAnomaly     35.2894
	}
}

DwarfMoon	"Ahch-To System 1.D18"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            1.66165e-007
	Radius          72.6754
	InertiaMoment   0.39869

	Obliquity       5.74754
	EqAscendNode    -37.9852
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.488 0.484 0.476)

	Surface
	{
		SurfStyle       0.486968
		OceanStyle      0.75083
		Randomize      (0.014, 0.887, -0.850)
		colorDistMagn   0.567322
		colorDistFreq   2.4157
		detailScale     1984.52
		colorConversion true
		snowLevel       2
		tropicLatitude  0.188536
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.470274
		terraceProb     0.104971
		erosion         0
		montesMagn      0.363604
		montesFreq      3.27186
		montesSpiky     0.911177
		montesFraction  0.525265
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.5204
		hillsFraction   0.702819
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262772
		craterFreq      0.166545
		craterDensity   0.802743
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.570222
		volcanoTemp     1686.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.194, 0.191, 0.000)
		colorShelf     (0.207, 0.206, 0.202, 0.000)
		colorBeach     (0.220, 0.218, 0.214, 0.000)
		colorDesert    (0.232, 0.230, 0.226, 0.000)
		colorLowland   (0.244, 0.242, 0.238, 0.000)
		colorUpland    (0.256, 0.254, 0.250, 0.000)
		colorRock      (0.268, 0.266, 0.262, 0.000)
		colorSnow      (0.281, 0.278, 0.274, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0173922
		Period          0.132802
		Eccentricity    0.155949
		Inclination     5.74754
		AscendingNode   -37.9852
		ArgOfPericenter -127.629
		MeanAnomaly     -60.259
	}
}

DwarfMoon	"Ahch-To System 1.S1"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            2.33342e-011
	Radius          4.42682
	InertiaMoment   0.399653

	Oblateness      0.249

	Obliquity       -0.882244
	EqAscendNode    -81.1418
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.693 0.655 0.596)

	Surface
	{
		SurfStyle       0.791318
		OceanStyle      0.707654
		Randomize      (0.766, -0.163, -0.804)
		colorDistMagn   0.740875
		colorDistFreq   0.010986
		detailScale     120.882
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0233901
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.709568
		terraceProb     0.162804
		erosion         0
		montesMagn      0.414447
		montesFreq      2.93411
		montesSpiky     0.903503
		montesFraction  0.67263
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0329254
		hillsFraction   0.590182
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253521
		craterFreq      0.212197
		craterDensity   0.945732
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495142
		volcanoTemp     1639.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.223, 0.167, 0.000)
		colorShelf     (0.277, 0.229, 0.191, 0.000)
		colorBeach     (0.326, 0.269, 0.226, 0.000)
		colorDesert    (0.354, 0.288, 0.220, 0.000)
		colorLowland   (0.388, 0.308, 0.250, 0.000)
		colorUpland    (0.430, 0.373, 0.304, 0.000)
		colorRock      (0.464, 0.406, 0.328, 0.000)
		colorSnow      (0.506, 0.432, 0.346, 1.000)
		BumpHeight      3.98413
		BumpOffset      0.796827
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000591361
		Period          0.000832628
		Eccentricity    0
		Inclination     -0.882244
		AscendingNode   -81.1418
		ArgOfPericenter -74.7276
		MeanAnomaly     170.827
	}
}

DwarfMoon	"Ahch-To System 1.S2"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            3.51467e-011
	Radius          4.75909
	InertiaMoment   0.397506

	Oblateness      0.249

	Obliquity       -1.23949
	EqAscendNode    155.318
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.848 0.790 0.743)

	Surface
	{
		SurfStyle       0.86483
		OceanStyle      0.763751
		Randomize      (-0.886, -0.114, 0.691)
		colorDistMagn   0.140864
		colorDistFreq   0.0136896
		detailScale     129.955
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00924507
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.630733
		terraceProb     0.447651
		erosion         0
		montesMagn      0.422796
		montesFreq      3.31148
		montesSpiky     0.934601
		montesFraction  0.76707
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0384172
		hillsFraction   0.504897
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253766
		craterFreq      0.225103
		craterDensity   0.962317
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.451994
		volcanoTemp     1693.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.276, 0.297, 0.050)
		colorShelf     (0.339, 0.324, 0.342, 0.040)
		colorBeach     (0.390, 0.371, 0.386, 0.030)
		colorDesert    (0.441, 0.419, 0.439, 0.020)
		colorLowland   (0.492, 0.466, 0.483, 0.030)
		colorUpland    (0.543, 0.513, 0.528, 0.050)
		colorRock      (0.594, 0.561, 0.587, 0.020)
		colorSnow      (0.594, 0.561, 0.587, 1.000)
		BumpHeight      4.28318
		BumpOffset      0.856636
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000609883
		Period          0.000872051
		Eccentricity    0
		Inclination     -1.23949
		AscendingNode   155.318
		ArgOfPericenter -6.66978
		MeanAnomaly     -105.739
	}
}

DwarfMoon	"Ahch-To System 1.S3"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            5.39483e-011
	Radius          5.26733
	InertiaMoment   0.398841

	Oblateness      0.249

	Obliquity       0.904849
	EqAscendNode    -126.312
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.643 0.562 0.517)

	Surface
	{
		SurfStyle       0.322826
		OceanStyle      0.647617
		Randomize      (0.228, -0.365, 0.433)
		colorDistMagn   0.859047
		colorDistFreq   0.0227988
		detailScale     143.833
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0142605
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.375178
		terraceProb     0.296065
		erosion         0
		montesMagn      0.362012
		montesFreq      2.37609
		montesSpiky     0.922199
		montesFraction  0.915772
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0631072
		hillsFraction   0.923902
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217912
		craterFreq      0.21949
		craterDensity   0.858844
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4982
		volcanoTemp     1313.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.225, 0.207, 0.000)
		colorShelf     (0.273, 0.239, 0.220, 0.000)
		colorBeach     (0.289, 0.253, 0.233, 0.000)
		colorDesert    (0.305, 0.267, 0.246, 0.000)
		colorLowland   (0.321, 0.281, 0.259, 0.000)
		colorUpland    (0.338, 0.295, 0.272, 0.000)
		colorRock      (0.354, 0.309, 0.285, 0.000)
		colorSnow      (0.370, 0.323, 0.297, 1.000)
		BumpHeight      4.7406
		BumpOffset      0.94812
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000612442
		Period          0.000877545
		Eccentricity    0
		Inclination     0.904848
		AscendingNode   -126.312
		ArgOfPericenter -130.382
		MeanAnomaly     -44.3499
	}
}

DwarfMoon	"Ahch-To System 1.S4"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            8.4763e-011
	Radius          5.85673
	InertiaMoment   0.39978

	Oblateness      0.249

	Obliquity       1.12538
	EqAscendNode    -98.2623
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.627 0.547 0.490)

	Surface
	{
		SurfStyle       0.720085
		OceanStyle      0.980609
		Randomize      (0.380, 0.499, 0.709)
		colorDistMagn   0.430142
		colorDistFreq   0.0298912
		detailScale     159.928
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0257011
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.722938
		terraceProb     0.112623
		erosion         0
		montesMagn      0.447917
		montesFreq      3.50454
		montesSpiky     0.994392
		montesFraction  0.852231
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0743428
		hillsFraction   0.794832
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217451
		craterFreq      0.218986
		craterDensity   0.697317
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.493738
		volcanoTemp     1577.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.186, 0.137, 0.000)
		colorShelf     (0.251, 0.191, 0.157, 0.000)
		colorBeach     (0.295, 0.224, 0.186, 0.000)
		colorDesert    (0.320, 0.241, 0.181, 0.000)
		colorLowland   (0.351, 0.257, 0.206, 0.000)
		colorUpland    (0.389, 0.312, 0.250, 0.000)
		colorRock      (0.420, 0.339, 0.269, 0.000)
		colorSnow      (0.458, 0.361, 0.284, 1.000)
		BumpHeight      5.27106
		BumpOffset      1.05421
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000622762
		Period          0.000899819
		Eccentricity    0
		Inclination     1.12538
		AscendingNode   -98.2623
		ArgOfPericenter 81.7202
		MeanAnomaly     -132.116
	}
}

DwarfMoon	"Ahch-To System 1.S5"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            1.37122e-010
	Radius          8.12421
	InertiaMoment   0.397758

	Oblateness      0.249

	Obliquity       0.499
	EqAscendNode    -77.9427
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.589 0.582 0.579)

	Surface
	{
		SurfStyle       0.365773
		OceanStyle      0.67928
		Randomize      (0.335, -0.781, 0.086)
		colorDistMagn   0.444199
		colorDistFreq   0.0323251
		detailScale     221.845
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0135401
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.566628
		terraceProb     0.442409
		erosion         0
		montesMagn      0.350816
		montesFreq      2.76834
		montesSpiky     0.922635
		montesFraction  0.879147
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.108477
		hillsFraction   0.719671
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258786
		craterFreq      0.188857
		craterDensity   0.804215
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492111
		volcanoTemp     1355.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.233, 0.232, 0.000)
		colorShelf     (0.250, 0.247, 0.246, 0.000)
		colorBeach     (0.265, 0.262, 0.261, 0.000)
		colorDesert    (0.280, 0.277, 0.275, 0.000)
		colorLowland   (0.294, 0.291, 0.290, 0.000)
		colorUpland    (0.309, 0.306, 0.304, 0.000)
		colorRock      (0.324, 0.320, 0.319, 0.000)
		colorSnow      (0.339, 0.335, 0.333, 1.000)
		BumpHeight      7.31179
		BumpOffset      1.46236
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000638766
		Period          0.000934728
		Eccentricity    0
		Inclination     0.499
		AscendingNode   -77.9427
		ArgOfPericenter 174.907
		MeanAnomaly     69.3565
	}
}

DwarfMoon	"Ahch-To System 1.S6"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            2.30207e-010
	Radius          8.96435
	InertiaMoment   0.398986

	Oblateness      0.249

	Obliquity       1.30118
	EqAscendNode    32.1324
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.625 0.553 0.444)

	Surface
	{
		SurfStyle       0.237399
		OceanStyle      0.313924
		Randomize      (0.968, 0.849, 0.061)
		colorDistMagn   0.984485
		colorDistFreq   0.0515697
		detailScale     244.787
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0436314
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.563002
		terraceProb     0.146182
		erosion         0
		montesMagn      0.366639
		montesFreq      2.59767
		montesSpiky     0.993516
		montesFraction  0.478146
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.165735
		hillsFraction   0.484671
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254999
		craterFreq      0.255878
		craterDensity   0.840943
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507021
		volcanoTemp     1576.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.221, 0.178, 0.000)
		colorShelf     (0.266, 0.235, 0.189, 0.000)
		colorBeach     (0.281, 0.249, 0.200, 0.000)
		colorDesert    (0.297, 0.263, 0.211, 0.000)
		colorLowland   (0.313, 0.276, 0.222, 0.000)
		colorUpland    (0.328, 0.290, 0.233, 0.000)
		colorRock      (0.344, 0.304, 0.244, 0.000)
		colorSnow      (0.359, 0.318, 0.255, 1.000)
		BumpHeight      8.06791
		BumpOffset      1.61358
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000653411
		Period          0.000967057
		Eccentricity    0
		Inclination     1.30118
		AscendingNode   32.1324
		ArgOfPericenter -156.643
		MeanAnomaly     123.444
	}
}

DwarfMoon	"Ahch-To System 1.S7"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            4.0561e-010
	Radius          10.377
	InertiaMoment   0.399905

	Oblateness      0.249

	Obliquity       1.1637
	EqAscendNode    -2.94335
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.668 0.569 0.501)

	Surface
	{
		SurfStyle       0.964932
		OceanStyle      0.616838
		Randomize      (-0.648, 0.906, -0.590)
		colorDistMagn   0.160857
		colorDistFreq   0.0350633
		detailScale     283.361
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0405954
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.481035
		terraceProb     0.443759
		erosion         0
		montesMagn      0.463852
		montesFreq      3.63797
		montesSpiky     0.96607
		montesFraction  0.863162
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.32513
		hillsFraction   0.644892
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236837
		craterFreq      0.222754
		craterDensity   0.972114
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527018
		volcanoTemp     1376.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.199, 0.200, 0.050)
		colorShelf     (0.267, 0.233, 0.230, 0.040)
		colorBeach     (0.307, 0.268, 0.260, 0.030)
		colorDesert    (0.348, 0.302, 0.295, 0.020)
		colorLowland   (0.388, 0.336, 0.326, 0.030)
		colorUpland    (0.428, 0.370, 0.356, 0.050)
		colorRock      (0.468, 0.404, 0.396, 0.020)
		colorSnow      (0.468, 0.404, 0.396, 1.000)
		BumpHeight      9.33931
		BumpOffset      1.86786
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00065771
		Period          0.000976618
		Eccentricity    0
		Inclination     1.1637
		AscendingNode   -2.94335
		ArgOfPericenter -22.1009
		MeanAnomaly     51.0889
	}
}

DwarfMoon	"Ahch-To System 1.S8"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            7.62702e-010
	Radius          12.2739
	InertiaMoment   0.397978

	Oblateness      0.249

	Obliquity       -0.120442
	EqAscendNode    -57.181
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.667 0.608 0.545)

	Surface
	{
		SurfStyle       0.959071
		OceanStyle      0.88787
		Randomize      (0.100, -0.482, -0.810)
		colorDistMagn   0.443168
		colorDistFreq   0.0473263
		detailScale     335.159
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00368644
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.477808
		terraceProb     0.44734
		erosion         0
		montesMagn      0.481238
		montesFreq      2.98198
		montesSpiky     0.929556
		montesFraction  0.524369
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.289786
		hillsFraction   0.673878
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.198438
		craterFreq      0.145461
		craterDensity   0.878731
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523368
		volcanoTemp     1404.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.213, 0.218, 0.050)
		colorShelf     (0.267, 0.249, 0.251, 0.040)
		colorBeach     (0.307, 0.286, 0.284, 0.030)
		colorDesert    (0.347, 0.322, 0.322, 0.020)
		colorLowland   (0.387, 0.359, 0.355, 0.030)
		colorUpland    (0.427, 0.395, 0.387, 0.050)
		colorRock      (0.467, 0.432, 0.431, 0.020)
		colorSnow      (0.467, 0.432, 0.431, 1.000)
		BumpHeight      11.0465
		BumpOffset      2.2093
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000680821
		Period          0.00102854
		Eccentricity    0
		Inclination     -0.120442
		AscendingNode   -57.181
		ArgOfPericenter -41.3801
		MeanAnomaly     -125.884
	}
}

DwarfMoon	"Ahch-To System 1.S9"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            1.5723e-009
	Radius          18.7695
	InertiaMoment   0.399126

	Oblateness      0.249

	Obliquity       -1.0809
	EqAscendNode    167.812
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.719 0.716 0.713)

	Surface
	{
		SurfStyle       0.290311
		OceanStyle      0.975197
		Randomize      (-0.230, 0.437, 0.669)
		colorDistMagn   0.6239
		colorDistFreq   0.222982
		detailScale     512.534
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00401163
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.418448
		terraceProb     0.15366
		erosion         0
		montesMagn      0.621862
		montesFreq      3.39688
		montesSpiky     0.968831
		montesFraction  0.707929
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.726651
		hillsFraction   0.620166
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228385
		craterFreq      0.244033
		craterDensity   0.759431
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481529
		volcanoTemp     1483.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.286, 0.285, 0.000)
		colorShelf     (0.305, 0.304, 0.303, 0.000)
		colorBeach     (0.323, 0.322, 0.321, 0.000)
		colorDesert    (0.341, 0.340, 0.339, 0.000)
		colorLowland   (0.359, 0.358, 0.356, 0.000)
		colorUpland    (0.377, 0.376, 0.374, 0.000)
		colorRock      (0.395, 0.394, 0.392, 0.000)
		colorSnow      (0.413, 0.412, 0.410, 1.000)
		BumpHeight      16.8926
		BumpOffset      3.37852
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000688856
		Period          0.0010468
		Eccentricity    0
		Inclination     -1.0809
		AscendingNode   167.812
		ArgOfPericenter 168.853
		MeanAnomaly     151.94
	}
}

DwarfMoon	"Ahch-To System 1.S10"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            3.70379e-016
	Radius          0.105796
	InertiaMoment   0.394971

	Oblateness      0.249

	Obliquity       -1.09975
	EqAscendNode    115.733
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.481 0.475 0.472)

	Surface
	{
		SurfStyle       0.878944
		OceanStyle      0.418214
		Randomize      (-0.081, 0.832, 0.085)
		colorDistMagn   0.188372
		colorDistFreq   3.00489e-006
		detailScale     2.88893
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0204164
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.592225
		terraceProb     0.117034
		erosion         0
		montesMagn      0.43845
		montesFreq      3.08582
		montesSpiky     0.977707
		montesFraction  0.763367
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.81705e-005
		hillsFraction   0.649419
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232271
		craterFreq      0.237742
		craterDensity   0.797324
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464619
		volcanoTemp     1489.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.164, 0.166, 0.189, 0.050)
		colorShelf     (0.193, 0.195, 0.217, 0.040)
		colorBeach     (0.221, 0.223, 0.245, 0.030)
		colorDesert    (0.250, 0.252, 0.278, 0.020)
		colorLowland   (0.279, 0.280, 0.307, 0.030)
		colorUpland    (0.308, 0.309, 0.335, 0.050)
		colorRock      (0.337, 0.337, 0.373, 0.020)
		colorSnow      (0.337, 0.337, 0.373, 1.000)
		BumpHeight      0.0952161
		BumpOffset      0.0190432
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000708439
		Period          0.00109176
		Eccentricity    0
		Inclination     -1.09975
		AscendingNode   115.733
		ArgOfPericenter 68.9558
		MeanAnomaly     142.618
	}
}

DwarfMoon	"Ahch-To System 1.S11"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            8.29808e-016
	Radius          0.132476
	InertiaMoment   0.398176

	Oblateness      0.249

	Obliquity       -0.320961
	EqAscendNode    31.9643
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.569 0.457 0.366)

	Surface
	{
		SurfStyle       0.800113
		OceanStyle      0.876514
		Randomize      (-0.920, 0.880, -0.414)
		colorDistMagn   0.840418
		colorDistFreq   1.22265e-005
		detailScale     3.61747
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0107697
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.470171
		terraceProb     0.191039
		erosion         0
		montesMagn      0.539846
		montesFreq      3.58909
		montesSpiky     0.89614
		montesFraction  0.676595
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.86277e-005
		hillsFraction   0.680904
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24277
		craterFreq      0.140423
		craterDensity   0.904802
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.400102
		volcanoTemp     1762.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.155, 0.102, 0.000)
		colorShelf     (0.228, 0.160, 0.117, 0.000)
		colorBeach     (0.268, 0.187, 0.139, 0.000)
		colorDesert    (0.290, 0.201, 0.135, 0.000)
		colorLowland   (0.319, 0.215, 0.154, 0.000)
		colorUpland    (0.353, 0.261, 0.187, 0.000)
		colorRock      (0.382, 0.283, 0.201, 0.000)
		colorSnow      (0.416, 0.302, 0.212, 1.000)
		BumpHeight      0.119228
		BumpOffset      0.0238456
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000716579
		Period          0.00111063
		Eccentricity    0
		Inclination     -0.320961
		AscendingNode   31.9643
		ArgOfPericenter 4.24822
		MeanAnomaly     18.1124
	}
}

DwarfMoon	"Ahch-To System 1.S12"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            1.64982e-015
	Radius          0.159834
	InertiaMoment   0.399261

	Oblateness      0.238828

	Obliquity       -1.00493
	EqAscendNode    98.7348
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.453 0.445 0.441)

	Surface
	{
		SurfStyle       0.483281
		OceanStyle      0.332626
		Randomize      (-0.319, -0.113, 0.290)
		colorDistMagn   0.777023
		colorDistFreq   1.8434e-005
		detailScale     4.36452
		colorConversion true
		snowLevel       2
		tropicLatitude  0.022841
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.432352
		terraceProb     0.202077
		erosion         0
		montesMagn      0.656328
		montesFreq      2.59863
		montesSpiky     0.913609
		montesFraction  0.135959
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.18044e-005
		hillsFraction   0.77094
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211005
		craterFreq      0.16349
		craterDensity   0.9572
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455427
		volcanoTemp     1412.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.178, 0.176, 0.000)
		colorShelf     (0.193, 0.189, 0.187, 0.000)
		colorBeach     (0.204, 0.200, 0.198, 0.000)
		colorDesert    (0.215, 0.211, 0.209, 0.000)
		colorLowland   (0.227, 0.222, 0.220, 0.000)
		colorUpland    (0.238, 0.233, 0.231, 0.000)
		colorRock      (0.249, 0.245, 0.242, 0.000)
		colorSnow      (0.261, 0.256, 0.253, 1.000)
		BumpHeight      0.14385
		BumpOffset      0.0287701
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000726355
		Period          0.00113343
		Eccentricity    0
		Inclination     -1.00493
		AscendingNode   98.7348
		ArgOfPericenter -118.798
		MeanAnomaly     -151.237
	}
}

DwarfMoon	"Ahch-To System 1.S13"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            3.02519e-015
	Radius          0.244872
	InertiaMoment   0.396264

	Oblateness      0.249

	Obliquity       1.05844
	EqAscendNode    -159.365
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.577 0.514 0.433)

	Surface
	{
		SurfStyle       0.835962
		OceanStyle      0.912139
		Randomize      (-0.186, 0.052, 0.290)
		colorDistMagn   0.79477
		colorDistFreq   3.38442e-005
		detailScale     6.68664
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00661433
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.364542
		terraceProb     0.172627
		erosion         0
		montesMagn      0.57856
		montesFreq      4.13758
		montesSpiky     0.803307
		montesFraction  0.69274
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000146082
		hillsFraction   0.729392
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253462
		craterFreq      0.246375
		craterDensity   0.960287
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.418077
		volcanoTemp     1761.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.225, 0.175, 0.121, 0.000)
		colorShelf     (0.231, 0.180, 0.139, 0.000)
		colorBeach     (0.271, 0.211, 0.165, 0.000)
		colorDesert    (0.294, 0.226, 0.160, 0.000)
		colorLowland   (0.323, 0.241, 0.182, 0.000)
		colorUpland    (0.358, 0.293, 0.221, 0.000)
		colorRock      (0.387, 0.318, 0.238, 0.000)
		colorSnow      (0.421, 0.339, 0.251, 1.000)
		BumpHeight      0.220385
		BumpOffset      0.044077
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000734813
		Period          0.00115329
		Eccentricity    0
		Inclination     1.05844
		AscendingNode   -159.365
		ArgOfPericenter -78.895
		MeanAnomaly     26.0443
	}
}

DwarfMoon	"Ahch-To System 1.S14"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            5.23269e-015
	Radius          0.257738
	InertiaMoment   0.398358

	Oblateness      0.249

	Obliquity       -0.652651
	EqAscendNode    73.1371
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.669 0.666 0.663)

	Surface
	{
		SurfStyle       0.319799
		OceanStyle      0.874157
		Randomize      (-0.046, 0.084, -0.567)
		colorDistMagn   0.390256
		colorDistFreq   4.89602e-005
		detailScale     7.03798
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0182951
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.641836
		terraceProb     0.177184
		erosion         0
		montesMagn      0.611374
		montesFreq      2.72961
		montesSpiky     0.926769
		montesFraction  0.497525
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000162056
		hillsFraction   0.539038
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209309
		craterFreq      0.213971
		craterDensity   0.731129
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511527
		volcanoTemp     1643.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.268, 0.266, 0.265, 0.000)
		colorShelf     (0.284, 0.283, 0.282, 0.000)
		colorBeach     (0.301, 0.300, 0.298, 0.000)
		colorDesert    (0.318, 0.316, 0.315, 0.000)
		colorLowland   (0.335, 0.333, 0.331, 0.000)
		colorUpland    (0.351, 0.350, 0.348, 0.000)
		colorRock      (0.368, 0.366, 0.365, 0.000)
		colorSnow      (0.385, 0.383, 0.381, 1.000)
		BumpHeight      0.231965
		BumpOffset      0.0463929
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000743619
		Period          0.00117408
		Eccentricity    0
		Inclination     -0.652651
		AscendingNode   73.1371
		ArgOfPericenter 176.019
		MeanAnomaly     -48.2384
	}
}

DwarfMoon	"Ahch-To System 1.S15"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            8.66227e-015
	Radius          0.291173
	InertiaMoment   0.399393

	Oblateness      0.242324

	Obliquity       0.613666
	EqAscendNode    -4.1415
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.651 0.648 0.643)

	Surface
	{
		SurfStyle       0.662719
		OceanStyle      0.0577277
		Randomize      (0.515, -0.577, -0.879)
		colorDistMagn   0.157001
		colorDistFreq   2.61697e-005
		detailScale     7.95095
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0214053
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.377043
		terraceProb     0.726072
		erosion         0
		montesMagn      0.582633
		montesFreq      3.29443
		montesSpiky     0.75824
		montesFraction  0.908713
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000215448
		hillsFraction   0.567593
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25158
		craterFreq      0.202736
		craterDensity   1.00675
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535169
		volcanoTemp     1844.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.220, 0.180, 0.000)
		colorShelf     (0.261, 0.227, 0.206, 0.000)
		colorBeach     (0.306, 0.266, 0.244, 0.000)
		colorDesert    (0.332, 0.285, 0.238, 0.000)
		colorLowland   (0.365, 0.305, 0.270, 0.000)
		colorUpland    (0.404, 0.370, 0.328, 0.000)
		colorRock      (0.436, 0.402, 0.353, 0.000)
		colorSnow      (0.475, 0.428, 0.373, 1.000)
		BumpHeight      0.262055
		BumpOffset      0.0524111
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000757765
		Period          0.00120774
		Eccentricity    0
		Inclination     0.613666
		AscendingNode   -4.1415
		ArgOfPericenter 125.412
		MeanAnomaly     86.8283
	}
}

DwarfMoon	"Ahch-To System 1.S16"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            1.386e-014
	Radius          0.327018
	InertiaMoment   0.396818

	Oblateness      0.204648

	Obliquity       0.13619
	EqAscendNode    -22.9186
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.485 0.393 0.318)

	Surface
	{
		SurfStyle       0.32154
		OceanStyle      0.322292
		Randomize      (-0.474, 0.984, -0.891)
		colorDistMagn   0.499602
		colorDistFreq   4.70104e-005
		detailScale     8.92976
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00465789
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.684663
		terraceProb     0.307029
		erosion         0
		montesMagn      0.403358
		montesFreq      2.03637
		montesSpiky     0.862165
		montesFraction  0.433718
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000254591
		hillsFraction   0.754288
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248681
		craterFreq      0.276838
		craterDensity   0.800583
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505301
		volcanoTemp     1536.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.157, 0.127, 0.000)
		colorShelf     (0.206, 0.167, 0.135, 0.000)
		colorBeach     (0.218, 0.177, 0.143, 0.000)
		colorDesert    (0.230, 0.187, 0.151, 0.000)
		colorLowland   (0.242, 0.197, 0.159, 0.000)
		colorUpland    (0.254, 0.206, 0.167, 0.000)
		colorRock      (0.267, 0.216, 0.175, 0.000)
		colorSnow      (0.279, 0.226, 0.183, 1.000)
		BumpHeight      0.294316
		BumpOffset      0.0588632
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00076732
		Period          0.00123066
		Eccentricity    0
		Inclination     0.13619
		AscendingNode   -22.9186
		ArgOfPericenter -64.7846
		MeanAnomaly     -52.9051
	}
}

DwarfMoon	"Ahch-To System 1.S17"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            2.15869e-014
	Radius          0.350568
	InertiaMoment   0.398527

	Oblateness      0.152224

	Obliquity       0.511845
	EqAscendNode    53.7935
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.524 0.416 0.366)

	Surface
	{
		SurfStyle       0.38808
		OceanStyle      0.736392
		Randomize      (-0.855, -0.662, 0.257)
		colorDistMagn   0.492142
		colorDistFreq   7.72904e-005
		detailScale     9.57285
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0159342
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.59171
		terraceProb     0.33544
		erosion         0
		montesMagn      0.609241
		montesFreq      4.55357
		montesSpiky     0.95175
		montesFraction  0.879657
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000321727
		hillsFraction   0.725448
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236145
		craterFreq      0.265235
		craterDensity   0.866854
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.406516
		volcanoTemp     1077.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.166, 0.146, 0.000)
		colorShelf     (0.223, 0.177, 0.155, 0.000)
		colorBeach     (0.236, 0.187, 0.164, 0.000)
		colorDesert    (0.249, 0.197, 0.174, 0.000)
		colorLowland   (0.262, 0.208, 0.183, 0.000)
		colorUpland    (0.275, 0.218, 0.192, 0.000)
		colorRock      (0.288, 0.229, 0.201, 0.000)
		colorSnow      (0.301, 0.239, 0.210, 1.000)
		BumpHeight      0.315511
		BumpOffset      0.0631023
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000784882
		Period          0.00127315
		Eccentricity    0
		Inclination     0.511845
		AscendingNode   53.7935
		ArgOfPericenter 138.331
		MeanAnomaly     10.3783
	}
}

DwarfMoon	"Ahch-To System 1.S18"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            3.29016e-014
	Radius          0.479754
	InertiaMoment   0.399523

	Oblateness      0.242573

	Obliquity       -1.15917
	EqAscendNode    152.201
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.518 0.512 0.504)

	Surface
	{
		SurfStyle       0.0155795
		OceanStyle      0.709123
		Randomize      (-0.840, 0.198, 0.820)
		colorDistMagn   0.465857
		colorDistFreq   0.000176403
		detailScale     13.1005
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00971656
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.663291
		terraceProb     0.276771
		erosion         0
		montesMagn      0.42022
		montesFreq      3.26196
		montesSpiky     0.978575
		montesFraction  0.659174
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000558604
		hillsFraction   0.48472
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234456
		craterFreq      0.214061
		craterDensity   0.97882
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497768
		volcanoTemp     1643.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.205, 0.202, 0.000)
		colorShelf     (0.220, 0.218, 0.214, 0.000)
		colorBeach     (0.233, 0.230, 0.227, 0.000)
		colorDesert    (0.246, 0.243, 0.239, 0.000)
		colorLowland   (0.259, 0.256, 0.252, 0.000)
		colorUpland    (0.272, 0.269, 0.265, 0.000)
		colorRock      (0.285, 0.282, 0.277, 0.000)
		colorSnow      (0.298, 0.294, 0.290, 1.000)
		BumpHeight      0.431778
		BumpOffset      0.0863557
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00080007
		Period          0.00131028
		Eccentricity    0
		Inclination     -1.15917
		AscendingNode   152.201
		ArgOfPericenter 158.08
		MeanAnomaly     21.9743
	}
}

DwarfMoon	"Ahch-To System 1.S19"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            4.92738e-014
	Radius          0.522777
	InertiaMoment   0.397199

	Oblateness      0.2009

	Obliquity       -0.711831
	EqAscendNode    174.391
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.720 0.693 0.651)

	Surface
	{
		SurfStyle       0.221543
		OceanStyle      0.942092
		Randomize      (-0.355, 0.399, -0.260)
		colorDistMagn   0.622465
		colorDistFreq   0.000233565
		detailScale     14.2753
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00119604
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.556259
		terraceProb     0.267383
		erosion         0
		montesMagn      0.536386
		montesFreq      2.97492
		montesSpiky     0.99556
		montesFraction  0.861576
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000690638
		hillsFraction   0.603009
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258149
		craterFreq      0.201256
		craterDensity   0.924448
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.505399
		volcanoTemp     1373.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.288, 0.277, 0.260, 0.000)
		colorShelf     (0.306, 0.294, 0.277, 0.000)
		colorBeach     (0.324, 0.312, 0.293, 0.000)
		colorDesert    (0.342, 0.329, 0.309, 0.000)
		colorLowland   (0.360, 0.346, 0.326, 0.000)
		colorUpland    (0.378, 0.364, 0.342, 0.000)
		colorRock      (0.396, 0.381, 0.358, 0.000)
		colorSnow      (0.414, 0.398, 0.374, 1.000)
		BumpHeight      0.4705
		BumpOffset      0.0940999
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000809071
		Period          0.00133245
		Eccentricity    0
		Inclination     -0.711831
		AscendingNode   174.391
		ArgOfPericenter -28.4801
		MeanAnomaly     35.8076
	}
}

DwarfMoon	"Ahch-To System 1.S20"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            7.27447e-014
	Radius          0.571796
	InertiaMoment   0.398687

	Oblateness      0.174217

	Obliquity       0.447548
	EqAscendNode    -112.407
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.410 0.409 0.406)

	Surface
	{
		SurfStyle       0.720221
		OceanStyle      0.565461
		Randomize      (0.364, 0.454, 0.318)
		colorDistMagn   0.444199
		colorDistFreq   0.000242821
		detailScale     15.6138
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00868666
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.418437
		terraceProb     0.594656
		erosion         0
		montesMagn      0.593228
		montesFreq      2.95465
		montesSpiky     0.85369
		montesFraction  0.429072
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000817637
		hillsFraction   0.559321
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221382
		craterFreq      0.221497
		craterDensity   0.993755
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481233
		volcanoTemp     1387.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.160, 0.139, 0.114, 0.000)
		colorShelf     (0.164, 0.143, 0.130, 0.000)
		colorBeach     (0.193, 0.168, 0.154, 0.000)
		colorDesert    (0.209, 0.180, 0.150, 0.000)
		colorLowland   (0.230, 0.192, 0.170, 0.000)
		colorUpland    (0.254, 0.233, 0.207, 0.000)
		colorRock      (0.275, 0.253, 0.223, 0.000)
		colorSnow      (0.300, 0.270, 0.235, 1.000)
		BumpHeight      0.514616
		BumpOffset      0.102923
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000816494
		Period          0.00135083
		Eccentricity    0
		Inclination     0.447548
		AscendingNode   -112.407
		ArgOfPericenter -147.491
		MeanAnomaly     -40.7194
	}
}

DwarfMoon	"Ahch-To System 1.S21"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            1.0615e-013
	Radius          0.610812
	InertiaMoment   0.399651

	Oblateness      0.144787

	Obliquity       -0.619466
	EqAscendNode    172.166
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.525 0.520 0.516)

	Surface
	{
		SurfStyle       0.720815
		OceanStyle      0.285725
		Randomize      (-0.375, -0.007, 0.738)
		colorDistMagn   0.659039
		colorDistFreq   0.000119742
		detailScale     16.6792
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00146484
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.715618
		terraceProb     0.121182
		erosion         0
		montesMagn      0.513979
		montesFreq      3.02058
		montesSpiky     0.898449
		montesFraction  0.434876
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000744124
		hillsFraction   0.630568
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232057
		craterFreq      0.198376
		craterDensity   0.943555
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495131
		volcanoTemp     1536.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.177, 0.144, 0.000)
		colorShelf     (0.210, 0.182, 0.165, 0.000)
		colorBeach     (0.247, 0.213, 0.196, 0.000)
		colorDesert    (0.268, 0.229, 0.191, 0.000)
		colorLowland   (0.294, 0.245, 0.217, 0.000)
		colorUpland    (0.325, 0.297, 0.263, 0.000)
		colorRock      (0.352, 0.323, 0.284, 0.000)
		colorSnow      (0.383, 0.343, 0.299, 1.000)
		BumpHeight      0.549731
		BumpOffset      0.109946
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000818884
		Period          0.00135677
		Eccentricity    0
		Inclination     -0.619466
		AscendingNode   172.166
		ArgOfPericenter -40.3027
		MeanAnomaly     -104.25
	}
}

DwarfMoon	"Ahch-To System 1.S22"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            1.53442e-013
	Radius          0.809174
	InertiaMoment   0.3975

	Oblateness      0.226956

	Obliquity       1.41687
	EqAscendNode    172.04
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.494 0.435 0.402)

	Surface
	{
		SurfStyle       0.190749
		OceanStyle      0.365432
		Randomize      (0.094, -0.412, -0.881)
		colorDistMagn   0.661078
		colorDistFreq   0.000538371
		detailScale     22.0958
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00343536
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.435908
		terraceProb     0.25022
		erosion         0
		montesMagn      0.629382
		montesFreq      1.91634
		montesSpiky     0.87236
		montesFraction  0.847986
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00161348
		hillsFraction   0.622936
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214182
		craterFreq      0.175684
		craterDensity   0.923646
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.441214
		volcanoTemp     909.042
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.174, 0.161, 0.000)
		colorShelf     (0.210, 0.185, 0.171, 0.000)
		colorBeach     (0.222, 0.196, 0.181, 0.000)
		colorDesert    (0.235, 0.207, 0.191, 0.000)
		colorLowland   (0.247, 0.218, 0.201, 0.000)
		colorUpland    (0.260, 0.228, 0.211, 0.000)
		colorRock      (0.272, 0.239, 0.221, 0.000)
		colorSnow      (0.284, 0.250, 0.231, 1.000)
		BumpHeight      0.728256
		BumpOffset      0.145651
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000823717
		Period          0.0013688
		Eccentricity    0
		Inclination     1.41687
		AscendingNode   172.04
		ArgOfPericenter -134.807
		MeanAnomaly     39.7195
	}
}

DwarfMoon	"Ahch-To System 1.S23"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            2.2014e-013
	Radius          0.86612
	InertiaMoment   0.398838

	Oblateness      0.183199

	Obliquity       -0.0342071
	EqAscendNode    -24.3001
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.691 0.686 0.684)

	Surface
	{
		SurfStyle       0.0887746
		OceanStyle      0.721823
		Randomize      (0.034, -0.530, 0.415)
		colorDistMagn   0.453654
		colorDistFreq   0.000643076
		detailScale     23.6509
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00114512
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.752125
		terraceProb     0.78509
		erosion         0
		montesMagn      0.456567
		montesFreq      2.78867
		montesSpiky     0.988442
		montesFraction  0.354529
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00180234
		hillsFraction   0.481114
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.20012
		craterFreq      0.224677
		craterDensity   1.01101
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478295
		volcanoTemp     1430.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.276, 0.274, 0.273, 0.000)
		colorShelf     (0.294, 0.291, 0.291, 0.000)
		colorBeach     (0.311, 0.309, 0.308, 0.000)
		colorDesert    (0.328, 0.326, 0.325, 0.000)
		colorLowland   (0.345, 0.343, 0.342, 0.000)
		colorUpland    (0.363, 0.360, 0.359, 0.000)
		colorRock      (0.380, 0.377, 0.376, 0.000)
		colorSnow      (0.397, 0.394, 0.393, 1.000)
		BumpHeight      0.779508
		BumpOffset      0.155902
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000840999
		Period          0.0014121
		Eccentricity    0
		Inclination     -0.0342071
		AscendingNode   -24.3001
		ArgOfPericenter -83.134
		MeanAnomaly     171.472
	}
}

DwarfMoon	"Ahch-To System 1.S24"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            3.13984e-013
	Radius          0.936488
	InertiaMoment   0.399777

	Oblateness      0.159151

	Obliquity       -0.0797666
	EqAscendNode    175.16
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.637 0.631 0.629)

	Surface
	{
		SurfStyle       0.725583
		OceanStyle      0.0110227
		Randomize      (0.872, -0.510, -0.648)
		colorDistMagn   0.739882
		colorDistFreq   0.000502109
		detailScale     25.5724
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.35856
		terraceProb     0.22487
		erosion         0
		montesMagn      0.581433
		montesFreq      3.11761
		montesSpiky     0.870034
		montesFraction  0.601687
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00203571
		hillsFraction   0.627145
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272058
		craterFreq      0.210611
		craterDensity   0.87114
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526474
		volcanoTemp     1184.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.215, 0.176, 0.000)
		colorShelf     (0.255, 0.221, 0.201, 0.000)
		colorBeach     (0.299, 0.259, 0.239, 0.000)
		colorDesert    (0.325, 0.278, 0.233, 0.000)
		colorLowland   (0.357, 0.297, 0.264, 0.000)
		colorUpland    (0.395, 0.360, 0.321, 0.000)
		colorRock      (0.427, 0.391, 0.346, 0.000)
		colorSnow      (0.465, 0.417, 0.365, 1.000)
		BumpHeight      0.842839
		BumpOffset      0.168568
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000847613
		Period          0.00142879
		Eccentricity    0
		Inclination     -0.0797666
		AscendingNode   175.16
		ArgOfPericenter -61.0874
		MeanAnomaly     -101.604
	}
}

DwarfMoon	"Ahch-To System 1.S25"
{
	ParentBody     "Ahch-To System 1"
	Class	       "Asteroid"

	Mass            4.45885e-013
	Radius          0.999114
	InertiaMoment   0.397752

	Oblateness      0.125099

	Obliquity       -0.800926
	EqAscendNode    88.1014
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.519 0.428 0.294)

	Surface
	{
		SurfStyle       0.788194
		OceanStyle      0.867132
		Randomize      (0.826, -0.575, -0.809)
		colorDistMagn   0.767648
		colorDistFreq   0.000551819
		detailScale     27.2825
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0200928
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.67118
		terraceProb     0.318959
		erosion         0
		montesMagn      0.363112
		montesFreq      2.14757
		montesSpiky     0.918694
		montesFraction  0.499847
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00222241
		hillsFraction   0.70809
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2547
		craterFreq      0.276736
		craterDensity   0.853311
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547997
		volcanoTemp     1574.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.146, 0.082, 0.000)
		colorShelf     (0.208, 0.150, 0.094, 0.000)
		colorBeach     (0.244, 0.176, 0.112, 0.000)
		colorDesert    (0.265, 0.188, 0.109, 0.000)
		colorLowland   (0.291, 0.201, 0.124, 0.000)
		colorUpland    (0.322, 0.244, 0.150, 0.000)
		colorRock      (0.348, 0.266, 0.162, 0.000)
		colorSnow      (0.379, 0.283, 0.171, 1.000)
		BumpHeight      0.899203
		BumpOffset      0.179841
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000869544
		Period          0.0014846
		Eccentricity    0
		Inclination     -0.800926
		AscendingNode   88.1014
		ArgOfPericenter -44.9819
		MeanAnomaly     35.0188
	}
}

Planet	"Ahch-To System 3"
{
	ParentBody     "Ahch-To System"
	Class	       "GasGiant"

	Mass            748.591
	Radius          77219.4
	InertiaMoment   0.237193

	Oblateness      0.0420373

	RotationPeriod  8.81935
	Obliquity       -40.5247
	EqAscendNode    -78.6128

	AlbedoBond      0.501188
	AlbedoGeom      0.601426
	Brightness      2

	Surface
	{
		SurfStyle       0.689562
		Randomize      (0.903, -0.229, -0.358)
		detailScale     198613
		colorConversion true
		tropicLatitude  0.699068
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.6034
		stripeFluct     0.436292
		stripeTwist     12.8622
		cycloneMagn     10.4493
		cycloneFreq     1.05866
		cycloneDensity  0.567593
		cycloneOctaves  5
		colorLayer0    (0.840, 0.730, 0.570, 1.100)
		colorLayer1    (0.850, 0.750, 0.600, 0.600)
		colorLayer2    (0.340, 0.290, 0.200, 0.100)
		colorLayer3    (0.460, 0.380, 0.270, 0.000)
		colorLayer4    (0.560, 0.470, 0.320, 0.000)
		colorLayer5    (0.580, 0.500, 0.360, 0.000)
		colorLayer6    (0.730, 0.630, 0.480, 0.000)
		colorLayer7    (0.690, 0.660, 0.620, 1.000)
		colorLowPlants (0.560, 0.470, 0.320, 0.000)
		colorUpPlants  (0.580, 0.500, 0.360, 0.000)
		BumpHeight      8.84994
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          47.2188
		Velocity        2561.2
		BumpHeight      38.3669
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.998894
		mainOctaves     12
		Coverage        0.511879
		stripeZones     2.6034
		stripeFluct     0.436292
		stripeTwist     12.8622
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          200.684
		Density         5434
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0428908
		Saturation      0.796071

		Composition
		{
			H2    	91.6248
			He    	8.0336
			CH4   	0.294084
			N2    	0.0353095
			O2    	0.00811304
			Ne    	0.00130486
			C2H4  	0.00121564
			Ar    	0.000862837
			C2H2  	0.000428662
			C2H6  	0.000239924
		}
	}

	Aurora
	{
		Height      4392.63
		NorthLat    84.4338
		NorthLon    -136.077
		NorthRadius 26394.6
		NorthWidth  11372.5
		NorthRings  2
		NorthBright 1
		NorthParticles 10000
		SouthLat    -82.0125
		SouthLon    48.4748
		SouthRadius 22310.4
		SouthWidth  9367.96
		SouthRings  5
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     121405
		OuterRadius     228129
		RotationPeriod  7.3986
		RotationOffset  0
		FrontBright     0.195726
		BackBright      0.472232
		Density         0.214334
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.95151
		Period          6.30745
		Eccentricity    0.0517837
		Inclination     -11.4481
		AscendingNode   -76.5723
		ArgOfPericenter 134.536
		MeanAnomaly     193.794
	}
}

Moon	"Ahch-To System 3.1"
{
	ParentBody     "Ahch-To System 3"
	Class	       "Selena"

	Mass            0.0127315
	Radius          2033.83
	InertiaMoment   0.374158

	Oblateness      0.00999441

	Obliquity       0.290042
	EqAscendNode    -124.169
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.708 0.705 0.700)

	Surface
	{
		SurfStyle       0.871201
		OceanStyle      0.782471
		Randomize      (-0.404, 0.137, -0.418)
		colorDistMagn   0.0672197
		colorDistFreq   218.314
		detailScale     5231.13
		colorConversion true
		drivenDarkening 0
		seaLevel        0.202376
		snowLevel       2
		tropicLatitude  0.00473405
		icecapLatitude  1.03503
		icecapHeight    0.154591
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.05689
		venusFreq       1.75561
		venusMagn       0
		mareFreq        0.930977
		mareDensity     0.00253428
		terraceProb     0.207988
		erosion         0
		montesMagn      0.111871
		montesFreq      73.572
		montesSpiky     0.978432
		montesFraction  0.0710812
		dunesMagn       0.0427368
		dunesFreq       2617.24
		dunesFraction   0.66687
		hillsMagn       0.137616
		hillsFreq       233.29
		hillsFraction   0.544586
		hills2Fraction  0
		riversMagn      70.2647
		riversFreq      3.27321
		riversSin       6.56254
		riversOctaves   0
		canyonsMagn     0.3652
		canyonsFreq     0.763428
		canyonFraction  0.567891
		cracksMagn      0.0586498
		cracksFreq      1.23116
		cracksOctaves   0
		craterMagn      0.546414
		craterFreq      6.466
		craterDensity   0.608252
		craterOctaves   7.8192
		craterRayedFactor 0
		volcanoMagn     0.339869
		volcanoFreq     0.756494
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.198443
		volcanoRadius   0.258332
		volcanoTemp     1426.78
		lavaCoverTidal  0.321293
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.400, 0.350, 0.320, 0.000)
		colorShelf     (0.470, 0.410, 0.380, 0.000)
		colorBeach     (0.396, 0.331, 0.294, 0.000)
		colorDesert    (0.361, 0.310, 0.259, 0.000)
		colorLowland   (0.276, 0.240, 0.196, 0.000)
		colorUpland    (0.467, 0.423, 0.364, 0.000)
		colorRock      (0.670, 0.620, 0.550, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00255601
		Period          0.00273148
		Eccentricity    0.0117164
		Inclination     0.290042
		AscendingNode   -124.169
		ArgOfPericenter -55.2013
		MeanAnomaly     51.7721
	}
}

Moon	"Ahch-To System 3.2"
{
	ParentBody     "Ahch-To System 3"
	Class	       "Selena"

	Mass            0.0150596
	Radius          2021.52
	InertiaMoment   0.369424

	Oblateness      0.00167544

	Obliquity       -0.754049
	EqAscendNode    -53.8612
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.519 0.400 0.281)

	Surface
	{
		SurfStyle       0.475313
		OceanStyle      0.0389854
		Randomize      (0.927, 0.509, -0.459)
		colorDistMagn   0.0635438
		colorDistFreq   284.426
		detailScale     5199.47
		colorConversion true
		drivenDarkening 0
		seaLevel        0.232779
		snowLevel       2
		tropicLatitude  0.0234638
		icecapLatitude  0.429154
		icecapHeight    0.286878
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.58879
		venusFreq       1.32323
		venusMagn       0
		mareFreq        1.01854
		mareDensity     0.00292737
		terraceProb     0.227172
		erosion         0
		montesMagn      0.135484
		montesFreq      119.65
		montesSpiky     0.969647
		montesFraction  0.482242
		dunesMagn       0.043374
		dunesFreq       2685.39
		dunesFraction   0.196937
		hillsMagn       0.108875
		hillsFreq       255.997
		hillsFraction   0.382991
		hills2Fraction  0
		riversMagn      68.5214
		riversFreq      3.76351
		riversSin       5.76533
		riversOctaves   0
		canyonsMagn     0.404466
		canyonsFreq     0.757082
		canyonFraction  0.654582
		cracksMagn      0.0614744
		cracksFreq      0.789762
		cracksOctaves   0
		craterMagn      0.632833
		craterFreq      5.32953
		craterDensity   0.665368
		craterOctaves   8.60171
		craterRayedFactor 0
		volcanoMagn     0.342911
		volcanoFreq     0.567438
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.336859
		volcanoRadius   0.298227
		volcanoTemp     1479.55
		lavaCoverTidal  0.242252
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.285, 0.228, 0.169, 0.000)
		colorDesert    (0.249, 0.184, 0.129, 0.000)
		colorLowland   (0.317, 0.244, 0.158, 0.000)
		colorUpland    (0.337, 0.260, 0.172, 0.000)
		colorRock      (0.340, 0.340, 0.340, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00433113
		Period          0.00602497
		Eccentricity    0.0483576
		Inclination     -0.754049
		AscendingNode   -53.8612
		ArgOfPericenter -8.27554
		MeanAnomaly     52.1145
	}
}

Moon	"Ahch-To System 3.3"
{
	ParentBody     "Ahch-To System 3"
	Class	       "Desert"

	Mass            0.177095
	Radius          4760.37
	InertiaMoment   0.330093

	Obliquity       1.14661
	EqAscendNode    -137.399
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.547 0.543 0.540)

	Surface
	{
		SurfStyle       0.339414
		OceanStyle      0.464013
		Randomize      (0.364, -0.995, -0.981)
		colorDistMagn   0.0445389
		colorDistFreq   559.341
		detailScale     12243.9
		colorConversion true
		seaLevel        0.159224
		snowLevel       2
		tropicLatitude  0.0145378
		icecapLatitude  0.708473
		icecapHeight    0.171454
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.635856
		venusFreq       1.31429
		venusMagn       0
		mareFreq        0.913148
		mareDensity     0.0205602
		terraceProb     0.345188
		erosion         0
		montesMagn      0.22379
		montesFreq      281.622
		montesSpiky     0.900747
		montesFraction  0.44106
		dunesMagn       0.0604411
		dunesFreq       38.7513
		dunesFraction   0.869528
		hillsMagn       0.157216
		hillsFreq       525.438
		hillsFraction   0
		hills2Fraction  0
		riversMagn      52.7408
		riversFreq      2.44447
		riversSin       6.23641
		riversOctaves   0
		canyonsMagn     0.0461975
		canyonsFreq     144.88
		canyonFraction  0
		cracksMagn      0.071945
		cracksFreq      0.452713
		cracksOctaves   0
		craterMagn      0.563534
		craterFreq      11.0897
		craterDensity   0.613629
		craterOctaves   10.0031
		volcanoMagn     0.682037
		volcanoFreq     0.659191
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.995706
		volcanoRadius   0.596177
		volcanoTemp     1608.35
		lavaCoverTidal  0.252711
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.640, 0.620, 0.420, 0.000)
		colorShelf     (0.680, 0.620, 0.470, 0.000)
		colorBeach     (0.740, 0.730, 0.610, 0.000)
		colorDesert    (0.450, 0.420, 0.380, 0.000)
		colorLowland   (0.530, 0.480, 0.400, 0.000)
		colorUpland    (0.600, 0.540, 0.420, 0.000)
		colorRock      (0.170, 0.160, 0.160, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.530, 0.480, 0.400, 0.000)
		colorUpPlants  (0.600, 0.540, 0.420, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.96281
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Titan"
		Height          35.2049
		Density         0.00371898
		Pressure        0.00102801
		Greenhouse      0.105582
		Bright          5.17708
		Opacity         1
		SkyLight        1.72569
		Hue             0.015291
		Saturation      1

		Composition
		{
			CO2   	89.8651
			C2H4  	7.25334
			C2H2  	1.42664
			N2    	1.32421
			C2H6  	0.125176
			H2S   	0.00514164
			CO    	0.000234608
			Ar    	0.000129074
			O2    	3.70162e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00733905
		Period          0.0132882
		Eccentricity    0.0487245
		Inclination     1.14661
		AscendingNode   -137.399
		ArgOfPericenter 157.497
		MeanAnomaly     -102.75
	}
}

Moon	"Ahch-To System 3.4"
{
	ParentBody     "Ahch-To System 3"
	Class	       "IceWorld"

	Mass            0.020728
	Radius          2243.68
	InertiaMoment   0.361048

	Obliquity       0.956059
	EqAscendNode    17.0293
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.542 0.538 0.536)

	Surface
	{
		SurfStyle       0.912374
		OceanStyle      0.486753
		Randomize      (-0.349, 0.179, -0.716)
		colorDistMagn   0.0635592
		colorDistFreq   291.024
		detailScale     5770.88
		colorConversion true
		drivenDarkening 0.5811
		seaLevel        0.247493
		snowLevel       2
		tropicLatitude  0.0329988
		icecapLatitude  0.779202
		icecapHeight    0.258365
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.53956
		venusFreq       0.963939
		venusMagn       0.223015
		mareFreq        1.07891
		mareDensity     0.00423065
		terraceProb     0.166235
		erosion         0
		montesMagn      0.119161
		montesFreq      106.941
		montesSpiky     0.957113
		montesFraction  0.545563
		dunesMagn       0.0253371
		dunesFreq       2902.8
		dunesFraction   0.786046
		hillsMagn       0.108446
		hillsFreq       212.096
		hillsFraction   0.809932
		hills2Fraction  0.26019
		riversMagn      66.604
		riversFreq      3.94299
		riversSin       7.0018
		riversOctaves   0
		canyonsMagn     0.585351
		canyonsFreq     0.713626
		canyonFraction  0
		cracksMagn      0.0331981
		cracksFreq      1.14857
		cracksOctaves   2
		craterMagn      0.60913
		craterFreq      4.79811
		craterDensity   0.88686
		craterOctaves   11
		craterRayedFactor 0.0611839
		volcanoMagn     0.361957
		volcanoFreq     0.799512
		volcanoDensity  0.155235
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.145961
		volcanoRadius   0.297915
		volcanoTemp     1537.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.412, 0.382, 0.311, 1.000)
		colorShelf     (0.412, 0.382, 0.311, 1.000)
		colorBeach     (0.379, 0.334, 0.268, 1.000)
		colorDesert    (0.379, 0.334, 0.268, 1.000)
		colorLowland   (0.460, 0.436, 0.407, 1.000)
		colorUpland    (0.482, 0.479, 0.461, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.460, 0.436, 0.407, 1.000)
		colorUpPlants  (0.482, 0.479, 0.461, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0124359
		Period          0.0293135
		Eccentricity    0.00116346
		Inclination     0.956059
		AscendingNode   17.0293
		ArgOfPericenter 131.413
		MeanAnomaly     127.117
	}
}

Moon	"Ahch-To System 3.5"
{
	ParentBody     "Ahch-To System 3"
	Class	       "IceWorld"

	Mass            0.0241705
	Radius          2179.58
	InertiaMoment   0.356738

	Obliquity       -39.88
	EqAscendNode    -117.041
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.610 0.605 0.598)

	Surface
	{
		SurfStyle       0.779467
		OceanStyle      0.463511
		Randomize      (-0.479, 0.019, -0.104)
		colorDistMagn   0.0626745
		colorDistFreq   203.745
		detailScale     5606.01
		colorConversion true
		drivenDarkening 0
		seaLevel        0.23007
		snowLevel       2
		tropicLatitude  0.630995
		icecapLatitude  1
		icecapHeight    0.23007
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.5981
		venusFreq       1.05801
		venusMagn       0
		mareFreq        0.982009
		mareDensity     0.00669303
		terraceProb     0.376839
		erosion         0
		montesMagn      0.113377
		montesFreq      125.718
		montesSpiky     0.927528
		montesFraction  0.840589
		dunesMagn       0.0422826
		dunesFreq       2870.2
		dunesFraction   0.621769
		hillsMagn       0.144509
		hillsFreq       220.266
		hillsFraction   0.465397
		hills2Fraction  0.117583
		riversMagn      68.5703
		riversFreq      2.89658
		riversSin       6.58724
		riversOctaves   0
		canyonsMagn     0.483613
		canyonsFreq     0.926889
		canyonFraction  0
		cracksMagn      0.0498864
		cracksFreq      0.842263
		cracksOctaves   2
		craterMagn      0.618905
		craterFreq      7.38279
		craterDensity   0.95733
		craterOctaves   11
		craterRayedFactor 0.186064
		volcanoMagn     0.364037
		volcanoFreq     0.825249
		volcanoDensity  0.2199
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.0770884
		volcanoRadius   0.297133
		volcanoTemp     1568.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.391, 0.387, 0.401, 0.250)
		colorShelf     (0.427, 0.441, 0.454, 0.250)
		colorBeach     (0.348, 0.327, 0.347, 0.200)
		colorDesert    (0.324, 0.296, 0.305, 0.200)
		colorLowland   (0.238, 0.230, 0.251, 0.200)
		colorUpland    (0.452, 0.448, 0.454, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.238, 0.230, 0.251, 0.200)
		colorUpPlants  (0.452, 0.448, 0.454, 0.250)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Pluto"
		Height          122.306
		Density         1.61034e-008
		Pressure        2.14543e-009
		Greenhouse      0.000184817
		Bright          0.5
		Opacity         0
		SkyLight        0.166667
		Hue             -0.0492557
		Saturation      1

		Composition
		{
			Kr    	99.5922
			Xe    	0.407682
			Cl2   	0.000100219
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.058745
		Period          0.300958
		Eccentricity    0.0551757
		Inclination     -39.88
		AscendingNode   -117.041
		ArgOfPericenter 66.476
		MeanAnomaly     75.3819
	}
}

DwarfMoon	"Ahch-To System 3.D1"
{
	ParentBody     "Ahch-To System 3"
	Class	       "Asteroid"

	Mass            1.0662e-008
	Radius          32.9837
	InertiaMoment   0.399458

	Obliquity       65.0067
	EqAscendNode    -156.842
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.776 0.774 0.772)

	Surface
	{
		SurfStyle       0.145795
		OceanStyle      0.230501
		Randomize      (-0.930, 0.134, -0.245)
		colorDistMagn   0.476328
		colorDistFreq   0.350686
		detailScale     900.674
		colorConversion true
		snowLevel       2
		tropicLatitude  0.357774
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.605215
		terraceProb     0.224546
		erosion         0
		montesMagn      0.683911
		montesFreq      3.3927
		montesSpiky     0.993085
		montesFraction  0.829701
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.01446
		hillsFraction   0.3466
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238119
		craterFreq      0.203986
		craterDensity   0.965208
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537887
		volcanoTemp     1374.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.310, 0.309, 0.000)
		colorShelf     (0.330, 0.329, 0.328, 0.000)
		colorBeach     (0.349, 0.348, 0.347, 0.000)
		colorDesert    (0.368, 0.368, 0.367, 0.000)
		colorLowland   (0.388, 0.387, 0.386, 0.000)
		colorUpland    (0.407, 0.406, 0.405, 0.000)
		colorRock      (0.427, 0.426, 0.425, 0.000)
		colorSnow      (0.446, 0.445, 0.444, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0589678
		Period          0.302678
		Eccentricity    0.0429506
		Inclination     65.0067
		AscendingNode   -156.842
		ArgOfPericenter 42.3943
		MeanAnomaly     -23.6396
	}
}

DwarfMoon	"Ahch-To System 3.D2"
{
	ParentBody     "Ahch-To System 3"
	Class	       "Asteroid"

	Mass            1.4526e-008
	Radius          34.8144
	InertiaMoment   0.39702

	Obliquity       78.3749
	EqAscendNode    175.574
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.563 0.557 0.554)

	Surface
	{
		SurfStyle       0.571344
		OceanStyle      0.349147
		Randomize      (0.712, 0.739, 0.264)
		colorDistMagn   0.237827
		colorDistFreq   0.607088
		detailScale     950.664
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0755885
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.446245
		terraceProb     0.288707
		erosion         0
		montesMagn      0.524592
		montesFreq      2.80084
		montesSpiky     0.737223
		montesFraction  0.0795072
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.62474
		hillsFraction   0.54652
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231646
		craterFreq      0.247505
		craterDensity   1.09255
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.559047
		volcanoTemp     1405.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.190, 0.155, 0.000)
		colorShelf     (0.225, 0.195, 0.177, 0.000)
		colorBeach     (0.265, 0.229, 0.210, 0.000)
		colorDesert    (0.287, 0.245, 0.205, 0.000)
		colorLowland   (0.315, 0.262, 0.233, 0.000)
		colorUpland    (0.349, 0.318, 0.282, 0.000)
		colorRock      (0.377, 0.346, 0.305, 0.000)
		colorSnow      (0.411, 0.368, 0.321, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0595433
		Period          0.307119
		Eccentricity    0.452459
		Inclination     78.3749
		AscendingNode   175.574
		ArgOfPericenter 9.17145
		MeanAnomaly     -54.4809
	}
}

DwarfMoon	"Ahch-To System 3.D3"
{
	ParentBody     "Ahch-To System 3"
	Class	       "Asteroid"

	Mass            1.97462e-008
	Radius          37.0459
	InertiaMoment   0.398607

	RotationPeriod  8184.62
	Obliquity       -16.5536
	EqAscendNode    -106.411

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.511 0.504 0.500)

	Surface
	{
		SurfStyle       0.142141
		OceanStyle      0.819163
		Randomize      (-0.402, -0.579, 0.931)
		colorDistMagn   0.534869
		colorDistFreq   0.686666
		detailScale     1011.6
		colorConversion true
		snowLevel       2
		tropicLatitude  0.33629
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.313482
		terraceProb     0.281911
		erosion         0
		montesMagn      0.51938
		montesFreq      2.43995
		montesSpiky     0.877513
		montesFraction  0.592959
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.43462
		hillsFraction   0.596853
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.293098
		craterFreq      0.201147
		craterDensity   0.820994
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53651
		volcanoTemp     1167.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.202, 0.200, 0.000)
		colorShelf     (0.217, 0.214, 0.212, 0.000)
		colorBeach     (0.230, 0.227, 0.225, 0.000)
		colorDesert    (0.243, 0.240, 0.237, 0.000)
		colorLowland   (0.256, 0.252, 0.250, 0.000)
		colorUpland    (0.268, 0.265, 0.262, 0.000)
		colorRock      (0.281, 0.277, 0.275, 0.000)
		colorSnow      (0.294, 0.290, 0.287, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0600738
		Period          0.311232
		Eccentricity    0.147066
		Inclination     -16.5536
		AscendingNode   -106.411
		ArgOfPericenter -149.857
		MeanAnomaly     -22.6938
	}
}

DwarfMoon	"Ahch-To System 3.D4"
{
	ParentBody     "Ahch-To System 3"
	Class	       "Asteroid"

	Mass            2.68067e-008
	Radius          38.6738
	InertiaMoment   0.399586

	Obliquity       -24.8273
	EqAscendNode    -4.28189
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.795 0.763 0.748)

	Surface
	{
		SurfStyle       0.589735
		OceanStyle      0.448115
		Randomize      (0.948, 0.575, -0.134)
		colorDistMagn   0.736853
		colorDistFreq   0.578266
		detailScale     1056.05
		colorConversion true
		snowLevel       2
		tropicLatitude  0.761738
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.670541
		terraceProb     0.428765
		erosion         0
		montesMagn      0.348626
		montesFreq      3.62015
		montesSpiky     0.93622
		montesFraction  0.557769
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.5734
		hillsFraction   0.54717
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265389
		craterFreq      0.219719
		craterDensity   0.905994
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.431468
		volcanoTemp     1494.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.259, 0.210, 0.000)
		colorShelf     (0.318, 0.267, 0.239, 0.000)
		colorBeach     (0.374, 0.313, 0.284, 0.000)
		colorDesert    (0.405, 0.336, 0.277, 0.000)
		colorLowland   (0.445, 0.358, 0.314, 0.000)
		colorUpland    (0.493, 0.435, 0.382, 0.000)
		colorRock      (0.532, 0.473, 0.412, 0.000)
		colorSnow      (0.580, 0.503, 0.434, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0603731
		Period          0.313562
		Eccentricity    0.0947374
		Inclination     -24.8273
		AscendingNode   -4.28189
		ArgOfPericenter 155.048
		MeanAnomaly     46.3875
	}
}

DwarfMoon	"Ahch-To System 3.D5"
{
	ParentBody     "Ahch-To System 3"
	Class	       "Asteroid"

	Mass            3.63747e-008
	Radius          50.1328
	InertiaMoment   0.397355

	RotationPeriod  3720.96
	Obliquity       76.7406
	EqAscendNode    39.2322

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.761 0.703 0.649)

	Surface
	{
		SurfStyle       0.0381304
		OceanStyle      0.181226
		Randomize      (-0.924, -0.862, -0.747)
		colorDistMagn   0.779735
		colorDistFreq   1.94396
		detailScale     1368.96
		colorConversion true
		snowLevel       2
		tropicLatitude  0.732065
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.670885
		terraceProb     0.354636
		erosion         0
		montesMagn      0.239159
		montesFreq      2.72833
		montesSpiky     0.963391
		montesFraction  0.794983
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.06762
		hillsFraction   0.759726
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257357
		craterFreq      0.205916
		craterDensity   0.677834
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.460862
		volcanoTemp     1339.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.281, 0.260, 0.000)
		colorShelf     (0.323, 0.299, 0.276, 0.000)
		colorBeach     (0.342, 0.316, 0.292, 0.000)
		colorDesert    (0.361, 0.334, 0.308, 0.000)
		colorLowland   (0.380, 0.351, 0.325, 0.000)
		colorUpland    (0.399, 0.369, 0.341, 0.000)
		colorRock      (0.418, 0.387, 0.357, 0.000)
		colorSnow      (0.437, 0.404, 0.373, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.060988
		Period          0.318364
		Eccentricity    0.266303
		Inclination     76.7406
		AscendingNode   39.2322
		ArgOfPericenter 11.8669
		MeanAnomaly     -161.034
	}
}

DwarfMoon	"Ahch-To System 3.D6"
{
	ParentBody     "Ahch-To System 3"
	Class	       "Asteroid"

	Mass            4.93774e-008
	Radius          52.6576
	InertiaMoment   0.398762

	RotationPeriod  5624.61
	Obliquity       25.677
	EqAscendNode    -118.901

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.660 0.657 0.655)

	Surface
	{
		SurfStyle       0.807398
		OceanStyle      0.906471
		Randomize      (-0.757, -0.181, 0.584)
		colorDistMagn   0.852145
		colorDistFreq   1.90126
		detailScale     1437.9
		colorConversion true
		snowLevel       2
		tropicLatitude  0.429661
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.692404
		terraceProb     0.184939
		erosion         0
		montesMagn      0.577291
		montesFreq      2.74728
		montesSpiky     0.948823
		montesFraction  0.709481
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.16705
		hillsFraction   0.602621
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232945
		craterFreq      0.186909
		craterDensity   0.975342
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492241
		volcanoTemp     1223.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.223, 0.183, 0.000)
		colorShelf     (0.264, 0.230, 0.210, 0.000)
		colorBeach     (0.310, 0.269, 0.249, 0.000)
		colorDesert    (0.337, 0.289, 0.242, 0.000)
		colorLowland   (0.370, 0.309, 0.275, 0.000)
		colorUpland    (0.409, 0.374, 0.334, 0.000)
		colorRock      (0.442, 0.407, 0.360, 0.000)
		colorSnow      (0.482, 0.433, 0.380, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0613021
		Period          0.320826
		Eccentricity    0.115253
		Inclination     25.677
		AscendingNode   -118.901
		ArgOfPericenter -80.7076
		MeanAnomaly     45.7195
	}
}

DwarfMoon	"Ahch-To System 3.D7"
{
	ParentBody     "Ahch-To System 3"
	Class	       "Asteroid"

	Mass            6.71127e-008
	Radius          56.0271
	InertiaMoment   0.399713

	RotationPeriod  11426.3
	Obliquity       8.01741
	EqAscendNode    -3.22665

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.604 0.512 0.454)

	Surface
	{
		SurfStyle       0.102747
		OceanStyle      0.495717
		Randomize      (-0.208, -0.963, -0.590)
		colorDistMagn   0.21083
		colorDistFreq   1.96704
		detailScale     1529.91
		colorConversion true
		snowLevel       2
		tropicLatitude  0.276114
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.421913
		terraceProb     0.128648
		erosion         0
		montesMagn      0.468523
		montesFreq      3.40142
		montesSpiky     0.966504
		montesFraction  0.328647
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.05705
		hillsFraction   0.567992
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258942
		craterFreq      0.161828
		craterDensity   0.975423
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.583466
		volcanoTemp     1557.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.205, 0.182, 0.000)
		colorShelf     (0.257, 0.217, 0.193, 0.000)
		colorBeach     (0.272, 0.230, 0.205, 0.000)
		colorDesert    (0.287, 0.243, 0.216, 0.000)
		colorLowland   (0.302, 0.256, 0.227, 0.000)
		colorUpland    (0.317, 0.269, 0.239, 0.000)
		colorRock      (0.332, 0.281, 0.250, 0.000)
		colorSnow      (0.347, 0.294, 0.261, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0619438
		Period          0.325877
		Eccentricity    0.327003
		Inclination     8.01741
		AscendingNode   -3.22665
		ArgOfPericenter -153.751
		MeanAnomaly     79.3883
	}
}

DwarfMoon	"Ahch-To System 3.D8"
{
	ParentBody     "Ahch-To System 3"
	Class	       "Asteroid"

	Mass            9.14149e-008
	Radius          58.9836
	InertiaMoment   0.397629

	Obliquity       66.8088
	EqAscendNode    -166.848
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.489 0.413 0.379)

	Surface
	{
		SurfStyle       0.321595
		OceanStyle      0.456795
		Randomize      (-0.939, 0.100, 0.814)
		colorDistMagn   0.51704
		colorDistFreq   1.81632
		detailScale     1610.64
		colorConversion true
		snowLevel       2
		tropicLatitude  0.209369
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.5755
		terraceProb     0.332357
		erosion         0
		montesMagn      0.309047
		montesFreq      2.69847
		montesSpiky     0.999065
		montesFraction  0.794517
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.67452
		hillsFraction   0.675586
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274004
		craterFreq      0.229157
		craterDensity   0.949701
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52732
		volcanoTemp     1526.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.165, 0.151, 0.000)
		colorShelf     (0.208, 0.175, 0.161, 0.000)
		colorBeach     (0.220, 0.186, 0.170, 0.000)
		colorDesert    (0.232, 0.196, 0.180, 0.000)
		colorLowland   (0.244, 0.206, 0.189, 0.000)
		colorUpland    (0.257, 0.217, 0.199, 0.000)
		colorRock      (0.269, 0.227, 0.208, 0.000)
		colorSnow      (0.281, 0.237, 0.218, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0623979
		Period          0.329468
		Eccentricity    0.144914
		Inclination     66.8088
		AscendingNode   -166.848
		ArgOfPericenter 108.948
		MeanAnomaly     -141.319
	}
}

DwarfMoon	"Ahch-To System 3.D9"
{
	ParentBody     "Ahch-To System 3"
	Class	       "Asteroid"

	Mass            1.24903e-007
	Radius          76.4763
	InertiaMoment   0.39891

	Obliquity       -56.104
	EqAscendNode    -5.57543
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.716 0.659 0.611)

	Surface
	{
		SurfStyle       0.786563
		OceanStyle      0.979444
		Randomize      (-0.452, -0.497, 0.324)
		colorDistMagn   0.438291
		colorDistFreq   3.66509
		detailScale     2088.31
		colorConversion true
		snowLevel       2
		tropicLatitude  0.927142
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.576036
		terraceProb     0.62852
		erosion         0
		montesMagn      0.53761
		montesFreq      3.74634
		montesSpiky     0.958844
		montesFraction  0.835244
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.2074
		hillsFraction   0.771504
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264424
		craterFreq      0.235063
		craterDensity   0.903076
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54465
		volcanoTemp     1663.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.224, 0.171, 0.000)
		colorShelf     (0.286, 0.231, 0.195, 0.000)
		colorBeach     (0.336, 0.270, 0.232, 0.000)
		colorDesert    (0.365, 0.290, 0.226, 0.000)
		colorLowland   (0.401, 0.310, 0.257, 0.000)
		colorUpland    (0.444, 0.376, 0.312, 0.000)
		colorRock      (0.479, 0.409, 0.336, 0.000)
		colorSnow      (0.522, 0.435, 0.354, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0630288
		Period          0.334477
		Eccentricity    0.0151204
		Inclination     -56.104
		AscendingNode   -5.57543
		ArgOfPericenter 11.8234
		MeanAnomaly     78.9963
	}
}

DwarfMoon	"Ahch-To System 3.D10"
{
	ParentBody     "Ahch-To System 3"
	Class	       "Asteroid"

	Mass            1.71359e-007
	Radius          80.2139
	InertiaMoment   0.399839

	Obliquity       74.7616
	EqAscendNode    -149.303
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.511 0.416 0.373)

	Surface
	{
		SurfStyle       0.429642
		OceanStyle      0.981096
		Randomize      (-0.976, 0.510, 0.471)
		colorDistMagn   0.37124
		colorDistFreq   2.83433
		detailScale     2190.37
		colorConversion true
		snowLevel       2
		tropicLatitude  0.493824
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.496564
		terraceProb     0.114063
		erosion         0
		montesMagn      0.479454
		montesFreq      3.84199
		montesSpiky     0.99112
		montesFraction  0.197559
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.2372
		hillsFraction   0.600906
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253388
		craterFreq      0.167003
		craterDensity   0.953993
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.497124
		volcanoTemp     1549.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.166, 0.149, 0.000)
		colorShelf     (0.217, 0.177, 0.159, 0.000)
		colorBeach     (0.230, 0.187, 0.168, 0.000)
		colorDesert    (0.243, 0.198, 0.177, 0.000)
		colorLowland   (0.255, 0.208, 0.187, 0.000)
		colorUpland    (0.268, 0.219, 0.196, 0.000)
		colorRock      (0.281, 0.229, 0.205, 0.000)
		colorSnow      (0.294, 0.239, 0.215, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0636547
		Period          0.339472
		Eccentricity    0.12947
		Inclination     74.7616
		AscendingNode   -149.303
		ArgOfPericenter -108.232
		MeanAnomaly     59.1789
	}
}

DwarfMoon	"Ahch-To System 3.D11"
{
	ParentBody     "Ahch-To System 3"
	Class	       "Asteroid"

	Mass            2.36316e-007
	Radius          85.7269
	InertiaMoment   0.397865

	Obliquity       -42.1563
	EqAscendNode    -178.84
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.598 0.499 0.335)

	Surface
	{
		SurfStyle       0.361827
		OceanStyle      0.738385
		Randomize      (-0.842, -0.514, -0.971)
		colorDistMagn   0.73932
		colorDistFreq   6.32648
		detailScale     2340.92
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0135885
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.454246
		terraceProb     0.257097
		erosion         0
		montesMagn      0.460908
		montesFreq      1.87919
		montesSpiky     0.912166
		montesFraction  0.352137
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.9493
		hillsFraction   0.583239
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244433
		craterFreq      0.266681
		craterDensity   0.916317
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510432
		volcanoTemp     1224.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.199, 0.134, 0.000)
		colorShelf     (0.254, 0.212, 0.142, 0.000)
		colorBeach     (0.269, 0.224, 0.151, 0.000)
		colorDesert    (0.284, 0.237, 0.159, 0.000)
		colorLowland   (0.299, 0.249, 0.167, 0.000)
		colorUpland    (0.314, 0.262, 0.176, 0.000)
		colorRock      (0.329, 0.274, 0.184, 0.000)
		colorSnow      (0.344, 0.287, 0.192, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0639509
		Period          0.341843
		Eccentricity    0.328986
		Inclination     -42.1563
		AscendingNode   -178.84
		ArgOfPericenter 176.634
		MeanAnomaly     4.07646
	}
}

Planet	"Ahch-To System 4"
{
	ParentBody     "Ahch-To System"
	Class	       "IceGiant"

	Mass            13.4299
	Radius          19394.8
	InertiaMoment   0.259738

	Oblateness      0.0245153

	RotationPeriod  11.2773
	Obliquity       -91.3616
	EqAscendNode    -76.4748

	AlbedoBond      0.495306
	AlbedoGeom      0.594368
	Brightness      2

	Surface
	{
		SurfStyle       0.737707
		Randomize      (-0.578, -0.054, 0.520)
		detailScale     49884.6
		colorConversion true
		tropicLatitude  0.996486
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.01477
		stripeFluct     0.489663
		stripeTwist     12.5475
		cycloneMagn     11.0748
		cycloneFreq     0.608241
		cycloneDensity  0.212311
		cycloneOctaves  1
		colorLayer0    (0.840, 0.730, 0.570, 1.000)
		colorLayer1    (0.850, 0.750, 0.600, 1.000)
		colorLayer2    (0.340, 0.290, 0.200, 1.000)
		colorLayer3    (0.460, 0.380, 0.270, 1.000)
		colorLayer4    (0.560, 0.470, 0.320, 1.000)
		colorLayer5    (0.580, 0.500, 0.360, 1.000)
		colorLayer6    (0.730, 0.630, 0.480, 1.000)
		colorLayer7    (0.690, 0.660, 0.620, 1.000)
		colorLowPlants (0.560, 0.470, 0.320, 1.000)
		colorUpPlants  (0.580, 0.500, 0.360, 1.000)
		BumpHeight      16.5953
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          52.0664
		Velocity        2508.31
		BumpHeight      35.4706
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.610986
		mainOctaves     12
		Coverage        0.476531
		stripeZones     2.01477
		stripeFluct     0.489663
		stripeTwist     12.5475
	}

	Clouds
	{
		Height          87.5371
		Velocity        -781.9
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.208)
		mainFreq        0.610986
		mainOctaves     12
		Coverage        0.476531
		stripeZones     2.01477
		stripeFluct     0.489663
		stripeTwist     12.5475
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          193.948
		Density         1219.9
		Pressure        131843
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.550752
		Saturation      0.854581

		Composition
		{
			H2    	92.7866
			He    	6.90377
			CH4   	0.265964
			N2    	0.0339097
			O2    	0.00792403
			Ne    	0.00105997
			Ar    	0.000815075
		}
	}

	Aurora
	{
		Height      336.014
		NorthLat    82.359
		NorthLon    -105.641
		NorthRadius 5220.32
		NorthWidth  1441.73
		NorthRings  5
		NorthBright 1
		NorthParticles 10000
		SouthLat    -90
		SouthLon    83.8809
		SouthRadius 4247.48
		SouthWidth  1114.28
		SouthRings  4
		SouthBright 1
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
		SemiMajorAxis   6.77229
		Period          14.1619
		Eccentricity    0.0785817
		Inclination     -15.3792
		AscendingNode   -76.7319
		ArgOfPericenter 222.042
		MeanAnomaly     239.228
	}
}

DwarfMoon	"Ahch-To System 4.D1"
{
	ParentBody     "Ahch-To System 4"
	Class	       "Asteroid"

	Mass            1.8689e-011
	Radius          3.61635
	InertiaMoment   0.396423

	Oblateness      0.249

	Obliquity       0.0144741
	EqAscendNode    93.6315
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.649 0.520 0.467)

	Surface
	{
		SurfStyle       0.849495
		OceanStyle      0.365688
		Randomize      (-0.099, -0.324, 0.479)
		colorDistMagn   0.0578801
		colorDistFreq   0.00225021
		detailScale     98.7505
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.338866
		terraceProb     0.328595
		erosion         0
		montesMagn      0.583489
		montesFreq      2.64408
		montesSpiky     0.89991
		montesFraction  0.474823
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0281038
		hillsFraction   0.619897
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236669
		craterFreq      0.200371
		craterDensity   0.952757
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.542185
		volcanoTemp     1679.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.177, 0.131, 0.000)
		colorShelf     (0.260, 0.182, 0.150, 0.000)
		colorBeach     (0.305, 0.213, 0.178, 0.000)
		colorDesert    (0.331, 0.229, 0.173, 0.000)
		colorLowland   (0.364, 0.244, 0.196, 0.000)
		colorUpland    (0.402, 0.296, 0.238, 0.000)
		colorRock      (0.435, 0.322, 0.257, 0.000)
		colorSnow      (0.474, 0.343, 0.271, 1.000)
		BumpHeight      3.25472
		BumpOffset      0.650943
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00027813
		Period          0.000732007
		Eccentricity    8.45563e-005
		Inclination     0.0144741
		AscendingNode   93.6315
		ArgOfPericenter -79.1444
		MeanAnomaly     77.3058
	}
}

DwarfMoon	"Ahch-To System 4.D2"
{
	ParentBody     "Ahch-To System 4"
	Class	       "Asteroid"

	Mass            3.59343e-011
	Radius          4.17798
	InertiaMoment   0.3984

	Oblateness      0.249

	Obliquity       -0.00333671
	EqAscendNode    115.769
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.683 0.569 0.463)

	Surface
	{
		SurfStyle       0.758607
		OceanStyle      0.691287
		Randomize      (0.935, -0.893, -0.525)
		colorDistMagn   0.946727
		colorDistFreq   0.00848362
		detailScale     114.087
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.398832
		terraceProb     0.150081
		erosion         0
		montesMagn      0.506308
		montesFreq      3.62029
		montesSpiky     0.944037
		montesFraction  0.446211
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0457533
		hillsFraction   0.753128
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213455
		craterFreq      0.199582
		craterDensity   0.850941
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.439096
		volcanoTemp     1307.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.193, 0.130, 0.000)
		colorShelf     (0.273, 0.199, 0.148, 0.000)
		colorBeach     (0.321, 0.233, 0.176, 0.000)
		colorDesert    (0.349, 0.250, 0.171, 0.000)
		colorLowland   (0.383, 0.267, 0.194, 0.000)
		colorUpland    (0.424, 0.324, 0.236, 0.000)
		colorRock      (0.458, 0.353, 0.255, 0.000)
		colorSnow      (0.499, 0.376, 0.269, 1.000)
		BumpHeight      3.76019
		BumpOffset      0.752037
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000308452
		Period          0.000854916
		Eccentricity    3.5875e-005
		Inclination     -0.00333671
		AscendingNode   115.769
		ArgOfPericenter -114.059
		MeanAnomaly     0.0251849
	}
}

DwarfMoon	"Ahch-To System 4.D3"
{
	ParentBody     "Ahch-To System 4"
	Class	       "Asteroid"

	Mass            6.39461e-011
	Radius          5.99557
	InertiaMoment   0.399425

	Oblateness      0.249

	Obliquity       -0.00427566
	EqAscendNode    60.3419
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.745 0.677 0.563)

	Surface
	{
		SurfStyle       0.323584
		OceanStyle      0.893083
		Randomize      (-0.155, 0.684, -0.788)
		colorDistMagn   0.527305
		colorDistFreq   0.0255054
		detailScale     163.719
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.481412
		terraceProb     0.273153
		erosion         0
		montesMagn      0.503677
		montesFreq      3.32427
		montesSpiky     0.986458
		montesFraction  0.755275
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0882304
		hillsFraction   0.54702
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238384
		craterFreq      0.278587
		craterDensity   0.873502
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518586
		volcanoTemp     1538.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.271, 0.225, 0.000)
		colorShelf     (0.317, 0.288, 0.239, 0.000)
		colorBeach     (0.335, 0.305, 0.253, 0.000)
		colorDesert    (0.354, 0.322, 0.268, 0.000)
		colorLowland   (0.373, 0.339, 0.282, 0.000)
		colorUpland    (0.391, 0.356, 0.296, 0.000)
		colorRock      (0.410, 0.373, 0.310, 0.000)
		colorSnow      (0.429, 0.390, 0.324, 1.000)
		BumpHeight      5.39601
		BumpOffset      1.0792
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00033554
		Period          0.000969972
		Eccentricity    2.44707e-005
		Inclination     -0.00427566
		AscendingNode   60.3419
		ArgOfPericenter 64.3466
		MeanAnomaly     -68.1771
	}
}

DwarfMoon	"Ahch-To System 4.D4"
{
	ParentBody     "Ahch-To System 4"
	Class	       "Asteroid"

	Mass            1.07565e-010
	Radius          6.78787
	InertiaMoment   0.39692

	Oblateness      0.249

	Obliquity       0.00864472
	EqAscendNode    -59.4603
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.596 0.591 0.587)

	Surface
	{
		SurfStyle       0.12202
		OceanStyle      0.8283
		Randomize      (-0.381, -0.722, 0.636)
		colorDistMagn   0.842669
		colorDistFreq   0.0324566
		detailScale     185.354
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.438034
		terraceProb     0.283294
		erosion         0
		montesMagn      0.502333
		montesFreq      3.24032
		montesSpiky     0.807641
		montesFraction  0.372014
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.111829
		hillsFraction   0.625373
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249907
		craterFreq      0.217014
		craterDensity   0.84322
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56726
		volcanoTemp     1222.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.236, 0.235, 0.000)
		colorShelf     (0.253, 0.251, 0.250, 0.000)
		colorBeach     (0.268, 0.266, 0.264, 0.000)
		colorDesert    (0.283, 0.281, 0.279, 0.000)
		colorLowland   (0.298, 0.296, 0.294, 0.000)
		colorUpland    (0.313, 0.310, 0.308, 0.000)
		colorRock      (0.328, 0.325, 0.323, 0.000)
		colorSnow      (0.342, 0.340, 0.338, 1.000)
		BumpHeight      6.10908
		BumpOffset      1.22182
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000351817
		Period          0.0010414
		Eccentricity    6.26485e-005
		Inclination     0.00864472
		AscendingNode   -59.4603
		ArgOfPericenter 56.2401
		MeanAnomaly     -42.9885
	}
}

DwarfMoon	"Ahch-To System 4.D5"
{
	ParentBody     "Ahch-To System 4"
	Class	       "Asteroid"

	Mass            1.73376e-010
	Radius          7.645
	InertiaMoment   0.398566

	Oblateness      0.249

	Obliquity       -0.0113233
	EqAscendNode    -126.868
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.514 0.510 0.506)

	Surface
	{
		SurfStyle       0.278884
		OceanStyle      0.607032
		Randomize      (-0.744, 0.747, 0.516)
		colorDistMagn   0.931863
		colorDistFreq   0.0179819
		detailScale     208.759
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.488009
		terraceProb     0.209082
		erosion         0
		montesMagn      0.379382
		montesFreq      2.5522
		montesSpiky     0.875836
		montesFraction  0.397681
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.191615
		hillsFraction   0.452535
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24057
		craterFreq      0.225269
		craterDensity   0.877922
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.409578
		volcanoTemp     1596.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.204, 0.203, 0.000)
		colorShelf     (0.218, 0.217, 0.215, 0.000)
		colorBeach     (0.231, 0.230, 0.228, 0.000)
		colorDesert    (0.244, 0.242, 0.240, 0.000)
		colorLowland   (0.257, 0.255, 0.253, 0.000)
		colorUpland    (0.270, 0.268, 0.266, 0.000)
		colorRock      (0.283, 0.281, 0.278, 0.000)
		colorSnow      (0.295, 0.293, 0.291, 1.000)
		BumpHeight      6.8805
		BumpOffset      1.3761
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00037173
		Period          0.00113106
		Eccentricity    3.67467e-005
		Inclination     -0.0113233
		AscendingNode   -126.868
		ArgOfPericenter 138.695
		MeanAnomaly     -173.201
	}
}

DwarfMoon	"Ahch-To System 4.D6"
{
	ParentBody     "Ahch-To System 4"
	Class	       "Asteroid"

	Mass            2.70281e-010
	Radius          8.36173
	InertiaMoment   0.399554

	Oblateness      0.171024

	Obliquity       -0.00370724
	EqAscendNode    -44.3438
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.658 0.491 0.371)

	Surface
	{
		SurfStyle       0.483737
		OceanStyle      0.853609
		Randomize      (-0.622, -0.144, 0.321)
		colorDistMagn   0.591498
		colorDistFreq   0.0528122
		detailScale     228.331
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.470736
		terraceProb     0.549335
		erosion         0
		montesMagn      0.571223
		montesFreq      2.15221
		montesSpiky     0.827113
		montesFraction  0.585361
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.189132
		hillsFraction   0.644227
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238074
		craterFreq      0.239424
		craterDensity   0.805075
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534525
		volcanoTemp     1431.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.197, 0.148, 0.000)
		colorShelf     (0.279, 0.209, 0.158, 0.000)
		colorBeach     (0.296, 0.221, 0.167, 0.000)
		colorDesert    (0.312, 0.233, 0.176, 0.000)
		colorLowland   (0.329, 0.246, 0.185, 0.000)
		colorUpland    (0.345, 0.258, 0.195, 0.000)
		colorRock      (0.362, 0.270, 0.204, 0.000)
		colorSnow      (0.378, 0.283, 0.213, 1.000)
		BumpHeight      7.52556
		BumpOffset      1.50511
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000397959
		Period          0.00125285
		Eccentricity    5.48905e-005
		Inclination     -0.00370724
		AscendingNode   -44.3438
		ArgOfPericenter 97.5234
		MeanAnomaly     -132.375
	}
}

DwarfMoon	"Ahch-To System 4.D7"
{
	ParentBody     "Ahch-To System 4"
	Class	       "Asteroid"

	Mass            4.1026e-010
	Radius          11.2489
	InertiaMoment   0.397277

	Oblateness      0.249

	Obliquity       0.0107723
	EqAscendNode    134.558
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.618 0.614 0.606)

	Surface
	{
		SurfStyle       0.158563
		OceanStyle      0.837864
		Randomize      (0.879, -0.679, -0.717)
		colorDistMagn   0.781443
		colorDistFreq   0.107876
		detailScale     307.169
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.276533
		terraceProb     0.124345
		erosion         0
		montesMagn      0.355632
		montesFreq      2.49092
		montesSpiky     0.799079
		montesFraction  0.8665
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.254674
		hillsFraction   0.496335
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24726
		craterFreq      0.248272
		craterDensity   0.952965
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.565862
		volcanoTemp     1158.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.245, 0.242, 0.000)
		colorShelf     (0.262, 0.261, 0.258, 0.000)
		colorBeach     (0.278, 0.276, 0.273, 0.000)
		colorDesert    (0.293, 0.292, 0.288, 0.000)
		colorLowland   (0.309, 0.307, 0.303, 0.000)
		colorUpland    (0.324, 0.322, 0.318, 0.000)
		colorRock      (0.340, 0.338, 0.333, 0.000)
		colorSnow      (0.355, 0.353, 0.349, 1.000)
		BumpHeight      10.124
		BumpOffset      2.0248
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000404562
		Period          0.00128416
		Eccentricity    6.72242e-006
		Inclination     0.0107723
		AscendingNode   134.558
		ArgOfPericenter 169.499
		MeanAnomaly     -109.684
	}
}

Moon	"Ahch-To System 4.1"
{
	ParentBody     "Ahch-To System 4"
	Class	       "IceWorld"

	Mass            0.000119496
	Radius          378.049
	InertiaMoment   0.399402

	Oblateness      0.00821312

	Obliquity       0.987806
	EqAscendNode    -50.0358
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.758 0.565 0.500)

	Surface
	{
		SurfStyle       0.723173
		OceanStyle      0.929941
		Randomize      (0.183, 0.671, -0.686)
		colorDistMagn   0.0778152
		colorDistFreq   43.0591
		detailScale     972.364
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.194124
		snowLevel       2
		tropicLatitude  0.0312405
		icecapLatitude  0.772276
		icecapHeight    0.201704
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.78553
		venusFreq       1.53387
		venusMagn       0.251332
		mareFreq        0
		mareDensity     0.000141996
		terraceProb     0.200986
		erosion         0
		montesMagn      0.0725159
		montesFreq      22.6282
		montesSpiky     0.949512
		montesFraction  0.405378
		dunesMagn       0.0358138
		dunesFreq       502.209
		dunesFraction   0.381512
		hillsMagn       0.101357
		hillsFreq       35.9408
		hillsFraction   0.38469
		hills2Fraction  0.0252497
		riversMagn      58.9939
		riversFreq      2.6407
		riversSin       8.16289
		riversOctaves   0
		canyonsMagn     0.580238
		canyonsFreq     0.14259
		canyonFraction  0
		cracksMagn      0.0574742
		cracksFreq      0.124171
		cracksOctaves   0
		craterMagn      0.706631
		craterFreq      1.24305
		craterDensity   0.925403
		craterOctaves   9
		craterRayedFactor 0.129472
		volcanoMagn     0.151363
		volcanoFreq     0.741017
		volcanoDensity  0.199048
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.13506
		volcanoRadius   0.129492
		volcanoTemp     1396.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.485, 0.362, 0.335, 0.250)
		colorShelf     (0.531, 0.413, 0.380, 0.250)
		colorBeach     (0.432, 0.305, 0.290, 0.200)
		colorDesert    (0.402, 0.277, 0.255, 0.200)
		colorLowland   (0.296, 0.215, 0.210, 0.200)
		colorUpland    (0.561, 0.418, 0.380, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.296, 0.215, 0.210, 0.200)
		colorUpPlants  (0.561, 0.418, 0.380, 0.250)
		BumpHeight      18.9025
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00064965
		Period          0.00261313
		Eccentricity    0.0211925
		Inclination     0.987806
		AscendingNode   -50.0357
		ArgOfPericenter 121.708
		MeanAnomaly     -30.2958
	}
}

Moon	"Ahch-To System 4.2"
{
	ParentBody     "Ahch-To System 4"
	Class	       "IceWorld"

	Mass            0.000146194
	Radius          464.538
	InertiaMoment   0.3989

	Oblateness      0.00334276

	Obliquity       -0.902417
	EqAscendNode    153.319
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.719 0.568 0.515)

	Surface
	{
		SurfStyle       0.250781
		OceanStyle      0.207854
		Randomize      (-0.207, -0.681, -0.304)
		colorDistMagn   0.0626715
		colorDistFreq   58.3572
		detailScale     1194.82
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.178965
		snowLevel       2
		tropicLatitude  0.00726698
		icecapLatitude  0.914223
		icecapHeight    0.185722
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.65056
		venusFreq       0.4207
		venusMagn       0
		mareFreq        0
		mareDensity     9.73726e-005
		terraceProb     0.209937
		erosion         0
		montesMagn      0.0747311
		montesFreq      19.4461
		montesSpiky     0.84468
		montesFraction  0.607107
		dunesMagn       0.0319444
		dunesFreq       603.339
		dunesFraction   0.482679
		hillsMagn       0.115835
		hillsFreq       58.6685
		hillsFraction   0.529367
		hills2Fraction  0.039689
		riversMagn      57.785
		riversFreq      3.51676
		riversSin       5.11445
		riversOctaves   0
		canyonsMagn     0.482851
		canyonsFreq     0.162514
		canyonFraction  0
		cracksMagn      0.0686612
		cracksFreq      0.159253
		cracksOctaves   0
		craterMagn      0.594509
		craterFreq      1.61706
		craterDensity   0.931883
		craterOctaves   9
		craterRayedFactor 0.196233
		volcanoMagn     0.200045
		volcanoFreq     0.853951
		volcanoDensity  0.149729
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.220288
		volcanoRadius   0.171462
		volcanoTemp     1553.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.719, 0.568, 0.515, 0.500)
		colorShelf     (0.683, 0.539, 0.489, 0.500)
		colorBeach     (0.503, 0.397, 0.361, 0.750)
		colorDesert    (0.611, 0.482, 0.438, 1.000)
		colorLowland   (0.633, 0.499, 0.453, 1.000)
		colorUpland    (0.668, 0.528, 0.479, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.633, 0.499, 0.453, 1.000)
		colorUpPlants  (0.668, 0.528, 0.479, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00100652
		Period          0.00503936
		Eccentricity    0.00835511
		Inclination     -0.902417
		AscendingNode   153.319
		ArgOfPericenter 140.409
		MeanAnomaly     78.6307
	}
}

Moon	"Ahch-To System 4.3"
{
	ParentBody     "Ahch-To System 4"
	Class	       "IceWorld"

	Mass            0.000176613
	Radius          465.62
	InertiaMoment   0.398317

	Obliquity       1.31795
	EqAscendNode    170.608
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.718 0.714 0.707)

	Surface
	{
		SurfStyle       0.937195
		OceanStyle      0.185377
		Randomize      (-0.679, -0.028, 0.814)
		colorDistMagn   0.0458548
		colorDistFreq   61.7569
		detailScale     1197.6
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.140889
		snowLevel       2
		tropicLatitude  0.00376641
		icecapLatitude  0.405378
		icecapHeight    0.167082
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.58787
		venusFreq       0.983947
		venusMagn       0
		mareFreq        0
		mareDensity     0.000137474
		terraceProb     0.180217
		erosion         0
		montesMagn      0.0619719
		montesFreq      15.29
		montesSpiky     0.802845
		montesFraction  0.655146
		dunesMagn       0.0462145
		dunesFreq       626.639
		dunesFraction   0.158031
		hillsMagn       0.131267
		hillsFreq       62.4278
		hillsFraction   0.388809
		hills2Fraction  0.0868968
		riversMagn      62.7411
		riversFreq      4.27972
		riversSin       7.96946
		riversOctaves   0
		canyonsMagn     0.649282
		canyonsFreq     0.189544
		canyonFraction  0
		cracksMagn      0.0768555
		cracksFreq      0.187009
		cracksOctaves   0
		craterMagn      0.606539
		craterFreq      1.47661
		craterDensity   0.754337
		craterOctaves   9
		craterRayedFactor 0.16008
		volcanoMagn     0.187783
		volcanoFreq     0.668217
		volcanoDensity  0.201999
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.390462
		volcanoRadius   0.131766
		volcanoTemp     1457.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.546, 0.507, 0.410, 1.000)
		colorShelf     (0.546, 0.507, 0.410, 1.000)
		colorBeach     (0.502, 0.443, 0.353, 1.000)
		colorDesert    (0.502, 0.443, 0.353, 1.000)
		colorLowland   (0.610, 0.578, 0.537, 1.000)
		colorUpland    (0.639, 0.635, 0.608, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.610, 0.578, 0.537, 1.000)
		colorUpPlants  (0.639, 0.635, 0.608, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00155943
		Period          0.00971831
		Eccentricity    0.00905855
		Inclination     1.31795
		AscendingNode   170.608
		ArgOfPericenter 16.62
		MeanAnomaly     110.943
	}
}

Moon	"Ahch-To System 4.4"
{
	ParentBody     "Ahch-To System 4"
	Class	       "IceWorld"

	Mass            0.000211238
	Radius          456.819
	InertiaMoment   0.397534

	Obliquity       0.895993
	EqAscendNode    -173.596
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.567 0.557 0.553)

	Surface
	{
		SurfStyle       0.844686
		OceanStyle      0.695474
		Randomize      (-0.820, 0.866, 0.890)
		colorDistMagn   0.046695
		colorDistFreq   53.7546
		detailScale     1174.96
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.266927
		snowLevel       2
		tropicLatitude  0.00176052
		icecapLatitude  0.459732
		icecapHeight    0.302013
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.96605
		venusFreq       1.39676
		venusMagn       0
		mareFreq        0
		mareDensity     0.0003191
		terraceProb     0.216763
		erosion         0
		montesMagn      0.0653283
		montesFreq      19.3378
		montesSpiky     0.960814
		montesFraction  0.241955
		dunesMagn       0.0321866
		dunesFreq       600.2
		dunesFraction   0.901723
		hillsMagn       0.144864
		hillsFreq       50.2879
		hillsFraction   0.785483
		hills2Fraction  0.128389
		riversMagn      56.8711
		riversFreq      2.40623
		riversSin       6.34047
		riversOctaves   0
		canyonsMagn     0.465111
		canyonsFreq     0.183799
		canyonFraction  0
		cracksMagn      0.0489969
		cracksFreq      0.210399
		cracksOctaves   0
		craterMagn      0.573342
		craterFreq      1.1212
		craterDensity   0.891964
		craterOctaves   9
		craterRayedFactor 0.0920824
		volcanoMagn     0.228066
		volcanoFreq     0.796451
		volcanoDensity  0.23334
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.0789536
		volcanoRadius   0.141413
		volcanoTemp     1823.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.567, 0.417, 0.317, 0.000)
		colorShelf     (0.539, 0.396, 0.301, 0.000)
		colorBeach     (0.284, 0.209, 0.159, 0.000)
		colorDesert    (0.482, 0.355, 0.270, 0.000)
		colorLowland   (0.460, 0.367, 0.301, 0.000)
		colorUpland    (0.528, 0.388, 0.295, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.460, 0.367, 0.301, 0.000)
		colorUpPlants  (0.528, 0.388, 0.295, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00241608
		Period          0.0187416
		Eccentricity    0.00409948
		Inclination     0.895993
		AscendingNode   -173.596
		ArgOfPericenter -64.5111
		MeanAnomaly     27.4432
	}
}

Moon	"Ahch-To System 4.5"
{
	ParentBody     "Ahch-To System 4"
	Class	       "IceWorld"

	Mass            0.00250638
	Radius          1121.34
	InertiaMoment   0.395784

	Obliquity       0.0232536
	EqAscendNode    -143.523
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.616 0.460 0.386)

	Surface
	{
		SurfStyle       0.786502
		OceanStyle      0.833801
		Randomize      (-0.348, -0.466, 0.033)
		colorDistMagn   0.0433402
		colorDistFreq   154.567
		detailScale     2884.15
		colorConversion true
		drivenDarkening 0.48488
		seaLevel        0.164911
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  0.978684
		icecapHeight    0.167015
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.71183
		venusFreq       1.39386
		venusMagn       0
		mareFreq        0.301546
		mareDensity     0.000792401
		terraceProb     0.181296
		erosion         0
		montesMagn      0.0470115
		montesFreq      35.7576
		montesSpiky     0.9237
		montesFraction  0.455501
		dunesMagn       0.0212744
		dunesFreq       1456.77
		dunesFraction   0.849513
		hillsMagn       0.100057
		hillsFreq       124.226
		hillsFraction   0.382672
		hills2Fraction  0.25488
		riversMagn      66.9997
		riversFreq      3.01685
		riversSin       6.41969
		riversOctaves   0
		canyonsMagn     0.330929
		canyonsFreq     0.454919
		canyonFraction  0
		cracksMagn      0.0265244
		cracksFreq      0.633824
		cracksOctaves   0
		craterMagn      0.610155
		craterFreq      3.77799
		craterDensity   0.87045
		craterOctaves   10
		craterRayedFactor 0.0555298
		volcanoMagn     0.191589
		volcanoFreq     0.767428
		volcanoDensity  0.216472
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.208457
		volcanoRadius   0.140904
		volcanoTemp     1653.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.394, 0.294, 0.259, 0.250)
		colorShelf     (0.431, 0.336, 0.293, 0.250)
		colorBeach     (0.351, 0.248, 0.224, 0.200)
		colorDesert    (0.326, 0.225, 0.197, 0.200)
		colorLowland   (0.240, 0.175, 0.162, 0.200)
		colorUpland    (0.456, 0.340, 0.293, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.240, 0.175, 0.162, 0.200)
		colorUpPlants  (0.456, 0.340, 0.293, 0.250)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0037433
		Period          0.0361397
		Eccentricity    0.0491718
		Inclination     0.0232536
		AscendingNode   -143.523
		ArgOfPericenter 77.632
		MeanAnomaly     -125.565
	}
}

Moon	"Ahch-To System 4.6"
{
	ParentBody     "Ahch-To System 4"
	Class	       "IceWorld"

	Mass            0.000295475
	Radius          510.66
	InertiaMoment   0.399628

	Obliquity       1.38435
	EqAscendNode    -66.6761
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.502 0.495 0.490)

	Surface
	{
		SurfStyle       0.389367
		OceanStyle      0.771211
		Randomize      (0.514, -0.067, 0.859)
		colorDistMagn   0.0577208
		colorDistFreq   51.8727
		detailScale     1313.45
		colorConversion true
		drivenDarkening 0.312961
		seaLevel        0.307206
		snowLevel       2
		tropicLatitude  0.0403585
		icecapLatitude  0.612212
		icecapHeight    0.3115
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.78518
		venusFreq       0.751033
		venusMagn       0.177822
		mareFreq        0
		mareDensity     0.000288688
		terraceProb     0.211041
		erosion         0
		montesMagn      0.0551665
		montesFreq      20.3437
		montesSpiky     0.986574
		montesFraction  0.0917593
		dunesMagn       0.0312826
		dunesFreq       662.546
		dunesFraction   0.841261
		hillsMagn       0.113055
		hillsFreq       69.016
		hillsFraction   0.49698
		hills2Fraction  0.255036
		riversMagn      66.1489
		riversFreq      3.11421
		riversSin       7.07672
		riversOctaves   0
		canyonsMagn     0.54475
		canyonsFreq     0.149263
		canyonFraction  0
		cracksMagn      0.0505211
		cracksFreq      0.255966
		cracksOctaves   0
		craterMagn      0.560679
		craterFreq      1.66416
		craterDensity   0.821745
		craterOctaves   9
		craterRayedFactor 0.0693145
		volcanoMagn     0.170582
		volcanoFreq     0.877078
		volcanoDensity  0.247219
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.168458
		volcanoRadius   0.13404
		volcanoTemp     1732.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.502, 0.495, 0.490, 0.500)
		colorShelf     (0.477, 0.470, 0.465, 0.500)
		colorBeach     (0.352, 0.346, 0.343, 0.750)
		colorDesert    (0.427, 0.421, 0.416, 1.000)
		colorLowland   (0.442, 0.436, 0.431, 1.000)
		colorUpland    (0.467, 0.460, 0.456, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.442, 0.436, 0.431, 1.000)
		colorUpPlants  (0.467, 0.460, 0.456, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0057996
		Period          0.0697004
		Eccentricity    0.0245205
		Inclination     1.38435
		AscendingNode   -66.6761
		ArgOfPericenter 136.742
		MeanAnomaly     62.3036
	}
}

DwarfMoon	"Ahch-To System 4.D8"
{
	ParentBody     "Ahch-To System 4"
	Class	       "Asteroid"

	Mass            4.9184e-009
	Radius          22.5035
	InertiaMoment   0.399017

	Obliquity       11.6247
	EqAscendNode    -149.058
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.655 0.651 0.649)

	Surface
	{
		SurfStyle       0.155982
		OceanStyle      0.566252
		Randomize      (0.662, -0.431, -0.881)
		colorDistMagn   0.725246
		colorDistFreq   0.310216
		detailScale     614.497
		colorConversion true
		snowLevel       2
		tropicLatitude  0.107345
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.733798
		terraceProb     0.312237
		erosion         0
		montesMagn      0.475657
		montesFreq      3.45322
		montesSpiky     0.781195
		montesFraction  0.790162
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.3922
		hillsFraction   0.42509
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221301
		craterFreq      0.193878
		craterDensity   0.897795
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.623893
		volcanoTemp     1450.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.261, 0.260, 0.000)
		colorShelf     (0.278, 0.277, 0.276, 0.000)
		colorBeach     (0.295, 0.293, 0.292, 0.000)
		colorDesert    (0.311, 0.309, 0.308, 0.000)
		colorLowland   (0.328, 0.326, 0.325, 0.000)
		colorUpland    (0.344, 0.342, 0.341, 0.000)
		colorRock      (0.360, 0.358, 0.357, 0.000)
		colorSnow      (0.377, 0.375, 0.373, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0256116
		Period          0.64684
		Eccentricity    0.164056
		Inclination     11.6247
		AscendingNode   -149.058
		ArgOfPericenter 63.4405
		MeanAnomaly     -52.8583
	}
}

DwarfMoon	"Ahch-To System 4.D9"
{
	ParentBody     "Ahch-To System 4"
	Class	       "Asteroid"

	Mass            6.76549e-009
	Radius          29.3473
	InertiaMoment   0.399932

	Obliquity       86.632
	EqAscendNode    40.7465
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.599 0.593 0.587)

	Surface
	{
		SurfStyle       0.793236
		OceanStyle      0.647964
		Randomize      (-0.439, 0.580, 0.307)
		colorDistMagn   0.469608
		colorDistFreq   0.565827
		detailScale     801.378
		colorConversion true
		snowLevel       2
		tropicLatitude  0.65969
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.258229
		terraceProb     0.212558
		erosion         0
		montesMagn      0.405655
		montesFreq      3.3771
		montesSpiky     0.870661
		montesFraction  0.840747
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.05545
		hillsFraction   0.547044
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243506
		craterFreq      0.150318
		craterDensity   0.988316
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510314
		volcanoTemp     1319.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.202, 0.164, 0.000)
		colorShelf     (0.240, 0.208, 0.188, 0.000)
		colorBeach     (0.282, 0.243, 0.223, 0.000)
		colorDesert    (0.306, 0.261, 0.217, 0.000)
		colorLowland   (0.336, 0.279, 0.247, 0.000)
		colorUpland    (0.372, 0.338, 0.300, 0.000)
		colorRock      (0.402, 0.368, 0.323, 0.000)
		colorSnow      (0.438, 0.392, 0.341, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0259254
		Period          0.658766
		Eccentricity    0.0980222
		Inclination     86.632
		AscendingNode   40.7465
		ArgOfPericenter 154.582
		MeanAnomaly     93.3503
	}
}

DwarfMoon	"Ahch-To System 4.D10"
{
	ParentBody     "Ahch-To System 4"
	Class	       "Asteroid"

	Mass            9.26293e-009
	Radius          30.5345
	InertiaMoment   0.398023

	Obliquity       8.26
	EqAscendNode    172.51
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.552 0.546 0.543)

	Surface
	{
		SurfStyle       0.519625
		OceanStyle      0.231348
		Randomize      (0.325, 0.055, 0.955)
		colorDistMagn   0.0828296
		colorDistFreq   0.42449
		detailScale     833.795
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0187679
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.764059
		terraceProb     0.383744
		erosion         0
		montesMagn      0.499695
		montesFreq      2.032
		montesSpiky     0.864167
		montesFraction  0.330679
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.61469
		hillsFraction   0.571952
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275802
		craterFreq      0.186145
		craterDensity   0.984719
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478191
		volcanoTemp     1419.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.215, 0.186, 0.152, 0.000)
		colorShelf     (0.221, 0.191, 0.174, 0.000)
		colorBeach     (0.259, 0.224, 0.206, 0.000)
		colorDesert    (0.281, 0.240, 0.201, 0.000)
		colorLowland   (0.309, 0.257, 0.228, 0.000)
		colorUpland    (0.342, 0.311, 0.277, 0.000)
		colorRock      (0.370, 0.339, 0.299, 0.000)
		colorSnow      (0.403, 0.361, 0.315, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0261916
		Period          0.668938
		Eccentricity    0.468255
		Inclination     8.26
		AscendingNode   172.51
		ArgOfPericenter 74.2094
		MeanAnomaly     98.2295
	}
}

DwarfMoon	"Ahch-To System 4.D11"
{
	ParentBody     "Ahch-To System 4"
	Class	       "Asteroid"

	Mass            1.26365e-008
	Radius          32.4894
	InertiaMoment   0.399156

	RotationPeriod  11906.4
	Obliquity       -87.4036
	EqAscendNode    -39.0063

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.450 0.443 0.439)

	Surface
	{
		SurfStyle       0.384006
		OceanStyle      0.310305
		Randomize      (0.247, 0.930, 0.870)
		colorDistMagn   0.408197
		colorDistFreq   0.811494
		detailScale     887.177
		colorConversion true
		snowLevel       2
		tropicLatitude  0.633882
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.735745
		terraceProb     0.434789
		erosion         0
		montesMagn      0.541576
		montesFreq      1.92925
		montesSpiky     0.963678
		montesFraction  0.61119
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.9359
		hillsFraction   0.631749
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.274977
		craterFreq      0.23308
		craterDensity   0.950723
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509233
		volcanoTemp     1217.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.177, 0.176, 0.000)
		colorShelf     (0.191, 0.188, 0.187, 0.000)
		colorBeach     (0.202, 0.199, 0.198, 0.000)
		colorDesert    (0.214, 0.210, 0.209, 0.000)
		colorLowland   (0.225, 0.221, 0.220, 0.000)
		colorUpland    (0.236, 0.232, 0.231, 0.000)
		colorRock      (0.247, 0.243, 0.241, 0.000)
		colorSnow      (0.259, 0.255, 0.252, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0264572
		Period          0.67914
		Eccentricity    0.0854111
		Inclination     -87.4036
		AscendingNode   -39.0063
		ArgOfPericenter -118.679
		MeanAnomaly     165.899
	}
}

DwarfMoon	"Ahch-To System 4.D12"
{
	ParentBody     "Ahch-To System 4"
	Class	       "Asteroid"

	Mass            1.71931e-008
	Radius          34.4415
	InertiaMoment   0.395447

	Obliquity       75.6002
	EqAscendNode    31.6866
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.676 0.674 0.673)

	Surface
	{
		SurfStyle       0.352858
		OceanStyle      0.970974
		Randomize      (-0.446, -0.784, 0.358)
		colorDistMagn   0.457847
		colorDistFreq   0.716509
		detailScale     940.482
		colorConversion true
		snowLevel       2
		tropicLatitude  0.676478
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.664651
		terraceProb     0.317462
		erosion         0
		montesMagn      0.388268
		montesFreq      2.70607
		montesSpiky     0.987285
		montesFraction  0.733907
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.30375
		hillsFraction   0.323425
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246095
		craterFreq      0.159744
		craterDensity   0.752366
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483349
		volcanoTemp     1719.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.270, 0.269, 0.000)
		colorShelf     (0.287, 0.287, 0.286, 0.000)
		colorBeach     (0.304, 0.303, 0.303, 0.000)
		colorDesert    (0.321, 0.320, 0.320, 0.000)
		colorLowland   (0.338, 0.337, 0.336, 0.000)
		colorUpland    (0.355, 0.354, 0.353, 0.000)
		colorRock      (0.372, 0.371, 0.370, 0.000)
		colorSnow      (0.389, 0.388, 0.387, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0266852
		Period          0.687938
		Eccentricity    0.0196127
		Inclination     75.6002
		AscendingNode   31.6866
		ArgOfPericenter 92.99
		MeanAnomaly     -31.258
	}
}

DwarfMoon	"Ahch-To System 4.D13"
{
	ParentBody     "Ahch-To System 4"
	Class	       "Asteroid"

	Mass            2.33522e-008
	Radius          45.1307
	InertiaMoment   0.398217

	RotationPeriod  8321.8
	Obliquity       -2.41239
	EqAscendNode    -123.489

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.717 0.716 0.713)

	Surface
	{
		SurfStyle       0.847599
		OceanStyle      0.410008
		Randomize      (-0.557, 0.830, 0.278)
		colorDistMagn   0.623466
		colorDistFreq   1.13549
		detailScale     1232.37
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0398446
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.387655
		terraceProb     0.542515
		erosion         0
		montesMagn      0.488797
		montesFreq      2.48117
		montesSpiky     0.980031
		montesFraction  0.342975
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.47743
		hillsFraction   0.848139
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227521
		craterFreq      0.231896
		craterDensity   0.87533
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507014
		volcanoTemp     1359.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.280, 0.243, 0.200, 0.000)
		colorShelf     (0.287, 0.251, 0.228, 0.000)
		colorBeach     (0.337, 0.293, 0.271, 0.000)
		colorDesert    (0.366, 0.315, 0.264, 0.000)
		colorLowland   (0.401, 0.336, 0.300, 0.000)
		colorUpland    (0.444, 0.408, 0.364, 0.000)
		colorRock      (0.480, 0.444, 0.392, 0.000)
		colorSnow      (0.523, 0.472, 0.414, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0273042
		Period          0.712011
		Eccentricity    0.258253
		Inclination     -2.41239
		AscendingNode   -123.489
		ArgOfPericenter -138.034
		MeanAnomaly     -140.597
	}
}

Planet	"Ahch-To System 5"
{
	ParentBody     "Ahch-To System"
	Class	       "IceGiant"

	Mass            16.0251
	Radius          20389.4
	InertiaMoment   0.185555

	Oblateness      0.0282184

	RotationPeriod  9.17385
	Obliquity       57.8016
	EqAscendNode    -71.0458

	AlbedoBond      0.417221
	AlbedoGeom      0.500666
	Brightness      2

	Surface
	{
		SurfStyle       0.770038
		Randomize      (-0.178, -0.524, -0.669)
		detailScale     52442.6
		colorConversion true
		tropicLatitude  0.82111
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     5.26614
		stripeFluct     0.412185
		stripeTwist     11.6035
		cycloneMagn     19.7087
		cycloneFreq     0.862317
		cycloneDensity  0.329906
		cycloneOctaves  0
		colorLayer0    (0.120, 0.200, 0.480, 1.000)
		colorLayer1    (0.330, 0.400, 0.720, 1.000)
		colorLayer2    (0.330, 0.400, 0.720, 1.000)
		colorLayer3    (0.600, 0.600, 0.600, 1.000)
		colorLayer4    (0.350, 0.430, 0.770, 1.000)
		colorLayer5    (0.470, 0.540, 0.850, 1.000)
		colorLayer6    (0.600, 0.650, 0.910, 1.000)
		colorLayer7    (0.990, 0.990, 1.000, 1.000)
		colorLowPlants (0.350, 0.430, 0.770, 1.000)
		colorUpPlants  (0.470, 0.540, 0.850, 1.000)
		BumpHeight      15.9713
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          34.7637
		Velocity        -1928.23
		BumpHeight      18.7922
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.37894
		mainOctaves     12
		Coverage        0.0861065
		stripeZones     5.26614
		stripeFluct     0.412185
		stripeTwist     11.6035
	}

	Clouds
	{
		Height          53.5566
		Velocity        2632.83
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.600)
		mainFreq        1.37894
		mainOctaves     12
		Coverage        0.0861065
		stripeZones     5.26614
		stripeFluct     0.412185
		stripeTwist     11.6035
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          203.894
		Density         1946.39
		Pressure        179596
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0221904
		Saturation      0.913091

		Composition
		{
			H2    	94.0023
			He    	5.93532
			N2    	0.0325791
			CH4   	0.0200993
			O2    	0.00774267
			Ne    	0.0011392
			Ar    	0.000770279
		}
	}

	Aurora
	{
		Height      258.493
		NorthLat    59.3854
		NorthLon    111.893
		NorthRadius 4334.96
		NorthWidth  1335.6
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -61.8834
		SouthLon    297.906
		SouthRadius 5839.96
		SouthWidth  1679.99
		SouthRings  3
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     27206.5
		OuterRadius     36018.9
		RotationPeriod  3.89023
		RotationOffset  0
		FrontBright     0.868629
		BackBright      0.619588
		Density         0.724195
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.2147
		Period          30.1787
		Eccentricity    0.0382331
		Inclination     -11.9484
		AscendingNode   -73.6006
		ArgOfPericenter 74.1302
		MeanAnomaly     160.18
	}
}

DwarfMoon	"Ahch-To System 5.D1"
{
	ParentBody     "Ahch-To System 5"
	Class	       "Asteroid"

	Mass            4.7557e-007
	Radius          118.231
	InertiaMoment   0.397195

	Oblateness      0.249

	Obliquity       0.000959917
	EqAscendNode    -131.252
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.430 0.424 0.418)

	Surface
	{
		SurfStyle       0.812664
		OceanStyle      0.373764
		Randomize      (-0.873, -0.623, 0.647)
		colorDistMagn   0.413351
		colorDistFreq   0.611948
		detailScale     3228.48
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.530993
		terraceProb     0.227862
		erosion         0
		montesMagn      0.61349
		montesFreq      3.84644
		montesSpiky     0.88307
		montesFraction  0.604054
		dunesFraction   0
		hillsMagn       0
		hillsFreq       32.9767
		hillsFraction   0.839167
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215523
		craterFreq      0.387119
		craterDensity   0.987776
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502687
		volcanoTemp     1440.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.168, 0.144, 0.117, 0.000)
		colorShelf     (0.172, 0.148, 0.134, 0.000)
		colorBeach     (0.202, 0.174, 0.159, 0.000)
		colorDesert    (0.219, 0.187, 0.155, 0.000)
		colorLowland   (0.241, 0.199, 0.176, 0.000)
		colorUpland    (0.267, 0.242, 0.213, 0.000)
		colorRock      (0.288, 0.263, 0.230, 0.000)
		colorSnow      (0.314, 0.280, 0.243, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000330454
		Period          0.000867852
		Eccentricity    9.19361e-005
		Inclination     0.000959917
		AscendingNode   -131.252
		ArgOfPericenter 41.5594
		MeanAnomaly     109.24
	}
}

DwarfMoon	"Ahch-To System 5.D2"
{
	ParentBody     "Ahch-To System 5"
	Class	       "Asteroid"

	Mass            6.72188e-007
	Radius          125.812
	InertiaMoment   0.398685

	Oblateness      0.249

	Obliquity       -0.0117288
	EqAscendNode    1.79831
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.613 0.608 0.602)

	Surface
	{
		SurfStyle       0.626532
		OceanStyle      0.0731367
		Randomize      (0.548, 0.205, -0.182)
		colorDistMagn   0.551263
		colorDistFreq   13.0565
		detailScale     3435.51
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.741667
		terraceProb     0.590138
		erosion         0
		montesMagn      0.485449
		montesFreq      1.9933
		montesSpiky     0.999276
		montesFraction  0.582974
		dunesFraction   0
		hillsMagn       0
		hillsFreq       34.2734
		hillsFraction   0.953949
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232054
		craterFreq      0.660685
		craterDensity   0.890288
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.481713
		volcanoTemp     1665.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.207, 0.169, 0.000)
		colorShelf     (0.245, 0.213, 0.193, 0.000)
		colorBeach     (0.288, 0.249, 0.229, 0.000)
		colorDesert    (0.312, 0.268, 0.223, 0.000)
		colorLowland   (0.343, 0.286, 0.253, 0.000)
		colorUpland    (0.380, 0.347, 0.307, 0.000)
		colorRock      (0.410, 0.377, 0.331, 0.000)
		colorSnow      (0.447, 0.401, 0.349, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000367598
		Period          0.00101821
		Eccentricity    7.51148e-005
		Inclination     -0.0117288
		AscendingNode   1.79831
		ArgOfPericenter 26.8718
		MeanAnomaly     21.6816
	}
}

DwarfMoon	"Ahch-To System 5.D3"
{
	ParentBody     "Ahch-To System 5"
	Class	       "Asteroid"

	Mass            9.61009e-007
	Radius          136.135
	InertiaMoment   0.399649

	Oblateness      0.239058

	Obliquity       -0.00396696
	EqAscendNode    -20.3135
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.684 0.509 0.442)

	Surface
	{
		SurfStyle       0.600101
		OceanStyle      0.535242
		Randomize      (-0.972, -0.447, 0.189)
		colorDistMagn   0.536118
		colorDistFreq   14.0646
		detailScale     3717.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.571021
		terraceProb     0.456788
		erosion         0
		montesMagn      0.491065
		montesFreq      3.12965
		montesSpiky     0.945399
		montesFraction  0.761192
		dunesFraction   0
		hillsMagn       0
		hillsFreq       45.3073
		hillsFraction   0.595121
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253417
		craterFreq      0.570686
		craterDensity   0.971487
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502255
		volcanoTemp     1349.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.173, 0.124, 0.000)
		colorShelf     (0.274, 0.178, 0.142, 0.000)
		colorBeach     (0.322, 0.209, 0.168, 0.000)
		colorDesert    (0.349, 0.224, 0.164, 0.000)
		colorLowland   (0.383, 0.239, 0.186, 0.000)
		colorUpland    (0.424, 0.290, 0.226, 0.000)
		colorRock      (0.458, 0.316, 0.243, 0.000)
		colorSnow      (0.500, 0.336, 0.257, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000402735
		Period          0.00116764
		Eccentricity    4.89686e-005
		Inclination     -0.00396696
		AscendingNode   -20.3135
		ArgOfPericenter -29.3517
		MeanAnomaly     3.03928
	}
}

Moon	"Ahch-To System 5.1"
{
	ParentBody     "Ahch-To System 5"
	Class	       "Selena"

	Mass            0.00661927
	Radius          1544.08
	InertiaMoment   0.382534

	Oblateness      0.0144397

	Obliquity       -1.1663
	EqAscendNode    79.7518
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.721 0.601 0.515)

	Surface
	{
		SurfStyle       0.968772
		OceanStyle      0.627921
		Randomize      (-0.809, -0.573, -0.534)
		colorDistMagn   0.0691796
		colorDistFreq   184.323
		detailScale     3971.46
		colorConversion true
		drivenDarkening 0
		seaLevel        0.254329
		snowLevel       2
		tropicLatitude  0.0312367
		icecapLatitude  10
		icecapHeight    0.133024
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.54083
		venusFreq       0.76617
		venusMagn       0
		mareFreq        0.659498
		mareDensity     0.00160241
		terraceProb     0.290806
		erosion         0
		montesMagn      0.0711001
		montesFreq      62.775
		montesSpiky     0.903889
		montesFraction  0.319819
		dunesMagn       0.0374639
		dunesFreq       2064.2
		dunesFraction   0.213742
		hillsMagn       0.147002
		hillsFreq       162.274
		hillsFraction   0.84056
		hills2Fraction  0
		riversMagn      60.3373
		riversFreq      1.48902
		riversSin       5.54068
		riversOctaves   0
		canyonsMagn     0.543453
		canyonsFreq     0.481859
		canyonFraction  0.449002
		cracksMagn      0.0509305
		cracksFreq      0.639314
		cracksOctaves   0
		craterMagn      0.6728
		craterFreq      4.85852
		craterDensity   0.509367
		craterOctaves   6.44858
		craterRayedFactor 0.0547302
		volcanoMagn     0.179983
		volcanoFreq     0.841688
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.272249
		volcanoRadius   0.152265
		volcanoTemp     1266.4
		lavaCoverTidal  0.459739
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.390, 0.400, 0.160, 0.000)
		colorShelf     (0.580, 0.550, 0.240, 0.000)
		colorBeach     (0.512, 0.409, 0.216, 0.000)
		colorDesert    (0.591, 0.457, 0.221, 0.000)
		colorLowland   (0.454, 0.331, 0.160, 0.000)
		colorUpland    (0.425, 0.307, 0.149, 0.000)
		colorRock      (0.330, 0.240, 0.130, 0.000)
		colorSnow      (0.900, 0.890, 0.760, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00059903
		Period          0.0021177
		Eccentricity    0.0491332
		Inclination     -1.1663
		AscendingNode   79.7518
		ArgOfPericenter -36.8235
		MeanAnomaly     -7.44847
	}
}

Moon	"Ahch-To System 5.2"
{
	ParentBody     "Ahch-To System 5"
	Class	       "Selena"

	Mass            0.00818163
	Radius          1759.29
	InertiaMoment   0.383595

	Oblateness      0.00233393

	Obliquity       -1.44754
	EqAscendNode    138.057
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.701 0.619 0.582)

	Surface
	{
		SurfStyle       0.187136
		OceanStyle      0.468712
		Randomize      (-0.218, -0.756, 0.364)
		colorDistMagn   0.0460084
		colorDistFreq   206.914
		detailScale     4524.98
		colorConversion true
		drivenDarkening 0
		seaLevel        0.280156
		snowLevel       2
		tropicLatitude  0.0180822
		icecapLatitude  0.984207
		icecapHeight    0.280295
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.96085
		venusFreq       1.36545
		venusMagn       0
		mareFreq        1.02275
		mareDensity     0.00167771
		terraceProb     0.390365
		erosion         0
		montesMagn      0.0826708
		montesFreq      76.1356
		montesSpiky     0.943885
		montesFraction  0.225044
		dunesMagn       0.0340563
		dunesFreq       2389.62
		dunesFraction   0.293939
		hillsMagn       0.139713
		hillsFreq       184.4
		hillsFraction   0.300007
		hills2Fraction  0
		riversMagn      58.6347
		riversFreq      3.23971
		riversSin       7.61345
		riversOctaves   0
		canyonsMagn     0.545401
		canyonsFreq     0.637141
		canyonFraction  0.298772
		cracksMagn      0.0419952
		cracksFreq      0.775094
		cracksOctaves   0
		craterMagn      0.638238
		craterFreq      4.11836
		craterDensity   0.746532
		craterOctaves   9.48649
		craterRayedFactor 0.0720163
		volcanoMagn     0.267301
		volcanoFreq     0.664892
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.324283
		volcanoRadius   0.183177
		volcanoTemp     1563.18
		lavaCoverTidal  0.152879
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.351, 0.310, 0.291, 0.000)
		colorDesert    (0.435, 0.372, 0.332, 0.200)
		colorLowland   (0.470, 0.396, 0.372, 0.500)
		colorUpland    (0.491, 0.415, 0.384, 0.800)
		colorRock      (0.650, 0.610, 0.620, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0011691
		Period          0.00577359
		Eccentricity    0.0280526
		Inclination     -1.44754
		AscendingNode   138.057
		ArgOfPericenter -9.15435
		MeanAnomaly     -114.474
	}
}

Moon	"Ahch-To System 5.3"
{
	ParentBody     "Ahch-To System 5"
	Class	       "IceWorld"

	Mass            0.0103112
	Radius          1785.84
	InertiaMoment   0.37734

	Obliquity       1.25514
	EqAscendNode    -61.0245
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.790 0.720 0.680)

	Surface
	{
		SurfStyle       0.869092
		OceanStyle      0.092189
		Randomize      (0.040, 0.894, -0.149)
		colorDistMagn   0.0799724
		colorDistFreq   184.234
		detailScale     4593.29
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.174948
		snowLevel       2
		tropicLatitude  0.0377349
		icecapLatitude  0.507341
		icecapHeight    0.223292
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.96154
		venusFreq       1.32616
		venusMagn       0.206519
		mareFreq        0.9354
		mareDensity     0.00248912
		terraceProb     0.169386
		erosion         0
		montesMagn      0.0698799
		montesFreq      62.9342
		montesSpiky     0.936289
		montesFraction  0.16423
		dunesMagn       0.0449985
		dunesFreq       2362.71
		dunesFraction   0.854251
		hillsMagn       0.102849
		hillsFreq       169.097
		hillsFraction   0.478896
		hills2Fraction  0.0176956
		riversMagn      70.9952
		riversFreq      2.67941
		riversSin       5.86572
		riversOctaves   0
		canyonsMagn     0.627272
		canyonsFreq     0.682494
		canyonFraction  0
		cracksMagn      0.0564238
		cracksFreq      0.6302
		cracksOctaves   2
		craterMagn      0.632175
		craterFreq      5.98756
		craterDensity   0.970299
		craterOctaves   11
		craterRayedFactor 0.192361
		volcanoMagn     0.247895
		volcanoFreq     0.700185
		volcanoDensity  0.156646
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.199013
		volcanoRadius   0.239261
		volcanoTemp     1414.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.790, 0.540, 0.391, 0.000)
		colorShelf     (0.751, 0.513, 0.371, 0.000)
		colorBeach     (0.395, 0.270, 0.195, 0.000)
		colorDesert    (0.672, 0.460, 0.332, 0.000)
		colorLowland   (0.640, 0.475, 0.371, 0.000)
		colorUpland    (0.735, 0.502, 0.363, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.640, 0.475, 0.371, 0.000)
		colorUpPlants  (0.735, 0.502, 0.363, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00163325
		Period          0.00953277
		Eccentricity    0.0129531
		Inclination     1.25514
		AscendingNode   -61.0245
		ArgOfPericenter -74.5413
		MeanAnomaly     -120.688
	}
}

Moon	"Ahch-To System 5.4"
{
	ParentBody     "Ahch-To System 5"
	Class	       "IceWorld"

	Mass            0.0133409
	Radius          2065.21
	InertiaMoment   0.37112

	Obliquity       -0.261002
	EqAscendNode    90.7155
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.643 0.517 0.432)

	Surface
	{
		SurfStyle       0.487574
		OceanStyle      0.524334
		Randomize      (0.653, -0.976, -0.006)
		colorDistMagn   0.0752772
		colorDistFreq   258.952
		detailScale     5311.83
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.188798
		snowLevel       2
		tropicLatitude  0.00640372
		icecapLatitude  0.476577
		icecapHeight    0.235124
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.52253
		venusFreq       1.03032
		venusMagn       0
		mareFreq        1.14039
		mareDensity     0.00283741
		terraceProb     0.413236
		erosion         0
		montesMagn      0.104545
		montesFreq      103.149
		montesSpiky     0.949021
		montesFraction  0.0802614
		dunesMagn       0.0342848
		dunesFreq       2747.81
		dunesFraction   0.266504
		hillsMagn       0.120394
		hillsFreq       211.018
		hillsFraction   0.318914
		hills2Fraction  0.24819
		riversMagn      50.8409
		riversFreq      3.89303
		riversSin       6.95198
		riversOctaves   0
		canyonsMagn     0.495273
		canyonsFreq     0.781413
		canyonFraction  0
		cracksMagn      0.0529719
		cracksFreq      0.980711
		cracksOctaves   1
		craterMagn      0.515857
		craterFreq      6.98993
		craterDensity   0.772378
		craterOctaves   11
		craterRayedFactor 0.18715
		volcanoMagn     0.331984
		volcanoFreq     0.694601
		volcanoDensity  0.229395
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.0165775
		volcanoRadius   0.280897
		volcanoTemp     1539.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.129, 0.095, 0.000)
		colorShelf     (0.238, 0.160, 0.121, 0.000)
		colorBeach     (0.360, 0.243, 0.181, 0.200)
		colorDesert    (0.328, 0.227, 0.160, 0.500)
		colorLowland   (0.251, 0.176, 0.121, 0.800)
		colorUpland    (0.424, 0.310, 0.225, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.251, 0.176, 0.121, 0.800)
		colorUpPlants  (0.424, 0.310, 0.225, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00228168
		Period          0.0157391
		Eccentricity    0.0373743
		Inclination     -0.261002
		AscendingNode   90.7155
		ArgOfPericenter -171.629
		MeanAnomaly     -144.745
	}
}

Moon	"Ahch-To System 5.5"
{
	ParentBody     "Ahch-To System 5"
	Class	       "IceWorld"

	Mass            4.64914e-005
	Radius          298.763
	InertiaMoment   0.39823

	Obliquity       0.635306
	EqAscendNode    16.5046
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.708 0.706 0.704)

	Surface
	{
		SurfStyle       0.0238625
		OceanStyle      0.0138357
		Randomize      (-0.967, 0.677, -0.498)
		colorDistMagn   0.0703873
		colorDistFreq   43.7471
		detailScale     768.435
		colorConversion true
		drivenDarkening 0.59862
		seaLevel        0.192134
		snowLevel       2
		tropicLatitude  0.0219442
		icecapLatitude  0.712153
		icecapHeight    0.213702
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.84441
		venusFreq       1.47971
		venusMagn       0.133576
		mareFreq        0
		mareDensity     8.4432e-005
		terraceProb     0.147296
		erosion         0
		montesMagn      0.046348
		montesFreq      16.3313
		montesSpiky     0.979365
		montesFraction  0.415795
		dunesMagn       0.0305962
		dunesFreq       394.436
		dunesFraction   0.0721093
		hillsMagn       0.137871
		hillsFreq       32.8368
		hillsFraction   0.0526573
		hills2Fraction  0.200551
		riversMagn      56.1123
		riversFreq      3.31372
		riversSin       6.6303
		riversOctaves   0
		canyonsMagn     0.460811
		canyonsFreq     0.101349
		canyonFraction  0
		cracksMagn      0.0482037
		cracksFreq      0.0706961
		cracksOctaves   0
		craterMagn      0.871661
		craterFreq      0.867397
		craterDensity   0.881083
		craterOctaves   8
		craterRayedFactor 0.226683
		volcanoMagn     0.19457
		volcanoFreq     0.768962
		volcanoDensity  0.172008
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.308056
		volcanoRadius   0.164624
		volcanoTemp     1449.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.708, 0.706, 0.704, 0.500)
		colorShelf     (0.673, 0.670, 0.669, 0.500)
		colorBeach     (0.496, 0.494, 0.493, 0.750)
		colorDesert    (0.602, 0.600, 0.599, 1.000)
		colorLowland   (0.623, 0.621, 0.620, 1.000)
		colorUpland    (0.659, 0.656, 0.655, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.623, 0.621, 0.620, 1.000)
		colorUpPlants  (0.659, 0.656, 0.655, 1.000)
		BumpHeight      14.9381
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00318754
		Period          0.0259993
		Eccentricity    0.0271929
		Inclination     0.635306
		AscendingNode   16.5046
		ArgOfPericenter 120.535
		MeanAnomaly     102.873
	}
}

Moon	"Ahch-To System 5.6"
{
	ParentBody     "Ahch-To System 5"
	Class	       "IceWorld"

	Mass            1.55296e-005
	Radius          220.336
	InertiaMoment   0.397401

	Obliquity       1.31473
	EqAscendNode    -73.8867
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.675 0.671 0.663)

	Surface
	{
		SurfStyle       0.209115
		OceanStyle      0.995401
		Randomize      (0.929, 0.046, -0.612)
		colorDistMagn   0.0444949
		colorDistFreq   28.0366
		detailScale     566.716
		colorConversion true
		drivenDarkening 0.428499
		seaLevel        0.250549
		snowLevel       2
		tropicLatitude  0.0366686
		icecapLatitude  0.643261
		icecapHeight    0.30666
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.77646
		venusFreq       1.01673
		venusMagn       0
		mareFreq        0
		mareDensity     2.53805e-005
		terraceProb     0.486904
		erosion         0
		montesMagn      0.0584548
		montesFreq      7.78635
		montesSpiky     0.697224
		montesFraction  0.870797
		dunesMagn       0.0340819
		dunesFreq       294.754
		dunesFraction   0.894067
		hillsMagn       0.127674
		hillsFreq       25.9481
		hillsFraction   0.583827
		hills2Fraction  0.237496
		riversMagn      64.9594
		riversFreq      3.70943
		riversSin       7.71027
		riversOctaves   0
		canyonsMagn     0.508319
		canyonsFreq     0.0682101
		canyonFraction  0
		cracksMagn      0.0765801
		cracksFreq      0.0828729
		cracksOctaves   0
		craterMagn      1.07814
		craterFreq      0.807714
		craterDensity   0.975407
		craterOctaves   8
		craterRayedFactor 0.167024
		volcanoMagn     0.198542
		volcanoFreq     0.686557
		volcanoDensity  0.20916
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.469303
		volcanoRadius   0.151167
		volcanoTemp     1332.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.675, 0.671, 0.663, 0.500)
		colorShelf     (0.642, 0.638, 0.630, 0.500)
		colorBeach     (0.473, 0.470, 0.464, 0.750)
		colorDesert    (0.574, 0.571, 0.563, 1.000)
		colorLowland   (0.594, 0.591, 0.583, 1.000)
		colorUpland    (0.628, 0.624, 0.616, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.594, 0.591, 0.583, 1.000)
		colorUpPlants  (0.628, 0.624, 0.616, 1.000)
		BumpHeight      11.0168
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00445304
		Period          0.0429303
		Eccentricity    0.000914737
		Inclination     1.31473
		AscendingNode   -73.8867
		ArgOfPericenter -101.435
		MeanAnomaly     -76.8973
	}
}

Moon	"Ahch-To System 5.7"
{
	ParentBody     "Ahch-To System 5"
	Class	       "IceWorld"

	Mass            2.82098e-005
	Radius          253.008
	InertiaMoment   0.394932

	Obliquity       0.0679343
	EqAscendNode    -110.049
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.539 0.490 0.391)

	Surface
	{
		SurfStyle       0.271556
		OceanStyle      0.865651
		Randomize      (-0.013, 0.930, 0.511)
		colorDistMagn   0.0947653
		colorDistFreq   26.2687
		detailScale     650.751
		colorConversion true
		drivenDarkening 0.306724
		seaLevel        0.163163
		snowLevel       2
		tropicLatitude  0.00138107
		icecapLatitude  0.539572
		icecapHeight    0.204067
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.65926
		venusFreq       0.853733
		venusMagn       0
		mareFreq        0
		mareDensity     4.61356e-005
		terraceProb     0.540654
		erosion         0
		montesMagn      0.0678353
		montesFreq      11.8416
		montesSpiky     0.864041
		montesFraction  0.708711
		dunesMagn       0.0426657
		dunesFreq       336.116
		dunesFraction   0.180575
		hillsMagn       0.13021
		hillsFreq       25.9522
		hillsFraction   0.0436639
		hills2Fraction  0.259147
		riversMagn      52.1765
		riversFreq      4.44514
		riversSin       6.83483
		riversOctaves   0
		canyonsMagn     0.560032
		canyonsFreq     0.0936936
		canyonFraction  0
		cracksMagn      0.0354989
		cracksFreq      0.121927
		cracksOctaves   0
		craterMagn      1.0535
		craterFreq      0.69988
		craterDensity   0.888864
		craterOctaves   8
		craterRayedFactor 0.228344
		volcanoMagn     0.167428
		volcanoFreq     0.685797
		volcanoDensity  0.183986
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.185716
		volcanoRadius   0.128884
		volcanoTemp     1237.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.539, 0.490, 0.391, 0.500)
		colorShelf     (0.512, 0.465, 0.371, 0.500)
		colorBeach     (0.377, 0.343, 0.274, 0.750)
		colorDesert    (0.458, 0.416, 0.332, 1.000)
		colorLowland   (0.474, 0.431, 0.344, 1.000)
		colorUpland    (0.501, 0.455, 0.364, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.474, 0.431, 0.344, 1.000)
		colorUpPlants  (0.501, 0.455, 0.364, 1.000)
		BumpHeight      12.6504
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00622096
		Period          0.0708869
		Eccentricity    0.00520497
		Inclination     0.0679343
		AscendingNode   -110.049
		ArgOfPericenter 89.3213
		MeanAnomaly     -12.3291
	}
}

Moon	"Ahch-To System 5.8"
{
	ParentBody     "Ahch-To System 5"
	Class	       "IceWorld"

	Mass            4.30626e-005
	Radius          309.388
	InertiaMoment   0.399568

	Obliquity       1.2289
	EqAscendNode    2.3718
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.774 0.771 0.769)

	Surface
	{
		SurfStyle       0.748982
		OceanStyle      0.545623
		Randomize      (0.868, -0.644, -0.301)
		colorDistMagn   0.0771798
		colorDistFreq   38.0193
		detailScale     795.764
		colorConversion true
		drivenDarkening 0.219557
		seaLevel        0.143405
		snowLevel       2
		tropicLatitude  0.0428742
		icecapLatitude  0.976241
		icecapHeight    0.145621
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.87154
		venusFreq       1.16416
		venusMagn       0
		mareFreq        0
		mareDensity     5.11882e-005
		terraceProb     0.14609
		erosion         0
		montesMagn      0.0472844
		montesFreq      12.2903
		montesSpiky     0.845504
		montesFraction  0.818957
		dunesMagn       0.0258919
		dunesFreq       405.835
		dunesFraction   0.0175228
		hillsMagn       0.116901
		hillsFreq       31.7317
		hillsFraction   0.353448
		hills2Fraction  0.0967766
		riversMagn      57.0637
		riversFreq      2.5181
		riversSin       5.15968
		riversOctaves   0
		canyonsMagn     0.560279
		canyonsFreq     0.117218
		canyonFraction  0
		cracksMagn      0.0310752
		cracksFreq      0.0750282
		cracksOctaves   0
		craterMagn      0.783603
		craterFreq      0.945976
		craterDensity   0.970155
		craterOctaves   8
		craterRayedFactor 0.228289
		volcanoMagn     0.179679
		volcanoFreq     0.795062
		volcanoDensity  0.179688
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.445879
		volcanoRadius   0.144496
		volcanoTemp     1610.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.495, 0.493, 0.515, 0.250)
		colorShelf     (0.542, 0.563, 0.585, 0.250)
		colorBeach     (0.441, 0.416, 0.446, 0.200)
		colorDesert    (0.410, 0.378, 0.392, 0.200)
		colorLowland   (0.302, 0.293, 0.323, 0.200)
		colorUpland    (0.573, 0.570, 0.585, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.302, 0.293, 0.323, 0.200)
		colorUpPlants  (0.573, 0.570, 0.585, 0.250)
		BumpHeight      15.4694
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00869079
		Period          0.117049
		Eccentricity    0.0414252
		Inclination     1.2289
		AscendingNode   2.3718
		ArgOfPericenter -173.054
		MeanAnomaly     -117.439
	}
}

DwarfMoon	"Ahch-To System 5.D4"
{
	ParentBody     "Ahch-To System 5"
	Class	       "Asteroid"

	Mass            1.40396e-010
	Radius          6.93841
	InertiaMoment   0.394861

	RotationPeriod  1508.71
	Obliquity       -31.0075
	EqAscendNode    -52.6577

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.534 0.528 0.525)

	Surface
	{
		SurfStyle       0.301259
		OceanStyle      0.0432662
		Randomize      (0.376, 0.203, -0.123)
		colorDistMagn   0.359433
		colorDistFreq   0.00891855
		detailScale     189.465
		colorConversion true
		snowLevel       2
		tropicLatitude  0.82719
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.559394
		terraceProb     0.523718
		erosion         0
		montesMagn      0.495423
		montesFreq      2.20461
		montesSpiky     0.998068
		montesFraction  0.276808
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.134272
		hillsFraction   0.815603
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250691
		craterFreq      0.22902
		craterDensity   0.918437
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511131
		volcanoTemp     1464.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.214, 0.211, 0.210, 0.000)
		colorShelf     (0.227, 0.225, 0.223, 0.000)
		colorBeach     (0.240, 0.238, 0.236, 0.000)
		colorDesert    (0.254, 0.251, 0.249, 0.000)
		colorLowland   (0.267, 0.264, 0.262, 0.000)
		colorUpland    (0.280, 0.277, 0.276, 0.000)
		colorRock      (0.294, 0.291, 0.289, 0.000)
		colorSnow      (0.307, 0.304, 0.302, 1.000)
		BumpHeight      6.24457
		BumpOffset      1.24891
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0469545
		Period          1.46993
		Eccentricity    0.157607
		Inclination     -33.167
		AscendingNode   -56.5034
		ArgOfPericenter -57.064
		MeanAnomaly     -129.589
	}
}

DwarfMoon	"Ahch-To System 5.D5"
{
	ParentBody     "Ahch-To System 5"
	Class	       "Asteroid"

	Mass            2.21978e-010
	Radius          9.57047
	InertiaMoment   0.39817

	RotationPeriod  1644.07
	Obliquity       12.3203
	EqAscendNode    -96.0083

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.779 0.777 0.774)

	Surface
	{
		SurfStyle       0.376673
		OceanStyle      0.137607
		Randomize      (0.377, 0.848, -0.808)
		colorDistMagn   0.709902
		colorDistFreq   0.0752894
		detailScale     261.338
		colorConversion true
		snowLevel       2
		tropicLatitude  0.217228
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.413305
		terraceProb     0.233971
		erosion         0
		montesMagn      0.384094
		montesFreq      2.67033
		montesSpiky     0.945877
		montesFraction  0.699042
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.235337
		hillsFraction   0.945467
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236902
		craterFreq      0.160258
		craterDensity   0.841286
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.550711
		volcanoTemp     1730.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.311, 0.309, 0.000)
		colorShelf     (0.331, 0.330, 0.329, 0.000)
		colorBeach     (0.351, 0.350, 0.348, 0.000)
		colorDesert    (0.370, 0.369, 0.367, 0.000)
		colorLowland   (0.390, 0.389, 0.387, 0.000)
		colorUpland    (0.409, 0.408, 0.406, 0.000)
		colorRock      (0.429, 0.427, 0.425, 0.000)
		colorSnow      (0.448, 0.447, 0.445, 1.000)
		BumpHeight      8.61343
		BumpOffset      1.72269
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0473747
		Period          1.4897
		Eccentricity    0.113865
		Inclination     3.43
		AscendingNode   -94.0475
		ArgOfPericenter 107.54
		MeanAnomaly     -83.6442
	}
}

DwarfMoon	"Ahch-To System 5.D6"
{
	ParentBody     "Ahch-To System 5"
	Class	       "Asteroid"

	Mass            3.40785e-010
	Radius          10.2281
	InertiaMoment   0.399256

	RotationPeriod  1420.83
	Obliquity       51.9905
	EqAscendNode    -14.5637

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.720 0.717 0.714)

	Surface
	{
		SurfStyle       0.513523
		OceanStyle      0.919004
		Randomize      (0.192, 0.046, -0.968)
		colorDistMagn   0.767866
		colorDistFreq   0.0357341
		detailScale     279.296
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996477
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.648205
		terraceProb     0.303857
		erosion         0
		montesMagn      0.535816
		montesFreq      2.53986
		montesSpiky     0.962056
		montesFraction  0.705539
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.24289
		hillsFraction   0.789629
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248973
		craterFreq      0.180827
		craterDensity   0.819102
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476351
		volcanoTemp     1387.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.244, 0.200, 0.000)
		colorShelf     (0.288, 0.251, 0.229, 0.000)
		colorBeach     (0.338, 0.294, 0.271, 0.000)
		colorDesert    (0.367, 0.315, 0.264, 0.000)
		colorLowland   (0.403, 0.337, 0.300, 0.000)
		colorUpland    (0.446, 0.408, 0.364, 0.000)
		colorRock      (0.482, 0.444, 0.393, 0.000)
		colorSnow      (0.525, 0.473, 0.414, 1.000)
		BumpHeight      9.2053
		BumpOffset      1.84106
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0475801
		Period          1.4994
		Eccentricity    0.017352
		Inclination     34.2984
		AscendingNode   -16.8842
		ArgOfPericenter -141.548
		MeanAnomaly     -20.4412
	}
}

Planet	"Ahch-To System 6"
{
	ParentBody     "Ahch-To System"
	Class	       "IceWorld"

	Mass            0.0273926
	Radius          2456.81
	InertiaMoment   0.354931

	Oblateness      0.00319628

	RotationPeriod  36.9761
	Obliquity       211.342
	EqAscendNode    -75.848

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.824 0.739 0.611)

	Surface
	{
		SurfStyle       0.395189
		OceanStyle      0.480781
		Randomize      (0.770, 0.206, -0.813)
		colorDistMagn   0.0634952
		colorDistFreq   314.557
		detailScale     6319.06
		colorConversion true
		drivenDarkening 0
		seaLevel        0.223524
		snowLevel       2
		tropicLatitude  0.512511
		icecapLatitude  1
		icecapHeight    0.223524
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.00714
		venusFreq       0.843388
		venusMagn       0
		mareFreq        1.23954
		mareDensity     0.00451566
		terraceProb     0.351614
		erosion         0
		montesMagn      0.142163
		montesFreq      119.221
		montesSpiky     0.808814
		montesFraction  0.518131
		dunesMagn       0.0409158
		dunesFreq       3218.01
		dunesFraction   0.871426
		hillsMagn       0.129527
		hillsFreq       283.263
		hillsFraction   0.108782
		hills2Fraction  0.121369
		riversMagn      59.2873
		riversFreq      3.21391
		riversSin       5.60794
		riversOctaves   0
		canyonsMagn     0.38836
		canyonsFreq     0.934539
		canyonFraction  0
		cracksMagn      0.0436661
		cracksFreq      0.953169
		cracksOctaves   2
		craterMagn      0.589586
		craterFreq      6.34961
		craterDensity   0.954583
		craterOctaves   12
		craterRayedFactor 0.145898
		volcanoMagn     0.479121
		volcanoFreq     0.540628
		volcanoDensity  0.212482
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.317685
		volcanoRadius   0.323318
		volcanoTemp     1455.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.824, 0.739, 0.611, 0.500)
		colorShelf     (0.782, 0.702, 0.580, 0.500)
		colorBeach     (0.577, 0.517, 0.428, 0.750)
		colorDesert    (0.700, 0.628, 0.519, 1.000)
		colorLowland   (0.725, 0.650, 0.538, 1.000)
		colorUpland    (0.766, 0.687, 0.568, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.725, 0.650, 0.538, 1.000)
		colorUpPlants  (0.766, 0.687, 0.568, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   16.9254
		Period          55.9539
		Eccentricity    0.0457485
		Inclination     -14.7266
		AscendingNode   -75.7005
		ArgOfPericenter 318.154
		MeanAnomaly     308.813
	}
}

DwarfMoon	"Ahch-To System 6.D1"
{
	ParentBody     "Ahch-To System 6"
	Class	       "Asteroid"

	Mass            9.5732e-009
	Radius          30.5058
	InertiaMoment   0.398645

	Oblateness      0.249

	Obliquity       0.0105622
	EqAscendNode    91.1365
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.754 0.751 0.749)

	Surface
	{
		SurfStyle       0.0591399
		OceanStyle      0.038822
		Randomize      (-0.065, -0.745, -0.378)
		colorDistMagn   0.11766
		colorDistFreq   0.127752
		detailScale     833.011
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.500038
		terraceProb     0.144392
		erosion         0
		montesMagn      0.48663
		montesFreq      2.14806
		montesSpiky     0.94777
		montesFraction  0.6891
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.13535
		hillsFraction   0.70241
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.280202
		craterFreq      0.221538
		craterDensity   0.780383
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455396
		volcanoTemp     1122.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.301, 0.301, 0.299, 0.000)
		colorShelf     (0.320, 0.319, 0.318, 0.000)
		colorBeach     (0.339, 0.338, 0.337, 0.000)
		colorDesert    (0.358, 0.357, 0.356, 0.000)
		colorLowland   (0.377, 0.376, 0.374, 0.000)
		colorUpland    (0.396, 0.394, 0.393, 0.000)
		colorRock      (0.415, 0.413, 0.412, 0.000)
		colorSnow      (0.433, 0.432, 0.430, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.70949e-005
		Period          0.000789468
		Eccentricity    7.0825e-005
		Inclination     0.0105622
		AscendingNode   91.1365
		ArgOfPericenter 9.11681
		MeanAnomaly     74.7004
	}
}

DwarfMoon	"Ahch-To System 6.D2"
{
	ParentBody     "Ahch-To System 6"
	Class	       "Asteroid"

	Mass            1.30555e-008
	Radius          32.4929
	InertiaMoment   0.399617

	Oblateness      0.241134

	Obliquity       0.0137904
	EqAscendNode    33.0017
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.632 0.626 0.622)

	Surface
	{
		SurfStyle       0.317861
		OceanStyle      0.258369
		Randomize      (-0.334, 0.139, -0.240)
		colorDistMagn   0.680695
		colorDistFreq   0.526616
		detailScale     887.274
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.642752
		terraceProb     0.190145
		erosion         0
		montesMagn      0.507994
		montesFreq      3.43944
		montesSpiky     0.877066
		montesFraction  0.286148
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.73059
		hillsFraction   0.707316
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206421
		craterFreq      0.1886
		craterDensity   0.841712
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529378
		volcanoTemp     1502.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.250, 0.249, 0.000)
		colorShelf     (0.268, 0.266, 0.264, 0.000)
		colorBeach     (0.284, 0.282, 0.280, 0.000)
		colorDesert    (0.300, 0.297, 0.295, 0.000)
		colorLowland   (0.316, 0.313, 0.311, 0.000)
		colorUpland    (0.332, 0.329, 0.326, 0.000)
		colorRock      (0.347, 0.344, 0.342, 0.000)
		colorSnow      (0.363, 0.360, 0.357, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.80277e-005
		Period          0.00116306
		Eccentricity    3.46883e-005
		Inclination     0.0137904
		AscendingNode   33.0017
		ArgOfPericenter -17.1101
		MeanAnomaly     170.063
	}
}

DwarfMoon	"Ahch-To System 6.D3"
{
	ParentBody     "Ahch-To System 6"
	Class	       "Asteroid"

	Mass            1.77592e-008
	Radius          34.2204
	InertiaMoment   0.397425

	Oblateness      0.152388

	Obliquity       0.0132432
	EqAscendNode    -135.636
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.569 0.505 0.449)

	Surface
	{
		SurfStyle       0.738791
		OceanStyle      0.501067
		Randomize      (-0.565, 0.902, 0.948)
		colorDistMagn   0.929586
		colorDistFreq   0.639651
		detailScale     934.445
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.617184
		terraceProb     0.30606
		erosion         0
		montesMagn      0.337644
		montesFreq      3.11722
		montesSpiky     0.871168
		montesFraction  0.373396
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.39652
		hillsFraction   0.526468
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236187
		craterFreq      0.249425
		craterDensity   0.985111
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.550093
		volcanoTemp     1462.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.172, 0.126, 0.000)
		colorShelf     (0.228, 0.177, 0.144, 0.000)
		colorBeach     (0.267, 0.207, 0.171, 0.000)
		colorDesert    (0.290, 0.222, 0.166, 0.000)
		colorLowland   (0.319, 0.237, 0.189, 0.000)
		colorUpland    (0.353, 0.288, 0.229, 0.000)
		colorRock      (0.381, 0.313, 0.247, 0.000)
		colorSnow      (0.415, 0.333, 0.261, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.30507e-005
		Period          0.0013502
		Eccentricity    4.71254e-005
		Inclination     0.0132432
		AscendingNode   -135.636
		ArgOfPericenter -55.5765
		MeanAnomaly     31.681
	}
}

Moon	"Ahch-To System 6.1"
{
	ParentBody     "Ahch-To System 6"
	Class	       "IceWorld"

	Mass            0.000145006
	Radius          436.095
	InertiaMoment   0.399036

	Oblateness      0.00216716

	Obliquity       -1.22097
	EqAscendNode    69.5645
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.783 0.621 0.528)

	Surface
	{
		SurfStyle       0.242884
		OceanStyle      0.434334
		Randomize      (-0.638, -0.186, 0.338)
		colorDistMagn   0.0582085
		colorDistFreq   44.5183
		detailScale     1121.66
		colorConversion true
		drivenDarkening 0
		seaLevel        0.286759
		snowLevel       2
		tropicLatitude  0.0349963
		icecapLatitude  0.819267
		icecapHeight    0.300144
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.85499
		venusFreq       0.883378
		venusMagn       0
		mareFreq        0
		mareDensity     0.000129051
		terraceProb     0.219094
		erosion         0
		montesMagn      0.0618944
		montesFreq      15.0586
		montesSpiky     0.844995
		montesFraction  0.00523429
		dunesMagn       0.0227029
		dunesFreq       568.708
		dunesFraction   0.836674
		hillsMagn       0.108648
		hillsFreq       49.8506
		hillsFraction   0.695836
		hills2Fraction  0.128712
		riversMagn      58.0732
		riversFreq      2.76154
		riversSin       6.20468
		riversOctaves   0
		canyonsMagn     0.346048
		canyonsFreq     0.159243
		canyonFraction  0
		cracksMagn      0.0455696
		cracksFreq      0.15766
		cracksOctaves   0
		craterMagn      0.680494
		craterFreq      1.14187
		craterDensity   0.835065
		craterOctaves   9
		craterRayedFactor 0.192979
		volcanoMagn     0.18199
		volcanoFreq     0.719384
		volcanoDensity  0.219299
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.232749
		volcanoRadius   0.146782
		volcanoTemp     1831.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.783, 0.621, 0.528, 0.500)
		colorShelf     (0.744, 0.590, 0.501, 0.500)
		colorBeach     (0.548, 0.435, 0.369, 0.750)
		colorDesert    (0.665, 0.528, 0.448, 1.000)
		colorLowland   (0.689, 0.546, 0.464, 1.000)
		colorUpland    (0.728, 0.578, 0.491, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.689, 0.546, 0.464, 1.000)
		colorUpPlants  (0.728, 0.578, 0.491, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000139099
		Period          0.00571746
		Eccentricity    0.045643
		Inclination     -1.22097
		AscendingNode   69.5645
		ArgOfPericenter -38.4483
		MeanAnomaly     149.541
	}
}

Moon	"Ahch-To System 6.2"
{
	ParentBody     "Ahch-To System 6"
	Class	       "IceWorld"

	Mass            0.000167786
	Radius          486.297
	InertiaMoment   0.39848

	Obliquity       0.124429
	EqAscendNode    164.645
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.767 0.764 0.763)

	Surface
	{
		SurfStyle       0.0410365
		OceanStyle      0.571479
		Randomize      (-0.444, -0.042, -0.852)
		colorDistMagn   0.0464613
		colorDistFreq   54.9748
		detailScale     1250.78
		colorConversion true
		drivenDarkening 0
		seaLevel        0.119022
		snowLevel       2
		tropicLatitude  0.00059802
		icecapLatitude  0.71831
		icecapHeight    0.139588
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.93176
		venusFreq       0.498726
		venusMagn       0
		mareFreq        0
		mareDensity     9.39486e-005
		terraceProb     0.329353
		erosion         0
		montesMagn      0.0475472
		montesFreq      19.971
		montesSpiky     0.899628
		montesFraction  0.733718
		dunesMagn       0.0390565
		dunesFreq       637.014
		dunesFraction   0.184791
		hillsMagn       0.148238
		hillsFreq       55.9764
		hillsFraction   0.868478
		hills2Fraction  0.193669
		riversMagn      52.3222
		riversFreq      3.27949
		riversSin       5.65798
		riversOctaves   0
		canyonsMagn     0.521712
		canyonsFreq     0.202607
		canyonFraction  0
		cracksMagn      0.0438939
		cracksFreq      0.268444
		cracksOctaves   0
		craterMagn      0.558319
		craterFreq      1.59768
		craterDensity   0.894277
		craterOctaves   9
		craterRayedFactor 0.105499
		volcanoMagn     0.170244
		volcanoFreq     0.741481
		volcanoDensity  0.123465
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.0826395
		volcanoRadius   0.136696
		volcanoTemp     1439.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.767, 0.764, 0.763, 0.500)
		colorShelf     (0.728, 0.726, 0.724, 0.500)
		colorBeach     (0.537, 0.535, 0.534, 0.750)
		colorDesert    (0.652, 0.649, 0.648, 1.000)
		colorLowland   (0.675, 0.672, 0.671, 1.000)
		colorUpland    (0.713, 0.710, 0.709, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.675, 0.672, 0.671, 1.000)
		colorUpPlants  (0.713, 0.710, 0.709, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000222564
		Period          0.011567
		Eccentricity    0.0271387
		Inclination     0.124429
		AscendingNode   164.645
		ArgOfPericenter 0.725328
		MeanAnomaly     -55.8765
	}
}

Moon	"Ahch-To System 6.3"
{
	ParentBody     "Ahch-To System 6"
	Class	       "IceWorld"

	Mass            0.000194163
	Radius          480.507
	InertiaMoment   0.39777

	Obliquity       -1.25245
	EqAscendNode    52.225
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.417 0.414 0.410)

	Surface
	{
		SurfStyle       0.531905
		OceanStyle      0.614199
		Randomize      (0.260, 0.016, 0.895)
		colorDistMagn   0.0840305
		colorDistFreq   65.5797
		detailScale     1235.89
		colorConversion true
		drivenDarkening 0
		seaLevel        0.0933298
		snowLevel       2
		tropicLatitude  0.0392452
		icecapLatitude  0.878047
		icecapHeight    0.0978403
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.5944
		venusFreq       0.892747
		venusMagn       0
		mareFreq        0
		mareDensity     0.000199977
		terraceProb     0.512829
		erosion         0
		montesMagn      0.0462817
		montesFreq      23.6584
		montesSpiky     0.730061
		montesFraction  0.482654
		dunesMagn       0.0239148
		dunesFreq       640.087
		dunesFraction   0.626308
		hillsMagn       0.124196
		hillsFreq       57.3254
		hillsFraction   0.0755138
		hills2Fraction  0.235253
		riversMagn      60.9341
		riversFreq      1.8463
		riversSin       6.85657
		riversOctaves   0
		canyonsMagn     0.528938
		canyonsFreq     0.185233
		canyonFraction  0
		cracksMagn      0.0719923
		cracksFreq      0.284068
		cracksOctaves   0
		craterMagn      0.647649
		craterFreq      1.24435
		craterDensity   0.910641
		craterOctaves   9
		craterRayedFactor 0.236372
		volcanoMagn     0.167709
		volcanoFreq     0.809595
		volcanoDensity  0.193336
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.150035
		volcanoRadius   0.146133
		volcanoTemp     1401.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.125, 0.103, 0.090, 0.000)
		colorShelf     (0.154, 0.128, 0.115, 0.000)
		colorBeach     (0.233, 0.195, 0.172, 0.200)
		colorDesert    (0.213, 0.182, 0.152, 0.500)
		colorLowland   (0.163, 0.141, 0.115, 0.800)
		colorUpland    (0.275, 0.248, 0.213, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.163, 0.141, 0.115, 0.800)
		colorUpPlants  (0.275, 0.248, 0.213, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000356112
		Period          0.0233996
		Eccentricity    0.0200659
		Inclination     -1.25245
		AscendingNode   52.225
		ArgOfPericenter -145.564
		MeanAnomaly     -52.8219
	}
}

Moon	"Ahch-To System 6.4"
{
	ParentBody     "Ahch-To System 6"
	Class	       "IceWorld"

	Mass            0.00022484
	Radius          535.957
	InertiaMoment   0.396526

	Obliquity       1.3228
	EqAscendNode    -34.9287
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.622 0.493 0.455)

	Surface
	{
		SurfStyle       0.296619
		OceanStyle      0.609384
		Randomize      (-0.485, 0.589, -0.018)
		colorDistMagn   0.0806168
		colorDistFreq   66.6969
		detailScale     1378.51
		colorConversion true
		drivenDarkening 0
		seaLevel        0.263582
		snowLevel       2
		tropicLatitude  0.0440322
		icecapLatitude  0.697968
		icecapHeight    0.284215
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.7156
		venusFreq       0.98656
		venusMagn       0
		mareFreq        0
		mareDensity     0.000146453
		terraceProb     0.296175
		erosion         0
		montesMagn      0.0474724
		montesFreq      25.5425
		montesSpiky     0.915367
		montesFraction  0.535872
		dunesMagn       0.0331845
		dunesFreq       718.681
		dunesFraction   0.186937
		hillsMagn       0.137291
		hillsFreq       58.355
		hillsFraction   0.0183743
		hills2Fraction  0.221078
		riversMagn      51.753
		riversFreq      2.57848
		riversSin       5.32889
		riversOctaves   0
		canyonsMagn     0.477174
		canyonsFreq     0.162573
		canyonFraction  0
		cracksMagn      0.062491
		cracksFreq      0.194774
		cracksOctaves   0
		craterMagn      0.649684
		craterFreq      1.44841
		craterDensity   0.782551
		craterOctaves   9
		craterRayedFactor 0.239524
		volcanoMagn     0.171589
		volcanoFreq     0.630887
		volcanoDensity  0.24362
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.375069
		volcanoRadius   0.126432
		volcanoTemp     1607.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.622, 0.493, 0.455, 0.500)
		colorShelf     (0.591, 0.468, 0.432, 0.500)
		colorBeach     (0.436, 0.345, 0.319, 0.750)
		colorDesert    (0.529, 0.419, 0.387, 1.000)
		colorLowland   (0.548, 0.433, 0.400, 1.000)
		colorUpland    (0.579, 0.458, 0.423, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.548, 0.433, 0.400, 1.000)
		colorUpPlants  (0.579, 0.458, 0.423, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000569793
		Period          0.047333
		Eccentricity    0.027793
		Inclination     1.3228
		AscendingNode   -34.9287
		ArgOfPericenter -166.286
		MeanAnomaly     95.5986
	}
}

Moon	"Ahch-To System 6.5"
{
	ParentBody     "Ahch-To System 6"
	Class	       "IceWorld"

	Mass            0.0002607
	Radius          529.906
	InertiaMoment   0.399749

	Obliquity       -0.191601
	EqAscendNode    -84.5716
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.494 0.487 0.479)

	Surface
	{
		SurfStyle       0.18682
		OceanStyle      0.620527
		Randomize      (-0.385, 0.551, -0.607)
		colorDistMagn   0.0440126
		colorDistFreq   68.2684
		detailScale     1362.95
		colorConversion true
		drivenDarkening 0
		seaLevel        0.215128
		snowLevel       2
		tropicLatitude  0.00494346
		icecapLatitude  0.830504
		icecapHeight    0.216308
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.62747
		venusFreq       1.34498
		venusMagn       0
		mareFreq        0
		mareDensity     0.000249213
		terraceProb     0.350021
		erosion         0
		montesMagn      0.0636809
		montesFreq      17.7869
		montesSpiky     0.965589
		montesFraction  0.982865
		dunesMagn       0.0307224
		dunesFreq       690.958
		dunesFraction   0.86602
		hillsMagn       0.113207
		hillsFreq       62.2902
		hillsFraction   0.555718
		hills2Fraction  0.28194
		riversMagn      56.6804
		riversFreq      3.85227
		riversSin       5.46741
		riversOctaves   0
		canyonsMagn     0.384554
		canyonsFreq     0.228449
		canyonFraction  0
		cracksMagn      0.0240819
		cracksFreq      0.242289
		cracksOctaves   0
		craterMagn      0.660309
		craterFreq      1.84257
		craterDensity   0.884762
		craterOctaves   9
		craterRayedFactor 0.119986
		volcanoMagn     0.198655
		volcanoFreq     0.636589
		volcanoDensity  0.263646
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.298786
		volcanoRadius   0.119014
		volcanoTemp     1795.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.494, 0.487, 0.479, 0.500)
		colorShelf     (0.469, 0.463, 0.455, 0.500)
		colorBeach     (0.346, 0.341, 0.335, 0.750)
		colorDesert    (0.420, 0.414, 0.407, 1.000)
		colorLowland   (0.435, 0.429, 0.421, 1.000)
		colorUpland    (0.459, 0.453, 0.445, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.435, 0.429, 0.421, 1.000)
		colorUpPlants  (0.459, 0.453, 0.445, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000911693
		Period          0.0957368
		Eccentricity    0.0376641
		Inclination     -0.191601
		AscendingNode   -84.5716
		ArgOfPericenter -65.4309
		MeanAnomaly     120.166
	}
}

Moon	"Ahch-To System 6.6"
{
	ParentBody     "Ahch-To System 6"
	Class	       "IceWorld"

	Mass            0.000302868
	Radius          591.688
	InertiaMoment   0.399276

	Obliquity       0.0346039
	EqAscendNode    -60.8894
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.642 0.639 0.635)

	Surface
	{
		SurfStyle       0.637153
		OceanStyle      0.79022
		Randomize      (-0.768, 0.677, -0.186)
		colorDistMagn   0.0797695
		colorDistFreq   75.1882
		detailScale     1521.86
		colorConversion true
		drivenDarkening 0
		seaLevel        0.300531
		snowLevel       2
		tropicLatitude  0.0010358
		icecapLatitude  0.960714
		icecapHeight    0.30219
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.81896
		venusFreq       1.58021
		venusMagn       0
		mareFreq        0
		mareDensity     0.000156879
		terraceProb     0.20951
		erosion         0
		montesMagn      0.0549404
		montesFreq      19.2518
		montesSpiky     0.932647
		montesFraction  0.281288
		dunesMagn       0.036213
		dunesFreq       786.186
		dunesFraction   0.949036
		hillsMagn       0.112581
		hillsFreq       63.4687
		hillsFraction   0.765928
		hills2Fraction  0.0555704
		riversMagn      62.6935
		riversFreq      2.4626
		riversSin       5.47118
		riversOctaves   0
		canyonsMagn     0.678461
		canyonsFreq     0.176094
		canyonFraction  0
		cracksMagn      0.0537451
		cracksFreq      0.252807
		cracksOctaves   0
		craterMagn      0.612078
		craterFreq      2.19555
		craterDensity   0.857645
		craterOctaves   9
		craterRayedFactor 0.131807
		volcanoMagn     0.179367
		volcanoFreq     0.740723
		volcanoDensity  0.225006
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.145538
		volcanoRadius   0.154811
		volcanoTemp     1439.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.121, 0.070, 1.000)
		colorShelf     (0.218, 0.166, 0.102, 1.000)
		colorBeach     (0.353, 0.217, 0.108, 0.200)
		colorDesert    (0.385, 0.243, 0.127, 0.200)
		colorLowland   (0.418, 0.256, 0.133, 0.200)
		colorUpland    (0.450, 0.307, 0.159, 0.200)
		colorRock      (0.920, 0.870, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.418, 0.256, 0.133, 0.200)
		colorUpPlants  (0.450, 0.307, 0.159, 0.200)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00145875
		Period          0.193617
		Eccentricity    0.00223271
		Inclination     0.0346039
		AscendingNode   -60.8894
		ArgOfPericenter -13.6482
		MeanAnomaly     -22.8487
	}
}

DwarfMoon	"Ahch-To System 6.D4"
{
	ParentBody     "Ahch-To System 6"
	Class	       "Asteroid"

	Mass            1.53514e-007
	Radius          74.7317
	InertiaMoment   0.399086

	RotationPeriod  486.18
	Obliquity       47.3759
	EqAscendNode    106.403

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.640 0.637 0.631)

	Surface
	{
		SurfStyle       0.977772
		OceanStyle      0.402658
		Randomize      (-0.460, -0.731, 0.766)
		colorDistMagn   0.408549
		colorDistFreq   0.942074
		detailScale     2040.67
		colorConversion true
		snowLevel       2
		tropicLatitude  0.827293
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.359339
		terraceProb     0.272824
		erosion         0
		montesMagn      0.431758
		montesFreq      3.33898
		montesSpiky     0.886985
		montesFraction  0.588861
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.1777
		hillsFraction   0.777083
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25096
		craterFreq      0.249338
		craterDensity   0.836905
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540583
		volcanoTemp     1471.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.223, 0.253, 0.050)
		colorShelf     (0.256, 0.261, 0.290, 0.040)
		colorBeach     (0.294, 0.299, 0.328, 0.030)
		colorDesert    (0.333, 0.337, 0.373, 0.020)
		colorLowland   (0.371, 0.376, 0.410, 0.030)
		colorUpland    (0.409, 0.414, 0.448, 0.050)
		colorRock      (0.448, 0.452, 0.499, 0.020)
		colorSnow      (0.448, 0.452, 0.499, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0084068
		Period          2.69344
		Eccentricity    0.449227
		Inclination     49.8427
		AscendingNode   102.849
		ArgOfPericenter 96.1796
		MeanAnomaly     -31.518
	}
}

DwarfMoon	"Ahch-To System 6.D5"
{
	ParentBody     "Ahch-To System 6"
	Class	       "Asteroid"

	Mass            2.113e-007
	Radius          79.5461
	InertiaMoment   0.399994

	RotationPeriod  443.777
	Obliquity       48.5213
	EqAscendNode    116.581

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.653 0.497 0.403)

	Surface
	{
		SurfStyle       0.638911
		OceanStyle      0.0167199
		Randomize      (-0.131, -0.831, 0.978)
		colorDistMagn   0.851767
		colorDistFreq   3.89865
		detailScale     2172.14
		colorConversion true
		snowLevel       2
		tropicLatitude  0.760928
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.306405
		terraceProb     0.176156
		erosion         0
		montesMagn      0.42685
		montesFreq      2.64491
		montesSpiky     0.955872
		montesFraction  0.502602
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.9256
		hillsFraction   0.872111
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.199456
		craterFreq      0.221866
		craterDensity   0.89484
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55902
		volcanoTemp     1317.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.169, 0.113, 0.000)
		colorShelf     (0.261, 0.174, 0.129, 0.000)
		colorBeach     (0.307, 0.204, 0.153, 0.000)
		colorDesert    (0.333, 0.219, 0.149, 0.000)
		colorLowland   (0.365, 0.234, 0.169, 0.000)
		colorUpland    (0.405, 0.284, 0.206, 0.000)
		colorRock      (0.437, 0.308, 0.222, 0.000)
		colorSnow      (0.476, 0.328, 0.234, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0089769
		Period          2.97201
		Eccentricity    0.0416511
		Inclination     -2.36831
		AscendingNode   114.704
		ArgOfPericenter 68.8645
		MeanAnomaly     -139.843
	}
}

DwarfMoon	"Ahch-To System 6.D6"
{
	ParentBody     "Ahch-To System 6"
	Class	       "Asteroid"

	Mass            2.92577e-007
	Radius          105.048
	InertiaMoment   0.398121

	RotationPeriod  496.077
	Obliquity       -40.3309
	EqAscendNode    70.9427

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.672 0.666 0.663)

	Surface
	{
		SurfStyle       0.819754
		OceanStyle      0.478876
		Randomize      (-0.280, 0.494, 0.892)
		colorDistMagn   0.983009
		colorDistFreq   6.49035
		detailScale     2868.5
		colorConversion true
		snowLevel       2
		tropicLatitude  0.821995
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.370079
		terraceProb     0.306482
		erosion         0
		montesMagn      0.495262
		montesFreq      2.82646
		montesSpiky     0.911108
		montesFraction  0.64856
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.6284
		hillsFraction   0.509897
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253265
		craterFreq      0.363133
		craterDensity   0.821077
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.454568
		volcanoTemp     1348.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.226, 0.186, 0.000)
		colorShelf     (0.269, 0.233, 0.212, 0.000)
		colorBeach     (0.316, 0.273, 0.252, 0.000)
		colorDesert    (0.343, 0.293, 0.245, 0.000)
		colorLowland   (0.377, 0.313, 0.279, 0.000)
		colorUpland    (0.417, 0.379, 0.338, 0.000)
		colorRock      (0.450, 0.413, 0.365, 0.000)
		colorSnow      (0.491, 0.439, 0.385, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00953819
		Period          3.25506
		Eccentricity    0.177162
		Inclination     -25.9436
		AscendingNode   65.814
		ArgOfPericenter -16.5133
		MeanAnomaly     -8.54174
	}
}

DwarfMoon	"Ahch-To System 6.D7"
{
	ParentBody     "Ahch-To System 6"
	Class	       "Asteroid"

	Mass            4.08076e-007
	Radius          108.653
	InertiaMoment   0.399222

	RotationPeriod  437.093
	Obliquity       55.061
	EqAscendNode    127.187

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.756 0.667 0.549)

	Surface
	{
		SurfStyle       0.945756
		OceanStyle      0.521452
		Randomize      (0.274, 0.886, -0.664)
		colorDistMagn   0.345206
		colorDistFreq   9.65323
		detailScale     2966.95
		colorConversion true
		snowLevel       2
		tropicLatitude  0.722854
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.483349
		terraceProb     0.201224
		erosion         0
		montesMagn      0.515993
		montesFreq      2.71492
		montesSpiky     0.991533
		montesFraction  0.625824
		dunesFraction   0
		hillsMagn       0
		hillsFreq       29.9241
		hillsFraction   0.605539
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242475
		craterFreq      0.39586
		craterDensity   0.955849
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.572773
		volcanoTemp     1471.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.257, 0.234, 0.219, 0.050)
		colorShelf     (0.302, 0.274, 0.252, 0.040)
		colorBeach     (0.348, 0.314, 0.285, 0.030)
		colorDesert    (0.393, 0.354, 0.324, 0.020)
		colorLowland   (0.439, 0.394, 0.357, 0.030)
		colorUpland    (0.484, 0.434, 0.389, 0.050)
		colorRock      (0.529, 0.474, 0.433, 0.020)
		colorSnow      (0.529, 0.474, 0.433, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00976678
		Period          3.37277
		Eccentricity    0.470857
		Inclination     15.8515
		AscendingNode   128.724
		ArgOfPericenter -25.3047
		MeanAnomaly     -96.2669
	}
}

DwarfMoon	"Ahch-To System 6.D8"
{
	ParentBody     "Ahch-To System 6"
	Class	       "Asteroid"

	Mass            5.74188e-007
	Radius          116.657
	InertiaMoment   0.396035

	RotationPeriod  395.668
	Obliquity       45.4782
	EqAscendNode    -70.8326

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.555 0.446 0.338)

	Surface
	{
		SurfStyle       0.330932
		OceanStyle      0.826003
		Randomize      (-0.649, 0.316, -0.607)
		colorDistMagn   0.792785
		colorDistFreq   8.43845
		detailScale     3185.5
		colorConversion true
		snowLevel       2
		tropicLatitude  0.698571
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.481391
		terraceProb     0.518325
		erosion         0
		montesMagn      0.557253
		montesFreq      2.73554
		montesSpiky     0.895443
		montesFraction  0.526097
		dunesFraction   0
		hillsMagn       0
		hillsFreq       31.1418
		hillsFraction   0.500451
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217409
		craterFreq      0.556991
		craterDensity   0.839138
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.595657
		volcanoTemp     1777.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.222, 0.178, 0.135, 0.000)
		colorShelf     (0.236, 0.189, 0.144, 0.000)
		colorBeach     (0.250, 0.200, 0.152, 0.000)
		colorDesert    (0.264, 0.212, 0.161, 0.000)
		colorLowland   (0.277, 0.223, 0.169, 0.000)
		colorUpland    (0.291, 0.234, 0.177, 0.000)
		colorRock      (0.305, 0.245, 0.186, 0.000)
		colorSnow      (0.319, 0.256, 0.194, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0102725
		Period          3.6381
		Eccentricity    0.283471
		Inclination     -7.75538
		AscendingNode   -77.531
		ArgOfPericenter -149.089
		MeanAnomaly     166.406
	}
}

DwarfMoon	"Ahch-To System 6.D9"
{
	ParentBody     "Ahch-To System 6"
	Class	       "Asteroid"

	Mass            8.16469e-007
	Radius          125.749
	InertiaMoment   0.398307

	RotationPeriod  359.667
	Obliquity       105.872
	EqAscendNode    -124.83

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.729 0.725 0.721)

	Surface
	{
		SurfStyle       0.747558
		OceanStyle      0.424187
		Randomize      (0.169, -0.350, -0.495)
		colorDistMagn   0.749139
		colorDistFreq   11.9127
		detailScale     3433.8
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996347
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.540717
		terraceProb     0.383577
		erosion         0
		montesMagn      0.546018
		montesFreq      2.88297
		montesSpiky     0.87169
		montesFraction  0.23394
		dunesFraction   0
		hillsMagn       0
		hillsFreq       30.4701
		hillsFraction   0.377313
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232857
		craterFreq      0.448377
		craterDensity   0.943705
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.434065
		volcanoTemp     1265.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.246, 0.202, 0.000)
		colorShelf     (0.292, 0.254, 0.231, 0.000)
		colorBeach     (0.343, 0.297, 0.274, 0.000)
		colorDesert    (0.372, 0.319, 0.267, 0.000)
		colorLowland   (0.408, 0.341, 0.303, 0.000)
		colorUpland    (0.452, 0.413, 0.368, 0.000)
		colorRock      (0.489, 0.449, 0.397, 0.000)
		colorSnow      (0.532, 0.478, 0.418, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0104842
		Period          3.75108
		Eccentricity    0.0817252
		Inclination     38.6438
		AscendingNode   -119.854
		ArgOfPericenter 175.031
		MeanAnomaly     -4.50393
	}
}

DwarfMoon	"Ahch-To System 6.D10"
{
	ParentBody     "Ahch-To System 6"
	Class	       "Asteroid"

	Mass            1.17571e-006
	Radius          171.569
	InertiaMoment   0.399356

	RotationPeriod  408.782
	Obliquity       -124.487
	EqAscendNode    -57.7311

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.577 0.464 0.363)

	Surface
	{
		SurfStyle       0.416851
		OceanStyle      0.572257
		Randomize      (0.056, 0.089, -0.813)
		colorDistMagn   0.510125
		colorDistFreq   17.7273
		detailScale     4684.98
		colorConversion true
		snowLevel       2
		tropicLatitude  0.899335
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.388614
		terraceProb     0.197921
		erosion         0
		montesMagn      0.531092
		montesFreq      2.49618
		montesSpiky     0.815879
		montesFraction  0.945768
		dunesFraction   0
		hillsMagn       0
		hillsFreq       59.4536
		hillsFraction   0.644857
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.198441
		craterFreq      1.10142
		craterDensity   0.764655
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.560634
		volcanoTemp     1405.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.185, 0.145, 0.000)
		colorShelf     (0.245, 0.197, 0.154, 0.000)
		colorBeach     (0.260, 0.209, 0.163, 0.000)
		colorDesert    (0.274, 0.220, 0.172, 0.000)
		colorLowland   (0.288, 0.232, 0.182, 0.000)
		colorUpland    (0.303, 0.243, 0.191, 0.000)
		colorRock      (0.317, 0.255, 0.200, 0.000)
		colorSnow      (0.332, 0.267, 0.209, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0109184
		Period          3.98648
		Eccentricity    0.32993
		Inclination     -86.0878
		AscendingNode   -61.0036
		ArgOfPericenter 127.629
		MeanAnomaly     24.6321
	}
}

DwarfMoon	"Ahch-To System 6.D11"
{
	ParentBody     "Ahch-To System 6"
	Class	       "Asteroid"

	Mass            1.71882e-006
	Radius          176.75
	InertiaMoment   0.396683

	RotationPeriod  348.605
	Obliquity       -80.2748
	EqAscendNode    -130.449

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.586 0.581 0.574)

	Surface
	{
		SurfStyle       0.6446
		OceanStyle      0.688979
		Randomize      (-0.254, -0.287, 0.691)
		colorDistMagn   0.910068
		colorDistFreq   3.57843
		detailScale     4826.44
		colorConversion true
		snowLevel       2
		tropicLatitude  0.945731
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.505612
		terraceProb     0.340456
		erosion         0
		montesMagn      0.526184
		montesFreq      2.38223
		montesSpiky     0.821756
		montesFraction  0.368907
		dunesFraction   0
		hillsMagn       0
		hillsFreq       48.1246
		hillsFraction   0.493754
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240679
		craterFreq      1.2287
		craterDensity   0.99815
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452005
		volcanoTemp     1329.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.198, 0.161, 0.000)
		colorShelf     (0.234, 0.204, 0.184, 0.000)
		colorBeach     (0.275, 0.238, 0.218, 0.000)
		colorDesert    (0.299, 0.256, 0.212, 0.000)
		colorLowland   (0.328, 0.273, 0.241, 0.000)
		colorUpland    (0.363, 0.331, 0.293, 0.000)
		colorRock      (0.392, 0.361, 0.316, 0.000)
		colorSnow      (0.428, 0.384, 0.333, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0113227
		Period          4.20993
		Eccentricity    0.412837
		Inclination     -15.8916
		AscendingNode   -127.017
		ArgOfPericenter 72.6608
		MeanAnomaly     148.569
	}
}

DwarfMoon	"Ahch-To System 6.D12"
{
	ParentBody     "Ahch-To System 6"
	Class	       "Asteroid"

	Mass            2.5591e-006
	Radius          193.063
	InertiaMoment   0.39848

	RotationPeriod  313.531
	Obliquity       -60.3277
	EqAscendNode    -167.304

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.490 0.483 0.477)

	Surface
	{
		SurfStyle       0.252674
		OceanStyle      0.026526
		Randomize      (0.819, -0.776, 0.255)
		colorDistMagn   0.482869
		colorDistFreq   20.436
		detailScale     5271.9
		colorConversion true
		snowLevel       2
		tropicLatitude  0.213379
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.442926
		terraceProb     0.168767
		erosion         0
		montesMagn      0.375427
		montesFreq      2.3897
		montesSpiky     0.940909
		montesFraction  0.515036
		dunesFraction   0
		hillsMagn       0
		hillsFreq       88.5422
		hillsFraction   0.440678
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220037
		craterFreq      1.49628
		craterDensity   0.890697
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518258
		volcanoTemp     1537.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.193, 0.191, 0.000)
		colorShelf     (0.208, 0.205, 0.203, 0.000)
		colorBeach     (0.221, 0.217, 0.215, 0.000)
		colorDesert    (0.233, 0.229, 0.227, 0.000)
		colorLowland   (0.245, 0.241, 0.239, 0.000)
		colorUpland    (0.257, 0.253, 0.251, 0.000)
		colorRock      (0.270, 0.266, 0.262, 0.000)
		colorSnow      (0.282, 0.278, 0.274, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0116233
		Period          4.3786
		Eccentricity    0.0897391
		Inclination     -49.816
		AscendingNode   -172.132
		ArgOfPericenter -174.333
		MeanAnomaly     -0.79887
	}
}

Moon	"Ahch-To System 6.7"
{
	ParentBody     "Ahch-To System 6"
	Class	       "IceWorld"

	Mass            3.89574e-006
	Radius          213.141
	InertiaMoment   0.399486

	RotationPeriod  281.458
	Obliquity       -53.7501
	EqAscendNode    -18.1008

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.627 0.459 0.336)

	Surface
	{
		SurfStyle       0.839964
		OceanStyle      0.786555
		Randomize      (-0.743, 0.467, 0.302)
		colorDistMagn   0.051089
		colorDistFreq   22.6849
		detailScale     548.21
		colorConversion true
		drivenDarkening 0
		seaLevel        0.288306
		snowLevel       2
		tropicLatitude  0.950132
		icecapLatitude  1
		icecapHeight    0.288306
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.75064
		venusFreq       1.04516
		venusMagn       0
		mareFreq        0
		mareDensity     2.1659e-006
		terraceProb     0.118215
		erosion         0
		montesMagn      0.0737528
		montesFreq      6.98583
		montesSpiky     0.999872
		montesFraction  0.719126
		dunesMagn       0.0353982
		dunesFreq       278.43
		dunesFraction   0.982471
		hillsMagn       0.118337
		hillsFreq       26.1781
		hillsFraction   0.590051
		hills2Fraction  0.0256071
		riversMagn      60.1039
		riversFreq      3.18294
		riversSin       7.02158
		riversOctaves   0
		canyonsMagn     0.563429
		canyonsFreq     0.0883018
		canyonFraction  0
		cracksMagn      0.0423976
		cracksFreq      0.079947
		cracksOctaves   0
		craterMagn      1.19434
		craterFreq      0.634136
		craterDensity   0.936278
		craterOctaves   8
		craterRayedFactor 0
		volcanoMagn     0.192289
		volcanoFreq     0.745232
		volcanoDensity  0.20996
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.279603
		volcanoRadius   0.108174
		volcanoTemp     1175.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.627, 0.344, 0.193, 0.000)
		colorShelf     (0.595, 0.327, 0.183, 0.000)
		colorBeach     (0.313, 0.172, 0.096, 0.000)
		colorDesert    (0.533, 0.293, 0.164, 0.000)
		colorLowland   (0.508, 0.303, 0.183, 0.000)
		colorUpland    (0.583, 0.320, 0.179, 0.000)
		colorRock      (1.000, 1.000, 1.000, 0.500)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.508, 0.303, 0.183, 0.000)
		colorUpPlants  (0.583, 0.320, 0.179, 0.000)
		BumpHeight      10.657
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0118459
		Period          4.5049
		Eccentricity    0.479824
		Inclination     -57.2136
		AscendingNode   -21.2107
		ArgOfPericenter -175.526
		MeanAnomaly     -105.918
	}
}

Planet	"Ahch-To System 7"
{
	ParentBody     "Ahch-To System"
	Class	       "IceWorld"

	Mass            0.137583
	Radius          4393.61
	InertiaMoment   0.329837

	Oblateness      0.00560791

	RotationPeriod  28.445
	Obliquity       -3.87191
	EqAscendNode    -84.7458

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.754 0.698 0.612)

	Surface
	{
		SurfStyle       0.154651
		OceanStyle      0.466834
		Randomize      (0.395, -0.107, 0.858)
		colorDistMagn   0.0560677
		colorDistFreq   557.419
		detailScale     11300.6
		colorConversion true
		drivenDarkening 0
		seaLevel        0.139193
		snowLevel       2
		tropicLatitude  0.287959
		icecapLatitude  0.967408
		icecapHeight    0.139839
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.63995
		venusFreq       0.534305
		venusMagn       0.188298
		mareFreq        1.89119
		mareDensity     0.00973526
		terraceProb     0.259181
		erosion         0
		montesMagn      0.168957
		montesFreq      240.976
		montesSpiky     0.974767
		montesFraction  0.696669
		dunesMagn       0.0424319
		dunesFreq       5637.17
		dunesFraction   0.800458
		hillsMagn       0.108175
		hillsFreq       494.434
		hillsFraction   0.853285
		hills2Fraction  0.0510939
		riversMagn      62.9679
		riversFreq      3.08561
		riversSin       6.5535
		riversOctaves   0
		canyonsMagn     0.601972
		canyonsFreq     1.52552
		canyonFraction  0
		cracksMagn      0.0738306
		cracksFreq      1.43568
		cracksOctaves   3
		craterMagn      0.599205
		craterFreq      10.8658
		craterDensity   0.856288
		craterOctaves   13
		craterRayedFactor 0.244887
		volcanoMagn     0.602849
		volcanoFreq     0.744368
		volcanoDensity  0.197146
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.115255
		volcanoRadius   0.487228
		volcanoTemp     1530.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.754, 0.698, 0.612, 0.500)
		colorShelf     (0.716, 0.663, 0.581, 0.500)
		colorBeach     (0.528, 0.489, 0.428, 0.750)
		colorDesert    (0.641, 0.593, 0.520, 1.000)
		colorLowland   (0.663, 0.614, 0.538, 1.000)
		colorUpland    (0.701, 0.649, 0.569, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.663, 0.614, 0.538, 1.000)
		colorUpPlants  (0.701, 0.649, 0.569, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999775
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          70.7339
		Density         2.25337e-005
		Pressure        3.16483e-006
		Greenhouse      0.0195361
		Bright          1.86452
		Opacity         0
		SkyLight        0.621506
		Hue             -0.0439778
		Saturation      1

		Composition
		{
			N2    	99.8549
			Ar    	0.0775436
			Ne    	0.0617643
			CO    	0.00474115
			O2    	0.00107671
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   33.6307
		Period          156.721
		Eccentricity    0.0561344
		Inclination     -15.4382
		AscendingNode   -76.8959
		ArgOfPericenter 190.733
		MeanAnomaly     51.4941
	}
}

DwarfMoon	"Ahch-To System 7.D1"
{
	ParentBody     "Ahch-To System 7"
	Class	       "Asteroid"

	Mass            7.81574e-010
	Radius          12.2061
	InertiaMoment   0.398908

	Oblateness      0.249

	Obliquity       0.00718445
	EqAscendNode    52.2795
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.558 0.552 0.547)

	Surface
	{
		SurfStyle       0.881656
		OceanStyle      0.795145
		Randomize      (-0.873, 0.717, 0.580)
		colorDistMagn   0.625802
		colorDistFreq   0.122741
		detailScale     333.307
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.52728
		terraceProb     0.165902
		erosion         0
		montesMagn      0.364853
		montesFreq      3.63988
		montesSpiky     0.900054
		montesFraction  0.571316
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.21899
		hillsFraction   0.659299
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246683
		craterFreq      0.230434
		craterDensity   1.01407
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.434615
		volcanoTemp     1308.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.190, 0.193, 0.219, 0.050)
		colorShelf     (0.223, 0.226, 0.252, 0.040)
		colorBeach     (0.257, 0.260, 0.284, 0.030)
		colorDesert    (0.290, 0.293, 0.323, 0.020)
		colorLowland   (0.324, 0.326, 0.355, 0.030)
		colorUpland    (0.357, 0.359, 0.388, 0.050)
		colorRock      (0.391, 0.392, 0.432, 0.020)
		colorSnow      (0.391, 0.392, 0.432, 1.000)
		BumpHeight      10.9855
		BumpOffset      2.19709
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.26008e-005
		Period          0.000772266
		Eccentricity    7.02528e-005
		Inclination     0.00718445
		AscendingNode   52.2795
		ArgOfPericenter 30.3798
		MeanAnomaly     9.87695
	}
}

DwarfMoon	"Ahch-To System 7.D2"
{
	ParentBody     "Ahch-To System 7"
	Class	       "Asteroid"

	Mass            1.12905e-009
	Radius          16.1965
	InertiaMoment   0.399837

	Oblateness      0.249

	Obliquity       -0.0071766
	EqAscendNode    -160.668
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.674 0.672 0.669)

	Surface
	{
		SurfStyle       0.91293
		OceanStyle      0.574784
		Randomize      (0.976, -0.586, -0.957)
		colorDistMagn   0.0076105
		colorDistFreq   0.14009
		detailScale     442.273
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.746314
		terraceProb     0.372587
		erosion         0
		montesMagn      0.678651
		montesFreq      3.29921
		montesSpiky     0.95447
		montesFraction  0.551786
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.707761
		hillsFraction   0.700496
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252367
		craterFreq      0.232898
		craterDensity   0.963735
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467183
		volcanoTemp     1396.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.235, 0.268, 0.050)
		colorShelf     (0.270, 0.276, 0.308, 0.040)
		colorBeach     (0.310, 0.316, 0.348, 0.030)
		colorDesert    (0.351, 0.356, 0.395, 0.020)
		colorLowland   (0.391, 0.397, 0.435, 0.030)
		colorUpland    (0.432, 0.437, 0.475, 0.050)
		colorRock      (0.472, 0.477, 0.529, 0.020)
		colorSnow      (0.472, 0.477, 0.529, 1.000)
		BumpHeight      14.5769
		BumpOffset      2.91537
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.9224e-005
		Period          0.000898011
		Eccentricity    8.97971e-005
		Inclination     -0.0071766
		AscendingNode   -160.668
		ArgOfPericenter 122.162
		MeanAnomaly     -70.8167
	}
}

DwarfMoon	"Ahch-To System 7.D3"
{
	ParentBody     "Ahch-To System 7"
	Class	       "Asteroid"

	Mass            1.60974e-009
	Radius          17.0573
	InertiaMoment   0.397862

	Oblateness      0.249

	Obliquity       0.010079
	EqAscendNode    167.418
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.759 0.754 0.752)

	Surface
	{
		SurfStyle       0.233159
		OceanStyle      0.335736
		Randomize      (-0.091, 0.141, 0.226)
		colorDistMagn   0.075464
		colorDistFreq   0.14486
		detailScale     465.777
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.367319
		terraceProb     0.123172
		erosion         0
		montesMagn      0.432659
		montesFreq      2.95176
		montesSpiky     0.881658
		montesFraction  0.360522
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.655552
		hillsFraction   0.634215
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236076
		craterFreq      0.204482
		craterDensity   0.863424
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47047
		volcanoTemp     1634.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.304, 0.302, 0.301, 0.000)
		colorShelf     (0.322, 0.321, 0.320, 0.000)
		colorBeach     (0.341, 0.339, 0.338, 0.000)
		colorDesert    (0.360, 0.358, 0.357, 0.000)
		colorLowland   (0.379, 0.377, 0.376, 0.000)
		colorUpland    (0.398, 0.396, 0.395, 0.000)
		colorRock      (0.417, 0.415, 0.414, 0.000)
		colorSnow      (0.436, 0.434, 0.432, 1.000)
		BumpHeight      15.3515
		BumpOffset      3.07031
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.01906e-005
		Period          0.00111965
		Eccentricity    9.27842e-005
		Inclination     0.010079
		AscendingNode   167.418
		ArgOfPericenter 94.6979
		MeanAnomaly     83.1333
	}
}

DwarfMoon	"Ahch-To System 7.D4"
{
	ParentBody     "Ahch-To System 7"
	Class	       "Asteroid"

	Mass            2.27003e-009
	Radius          18.3482
	InertiaMoment   0.399051

	Oblateness      0.205969

	Obliquity       -0.0044736
	EqAscendNode    -140.02
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.518 0.356 0.292)

	Surface
	{
		SurfStyle       0.790061
		OceanStyle      0.655083
		Randomize      (-0.080, 0.092, 0.443)
		colorDistMagn   0.843051
		colorDistFreq   0.185261
		detailScale     501.028
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.613113
		terraceProb     0.373592
		erosion         0
		montesMagn      0.698807
		montesFreq      2.55253
		montesSpiky     0.87429
		montesFraction  0.275049
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.637272
		hillsFraction   0.735122
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214976
		craterFreq      0.16447
		craterDensity   1.08665
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529955
		volcanoTemp     1469.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.121, 0.082, 0.000)
		colorShelf     (0.207, 0.125, 0.093, 0.000)
		colorBeach     (0.244, 0.146, 0.111, 0.000)
		colorDesert    (0.264, 0.157, 0.108, 0.000)
		colorLowland   (0.290, 0.168, 0.122, 0.000)
		colorUpland    (0.321, 0.203, 0.149, 0.000)
		colorRock      (0.347, 0.221, 0.160, 0.000)
		colorSnow      (0.378, 0.235, 0.169, 1.000)
		BumpHeight      16.5134
		BumpOffset      3.30268
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   8.76407e-005
		Period          0.00127925
		Eccentricity    2.3147e-006
		Inclination     -0.0044736
		AscendingNode   -140.02
		ArgOfPericenter -152.712
		MeanAnomaly     -45.8781
	}
}

Moon	"Ahch-To System 7.1"
{
	ParentBody     "Ahch-To System 7"
	Class	       "IceWorld"

	Mass            0.000272821
	Radius          537.961
	InertiaMoment   0.396219

	Oblateness      0.0130406

	Obliquity       -0.913014
	EqAscendNode    -67.054
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.705 0.482 0.406)

	Surface
	{
		SurfStyle       0.0724122
		OceanStyle      0.188993
		Randomize      (0.619, 0.947, 0.600)
		colorDistMagn   0.0467531
		colorDistFreq   72.2748
		detailScale     1383.67
		colorConversion true
		drivenDarkening 0
		seaLevel        0.225738
		snowLevel       2
		tropicLatitude  0.0265653
		icecapLatitude  0.825968
		icecapHeight    0.239323
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.71457
		venusFreq       1.33316
		venusMagn       0.217502
		mareFreq        0
		mareDensity     0.000205394
		terraceProb     0.600542
		erosion         0
		montesMagn      0.0769834
		montesFreq      24.6933
		montesSpiky     0.967496
		montesFraction  0.4025
		dunesMagn       0.0302106
		dunesFreq       692.974
		dunesFraction   0.149801
		hillsMagn       0.105112
		hillsFreq       69.5231
		hillsFraction   0.25526
		hills2Fraction  0.282318
		riversMagn      60.9228
		riversFreq      4.03363
		riversSin       6.97954
		riversOctaves   0
		canyonsMagn     0.578096
		canyonsFreq     0.218474
		canyonFraction  0
		cracksMagn      0.0266874
		cracksFreq      0.309457
		cracksOctaves   0
		craterMagn      0.581908
		craterFreq      1.37192
		craterDensity   0.855513
		craterOctaves   9
		craterRayedFactor 0.177457
		volcanoMagn     0.194822
		volcanoFreq     0.845382
		volcanoDensity  0.286831
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.194526
		volcanoRadius   0.144995
		volcanoTemp     1477.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.705, 0.482, 0.406, 0.500)
		colorShelf     (0.670, 0.458, 0.386, 0.500)
		colorBeach     (0.494, 0.337, 0.284, 0.750)
		colorDesert    (0.599, 0.410, 0.345, 1.000)
		colorLowland   (0.621, 0.424, 0.357, 1.000)
		colorUpland    (0.656, 0.448, 0.378, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.621, 0.424, 0.357, 1.000)
		colorUpPlants  (0.656, 0.448, 0.378, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000130266
		Period          0.00231587
		Eccentricity    0.00673409
		Inclination     -0.913014
		AscendingNode   -67.054
		ArgOfPericenter -52.7212
		MeanAnomaly     -62.536
	}
}

Moon	"Ahch-To System 7.2"
{
	ParentBody     "Ahch-To System 7"
	Class	       "IceWorld"

	Mass            0.000320495
	Radius          602.905
	InertiaMoment   0.399688

	Oblateness      0.00170143

	Obliquity       -1.19913
	EqAscendNode    6.11296
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.552 0.377 0.285)

	Surface
	{
		SurfStyle       0.349779
		OceanStyle      0.799403
		Randomize      (0.215, -0.718, -0.979)
		colorDistMagn   0.0561523
		colorDistFreq   70.7143
		detailScale     1550.71
		colorConversion true
		drivenDarkening 0
		seaLevel        0.162064
		snowLevel       2
		tropicLatitude  0.0417853
		icecapLatitude  0.707021
		icecapHeight    0.188605
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.05389
		venusFreq       0.483841
		venusMagn       0
		mareFreq        0.00225661
		mareDensity     0.000187139
		terraceProb     0.595287
		erosion         0
		montesMagn      0.0730149
		montesFreq      28.5841
		montesSpiky     0.985446
		montesFraction  0.958738
		dunesMagn       0.0565425
		dunesFreq       788.37
		dunesFraction   0.337552
		hillsMagn       0.126874
		hillsFreq       73.1696
		hillsFraction   0.395331
		hills2Fraction  0.230437
		riversMagn      54.3616
		riversFreq      1.94873
		riversSin       5.68187
		riversOctaves   0
		canyonsMagn     0.606818
		canyonsFreq     0.166465
		canyonFraction  0
		cracksMagn      0.0201573
		cracksFreq      0.315422
		cracksOctaves   0
		craterMagn      0.645052
		craterFreq      1.88171
		craterDensity   0.819571
		craterOctaves   9
		craterRayedFactor 0.129844
		volcanoMagn     0.191685
		volcanoFreq     0.660384
		volcanoDensity  0.169156
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.223132
		volcanoRadius   0.142307
		volcanoTemp     1370.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.552, 0.377, 0.285, 0.500)
		colorShelf     (0.524, 0.358, 0.271, 0.500)
		colorBeach     (0.386, 0.264, 0.199, 0.750)
		colorDesert    (0.469, 0.321, 0.242, 1.000)
		colorLowland   (0.485, 0.332, 0.251, 1.000)
		colorUpland    (0.513, 0.351, 0.265, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.485, 0.332, 0.251, 1.000)
		colorUpPlants  (0.513, 0.351, 0.265, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000274017
		Period          0.00706411
		Eccentricity    0.030312
		Inclination     -1.19913
		AscendingNode   6.11296
		ArgOfPericenter 55.233
		MeanAnomaly     -147.744
	}
}

Moon	"Ahch-To System 7.3"
{
	ParentBody     "Ahch-To System 7"
	Class	       "IceWorld"

	Mass            0.000374812
	Radius          597.767
	InertiaMoment   0.399212

	Obliquity       0.120678
	EqAscendNode    -171.867
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.760 0.759 0.757)

	Surface
	{
		SurfStyle       0.539194
		OceanStyle      0.0695452
		Randomize      (0.392, -0.264, -0.951)
		colorDistMagn   0.0510331
		colorDistFreq   78.6071
		detailScale     1537.49
		colorConversion true
		drivenDarkening 0
		seaLevel        0.201603
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  0.674351
		icecapHeight    0.232916
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.85351
		venusFreq       0.390543
		venusMagn       0
		mareFreq        0
		mareDensity     0.000243835
		terraceProb     0.412407
		erosion         0
		montesMagn      0.0690004
		montesFreq      25.5856
		montesSpiky     0.903608
		montesFraction  0.395199
		dunesMagn       0.0546217
		dunesFreq       782.144
		dunesFraction   0.567695
		hillsMagn       0.119633
		hillsFreq       70.4437
		hillsFraction   0.692345
		hills2Fraction  0.0221422
		riversMagn      60.111
		riversFreq      2.88461
		riversSin       5.8918
		riversOctaves   0
		canyonsMagn     0.381273
		canyonsFreq     0.207661
		canyonFraction  0
		cracksMagn      0.0473111
		cracksFreq      0.405377
		cracksOctaves   0
		craterMagn      0.691247
		craterFreq      1.57911
		craterDensity   0.848535
		craterOctaves   9
		craterRayedFactor 0.150975
		volcanoMagn     0.171965
		volcanoFreq     0.757389
		volcanoDensity  0.175965
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.375648
		volcanoRadius   0.162242
		volcanoTemp     1523.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.190, 0.167, 0.000)
		colorShelf     (0.281, 0.235, 0.212, 0.000)
		colorBeach     (0.426, 0.357, 0.318, 0.200)
		colorDesert    (0.388, 0.334, 0.280, 0.500)
		colorLowland   (0.297, 0.258, 0.212, 0.800)
		colorUpland    (0.502, 0.456, 0.394, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.297, 0.258, 0.212, 0.800)
		colorUpPlants  (0.502, 0.456, 0.394, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00039742
		Period          0.0123362
		Eccentricity    0.0371384
		Inclination     0.120678
		AscendingNode   -171.867
		ArgOfPericenter -117.422
		MeanAnomaly     -142.489
	}
}

Moon	"Ahch-To System 7.4"
{
	ParentBody     "Ahch-To System 7"
	Class	       "IceWorld"

	Mass            0.000436776
	Radius          668.135
	InertiaMoment   0.398686

	Obliquity       -0.53755
	EqAscendNode    -60.703
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.762 0.670 0.637)

	Surface
	{
		SurfStyle       0.230761
		OceanStyle      0.444198
		Randomize      (-0.917, -0.190, 0.873)
		colorDistMagn   0.0429676
		colorDistFreq   90.0758
		detailScale     1718.48
		colorConversion true
		drivenDarkening 0
		seaLevel        0.164134
		snowLevel       2
		tropicLatitude  0.0161902
		icecapLatitude  0.525945
		icecapHeight    0.182246
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.9302
		venusFreq       0.415841
		venusMagn       0
		mareFreq        0.0540999
		mareDensity     0.000271407
		terraceProb     0.288268
		erosion         0
		montesMagn      0.0778935
		montesFreq      37.4772
		montesSpiky     0.959427
		montesFraction  0.301315
		dunesMagn       0.0309219
		dunesFreq       883.188
		dunesFraction   0.745032
		hillsMagn       0.129583
		hillsFreq       77.9329
		hillsFraction   0.0571451
		hills2Fraction  0.188627
		riversMagn      65.6878
		riversFreq      3.98726
		riversSin       6.14952
		riversOctaves   0
		canyonsMagn     0.41502
		canyonsFreq     0.267287
		canyonFraction  0
		cracksMagn      0.0386787
		cracksFreq      0.397126
		cracksOctaves   0
		craterMagn      0.691805
		craterFreq      2.26189
		craterDensity   0.933085
		craterOctaves   9
		craterRayedFactor 0.0906345
		volcanoMagn     0.169137
		volcanoFreq     0.829208
		volcanoDensity  0.24665
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.164752
		volcanoRadius   0.147473
		volcanoTemp     1578.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.762, 0.670, 0.637, 0.500)
		colorShelf     (0.724, 0.637, 0.605, 0.500)
		colorBeach     (0.534, 0.469, 0.446, 0.750)
		colorDesert    (0.648, 0.570, 0.541, 1.000)
		colorLowland   (0.671, 0.590, 0.560, 1.000)
		colorUpland    (0.709, 0.623, 0.592, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.671, 0.590, 0.560, 1.000)
		colorUpPlants  (0.709, 0.623, 0.592, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000576398
		Period          0.0215423
		Eccentricity    0.0464851
		Inclination     -0.53755
		AscendingNode   -60.703
		ArgOfPericenter -123.189
		MeanAnomaly     24.8385
	}
}

Moon	"Ahch-To System 7.5"
{
	ParentBody     "Ahch-To System 7"
	Class	       "IceWorld"

	Mass            0.000507585
	Radius          661.023
	InertiaMoment   0.398047

	Obliquity       0.339614
	EqAscendNode    -94.6018
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.478 0.423 0.364)

	Surface
	{
		SurfStyle       0.0468092
		OceanStyle      0.287085
		Randomize      (0.405, 0.367, -0.621)
		colorDistMagn   0.0572185
		colorDistFreq   74.1906
		detailScale     1700.19
		colorConversion true
		drivenDarkening 0
		seaLevel        0.158751
		snowLevel       2
		tropicLatitude  0.00803806
		icecapLatitude  0.502649
		icecapHeight    0.166613
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.76085
		venusFreq       0.533577
		venusMagn       0
		mareFreq        0.046376
		mareDensity     0.000314495
		terraceProb     0.167168
		erosion         0
		montesMagn      0.0450339
		montesFreq      39.5356
		montesSpiky     0.885052
		montesFraction  0.568276
		dunesMagn       0.0274113
		dunesFreq       852.783
		dunesFraction   0.197214
		hillsMagn       0.137952
		hillsFreq       75.0163
		hillsFraction   0.397645
		hills2Fraction  0.19966
		riversMagn      62.9081
		riversFreq      3.43719
		riversSin       5.8014
		riversOctaves   0
		canyonsMagn     0.536186
		canyonsFreq     0.221492
		canyonFraction  0
		cracksMagn      0.0634457
		cracksFreq      0.415909
		cracksOctaves   0
		craterMagn      0.583753
		craterFreq      2.34553
		craterDensity   0.904527
		craterOctaves   9
		craterRayedFactor 0.117729
		volcanoMagn     0.188083
		volcanoFreq     0.674249
		volcanoDensity  0.217566
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.152068
		volcanoRadius   0.148362
		volcanoTemp     1662.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.478, 0.423, 0.364, 0.500)
		colorShelf     (0.454, 0.402, 0.345, 0.500)
		colorBeach     (0.335, 0.296, 0.254, 0.750)
		colorDesert    (0.406, 0.359, 0.309, 1.000)
		colorLowland   (0.421, 0.372, 0.320, 1.000)
		colorUpland    (0.445, 0.393, 0.338, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.421, 0.372, 0.320, 1.000)
		colorUpPlants  (0.445, 0.393, 0.338, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000835977
		Period          0.0376174
		Eccentricity    0.0170903
		Inclination     0.339614
		AscendingNode   -94.6018
		ArgOfPericenter -99.5416
		MeanAnomaly     -82.8354
	}
}

Moon	"Ahch-To System 7.6"
{
	ParentBody     "Ahch-To System 7"
	Class	       "IceWorld"

	Mass            0.000588674
	Radius          737.66
	InertiaMoment   0.397094

	Obliquity       -0.673249
	EqAscendNode    49.8498
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.640 0.457 0.333)

	Surface
	{
		SurfStyle       0.704395
		OceanStyle      0.693375
		Randomize      (0.279, 0.756, 0.774)
		colorDistMagn   0.0682833
		colorDistFreq   83.2333
		detailScale     1897.3
		colorConversion true
		drivenDarkening 0
		seaLevel        0.267159
		snowLevel       2
		tropicLatitude  0.0213105
		icecapLatitude  0.4476
		icecapHeight    0.299334
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.99634
		venusFreq       0.816408
		venusMagn       0
		mareFreq        0.118585
		mareDensity     0.000323708
		terraceProb     0.108719
		erosion         0
		montesMagn      0.0665704
		montesFreq      40.5249
		montesSpiky     0.862827
		montesFraction  0.70153
		dunesMagn       0.0374974
		dunesFreq       975.025
		dunesFraction   0.737245
		hillsMagn       0.119095
		hillsFreq       73.2716
		hillsFraction   0.431329
		hills2Fraction  0.132332
		riversMagn      70.7827
		riversFreq      2.43585
		riversSin       5.92577
		riversOctaves   0
		canyonsMagn     0.48582
		canyonsFreq     0.321707
		canyonFraction  0
		cracksMagn      0.0445289
		cracksFreq      0.184732
		cracksOctaves   0
		craterMagn      0.619488
		craterFreq      1.54077
		craterDensity   0.785939
		craterOctaves   10
		craterRayedFactor 0.100858
		volcanoMagn     0.210085
		volcanoFreq     0.605843
		volcanoDensity  0.225786
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.298774
		volcanoRadius   0.157407
		volcanoTemp     1828.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.409, 0.293, 0.223, 0.250)
		colorShelf     (0.448, 0.334, 0.253, 0.250)
		colorBeach     (0.365, 0.247, 0.193, 0.200)
		colorDesert    (0.339, 0.224, 0.170, 0.200)
		colorLowland   (0.250, 0.174, 0.140, 0.200)
		colorUpland    (0.473, 0.338, 0.253, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.250, 0.174, 0.140, 0.200)
		colorUpPlants  (0.473, 0.338, 0.253, 0.250)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00121246
		Period          0.0656856
		Eccentricity    0.0495689
		Inclination     -0.673249
		AscendingNode   49.8498
		ArgOfPericenter -103.533
		MeanAnomaly     -5.76089
	}
}

Moon	"Ahch-To System 7.7"
{
	ParentBody     "Ahch-To System 7"
	Class	       "IceWorld"

	Mass            0.000681776
	Radius          728.944
	InertiaMoment   0.399909

	Obliquity       0.452259
	EqAscendNode    88.123
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.846 0.769 0.691)

	Surface
	{
		SurfStyle       0.0778018
		OceanStyle      0.302183
		Randomize      (0.059, -0.064, -0.787)
		colorDistMagn   0.0620652
		colorDistFreq   111.442
		detailScale     1874.89
		colorConversion true
		drivenDarkening 0
		seaLevel        0.317242
		snowLevel       2
		tropicLatitude  0.0113464
		icecapLatitude  0.826936
		icecapHeight    0.32584
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.81944
		venusFreq       0.3998
		venusMagn       0
		mareFreq        0.0925435
		mareDensity     0.000422248
		terraceProb     0.128325
		erosion         0
		montesMagn      0.0656736
		montesFreq      41.7988
		montesSpiky     0.942609
		montesFraction  0.13328
		dunesMagn       0.0342581
		dunesFreq       964.423
		dunesFraction   0.72598
		hillsMagn       0.128631
		hillsFreq       90.0367
		hillsFraction   0.497749
		hills2Fraction  0.23981
		riversMagn      60.9696
		riversFreq      3.64994
		riversSin       5.64278
		riversOctaves   0
		canyonsMagn     0.608613
		canyonsFreq     0.311647
		canyonFraction  0
		cracksMagn      0.0715509
		cracksFreq      0.5075
		cracksOctaves   0
		craterMagn      0.594796
		craterFreq      1.81099
		craterDensity   0.810242
		craterOctaves   10
		craterRayedFactor 0.0500752
		volcanoMagn     0.166814
		volcanoFreq     0.666991
		volcanoDensity  0.191988
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.262382
		volcanoRadius   0.165045
		volcanoTemp     1497.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.846, 0.769, 0.691, 0.500)
		colorShelf     (0.804, 0.731, 0.656, 0.500)
		colorBeach     (0.592, 0.538, 0.484, 0.750)
		colorDesert    (0.719, 0.654, 0.587, 1.000)
		colorLowland   (0.745, 0.677, 0.608, 1.000)
		colorUpland    (0.787, 0.715, 0.643, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.745, 0.677, 0.608, 1.000)
		colorUpPlants  (0.787, 0.715, 0.643, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00175849
		Period          0.114692
		Eccentricity    0.0578033
		Inclination     0.452259
		AscendingNode   88.123
		ArgOfPericenter 139.197
		MeanAnomaly     -113.793
	}
}

Moon	"Ahch-To System 7.8"
{
	ParentBody     "Ahch-To System 7"
	Class	       "IceWorld"

	Mass            0.000789
	Radius          812.87
	InertiaMoment   0.399445

	Obliquity       -0.299869
	EqAscendNode    114.599
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.719 0.531 0.425)

	Surface
	{
		SurfStyle       0.261038
		OceanStyle      0.109068
		Randomize      (0.156, -0.395, -0.576)
		colorDistMagn   0.0502556
		colorDistFreq   119.785
		detailScale     2090.75
		colorConversion true
		drivenDarkening 0
		seaLevel        0.247712
		snowLevel       2
		tropicLatitude  0.00565224
		icecapLatitude  0.52955
		icecapHeight    0.279236
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.6751
		venusFreq       1.19921
		venusMagn       0
		mareFreq        0.164887
		mareDensity     0.000371957
		terraceProb     0.472517
		erosion         0
		montesMagn      0.0457698
		montesFreq      31.7327
		montesSpiky     0.933328
		montesFraction  0.534992
		dunesMagn       0.0407361
		dunesFreq       1070.38
		dunesFraction   0.134625
		hillsMagn       0.135918
		hillsFreq       98.2075
		hillsFraction   0.37103
		hills2Fraction  0.220084
		riversMagn      66.3708
		riversFreq      3.04265
		riversSin       4.03647
		riversOctaves   0
		canyonsMagn     0.57882
		canyonsFreq     0.250593
		canyonFraction  0
		cracksMagn      0.0578694
		cracksFreq      0.424693
		cracksOctaves   0
		craterMagn      0.65994
		craterFreq      1.61854
		craterDensity   0.952642
		craterOctaves   10
		craterRayedFactor 0.227918
		volcanoMagn     0.18566
		volcanoFreq     0.63271
		volcanoDensity  0.17853
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.218234
		volcanoRadius   0.147191
		volcanoTemp     1695.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.719, 0.531, 0.425, 0.500)
		colorShelf     (0.683, 0.504, 0.404, 0.500)
		colorBeach     (0.503, 0.371, 0.298, 0.750)
		colorDesert    (0.611, 0.451, 0.361, 1.000)
		colorLowland   (0.633, 0.467, 0.374, 1.000)
		colorUpland    (0.669, 0.493, 0.395, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.633, 0.467, 0.374, 1.000)
		colorUpPlants  (0.669, 0.493, 0.395, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00255042
		Period          0.20025
		Eccentricity    0.0474184
		Inclination     -0.299869
		AscendingNode   114.599
		ArgOfPericenter 78.6656
		MeanAnomaly     -138.743
	}
}

Moon	"Ahch-To System 7.9"
{
	ParentBody     "Ahch-To System 7"
	Class	       "IceWorld"

	Mass            0.000912929
	Radius          802.972
	InertiaMoment   0.398948

	RotationPeriod  100.964
	Obliquity       -11.3766
	EqAscendNode    -37.8176

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.834 0.745 0.686)

	Surface
	{
		SurfStyle       0.630341
		OceanStyle      0.278536
		Randomize      (-0.338, -0.679, -0.670)
		colorDistMagn   0.0813223
		colorDistFreq   100.096
		detailScale     2065.29
		colorConversion true
		drivenDarkening 0
		seaLevel        0.267515
		snowLevel       2
		tropicLatitude  0.200849
		icecapLatitude  0.601535
		icecapHeight    0.299664
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.51271
		venusFreq       1.0959
		venusMagn       0.239236
		mareFreq        0.145146
		mareDensity     0.000406013
		terraceProb     0.427051
		erosion         0
		montesMagn      0.0624094
		montesFreq      43.5789
		montesSpiky     0.935706
		montesFraction  0.129884
		dunesMagn       0.0315872
		dunesFreq       1061.23
		dunesFraction   0.60724
		hillsMagn       0.125935
		hillsFreq       83.5423
		hillsFraction   0.0723676
		hills2Fraction  0.284719
		riversMagn      62.598
		riversFreq      4.01024
		riversSin       5.33178
		riversOctaves   0
		canyonsMagn     0.691132
		canyonsFreq     0.3116
		canyonFraction  0
		cracksMagn      0.0477584
		cracksFreq      0.522422
		cracksOctaves   0
		craterMagn      0.632544
		craterFreq      2.24714
		craterDensity   0.902344
		craterOctaves   10
		craterRayedFactor 0.191201
		volcanoMagn     0.206667
		volcanoFreq     0.737941
		volcanoDensity  0.220143
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.150717
		volcanoRadius   0.139965
		volcanoTemp     1481.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.142, 0.076, 1.000)
		colorShelf     (0.284, 0.194, 0.110, 1.000)
		colorBeach     (0.459, 0.253, 0.117, 0.200)
		colorDesert    (0.501, 0.283, 0.137, 0.200)
		colorLowland   (0.542, 0.298, 0.144, 0.200)
		colorUpland    (0.584, 0.358, 0.172, 0.200)
		colorRock      (0.920, 0.870, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.542, 0.298, 0.144, 0.200)
		colorUpPlants  (0.584, 0.358, 0.172, 0.200)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00536484
		Period          0.610655
		Eccentricity    0.0494414
		Inclination     -0.258478
		AscendingNode   -36.0282
		ArgOfPericenter 5.89399
		MeanAnomaly     178.495
	}
}

DwarfMoon	"Ahch-To System 7.D5"
{
	ParentBody     "Ahch-To System 7"
	Class	       "Asteroid"

	Mass            5.25325e-008
	Radius          65.289
	InertiaMoment   0.397006

	RotationPeriod  733.693
	Obliquity       -29.4057
	EqAscendNode    -56.4393

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.682 0.679 0.677)

	Surface
	{
		SurfStyle       0.906672
		OceanStyle      0.956537
		Randomize      (-0.024, -0.373, 0.678)
		colorDistMagn   0.858211
		colorDistFreq   0.831107
		detailScale     1782.82
		colorConversion true
		snowLevel       2
		tropicLatitude  0.955331
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.561569
		terraceProb     0.453139
		erosion         0
		montesMagn      0.531987
		montesFreq      2.68563
		montesSpiky     0.906616
		montesFraction  0.688529
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.47088
		hillsFraction   0.645485
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255064
		craterFreq      0.192332
		craterDensity   0.85898
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524182
		volcanoTemp     1723.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.238, 0.271, 0.050)
		colorShelf     (0.273, 0.278, 0.312, 0.040)
		colorBeach     (0.314, 0.319, 0.352, 0.030)
		colorDesert    (0.355, 0.360, 0.400, 0.020)
		colorLowland   (0.396, 0.401, 0.440, 0.030)
		colorUpland    (0.437, 0.441, 0.481, 0.050)
		colorRock      (0.478, 0.482, 0.535, 0.020)
		colorSnow      (0.478, 0.482, 0.535, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0282957
		Period          7.42124
		Eccentricity    0.252076
		Inclination     -54.0292
		AscendingNode   -57.0446
		ArgOfPericenter 155.87
		MeanAnomaly     149.035
	}
}

DwarfMoon	"Ahch-To System 7.D6"
{
	ParentBody     "Ahch-To System 7"
	Class	       "Asteroid"

	Mass            7.1427e-008
	Radius          61.7309
	InertiaMoment   0.398602

	RotationPeriod  598.879
	Obliquity       50.6969
	EqAscendNode    -73.3188

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.611 0.608 0.607)

	Surface
	{
		SurfStyle       0.734537
		OceanStyle      0.081498
		Randomize      (-0.149, 0.778, 0.737)
		colorDistMagn   0.529587
		colorDistFreq   2.06013
		detailScale     1685.67
		colorConversion true
		snowLevel       2
		tropicLatitude  0.979204
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.495798
		terraceProb     0.253958
		erosion         0
		montesMagn      0.600647
		montesFreq      2.82056
		montesSpiky     0.848804
		montesFraction  0.378637
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.86585
		hillsFraction   0.668697
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23166
		craterFreq      0.228382
		craterDensity   0.944866
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.556425
		volcanoTemp     1540.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.207, 0.170, 0.000)
		colorShelf     (0.245, 0.213, 0.194, 0.000)
		colorBeach     (0.287, 0.249, 0.231, 0.000)
		colorDesert    (0.312, 0.268, 0.225, 0.000)
		colorLowland   (0.342, 0.286, 0.255, 0.000)
		colorUpland    (0.379, 0.347, 0.310, 0.000)
		colorRock      (0.410, 0.377, 0.334, 0.000)
		colorSnow      (0.446, 0.402, 0.352, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0287434
		Period          7.59808
		Eccentricity    0.48888
		Inclination     52.0629
		AscendingNode   -72.2017
		ArgOfPericenter 6.94653
		MeanAnomaly     -126.648
	}
}

DwarfMoon	"Ahch-To System 7.D7"
{
	ParentBody     "Ahch-To System 7"
	Class	       "Asteroid"

	Mass            9.73448e-008
	Radius          65.3192
	InertiaMoment   0.399582

	RotationPeriod  544.536
	Obliquity       55.5743
	EqAscendNode    -148.562

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.747 0.692 0.624)

	Surface
	{
		SurfStyle       0.43941
		OceanStyle      0.425885
		Randomize      (-0.337, -0.564, -0.834)
		colorDistMagn   0.285076
		colorDistFreq   3.24018
		detailScale     1783.65
		colorConversion true
		snowLevel       2
		tropicLatitude  0.478288
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.604084
		terraceProb     0.55082
		erosion         0
		montesMagn      0.50817
		montesFreq      3.19924
		montesSpiky     0.92589
		montesFraction  0.459918
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.23748
		hillsFraction   0.561844
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224462
		craterFreq      0.262447
		craterDensity   0.70999
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.419825
		volcanoTemp     1664.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.277, 0.250, 0.000)
		colorShelf     (0.318, 0.294, 0.265, 0.000)
		colorBeach     (0.336, 0.311, 0.281, 0.000)
		colorDesert    (0.355, 0.328, 0.297, 0.000)
		colorLowland   (0.374, 0.346, 0.312, 0.000)
		colorUpland    (0.392, 0.363, 0.328, 0.000)
		colorRock      (0.411, 0.380, 0.343, 0.000)
		colorSnow      (0.430, 0.398, 0.359, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0290881
		Period          7.73518
		Eccentricity    0.391602
		Inclination     42.9466
		AscendingNode   -145.722
		ArgOfPericenter 13.8559
		MeanAnomaly     79.9492
	}
}

DwarfMoon	"Ahch-To System 7.D8"
{
	ParentBody     "Ahch-To System 7"
	Class	       "Asteroid"

	Mass            1.33104e-007
	Radius          69.6254
	InertiaMoment   0.397345

	RotationPeriod  495.826
	Obliquity       19.5877
	EqAscendNode    -11.5169

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.793 0.791 0.790)

	Surface
	{
		SurfStyle       0.661538
		OceanStyle      0.0178292
		Randomize      (-0.923, 0.675, 0.044)
		colorDistMagn   0.702
		colorDistFreq   2.21466
		detailScale     1901.24
		colorConversion true
		snowLevel       2
		tropicLatitude  0.221299
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.352888
		terraceProb     0.259696
		erosion         0
		montesMagn      0.400668
		montesFreq      2.50698
		montesSpiky     0.870821
		montesFraction  0.751283
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.00812
		hillsFraction   0.789723
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248716
		craterFreq      0.239194
		craterDensity   1.03133
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484105
		volcanoTemp     1717.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.269, 0.221, 0.000)
		colorShelf     (0.317, 0.277, 0.253, 0.000)
		colorBeach     (0.373, 0.324, 0.300, 0.000)
		colorDesert    (0.404, 0.348, 0.292, 0.000)
		colorLowland   (0.444, 0.372, 0.332, 0.000)
		colorUpland    (0.492, 0.451, 0.403, 0.000)
		colorRock      (0.531, 0.490, 0.435, 0.000)
		colorSnow      (0.579, 0.522, 0.458, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.029417
		Period          7.86672
		Eccentricity    0.0918921
		Inclination     -7.03492
		AscendingNode   -11.9533
		ArgOfPericenter -72.211
		MeanAnomaly     14.4626
	}
}

DwarfMoon	"Ahch-To System 7.D9"
{
	ParentBody     "Ahch-To System 7"
	Class	       "Asteroid"

	Mass            1.82785e-007
	Radius          72.088
	InertiaMoment   0.398757

	RotationPeriod  439.728
	Obliquity       -3.8233
	EqAscendNode    -40.6372

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.602 0.499 0.418)

	Surface
	{
		SurfStyle       0.254752
		OceanStyle      0.125212
		Randomize      (-0.592, -0.572, -0.711)
		colorDistMagn   0.486345
		colorDistFreq   2.9905
		detailScale     1968.48
		colorConversion true
		snowLevel       2
		tropicLatitude  0.135596
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.554994
		terraceProb     0.127004
		erosion         0
		montesMagn      0.647775
		montesFreq      3.24082
		montesSpiky     0.917657
		montesFraction  0.701767
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.42407
		hillsFraction   0.728984
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201538
		craterFreq      0.266713
		craterDensity   0.891494
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525332
		volcanoTemp     1792.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.200, 0.167, 0.000)
		colorShelf     (0.256, 0.212, 0.178, 0.000)
		colorBeach     (0.271, 0.224, 0.188, 0.000)
		colorDesert    (0.286, 0.237, 0.199, 0.000)
		colorLowland   (0.301, 0.249, 0.209, 0.000)
		colorUpland    (0.316, 0.262, 0.220, 0.000)
		colorRock      (0.331, 0.274, 0.230, 0.000)
		colorSnow      (0.346, 0.287, 0.241, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0299742
		Period          8.09131
		Eccentricity    0.2467
		Inclination     -4.45076
		AscendingNode   -39.3509
		ArgOfPericenter 43.0345
		MeanAnomaly     27.862
	}
}

DwarfMoon	"Ahch-To System 7.D10"
{
	ParentBody     "Ahch-To System 7"
	Class	       "Asteroid"

	Mass            2.52375e-007
	Radius          94.8439
	InertiaMoment   0.399709

	RotationPeriod  492.423
	Obliquity       36.3847
	EqAscendNode    80.0256

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.501 0.498 0.493)

	Surface
	{
		SurfStyle       0.739593
		OceanStyle      0.475397
		Randomize      (0.638, -0.180, 0.340)
		colorDistMagn   0.722449
		colorDistFreq   3.09671
		detailScale     2589.87
		colorConversion true
		snowLevel       2
		tropicLatitude  0.962108
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.486401
		terraceProb     0.119833
		erosion         0
		montesMagn      0.646174
		montesFreq      2.30922
		montesSpiky     0.9098
		montesFraction  0.581705
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.7853
		hillsFraction   0.538311
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.288264
		craterFreq      0.314869
		craterDensity   0.714336
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503176
		volcanoTemp     1375.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.169, 0.138, 0.000)
		colorShelf     (0.200, 0.174, 0.158, 0.000)
		colorBeach     (0.235, 0.204, 0.187, 0.000)
		colorDesert    (0.255, 0.219, 0.183, 0.000)
		colorLowland   (0.280, 0.234, 0.207, 0.000)
		colorUpland    (0.310, 0.284, 0.252, 0.000)
		colorRock      (0.335, 0.309, 0.271, 0.000)
		colorSnow      (0.365, 0.328, 0.286, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0306358
		Period          8.36064
		Eccentricity    0.347843
		Inclination     61.7539
		AscendingNode   78.0355
		ArgOfPericenter -143.88
		MeanAnomaly     -132.845
	}
}

DwarfMoon	"Ahch-To System 7.D11"
{
	ParentBody     "Ahch-To System 7"
	Class	       "Asteroid"

	Mass            3.50787e-007
	Radius          100.725
	InertiaMoment   0.39762

	RotationPeriod  443.077
	Obliquity       70.6941
	EqAscendNode    -138.153

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.521 0.512 0.508)

	Surface
	{
		SurfStyle       0.144186
		OceanStyle      0.181221
		Randomize      (0.434, -0.863, 0.459)
		colorDistMagn   0.804363
		colorDistFreq   6.51294
		detailScale     2750.46
		colorConversion true
		snowLevel       2
		tropicLatitude  0.934468
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.411567
		terraceProb     0.427453
		erosion         0
		montesMagn      0.444812
		montesFreq      2.15209
		montesSpiky     0.969188
		montesFraction  0.428932
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.4862
		hillsFraction   0.552494
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212841
		craterFreq      0.357788
		craterDensity   0.937712
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.545556
		volcanoTemp     2007.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.208, 0.205, 0.203, 0.000)
		colorShelf     (0.221, 0.217, 0.216, 0.000)
		colorBeach     (0.234, 0.230, 0.228, 0.000)
		colorDesert    (0.247, 0.243, 0.241, 0.000)
		colorLowland   (0.260, 0.256, 0.254, 0.000)
		colorUpland    (0.273, 0.269, 0.266, 0.000)
		colorRock      (0.286, 0.281, 0.279, 0.000)
		colorSnow      (0.299, 0.294, 0.292, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.030874
		Period          8.45834
		Eccentricity    0.43783
		Inclination     2.08242
		AscendingNode   -138.421
		ArgOfPericenter -102.548
		MeanAnomaly     -131.411
	}
}

