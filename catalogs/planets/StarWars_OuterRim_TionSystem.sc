// http://starwars.wikia.com/wiki/Tion
// Region : Outer Rim
// Sector : Tion Hegemony Sector
// Grid location : S5
// X : 11595.67, Y : 6119.69, Z : 208.14891304406

Star	"Tion System A"
{
	ParentBody     "Tion System"
	Class	       "B8.2 V"
	Luminosity      58.4281
	//MassSol         3.67881
	RadSol          2.73586
	Teff            11620

	InertiaMoment   0.0397552

	Obliquity       -177.916
	EqAscendNode    47.4346
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.531 0.641 1.000)

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          19041.6
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
		Radius      1.07766e+007
		Period      0.0399982
		Brightness  0.5
		RayDensity  5.15607
		RayCurv     14.3811
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.171362
		Period          0.146676
		Eccentricity    0.511968
		Inclination     -177.916
		AscendingNode   47.4346
		ArgOfPericenter 72.9635
		MeanAnomaly     162.843
	}
}

Star	"Tion System B"
{
	ParentBody     "Tion System"
	Class	       "B9.6 V"
	Luminosity      22.6664
	//MassSol         2.31466
	RadSol          2.71912

	InertiaMoment   0.0662978

	Obliquity       -177.916
	EqAscendNode    47.4346
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.764 0.801 1.000)

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          18925
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
		Radius      1.00977e+007
		Period      0.0352608
		Brightness  0.5
		RayDensity  3.67771
		RayCurv     22.7447
	}

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.272354
		Period          0.146676
		Eccentricity    0.511968
		Inclination     -177.916
		AscendingNode   47.4346
		ArgOfPericenter 252.964
		MeanAnomaly     162.843
	}
}

Planet	"Tion/Tion Proper/Tion System 4"
{
	ParentBody     "Tion System"
	Class	       "Terra"

	Mass            0.4985
	Radius          7562.3
	InertiaMoment   0.351286

	Oblateness      0.00371945

	RotationPeriod  25.0232
	Obliquity       -28.0439
	EqAscendNode    -174.627

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.554 0.558 0.509)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
		Panspermia "false"
	}

	Surface
	{
		SurfStyle       -0.047619
		OceanStyle      0.142124
		Randomize      (1.365, 0.951, 0.907)
		colorDistMagn   0.0612326
		colorDistFreq   3105.01
		detailScale     6433.06
		colorConversion true
		drivenDarkening 0
		seaLevel        0.920635
		snowLevel       1
		tropicLatitude  0.505995
		icecapLatitude  0.801587
		icecapHeight    0.015873
		climatePole     0.690476
		climateTropic   0.619048
		climateEquator  0.6875
		heightTempGrad  0.047619
		tropicWidth     0.07
		mainFreq        0.277778
		venusFreq       1.71429
		venusMagn       1.26984
		mareFreq        1000
		mareDensity     1
		terraceProb     0.25404
		erosion         1
		montesMagn      0.47619
		montesFreq      222.222
		montesSpiky     1
		montesFraction  0.650794
		dunesMagn       1.34921
		dunesFreq       48.4127
		dunesFraction   0.404762
		hillsMagn       0.714286
		hillsFreq       698.413
		hillsFraction   0.730159
		hills2Fraction  0.333333
		riversMagn      65.6553
		riversFreq      3.56689
		riversSin       5.58056
		riversOctaves   1
		canyonsMagn     7.93651
		canyonsFreq     16.6667
		canyonFraction  0.0575189
		cracksMagn      1.50794
		cracksFreq      1.50545
		cracksOctaves   1
		craterMagn      0.611831
		craterFreq      6.44501
		craterDensity   0.111111
		craterOctaves   12
		craterRayedFactor 0.0697024
		volcanoMagn     0.441967
		volcanoFreq     0.650138
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 0.365079
		volcanoFlows    0.196677
		volcanoRadius   0.311771
		volcanoTemp     2595.24
		lavaCoverTidal  0.0873016
		lavaCoverSun    0.0555556
		lavaCoverYoung  0.0396825
		stripeZones     0
		stripeFluct     0
		stripeTwist     0.793651
		cycloneMagn     0
		cycloneFreq     0
		cycloneDensity  0
		cycloneOctaves  0
		colorSea       (0.040, 0.100, 0.200, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.690, 0.470, 0.320, 0.000)
		colorDesert    (0.610, 0.380, 0.270, 0.000)
		colorLowland   (0.102, 0.159, 0.071, 0.000)
		colorUpland    (0.091, 0.110, 0.041, 0.000)
		colorRock      (0.730, 0.550, 0.390, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.016)
		colorLowPlants (0.100, 0.160, 0.070, 0.000)
		colorUpPlants  (0.090, 0.110, 0.040, 0.000)
		BumpHeight      20.6349
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecularPower   55
		Hapke           0.999554
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          15.5054
		Velocity        121.049
		BumpHeight      4.26755
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.98782
		mainOctaves     4
		Coverage        0.373016
		stripeZones     1.5873
		stripeFluct     0.68254
		stripeTwist     0.793651
	}

	Ocean
	{
		Height          18.9971
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          964.111
		Density         100
		Pressure        0.8
		Greenhouse      23.7629
		Bright          2.13686
		Opacity         0.5
		SkyLight        0.712286
		Hue             0.00793654
		Saturation      1.42857

		Composition
		{
			N2    	77.7729
			O2    	20.8625
			Ar    	0.9303
			H2O   	0.4
			CO2   	0.0398
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.2003
		Period          15.311
		Eccentricity    0.0865119
		Inclination     -177.738
		AscendingNode   45.5105
		ArgOfPericenter 300.848
		MeanAnomaly     253.506
	}
}

// Tion's 3 industrialized moons
Moon	"Tion's Moon 1/Tion System 4.1"
{
	ParentBody     "Tion"
	Class	       "Terra"

	Mass            0.00441723
	Radius          1249.34
	InertiaMoment   0.395017

	Oblateness      0.00636769

	Obliquity       -0.794312
	EqAscendNode    -37.1361
	TidalLocked     false

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.807 0.761 0.674)
	
	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
		Panspermia "true"
	}

	Surface
	{
		DiffMap        "Coruscant/Diff"
		DiffTileSize    130
		DiffTileBorder  1  
		DiffMapAlpha   "Water"
		BumpMap        "Coruscant/Bump"
		BumpTileSize    128
		BumpTileBorder  1
		BumpHeight 10
		BumpOffset 0
		GlowMap        "Coruscant/Glow"
		GlowMode       "Permanent" //"Night"
		GlowTileSize    130
		GlowTileBorder  1  
		GlowColor      (1.00 0.90 0.66)
		GlowBright      1.0
		Exposure		1.7
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          64.111
		Density         100
		Pressure        0.8
		Greenhouse      28.4829
		Bright          2.13686
		Opacity         0.5
		SkyLight        0.712286
		Hue             0.00793654
		Saturation      1.42857

		Composition
		{
			N2    	77.7729
			O2    	20.8625
			Ar    	0.9303
			H2O   	0.4
			CO2   	0.0398
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000297904
		Period          0.00290841
		Eccentricity    0.0294731
		Inclination     -0.794312
		AscendingNode   -37.1361
		ArgOfPericenter 31.6987
		MeanAnomaly     -113.6
	}
}

Moon	"Tion's Moon 2/Tion System 4.2"
{
	ParentBody     "Tion"
	Class	       "Terra"

	Mass            0.00511616
	Radius          1418.68
	InertiaMoment   0.390926

	Oblateness      0.00167362

	Obliquity       -0.340463
	EqAscendNode    18.7063
	TidalLocked     false

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.894 0.900 0.945)
	
	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
		Panspermia "true"
	}

	Surface
	{
		DiffMap        "Coruscant/Diff"
		DiffTileSize    130
		DiffTileBorder  1  
		DiffMapAlpha   "Water"
		BumpMap        "Coruscant/Bump"
		BumpTileSize    128
		BumpTileBorder  1
		BumpHeight 10
		BumpOffset 0
		GlowMap        "Coruscant/Glow"
		GlowMode       "Permanent" //"Night"
		GlowTileSize    130
		GlowTileBorder  1  
		GlowColor      (1.00 0.90 0.66)
		GlowBright      1.0
		Exposure		1.7
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          64.111
		Density         100
		Pressure        0.8
		Greenhouse      26.5529
		Bright          2.13686
		Opacity         0.5
		SkyLight        0.712286
		Hue             0.00793654
		Saturation      1.42857

		Composition
		{
			N2    	77.7729
			O2    	20.8625
			Ar    	0.9303
			H2O   	0.4
			CO2   	0.0398
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000500416
		Period          0.00632986
		Eccentricity    0.0304991
		Inclination     -0.340463
		AscendingNode   18.7063
		ArgOfPericenter -159.876
		MeanAnomaly     5.78637
	}
}

Moon	"Tion's Moon 3/Tion System 4.3"
{
	ParentBody     "Tion"
	Class	       "Terra"

	Mass            0.00592094
	Radius          1375.74
	InertiaMoment   0.387037

	Obliquity       -0.351048
	EqAscendNode    -11.0992
	TidalLocked     false

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.778 0.769 0.818)
	
	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
		Panspermia "true"
	}

	Surface
	{
		DiffMap        "Coruscant/Diff"
		DiffTileSize    130
		DiffTileBorder  1  
		DiffMapAlpha   "Water"
		BumpMap        "Coruscant/Bump"
		BumpTileSize    128
		BumpTileBorder  1
		BumpHeight 10
		BumpOffset 0
		GlowMap        "Coruscant/Glow"
		GlowMode       "Permanent" //"Night"
		GlowTileSize    130
		GlowTileBorder  1  
		GlowColor      (1.00 0.90 0.66)
		GlowBright      1.0
		Exposure		1.7
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          64.111
		Density         100
		Pressure        0.8
		Greenhouse      28.1829
		Bright          2.13686
		Opacity         0.5
		SkyLight        0.712286
		Hue             0.00793654
		Saturation      1.42857

		Composition
		{
			N2    	77.7729
			O2    	20.8625
			Ar    	0.9303
			H2O   	0.4
			CO2   	0.0398
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000840596
		Period          0.0137756
		Eccentricity    0.0254795
		Inclination     -0.351048
		AscendingNode   -11.0992
		ArgOfPericenter -118.802
		MeanAnomaly     100.248
	}
}

///////////////
// Generated //
///////////////

DwarfPlanet	"Tion System 1"
{
	ParentBody     "Tion System"
	Class	       "Selena"

	Mass            0.00487209
	Radius          1290.3
	InertiaMoment   0.391188

	Oblateness      0.00175924

	RotationPeriod  48.1271
	Obliquity       -49.6504
	EqAscendNode    61.2254
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.530 0.524 0.520)

	Surface
	{
		SurfStyle       0.324102
		OceanStyle      0.733721
		Randomize      (0.629, -0.240, -0.408)
		colorDistMagn   0.0708477
		colorDistFreq   179.564
		detailScale     3318.72
		colorConversion true
		drivenDarkening 0
		seaLevel        0.205601
		snowLevel       2
		tropicLatitude  0.727918
		icecapLatitude  10
		icecapHeight    0.131656
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.83233
		venusFreq       0.954542
		venusMagn       0
		mareFreq        0.384063
		mareDensity     0.0022254
		terraceProb     0.217988
		erosion         0
		montesMagn      0.0557782
		montesFreq      60.8182
		montesSpiky     0.804096
		montesFraction  0.960212
		dunesMagn       0.0304341
		dunesFreq       1688.64
		dunesFraction   0.520272
		hillsMagn       0.128604
		hillsFreq       162.735
		hillsFraction   0.620894
		hills2Fraction  0
		riversMagn      63.802
		riversFreq      4.05701
		riversSin       6.50741
		riversOctaves   0
		canyonsMagn     0.502305
		canyonsFreq     0.497846
		canyonFraction  0.227463
		cracksMagn      0.0651059
		cracksFreq      0.581144
		cracksOctaves   0
		craterMagn      0.680142
		craterFreq      3.20868
		craterDensity   0.829856
		craterOctaves   11
		craterRayedFactor 0.0751606
		volcanoMagn     0.203673
		volcanoFreq     0.65537
		volcanoDensity  0.165713
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.315791
		volcanoRadius   0.180568
		volcanoTemp     1319.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.900, 0.900, 0.900, 0.000)
		colorShelf     (0.500, 0.500, 0.500, 0.000)
		colorBeach     (0.212, 0.210, 0.208, 0.000)
		colorDesert    (0.439, 0.435, 0.432, 0.000)
		colorLowland   (0.445, 0.440, 0.437, 0.000)
		colorUpland    (0.196, 0.194, 0.193, 0.000)
		colorRock      (0.800, 0.800, 0.800, 0.000)
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
		SemiMajorAxis   2.05961
		Period          1.20737
		Eccentricity    0.035156
		Inclination     -157.376
		AscendingNode   50.435
		ArgOfPericenter 101.243
		MeanAnomaly     43.7515
	}
}

DwarfMoon	"Tion System 1.D1"
{
	ParentBody     "Tion System 1"
	Class	       "Asteroid"

	Mass            4.67769e-008
	Radius          48.4589
	InertiaMoment   0.397067

	Oblateness      0.249

	Obliquity       0.0145135
	EqAscendNode    -157.91
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.623 0.539 0.434)

	Surface
	{
		SurfStyle       0.00729767
		OceanStyle      0.395655
		Randomize      (0.911, 0.970, -0.967)
		colorDistMagn   0.140908
		colorDistFreq   1.98878
		detailScale     1323.25
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.498915
		terraceProb     0.218961
		erosion         0
		montesMagn      0.443446
		montesFreq      3.07945
		montesSpiky     0.976616
		montesFraction  0.39764
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.14375
		hillsFraction   0.694528
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.190188
		craterFreq      0.189339
		craterDensity   0.902862
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.548554
		volcanoTemp     1398.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.216, 0.174, 0.000)
		colorShelf     (0.262, 0.226, 0.182, 0.000)
		colorBeach     (0.280, 0.243, 0.195, 0.000)
		colorDesert    (0.293, 0.253, 0.204, 0.000)
		colorLowland   (0.312, 0.269, 0.217, 0.000)
		colorUpland    (0.330, 0.286, 0.230, 0.000)
		colorRock      (0.343, 0.296, 0.239, 0.000)
		colorSnow      (0.361, 0.313, 0.252, 1.000)
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
		SemiMajorAxis   2.58818e-005
		Period          0.00109097
		Eccentricity    7.33877e-005
		Inclination     0.0145135
		AscendingNode   -157.91
		ArgOfPericenter -86.6159
		MeanAnomaly     131.538
	}
}

Barycenter     "Tion System 2-2.1"
{
	ParentBody     "Tion System"
	Mass            0.0286517
	Radius          1615
	RotationPeriod  24
	Obliquity       0
	EqAscendNode    0
	Precession      0


	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.28911
		Period          2.43657
		Eccentricity    0.0551436
		Inclination     -167.515
		AscendingNode   45.2882
		ArgOfPericenter 167.257
		MeanAnomaly     165.325
	}
}

DwarfPlanet	"Tion System 2"
{
	ParentBody     "Tion System 2-2.1"
	Class	       "Selena"

	Mass            0.0272416
	Radius          1772.84
	InertiaMoment   0.357413

	Oblateness      0.00319461

	RotationPeriod  22.8392
	Obliquity       -16.4882
	EqAscendNode    16.517
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.623 0.618 0.613)

	Surface
	{
		SurfStyle       0.270077
		OceanStyle      0.111319
		Randomize      (0.431, 0.129, -0.099)
		colorDistMagn   0.0770528
		colorDistFreq   174.756
		detailScale     4559.85
		colorConversion true
		drivenDarkening 0
		seaLevel        0.269093
		snowLevel       2
		tropicLatitude  0.282076
		icecapLatitude  10
		icecapHeight    0.163253
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.88479
		venusFreq       0.566138
		venusMagn       0
		mareFreq        0.801436
		mareDensity     0.0195491
		terraceProb     0.291738
		erosion         0
		montesMagn      0.0982276
		montesFreq      76.0112
		montesSpiky     0.863655
		montesFraction  0.39129
		dunesMagn       0.0449113
		dunesFreq       2354.75
		dunesFraction   0.103854
		hillsMagn       0.105465
		hillsFreq       218.147
		hillsFraction   0.188414
		hills2Fraction  0
		riversMagn      61.2758
		riversFreq      2.29524
		riversSin       6.18914
		riversOctaves   0
		canyonsMagn     0.569384
		canyonsFreq     0.647994
		canyonFraction  0.718679
		cracksMagn      0.0625178
		cracksFreq      0.857442
		cracksOctaves   0
		craterMagn      0.507974
		craterFreq      3.98447
		craterDensity   0.816081
		craterOctaves   11
		craterRayedFactor 0.0674491
		volcanoMagn     0.278946
		volcanoFreq     0.857703
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.364133
		volcanoRadius   0.199813
		volcanoTemp     1397.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.900, 0.900, 0.900, 0.000)
		colorShelf     (0.500, 0.500, 0.500, 0.000)
		colorBeach     (0.249, 0.247, 0.245, 0.000)
		colorDesert    (0.374, 0.371, 0.368, 0.200)
		colorLowland   (0.498, 0.495, 0.491, 0.500)
		colorUpland    (0.436, 0.433, 0.429, 0.800)
		colorRock      (0.400, 0.400, 0.400, 0.000)
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

	Atmosphere
	{
		Model          "Sun"
		Height          88.6421
		Density         3.81054e-008
		Pressure        1.12995e-008
		Bright          0.520232
		Opacity         0
		SkyLight        0.173411
		Hue             -0.0350398
		Saturation      1

		Composition
		{
			Xe    	100
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.1752e-005
		Period          0.0126067
		Eccentricity    0.0489644
		Inclination     0.315406
		AscendingNode   -70.2369
		ArgOfPericenter 87.4342
		MeanAnomaly     131.826
	}
}

Moon	"Tion System 2.1"
{
	ParentBody     "Tion System 2-2.1"
	Class	       "Selena"

	Mass            0.00141014
	Radius          670.583
	InertiaMoment   0.399586

	Obliquity       0.315406
	EqAscendNode    -70.2369
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.702 0.699 0.698)

	Surface
	{
		SurfStyle       0.289124
		OceanStyle      0.723565
		Randomize      (0.312, -0.819, 0.248)
		colorDistMagn   0.0458144
		colorDistFreq   74.4843
		detailScale     1724.78
		colorConversion true
		drivenDarkening 0
		seaLevel        0.176505
		snowLevel       2
		tropicLatitude  0.00900337
		icecapLatitude  10
		icecapHeight    0.129709
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.95597
		venusFreq       1.28634
		venusMagn       0
		mareFreq        0.0560582
		mareDensity     0.00221
		terraceProb     0.12986
		erosion         0
		montesMagn      0.0534823
		montesFreq      30.6593
		montesSpiky     0.956623
		montesFraction  0.249273
		dunesMagn       0.0336293
		dunesFreq       895.847
		dunesFraction   0.56572
		hillsMagn       0.141369
		hillsFreq       65.5975
		hillsFraction   0.62109
		hills2Fraction  0
		riversMagn      57.0721
		riversFreq      3.23405
		riversSin       6.41588
		riversOctaves   0
		canyonsMagn     0.461444
		canyonsFreq     0.248757
		canyonFraction  0.477235
		cracksMagn      0.0612111
		cracksFreq      0.301437
		cracksOctaves   0
		craterMagn      0.645457
		craterFreq      2.0661
		craterDensity   0.810277
		craterOctaves   9
		craterRayedFactor 0.21862
		volcanoMagn     0.151708
		volcanoFreq     0.784392
		volcanoDensity  0.257545
		volcanoOctaves  3
		volcanoActivity 0.427737
		volcanoFlows    0.266834
		volcanoRadius   0.135903
		volcanoTemp     1423.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.750, 0.750, 0.750, 0.000)
		colorShelf     (0.390, 0.390, 0.390, 0.000)
		colorBeach     (0.232, 0.231, 0.230, 0.000)
		colorDesert    (0.365, 0.364, 0.363, 0.000)
		colorLowland   (0.464, 0.461, 0.461, 0.000)
		colorUpland    (0.393, 0.391, 0.391, 0.000)
		colorRock      (0.350, 0.350, 0.350, 0.000)
		colorSnow      (0.680, 0.680, 0.680, 1.000)
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
		SemiMajorAxis   0.000227029
		Period          0.0126067
		Eccentricity    0.0489644
		Inclination     0.315406
		AscendingNode   -70.2369
		ArgOfPericenter -92.5658
		MeanAnomaly     131.826
	}
}

Planet	"Tion System 3"
{
	ParentBody     "Tion System"
	Class	       "GasGiant"

	Mass            109.108
	Radius          61649.5
	InertiaMoment   0.272742

	Oblateness      0.0776505

	RotationPeriod  12.8853
	Obliquity       8.69068
	EqAscendNode    35.864
	Precession      0

	AlbedoBond      0.460103
	AlbedoGeom      0.552123
	Brightness      2

	Surface
	{
		SurfStyle       0.252256
		Randomize      (-0.968, -0.122, 0.741)
		detailScale     158566
		colorConversion true
		tropicLatitude  0.182813
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0.647788
		stripeZones     6.92011
		stripeFluct     0.456118
		stripeTwist     9.01055
		cycloneMagn     8.32454
		cycloneFreq     0.487913
		cycloneDensity  0.543199
		cycloneOctaves  5
		colorLayer0    (0.630, 0.600, 0.550, 1.000)
		colorLayer1    (0.700, 0.700, 0.690, 1.000)
		colorLayer2    (0.050, 0.070, 0.230, 1.000)
		colorLayer3    (0.580, 0.420, 0.270, 1.000)
		colorLayer4    (0.740, 0.720, 0.690, 1.000)
		colorLayer5    (0.580, 0.420, 0.270, 1.000)
		colorLayer6    (0.630, 0.600, 0.550, 1.000)
		colorLayer7    (0.810, 0.850, 0.890, 1.000)
		colorLowPlants (0.740, 0.720, 0.690, 1.000)
		colorUpPlants  (0.580, 0.420, 0.270, 1.000)
		BumpHeight      18.5071
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          138.105
		Velocity        1947.02
		BumpHeight      67.6865
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.744033
		mainOctaves     12
		Coverage        0.101027
		stripeZones     6.92011
		stripeFluct     0.456118
		stripeTwist     9.01055
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          616.495
		Density         5459.1
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0432775
		Saturation      0.860709

		Composition
		{
			H2    	91.858
			He    	7.69154
			CH4   	0.363824
			N2    	0.0437196
			NH3   	0.0262703
			O2    	0.00823228
			C2H2  	0.00361166
			C2H4  	0.00146289
			Ne    	0.00131824
			Ar    	0.000891713
			C2H6  	0.00076655
			C3H8  	0.000368849
		}
	}

	Aurora
	{
		Height      2161.31
		NorthLat    81.8013
		NorthLon    34.9627
		NorthRadius 13364.4
		NorthWidth  6387.33
		NorthRings  5
		NorthBright 1
		NorthParticles 10000
		SouthLat    -81.8111
		SouthLon    216.923
		SouthRadius 15910.7
		SouthWidth  7377.24
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
		SemiMajorAxis   5.91435
		Period          5.87502
		Eccentricity    0.0292222
		Inclination     -177.477
		AscendingNode   48.4404
		ArgOfPericenter 263.852
		MeanAnomaly     300.418
	}
}

DwarfMoon	"Tion System 3.D1"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            3.17691e-010
	Radius          5.69208
	InertiaMoment   0.396357

	Oblateness      0.101749

	Obliquity       -0.00309353
	EqAscendNode    17.5024
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.470 0.466 0.460)

	Surface
	{
		SurfStyle       0.764365
		OceanStyle      0.689961
		Randomize      (0.072, -0.764, -0.429)
		colorDistMagn   0.822378
		colorDistFreq   0.0160838
		detailScale     155.432
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.40289
		terraceProb     0.241004
		erosion         0
		montesMagn      0.487681
		montesFreq      2.90695
		montesSpiky     0.849808
		montesFraction  0.168716
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0976076
		hillsFraction   0.574194
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23917
		craterFreq      0.268374
		craterDensity   1.01943
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.590971
		volcanoTemp     1600.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.395, 0.242, 0.055, 0.000)
		colorShelf     (0.376, 0.261, 0.087, 0.000)
		colorBeach     (0.404, 0.242, 0.055, 0.000)
		colorDesert    (0.390, 0.252, 0.055, 0.000)
		colorLowland   (0.399, 0.270, 0.074, 0.000)
		colorUpland    (0.395, 0.242, 0.055, 0.000)
		colorRock      (0.381, 0.242, 0.060, 0.000)
		colorSnow      (0.390, 0.252, 0.055, 1.000)
		BumpHeight      5.12287
		BumpOffset      1.02457
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
		SemiMajorAxis   0.000611108
		Period          0.000836427
		Eccentricity    5.57404e-005
		Inclination     -0.00309353
		AscendingNode   17.5024
		ArgOfPericenter 122.791
		MeanAnomaly     -57.7144
	}
}

DwarfMoon	"Tion System 3.D2"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            4.78014e-010
	Radius          11.1053
	InertiaMoment   0.398382

	Oblateness      0.249

	Obliquity       -0.0138396
	EqAscendNode    58.7635
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.743 0.742 0.741)

	Surface
	{
		SurfStyle       0.686001
		OceanStyle      0.516537
		Randomize      (0.373, -0.184, -0.507)
		colorDistMagn   0.871737
		colorDistFreq   0.0298777
		detailScale     303.25
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.354123
		terraceProb     0.469141
		erosion         0
		montesMagn      0.69472
		montesFreq      3.52532
		montesSpiky     0.931651
		montesFraction  0.560836
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.190953
		hillsFraction   0.742837
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24853
		craterFreq      0.214405
		craterDensity   0.999762
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.592169
		volcanoTemp     1482.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.625, 0.512, 0.089, 0.000)
		colorShelf     (0.595, 0.534, 0.119, 0.000)
		colorBeach     (0.639, 0.527, 0.104, 0.000)
		colorDesert    (0.617, 0.527, 0.096, 0.000)
		colorLowland   (0.632, 0.549, 0.111, 0.000)
		colorUpland    (0.625, 0.512, 0.081, 0.000)
		colorRock      (0.602, 0.527, 0.111, 0.000)
		colorSnow      (0.617, 0.534, 0.096, 1.000)
		BumpHeight      9.99481
		BumpOffset      1.99896
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
		SemiMajorAxis   0.000692271
		Period          0.00100848
		Eccentricity    1.58517e-005
		Inclination     -0.0138396
		AscendingNode   58.7635
		ArgOfPericenter -160.298
		MeanAnomaly     8.78593
	}
}

DwarfMoon	"Tion System 3.D3"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            7.04928e-010
	Radius          6.52301
	InertiaMoment   0.399411

	Oblateness      0.0313011

	Obliquity       0.00257955
	EqAscendNode    174.75
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.537 0.478 0.430)

	Surface
	{
		SurfStyle       0.0473342
		OceanStyle      0.241836
		Randomize      (-0.483, -0.687, -0.638)
		colorDistMagn   0.863131
		colorDistFreq   0.0238636
		detailScale     178.122
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.589263
		terraceProb     0.254742
		erosion         0
		montesMagn      0.49053
		montesFreq      3.06819
		montesSpiky     0.877008
		montesFraction  0.249102
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.106188
		hillsFraction   0.704308
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256463
		craterFreq      0.182641
		craterDensity   1.00405
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.473586
		volcanoTemp     1554.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.191, 0.142, 0.000)
		colorShelf     (0.210, 0.201, 0.155, 0.000)
		colorBeach     (0.226, 0.215, 0.172, 0.000)
		colorDesert    (0.236, 0.225, 0.168, 0.000)
		colorLowland   (0.253, 0.239, 0.185, 0.000)
		colorUpland    (0.269, 0.254, 0.193, 0.000)
		colorRock      (0.274, 0.263, 0.202, 0.000)
		colorSnow      (0.290, 0.277, 0.206, 1.000)
		BumpHeight      5.87071
		BumpOffset      1.17414
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
		SemiMajorAxis   0.000798418
		Period          0.0012491
		Eccentricity    8.36053e-005
		Inclination     0.00257955
		AscendingNode   174.75
		ArgOfPericenter -168.073
		MeanAnomaly     9.77777
	}
}

DwarfMoon	"Tion System 3.D4"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.02244e-009
	Radius          6.78223
	InertiaMoment   0.396877

	Oblateness      0.0173881

	Obliquity       0.00741739
	EqAscendNode    3.7586
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.618 0.554 0.499)

	Surface
	{
		SurfStyle       0.576133
		OceanStyle      0.631446
		Randomize      (-0.942, -0.683, 0.776)
		colorDistMagn   0.912061
		colorDistFreq   0.0266984
		detailScale     185.2
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.741467
		terraceProb     0.270532
		erosion         0
		montesMagn      0.50196
		montesFreq      3.60161
		montesSpiky     0.959911
		montesFraction  0.447794
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.129615
		hillsFraction   0.661678
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259619
		craterFreq      0.27221
		craterDensity   0.739207
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457978
		volcanoTemp     1311.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.194, 0.200, 0.000)
		colorShelf     (0.204, 0.238, 0.230, 0.000)
		colorBeach     (0.223, 0.260, 0.260, 0.000)
		colorDesert    (0.272, 0.293, 0.295, 0.000)
		colorLowland   (0.303, 0.332, 0.325, 0.000)
		colorUpland    (0.396, 0.454, 0.440, 0.000)
		colorRock      (0.346, 0.399, 0.395, 0.000)
		colorSnow      (0.346, 0.388, 0.395, 1.000)
		BumpHeight      6.10401
		BumpOffset      1.2208
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
		SemiMajorAxis   0.000889303
		Period          0.00146834
		Eccentricity    4.39555e-005
		Inclination     0.00741739
		AscendingNode   3.7586
		ArgOfPericenter 66.5352
		MeanAnomaly     -71.7221
	}
}

DwarfMoon	"Tion System 3.D5"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.46264e-009
	Radius          9.59191
	InertiaMoment   0.398549

	Oblateness      0.0326328

	Obliquity       -0.000483391
	EqAscendNode    66.7368
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.522 0.519 0.514)

	Surface
	{
		SurfStyle       0.856843
		OceanStyle      0.613574
		Randomize      (0.411, -0.334, 0.875)
		colorDistMagn   0.285086
		colorDistFreq   0.0545193
		detailScale     261.923
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.313222
		terraceProb     0.389456
		erosion         0
		montesMagn      0.5545
		montesFreq      2.92487
		montesSpiky     0.775137
		montesFraction  0.57286
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.245593
		hillsFraction   0.682814
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.256834
		craterFreq      0.20173
		craterDensity   0.934371
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492223
		volcanoTemp     1696.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.423, 0.254, 0.041, 0.000)
		colorShelf     (0.439, 0.233, 0.036, 0.000)
		colorBeach     (0.397, 0.228, 0.051, 0.000)
		colorDesert    (0.434, 0.233, 0.046, 0.000)
		colorLowland   (0.428, 0.254, 0.041, 0.000)
		colorUpland    (0.428, 0.239, 0.036, 0.000)
		colorRock      (0.434, 0.244, 0.036, 0.000)
		colorSnow      (0.434, 0.233, 0.046, 1.000)
		BumpHeight      8.63272
		BumpOffset      1.72654
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
		SemiMajorAxis   0.000906825
		Period          0.00151195
		Eccentricity    1.99415e-005
		Inclination     -0.000483391
		AscendingNode   66.7368
		ArgOfPericenter 0.0825981
		MeanAnomaly     -57.1333
	}
}

Moon	"Tion System 3.1"
{
	ParentBody     "Tion System 3"
	Class	       "Selena"

	Mass            0.00183309
	Radius          821.45
	InertiaMoment   0.393809

	Oblateness      0.00311453

	Obliquity       -0.910319
	EqAscendNode    -24.0279
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.630 0.522 0.461)

	Surface
	{
		SurfStyle       0.454593
		OceanStyle      0.209912
		Randomize      (-0.550, 0.495, -0.642)
		colorDistMagn   0.0837609
		colorDistFreq   86.3312
		detailScale     2112.82
		colorConversion true
		drivenDarkening 0
		seaLevel        0.226693
		snowLevel       2
		tropicLatitude  0.031076
		icecapLatitude  10
		icecapHeight    0.137066
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.05558
		venusFreq       1.29742
		venusMagn       0
		mareFreq        0.151246
		mareDensity     0.00138715
		terraceProb     0.290564
		erosion         0
		montesMagn      0.0725381
		montesFreq      44.6867
		montesSpiky     0.995529
		montesFraction  0.326421
		dunesMagn       0.0278958
		dunesFreq       1075.45
		dunesFraction   0.749579
		hillsMagn       0.128133
		hillsFreq       96.7448
		hillsFraction   0.0256916
		hills2Fraction  0
		riversMagn      59.3418
		riversFreq      2.30703
		riversSin       5.14459
		riversOctaves   0
		canyonsMagn     0.3093
		canyonsFreq     0.27675
		canyonFraction  0.504787
		cracksMagn      0.0600216
		cracksFreq      0.188967
		cracksOctaves   0
		craterMagn      0.593108
		craterFreq      1.90944
		craterDensity   0.833807
		craterOctaves   8.72907
		craterRayedFactor 0.186999
		volcanoMagn     0.174919
		volcanoFreq     0.700781
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.411107
		volcanoRadius   0.160018
		volcanoTemp     1648.84
		lavaCoverTidal  0.141214
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.850, 0.820, 0.900, 0.000)
		colorShelf     (0.460, 0.380, 0.470, 0.000)
		colorBeach     (0.271, 0.188, 0.166, 0.000)
		colorDesert    (0.120, 0.083, 0.088, 0.000)
		colorLowland   (0.227, 0.188, 0.166, 0.000)
		colorUpland    (0.334, 0.256, 0.240, 0.000)
		colorRock      (0.380, 0.350, 0.350, 0.000)
		colorSnow      (0.470, 0.420, 0.470, 1.000)
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
		SemiMajorAxis   0.00156687
		Period          0.00343399
		Eccentricity    0.0488639
		Inclination     -0.910319
		AscendingNode   -24.0279
		ArgOfPericenter 119.616
		MeanAnomaly     -39.3046
	}
}

Moon	"Tion System 3.2"
{
	ParentBody     "Tion System 3"
	Class	       "Selena"

	Mass            0.00216931
	Radius          773.155
	InertiaMoment   0.399544

	Obliquity       -1.21209
	EqAscendNode    150.897
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.417 0.415 0.412)

	Surface
	{
		SurfStyle       0.384621
		OceanStyle      0.80371
		Randomize      (0.890, -0.377, -0.359)
		colorDistMagn   0.0738696
		colorDistFreq   98.7053
		detailScale     1988.6
		colorConversion true
		drivenDarkening 0
		seaLevel        0.168185
		snowLevel       2
		tropicLatitude  0.0106305
		icecapLatitude  10
		icecapHeight    0.117197
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.96361
		venusFreq       0.934385
		venusMagn       0
		mareFreq        0.121531
		mareDensity     0.0036972
		terraceProb     0.3513
		erosion         0
		montesMagn      0.0516556
		montesFreq      29.9407
		montesSpiky     0.982067
		montesFraction  0.397966
		dunesMagn       0.0269394
		dunesFreq       1027.38
		dunesFraction   0.0677758
		hillsMagn       0.141613
		hillsFreq       100.891
		hillsFraction   0.799379
		hills2Fraction  0
		riversMagn      62.5419
		riversFreq      3.59891
		riversSin       5.10547
		riversOctaves   0
		canyonsMagn     0.672412
		canyonsFreq     0.300078
		canyonFraction  0.349746
		cracksMagn      0.0797752
		cracksFreq      0.268954
		cracksOctaves   0
		craterMagn      0.619964
		craterFreq      1.92174
		craterDensity   0.978567
		craterOctaves   10
		craterRayedFactor 0.238238
		volcanoMagn     0.185208
		volcanoFreq     0.695713
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.30178
		volcanoFlows    0.172778
		volcanoRadius   0.143861
		volcanoTemp     1315.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.840, 0.900, 0.890, 0.000)
		colorShelf     (0.740, 0.770, 0.750, 0.000)
		colorBeach     (0.284, 0.303, 0.301, 0.000)
		colorDesert    (0.342, 0.361, 0.342, 0.000)
		colorLowland   (0.354, 0.370, 0.371, 0.000)
		colorUpland    (0.329, 0.361, 0.346, 0.000)
		colorRock      (0.780, 0.820, 0.820, 0.000)
		colorSnow      (0.970, 1.000, 1.000, 1.000)
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
		SemiMajorAxis   0.00259022
		Period          0.0072988
		Eccentricity    0.0357744
		Inclination     -1.21209
		AscendingNode   150.897
		ArgOfPericenter 49.0722
		MeanAnomaly     -171.186
	}
}

Moon	"Tion System 3.3"
{
	ParentBody     "Tion System 3"
	Class	       "Selena"

	Mass            0.00255199
	Radius          1042.67
	InertiaMoment   0.399056

	Obliquity       1.44887
	EqAscendNode    -24.4846
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.521 0.516 0.509)

	Surface
	{
		SurfStyle       0.151245
		OceanStyle      0.802433
		Randomize      (-0.371, 0.068, -0.479)
		colorDistMagn   0.0615535
		colorDistFreq   123.465
		detailScale     2681.8
		colorConversion true
		drivenDarkening 0
		seaLevel        0.24691
		snowLevel       2
		tropicLatitude  0.0494039
		icecapLatitude  10
		icecapHeight    0.17935
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.9384
		venusFreq       0.779692
		venusMagn       0
		mareFreq        0.364948
		mareDensity     0.00137071
		terraceProb     0.116042
		erosion         0
		montesMagn      0.0455604
		montesFreq      65.0818
		montesSpiky     0.897282
		montesFraction  0.250471
		dunesMagn       0.0473701
		dunesFreq       1390.73
		dunesFraction   0.0487517
		hillsMagn       0.12411
		hillsFreq       120.19
		hillsFraction   0.593578
		hills2Fraction  0
		riversMagn      57.1283
		riversFreq      3.57719
		riversSin       5.58108
		riversOctaves   0
		canyonsMagn     0.436451
		canyonsFreq     0.389494
		canyonFraction  0.234891
		cracksMagn      0.0370191
		cracksFreq      0.662569
		cracksOctaves   0
		craterMagn      0.614557
		craterFreq      3.08836
		craterDensity   0.873489
		craterOctaves   10
		craterRayedFactor 0.08659
		volcanoMagn     0.160525
		volcanoFreq     0.63117
		volcanoDensity  0.218074
		volcanoOctaves  3
		volcanoActivity 0.159417
		volcanoFlows    0.426225
		volcanoRadius   0.160519
		volcanoTemp     1678.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.930, 0.860, 0.490, 0.000)
		colorShelf     (0.840, 0.980, 0.460, 0.000)
		colorBeach     (0.443, 0.335, 0.148, 0.000)
		colorDesert    (0.427, 0.315, 0.143, 0.000)
		colorLowland   (0.401, 0.382, 0.138, 0.000)
		colorUpland    (0.417, 0.402, 0.173, 0.000)
		colorRock      (0.940, 0.680, 0.280, 0.000)
		colorSnow      (0.940, 0.450, 0.180, 1.000)
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
		SemiMajorAxis   0.00428192
		Period          0.0155133
		Eccentricity    0.0109185
		Inclination     1.44887
		AscendingNode   -24.4846
		ArgOfPericenter -153.822
		MeanAnomaly     65.5124
	}
}

Moon	"Tion System 3.4"
{
	ParentBody     "Tion System 3"
	Class	       "Selena"

	Mass            0.00298786
	Radius          965.209
	InertiaMoment   0.398504

	Obliquity       -1.31147
	EqAscendNode    65.6712
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.678 0.674 0.670)

	Surface
	{
		SurfStyle       0.483266
		OceanStyle      0.661038
		Randomize      (0.417, 0.584, -0.872)
		colorDistMagn   0.0437524
		colorDistFreq   133.471
		detailScale     2482.57
		colorConversion true
		drivenDarkening 0
		seaLevel        0.185335
		snowLevel       2
		tropicLatitude  0.0384541
		icecapLatitude  10
		icecapHeight    0.213168
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.79429
		venusFreq       0.582991
		venusMagn       0
		mareFreq        0.329815
		mareDensity     0.00317771
		terraceProb     0.183783
		erosion         0
		montesMagn      0.0687593
		montesFreq      56.1711
		montesSpiky     0.955816
		montesFraction  0.537661
		dunesMagn       0.0571925
		dunesFreq       1263.04
		dunesFraction   0.699915
		hillsMagn       0.11804
		hillsFreq       114.682
		hillsFraction   0.801115
		hills2Fraction  0
		riversMagn      70.241
		riversFreq      3.37447
		riversSin       5.90518
		riversOctaves   0
		canyonsMagn     0.723172
		canyonsFreq     0.41608
		canyonFraction  0.957695
		cracksMagn      0.0369466
		cracksFreq      0.586455
		cracksOctaves   0
		craterMagn      0.650747
		craterFreq      2.33766
		craterDensity   0.818082
		craterOctaves   10
		craterRayedFactor 0.239712
		volcanoMagn     0.167159
		volcanoFreq     0.756025
		volcanoDensity  0.224525
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.217064
		volcanoRadius   0.135026
		volcanoTemp     1993.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.750, 0.750, 0.750, 0.000)
		colorShelf     (0.710, 0.710, 0.710, 0.000)
		colorBeach     (0.380, 0.378, 0.422, 0.000)
		colorDesert    (0.509, 0.506, 0.503, 0.000)
		colorLowland   (0.360, 0.357, 0.355, 0.000)
		colorUpland    (0.407, 0.405, 0.429, 0.000)
		colorRock      (0.630, 0.630, 0.630, 0.000)
		colorSnow      (0.870, 0.870, 0.870, 1.000)
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
		SemiMajorAxis   0.00707849
		Period          0.0329728
		Eccentricity    0.0160369
		Inclination     -1.31147
		AscendingNode   65.6712
		ArgOfPericenter -64.4247
		MeanAnomaly     42.1592
	}
}

DwarfMoon	"Tion System 3.D6"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            7.62824e-009
	Radius          15.5802
	InertiaMoment   0.397536

	RotationPeriod  411.197
	Obliquity       25.2468
	EqAscendNode    3.02478
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.416 0.413 0.409)

	Surface
	{
		SurfStyle       0.646884
		OceanStyle      0.200425
		Randomize      (-0.214, -0.344, 0.357)
		colorDistMagn   0.511361
		colorDistFreq   0.151015
		detailScale     425.442
		colorConversion true
		snowLevel       2
		tropicLatitude  0.988072
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.713887
		terraceProb     0.118154
		erosion         0
		montesMagn      0.670619
		montesFreq      3.16495
		montesSpiky     0.960016
		montesFraction  0.523644
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.480868
		hillsFraction   0.808328
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.280472
		craterFreq      0.181804
		craterDensity   0.891117
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533952
		volcanoTemp     1483.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.349, 0.268, 0.082, 0.950)
		colorShelf     (0.333, 0.276, 0.106, 0.980)
		colorBeach     (0.358, 0.276, 0.090, 0.000)
		colorDesert    (0.345, 0.281, 0.090, 0.000)
		colorLowland   (0.353, 0.285, 0.102, 0.930)
		colorUpland    (0.349, 0.268, 0.086, 0.950)
		colorRock      (0.337, 0.272, 0.094, 0.920)
		colorSnow      (0.345, 0.293, 0.094, 1.000)
		BumpHeight      14.0221
		BumpOffset      2.80443
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
		SemiMajorAxis   0.0301733
		Period          0.290192
		Eccentricity    0.246333
		Inclination     55.9202
		AscendingNode   2.85764
		ArgOfPericenter 103.046
		MeanAnomaly     24.3196
	}
}

DwarfMoon	"Tion System 3.D7"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.04286e-008
	Radius          16.288
	InertiaMoment   0.398858

	RotationPeriod  370.95
	Obliquity       -10.567
	EqAscendNode    49.9016
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.728 0.684 0.606)

	Surface
	{
		SurfStyle       0.714225
		OceanStyle      0.735966
		Randomize      (-0.005, -0.725, 0.867)
		colorDistMagn   0.157736
		colorDistFreq   0.0267728
		detailScale     444.771
		colorConversion true
		snowLevel       2
		tropicLatitude  0.592452
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.473108
		terraceProb     0.148564
		erosion         0
		montesMagn      0.501127
		montesFreq      3.21589
		montesSpiky     0.941898
		montesFraction  0.159235
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.72264
		hillsFraction   0.500621
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239851
		craterFreq      0.162375
		craterDensity   1.09566
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501388
		volcanoTemp     1787.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.612, 0.383, 0.176, 0.000)
		colorShelf     (0.583, 0.424, 0.212, 0.000)
		colorBeach     (0.626, 0.383, 0.188, 0.000)
		colorDesert    (0.605, 0.396, 0.188, 0.000)
		colorLowland   (0.619, 0.410, 0.206, 0.000)
		colorUpland    (0.612, 0.383, 0.170, 0.000)
		colorRock      (0.590, 0.410, 0.200, 0.000)
		colorSnow      (0.605, 0.424, 0.206, 1.000)
		BumpHeight      14.6592
		BumpOffset      2.93184
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
		SemiMajorAxis   0.0304711
		Period          0.294499
		Eccentricity    0.212235
		Inclination     -28.7857
		AscendingNode   50.6776
		ArgOfPericenter 17.643
		MeanAnomaly     71.8096
	}
}

DwarfMoon	"Tion System 3.D8"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.42107e-008
	Radius          31.7875
	InertiaMoment   0.399794

	RotationPeriod  566.577
	Obliquity       74.7663
	EqAscendNode    -30.4825
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.671 0.607 0.534)

	Surface
	{
		SurfStyle       0.075974
		OceanStyle      0.794338
		Randomize      (-0.529, -0.118, -0.703)
		colorDistMagn   0.252936
		colorDistFreq   0.621321
		detailScale     868.01
		colorConversion true
		snowLevel       2
		tropicLatitude  0.693827
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.346133
		terraceProb     0.225766
		erosion         0
		montesMagn      0.347827
		montesFreq      3.34166
		montesSpiky     0.964796
		montesFraction  0.658965
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.49381
		hillsFraction   0.772987
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249117
		craterFreq      0.190452
		craterDensity   0.714209
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484576
		volcanoTemp     1406.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.243, 0.176, 0.000)
		colorShelf     (0.262, 0.255, 0.192, 0.000)
		colorBeach     (0.282, 0.273, 0.213, 0.000)
		colorDesert    (0.295, 0.285, 0.208, 0.000)
		colorLowland   (0.316, 0.303, 0.229, 0.000)
		colorUpland    (0.336, 0.322, 0.240, 0.000)
		colorRock      (0.342, 0.334, 0.251, 0.000)
		colorSnow      (0.363, 0.352, 0.256, 1.000)
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
		SemiMajorAxis   0.0310052
		Period          0.302276
		Eccentricity    0.387359
		Inclination     72.0255
		AscendingNode   -29.1892
		ArgOfPericenter -74.9576
		MeanAnomaly     -46.5416
	}
}

DwarfMoon	"Tion System 3.D9"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.93202e-008
	Radius          23.3725
	InertiaMoment   0.397784

	RotationPeriod  380.981
	Obliquity       32.2788
	EqAscendNode    -142.371
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.450 0.445 0.444)

	Surface
	{
		SurfStyle       0.043225
		OceanStyle      0.334475
		Randomize      (0.100, -0.467, 0.639)
		colorDistMagn   0.784938
		colorDistFreq   0.256584
		detailScale     638.224
		colorConversion true
		snowLevel       2
		tropicLatitude  0.839767
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.490453
		terraceProb     0.274622
		erosion         0
		montesMagn      0.498327
		montesFreq      2.2195
		montesSpiky     0.955082
		montesFraction  0.593555
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.29482
		hillsFraction   0.808534
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241554
		craterFreq      0.241905
		craterDensity   0.879113
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.629746
		volcanoTemp     1551.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.178, 0.146, 0.000)
		colorShelf     (0.176, 0.187, 0.160, 0.000)
		colorBeach     (0.189, 0.200, 0.177, 0.000)
		colorDesert    (0.198, 0.209, 0.173, 0.000)
		colorLowland   (0.212, 0.223, 0.191, 0.000)
		colorUpland    (0.225, 0.236, 0.200, 0.000)
		colorRock      (0.230, 0.245, 0.209, 0.000)
		colorSnow      (0.243, 0.258, 0.213, 1.000)
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
		SemiMajorAxis   0.0316131
		Period          0.311208
		Eccentricity    0.0781494
		Inclination     -29.7091
		AscendingNode   -136.31
		ArgOfPericenter 57.5838
		MeanAnomaly     -174.373
	}
}

DwarfMoon	"Tion System 3.D10"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            2.62301e-008
	Radius          23.736
	InertiaMoment   0.399002

	RotationPeriod  337.118
	Obliquity       -44.1192
	EqAscendNode    -155.868
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.434 0.427 0.425)

	Surface
	{
		SurfStyle       0.308494
		OceanStyle      0.973068
		Randomize      (-0.193, 0.221, -0.817)
		colorDistMagn   0.941788
		colorDistFreq   0.230537
		detailScale     648.151
		colorConversion true
		snowLevel       2
		tropicLatitude  0.544042
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.730076
		terraceProb     0.298598
		erosion         0
		montesMagn      0.590517
		montesFreq      3.69367
		montesSpiky     0.955354
		montesFraction  0.550558
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.30925
		hillsFraction   0.709097
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.278044
		craterFreq      0.221331
		craterDensity   0.795829
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518218
		volcanoTemp     1580.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.124, 0.132, 0.000)
		colorShelf     (0.173, 0.137, 0.153, 0.000)
		colorBeach     (0.204, 0.158, 0.183, 0.000)
		colorDesert    (0.221, 0.167, 0.166, 0.000)
		colorLowland   (0.243, 0.180, 0.200, 0.000)
		colorUpland    (0.269, 0.218, 0.234, 0.000)
		colorRock      (0.291, 0.239, 0.259, 0.000)
		colorSnow      (0.317, 0.244, 0.272, 1.000)
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
		SemiMajorAxis   0.0320306
		Period          0.317395
		Eccentricity    0.459731
		Inclination     -67.5638
		AscendingNode   -151.423
		ArgOfPericenter -152.527
		MeanAnomaly     33.223
	}
}

DwarfMoon	"Tion System 3.D11"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            3.55925e-008
	Radius          24.7278
	InertiaMoment   0.399919

	RotationPeriod  304.416
	Obliquity       19.9093
	EqAscendNode    -63.6223
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.797 0.793 0.792)

	Surface
	{
		SurfStyle       0.771087
		OceanStyle      0.0223658
		Randomize      (-0.327, -0.509, -0.222)
		colorDistMagn   0.259448
		colorDistFreq   0.364687
		detailScale     675.235
		colorConversion true
		snowLevel       2
		tropicLatitude  0.834803
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.562006
		terraceProb     0.437512
		erosion         0
		montesMagn      0.497725
		montesFreq      2.90204
		montesSpiky     0.917936
		montesFraction  0.53303
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.26978
		hillsFraction   0.440664
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206543
		craterFreq      0.234378
		craterDensity   0.958132
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467952
		volcanoTemp     1372.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.670, 0.579, 0.245, 0.000)
		colorShelf     (0.638, 0.595, 0.277, 0.000)
		colorBeach     (0.686, 0.595, 0.253, 0.000)
		colorDesert    (0.662, 0.595, 0.245, 0.000)
		colorLowland   (0.678, 0.611, 0.261, 0.000)
		colorUpland    (0.670, 0.595, 0.245, 0.000)
		colorRock      (0.646, 0.595, 0.253, 0.000)
		colorSnow      (0.662, 0.627, 0.261, 1.000)
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
		SemiMajorAxis   0.0326782
		Period          0.327068
		Eccentricity    0.373765
		Inclination     43.0084
		AscendingNode   -53.8565
		ArgOfPericenter 42.4832
		MeanAnomaly     -56.7818
	}
}

DwarfMoon	"Tion System 3.D12"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            4.83128e-008
	Radius          25.6616
	InertiaMoment   0.398002

	RotationPeriod  273.727
	Obliquity       -48.8969
	EqAscendNode    163.546
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.445 0.439 0.432)

	Surface
	{
		SurfStyle       0.702752
		OceanStyle      0.141004
		Randomize      (0.456, -0.979, -0.015)
		colorDistMagn   0.272357
		colorDistFreq   0.517658
		detailScale     700.734
		colorConversion true
		snowLevel       2
		tropicLatitude  0.297693
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.690364
		terraceProb     0.295937
		erosion         0
		montesMagn      0.445661
		montesFreq      2.18041
		montesSpiky     0.965248
		montesFraction  0.521707
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.01442
		hillsFraction   0.660102
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250646
		craterFreq      0.265233
		craterDensity   0.958103
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55762
		volcanoTemp     1341.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.374, 0.246, 0.125, 0.000)
		colorShelf     (0.356, 0.272, 0.151, 0.000)
		colorBeach     (0.382, 0.246, 0.134, 0.000)
		colorDesert    (0.369, 0.254, 0.134, 0.000)
		colorLowland   (0.378, 0.263, 0.147, 0.000)
		colorUpland    (0.374, 0.246, 0.121, 0.000)
		colorRock      (0.360, 0.263, 0.143, 0.000)
		colorSnow      (0.369, 0.272, 0.147, 1.000)
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
		SemiMajorAxis   0.0329869
		Period          0.331714
		Eccentricity    0.157547
		Inclination     -35.4414
		AscendingNode   163.548
		ArgOfPericenter 164.161
		MeanAnomaly     130.662
	}
}

DwarfMoon	"Tion System 3.D13"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            6.56579e-008
	Radius          62.7489
	InertiaMoment   0.399141

	RotationPeriod  510.921
	Obliquity       35.7318
	EqAscendNode    57.9773
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.646 0.563 0.492)

	Surface
	{
		SurfStyle       0.0335617
		OceanStyle      0.58332
		Randomize      (-0.768, -0.869, -0.405)
		colorDistMagn   0.787359
		colorDistFreq   3.44642
		detailScale     1713.46
		colorConversion true
		snowLevel       2
		tropicLatitude  0.690679
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.480306
		terraceProb     0.275475
		erosion         0
		montesMagn      0.480509
		montesFreq      3.25621
		montesSpiky     0.946173
		montesFraction  0.422564
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.88776
		hillsFraction   0.786081
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269393
		craterFreq      0.154217
		craterDensity   0.983265
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457913
		volcanoTemp     1155.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.225, 0.197, 0.000)
		colorShelf     (0.271, 0.237, 0.207, 0.000)
		colorBeach     (0.291, 0.254, 0.221, 0.000)
		colorDesert    (0.304, 0.265, 0.231, 0.000)
		colorLowland   (0.323, 0.282, 0.246, 0.000)
		colorUpland    (0.343, 0.299, 0.261, 0.000)
		colorRock      (0.356, 0.310, 0.271, 0.000)
		colorSnow      (0.375, 0.327, 0.285, 1.000)
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
		SemiMajorAxis   0.0332612
		Period          0.33586
		Eccentricity    0.00436242
		Inclination     13.775
		AscendingNode   62.0144
		ArgOfPericenter -51.4717
		MeanAnomaly     -2.80088
	}
}

DwarfMoon	"Tion System 3.D14"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            8.94169e-008
	Radius          36.0725
	InertiaMoment   0.395252

	RotationPeriod  279.746
	Obliquity       -5.70841
	EqAscendNode    -31.8528
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.522 0.517 0.512)

	Surface
	{
		SurfStyle       0.465993
		OceanStyle      0.0169121
		Randomize      (-0.503, 0.248, 0.869)
		colorDistMagn   0.869576
		colorDistFreq   0.963853
		detailScale     985.021
		colorConversion true
		snowLevel       2
		tropicLatitude  0.77704
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.741671
		terraceProb     0.168875
		erosion         0
		montesMagn      0.297613
		montesFreq      3.04437
		montesSpiky     0.998884
		montesFraction  0.642942
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.40128
		hillsFraction   0.678027
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23343
		craterFreq      0.210439
		craterDensity   0.836038
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.583715
		volcanoTemp     1615.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.156, 0.150, 0.205, 0.000)
		colorShelf     (0.188, 0.176, 0.236, 0.000)
		colorBeach     (0.214, 0.202, 0.266, 0.000)
		colorDesert    (0.245, 0.217, 0.302, 0.000)
		colorLowland   (0.266, 0.253, 0.333, 0.000)
		colorUpland    (0.297, 0.274, 0.364, 0.000)
		colorRock      (0.323, 0.300, 0.405, 0.000)
		colorSnow      (0.323, 0.300, 0.405, 1.000)
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
		SemiMajorAxis   0.0339065
		Period          0.345681
		Eccentricity    0.355083
		Inclination     -46.1346
		AscendingNode   -33.092
		ArgOfPericenter 89.2835
		MeanAnomaly     -177.917
	}
}

DwarfMoon	"Tion System 3.D15"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.22142e-007
	Radius          37.6077
	InertiaMoment   0.398198

	RotationPeriod  253.317
	Obliquity       -9.58617
	EqAscendNode    -135.684
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.781 0.722 0.622)

	Surface
	{
		SurfStyle       0.85666
		OceanStyle      0.0339108
		Randomize      (-0.475, -0.214, 0.584)
		colorDistMagn   0.716818
		colorDistFreq   0.728702
		detailScale     1026.94
		colorConversion true
		snowLevel       2
		tropicLatitude  0.211208
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48306
		terraceProb     0.258697
		erosion         0
		montesMagn      0.574594
		montesFreq      2.8586
		montesSpiky     0.785057
		montesFraction  0.58085
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.29211
		hillsFraction   0.787905
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266266
		craterFreq      0.214487
		craterDensity   0.893744
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530208
		volcanoTemp     2011.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.632, 0.354, 0.050, 0.000)
		colorShelf     (0.656, 0.325, 0.044, 0.000)
		colorBeach     (0.593, 0.318, 0.062, 0.000)
		colorDesert    (0.648, 0.325, 0.056, 0.000)
		colorLowland   (0.640, 0.354, 0.050, 0.000)
		colorUpland    (0.640, 0.332, 0.044, 0.000)
		colorRock      (0.648, 0.340, 0.044, 0.000)
		colorSnow      (0.648, 0.325, 0.056, 1.000)
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
		SemiMajorAxis   0.034274
		Period          0.351317
		Eccentricity    0.321024
		Inclination     3.19041
		AscendingNode   -139.683
		ArgOfPericenter 123.508
		MeanAnomaly     45.6928
	}
}

DwarfMoon	"Tion System 3.D16"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.67516e-007
	Radius          73.6509
	InertiaMoment   0.399276

	RotationPeriod  394.691
	Obliquity       78.7851
	EqAscendNode    -85.2977
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.676 0.592 0.506)

	Surface
	{
		SurfStyle       0.693906
		OceanStyle      0.877027
		Randomize      (0.349, -0.836, -0.211)
		colorDistMagn   0.765075
		colorDistFreq   3.49147
		detailScale     2011.16
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99763
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.646814
		terraceProb     0.39459
		erosion         0
		montesMagn      0.310243
		montesFreq      3.41118
		montesSpiky     0.956826
		montesFraction  0.566812
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.9912
		hillsFraction   0.80965
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229216
		craterFreq      0.233512
		craterDensity   0.828689
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483581
		volcanoTemp     1230.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.568, 0.331, 0.147, 0.000)
		colorShelf     (0.541, 0.367, 0.177, 0.000)
		colorBeach     (0.582, 0.331, 0.157, 0.000)
		colorDesert    (0.561, 0.343, 0.157, 0.000)
		colorLowland   (0.575, 0.355, 0.172, 0.000)
		colorUpland    (0.568, 0.331, 0.142, 0.000)
		colorRock      (0.548, 0.355, 0.167, 0.000)
		colorSnow      (0.561, 0.367, 0.172, 1.000)
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
		SemiMajorAxis   0.0347781
		Period          0.359096
		Eccentricity    0.13804
		Inclination     79.8542
		AscendingNode   -83.8729
		ArgOfPericenter -60.1337
		MeanAnomaly     -54.4504
	}
}

DwarfMoon	"Tion System 3.D17"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            2.30923e-007
	Radius          55.6727
	InertiaMoment   0.396342

	RotationPeriod  269.389
	Obliquity       22.2366
	EqAscendNode    162.976
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.651 0.644 0.641)

	Surface
	{
		SurfStyle       0.803355
		OceanStyle      0.482944
		Randomize      (-0.710, -0.169, -0.717)
		colorDistMagn   0.770361
		colorDistFreq   1.39798
		detailScale     1520.24
		colorConversion true
		snowLevel       2
		tropicLatitude  0.972596
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.57365
		terraceProb     0.451847
		erosion         0
		montesMagn      0.50783
		montesFreq      3.17937
		montesSpiky     0.88861
		montesFraction  0.877322
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.49897
		hillsFraction   0.575601
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231149
		craterFreq      0.193058
		craterDensity   0.877002
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485801
		volcanoTemp     1336.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.547, 0.470, 0.199, 0.000)
		colorShelf     (0.521, 0.483, 0.224, 0.000)
		colorBeach     (0.560, 0.483, 0.205, 0.000)
		colorDesert    (0.541, 0.483, 0.199, 0.000)
		colorLowland   (0.554, 0.496, 0.212, 0.000)
		colorUpland    (0.547, 0.483, 0.199, 0.000)
		colorRock      (0.528, 0.483, 0.205, 0.000)
		colorSnow      (0.541, 0.509, 0.212, 1.000)
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
		SemiMajorAxis   0.0351797
		Period          0.365334
		Eccentricity    0.151882
		Inclination     -55.7043
		AscendingNode   157.604
		ArgOfPericenter -130.688
		MeanAnomaly     24.8303
	}
}

DwarfMoon	"Tion System 3.D18"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            3.20344e-007
	Radius          100.267
	InertiaMoment   0.398378

	RotationPeriod  388.543
	Obliquity       -79.188
	EqAscendNode    -42.8007
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.759 0.677 0.571)

	Surface
	{
		SurfStyle       0.854057
		OceanStyle      0.311328
		Randomize      (0.865, 0.877, -0.578)
		colorDistMagn   0.503199
		colorDistFreq   7.81444
		detailScale     2737.95
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994179
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.488697
		terraceProb     0.414541
		erosion         0
		montesMagn      0.598042
		montesFreq      3.03967
		montesSpiky     0.969668
		montesFraction  0.640458
		dunesFraction   0
		hillsMagn       0
		hillsFreq       30.3767
		hillsFraction   0.659819
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218885
		craterFreq      0.409547
		craterDensity   0.988594
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492108
		volcanoTemp     1671.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.614, 0.332, 0.046, 0.000)
		colorShelf     (0.637, 0.305, 0.040, 0.000)
		colorBeach     (0.577, 0.298, 0.057, 0.000)
		colorDesert    (0.630, 0.305, 0.051, 0.000)
		colorLowland   (0.622, 0.332, 0.046, 0.000)
		colorUpland    (0.622, 0.311, 0.040, 0.000)
		colorRock      (0.630, 0.318, 0.040, 0.000)
		colorSnow      (0.630, 0.305, 0.051, 1.000)
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
		SemiMajorAxis   0.0354997
		Period          0.37033
		Eccentricity    0.334794
		Inclination     -6.24471
		AscendingNode   -42.534
		ArgOfPericenter 78.2882
		MeanAnomaly     -166.615
	}
}

DwarfMoon	"Tion System 3.D19"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            4.47812e-007
	Radius          58.4725
	InertiaMoment   0.399408

	RotationPeriod  209.795
	Obliquity       34.8418
	EqAscendNode    -92.4875
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.547 0.539 0.536)

	Surface
	{
		SurfStyle       0.555855
		OceanStyle      0.551551
		Randomize      (-0.481, -0.290, 0.429)
		colorDistMagn   0.795246
		colorDistFreq   1.28258
		detailScale     1596.69
		colorConversion true
		snowLevel       2
		tropicLatitude  0.57434
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.677598
		terraceProb     0.505564
		erosion         0
		montesMagn      0.456287
		montesFreq      3.37435
		montesSpiky     0.954367
		montesFraction  0.690966
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.9931
		hillsFraction   0.866016
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.228033
		craterFreq      0.150413
		craterDensity   1.02106
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469953
		volcanoTemp     1399.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.159, 0.189, 0.214, 0.000)
		colorShelf     (0.180, 0.232, 0.246, 0.000)
		colorBeach     (0.197, 0.253, 0.279, 0.000)
		colorDesert    (0.241, 0.286, 0.316, 0.000)
		colorLowland   (0.268, 0.323, 0.348, 0.000)
		colorUpland    (0.350, 0.442, 0.472, 0.000)
		colorRock      (0.306, 0.388, 0.423, 0.000)
		colorSnow      (0.306, 0.377, 0.423, 1.000)
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
		SemiMajorAxis   0.0357296
		Period          0.373932
		Eccentricity    0.33337
		Inclination     -1.17656
		AscendingNode   -99.5323
		ArgOfPericenter -15.5675
		MeanAnomaly     -138.75
	}
}

DwarfMoon	"Tion System 3.D20"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            6.31807e-007
	Radius          61.729
	InertiaMoment   0.396867

	RotationPeriod  187.785
	Obliquity       -127.408
	EqAscendNode    -110.428
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.484 0.477 0.474)

	Surface
	{
		SurfStyle       0.773907
		OceanStyle      0.469217
		Randomize      (0.537, -0.252, 0.844)
		colorDistMagn   0.998894
		colorDistFreq   2.39554
		detailScale     1685.61
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999021
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.713756
		terraceProb     0.218388
		erosion         0
		montesMagn      0.509265
		montesFreq      2.18175
		montesSpiky     0.882087
		montesFraction  0.265043
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.64421
		hillsFraction   0.51292
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210944
		craterFreq      0.24428
		craterDensity   0.97929
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.437389
		volcanoTemp     1648.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.407, 0.349, 0.147, 0.000)
		colorShelf     (0.387, 0.358, 0.166, 0.000)
		colorBeach     (0.416, 0.358, 0.152, 0.000)
		colorDesert    (0.402, 0.358, 0.147, 0.000)
		colorLowland   (0.411, 0.368, 0.156, 0.000)
		colorUpland    (0.407, 0.358, 0.147, 0.000)
		colorRock      (0.392, 0.358, 0.152, 0.000)
		colorSnow      (0.402, 0.377, 0.156, 1.000)
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
		SemiMajorAxis   0.0361248
		Period          0.380154
		Eccentricity    0.0476485
		Inclination     -68.1342
		AscendingNode   -111.526
		ArgOfPericenter -145.221
		MeanAnomaly     -55.3316
	}
}

DwarfMoon	"Tion System 3.D21"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            9.01318e-007
	Radius          157.314
	InertiaMoment   0.398546

	RotationPeriod  367.135
	Obliquity       -82.8753
	EqAscendNode    -28.2574
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.600 0.408 0.337)

	Surface
	{
		SurfStyle       0.647912
		OceanStyle      0.579738
		Randomize      (0.321, 0.627, 0.422)
		colorDistMagn   0.00917339
		colorDistFreq   18.2856
		detailScale     4295.71
		colorConversion true
		snowLevel       2
		tropicLatitude  0.636052
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.65786
		terraceProb     0.160399
		erosion         0
		montesMagn      0.517916
		montesFreq      3.38977
		montesSpiky     0.82306
		montesFraction  0.372757
		dunesFraction   0
		hillsMagn       0
		hillsFreq       65.3237
		hillsFraction   0.809228
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26726
		craterFreq      0.776609
		craterDensity   0.962037
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457541
		volcanoTemp     1293.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.504, 0.265, 0.067, 0.950)
		colorShelf     (0.480, 0.273, 0.088, 0.980)
		colorBeach     (0.516, 0.273, 0.074, 0.000)
		colorDesert    (0.498, 0.277, 0.074, 0.000)
		colorLowland   (0.510, 0.281, 0.084, 0.930)
		colorUpland    (0.504, 0.265, 0.071, 0.950)
		colorRock      (0.486, 0.269, 0.078, 0.920)
		colorSnow      (0.498, 0.289, 0.078, 1.000)
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
		SemiMajorAxis   0.0365891
		Period          0.387506
		Eccentricity    0.241472
		Inclination     -73.4474
		AscendingNode   -31.9597
		ArgOfPericenter -93.5369
		MeanAnomaly     -55.4006
	}
}

DwarfMoon	"Tion System 3.D22"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.30295e-006
	Radius          89.9952
	InertiaMoment   0.399538

	RotationPeriod  190.966
	Obliquity       77.0652
	EqAscendNode    -76.977
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.579 0.576 0.573)

	Surface
	{
		SurfStyle       0.581801
		OceanStyle      0.310821
		Randomize      (0.303, -0.187, -0.885)
		colorDistMagn   0.564409
		colorDistFreq   1.19762
		detailScale     2457.47
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99369
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.50158
		terraceProb     0.263076
		erosion         0
		montesMagn      0.464695
		montesFreq      3.09996
		montesSpiky     0.796528
		montesFraction  0.532476
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.1419
		hillsFraction   0.747078
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26037
		craterFreq      0.273055
		craterDensity   0.866327
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533353
		volcanoTemp     1807.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.498, 0.438, 0.333, 0.000)
		colorShelf     (0.255, 0.196, 0.143, 0.000)
		colorBeach     (0.579, 0.484, 0.000, 0.000)
		colorDesert    (0.446, 0.403, 0.201, 0.000)
		colorLowland   (0.481, 0.392, 0.126, 0.270)
		colorUpland    (0.347, 0.230, 0.046, 0.000)
		colorRock      (0.127, 0.109, 0.063, 0.000)
		colorSnow      (0.452, 0.449, 0.447, 1.000)
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
		SemiMajorAxis   0.0369324
		Period          0.392974
		Eccentricity    0.184081
		Inclination     74.7157
		AscendingNode   -79.5102
		ArgOfPericenter 149.921
		MeanAnomaly     177.739
	}
}

DwarfMoon	"Tion System 3.D23"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.91376e-006
	Radius          175.29
	InertiaMoment   0.397237

	RotationPeriod  291.4
	Obliquity       70.5977
	EqAscendNode    135.409
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.626 0.620 0.617)

	Surface
	{
		SurfStyle       0.382937
		OceanStyle      0.0218446
		Randomize      (0.890, 0.005, -0.328)
		colorDistMagn   0.0714906
		colorDistFreq   27.0301
		detailScale     4786.59
		colorConversion true
		snowLevel       2
		tropicLatitude  0.679344
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.724395
		terraceProb     0.330754
		erosion         0
		montesMagn      0.485801
		montesFreq      3.53823
		montesSpiky     0.911969
		montesFraction  0.5107
		dunesFraction   0
		hillsMagn       0
		hillsFreq       50.3786
		hillsFraction   0.63627
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226893
		craterFreq      1.13618
		craterDensity   1.00269
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506363
		volcanoTemp     1582.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.213, 0.217, 0.247, 0.050)
		colorShelf     (0.250, 0.254, 0.284, 0.040)
		colorBeach     (0.288, 0.292, 0.321, 0.030)
		colorDesert    (0.325, 0.329, 0.364, 0.020)
		colorLowland   (0.363, 0.366, 0.401, 0.030)
		colorUpland    (0.401, 0.403, 0.438, 0.050)
		colorRock      (0.438, 0.440, 0.488, 0.020)
		colorSnow      (0.438, 0.440, 0.488, 1.000)
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
		SemiMajorAxis   0.0374491
		Period          0.401249
		Eccentricity    0.322973
		Inclination     56.0329
		AscendingNode   134.492
		ArgOfPericenter -105.402
		MeanAnomaly     160.032
	}
}

DwarfMoon	"Tion System 3.D24"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            2.86553e-006
	Radius          103.138
	InertiaMoment   0.398704

	RotationPeriod  150.318
	Obliquity       66.9579
	EqAscendNode    160.5
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.475 0.472 0.470)

	Surface
	{
		SurfStyle       0.88227
		OceanStyle      0.709274
		Randomize      (0.289, 0.737, -0.877)
		colorDistMagn   0.164263
		colorDistFreq   7.93977
		detailScale     2816.35
		colorConversion true
		snowLevel       2
		tropicLatitude  0.533739
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.675779
		terraceProb     0.195375
		erosion         0
		montesMagn      0.599013
		montesFreq      3.65778
		montesSpiky     0.862278
		montesFraction  0.516689
		dunesFraction   0
		hillsMagn       0
		hillsFreq       22.3244
		hillsFraction   0.612704
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224615
		craterFreq      0.373731
		craterDensity   0.856077
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476289
		volcanoTemp     1481.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.385, 0.274, 0.103, 0.000)
		colorShelf     (0.399, 0.297, 0.089, 0.000)
		colorBeach     (0.361, 0.274, 0.089, 0.000)
		colorDesert    (0.395, 0.274, 0.089, 0.000)
		colorLowland   (0.390, 0.297, 0.085, 0.000)
		colorUpland    (0.390, 0.344, 0.103, 0.000)
		colorRock      (0.395, 0.297, 0.099, 0.000)
		colorSnow      (0.395, 0.307, 0.113, 1.000)
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
		SemiMajorAxis   0.0378544
		Period          0.40778
		Eccentricity    0.487996
		Inclination     38.1404
		AscendingNode   161.141
		ArgOfPericenter 157.148
		MeanAnomaly     -17.3085
	}
}

DwarfMoon	"Tion System 3.D25"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            4.39262e-006
	Radius          158.892
	InertiaMoment   0.399665

	RotationPeriod  184.334
	Obliquity       -18.5442
	EqAscendNode    -10.7107
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.782 0.780 0.779)

	Surface
	{
		SurfStyle       0.83404
		OceanStyle      0.117964
		Randomize      (0.317, -0.348, 0.427)
		colorDistMagn   0.360851
		colorDistFreq   16.9086
		detailScale     4338.8
		colorConversion true
		snowLevel       2
		tropicLatitude  0.553767
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.429601
		terraceProb     0.24012
		erosion         0
		montesMagn      0.472092
		montesFreq      3.4716
		montesSpiky     0.908224
		montesFraction  0.243459
		dunesFraction   0
		hillsMagn       0
		hillsFreq       45.1988
		hillsFraction   0.634104
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233421
		craterFreq      0.867548
		craterDensity   0.99556
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.590763
		volcanoTemp     1170.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.633, 0.390, 0.148, 0.550)
		colorShelf     (0.657, 0.421, 0.125, 0.480)
		colorBeach     (0.594, 0.367, 0.140, 0.600)
		colorDesert    (0.649, 0.398, 0.148, 0.600)
		colorLowland   (0.641, 0.413, 0.140, 0.630)
		colorUpland    (0.641, 0.406, 0.140, 0.550)
		colorRock      (0.649, 0.413, 0.140, 0.420)
		colorSnow      (0.649, 0.421, 0.164, 1.000)
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
		SemiMajorAxis   0.0382368
		Period          0.413974
		Eccentricity    0.126709
		Inclination     51.8867
		AscendingNode   -8.46755
		ArgOfPericenter -27.8649
		MeanAnomaly     0.710621
	}
}

DwarfMoon	"Tion System 3.D26"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.17334e-011
	Radius          3.3808
	InertiaMoment   0.397531

	RotationPeriod  1222.82
	Obliquity       17.2643
	EqAscendNode    97.2605
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.741 0.658 0.580)

	Surface
	{
		SurfStyle       0.0378692
		OceanStyle      0.429952
		Randomize      (0.209, 0.135, 0.838)
		colorDistMagn   0.954096
		colorDistFreq   0.00819272
		detailScale     92.3184
		colorConversion true
		snowLevel       2
		tropicLatitude  0.312757
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.513077
		terraceProb     0.228399
		erosion         0
		montesMagn      0.60421
		montesFreq      3.35747
		montesSpiky     0.988442
		montesFraction  0.379549
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0315557
		hillsFraction   0.363934
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24692
		craterFreq      0.200332
		craterDensity   1.02119
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503259
		volcanoTemp     1660.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.296, 0.263, 0.232, 0.000)
		colorShelf     (0.311, 0.276, 0.244, 0.000)
		colorBeach     (0.333, 0.296, 0.261, 0.000)
		colorDesert    (0.348, 0.309, 0.273, 0.000)
		colorLowland   (0.370, 0.329, 0.290, 0.000)
		colorUpland    (0.393, 0.349, 0.308, 0.000)
		colorRock      (0.408, 0.362, 0.319, 0.000)
		colorSnow      (0.430, 0.382, 0.337, 1.000)
		BumpHeight      3.04272
		BumpOffset      0.608544
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
		SemiMajorAxis   0.0386624
		Period          0.420906
		Eccentricity    0.0709739
		Inclination     8.41888
		AscendingNode   96.8437
		ArgOfPericenter -74.7573
		MeanAnomaly     -86.1196
	}
}

DwarfMoon	"Tion System 3.D27"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            2.40871e-011
	Radius          2.24477
	InertiaMoment   0.398855

	RotationPeriod  794.382
	Obliquity       74.6727
	EqAscendNode    -126.115
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.550 0.485 0.383)

	Surface
	{
		SurfStyle       0.784029
		OceanStyle      0.933237
		Randomize      (0.582, 0.341, -0.381)
		colorDistMagn   0.066563
		colorDistFreq   0.00331288
		detailScale     61.2971
		colorConversion true
		snowLevel       2
		tropicLatitude  0.76439
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553544
		terraceProb     0.118525
		erosion         0
		montesMagn      0.561435
		montesFreq      2.76138
		montesSpiky     0.964911
		montesFraction  0.568515
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0136915
		hillsFraction   0.426191
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272677
		craterFreq      0.188164
		craterDensity   1.05031
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532014
		volcanoTemp     1855.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.462, 0.354, 0.119, 0.000)
		colorShelf     (0.440, 0.364, 0.134, 0.000)
		colorBeach     (0.473, 0.364, 0.123, 0.000)
		colorDesert    (0.456, 0.364, 0.119, 0.000)
		colorLowland   (0.467, 0.374, 0.126, 0.000)
		colorUpland    (0.462, 0.364, 0.119, 0.000)
		colorRock      (0.445, 0.364, 0.123, 0.000)
		colorSnow      (0.456, 0.383, 0.126, 1.000)
		BumpHeight      2.02029
		BumpOffset      0.404058
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
		SemiMajorAxis   0.0392149
		Period          0.429961
		Eccentricity    0.334816
		Inclination     80.0069
		AscendingNode   -129.09
		ArgOfPericenter -51.0288
		MeanAnomaly     120.305
	}
}

DwarfMoon	"Tion System 3.D28"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            4.48584e-011
	Radius          4.84525
	InertiaMoment   0.399791

	RotationPeriod  1049.82
	Obliquity       62.6759
	EqAscendNode    -129.325
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.440 0.435 0.428)

	Surface
	{
		SurfStyle       0.590853
		OceanStyle      0.607413
		Randomize      (-0.010, -0.090, 0.601)
		colorDistMagn   0.501635
		colorDistFreq   0.00743318
		detailScale     132.308
		colorConversion true
		snowLevel       2
		tropicLatitude  0.741776
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.439255
		terraceProb     0.375081
		erosion         0
		montesMagn      0.580387
		montesFreq      2.99946
		montesSpiky     0.909479
		montesFraction  0.387382
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0677176
		hillsFraction   0.598931
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23703
		craterFreq      0.220588
		craterDensity   0.859251
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.557514
		volcanoTemp     1473.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.379, 0.331, 0.248, 0.000)
		colorShelf     (0.194, 0.148, 0.107, 0.000)
		colorBeach     (0.440, 0.366, 0.000, 0.000)
		colorDesert    (0.339, 0.305, 0.150, 0.000)
		colorLowland   (0.365, 0.296, 0.094, 0.270)
		colorUpland    (0.264, 0.174, 0.034, 0.000)
		colorRock      (0.097, 0.083, 0.047, 0.000)
		colorSnow      (0.343, 0.339, 0.334, 1.000)
		BumpHeight      4.36072
		BumpOffset      0.872145
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
		SemiMajorAxis   0.0394482
		Period          0.433802
		Eccentricity    0.443519
		Inclination     58.669
		AscendingNode   -124.696
		ArgOfPericenter 20.8431
		MeanAnomaly     -57.5832
	}
}

DwarfMoon	"Tion System 3.D29"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            7.80209e-011
	Radius          2.8736
	InertiaMoment   0.397779

	RotationPeriod  628.028
	Obliquity       -66.352
	EqAscendNode    -32.5182
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.410 0.402 0.399)

	Surface
	{
		SurfStyle       0.0893674
		OceanStyle      0.494636
		Randomize      (-0.323, -0.375, 0.947)
		colorDistMagn   0.654407
		colorDistFreq   0.00418861
		detailScale     78.4686
		colorConversion true
		snowLevel       2
		tropicLatitude  0.940644
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.271913
		terraceProb     0.327959
		erosion         0
		montesMagn      0.372044
		montesFreq      2.587
		montesSpiky     0.973673
		montesFraction  0.680389
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0214101
		hillsFraction   0.769611
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255707
		craterFreq      0.219344
		craterDensity   0.913665
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450999
		volcanoTemp     1509.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.147, 0.133, 0.160, 0.000)
		colorShelf     (0.156, 0.137, 0.168, 0.000)
		colorBeach     (0.168, 0.145, 0.180, 0.000)
		colorDesert    (0.172, 0.157, 0.188, 0.000)
		colorLowland   (0.188, 0.165, 0.200, 0.000)
		colorUpland    (0.192, 0.169, 0.212, 0.000)
		colorRock      (0.201, 0.173, 0.220, 0.000)
		colorSnow      (0.213, 0.181, 0.232, 1.000)
		BumpHeight      2.58624
		BumpOffset      0.517249
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
		SemiMajorAxis   0.0399706
		Period          0.442448
		Eccentricity    0.293982
		Inclination     -50.667
		AscendingNode   -33.0869
		ArgOfPericenter 164.106
		MeanAnomaly     -74.507
	}
}

DwarfMoon	"Tion System 3.D30"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.29006e-010
	Radius          4.26697
	InertiaMoment   0.398999

	RotationPeriod  698.582
	Obliquity       26.6945
	EqAscendNode    147.208
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.644 0.580 0.471)

	Surface
	{
		SurfStyle       0.901972
		OceanStyle      0.41205
		Randomize      (0.848, -0.838, 0.396)
		colorDistMagn   0.83897
		colorDistFreq   0.0139556
		detailScale     116.517
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999101
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.568452
		terraceProb     0.184486
		erosion         0
		montesMagn      0.498563
		montesFreq      3.09122
		montesSpiky     0.944937
		montesFraction  0.426589
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0375113
		hillsFraction   0.551451
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247805
		craterFreq      0.241692
		craterDensity   0.918864
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463
		volcanoTemp     1667.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.522, 0.337, 0.104, 0.000)
		colorShelf     (0.541, 0.366, 0.090, 0.000)
		colorBeach     (0.490, 0.337, 0.090, 0.000)
		colorDesert    (0.535, 0.337, 0.090, 0.000)
		colorLowland   (0.528, 0.366, 0.085, 0.000)
		colorUpland    (0.528, 0.424, 0.104, 0.000)
		colorRock      (0.535, 0.366, 0.099, 0.000)
		colorSnow      (0.535, 0.377, 0.113, 1.000)
		BumpHeight      3.84027
		BumpOffset      0.768055
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
		SemiMajorAxis   0.0404595
		Period          0.45059
		Eccentricity    0.0463146
		Inclination     -64.4002
		AscendingNode   148.017
		ArgOfPericenter 110.937
		MeanAnomaly     -71.33
	}
}

DwarfMoon	"Tion System 3.D31"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            2.05185e-010
	Radius          8.42368
	InertiaMoment   0.399916

	RotationPeriod  940.868
	Obliquity       -86.9179
	EqAscendNode    180.509
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.757 0.755 0.753)

	Surface
	{
		SurfStyle       0.304654
		OceanStyle      0.837854
		Randomize      (0.082, -0.949, -0.713)
		colorDistMagn   0.718839
		colorDistFreq   0.0277793
		detailScale     230.023
		colorConversion true
		snowLevel       2
		tropicLatitude  0.78726
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.637091
		terraceProb     0.106677
		erosion         0
		montesMagn      0.655057
		montesFreq      2.80202
		montesSpiky     0.934291
		montesFraction  0.943639
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.147922
		hillsFraction   0.591557
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233647
		craterFreq      0.169817
		craterDensity   0.821739
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478797
		volcanoTemp     1647.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.295, 0.219, 0.233, 0.000)
		colorShelf     (0.303, 0.242, 0.271, 0.000)
		colorBeach     (0.356, 0.279, 0.324, 0.000)
		colorDesert    (0.386, 0.294, 0.294, 0.000)
		colorLowland   (0.424, 0.317, 0.354, 0.000)
		colorUpland    (0.469, 0.385, 0.414, 0.000)
		colorRock      (0.507, 0.423, 0.459, 0.000)
		colorSnow      (0.552, 0.430, 0.482, 1.000)
		BumpHeight      7.58132
		BumpOffset      1.51626
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
		SemiMajorAxis   0.0410352
		Period          0.460242
		Eccentricity    0.0466947
		Inclination     -34.9959
		AscendingNode   178.868
		ArgOfPericenter 68.1416
		MeanAnomaly     -151.54
	}
}

DwarfMoon	"Tion System 3.D32"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            3.16501e-010
	Radius          5.03603
	InertiaMoment   0.397997

	RotationPeriod  569.12
	Obliquity       -64.4048
	EqAscendNode    113.225
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.532 0.527 0.523)

	Surface
	{
		SurfStyle       0.822913
		OceanStyle      0.708821
		Randomize      (0.451, -0.011, 0.314)
		colorDistMagn   0.632487
		colorDistFreq   0.00855969
		detailScale     137.517
		colorConversion true
		snowLevel       2
		tropicLatitude  0.837767
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.628572
		terraceProb     0.219458
		erosion         0
		montesMagn      0.573483
		montesFreq      2.97194
		montesSpiky     0.986122
		montesFraction  0.77069
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0658254
		hillsFraction   0.631314
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262892
		craterFreq      0.216765
		craterDensity   0.841961
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.441571
		volcanoTemp     1675.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.431, 0.263, 0.099, 0.550)
		colorShelf     (0.447, 0.284, 0.084, 0.480)
		colorBeach     (0.404, 0.248, 0.094, 0.600)
		colorDesert    (0.442, 0.269, 0.099, 0.600)
		colorLowland   (0.436, 0.279, 0.094, 0.630)
		colorUpland    (0.436, 0.274, 0.094, 0.550)
		colorRock      (0.442, 0.279, 0.094, 0.420)
		colorSnow      (0.442, 0.284, 0.110, 1.000)
		BumpHeight      4.53243
		BumpOffset      0.906486
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
		SemiMajorAxis   0.0412934
		Period          0.464593
		Eccentricity    0.281466
		Inclination     -49.4541
		AscendingNode   112.766
		ArgOfPericenter 65.3629
		MeanAnomaly     94.7671
	}
}

DwarfMoon	"Tion System 3.D33"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            4.76318e-010
	Radius          10.1166
	InertiaMoment   0.399138

	RotationPeriod  811.407
	Obliquity       71.8386
	EqAscendNode    -51.2456
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.765 0.764 0.763)

	Surface
	{
		SurfStyle       0.0457598
		OceanStyle      0.61775
		Randomize      (0.325, 0.759, -0.677)
		colorDistMagn   0.17951
		colorDistFreq   0.0282
		detailScale     276.251
		colorConversion true
		snowLevel       2
		tropicLatitude  0.835715
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.350796
		terraceProb     0.326622
		erosion         0
		montesMagn      0.301583
		montesFreq      2.99035
		montesSpiky     0.846282
		montesFraction  0.232259
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.291173
		hillsFraction   0.655846
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244196
		craterFreq      0.225566
		craterDensity   0.875589
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.589408
		volcanoTemp     1344.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.306, 0.252, 0.000)
		colorShelf     (0.298, 0.321, 0.275, 0.000)
		colorBeach     (0.321, 0.344, 0.305, 0.000)
		colorDesert    (0.337, 0.359, 0.297, 0.000)
		colorLowland   (0.360, 0.382, 0.328, 0.000)
		colorUpland    (0.383, 0.405, 0.343, 0.000)
		colorRock      (0.390, 0.420, 0.358, 0.000)
		colorSnow      (0.413, 0.443, 0.366, 1.000)
		BumpHeight      9.10496
		BumpOffset      1.82099
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
		SemiMajorAxis   0.0415863
		Period          0.469544
		Eccentricity    0.362493
		Inclination     74.5679
		AscendingNode   -46.3599
		ArgOfPericenter 45.78
		MeanAnomaly     19.4005
	}
}

DwarfMoon	"Tion System 3.D34"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            7.02542e-010
	Radius          7.6143
	InertiaMoment   0.395205

	RotationPeriod  576.381
	Obliquity       -94.5561
	EqAscendNode    -117.689
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.504 0.501 0.495)

	Surface
	{
		SurfStyle       0.965989
		OceanStyle      0.722343
		Randomize      (0.227, 0.561, -0.227)
		colorDistMagn   0.143419
		colorDistFreq   0.0264793
		detailScale     207.921
		colorConversion true
		snowLevel       2
		tropicLatitude  0.969684
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.595422
		terraceProb     0.370627
		erosion         0
		montesMagn      0.486877
		montesFreq      3.50058
		montesSpiky     0.979601
		montesFraction  0.381963
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0910958
		hillsFraction   0.579516
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.200956
		craterFreq      0.198946
		craterDensity   1.09959
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532064
		volcanoTemp     1312.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.409, 0.250, 0.153, 0.000)
		colorShelf     (0.424, 0.265, 0.144, 0.000)
		colorBeach     (0.383, 0.230, 0.134, 0.000)
		colorDesert    (0.419, 0.260, 0.153, 0.000)
		colorLowland   (0.414, 0.275, 0.163, 0.000)
		colorUpland    (0.414, 0.260, 0.158, 0.000)
		colorRock      (0.419, 0.265, 0.158, 0.000)
		colorSnow      (0.419, 0.265, 0.163, 1.000)
		BumpHeight      6.85287
		BumpOffset      1.37057
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
		SemiMajorAxis   0.0422536
		Period          0.480891
		Eccentricity    0.0437581
		Inclination     -33.9441
		AscendingNode   -123.876
		ArgOfPericenter -20.6871
		MeanAnomaly     57.093
	}
}

DwarfMoon	"Tion System 3.D35"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.01912e-009
	Radius          7.96132
	InertiaMoment   0.398194

	RotationPeriod  518.734
	Obliquity       -33.7906
	EqAscendNode    -75.9987
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.564 0.496 0.462)

	Surface
	{
		SurfStyle       0.562941
		OceanStyle      0.346922
		Randomize      (0.791, 0.904, -0.403)
		colorDistMagn   0.665474
		colorDistFreq   0.030983
		detailScale     217.397
		colorConversion true
		snowLevel       2
		tropicLatitude  0.945541
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.324072
		terraceProb     0.102858
		erosion         0
		montesMagn      0.438469
		montesFreq      3.10621
		montesSpiky     0.800665
		montesFraction  0.213218
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.151597
		hillsFraction   0.721778
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275929
		craterFreq      0.227352
		craterDensity   0.711048
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.585115
		volcanoTemp     1120.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.164, 0.174, 0.185, 0.000)
		colorShelf     (0.186, 0.213, 0.212, 0.000)
		colorBeach     (0.203, 0.233, 0.240, 0.000)
		colorDesert    (0.248, 0.263, 0.272, 0.000)
		colorLowland   (0.276, 0.298, 0.300, 0.000)
		colorUpland    (0.361, 0.407, 0.406, 0.000)
		colorRock      (0.316, 0.357, 0.365, 0.000)
		colorSnow      (0.316, 0.347, 0.365, 1.000)
		BumpHeight      7.16518
		BumpOffset      1.43304
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
		SemiMajorAxis   0.0425884
		Period          0.486619
		Eccentricity    0.269217
		Inclination     -55.6873
		AscendingNode   -71.8649
		ArgOfPericenter -1.67438
		MeanAnomaly     19.0149
	}
}

DwarfMoon	"Tion System 3.D36"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.45805e-009
	Radius          15.648
	InertiaMoment   0.399273

	RotationPeriod  753.708
	Obliquity       37.5966
	EqAscendNode    -56.7364
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.755 0.642 0.562)

	Surface
	{
		SurfStyle       0.702044
		OceanStyle      0.598609
		Randomize      (-0.698, -0.998, 0.590)
		colorDistMagn   0.103482
		colorDistFreq   0.114205
		detailScale     427.295
		colorConversion true
		snowLevel       2
		tropicLatitude  0.893138
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.505803
		terraceProb     0.425444
		erosion         0
		montesMagn      0.428127
		montesFreq      3.29393
		montesSpiky     0.994311
		montesFraction  0.725062
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.48262
		hillsFraction   0.540095
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.265828
		craterFreq      0.26023
		craterDensity   0.90553
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51651
		volcanoTemp     1081.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.634, 0.360, 0.163, 0.000)
		colorShelf     (0.604, 0.398, 0.197, 0.000)
		colorBeach     (0.650, 0.360, 0.174, 0.000)
		colorDesert    (0.627, 0.372, 0.174, 0.000)
		colorLowland   (0.642, 0.385, 0.191, 0.000)
		colorUpland    (0.634, 0.360, 0.157, 0.000)
		colorRock      (0.612, 0.385, 0.186, 0.000)
		colorSnow      (0.627, 0.398, 0.191, 1.000)
		BumpHeight      14.0832
		BumpOffset      2.81664
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
		SemiMajorAxis   0.043192
		Period          0.496999
		Eccentricity    0.251898
		Inclination     38.833
		AscendingNode   -64.0471
		ArgOfPericenter -164.171
		MeanAnomaly     18.7903
	}
}

DwarfMoon	"Tion System 3.D37"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            2.0621e-009
	Radius          8.85381
	InertiaMoment   0.396328

	RotationPeriod  425.97
	Obliquity       124.068
	EqAscendNode    -35.6819
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.643 0.640 0.637)

	Surface
	{
		SurfStyle       0.902471
		OceanStyle      0.620931
		Randomize      (-0.129, 0.397, 0.619)
		colorDistMagn   0.96282
		colorDistFreq   0.0303419
		detailScale     241.768
		colorConversion true
		snowLevel       2
		tropicLatitude  0.530903
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.512252
		terraceProb     0.442288
		erosion         0
		montesMagn      0.397717
		montesFreq      3.6641
		montesSpiky     0.949274
		montesFraction  0.365252
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.195833
		hillsFraction   0.615262
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234337
		craterFreq      0.277077
		craterDensity   0.963382
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502995
		volcanoTemp     1345.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.521, 0.371, 0.140, 0.000)
		colorShelf     (0.540, 0.403, 0.121, 0.000)
		colorBeach     (0.489, 0.371, 0.121, 0.000)
		colorDesert    (0.534, 0.371, 0.121, 0.000)
		colorLowland   (0.527, 0.403, 0.115, 0.000)
		colorUpland    (0.527, 0.467, 0.140, 0.000)
		colorRock      (0.534, 0.403, 0.134, 0.000)
		colorSnow      (0.534, 0.416, 0.153, 1.000)
		BumpHeight      7.96843
		BumpOffset      1.59369
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
		SemiMajorAxis   0.043676
		Period          0.505377
		Eccentricity    0.0842565
		Inclination     75.4356
		AscendingNode   -28.2033
		ArgOfPericenter 86.1845
		MeanAnomaly     71.0125
	}
}

DwarfMoon	"Tion System 3.D38"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            2.88844e-009
	Radius          21.8313
	InertiaMoment   0.398374

	RotationPeriod  752.509
	Obliquity       24.2472
	EqAscendNode    -51.6112
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.631 0.547 0.403)

	Surface
	{
		SurfStyle       0.717774
		OceanStyle      0.356122
		Randomize      (0.278, -0.668, 0.901)
		colorDistMagn   0.613931
		colorDistFreq   0.229857
		detailScale     596.139
		colorConversion true
		snowLevel       2
		tropicLatitude  0.423025
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.27013
		terraceProb     0.1974
		erosion         0
		montesMagn      0.556298
		montesFreq      3.14008
		montesSpiky     0.788353
		montesFraction  0.880566
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.00959
		hillsFraction   0.579128
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21094
		craterFreq      0.268065
		craterDensity   0.909256
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.415997
		volcanoTemp     1567.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.530, 0.306, 0.117, 0.000)
		colorShelf     (0.505, 0.339, 0.141, 0.000)
		colorBeach     (0.543, 0.306, 0.125, 0.000)
		colorDesert    (0.524, 0.317, 0.125, 0.000)
		colorLowland   (0.537, 0.328, 0.137, 0.000)
		colorUpland    (0.530, 0.306, 0.113, 0.000)
		colorRock      (0.511, 0.328, 0.133, 0.000)
		colorSnow      (0.524, 0.339, 0.137, 1.000)
		BumpHeight      19.6481
		BumpOffset      3.92963
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
		SemiMajorAxis   0.0440473
		Period          0.511835
		Eccentricity    0.379772
		Inclination     1.35314
		AscendingNode   -56.0962
		ArgOfPericenter -111.694
		MeanAnomaly     162.26
	}
}

DwarfMoon	"Tion System 3.D39"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            4.01362e-009
	Radius          12.6899
	InertiaMoment   0.399405

	RotationPeriod  438.378
	Obliquity       -69.8373
	EqAscendNode    98.3699
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.450 0.443 0.440)

	Surface
	{
		SurfStyle       0.919117
		OceanStyle      0.677948
		Randomize      (0.592, -0.564, -0.097)
		colorDistMagn   0.0397167
		colorDistFreq   0.027234
		detailScale     346.519
		colorConversion true
		snowLevel       2
		tropicLatitude  0.914154
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.731623
		terraceProb     0.266914
		erosion         0
		montesMagn      0.647379
		montesFreq      3.77007
		montesSpiky     0.945125
		montesFraction  0.526824
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.4248
		hillsFraction   0.580268
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245249
		craterFreq      0.206872
		craterDensity   0.936609
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.561232
		volcanoTemp     1225.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.364, 0.257, 0.097, 0.000)
		colorShelf     (0.378, 0.279, 0.084, 0.000)
		colorBeach     (0.342, 0.257, 0.084, 0.000)
		colorDesert    (0.373, 0.257, 0.084, 0.000)
		colorLowland   (0.369, 0.279, 0.079, 0.000)
		colorUpland    (0.369, 0.324, 0.097, 0.000)
		colorRock      (0.373, 0.279, 0.092, 0.000)
		colorSnow      (0.373, 0.288, 0.106, 1.000)
		BumpHeight      11.4209
		BumpOffset      2.28418
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
		SemiMajorAxis   0.0445394
		Period          0.520437
		Eccentricity    0.445803
		Inclination     -70.3331
		AscendingNode   109.108
		ArgOfPericenter 31.364
		MeanAnomaly     74.6102
	}
}

DwarfMoon	"Tion System 3.D40"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            5.54036e-009
	Radius          13.2967
	InertiaMoment   0.396858

	RotationPeriod  397.56
	Obliquity       -106.15
	EqAscendNode    -15.1376
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.658 0.604 0.543)

	Surface
	{
		SurfStyle       0.609122
		OceanStyle      0.610852
		Randomize      (0.020, -0.195, -0.766)
		colorDistMagn   0.950553
		colorDistFreq   0.113345
		detailScale     363.087
		colorConversion true
		snowLevel       2
		tropicLatitude  0.514623
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.616183
		terraceProb     0.361641
		erosion         0
		montesMagn      0.512415
		montesFreq      2.95933
		montesSpiky     0.924204
		montesFraction  0.637037
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.40525
		hillsFraction   0.614112
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.190293
		craterFreq      0.198035
		craterDensity   1.09517
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.537512
		volcanoTemp     1533.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.566, 0.459, 0.315, 0.000)
		colorShelf     (0.289, 0.205, 0.136, 0.000)
		colorBeach     (0.658, 0.508, 0.000, 0.000)
		colorDesert    (0.507, 0.423, 0.190, 0.000)
		colorLowland   (0.546, 0.411, 0.119, 0.270)
		colorUpland    (0.395, 0.242, 0.043, 0.000)
		colorRock      (0.145, 0.115, 0.060, 0.000)
		colorSnow      (0.513, 0.471, 0.424, 1.000)
		BumpHeight      11.967
		BumpOffset      2.3934
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
		SemiMajorAxis   0.04474
		Period          0.523956
		Eccentricity    0.487689
		Inclination     -44.5834
		AscendingNode   -12.0833
		ArgOfPericenter -37.0112
		MeanAnomaly     41.6592
	}
}

DwarfMoon	"Tion System 3.D41"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            7.60685e-009
	Radius          26.0496
	InertiaMoment   0.398542

	RotationPeriod  604.364
	Obliquity       8.40755
	EqAscendNode    2.11715
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.497 0.494 0.492)

	Surface
	{
		SurfStyle       0.824639
		OceanStyle      0.637676
		Randomize      (-0.247, -0.821, -0.622)
		colorDistMagn   0.910851
		colorDistFreq   0.116095
		detailScale     711.329
		colorConversion true
		snowLevel       2
		tropicLatitude  0.457821
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.260544
		terraceProb     0.42807
		erosion         0
		montesMagn      0.367961
		montesFreq      3.20087
		montesSpiky     0.98348
		montesFraction  0.508556
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.781753
		hillsFraction   0.708958
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262703
		craterFreq      0.186486
		craterDensity   1.00069
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.558142
		volcanoTemp     1674.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.403, 0.247, 0.093, 0.550)
		colorShelf     (0.417, 0.267, 0.079, 0.480)
		colorBeach     (0.378, 0.232, 0.089, 0.600)
		colorDesert    (0.412, 0.252, 0.093, 0.600)
		colorLowland   (0.408, 0.262, 0.089, 0.630)
		colorUpland    (0.408, 0.257, 0.089, 0.550)
		colorRock      (0.412, 0.262, 0.089, 0.420)
		colorSnow      (0.412, 0.267, 0.103, 1.000)
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
		SemiMajorAxis   0.0452006
		Period          0.532068
		Eccentricity    0.344099
		Inclination     18.843
		AscendingNode   2.09075
		ArgOfPericenter -140.027
		MeanAnomaly     77.0329
	}
}

DwarfMoon	"Tion System 3.D42"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.03997e-008
	Radius          19.3516
	InertiaMoment   0.399535

	RotationPeriod  421.101
	Obliquity       -3.31113
	EqAscendNode    73.12
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.599 0.594 0.593)

	Surface
	{
		SurfStyle       0.890775
		OceanStyle      0.702572
		Randomize      (0.108, -0.166, -0.039)
		colorDistMagn   0.211521
		colorDistFreq   0.0488812
		detailScale     528.426
		colorConversion true
		snowLevel       2
		tropicLatitude  0.990702
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.478335
		terraceProb     0.277178
		erosion         0
		montesMagn      0.536587
		montesFreq      2.48132
		montesSpiky     0.910242
		montesFraction  0.201139
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.85432
		hillsFraction   0.534268
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239437
		craterFreq      0.216952
		craterDensity   0.859282
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508331
		volcanoTemp     1535.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.485, 0.345, 0.130, 0.000)
		colorShelf     (0.503, 0.375, 0.113, 0.000)
		colorBeach     (0.455, 0.345, 0.113, 0.000)
		colorDesert    (0.497, 0.345, 0.113, 0.000)
		colorLowland   (0.491, 0.375, 0.107, 0.000)
		colorUpland    (0.491, 0.434, 0.130, 0.000)
		colorRock      (0.497, 0.375, 0.124, 0.000)
		colorSnow      (0.497, 0.386, 0.142, 1.000)
		BumpHeight      17.4164
		BumpOffset      3.48328
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
		SemiMajorAxis   0.0458275
		Period          0.543177
		Eccentricity    0.253635
		Inclination     -81.2952
		AscendingNode   74.7208
		ArgOfPericenter -158.525
		MeanAnomaly     135.405
	}
}

DwarfMoon	"Tion System 3.D43"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.41717e-008
	Radius          35.2095
	InertiaMoment   0.39723

	RotationPeriod  601.913
	Obliquity       -7.10851
	EqAscendNode    -130.338
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.690 0.550 0.465)

	Surface
	{
		SurfStyle       0.981918
		OceanStyle      0.581784
		Randomize      (0.773, 0.881, 0.269)
		colorDistMagn   0.581291
		colorDistFreq   0.858411
		detailScale     961.454
		colorConversion true
		snowLevel       2
		tropicLatitude  0.335599
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479727
		terraceProb     0.461522
		erosion         0
		montesMagn      0.482841
		montesFreq      3.37699
		montesSpiky     0.905792
		montesFraction  0.701902
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.25045
		hillsFraction   0.341507
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238199
		craterFreq      0.158083
		craterDensity   0.730333
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487603
		volcanoTemp     1359.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.559, 0.275, 0.144, 0.000)
		colorShelf     (0.579, 0.292, 0.135, 0.000)
		colorBeach     (0.524, 0.253, 0.125, 0.000)
		colorDesert    (0.572, 0.286, 0.144, 0.000)
		colorLowland   (0.566, 0.303, 0.153, 0.000)
		colorUpland    (0.566, 0.286, 0.149, 0.000)
		colorRock      (0.572, 0.292, 0.149, 0.000)
		colorSnow      (0.572, 0.292, 0.153, 1.000)
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
		SemiMajorAxis   0.046112
		Period          0.548243
		Eccentricity    0.152686
		Inclination     14.4948
		AscendingNode   -127.194
		ArgOfPericenter -75.2775
		MeanAnomaly     26.0129
	}
}

DwarfMoon	"Tion System 3.D44"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.92674e-008
	Radius          20.3124
	InertiaMoment   0.398701

	RotationPeriod  337.602
	Obliquity       -15.4113
	EqAscendNode    -32.6064
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.562 0.558 0.552)

	Surface
	{
		SurfStyle       0.775384
		OceanStyle      0.00736627
		Randomize      (-0.388, -0.839, 0.956)
		colorDistMagn   0.366334
		colorDistFreq   0.169818
		detailScale     554.663
		colorConversion true
		snowLevel       2
		tropicLatitude  0.854797
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.482868
		terraceProb     0.13637
		erosion         0
		montesMagn      0.395927
		montesFreq      2.52382
		montesSpiky     0.96292
		montesFraction  0.206982
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.18929
		hillsFraction   0.663183
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214621
		craterFreq      0.205855
		craterDensity   1.08412
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.472991
		volcanoTemp     1784.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.472, 0.408, 0.171, 0.000)
		colorShelf     (0.450, 0.419, 0.193, 0.000)
		colorBeach     (0.483, 0.419, 0.177, 0.000)
		colorDesert    (0.466, 0.419, 0.171, 0.000)
		colorLowland   (0.478, 0.430, 0.182, 0.000)
		colorUpland    (0.472, 0.419, 0.171, 0.000)
		colorRock      (0.455, 0.419, 0.177, 0.000)
		colorSnow      (0.466, 0.441, 0.182, 1.000)
		BumpHeight      18.2811
		BumpOffset      3.65623
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
		SemiMajorAxis   0.0466445
		Period          0.557765
		Eccentricity    0.00452363
		Inclination     -44.7492
		AscendingNode   -27.6658
		ArgOfPericenter 3.21401
		MeanAnomaly     158.672
	}
}

DwarfMoon	"Tion System 3.D45"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            2.61587e-008
	Radius          21.1332
	InertiaMoment   0.399662

	RotationPeriod  306.31
	Obliquity       73.8217
	EqAscendNode    -20.783
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.673 0.584 0.496)

	Surface
	{
		SurfStyle       0.842763
		OceanStyle      0.588271
		Randomize      (0.732, -0.005, 0.769)
		colorDistMagn   0.613211
		colorDistFreq   0.0806679
		detailScale     577.077
		colorConversion true
		snowLevel       2
		tropicLatitude  0.971545
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.606405
		terraceProb     0.15124
		erosion         0
		montesMagn      0.54701
		montesFreq      2.55288
		montesSpiky     0.782924
		montesFraction  0.942274
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.26862
		hillsFraction   0.624242
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.287526
		craterFreq      0.170215
		craterDensity   0.760986
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501373
		volcanoTemp     1367.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.545, 0.292, 0.094, 0.550)
		colorShelf     (0.566, 0.315, 0.079, 0.480)
		colorBeach     (0.512, 0.274, 0.089, 0.600)
		colorDesert    (0.559, 0.298, 0.094, 0.600)
		colorLowland   (0.552, 0.309, 0.089, 0.630)
		colorUpland    (0.552, 0.303, 0.089, 0.550)
		colorRock      (0.559, 0.309, 0.089, 0.420)
		colorSnow      (0.559, 0.315, 0.104, 1.000)
		BumpHeight      19.0199
		BumpOffset      3.80398
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
		SemiMajorAxis   0.0471456
		Period          0.566779
		Eccentricity    0.159659
		Inclination     30.7592
		AscendingNode   -14.1447
		ArgOfPericenter -152.576
		MeanAnomaly     -117.709
	}
}

DwarfMoon	"Tion System 3.D46"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            3.54956e-008
	Radius          52.0079
	InertiaMoment   0.397525

	RotationPeriod  574.469
	Obliquity       30.8642
	EqAscendNode    133.889
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.595 0.591 0.586)

	Surface
	{
		SurfStyle       0.4326
		OceanStyle      0.354893
		Randomize      (-0.378, -0.487, 0.746)
		colorDistMagn   0.44782
		colorDistFreq   0.622918
		detailScale     1420.16
		colorConversion true
		snowLevel       2
		tropicLatitude  0.58645
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.41033
		terraceProb     0.578108
		erosion         0
		montesMagn      0.520761
		montesFreq      3.17002
		montesSpiky     0.881915
		montesFraction  0.356418
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.7176
		hillsFraction   0.738777
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242986
		craterFreq      0.254722
		craterDensity   0.936106
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.557144
		volcanoTemp     1863.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.220, 0.236, 0.229, 0.000)
		colorShelf     (0.244, 0.272, 0.252, 0.000)
		colorBeach     (0.274, 0.307, 0.275, 0.000)
		colorDesert    (0.316, 0.349, 0.322, 0.000)
		colorLowland   (0.351, 0.384, 0.363, 0.000)
		colorUpland    (0.375, 0.420, 0.369, 0.000)
		colorRock      (0.435, 0.467, 0.439, 0.000)
		colorSnow      (0.423, 0.467, 0.439, 1.000)
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
		SemiMajorAxis   0.0474785
		Period          0.572792
		Eccentricity    0.247441
		Inclination     50.9857
		AscendingNode   132.564
		ArgOfPericenter -151.994
		MeanAnomaly     -104.11
	}
}

DwarfMoon	"Tion System 3.D47"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            4.8181e-008
	Radius          29.6418
	InertiaMoment   0.398852

	RotationPeriod  315.659
	Obliquity       54.2067
	EqAscendNode    130.577
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.514 0.509 0.501)

	Surface
	{
		SurfStyle       0.342536
		OceanStyle      0.727698
		Randomize      (0.959, -0.771, -0.607)
		colorDistMagn   0.959554
		colorDistFreq   0.405046
		detailScale     809.42
		colorConversion true
		snowLevel       2
		tropicLatitude  0.667717
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.350418
		terraceProb     0.176773
		erosion         0
		montesMagn      0.441808
		montesFreq      2.43668
		montesSpiky     0.959867
		montesFraction  0.475886
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.14832
		hillsFraction   0.783389
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214613
		craterFreq      0.227069
		craterDensity   0.987823
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.353753
		volcanoTemp     1545.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.148, 0.115, 0.000)
		colorShelf     (0.206, 0.143, 0.135, 0.000)
		colorBeach     (0.242, 0.173, 0.155, 0.000)
		colorDesert    (0.262, 0.188, 0.155, 0.000)
		colorLowland   (0.288, 0.204, 0.175, 0.000)
		colorUpland    (0.319, 0.234, 0.210, 0.000)
		colorRock      (0.344, 0.260, 0.225, 0.000)
		colorSnow      (0.375, 0.280, 0.245, 1.000)
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
		SemiMajorAxis   0.0478089
		Period          0.578781
		Eccentricity    0.0989112
		Inclination     22.7016
		AscendingNode   130.876
		ArgOfPericenter -18.508
		MeanAnomaly     92.1146
	}
}

DwarfMoon	"Tion System 3.D48"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            6.54778e-008
	Radius          56.5717
	InertiaMoment   0.399788

	RotationPeriod  482.974
	Obliquity       93.5607
	EqAscendNode    91.5701
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.431 0.427 0.423)

	Surface
	{
		SurfStyle       0.989763
		OceanStyle      0.141826
		Randomize      (-0.511, -0.728, -0.197)
		colorDistMagn   0.897163
		colorDistFreq   2.25256
		detailScale     1544.79
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99831
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.347786
		terraceProb     0.384206
		erosion         0
		montesMagn      0.549675
		montesFreq      3.30087
		montesSpiky     0.940039
		montesFraction  0.392276
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.1197
		hillsFraction   0.672058
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.201935
		craterFreq      0.230262
		craterDensity   1.00112
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471035
		volcanoTemp     1619.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.349, 0.214, 0.131, 0.000)
		colorShelf     (0.362, 0.226, 0.123, 0.000)
		colorBeach     (0.327, 0.197, 0.114, 0.000)
		colorDesert    (0.357, 0.222, 0.131, 0.000)
		colorLowland   (0.353, 0.235, 0.140, 0.000)
		colorUpland    (0.353, 0.222, 0.135, 0.000)
		colorRock      (0.357, 0.226, 0.135, 0.000)
		colorSnow      (0.357, 0.226, 0.140, 1.000)
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
		SemiMajorAxis   0.0482956
		Period          0.587642
		Eccentricity    0.200902
		Inclination     87.3513
		AscendingNode   93.5071
		ArgOfPericenter -121.498
		MeanAnomaly     33.2504
	}
}

DwarfMoon	"Tion System 3.D49"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            8.91696e-008
	Radius          32.1245
	InertiaMoment   0.397774

	RotationPeriod  257.66
	Obliquity       -43.7312
	EqAscendNode    -178.623
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.415 0.412 0.407)

	Surface
	{
		SurfStyle       0.268779
		OceanStyle      0.182544
		Randomize      (-0.330, 0.525, -0.733)
		colorDistMagn   0.956347
		colorDistFreq   0.582456
		detailScale     877.212
		colorConversion true
		snowLevel       2
		tropicLatitude  0.349407
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.27984
		terraceProb     0.225344
		erosion         0
		montesMagn      0.647563
		montesFreq      3.19309
		montesSpiky     0.917973
		montesFraction  0.205684
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.82093
		hillsFraction   0.552835
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223337
		craterFreq      0.256901
		craterDensity   0.791276
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.380314
		volcanoTemp     1506.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.148, 0.098, 0.000)
		colorShelf     (0.166, 0.156, 0.118, 0.000)
		colorBeach     (0.195, 0.181, 0.134, 0.000)
		colorDesert    (0.211, 0.198, 0.134, 0.000)
		colorLowland   (0.232, 0.210, 0.147, 0.000)
		colorUpland    (0.257, 0.251, 0.175, 0.000)
		colorRock      (0.278, 0.276, 0.183, 0.000)
		colorSnow      (0.303, 0.292, 0.200, 1.000)
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
		SemiMajorAxis   0.0486901
		Period          0.594856
		Eccentricity    0.181388
		Inclination     -63.784
		AscendingNode   -174.952
		ArgOfPericenter -5.55896
		MeanAnomaly     -100.26
	}
}

DwarfMoon	"Tion System 3.D50"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.218e-007
	Radius          46.1973
	InertiaMoment   0.398996

	RotationPeriod  311.278
	Obliquity       -79.1133
	EqAscendNode    116.712
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.447 0.381 0.355)

	Surface
	{
		SurfStyle       0.595654
		OceanStyle      0.00732979
		Randomize      (-0.717, -0.520, 0.126)
		colorDistMagn   0.977012
		colorDistFreq   0.480028
		detailScale     1261.49
		colorConversion true
		snowLevel       2
		tropicLatitude  0.833111
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.335439
		terraceProb     0.493037
		erosion         0
		montesMagn      0.48182
		montesFreq      2.55253
		montesSpiky     0.971942
		montesFraction  0.693134
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.80915
		hillsFraction   0.646235
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251019
		craterFreq      0.208217
		craterDensity   0.94268
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.566705
		volcanoTemp     1327.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.384, 0.290, 0.206, 0.000)
		colorShelf     (0.197, 0.130, 0.089, 0.000)
		colorBeach     (0.447, 0.320, 0.000, 0.000)
		colorDesert    (0.344, 0.267, 0.124, 0.000)
		colorLowland   (0.371, 0.259, 0.078, 0.270)
		colorUpland    (0.268, 0.152, 0.028, 0.000)
		colorRock      (0.098, 0.072, 0.039, 0.000)
		colorSnow      (0.349, 0.297, 0.277, 1.000)
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
		SemiMajorAxis   0.0491614
		Period          0.603514
		Eccentricity    0.326094
		Inclination     -73.7657
		AscendingNode   122.048
		ArgOfPericenter -77.2936
		MeanAnomaly     111.2
	}
}

DwarfMoon	"Tion System 3.D51"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.67041e-007
	Radius          81.2648
	InertiaMoment   0.399914

	RotationPeriod  444.074
	Obliquity       46.5014
	EqAscendNode    -36.9005
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.720 0.646 0.534)

	Surface
	{
		SurfStyle       0.176734
		OceanStyle      0.874574
		Randomize      (0.209, 0.437, 0.591)
		colorDistMagn   0.693504
		colorDistFreq   5.51781
		detailScale     2219.07
		colorConversion true
		snowLevel       2
		tropicLatitude  0.975739
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.42771
		terraceProb     0.151004
		erosion         0
		montesMagn      0.484268
		montesFreq      3.56378
		montesSpiky     0.863084
		montesFraction  0.309708
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.0586
		hillsFraction   0.623462
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243105
		craterFreq      0.205787
		craterDensity   0.907343
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452403
		volcanoTemp     1491.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.252, 0.214, 0.000)
		colorShelf     (0.245, 0.271, 0.224, 0.000)
		colorBeach     (0.259, 0.291, 0.235, 0.000)
		colorDesert    (0.266, 0.304, 0.251, 0.000)
		colorLowland   (0.273, 0.323, 0.262, 0.000)
		colorUpland    (0.288, 0.343, 0.283, 0.000)
		colorRock      (0.324, 0.356, 0.294, 0.000)
		colorSnow      (0.317, 0.375, 0.310, 1.000)
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
		SemiMajorAxis   0.049452
		Period          0.608873
		Eccentricity    0.126337
		Inclination     38.307
		AscendingNode   -44.4117
		ArgOfPericenter -29.6117
		MeanAnomaly     -20.0681
	}
}

DwarfMoon	"Tion System 3.D52"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            2.30256e-007
	Radius          47.2189
	InertiaMoment   0.397993

	RotationPeriod  238.234
	Obliquity       -50.0231
	EqAscendNode    -22.5809
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.523 0.519 0.517)

	Surface
	{
		SurfStyle       0.24861
		OceanStyle      0.374871
		Randomize      (0.558, -0.808, 0.909)
		colorDistMagn   0.148288
		colorDistFreq   0.38654
		detailScale     1289.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0.696642
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.446602
		terraceProb     0.421658
		erosion         0
		montesMagn      0.289383
		montesFreq      3.6694
		montesSpiky     0.965075
		montesFraction  0.473881
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.99281
		hillsFraction   0.700264
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214467
		craterFreq      0.206921
		craterDensity   0.920306
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464218
		volcanoTemp     1897.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.187, 0.124, 0.000)
		colorShelf     (0.209, 0.197, 0.150, 0.000)
		colorBeach     (0.246, 0.228, 0.171, 0.000)
		colorDesert    (0.267, 0.249, 0.171, 0.000)
		colorLowland   (0.293, 0.265, 0.186, 0.000)
		colorUpland    (0.324, 0.317, 0.222, 0.000)
		colorRock      (0.351, 0.348, 0.233, 0.000)
		colorSnow      (0.382, 0.369, 0.253, 1.000)
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
		SemiMajorAxis   0.0500188
		Period          0.619372
		Eccentricity    0.358133
		Inclination     6.46336
		AscendingNode   -23.6379
		ArgOfPericenter -123.526
		MeanAnomaly     76.9436
	}
}

DwarfMoon	"Tion System 3.D53"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            3.19399e-007
	Radius          49.6144
	InertiaMoment   0.399135

	RotationPeriod  214.866
	Obliquity       15.2638
	EqAscendNode    111.465
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.801 0.675 0.633)

	Surface
	{
		SurfStyle       0.894362
		OceanStyle      0.591551
		Randomize      (-0.010, 0.637, -0.462)
		colorDistMagn   0.474934
		colorDistFreq   1.74424
		detailScale     1354.8
		colorConversion true
		snowLevel       2
		tropicLatitude  0.469845
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.366077
		terraceProb     0.298498
		erosion         0
		montesMagn      0.576098
		montesFreq      2.41398
		montesSpiky     0.829102
		montesFraction  0.784519
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.5596
		hillsFraction   0.678457
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240505
		craterFreq      0.279649
		craterDensity   0.857064
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.482464
		volcanoTemp     1791.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.648, 0.391, 0.139, 0.000)
		colorShelf     (0.673, 0.425, 0.120, 0.000)
		colorBeach     (0.608, 0.391, 0.120, 0.000)
		colorDesert    (0.665, 0.391, 0.120, 0.000)
		colorLowland   (0.657, 0.425, 0.114, 0.000)
		colorUpland    (0.657, 0.493, 0.139, 0.000)
		colorRock      (0.665, 0.425, 0.133, 0.000)
		colorSnow      (0.665, 0.439, 0.152, 1.000)
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
		SemiMajorAxis   0.0503939
		Period          0.626353
		Eccentricity    0.192552
		Inclination     -20.6923
		AscendingNode   102.253
		ArgOfPericenter 72.552
		MeanAnomaly     30.4608
	}
}

DwarfMoon	"Tion System 3.D54"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            4.46458e-007
	Radius          73.989
	InertiaMoment   0.395155

	RotationPeriod  264.913
	Obliquity       46.2866
	EqAscendNode    -178.826
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.621 0.616 0.613)

	Surface
	{
		SurfStyle       0.102976
		OceanStyle      0.82975
		Randomize      (0.296, -0.400, -0.868)
		colorDistMagn   0.170405
		colorDistFreq   3.50287
		detailScale     2020.39
		colorConversion true
		snowLevel       2
		tropicLatitude  0.497668
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.533348
		terraceProb     0.243021
		erosion         0
		montesMagn      0.614911
		montesFreq      2.7354
		montesSpiky     0.998841
		montesFraction  0.535869
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.4982
		hillsFraction   0.787147
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268743
		craterFreq      0.241128
		craterDensity   0.865538
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.582746
		volcanoTemp     1769.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.203, 0.245, 0.000)
		colorShelf     (0.236, 0.210, 0.257, 0.000)
		colorBeach     (0.254, 0.222, 0.276, 0.000)
		colorDesert    (0.261, 0.240, 0.288, 0.000)
		colorLowland   (0.285, 0.253, 0.306, 0.000)
		colorUpland    (0.292, 0.259, 0.325, 0.000)
		colorRock      (0.304, 0.265, 0.337, 0.000)
		colorSnow      (0.323, 0.277, 0.355, 1.000)
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
		SemiMajorAxis   0.0507589
		Period          0.633168
		Eccentricity    0.337311
		Inclination     75.2549
		AscendingNode   -171.588
		ArgOfPericenter 86.0122
		MeanAnomaly     36.9446
	}
}

DwarfMoon	"Tion System 3.D55"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            6.2984e-007
	Radius          71.424
	InertiaMoment   0.39819

	RotationPeriod  219.873
	Obliquity       8.57553
	EqAscendNode    180.731
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.415 0.410 0.404)

	Surface
	{
		SurfStyle       0.605739
		OceanStyle      0.406379
		Randomize      (0.942, 0.338, 0.739)
		colorDistMagn   0.877228
		colorDistFreq   2.36506
		detailScale     1950.35
		colorConversion true
		snowLevel       2
		tropicLatitude  0.263513
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.350221
		terraceProb     0.399146
		erosion         0
		montesMagn      0.622872
		montesFreq      3.92006
		montesSpiky     0.949607
		montesFraction  0.548015
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.0129
		hillsFraction   0.782759
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238687
		craterFreq      0.199333
		craterDensity   0.931969
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471647
		volcanoTemp     1444.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.357, 0.311, 0.235, 0.000)
		colorShelf     (0.183, 0.139, 0.101, 0.000)
		colorBeach     (0.415, 0.344, 0.000, 0.000)
		colorDesert    (0.320, 0.287, 0.142, 0.000)
		colorLowland   (0.345, 0.279, 0.089, 0.270)
		colorUpland    (0.249, 0.164, 0.032, 0.000)
		colorRock      (0.091, 0.078, 0.044, 0.000)
		colorSnow      (0.324, 0.320, 0.315, 1.000)
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
		SemiMajorAxis   0.0510307
		Period          0.638262
		Eccentricity    0.209632
		Inclination     23.8541
		AscendingNode   179.838
		ArgOfPericenter -154.248
		MeanAnomaly     -35.3936
	}
}

DwarfMoon	"Tion System 3.D56"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            8.98414e-007
	Radius          136.975
	InertiaMoment   0.399271

	RotationPeriod  338.811
	Obliquity       -112.545
	EqAscendNode    105.652
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.588 0.584 0.580)

	Surface
	{
		SurfStyle       0.425919
		OceanStyle      0.755801
		Randomize      (0.069, 0.007, 0.306)
		colorDistMagn   0.106398
		colorDistFreq   11.6701
		detailScale     3740.33
		colorConversion true
		snowLevel       2
		tropicLatitude  0.983519
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.63022
		terraceProb     0.183052
		erosion         0
		montesMagn      0.589382
		montesFreq      2.45078
		montesSpiky     0.91842
		montesFraction  0.412206
		dunesFraction   0
		hillsMagn       0
		hillsFreq       55.616
		hillsFraction   0.902001
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267125
		craterFreq      0.625778
		craterDensity   0.836199
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.449741
		volcanoTemp     1427.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.234, 0.226, 0.000)
		colorShelf     (0.241, 0.269, 0.249, 0.000)
		colorBeach     (0.270, 0.304, 0.272, 0.000)
		colorDesert    (0.311, 0.345, 0.319, 0.000)
		colorLowland   (0.347, 0.380, 0.359, 0.000)
		colorUpland    (0.370, 0.415, 0.365, 0.000)
		colorRock      (0.429, 0.462, 0.435, 0.000)
		colorSnow      (0.417, 0.462, 0.435, 1.000)
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
		SemiMajorAxis   0.0515831
		Period          0.648653
		Eccentricity    0.140343
		Inclination     -32.7718
		AscendingNode   106.451
		ArgOfPericenter -69.6215
		MeanAnomaly     9.42379
	}
}

DwarfMoon	"Tion System 3.D57"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.29858e-006
	Radius          79.897
	InertiaMoment   0.396313

	RotationPeriod  174.049
	Obliquity       -64.4339
	EqAscendNode    -71.9346
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.688 0.561 0.474)

	Surface
	{
		SurfStyle       0.487083
		OceanStyle      0.491346
		Randomize      (0.723, 0.432, 0.672)
		colorDistMagn   0.18251
		colorDistFreq   4.23343
		detailScale     2181.72
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997934
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.325233
		terraceProb     0.292266
		erosion         0
		montesMagn      0.592904
		montesFreq      2.7973
		montesSpiky     0.800022
		montesFraction  0.247874
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.6067
		hillsFraction   0.676502
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239065
		craterFreq      0.202435
		craterDensity   0.812832
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.545127
		volcanoTemp     1373.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.163, 0.190, 0.000)
		colorShelf     (0.248, 0.191, 0.218, 0.000)
		colorBeach     (0.282, 0.219, 0.246, 0.000)
		colorDesert    (0.323, 0.235, 0.280, 0.000)
		colorLowland   (0.351, 0.275, 0.308, 0.000)
		colorUpland    (0.392, 0.297, 0.336, 0.000)
		colorRock      (0.426, 0.325, 0.374, 0.000)
		colorSnow      (0.426, 0.325, 0.374, 1.000)
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
		SemiMajorAxis   0.0522391
		Period          0.661066
		Eccentricity    0.109226
		Inclination     -76.8091
		AscendingNode   -79.323
		ArgOfPericenter 38.9104
		MeanAnomaly     23.656
	}
}

DwarfMoon	"Tion System 3.D58"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.90705e-006
	Radius          83.3035
	InertiaMoment   0.39837

	RotationPeriod  151.406
	Obliquity       -2.12969
	EqAscendNode    -106.708
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.739 0.738 0.737)

	Surface
	{
		SurfStyle       0.592386
		OceanStyle      0.960378
		Randomize      (-0.005, 0.243, -0.294)
		colorDistMagn   0.183122
		colorDistFreq   3.7041
		detailScale     2274.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0.924888
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.455718
		terraceProb     0.533604
		erosion         0
		montesMagn      0.550776
		montesFreq      3.50366
		montesSpiky     0.732772
		montesFraction  0.76577
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.7922
		hillsFraction   0.560641
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260696
		craterFreq      0.19722
		craterDensity   0.893537
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.564668
		volcanoTemp     1377.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.636, 0.561, 0.427, 0.000)
		colorShelf     (0.325, 0.251, 0.184, 0.000)
		colorBeach     (0.739, 0.620, 0.000, 0.000)
		colorDesert    (0.569, 0.516, 0.258, 0.000)
		colorLowland   (0.614, 0.502, 0.162, 0.270)
		colorUpland    (0.444, 0.295, 0.059, 0.000)
		colorRock      (0.163, 0.140, 0.081, 0.000)
		colorSnow      (0.577, 0.575, 0.575, 1.000)
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
		SemiMajorAxis   0.0527233
		Period          0.670278
		Eccentricity    0.011622
		Inclination     -68.0963
		AscendingNode   -102.48
		ArgOfPericenter 3.98278
		MeanAnomaly     36.8598
	}
}

DwarfMoon	"Tion System 3.D59"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            2.85494e-006
	Radius          119.722
	InertiaMoment   0.399403

	RotationPeriod  176.636
	Obliquity       -50.6511
	EqAscendNode    161.124
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.805 0.723 0.678)

	Surface
	{
		SurfStyle       0.956565
		OceanStyle      0.0600028
		Randomize      (0.827, -0.737, -0.411)
		colorDistMagn   0.925365
		colorDistFreq   1.45971
		detailScale     3269.21
		colorConversion true
		snowLevel       2
		tropicLatitude  0.645989
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.509451
		terraceProb     0.869484
		erosion         0
		montesMagn      0.543411
		montesFreq      2.75833
		montesSpiky     0.918026
		montesFraction  0.779341
		dunesFraction   0
		hillsMagn       0
		hillsFreq       36.3298
		hillsFraction   0.508807
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233299
		craterFreq      0.425511
		craterDensity   0.956158
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.528467
		volcanoTemp     1004.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.652, 0.260, 0.122, 0.000)
		colorShelf     (0.677, 0.304, 0.108, 0.000)
		colorBeach     (0.612, 0.253, 0.108, 0.000)
		colorDesert    (0.669, 0.275, 0.122, 0.000)
		colorLowland   (0.660, 0.282, 0.122, 0.000)
		colorUpland    (0.660, 0.282, 0.122, 0.000)
		colorRock      (0.669, 0.282, 0.115, 0.000)
		colorSnow      (0.669, 0.296, 0.136, 1.000)
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
		SemiMajorAxis   0.0530822
		Period          0.677135
		Eccentricity    0.456282
		Inclination     -11.4968
		AscendingNode   157.145
		ArgOfPericenter 107.55
		MeanAnomaly     169.405
	}
}

DwarfMoon	"Tion System 3.D60"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            4.37538e-006
	Radius          128.187
	InertiaMoment   0.396849

	RotationPeriod  153.558
	Obliquity       -11.9723
	EqAscendNode    32.2256
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.497 0.492 0.488)

	Surface
	{
		SurfStyle       0.292188
		OceanStyle      0.736509
		Randomize      (0.246, 0.204, 0.107)
		colorDistMagn   0.14854
		colorDistFreq   10.4099
		detailScale     3500.36
		colorConversion true
		snowLevel       2
		tropicLatitude  0.115436
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.466579
		terraceProb     0.28794
		erosion         0
		montesMagn      0.518916
		montesFreq      3.66696
		montesSpiky     0.901854
		montesFraction  0.563674
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.3482
		hillsFraction   0.60343
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257025
		craterFreq      0.688784
		craterDensity   0.808005
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539577
		volcanoTemp     1550.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.143, 0.151, 0.000)
		colorShelf     (0.199, 0.157, 0.176, 0.000)
		colorBeach     (0.234, 0.182, 0.210, 0.000)
		colorDesert    (0.253, 0.192, 0.190, 0.000)
		colorLowland   (0.278, 0.207, 0.229, 0.000)
		colorUpland    (0.308, 0.251, 0.268, 0.000)
		colorRock      (0.333, 0.275, 0.297, 0.000)
		colorSnow      (0.363, 0.280, 0.312, 1.000)
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
		SemiMajorAxis   0.0535172
		Period          0.685474
		Eccentricity    0.0944661
		Inclination     13.3495
		AscendingNode   29.9507
		ArgOfPericenter -20.9135
		MeanAnomaly     -61.511
	}
}

DwarfMoon	"Tion System 3.D61"
{
	ParentBody     "Tion System 3"
	Class	       "Asteroid"

	Mass            1.16516e-011
	Radius          3.10935
	InertiaMoment   0.398539

	RotationPeriod  1370.66
	Obliquity       -60.418
	EqAscendNode    153.796
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.637 0.630 0.626)

	Surface
	{
		SurfStyle       0.350039
		OceanStyle      0.431929
		Randomize      (-0.452, -0.793, -0.573)
		colorDistMagn   0.80366
		colorDistFreq   0.00361993
		detailScale     84.9059
		colorConversion true
		snowLevel       2
		tropicLatitude  0.514951
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.554159
		terraceProb     0.358265
		erosion         0
		montesMagn      0.444799
		montesFreq      2.33787
		montesSpiky     0.982722
		montesFraction  0.418546
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0222564
		hillsFraction   0.586565
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242646
		craterFreq      0.213367
		craterDensity   0.955952
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.479062
		volcanoTemp     1968.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.239, 0.200, 0.000)
		colorShelf     (0.255, 0.246, 0.225, 0.000)
		colorBeach     (0.299, 0.296, 0.275, 0.000)
		colorDesert    (0.325, 0.315, 0.269, 0.000)
		colorLowland   (0.356, 0.340, 0.313, 0.000)
		colorUpland    (0.369, 0.391, 0.350, 0.000)
		colorRock      (0.401, 0.422, 0.382, 0.000)
		colorSnow      (0.446, 0.460, 0.407, 1.000)
		BumpHeight      2.79841
		BumpOffset      0.559682
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
		SemiMajorAxis   0.0540092
		Period          0.694949
		Eccentricity    0.480299
		Inclination     -49.9151
		AscendingNode   144.154
		ArgOfPericenter 36.2945
		MeanAnomaly     -163.345
	}
}

Planet	"Tion System 5"
{
	ParentBody     "Tion System"
	Class	       "GasGiant"

	Mass            825.8
	Radius          77592.4
	InertiaMoment   0.213412

	Oblateness      0.0393169

	RotationPeriod  8.4071
	Obliquity       -12.9829
	EqAscendNode    59.3074
	Precession      0

	AlbedoBond      0.456226
	AlbedoGeom      0.547471
	Brightness      2

	Surface
	{
		SurfStyle       0.369122
		Randomize      (-0.389, -0.739, -0.891)
		detailScale     199572
		colorConversion true
		tropicLatitude  0.194466
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0.875554
		stripeZones     7.79684
		stripeFluct     0.392386
		stripeTwist     13.9654
		cycloneMagn     5.72292
		cycloneFreq     0.447904
		cycloneDensity  0.584517
		cycloneOctaves  5
		colorLayer0    (0.840, 0.730, 0.570, 1.000)
		colorLayer1    (0.440, 0.630, 0.650, 1.000)
		colorLayer2    (0.920, 0.780, 0.540, 1.000)
		colorLayer3    (0.540, 0.810, 0.880, 1.000)
		colorLayer4    (0.990, 0.990, 1.000, 1.000)
		colorLayer5    (0.880, 0.760, 0.550, 1.000)
		colorLayer6    (0.460, 0.840, 0.820, 1.000)
		colorLayer7    (0.320, 0.300, 0.280, 1.000)
		colorLowPlants (0.990, 0.990, 1.000, 1.000)
		colorUpPlants  (0.880, 0.760, 0.550, 1.000)
		BumpHeight      8.46677
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          43.6328
		Velocity        1433.44
		BumpHeight      35.1698
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.17083
		mainOctaves     12
		Coverage        0.062258
		stripeZones     7.79684
		stripeFluct     0.392386
		stripeTwist     13.9654
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          184.316
		Density         5415.35
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0218038
		Saturation      0.977729

		Composition
		{
			H2    	92.2673
			He    	7.3578
			CH4   	0.291462
			N2    	0.0394939
			NH3   	0.0290818
			O2    	0.00769189
			C2H2  	0.00309698
			C2H4  	0.00124376
			Ne    	0.00112678
			Ar    	0.000779381
			C2H6  	0.00057349
			C3H8  	0.000319418
		}
	}

	Aurora
	{
		Height      4513.95
		NorthLat    80.5702
		NorthLon    -136.299
		NorthRadius 19268.3
		NorthWidth  11771.3
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -79.0387
		SouthLon    43.5699
		SouthRadius 19563.6
		SouthWidth  10747.2
		SouthRings  2
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
		SemiMajorAxis   21.5835
		Period          40.9502
		Eccentricity    0.0988012
		Inclination     -177.094
		AscendingNode   47.2885
		ArgOfPericenter 186.577
		MeanAnomaly     293.682
	}
}

DwarfMoon	"Tion System 5.D1"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            6.76406e-008
	Radius          56.5817
	InertiaMoment   0.396619

	Oblateness      0.249

	Obliquity       -0.00935441
	EqAscendNode    147.41
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.560 0.555 0.553)

	Surface
	{
		SurfStyle       0.130826
		OceanStyle      0.699507
		Randomize      (0.986, 0.066, 0.699)
		colorDistMagn   0.998375
		colorDistFreq   2.18441
		detailScale     1545.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.439961
		terraceProb     0.263178
		erosion         0
		montesMagn      0.627345
		montesFreq      1.73365
		montesSpiky     0.957564
		montesFraction  0.738742
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.57917
		hillsFraction   0.783579
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244645
		craterFreq      0.15009
		craterDensity   0.963802
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540824
		volcanoTemp     1711.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.178, 0.177, 0.000)
		colorShelf     (0.235, 0.194, 0.194, 0.000)
		colorBeach     (0.252, 0.200, 0.199, 0.000)
		colorDesert    (0.263, 0.217, 0.216, 0.000)
		colorLowland   (0.280, 0.228, 0.227, 0.000)
		colorUpland    (0.297, 0.233, 0.232, 0.000)
		colorRock      (0.308, 0.244, 0.243, 0.000)
		colorSnow      (0.325, 0.244, 0.249, 1.000)
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
		SemiMajorAxis   0.00116522
		Period          0.000800491
		Eccentricity    9.38228e-005
		Inclination     -0.00935441
		AscendingNode   147.41
		ArgOfPericenter 110.471
		MeanAnomaly     -111.982
	}
}

DwarfMoon	"Tion System 5.D2"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            9.21402e-008
	Radius          59.8803
	InertiaMoment   0.398459

	Oblateness      0.249

	Obliquity       -0.0116265
	EqAscendNode    -84.989
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.682 0.679 0.676)

	Surface
	{
		SurfStyle       0.99344
		OceanStyle      0.0336329
		Randomize      (0.014, -0.446, -0.996)
		colorDistMagn   0.879545
		colorDistFreq   1.54219
		detailScale     1635.13
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.436936
		terraceProb     0.284821
		erosion         0
		montesMagn      0.34328
		montesFreq      2.66525
		montesSpiky     0.988444
		montesFraction  0.672598
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.21691
		hillsFraction   0.865805
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231514
		craterFreq      0.203171
		craterDensity   0.956755
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56823
		volcanoTemp     1423.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.552, 0.339, 0.210, 0.000)
		colorShelf     (0.573, 0.360, 0.196, 0.000)
		colorBeach     (0.518, 0.312, 0.183, 0.000)
		colorDesert    (0.566, 0.353, 0.210, 0.000)
		colorLowland   (0.559, 0.373, 0.223, 0.000)
		colorUpland    (0.559, 0.353, 0.216, 0.000)
		colorRock      (0.566, 0.360, 0.216, 0.000)
		colorSnow      (0.566, 0.360, 0.223, 1.000)
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
		SemiMajorAxis   0.00135077
		Period          0.000999113
		Eccentricity    6.40459e-005
		Inclination     -0.0116265
		AscendingNode   -84.989
		ArgOfPericenter -147.826
		MeanAnomaly     132.359
	}
}

DwarfMoon	"Tion System 5.D3"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.25905e-007
	Radius          78.0283
	InertiaMoment   0.39947

	Oblateness      0.249

	Obliquity       -0.0059169
	EqAscendNode    57.9688
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.757 0.754 0.753)

	Surface
	{
		SurfStyle       0.0847004
		OceanStyle      0.201949
		Randomize      (-0.647, 0.885, -0.848)
		colorDistMagn   0.0276222
		colorDistFreq   3.04702
		detailScale     2130.69
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.528116
		terraceProb     0.141772
		erosion         0
		montesMagn      0.337634
		montesFreq      2.48287
		montesSpiky     0.87658
		montesFraction  0.883284
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.3546
		hillsFraction   0.535399
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.272591
		craterFreq      0.224384
		craterDensity   0.814749
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.475901
		volcanoTemp     1554.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.249, 0.301, 0.000)
		colorShelf     (0.288, 0.256, 0.316, 0.000)
		colorBeach     (0.310, 0.271, 0.339, 0.000)
		colorDesert    (0.318, 0.294, 0.354, 0.000)
		colorLowland   (0.348, 0.309, 0.376, 0.000)
		colorUpland    (0.356, 0.317, 0.399, 0.000)
		colorRock      (0.371, 0.324, 0.414, 0.000)
		colorSnow      (0.394, 0.339, 0.437, 1.000)
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
		SemiMajorAxis   0.00157749
		Period          0.00126093
		Eccentricity    3.03202e-005
		Inclination     -0.0059169
		AscendingNode   57.9688
		ArgOfPericenter 165.811
		MeanAnomaly     147.749
	}
}

Moon	"Tion System 5.1"
{
	ParentBody     "Tion System 5"
	Class	       "Desert"

	Mass            0.118146
	Radius          3633.59
	InertiaMoment   0.332992

	Oblateness      0.00442949

	Obliquity       0.167655
	EqAscendNode    -61.7302
	Precession      0
	TidalLocked     true

	AlbedoBond      0.323192
	AlbedoGeom      0.38783
	Brightness      2
	Color          (0.419 0.414 0.407)

	Surface
	{
		SurfStyle       0.953799
		OceanStyle      0.370337
		Randomize      (-0.626, -0.114, -0.527)
		colorDistMagn   0.0811316
		colorDistFreq   467.631
		detailScale     9345.81
		colorConversion true
		seaLevel        0.0970891
		snowLevel       2
		tropicLatitude  0.00502715
		icecapLatitude  10
		icecapHeight    0.107796
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.780346
		venusFreq       1.03005
		venusMagn       0
		mareFreq        2.03005
		mareDensity     0.0265251
		terraceProb     0.201883
		erosion         0
		montesMagn      0.245387
		montesFreq      175.982
		montesSpiky     0.816387
		montesFraction  0.104584
		dunesMagn       0.0377671
		dunesFreq       27.7239
		dunesFraction   0.556701
		hillsMagn       0.124117
		hillsFreq       378.783
		hillsFraction   0
		hills2Fraction  0
		riversMagn      51.6561
		riversFreq      2.4152
		riversSin       6.75591
		riversOctaves   0
		canyonsMagn     0.0477014
		canyonsFreq     92.2132
		canyonFraction  0
		cracksMagn      0.0808239
		cracksFreq      0.347413
		cracksOctaves   0
		craterMagn      0.621246
		craterFreq      11.0211
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.673298
		volcanoFreq     0.784636
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.765601
		volcanoRadius   0.465919
		volcanoTemp     1466.97
		lavaCoverTidal  0.549299
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.44536
		stripeTwist     0.0696227
		cycloneMagn     1.58024
		cycloneFreq     0.720668
		cycloneDensity  0.287167
		cycloneOctaves  4
		colorSea       (0.240, 0.230, 0.230, 0.000)
		colorShelf     (0.380, 0.360, 0.350, 0.000)
		colorBeach     (0.550, 0.520, 0.480, 0.000)
		colorDesert    (0.520, 0.490, 0.470, 0.000)
		colorLowland   (0.460, 0.440, 0.410, 0.000)
		colorUpland    (0.390, 0.360, 0.330, 0.000)
		colorRock      (0.170, 0.160, 0.160, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.460, 0.440, 0.410, 0.000)
		colorUpPlants  (0.390, 0.360, 0.330, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          15.9626
		Velocity        61.8465
		BumpHeight      5.96269
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.05641
		mainOctaves     10
		Coverage        0.246384
		stripeZones     1.44536
		stripeTwist     0.0696227
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          169.591
		Density         1.31632
		Pressure        1.00789
		Greenhouse      4.77101
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.032089
		Saturation      1

		Composition
		{
			CO2   	80.6958
			SO2   	8.60885
			C2H6  	7.32607
			H2S   	3.2009
			C3H8  	0.150813
			C2H4  	0.0118237
			N2    	0.00521507
			Cl2   	0.000204205
			O2    	0.000191278
			Ar    	9.42332e-005
		}
	}

	Aurora
	{
		Height      92.9231
		NorthLat    66.2188
		NorthLon    67.5098
		NorthRadius 951.399
		NorthWidth  335.042
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -82.9565
		SouthLon    242.69
		SouthRadius 1084.4
		SouthWidth  299.308
		SouthRings  4
		SouthBright 0.3
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
		SemiMajorAxis   0.0027993
		Period          0.00298048
		Eccentricity    0.0301758
		Inclination     0.167655
		AscendingNode   -61.7302
		ArgOfPericenter -18.0454
		MeanAnomaly     -155.981
	}
}

Moon	"Tion System 5.2"
{
	ParentBody     "Tion System 5"
	Class	       "Desert"

	Mass            0.138303
	Radius          4400.92
	InertiaMoment   0.33135

	Oblateness      0.00135488

	Obliquity       0.0989452
	EqAscendNode    115.247
	Precession      0
	TidalLocked     true

	AlbedoBond      0.385957
	AlbedoGeom      0.463148
	Brightness      2
	Color          (0.436 0.430 0.426)

	Surface
	{
		SurfStyle       0.674306
		OceanStyle      0.459592
		Randomize      (0.659, 0.012, 0.672)
		colorDistMagn   0.0758237
		colorDistFreq   434.941
		detailScale     11319.4
		colorConversion true
		seaLevel        0.113787
		snowLevel       0.85
		tropicLatitude  0.00185932
		icecapLatitude  0.827272
		icecapHeight    0.120008
		climatePole     0.9375
		climateTropic   0.469295
		climateEquator  0.6875
		heightTempGrad  0.468205
		tropicWidth     0.239143
		mainFreq        0.366789
		venusFreq       1.02701
		venusMagn       0.492017
		mareFreq        2.03345
		mareDensity     0.0171311
		terraceProb     0.221109
		erosion         0
		montesMagn      0.17083
		montesFreq      255.824
		montesSpiky     0.917008
		montesFraction  0.371082
		dunesMagn       0.0276888
		dunesFreq       36.9836
		dunesFraction   0.761453
		hillsMagn       0.159119
		hillsFreq       403.669
		hillsFraction   0
		hills2Fraction  0
		riversMagn      55.8737
		riversFreq      4.07926
		riversSin       6.15681
		riversOctaves   0
		canyonsMagn     0.0532926
		canyonsFreq     128.753
		canyonFraction  0
		cracksMagn      0.108106
		cracksFreq      0.39587
		cracksOctaves   0
		craterMagn      0.540956
		craterFreq      15.4028
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.665111
		volcanoFreq     0.761205
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.262895
		volcanoRadius   0.573852
		volcanoTemp     1494.26
		lavaCoverTidal  0.341097
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.42151
		stripeTwist     0.618116
		cycloneMagn     2.42171
		cycloneFreq     0.821378
		cycloneDensity  0.359601
		cycloneOctaves  4
		colorSea       (0.690, 0.540, 0.420, 0.000)
		colorShelf     (0.640, 0.500, 0.370, 0.000)
		colorBeach     (0.920, 0.560, 0.260, 0.000)
		colorDesert    (0.850, 0.500, 0.240, 0.000)
		colorLowland   (0.710, 0.470, 0.290, 0.000)
		colorUpland    (0.550, 0.400, 0.330, 0.000)
		colorRock      (0.510, 0.430, 0.400, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.710, 0.470, 0.290, 0.000)
		colorUpPlants  (0.550, 0.400, 0.330, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          14.2886
		Velocity        35.8568
		BumpHeight      4.28875
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.999894
		mainOctaves     10
		Coverage        0.371913
		stripeZones     1.42151
		stripeTwist     0.618116
	}

	Clouds
	{
		Height          18.5776
		Velocity        43.782
		BumpHeight      4.28875
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.999894
		mainOctaves     10
		Coverage        0.371913
		stripeZones     1.42151
		stripeTwist     0.618116
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          120.855
		Density         5.07803
		Pressure        2.05869
		Greenhouse      3.1439
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0243376
		Saturation      1

		Composition
		{
			CO2   	94.7585
			H2S   	4.96817
			C2H6  	0.220531
			C3H8  	0.0469669
			SO2   	0.00570936
			Ar    	0.000118865
			O2    	2.881e-005
		}
	}

	Aurora
	{
		Height      58.6452
		NorthLat    61.3933
		NorthLon    127.847
		NorthRadius 771.527
		NorthWidth  209.824
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -34.8664
		SouthLon    272.63
		SouthRadius 1383.8
		SouthWidth  326.468
		SouthRings  2
		SouthBright 0.3
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
		SemiMajorAxis   0.00476509
		Period          0.00661931
		Eccentricity    0.0222468
		Inclination     0.0989452
		AscendingNode   115.247
		ArgOfPericenter -107.913
		MeanAnomaly     162.924
	}
}

Moon	"Tion System 5.3"
{
	ParentBody     "Tion System 5"
	Class	       "Selena"

	Mass            0.162668
	Radius          4355
	InertiaMoment   0.330341

	Obliquity       -1.19826
	EqAscendNode    18.4518
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.562 0.555 0.552)

	Surface
	{
		SurfStyle       0.191895
		OceanStyle      0.676411
		Randomize      (-0.205, 0.085, 0.469)
		colorDistMagn   0.0600289
		colorDistFreq   671.446
		detailScale     11201.3
		colorConversion true
		drivenDarkening 0
		seaLevel        0.220894
		snowLevel       2
		tropicLatitude  0.0412748
		icecapLatitude  1
		icecapHeight    0.220894
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.92236
		venusFreq       0.828865
		venusMagn       0
		mareFreq        1.83509
		mareDensity     0.0169707
		terraceProb     0.167635
		erosion         0
		montesMagn      0.256861
		montesFreq      222.553
		montesSpiky     0.805496
		montesFraction  0.0141441
		dunesMagn       0.0335991
		dunesFreq       5750.53
		dunesFraction   0.439496
		hillsMagn       0.131914
		hillsFreq       595.248
		hillsFraction   0.0608387
		hills2Fraction  0
		riversMagn      62.2282
		riversFreq      1.86923
		riversSin       5.07728
		riversOctaves   0
		canyonsMagn     0.653508
		canyonsFreq     1.68618
		canyonFraction  0.795729
		cracksMagn      0.0620818
		cracksFreq      2.44723
		cracksOctaves   0
		craterMagn      0.655315
		craterFreq      11.1484
		craterDensity   0.767671
		craterOctaves   11.9987
		craterRayedFactor 0
		volcanoMagn     0.656232
		volcanoFreq     0.744046
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.281199
		volcanoRadius   0.51254
		volcanoTemp     1322.02
		lavaCoverTidal  0.0855849
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.950, 0.880, 0.500, 0.000)
		colorShelf     (0.980, 0.940, 0.460, 0.000)
		colorBeach     (0.534, 0.483, 0.243, 0.000)
		colorDesert    (0.517, 0.466, 0.138, 0.000)
		colorLowland   (0.523, 0.494, 0.182, 0.000)
		colorUpland    (0.484, 0.461, 0.199, 0.000)
		colorRock      (0.680, 0.490, 0.200, 0.000)
		colorSnow      (0.950, 0.930, 0.900, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999891
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          97.5188
		Density         1.08536e-005
		Pressure        3.4867e-006
		Greenhouse      0.00495282
		Bright          1.61107
		Opacity         0
		SkyLight        0.537023
		Hue             -0.0165862
		Saturation      1

		Composition
		{
			CO2   	42.1931
			SO2   	36.7214
			H2S   	10.2786
			C2H2  	8.07536
			N2    	1.44142
			C2H4  	0.935061
			C3H8  	0.193976
			C2H6  	0.159858
			CO    	0.000875864
			Ar    	0.000165684
			Cl2   	0.000150656
			O2    	1.17828e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00811134
		Period          0.0147007
		Eccentricity    0.0172649
		Inclination     -1.19826
		AscendingNode   18.4518
		ArgOfPericenter -44.8067
		MeanAnomaly     -118.223
	}
}

Moon	"Tion System 5.4"
{
	ParentBody     "Tion System 5"
	Class	       "Desert"

	Mass            1.92456
	Radius          8529.58
	InertiaMoment   0.329416

	Obliquity       1.43478
	EqAscendNode    -22.5125
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.685 0.587 0.501)

	Surface
	{
		SurfStyle       0.319129
		OceanStyle      0.021195
		Randomize      (0.447, 0.316, 0.706)
		colorDistMagn   0.0813664
		colorDistFreq   945.064
		detailScale     21938.6
		colorConversion true
		seaLevel        0.0825939
		snowLevel       2
		tropicLatitude  0.0490993
		icecapLatitude  0.854486
		icecapHeight    0.0881826
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.283931
		venusFreq       1.45301
		venusMagn       0
		mareFreq        2.23773
		mareDensity     0.202505
		terraceProb     0.303488
		erosion         0
		montesMagn      0.245422
		montesFreq      438.311
		montesSpiky     0.913886
		montesFraction  0.451489
		dunesMagn       0.0462376
		dunesFreq       80.4952
		dunesFraction   0.949258
		hillsMagn       0.160556
		hillsFreq       912.34
		hillsFraction   0
		hills2Fraction  0
		riversMagn      57.7968
		riversFreq      2.85536
		riversSin       4.74371
		riversOctaves   0
		canyonsMagn     0.0627976
		canyonsFreq     206.831
		canyonFraction  0
		cracksMagn      0.125766
		cracksFreq      0.604499
		cracksOctaves   0
		craterMagn      0.57228
		craterFreq      28.8952
		craterDensity   0.429439
		craterOctaves   6.58393
		volcanoMagn     0.752724
		volcanoFreq     0.632568
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.479807
		volcanoRadius   0.493789
		volcanoTemp     1598.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.570, 0.450, 0.350, 0.000)
		colorShelf     (0.510, 0.400, 0.300, 0.000)
		colorBeach     (0.910, 0.860, 0.580, 0.000)
		colorDesert    (0.880, 0.410, 0.220, 0.000)
		colorLowland   (0.220, 0.190, 0.140, 0.000)
		colorUpland    (0.900, 0.910, 0.680, 0.000)
		colorRock      (0.800, 0.480, 0.130, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.220, 0.190, 0.140, 0.000)
		colorUpPlants  (0.900, 0.910, 0.680, 0.000)
		BumpHeight      19.2796
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.013065
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          42.6479
		Density         0.0986935
		Pressure        0.0388291
		Greenhouse      0.601041
		Bright          9.97373
		Opacity         1
		SkyLight        3.32458
		Hue             0
		Saturation      0.820634

		Composition
		{
			CO2   	80.7126
			NH3   	8.33805
			CH4   	5.09501
			H2S   	4.75034
			C2H6  	0.399335
			N2    	0.27048
			C2H2  	0.255387
			C2H4  	0.10279
			C3H8  	0.0572263
			SO2   	0.0183378
			CO    	0.000154856
			H2O   	0.000126547
			O2    	6.8332e-005
			Ar    	5.8118e-005
			Ne    	1.24593e-005
		}
	}

	Aurora
	{
		Height      86.0456
		NorthLat    51.7048
		NorthLon    -175.416
		NorthRadius 1940.76
		NorthWidth  550.276
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -46.5136
		SouthLon    -4.26289
		SouthRadius 1608.8
		SouthWidth  496.961
		SouthRings  4
		SouthBright 0.3
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
		SemiMajorAxis   0.0138075
		Period          0.0326143
		Eccentricity    0.00018186
		Inclination     1.43478
		AscendingNode   -22.5125
		ArgOfPericenter -8.14265
		MeanAnomaly     -137.174
	}
}

Moon	"Tion System 5.5"
{
	ParentBody     "Tion System 5"
	Class	       "Selena"

	Mass            0.229369
	Radius          5165.65
	InertiaMoment   0.328336

	Obliquity       -1.48997
	EqAscendNode    -156.69
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.465 0.415 0.377)

	Surface
	{
		SurfStyle       0.845353
		OceanStyle      0.356784
		Randomize      (0.148, 0.055, -0.786)
		colorDistMagn   0.0476422
		colorDistFreq   607.848
		detailScale     13286.4
		colorConversion true
		drivenDarkening 0
		seaLevel        0.298888
		snowLevel       2
		tropicLatitude  0.0105064
		icecapLatitude  0.65095
		icecapHeight    0.323996
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.67492
		venusFreq       1.04497
		venusMagn       0
		mareFreq        1.61291
		mareDensity     0.0199398
		terraceProb     0.263457
		erosion         0
		montesMagn      0.258079
		montesFreq      209.811
		montesSpiky     0.940202
		montesFraction  0.0094423
		dunesMagn       0.0439094
		dunesFreq       6952.8
		dunesFraction   0.173616
		hillsMagn       0.109325
		hillsFreq       538.797
		hillsFraction   0.698721
		hills2Fraction  0
		riversMagn      54.0428
		riversFreq      4.08831
		riversSin       4.84016
		riversOctaves   0
		canyonsMagn     0.542476
		canyonsFreq     1.6336
		canyonFraction  0.113313
		cracksMagn      0.0593995
		cracksFreq      2.61941
		cracksOctaves   0
		craterMagn      0.657254
		craterFreq      13.8553
		craterDensity   0.98143
		craterOctaves   13
		craterRayedFactor 0
		volcanoMagn     0.638792
		volcanoFreq     0.588654
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.0947015
		volcanoRadius   0.45532
		volcanoTemp     1611.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.790, 0.790, 0.790, 0.000)
		colorShelf     (0.750, 0.750, 0.750, 0.000)
		colorBeach     (0.395, 0.353, 0.320, 0.000)
		colorDesert    (0.316, 0.274, 0.237, 0.000)
		colorLowland   (0.363, 0.311, 0.282, 0.000)
		colorUpland    (0.377, 0.320, 0.286, 0.000)
		colorRock      (0.710, 0.660, 0.670, 0.000)
		colorSnow      (0.660, 0.660, 0.660, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.988103
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Pluto"
		Height          169.751
		Density         0.00118967
		Pressure        0.000515811
		Greenhouse      0.106698
		Bright          4.12178
		Opacity         0
		SkyLight        1.37393
		Hue             -0.00108341
		Saturation      1

		Composition
		{
			H2S   	41.7075
			CO2   	29.3234
			C2H4  	19.48
			C2H2  	6.02644
			SO2   	2.08198
			N2    	0.871135
			C3H8  	0.320765
			C2H6  	0.187654
			CO    	0.000469707
			Ar    	0.000387182
			Cl2   	0.000140145
			O2    	7.52792e-005
		}
	}

	Aurora
	{
		Height      91.8302
		NorthLat    46.1844
		NorthLon    95.2825
		NorthRadius 1683.46
		NorthWidth  324.032
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -47.2273
		SouthLon    295.432
		SouthRadius 1160.99
		SouthWidth  317.211
		SouthRings  4
		SouthBright 0.3
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
		SemiMajorAxis   0.0235036
		Period          0.0725078
		Eccentricity    0.0120174
		Inclination     -1.48997
		AscendingNode   -156.69
		ArgOfPericenter 110.514
		MeanAnomaly     -138.662
	}
}

Moon	"Tion System 5.6"
{
	ParentBody     "Tion System 5"
	Class	       "Desert"

	Mass            0.275862
	Radius          5142.78
	InertiaMoment   0.325904

	Oblateness      0.00547915

	RotationPeriod  25.5528
	Obliquity       -31.0848
	EqAscendNode    -49.0977
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.791 0.750 0.709)

	Surface
	{
		SurfStyle       0.523689
		OceanStyle      0.10596
		Randomize      (-0.808, -0.978, -0.098)
		colorDistMagn   0.0588655
		colorDistFreq   693.28
		detailScale     13227.5
		colorConversion true
		seaLevel        0.0932155
		snowLevel       2
		tropicLatitude  0.518056
		icecapLatitude  0.923201
		icecapHeight    0.0981537
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.33346
		venusFreq       0.939497
		venusMagn       0
		mareFreq        2.05096
		mareDensity     0.0360625
		terraceProb     0.11635
		erosion         0
		montesMagn      0.192219
		montesFreq      254.67
		montesSpiky     0.975317
		montesFraction  0.535759
		dunesMagn       0.050461
		dunesFreq       41.3914
		dunesFraction   0.304735
		hillsMagn       0.112224
		hillsFreq       771.818
		hillsFraction   0
		hills2Fraction  0
		riversMagn      61.0033
		riversFreq      2.00117
		riversSin       4.25893
		riversOctaves   0
		canyonsMagn     0.0301928
		canyonsFreq     116.824
		canyonFraction  0
		cracksMagn      0.105926
		cracksFreq      0.41586
		cracksOctaves   0
		craterMagn      0.596957
		craterFreq      14.9112
		craterDensity   0.639907
		craterOctaves   9.98134
		volcanoMagn     0.644566
		volcanoFreq     0.625773
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.753548
		volcanoRadius   0.524771
		volcanoTemp     1217.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.690, 0.540, 0.420, 0.000)
		colorShelf     (0.640, 0.500, 0.370, 0.000)
		colorBeach     (0.510, 0.510, 0.490, 0.000)
		colorDesert    (0.190, 0.190, 0.220, 0.000)
		colorLowland   (0.550, 0.490, 0.460, 0.000)
		colorUpland    (0.490, 0.490, 0.470, 0.000)
		colorRock      (0.420, 0.410, 0.400, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.550, 0.490, 0.460, 0.000)
		colorUpPlants  (0.490, 0.490, 0.470, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.868179
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          42.1453
		Density         0.0131821
		Pressure        0.00497296
		Greenhouse      0.264125
		Bright          6.66802
		Opacity         1
		SkyLight        2.22267
		Hue             0.00666798
		Saturation      1

		Composition
		{
			CO2   	84.3123
			C2H2  	11.3282
			C2H4  	2.92232
			C2H6  	0.697751
			H2S   	0.289744
			N2    	0.222149
			C3H8  	0.142262
			NH3   	0.0733438
			SO2   	0.0112333
			H2O   	0.000270044
			Ar    	0.000204138
			CO    	0.000112807
			Ne    	2.29941e-005
		}
	}

	Aurora
	{
		Height      161.127
		NorthLat    81.3486
		NorthLon    122.456
		NorthRadius 1329.51
		NorthWidth  392.042
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -88.82
		SouthLon    304.185
		SouthRadius 1230.59
		SouthWidth  286.254
		SouthRings  4
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     6363.71
		OuterRadius     15889.8
		RotationPeriod  6.19141
		RotationOffset  0
		FrontBright     0.676635
		BackBright      0.553814
		Density         0.608636
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0400089
		Period          0.161029
		Eccentricity    0.0258565
		Inclination     -0.172207
		AscendingNode   -47.2514
		ArgOfPericenter -17.5438
		MeanAnomaly     30.611
	}
}

DwarfMoon	"Tion System 5.D4"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.35127e-006
	Radius          148.858
	InertiaMoment   0.397652

	RotationPeriod  323.904
	Obliquity       96.117
	EqAscendNode    132.748
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.577 0.570 0.567)

	Surface
	{
		SurfStyle       0.520271
		OceanStyle      0.59876
		Randomize      (-0.358, 0.830, -0.625)
		colorDistMagn   0.460233
		colorDistFreq   15.1282
		detailScale     4064.81
		colorConversion true
		snowLevel       2
		tropicLatitude  0.838893
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.507323
		terraceProb     0.763689
		erosion         0
		montesMagn      0.625273
		montesFreq      2.692
		montesSpiky     0.93102
		montesFraction  0.41314
		dunesFraction   0
		hillsMagn       0
		hillsFreq       73.4781
		hillsFraction   0.601074
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2345
		craterFreq      0.66448
		craterDensity   0.965977
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515157
		volcanoTemp     1819.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.188, 0.227, 0.000)
		colorShelf     (0.265, 0.234, 0.255, 0.000)
		colorBeach     (0.300, 0.257, 0.289, 0.000)
		colorDesert    (0.340, 0.296, 0.318, 0.000)
		colorLowland   (0.375, 0.325, 0.352, 0.000)
		colorUpland    (0.410, 0.348, 0.374, 0.000)
		colorRock      (0.456, 0.393, 0.442, 0.000)
		colorSnow      (0.456, 0.382, 0.431, 1.000)
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
		SemiMajorAxis   0.200699
		Period          1.80951
		Eccentricity    0.0381359
		Inclination     61.2773
		AscendingNode   133.074
		ArgOfPericenter -176.403
		MeanAnomaly     -46.405
	}
}

DwarfMoon	"Tion System 5.D5"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.98813e-006
	Radius          205.22
	InertiaMoment   0.398923

	RotationPeriod  366.717
	Obliquity       14.1678
	EqAscendNode    -144.352
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.624 0.566 0.466)

	Surface
	{
		SurfStyle       0.354848
		OceanStyle      0.219844
		Randomize      (-0.558, 0.583, -0.301)
		colorDistMagn   0.541665
		colorDistFreq   18.876
		detailScale     5603.88
		colorConversion true
		snowLevel       2
		tropicLatitude  0.572959
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.405713
		terraceProb     0.119436
		erosion         0
		montesMagn      0.423847
		montesFreq      2.64049
		montesSpiky     0.963135
		montesFraction  0.569172
		dunesFraction   0
		hillsMagn       0
		hillsFreq       124.152
		hillsFraction   0.6222
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248837
		craterFreq      1.11714
		craterDensity   0.713727
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467198
		volcanoTemp     1470.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.215, 0.149, 0.000)
		colorShelf     (0.250, 0.221, 0.168, 0.000)
		colorBeach     (0.293, 0.266, 0.205, 0.000)
		colorDesert    (0.318, 0.283, 0.200, 0.000)
		colorLowland   (0.350, 0.306, 0.233, 0.000)
		colorUpland    (0.362, 0.351, 0.261, 0.000)
		colorRock      (0.393, 0.379, 0.284, 0.000)
		colorSnow      (0.437, 0.413, 0.303, 1.000)
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
		SemiMajorAxis   0.201141
		Period          1.81548
		Eccentricity    0.242893
		Inclination     45.3078
		AscendingNode   -142.303
		ArgOfPericenter 0.621017
		MeanAnomaly     59.9035
	}
}

DwarfMoon	"Tion System 5.D6"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            2.98304e-006
	Radius          212.581
	InertiaMoment   0.39985

	RotationPeriod  312.707
	Obliquity       11.2181
	EqAscendNode    -120.752
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.697 0.692 0.690)

	Surface
	{
		SurfStyle       0.443735
		OceanStyle      0.945468
		Randomize      (-0.398, 0.526, 0.285)
		colorDistMagn   0.988589
		colorDistFreq   17.0767
		detailScale     5804.89
		colorConversion true
		snowLevel       2
		tropicLatitude  0.380124
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.390714
		terraceProb     0.411334
		erosion         0
		montesMagn      0.573008
		montesFreq      3.95695
		montesSpiky     0.973705
		montesFraction  0.479332
		dunesFraction   0
		hillsMagn       0
		hillsFreq       127.055
		hillsFraction   0.70882
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211336
		craterFreq      1.25502
		craterDensity   0.842246
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49396
		volcanoTemp     1685.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.277, 0.269, 0.000)
		colorShelf     (0.286, 0.319, 0.297, 0.000)
		colorBeach     (0.321, 0.360, 0.324, 0.000)
		colorDesert    (0.370, 0.409, 0.379, 0.000)
		colorLowland   (0.411, 0.450, 0.428, 0.000)
		colorUpland    (0.439, 0.492, 0.434, 0.000)
		colorRock      (0.509, 0.547, 0.517, 0.000)
		colorSnow      (0.495, 0.547, 0.517, 1.000)
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
		SemiMajorAxis   0.201403
		Period          1.81903
		Eccentricity    0.137135
		Inclination     28.3661
		AscendingNode   -131.976
		ArgOfPericenter 1.9507
		MeanAnomaly     -133.298
	}
}

DwarfMoon	"Tion System 5.D7"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            4.58439e-006
	Radius          234.619
	InertiaMoment   0.397885

	RotationPeriod  278.972
	Obliquity       -2.19421
	EqAscendNode    -164.99
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.409 0.402 0.399)

	Surface
	{
		SurfStyle       0.753764
		OceanStyle      0.478063
		Randomize      (-0.873, -0.532, -0.703)
		colorDistMagn   0.703012
		colorDistFreq   32.8171
		detailScale     6406.66
		colorConversion true
		snowLevel       2
		tropicLatitude  0.973996
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.424735
		terraceProb     0.105695
		erosion         0
		montesMagn      0.3399
		montesFreq      2.79799
		montesSpiky     0.879445
		montesFraction  0.806016
		dunesFraction   0
		hillsMagn       0
		hillsFreq       143.697
		hillsFraction   0.773554
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261336
		craterFreq      1.82287
		craterDensity   0.855569
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518332
		volcanoTemp     1353.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.344, 0.209, 0.048, 0.000)
		colorShelf     (0.328, 0.225, 0.076, 0.000)
		colorBeach     (0.352, 0.209, 0.048, 0.000)
		colorDesert    (0.340, 0.217, 0.048, 0.000)
		colorLowland   (0.348, 0.233, 0.064, 0.000)
		colorUpland    (0.344, 0.209, 0.048, 0.000)
		colorRock      (0.332, 0.209, 0.052, 0.000)
		colorSnow      (0.340, 0.217, 0.048, 1.000)
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
		SemiMajorAxis   0.201939
		Period          1.8263
		Eccentricity    0.17698
		Inclination     -79.0188
		AscendingNode   -164.495
		ArgOfPericenter -89.4775
		MeanAnomaly     -134.555
	}
}

DwarfMoon	"Tion System 5.D8"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.26468e-011
	Radius          3.15818
	InertiaMoment   0.399065

	RotationPeriod  1816.47
	Obliquity       -6.14629
	EqAscendNode    130.724
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.822 0.800 0.769)

	Surface
	{
		SurfStyle       0.800799
		OceanStyle      0.798966
		Randomize      (-0.462, 0.713, -0.189)
		colorDistMagn   0.219319
		colorDistFreq   0.00351193
		detailScale     86.2395
		colorConversion true
		snowLevel       2
		tropicLatitude  0.805992
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.665513
		terraceProb     0.137305
		erosion         0
		montesMagn      0.350658
		montesFreq      3.07021
		montesSpiky     0.944855
		montesFraction  0.691609
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.020791
		hillsFraction   0.636715
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239349
		craterFreq      0.162018
		craterDensity   0.829165
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502576
		volcanoTemp     1386.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.691, 0.584, 0.238, 0.000)
		colorShelf     (0.658, 0.600, 0.269, 0.000)
		colorBeach     (0.707, 0.600, 0.246, 0.000)
		colorDesert    (0.682, 0.600, 0.238, 0.000)
		colorLowland   (0.699, 0.616, 0.254, 0.000)
		colorUpland    (0.691, 0.600, 0.238, 0.000)
		colorRock      (0.666, 0.600, 0.246, 0.000)
		colorSnow      (0.682, 0.632, 0.254, 1.000)
		BumpHeight      2.84237
		BumpOffset      0.568473
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
		SemiMajorAxis   0.20237
		Period          1.83215
		Eccentricity    0.476777
		Inclination     -56.8879
		AscendingNode   122.958
		ArgOfPericenter -11.7599
		MeanAnomaly     -60.8576
	}
}

DwarfMoon	"Tion System 5.D9"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            2.56734e-011
	Radius          5.19187
	InertiaMoment   0.399975

	RotationPeriod  2028.72
	Obliquity       70.7806
	EqAscendNode    139.478
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.709 0.706 0.703)

	Surface
	{
		SurfStyle       0.606459
		OceanStyle      0.203972
		Randomize      (0.830, -0.606, 0.029)
		colorDistMagn   0.300888
		colorDistFreq   0.0156954
		detailScale     141.773
		colorConversion true
		snowLevel       2
		tropicLatitude  0.564108
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.281489
		terraceProb     0.919355
		erosion         0
		montesMagn      0.544679
		montesFreq      3.26351
		montesSpiky     0.960457
		montesFraction  0.669773
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0748709
		hillsFraction   0.664225
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22814
		craterFreq      0.186477
		craterDensity   1.06696
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51879
		volcanoTemp     1222.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.610, 0.537, 0.408, 0.000)
		colorShelf     (0.312, 0.240, 0.176, 0.000)
		colorBeach     (0.709, 0.593, 0.000, 0.000)
		colorDesert    (0.546, 0.494, 0.246, 0.000)
		colorLowland   (0.589, 0.480, 0.155, 0.270)
		colorUpland    (0.425, 0.283, 0.056, 0.000)
		colorRock      (0.156, 0.134, 0.077, 0.000)
		colorSnow      (0.553, 0.551, 0.549, 1.000)
		BumpHeight      4.67268
		BumpOffset      0.934536
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
		SemiMajorAxis   0.202752
		Period          1.83734
		Eccentricity    0.372587
		Inclination     85.9056
		AscendingNode   148.399
		ArgOfPericenter -77.0721
		MeanAnomaly     52.1255
	}
}

DwarfMoon	"Tion System 5.D10"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            4.74488e-011
	Radius          5.38882
	InertiaMoment   0.398092

	RotationPeriod  1644.97
	Obliquity       -11.4552
	EqAscendNode    -169.292
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.782 0.778 0.775)

	Surface
	{
		SurfStyle       0.523546
		OceanStyle      0.697932
		Randomize      (0.023, -0.655, -0.550)
		colorDistMagn   0.586299
		colorDistFreq   0.0058798
		detailScale     147.151
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0424513
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.747581
		terraceProb     0.419585
		erosion         0
		montesMagn      0.595377
		montesFreq      2.43482
		montesSpiky     0.899758
		montesFraction  0.768552
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0572895
		hillsFraction   0.422917
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233188
		craterFreq      0.190625
		craterDensity   0.855944
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.571678
		volcanoTemp     1626.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.313, 0.257, 0.310, 0.000)
		colorShelf     (0.360, 0.319, 0.349, 0.000)
		colorBeach     (0.406, 0.350, 0.395, 0.000)
		colorDesert    (0.461, 0.405, 0.434, 0.000)
		colorLowland   (0.508, 0.444, 0.481, 0.000)
		colorUpland    (0.555, 0.475, 0.512, 0.000)
		colorRock      (0.618, 0.537, 0.605, 0.000)
		colorSnow      (0.618, 0.521, 0.589, 1.000)
		BumpHeight      4.84994
		BumpOffset      0.969987
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
		SemiMajorAxis   0.203275
		Period          1.84446
		Eccentricity    0.0169079
		Inclination     -10.2961
		AscendingNode   -168.628
		ArgOfPericenter -102.217
		MeanAnomaly     -27.6887
	}
}

DwarfMoon	"Tion System 5.D11"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            8.20702e-011
	Radius          6.17266
	InertiaMoment   0.399202

	RotationPeriod  1473.78
	Obliquity       -28.8795
	EqAscendNode    159.387
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.688 0.682 0.679)

	Surface
	{
		SurfStyle       0.113192
		OceanStyle      0.350555
		Randomize      (-0.739, 0.385, 0.401)
		colorDistMagn   0.211936
		colorDistFreq   0.0142719
		detailScale     168.555
		colorConversion true
		snowLevel       2
		tropicLatitude  0.283548
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.470388
		terraceProb     0.243515
		erosion         0
		montesMagn      0.5756
		montesFreq      2.3338
		montesSpiky     0.975185
		montesFraction  0.743137
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0688089
		hillsFraction   0.503824
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233013
		craterFreq      0.16601
		craterDensity   0.997511
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.562233
		volcanoTemp     846.609
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.225, 0.272, 0.000)
		colorShelf     (0.261, 0.232, 0.285, 0.000)
		colorBeach     (0.282, 0.245, 0.306, 0.000)
		colorDesert    (0.289, 0.266, 0.319, 0.000)
		colorLowland   (0.316, 0.280, 0.339, 0.000)
		colorUpland    (0.323, 0.286, 0.360, 0.000)
		colorRock      (0.337, 0.293, 0.373, 0.000)
		colorSnow      (0.358, 0.307, 0.394, 1.000)
		BumpHeight      5.55539
		BumpOffset      1.11108
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
		SemiMajorAxis   0.203714
		Period          1.85043
		Eccentricity    0.00464962
		Inclination     -41.6973
		AscendingNode   161.771
		ArgOfPericenter -116.669
		MeanAnomaly     -174.031
	}
}

DwarfMoon	"Tion System 5.D12"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.35134e-010
	Radius          7.00019
	InertiaMoment   0.395893

	RotationPeriod  1326.27
	Obliquity       76.2586
	EqAscendNode    17.0585
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.836 0.757 0.710)

	Surface
	{
		SurfStyle       0.882642
		OceanStyle      0.60841
		Randomize      (0.754, -0.278, 0.391)
		colorDistMagn   0.620031
		colorDistFreq   0.0420581
		detailScale     191.152
		colorConversion true
		snowLevel       2
		tropicLatitude  0.821791
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.443894
		terraceProb     0.250471
		erosion         0
		montesMagn      0.487115
		montesFreq      4.52505
		montesSpiky     0.878546
		montesFraction  0.377299
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0943975
		hillsFraction   0.635008
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248117
		craterFreq      0.231449
		craterDensity   0.665239
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.438574
		volcanoTemp     1501.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.677, 0.439, 0.156, 0.000)
		colorShelf     (0.703, 0.477, 0.135, 0.000)
		colorBeach     (0.636, 0.439, 0.135, 0.000)
		colorDesert    (0.694, 0.439, 0.135, 0.000)
		colorLowland   (0.686, 0.477, 0.128, 0.000)
		colorUpland    (0.686, 0.553, 0.156, 0.000)
		colorRock      (0.694, 0.477, 0.149, 0.000)
		colorSnow      (0.694, 0.492, 0.170, 1.000)
		BumpHeight      6.30017
		BumpOffset      1.26003
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
		SemiMajorAxis   0.203936
		Period          1.85346
		Eccentricity    0.0303629
		Inclination     49.4589
		AscendingNode   11.1768
		ArgOfPericenter 31.8748
		MeanAnomaly     44.9862
	}
}

DwarfMoon	"Tion System 5.D13"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            2.14228e-010
	Radius          7.61215
	InertiaMoment   0.398281

	RotationPeriod  1175.13
	Obliquity       99.1387
	EqAscendNode    -9.16166
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.821 0.801 0.761)

	Surface
	{
		SurfStyle       0.905342
		OceanStyle      0.0875982
		Randomize      (-0.413, 0.795, 0.545)
		colorDistMagn   0.302759
		colorDistFreq   0.0239191
		detailScale     207.863
		colorConversion true
		snowLevel       2
		tropicLatitude  0.433416
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.656038
		terraceProb     0.369295
		erosion         0
		montesMagn      0.3324
		montesFreq      2.18231
		montesSpiky     0.910032
		montesFraction  0.756126
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0682011
		hillsFraction   0.664429
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205669
		craterFreq      0.192463
		craterDensity   0.773356
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.434918
		volcanoTemp     1552.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.665, 0.464, 0.167, 0.000)
		colorShelf     (0.689, 0.504, 0.145, 0.000)
		colorBeach     (0.624, 0.464, 0.145, 0.000)
		colorDesert    (0.681, 0.464, 0.145, 0.000)
		colorLowland   (0.673, 0.504, 0.137, 0.000)
		colorUpland    (0.673, 0.584, 0.167, 0.000)
		colorRock      (0.681, 0.504, 0.160, 0.000)
		colorSnow      (0.681, 0.520, 0.183, 1.000)
		BumpHeight      6.85094
		BumpOffset      1.37019
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
		SemiMajorAxis   0.204462
		Period          1.86064
		Eccentricity    0.0767146
		Inclination     58.3517
		AscendingNode   -13.3234
		ArgOfPericenter 14.452
		MeanAnomaly     -13.3675
	}
}

DwarfMoon	"Tion System 5.D14"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            3.29586e-010
	Radius          10.3723
	InertiaMoment   0.399336

	RotationPeriod  1275.24
	Obliquity       -88.0651
	EqAscendNode    9.63832
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.552 0.547 0.542)

	Surface
	{
		SurfStyle       0.0689982
		OceanStyle      0.398464
		Randomize      (-0.406, -0.854, -0.067)
		colorDistMagn   0.700746
		colorDistFreq   0.0856349
		detailScale     283.234
		colorConversion true
		snowLevel       2
		tropicLatitude  0.497374
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.557424
		terraceProb     0.342427
		erosion         0
		montesMagn      0.295901
		montesFreq      2.55107
		montesSpiky     0.881208
		montesFraction  0.690024
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.20696
		hillsFraction   0.605909
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218825
		craterFreq      0.214931
		craterDensity   0.90089
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487046
		volcanoTemp     1615.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.219, 0.179, 0.000)
		colorShelf     (0.215, 0.230, 0.195, 0.000)
		colorBeach     (0.232, 0.246, 0.217, 0.000)
		colorDesert    (0.243, 0.257, 0.211, 0.000)
		colorLowland   (0.260, 0.273, 0.233, 0.000)
		colorUpland    (0.276, 0.290, 0.244, 0.000)
		colorRock      (0.282, 0.301, 0.255, 0.000)
		colorSnow      (0.298, 0.317, 0.260, 1.000)
		BumpHeight      9.3351
		BumpOffset      1.86702
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
		SemiMajorAxis   0.205097
		Period          1.86931
		Eccentricity    0.134215
		Inclination     -62.9265
		AscendingNode   7.19784
		ArgOfPericenter -179.714
		MeanAnomaly     -94.1728
	}
}

DwarfMoon	"Tion System 5.D15"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            4.94956e-010
	Radius          11.3011
	InertiaMoment   0.396608

	RotationPeriod  1150.53
	Obliquity       -12.1237
	EqAscendNode    -41.9408
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.699 0.693 0.691)

	Surface
	{
		SurfStyle       0.834099
		OceanStyle      0.268443
		Randomize      (0.285, -0.721, -0.136)
		colorDistMagn   0.33958
		colorDistFreq   0.0116217
		detailScale     308.596
		colorConversion true
		snowLevel       2
		tropicLatitude  0.776714
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.417267
		terraceProb     0.306322
		erosion         0
		montesMagn      0.459078
		montesFreq      2.7825
		montesSpiky     0.908627
		montesFraction  0.603213
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.254338
		hillsFraction   0.652628
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23386
		craterFreq      0.238147
		craterDensity   0.938432
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.570941
		volcanoTemp     1489.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.567, 0.347, 0.131, 0.550)
		colorShelf     (0.588, 0.374, 0.111, 0.480)
		colorBeach     (0.532, 0.326, 0.124, 0.600)
		colorDesert    (0.581, 0.354, 0.131, 0.600)
		colorLowland   (0.574, 0.368, 0.124, 0.630)
		colorUpland    (0.574, 0.361, 0.124, 0.550)
		colorRock      (0.581, 0.368, 0.124, 0.420)
		colorSnow      (0.581, 0.374, 0.145, 1.000)
		BumpHeight      10.171
		BumpOffset      2.0342
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
		SemiMajorAxis   0.205305
		Period          1.87216
		Eccentricity    0.452193
		Inclination     -40.9217
		AscendingNode   -37.6658
		ArgOfPericenter -141.262
		MeanAnomaly     159.904
	}
}

DwarfMoon	"Tion System 5.D16"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            7.28758e-010
	Radius          12.3501
	InertiaMoment   0.398455

	RotationPeriod  1053.38
	Obliquity       -0.302899
	EqAscendNode    -147.328
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.723 0.722 0.719)

	Surface
	{
		SurfStyle       0.221368
		OceanStyle      0.445969
		Randomize      (0.043, 0.275, -0.210)
		colorDistMagn   0.780154
		colorDistFreq   0.0529258
		detailScale     337.24
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0502439
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.638102
		terraceProb     0.272675
		erosion         0
		montesMagn      0.571286
		montesFreq      3.35036
		montesSpiky     0.901578
		montesFraction  0.724342
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.327951
		hillsFraction   0.716355
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245951
		craterFreq      0.200004
		craterDensity   0.798629
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44929
		volcanoTemp     1935.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.282, 0.245, 0.201, 0.000)
		colorShelf     (0.289, 0.253, 0.230, 0.000)
		colorBeach     (0.340, 0.296, 0.273, 0.000)
		colorDesert    (0.369, 0.318, 0.266, 0.000)
		colorLowland   (0.405, 0.339, 0.302, 0.000)
		colorUpland    (0.449, 0.411, 0.367, 0.000)
		colorRock      (0.485, 0.448, 0.395, 0.000)
		colorSnow      (0.528, 0.476, 0.417, 1.000)
		BumpHeight      11.1151
		BumpOffset      2.22302
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
		SemiMajorAxis   0.205766
		Period          1.87846
		Eccentricity    0.321025
		Inclination     -3.12717
		AscendingNode   -146.326
		ArgOfPericenter 3.76349
		MeanAnomaly     165.878
	}
}

DwarfMoon	"Tion System 5.D17"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.05562e-009
	Radius          13.2008
	InertiaMoment   0.399467

	RotationPeriod  950.595
	Obliquity       -104.299
	EqAscendNode    135.904
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.726 0.724 0.723)

	Surface
	{
		SurfStyle       0.152528
		OceanStyle      0.127945
		Randomize      (-0.924, -0.954, 0.096)
		colorDistMagn   0.424817
		colorDistFreq   0.0874602
		detailScale     360.471
		colorConversion true
		snowLevel       2
		tropicLatitude  0.732762
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.545899
		terraceProb     0.233188
		erosion         0
		montesMagn      0.460883
		montesFreq      2.88626
		montesSpiky     0.879712
		montesFraction  0.534068
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.321059
		hillsFraction   0.637375
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252779
		craterFreq      0.237003
		craterDensity   0.833084
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502608
		volcanoTemp     1368.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.282, 0.289, 0.000)
		colorShelf     (0.247, 0.304, 0.304, 0.000)
		colorBeach     (0.261, 0.326, 0.318, 0.000)
		colorDesert    (0.269, 0.340, 0.340, 0.000)
		colorLowland   (0.276, 0.362, 0.354, 0.000)
		colorUpland    (0.290, 0.384, 0.383, 0.000)
		colorRock      (0.327, 0.398, 0.397, 0.000)
		colorSnow      (0.319, 0.420, 0.419, 1.000)
		BumpHeight      11.8808
		BumpOffset      2.37615
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
		SemiMajorAxis   0.206342
		Period          1.88635
		Eccentricity    0.385609
		Inclination     -81.1434
		AscendingNode   138.628
		ArgOfPericenter 100.862
		MeanAnomaly     -9.79327
	}
}

DwarfMoon	"Tion System 5.D18"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.50845e-009
	Radius          17.3922
	InertiaMoment   0.397046

	RotationPeriod  1033.35
	Obliquity       -128.194
	EqAscendNode    112.313
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.537 0.531 0.527)

	Surface
	{
		SurfStyle       0.0840873
		OceanStyle      0.711687
		Randomize      (-0.207, -0.273, 0.357)
		colorDistMagn   0.66429
		colorDistFreq   0.262163
		detailScale     474.922
		colorConversion true
		snowLevel       2
		tropicLatitude  0.973173
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.55423
		terraceProb     0.202962
		erosion         0
		montesMagn      0.617888
		montesFreq      3.23315
		montesSpiky     0.935793
		montesFraction  0.654607
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.829997
		hillsFraction   0.552143
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259984
		craterFreq      0.179376
		craterDensity   0.820139
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508173
		volcanoTemp     1307.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.175, 0.211, 0.000)
		colorShelf     (0.204, 0.180, 0.221, 0.000)
		colorBeach     (0.220, 0.191, 0.237, 0.000)
		colorDesert    (0.225, 0.207, 0.248, 0.000)
		colorLowland   (0.247, 0.218, 0.264, 0.000)
		colorUpland    (0.252, 0.223, 0.279, 0.000)
		colorRock      (0.263, 0.228, 0.290, 0.000)
		colorSnow      (0.279, 0.239, 0.306, 1.000)
		BumpHeight      15.6529
		BumpOffset      3.13059
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
		SemiMajorAxis   0.206926
		Period          1.89438
		Eccentricity    0.490093
		Inclination     -79.0612
		AscendingNode   116.758
		ArgOfPericenter 136.533
		MeanAnomaly     -108.937
	}
}

DwarfMoon	"Tion System 5.D19"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            2.13122e-009
	Radius          18.4956
	InertiaMoment   0.398618

	RotationPeriod  938.726
	Obliquity       37.0075
	EqAscendNode    117.434
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.708 0.704 0.700)

	Surface
	{
		SurfStyle       0.0520891
		OceanStyle      0.892923
		Randomize      (0.213, 0.907, -0.019)
		colorDistMagn   0.821748
		colorDistFreq   0.216326
		detailScale     505.052
		colorConversion true
		snowLevel       2
		tropicLatitude  0.558766
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.598342
		terraceProb     0.230125
		erosion         0
		montesMagn      0.390609
		montesFreq      3.00978
		montesSpiky     0.834043
		montesFraction  0.528236
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.660716
		hillsFraction   0.498369
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235934
		craterFreq      0.183556
		craterDensity   0.858749
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.564219
		volcanoTemp     1602.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.282, 0.231, 0.000)
		colorShelf     (0.276, 0.296, 0.252, 0.000)
		colorBeach     (0.297, 0.317, 0.280, 0.000)
		colorDesert    (0.311, 0.331, 0.273, 0.000)
		colorLowland   (0.333, 0.352, 0.301, 0.000)
		colorUpland    (0.354, 0.373, 0.315, 0.000)
		colorRock      (0.361, 0.387, 0.329, 0.000)
		colorSnow      (0.382, 0.408, 0.336, 1.000)
		BumpHeight      16.646
		BumpOffset      3.3292
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
		SemiMajorAxis   0.20734
		Period          1.90006
		Eccentricity    0.0538508
		Inclination     32.1903
		AscendingNode   118.604
		ArgOfPericenter 70.225
		MeanAnomaly     -26.9054
	}
}

DwarfMoon	"Tion System 5.D20"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            2.98274e-009
	Radius          19.8709
	InertiaMoment   0.399595

	RotationPeriod  862.502
	Obliquity       -25.2231
	EqAscendNode    -65.8764
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.768 0.766 0.764)

	Surface
	{
		SurfStyle       0.777009
		OceanStyle      0.981851
		Randomize      (-0.442, -0.860, 0.367)
		colorDistMagn   0.577584
		colorDistFreq   0.136807
		detailScale     542.607
		colorConversion true
		snowLevel       2
		tropicLatitude  0.856645
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.584909
		terraceProb     0.100338
		erosion         0
		montesMagn      0.536308
		montesFreq      3.07863
		montesSpiky     0.957849
		montesFraction  0.347798
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.36453
		hillsFraction   0.760518
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241246
		craterFreq      0.19895
		craterDensity   0.967153
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518776
		volcanoTemp     1171.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.645, 0.559, 0.237, 0.000)
		colorShelf     (0.615, 0.575, 0.267, 0.000)
		colorBeach     (0.661, 0.575, 0.244, 0.000)
		colorDesert    (0.638, 0.575, 0.237, 0.000)
		colorLowland   (0.653, 0.590, 0.252, 0.000)
		colorUpland    (0.645, 0.575, 0.237, 0.000)
		colorRock      (0.622, 0.575, 0.244, 0.000)
		colorSnow      (0.638, 0.605, 0.252, 1.000)
		BumpHeight      17.8838
		BumpOffset      3.57676
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
		SemiMajorAxis   0.207586
		Period          1.90344
		Eccentricity    0.478707
		Inclination     -44.0284
		AscendingNode   -62.9839
		ArgOfPericenter 48.794
		MeanAnomaly     -45.3077
	}
}

DwarfMoon	"Tion System 5.D21"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            4.14177e-009
	Radius          21.0778
	InertiaMoment   0.397376

	RotationPeriod  782.672
	Obliquity       -75.0923
	EqAscendNode    -13.6452
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.558 0.485 0.390)

	Surface
	{
		SurfStyle       0.79298
		OceanStyle      0.104547
		Randomize      (0.608, 0.309, -0.676)
		colorDistMagn   0.974131
		colorDistFreq   0.0957581
		detailScale     575.565
		colorConversion true
		snowLevel       2
		tropicLatitude  0.66167
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.351776
		terraceProb     0.212491
		erosion         0
		montesMagn      0.529401
		montesFreq      2.77682
		montesSpiky     0.976159
		montesFraction  0.940913
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.10953
		hillsFraction   0.666001
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216162
		craterFreq      0.193688
		craterDensity   0.795748
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471313
		volcanoTemp     1572.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.469, 0.354, 0.121, 0.000)
		colorShelf     (0.447, 0.364, 0.136, 0.000)
		colorBeach     (0.480, 0.364, 0.125, 0.000)
		colorDesert    (0.463, 0.364, 0.121, 0.000)
		colorLowland   (0.474, 0.374, 0.129, 0.000)
		colorUpland    (0.469, 0.364, 0.121, 0.000)
		colorRock      (0.452, 0.364, 0.125, 0.000)
		colorSnow      (0.463, 0.383, 0.129, 1.000)
		BumpHeight      18.97
		BumpOffset      3.79401
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
		SemiMajorAxis   0.207914
		Period          1.90795
		Eccentricity    0.0874183
		Inclination     -67.914
		AscendingNode   -19.024
		ArgOfPericenter -76.5473
		MeanAnomaly     127.755
	}
}

DwarfMoon	"Tion System 5.D22"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            5.71398e-009
	Radius          27.4251
	InertiaMoment   0.398773

	RotationPeriod  859.868
	Obliquity       -114.845
	EqAscendNode    115.587
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.650 0.501 0.440)

	Surface
	{
		SurfStyle       0.0591111
		OceanStyle      0.176872
		Randomize      (-0.611, 0.594, -0.253)
		colorDistMagn   0.924187
		colorDistFreq   0.464617
		detailScale     748.889
		colorConversion true
		snowLevel       2
		tropicLatitude  0.961563
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.660818
		terraceProb     0.666174
		erosion         0
		montesMagn      0.51254
		montesFreq      2.80007
		montesSpiky     0.968243
		montesFraction  0.672492
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.07328
		hillsFraction   0.720738
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2318
		craterFreq      0.227299
		craterDensity   0.82999
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522882
		volcanoTemp     1667.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.240, 0.200, 0.145, 0.000)
		colorShelf     (0.253, 0.210, 0.158, 0.000)
		colorBeach     (0.273, 0.225, 0.176, 0.000)
		colorDesert    (0.286, 0.235, 0.172, 0.000)
		colorLowland   (0.305, 0.250, 0.189, 0.000)
		colorUpland    (0.325, 0.265, 0.198, 0.000)
		colorRock      (0.331, 0.275, 0.207, 0.000)
		colorSnow      (0.351, 0.290, 0.211, 1.000)
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
		SemiMajorAxis   0.208137
		Period          1.91103
		Eccentricity    0.0933936
		Inclination     -81.684
		AscendingNode   111.931
		ArgOfPericenter -130.775
		MeanAnomaly     -90.0429
	}
}

DwarfMoon	"Tion System 5.D23"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            7.84165e-009
	Radius          28.7307
	InertiaMoment   0.399722

	RotationPeriod  778.366
	Obliquity       100.323
	EqAscendNode    129.55
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.453 0.449 0.442)

	Surface
	{
		SurfStyle       0.0163141
		OceanStyle      0.484312
		Randomize      (0.073, -0.284, -0.357)
		colorDistMagn   0.737433
		colorDistFreq   0.265512
		detailScale     784.539
		colorConversion true
		snowLevel       2
		tropicLatitude  0.872348
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.346394
		terraceProb     0.281518
		erosion         0
		montesMagn      0.454678
		montesFreq      3.72896
		montesSpiky     0.877242
		montesFraction  0.639043
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.60514
		hillsFraction   0.692417
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25263
		craterFreq      0.235271
		craterDensity   0.908571
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526962
		volcanoTemp     1820.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.179, 0.177, 0.000)
		colorShelf     (0.190, 0.188, 0.186, 0.000)
		colorBeach     (0.204, 0.202, 0.199, 0.000)
		colorDesert    (0.213, 0.211, 0.208, 0.000)
		colorLowland   (0.227, 0.224, 0.221, 0.000)
		colorUpland    (0.240, 0.238, 0.234, 0.000)
		colorRock      (0.249, 0.247, 0.243, 0.000)
		colorSnow      (0.263, 0.260, 0.257, 1.000)
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
		SemiMajorAxis   0.208452
		Period          1.91536
		Eccentricity    0.101676
		Inclination     79.523
		AscendingNode   122.618
		ArgOfPericenter -53.1014
		MeanAnomaly     109.51
	}
}

DwarfMoon	"Tion System 5.D24"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.07168e-008
	Radius          30.6088
	InertiaMoment   0.397647

	RotationPeriod  713.685
	Obliquity       -113.728
	EqAscendNode    58.6094
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.747 0.745 0.744)

	Surface
	{
		SurfStyle       0.530715
		OceanStyle      0.947957
		Randomize      (-0.342, -0.754, 0.470)
		colorDistMagn   0.876952
		colorDistFreq   0.443135
		detailScale     835.824
		colorConversion true
		snowLevel       2
		tropicLatitude  0.80475
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.496511
		terraceProb     0.406114
		erosion         0
		montesMagn      0.349585
		montesFreq      3.8263
		montesSpiky     0.743698
		montesFraction  0.315968
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.83463
		hillsFraction   0.478471
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236251
		craterFreq      0.255325
		craterDensity   0.679218
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.406001
		volcanoTemp     1598.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.246, 0.298, 0.000)
		colorShelf     (0.344, 0.306, 0.335, 0.000)
		colorBeach     (0.389, 0.335, 0.379, 0.000)
		colorDesert    (0.441, 0.387, 0.417, 0.000)
		colorLowland   (0.486, 0.425, 0.461, 0.000)
		colorUpland    (0.531, 0.455, 0.491, 0.000)
		colorRock      (0.590, 0.514, 0.580, 0.000)
		colorSnow      (0.590, 0.499, 0.565, 1.000)
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
		SemiMajorAxis   0.208863
		Period          1.92103
		Eccentricity    0.141166
		Inclination     -68.5647
		AscendingNode   58.3962
		ArgOfPericenter 47.4791
		MeanAnomaly     -97.5684
	}
}

DwarfMoon	"Tion System 5.D25"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.46e-008
	Radius          32.3896
	InertiaMoment   0.39892

	RotationPeriod  653.361
	Obliquity       12.0708
	EqAscendNode    24.5589
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.608 0.564 0.514)

	Surface
	{
		SurfStyle       0.557602
		OceanStyle      0.184061
		Randomize      (-0.578, -0.954, 0.767)
		colorDistMagn   0.502003
		colorDistFreq   0.314505
		detailScale     884.453
		colorConversion true
		snowLevel       2
		tropicLatitude  0.261574
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.76776
		terraceProb     0.165365
		erosion         0
		montesMagn      0.622612
		montesFreq      3.80562
		montesSpiky     0.888632
		montesFraction  0.384351
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.38843
		hillsFraction   0.685007
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258864
		craterFreq      0.161074
		craterDensity   0.887846
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.457085
		volcanoTemp     1440.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.176, 0.197, 0.205, 0.000)
		colorShelf     (0.201, 0.243, 0.236, 0.000)
		colorBeach     (0.219, 0.265, 0.267, 0.000)
		colorDesert    (0.268, 0.299, 0.303, 0.000)
		colorLowland   (0.298, 0.339, 0.334, 0.000)
		colorUpland    (0.389, 0.463, 0.452, 0.000)
		colorRock      (0.341, 0.406, 0.406, 0.000)
		colorSnow      (0.341, 0.395, 0.406, 1.000)
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
		SemiMajorAxis   0.209473
		Period          1.92945
		Eccentricity    0.228101
		Inclination     3.2662
		AscendingNode   21.0704
		ArgOfPericenter -140.858
		MeanAnomaly     42.311
	}
}

DwarfMoon	"Tion System 5.D26"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.98464e-008
	Radius          42.1185
	InertiaMoment   0.399848

	RotationPeriod  723.35
	Obliquity       34.3661
	EqAscendNode    171.991
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.780 0.778 0.777)

	Surface
	{
		SurfStyle       0.509304
		OceanStyle      0.053956
		Randomize      (-0.456, 0.258, 0.498)
		colorDistMagn   0.969312
		colorDistFreq   0.732648
		detailScale     1150.12
		colorConversion true
		snowLevel       2
		tropicLatitude  0.300351
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.651114
		terraceProb     0.421105
		erosion         0
		montesMagn      0.476544
		montesFreq      2.24862
		montesSpiky     0.985177
		montesFraction  0.673075
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.10628
		hillsFraction   0.792039
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248476
		craterFreq      0.192886
		craterDensity   0.975752
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535098
		volcanoTemp     1610.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.257, 0.311, 0.000)
		colorShelf     (0.359, 0.319, 0.350, 0.000)
		colorBeach     (0.406, 0.350, 0.396, 0.000)
		colorDesert    (0.460, 0.405, 0.435, 0.000)
		colorLowland   (0.507, 0.444, 0.482, 0.000)
		colorUpland    (0.554, 0.475, 0.513, 0.000)
		colorRock      (0.616, 0.537, 0.606, 0.000)
		colorSnow      (0.616, 0.521, 0.591, 1.000)
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
		SemiMajorAxis   0.210138
		Period          1.93865
		Eccentricity    0.460778
		Inclination     51.5493
		AscendingNode   175.222
		ArgOfPericenter -63.3127
		MeanAnomaly     62.573
	}
}

DwarfMoon	"Tion System 5.D27"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            2.69422e-008
	Radius          43.6344
	InertiaMoment   0.39788

	RotationPeriod  647.88
	Obliquity       151.164
	EqAscendNode    -112.924
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.726 0.663 0.620)

	Surface
	{
		SurfStyle       0.00774249
		OceanStyle      0.808367
		Randomize      (0.515, -0.076, -0.113)
		colorDistMagn   0.375718
		colorDistFreq   0.469506
		detailScale     1191.51
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999853
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.566541
		terraceProb     0.486427
		erosion         0
		montesMagn      0.474633
		montesFreq      2.72194
		montesSpiky     0.931991
		montesFraction  0.533751
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.9675
		hillsFraction   0.513053
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241541
		craterFreq      0.189274
		craterDensity   0.833411
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.459687
		volcanoTemp     1537.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.291, 0.265, 0.248, 0.000)
		colorShelf     (0.305, 0.279, 0.260, 0.000)
		colorBeach     (0.327, 0.299, 0.279, 0.000)
		colorDesert    (0.341, 0.312, 0.291, 0.000)
		colorLowland   (0.363, 0.332, 0.310, 0.000)
		colorUpland    (0.385, 0.352, 0.329, 0.000)
		colorRock      (0.400, 0.365, 0.341, 0.000)
		colorSnow      (0.421, 0.385, 0.360, 1.000)
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
		SemiMajorAxis   0.210339
		Period          1.94143
		Eccentricity    0.145534
		Inclination     74.3967
		AscendingNode   -122.963
		ArgOfPericenter -86.5099
		MeanAnomaly     -88.7551
	}
}

DwarfMoon	"Tion System 5.D28"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            3.65587e-008
	Radius          46.3378
	InertiaMoment   0.399062

	RotationPeriod  595.525
	Obliquity       -7.21292
	EqAscendNode    -111.049
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.775 0.702 0.601)

	Surface
	{
		SurfStyle       0.393025
		OceanStyle      0.53907
		Randomize      (-0.273, 0.836, -0.949)
		colorDistMagn   0.562622
		colorDistFreq   0.997602
		detailScale     1265.33
		colorConversion true
		snowLevel       2
		tropicLatitude  0.821815
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.525031
		terraceProb     0.357321
		erosion         0
		montesMagn      0.483036
		montesFreq      3.55065
		montesSpiky     0.742608
		montesFraction  0.526941
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.13813
		hillsFraction   0.563621
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.215477
		craterFreq      0.221471
		craterDensity   1.00188
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501599
		volcanoTemp     1458.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.264, 0.246, 0.240, 0.050)
		colorShelf     (0.310, 0.288, 0.276, 0.040)
		colorBeach     (0.357, 0.330, 0.312, 0.030)
		colorDesert    (0.403, 0.372, 0.354, 0.020)
		colorLowland   (0.450, 0.414, 0.390, 0.030)
		colorUpland    (0.496, 0.456, 0.426, 0.050)
		colorRock      (0.543, 0.498, 0.474, 0.020)
		colorSnow      (0.543, 0.498, 0.474, 1.000)
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
		SemiMajorAxis   0.210586
		Period          1.94485
		Eccentricity    0.45397
		Inclination     -57.9933
		AscendingNode   -114.369
		ArgOfPericenter -24.0436
		MeanAnomaly     -101.779
	}
}

DwarfMoon	"Tion System 5.D29"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            4.96277e-008
	Radius          49.1022
	InertiaMoment   0.399973

	RotationPeriod  545.763
	Obliquity       1.38586
	EqAscendNode    108.478
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.838 0.799 0.725)

	Surface
	{
		SurfStyle       0.702311
		OceanStyle      0.746982
		Randomize      (0.560, 0.021, 0.801)
		colorDistMagn   0.172329
		colorDistFreq   0.897866
		detailScale     1340.82
		colorConversion true
		snowLevel       2
		tropicLatitude  0.283486
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.722738
		terraceProb     0.172684
		erosion         0
		montesMagn      0.487324
		montesFreq      2.94867
		montesSpiky     0.991774
		montesFraction  0.816993
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.35139
		hillsFraction   0.489525
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230994
		craterFreq      0.26998
		craterDensity   0.856572
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492994
		volcanoTemp     1333.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.704, 0.448, 0.210, 0.000)
		colorShelf     (0.670, 0.496, 0.254, 0.000)
		colorBeach     (0.721, 0.448, 0.225, 0.000)
		colorDesert    (0.696, 0.464, 0.225, 0.000)
		colorLowland   (0.712, 0.480, 0.246, 0.000)
		colorUpland    (0.704, 0.448, 0.203, 0.000)
		colorRock      (0.679, 0.480, 0.239, 0.000)
		colorSnow      (0.696, 0.496, 0.246, 1.000)
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
		SemiMajorAxis   0.211061
		Period          1.95143
		Eccentricity    0.11143
		Inclination     16.5785
		AscendingNode   96.8845
		ArgOfPericenter -159.525
		MeanAnomaly     35.0304
	}
}

DwarfMoon	"Tion System 5.D30"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            6.74549e-008
	Radius          64.4985
	InertiaMoment   0.398088

	RotationPeriod  608.814
	Obliquity       -50.7175
	EqAscendNode    -0.363032
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.553 0.395 0.337)

	Surface
	{
		SurfStyle       0.256635
		OceanStyle      0.330675
		Randomize      (-0.165, 0.434, 0.156)
		colorDistMagn   0.836399
		colorDistFreq   1.25737
		detailScale     1761.24
		colorConversion true
		snowLevel       2
		tropicLatitude  0.868221
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.30205
		terraceProb     0.170203
		erosion         0
		montesMagn      0.550919
		montesFreq      2.7195
		montesSpiky     0.927905
		montesFraction  0.210584
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.04378
		hillsFraction   0.636141
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21216
		craterFreq      0.270957
		craterDensity   0.833296
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535542
		volcanoTemp     1544.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.216, 0.142, 0.081, 0.000)
		colorShelf     (0.221, 0.150, 0.098, 0.000)
		colorBeach     (0.260, 0.174, 0.111, 0.000)
		colorDesert    (0.282, 0.190, 0.111, 0.000)
		colorLowland   (0.310, 0.202, 0.121, 0.000)
		colorUpland    (0.343, 0.241, 0.145, 0.000)
		colorRock      (0.371, 0.265, 0.151, 0.000)
		colorSnow      (0.404, 0.281, 0.165, 1.000)
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
		SemiMajorAxis   0.211607
		Period          1.95902
		Eccentricity    0.116722
		Inclination     -9.5351
		AscendingNode   -0.238265
		ArgOfPericenter -87.1299
		MeanAnomaly     -152.901
	}
}

DwarfMoon	"Tion System 5.D31"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            9.18851e-008
	Radius          66.1298
	InertiaMoment   0.3992

	RotationPeriod  540.284
	Obliquity       -14.841
	EqAscendNode    58.2968
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.480 0.471 0.466)

	Surface
	{
		SurfStyle       0.574818
		OceanStyle      0.668564
		Randomize      (0.388, 0.229, 0.494)
		colorDistMagn   0.926558
		colorDistFreq   1.90928
		detailScale     1805.78
		colorConversion true
		snowLevel       2
		tropicLatitude  0.219651
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.622114
		terraceProb     0.230586
		erosion         0
		montesMagn      0.532916
		montesFreq      3.06259
		montesSpiky     0.816597
		montesFraction  0.685291
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.40173
		hillsFraction   0.549088
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224385
		craterFreq      0.229344
		craterDensity   0.746766
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.592365
		volcanoTemp     1633.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.139, 0.165, 0.187, 0.000)
		colorShelf     (0.158, 0.203, 0.215, 0.000)
		colorBeach     (0.173, 0.222, 0.243, 0.000)
		colorDesert    (0.211, 0.250, 0.275, 0.000)
		colorLowland   (0.235, 0.283, 0.303, 0.000)
		colorUpland    (0.307, 0.387, 0.410, 0.000)
		colorRock      (0.269, 0.339, 0.368, 0.000)
		colorSnow      (0.269, 0.330, 0.368, 1.000)
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
		SemiMajorAxis   0.212065
		Period          1.96538
		Eccentricity    0.493104
		Inclination     12.3512
		AscendingNode   55.1459
		ArgOfPericenter -49.644
		MeanAnomaly     98.5193
	}
}

DwarfMoon	"Tion System 5.D32"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.25553e-007
	Radius          70.3046
	InertiaMoment   0.39587

	RotationPeriod  492.295
	Obliquity       47.2769
	EqAscendNode    38.5929
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.850 0.783 0.747)

	Surface
	{
		SurfStyle       0.769354
		OceanStyle      0.857978
		Randomize      (-0.568, -0.776, -0.788)
		colorDistMagn   0.35051
		colorDistFreq   2.24619
		detailScale     1919.78
		colorConversion true
		snowLevel       2
		tropicLatitude  0.902548
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.679276
		terraceProb     0.433871
		erosion         0
		montesMagn      0.604144
		montesFreq      2.26831
		montesSpiky     0.796166
		montesFraction  0.497473
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.9111
		hillsFraction   0.753573
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237169
		craterFreq      0.266574
		craterDensity   0.861737
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.461782
		volcanoTemp     1308.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.714, 0.407, 0.090, 0.000)
		colorShelf     (0.680, 0.438, 0.142, 0.000)
		colorBeach     (0.731, 0.407, 0.090, 0.000)
		colorDesert    (0.706, 0.423, 0.090, 0.000)
		colorLowland   (0.723, 0.454, 0.120, 0.000)
		colorUpland    (0.714, 0.407, 0.090, 0.000)
		colorRock      (0.689, 0.407, 0.097, 0.000)
		colorSnow      (0.706, 0.423, 0.090, 1.000)
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
		SemiMajorAxis   0.212375
		Period          1.96969
		Eccentricity    0.0705013
		Inclination     20.491
		AscendingNode   37.1642
		ArgOfPericenter -94.0114
		MeanAnomaly     -50.6876
	}
}

DwarfMoon	"Tion System 5.D33"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.72263e-007
	Radius          74.8936
	InertiaMoment   0.398277

	RotationPeriod  451.408
	Obliquity       51.7311
	EqAscendNode    96.723
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.554 0.549 0.546)

	Surface
	{
		SurfStyle       0.697304
		OceanStyle      0.566905
		Randomize      (0.901, -0.443, 0.966)
		colorDistMagn   0.978404
		colorDistFreq   4.82402
		detailScale     2045.09
		colorConversion true
		snowLevel       2
		tropicLatitude  0.779586
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.680571
		terraceProb     0.243894
		erosion         0
		montesMagn      0.485134
		montesFreq      3.03472
		montesSpiky     0.932877
		montesFraction  0.710705
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.2957
		hillsFraction   0.630034
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224367
		craterFreq      0.194807
		craterDensity   0.906019
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523157
		volcanoTemp     1705.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.465, 0.308, 0.158, 0.000)
		colorShelf     (0.443, 0.341, 0.191, 0.000)
		colorBeach     (0.476, 0.308, 0.169, 0.000)
		colorDesert    (0.460, 0.319, 0.169, 0.000)
		colorLowland   (0.471, 0.330, 0.186, 0.000)
		colorUpland    (0.465, 0.308, 0.153, 0.000)
		colorRock      (0.449, 0.330, 0.180, 0.000)
		colorSnow      (0.460, 0.341, 0.186, 1.000)
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
		SemiMajorAxis   0.212846
		Period          1.97624
		Eccentricity    0.298988
		Inclination     10.9507
		AscendingNode   97.0168
		ArgOfPericenter 75.6195
		MeanAnomaly     -14.804
	}
}

DwarfMoon	"Tion System 5.D34"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            2.37586e-007
	Radius          100.904
	InertiaMoment   0.399333

	RotationPeriod  514.624
	Obliquity       31.9101
	EqAscendNode    -127.713
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.510 0.383 0.326)

	Surface
	{
		SurfStyle       0.345401
		OceanStyle      0.468966
		Randomize      (-0.152, -0.322, 0.912)
		colorDistMagn   0.373714
		colorDistFreq   5.64709
		detailScale     2755.36
		colorConversion true
		snowLevel       2
		tropicLatitude  0.661003
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.715247
		terraceProb     0.138105
		erosion         0
		montesMagn      0.541245
		montesFreq      2.93744
		montesSpiky     0.899922
		montesFraction  0.267874
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.7071
		hillsFraction   0.530895
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229474
		craterFreq      0.384185
		craterDensity   0.873057
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.421365
		volcanoTemp     1512.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.111, 0.075, 0.000)
		colorShelf     (0.204, 0.107, 0.088, 0.000)
		colorBeach     (0.240, 0.130, 0.101, 0.000)
		colorDesert    (0.260, 0.142, 0.101, 0.000)
		colorLowland   (0.286, 0.153, 0.114, 0.000)
		colorUpland    (0.316, 0.176, 0.137, 0.000)
		colorRock      (0.342, 0.195, 0.147, 0.000)
		colorSnow      (0.372, 0.211, 0.160, 1.000)
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
		SemiMajorAxis   0.213082
		Period          1.97954
		Eccentricity    0.0935134
		Inclination     57.1097
		AscendingNode   -130.696
		ArgOfPericenter -172.651
		MeanAnomaly     -40.1509
	}
}

DwarfMoon	"Tion System 5.D35"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            3.2979e-007
	Radius          101.991
	InertiaMoment   0.396596

	RotationPeriod  443.899
	Obliquity       -18.2189
	EqAscendNode    -57.8831
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.582 0.448 0.388)

	Surface
	{
		SurfStyle       0.164625
		OceanStyle      0.0799964
		Randomize      (0.820, -0.964, 0.419)
		colorDistMagn   0.488084
		colorDistFreq   0.287001
		detailScale     2785.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0.384342
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.612137
		terraceProb     0.254599
		erosion         0
		montesMagn      0.669463
		montesFreq      2.92253
		montesSpiky     0.959035
		montesFraction  0.79896
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.9866
		hillsFraction   0.543636
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232916
		craterFreq      0.352227
		craterDensity   0.845924
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517458
		volcanoTemp     1130.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.175, 0.155, 0.000)
		colorShelf     (0.198, 0.188, 0.163, 0.000)
		colorBeach     (0.209, 0.202, 0.171, 0.000)
		colorDesert    (0.215, 0.211, 0.182, 0.000)
		colorLowland   (0.221, 0.224, 0.190, 0.000)
		colorUpland    (0.233, 0.238, 0.205, 0.000)
		colorRock      (0.262, 0.247, 0.213, 0.000)
		colorSnow      (0.256, 0.260, 0.225, 1.000)
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
		SemiMajorAxis   0.213713
		Period          1.98834
		Eccentricity    0.209876
		Inclination     -7.01155
		AscendingNode   -59.1428
		ArgOfPericenter -46.5222
		MeanAnomaly     -110.322
	}
}

DwarfMoon	"Tion System 5.D36"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            4.61361e-007
	Radius          109.102
	InertiaMoment   0.398451

	RotationPeriod  404.401
	Obliquity       9.02002
	EqAscendNode    -73.4022
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.761 0.667 0.613)

	Surface
	{
		SurfStyle       0.298335
		OceanStyle      0.107681
		Randomize      (-0.685, 0.946, -0.133)
		colorDistMagn   0.458508
		colorDistFreq   8.64909
		detailScale     2979.22
		colorConversion true
		snowLevel       2
		tropicLatitude  0.543612
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.491492
		terraceProb     0.197427
		erosion         0
		montesMagn      0.356424
		montesFreq      2.49792
		montesSpiky     0.977018
		montesFraction  0.368235
		dunesFraction   0
		hillsMagn       0
		hillsFreq       24.6279
		hillsFraction   0.541879
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238426
		craterFreq      0.336251
		craterDensity   0.856959
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.470393
		volcanoTemp     1814.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.193, 0.190, 0.000)
		colorShelf     (0.304, 0.213, 0.221, 0.000)
		colorBeach     (0.358, 0.247, 0.264, 0.000)
		colorDesert    (0.388, 0.260, 0.239, 0.000)
		colorLowland   (0.426, 0.280, 0.288, 0.000)
		colorUpland    (0.472, 0.340, 0.337, 0.000)
		colorRock      (0.510, 0.374, 0.374, 0.000)
		colorSnow      (0.555, 0.380, 0.392, 1.000)
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
		SemiMajorAxis   0.214261
		Period          1.99599
		Eccentricity    0.151953
		Inclination     -33.7557
		AscendingNode   -77.9381
		ArgOfPericenter 4.96342
		MeanAnomaly     -178.919
	}
}

DwarfMoon	"Tion System 5.D37"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            6.51504e-007
	Radius          117.476
	InertiaMoment   0.399464

	RotationPeriod  368.504
	Obliquity       -10.7219
	EqAscendNode    -36.4956
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.805 0.772 0.730)

	Surface
	{
		SurfStyle       0.569654
		OceanStyle      0.982951
		Randomize      (0.169, 0.214, 0.693)
		colorDistMagn   0.871096
		colorDistFreq   7.37829
		detailScale     3207.88
		colorConversion true
		snowLevel       2
		tropicLatitude  0.138059
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.341633
		terraceProb     0.409095
		erosion         0
		montesMagn      0.568948
		montesFreq      3.10916
		montesSpiky     0.932059
		montesFraction  0.887875
		dunesFraction   0
		hillsMagn       0
		hillsFreq       40.6406
		hillsFraction   0.614149
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257162
		craterFreq      0.474319
		craterDensity   0.668758
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532305
		volcanoTemp     1514.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.270, 0.292, 0.000)
		colorShelf     (0.266, 0.332, 0.336, 0.000)
		colorBeach     (0.290, 0.363, 0.379, 0.000)
		colorDesert    (0.354, 0.409, 0.430, 0.000)
		colorLowland   (0.395, 0.463, 0.474, 0.000)
		colorUpland    (0.515, 0.633, 0.642, 0.000)
		colorRock      (0.451, 0.556, 0.576, 0.000)
		colorSnow      (0.451, 0.541, 0.576, 1.000)
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
		SemiMajorAxis   0.214568
		Period          2.00028
		Eccentricity    0.110174
		Inclination     12.4871
		AscendingNode   -39.309
		ArgOfPericenter -31.63
		MeanAnomaly     70.215
	}
}

DwarfMoon	"Tion System 5.D38"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            9.30411e-007
	Radius          170.428
	InertiaMoment   0.397038

	RotationPeriod  442.164
	Obliquity       -76.0418
	EqAscendNode    -60.6791
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.483 0.478 0.469)

	Surface
	{
		SurfStyle       0.732221
		OceanStyle      0.718752
		Randomize      (-0.503, -0.504, 0.209)
		colorDistMagn   0.379314
		colorDistFreq   21.4202
		detailScale     4653.82
		colorConversion true
		snowLevel       2
		tropicLatitude  0.94499
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.655323
		terraceProb     0.129706
		erosion         0
		montesMagn      0.527346
		montesFreq      2.80122
		montesSpiky     0.970724
		montesFraction  0.472424
		dunesFraction   0
		hillsMagn       0
		hillsFreq       76.8849
		hillsFraction   0.574478
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248488
		craterFreq      0.743885
		craterDensity   0.655144
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.59352
		volcanoTemp     1218.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.406, 0.248, 0.056, 0.000)
		colorShelf     (0.387, 0.267, 0.089, 0.000)
		colorBeach     (0.416, 0.248, 0.056, 0.000)
		colorDesert    (0.401, 0.258, 0.056, 0.000)
		colorLowland   (0.411, 0.277, 0.075, 0.000)
		colorUpland    (0.406, 0.248, 0.056, 0.000)
		colorRock      (0.391, 0.248, 0.061, 0.000)
		colorSnow      (0.401, 0.258, 0.056, 1.000)
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
		SemiMajorAxis   0.215002
		Period          2.00634
		Eccentricity    0.431252
		Inclination     -66.8278
		AscendingNode   -61.7698
		ArgOfPericenter 165.323
		MeanAnomaly     135.261
	}
}

DwarfMoon	"Tion System 5.D39"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.34673e-006
	Radius          164.314
	InertiaMoment   0.398615

	RotationPeriod  358.621
	Obliquity       84.744
	EqAscendNode    -46.9264
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.511 0.505 0.497)

	Surface
	{
		SurfStyle       0.477684
		OceanStyle      0.350483
		Randomize      (0.834, 0.621, -0.669)
		colorDistMagn   0.759097
		colorDistFreq   21.4242
		detailScale     4486.87
		colorConversion true
		snowLevel       2
		tropicLatitude  0.944037
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.705798
		terraceProb     0.293105
		erosion         0
		montesMagn      0.298534
		montesFreq      2.49124
		montesSpiky     0.974821
		montesFraction  0.4546
		dunesFraction   0
		hillsMagn       0
		hillsFreq       39.8523
		hillsFraction   0.585434
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218936
		craterFreq      1.01674
		craterDensity   1.04975
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.536165
		volcanoTemp     1412.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.153, 0.146, 0.199, 0.000)
		colorShelf     (0.184, 0.172, 0.229, 0.000)
		colorBeach     (0.209, 0.197, 0.259, 0.000)
		colorDesert    (0.240, 0.212, 0.293, 0.000)
		colorLowland   (0.261, 0.247, 0.323, 0.000)
		colorUpland    (0.291, 0.268, 0.353, 0.000)
		colorRock      (0.317, 0.293, 0.393, 0.000)
		colorSnow      (0.317, 0.293, 0.393, 1.000)
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
		SemiMajorAxis   0.215361
		Period          2.01138
		Eccentricity    0.119153
		Inclination     39.973
		AscendingNode   -51.2935
		ArgOfPericenter 94.4618
		MeanAnomaly     -118.81
	}
}

DwarfMoon	"Tion System 5.D40"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.98112e-006
	Radius          178.346
	InertiaMoment   0.399592

	RotationPeriod  322.709
	Obliquity       -58.4686
	EqAscendNode    -97.3386
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.466 0.461 0.459)

	Surface
	{
		SurfStyle       0.52864
		OceanStyle      0.483781
		Randomize      (0.131, 0.585, -0.843)
		colorDistMagn   0.949156
		colorDistFreq   15.8208
		detailScale     4870.03
		colorConversion true
		snowLevel       2
		tropicLatitude  0.958861
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.498315
		terraceProb     0.637702
		erosion         0
		montesMagn      0.364887
		montesFreq      2.26077
		montesSpiky     0.895168
		montesFraction  0.43322
		dunesFraction   0
		hillsMagn       0
		hillsFreq       106.911
		hillsFraction   0.433636
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257509
		craterFreq      1.09351
		craterDensity   0.822549
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.421423
		volcanoTemp     1238.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.152, 0.183, 0.000)
		colorShelf     (0.214, 0.189, 0.206, 0.000)
		colorBeach     (0.242, 0.208, 0.234, 0.000)
		colorDesert    (0.275, 0.240, 0.257, 0.000)
		colorLowland   (0.303, 0.263, 0.284, 0.000)
		colorUpland    (0.331, 0.281, 0.303, 0.000)
		colorRock      (0.368, 0.318, 0.358, 0.000)
		colorSnow      (0.368, 0.309, 0.349, 1.000)
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
		SemiMajorAxis   0.215664
		Period          2.01562
		Eccentricity    0.367331
		Inclination     42.7312
		AscendingNode   -99.9831
		ArgOfPericenter 175.894
		MeanAnomaly     117.028
	}
}

DwarfMoon	"Tion System 5.D41"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            2.97196e-006
	Radius          196.069
	InertiaMoment   0.39737

	RotationPeriod  289.981
	Obliquity       91.4906
	EqAscendNode    33.6786
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.421 0.418 0.416)

	Surface
	{
		SurfStyle       0.352342
		OceanStyle      0.955981
		Randomize      (0.166, -0.460, -0.026)
		colorDistMagn   0.472228
		colorDistFreq   23.0721
		detailScale     5354
		colorConversion true
		snowLevel       2
		tropicLatitude  0.960471
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.714774
		terraceProb     0.391549
		erosion         0
		montesMagn      0.574989
		montesFreq      2.57983
		montesSpiky     0.873352
		montesFraction  0.211201
		dunesFraction   0
		hillsMagn       0
		hillsFreq       77.7761
		hillsFraction   0.387182
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258112
		craterFreq      0.898105
		craterDensity   0.938864
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539052
		volcanoTemp     1806.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.164, 0.159, 0.133, 0.000)
		colorShelf     (0.168, 0.163, 0.150, 0.000)
		colorBeach     (0.198, 0.196, 0.183, 0.000)
		colorDesert    (0.215, 0.209, 0.179, 0.000)
		colorLowland   (0.236, 0.225, 0.208, 0.000)
		colorUpland    (0.244, 0.259, 0.233, 0.000)
		colorRock      (0.265, 0.280, 0.254, 0.000)
		colorSnow      (0.294, 0.305, 0.271, 1.000)
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
		SemiMajorAxis   0.21592
		Period          2.01921
		Eccentricity    0.122197
		Inclination     18.7265
		AscendingNode   37.7558
		ArgOfPericenter -81.8546
		MeanAnomaly     45.6196
	}
}

DwarfMoon	"Tion System 5.D42"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            4.56628e-006
	Radius          210.789
	InertiaMoment   0.398769

	RotationPeriod  253.049
	Obliquity       -62.5418
	EqAscendNode    -134.256
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.616 0.613 0.609)

	Surface
	{
		SurfStyle       0.141086
		OceanStyle      0.0772254
		Randomize      (-0.271, 0.459, 0.379)
		colorDistMagn   0.981104
		colorDistFreq   31.5074
		detailScale     5755.95
		colorConversion true
		snowLevel       2
		tropicLatitude  0.733998
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.673194
		terraceProb     0.105897
		erosion         0
		montesMagn      0.508819
		montesFreq      2.96474
		montesSpiky     0.865996
		montesFraction  0.145375
		dunesFraction   0
		hillsMagn       0
		hillsFreq       80.104
		hillsFraction   0.504642
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242359
		craterFreq      1.38549
		craterDensity   1.0912
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.464022
		volcanoTemp     1629.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.196, 0.195, 0.000)
		colorShelf     (0.259, 0.215, 0.213, 0.000)
		colorBeach     (0.277, 0.221, 0.219, 0.000)
		colorDesert    (0.289, 0.239, 0.238, 0.000)
		colorLowland   (0.308, 0.252, 0.250, 0.000)
		colorUpland    (0.326, 0.258, 0.256, 0.000)
		colorRock      (0.339, 0.270, 0.268, 0.000)
		colorSnow      (0.357, 0.270, 0.274, 1.000)
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
		SemiMajorAxis   0.216213
		Period          2.02332
		Eccentricity    0.17785
		Inclination     -69.3161
		AscendingNode   -128.456
		ArgOfPericenter 67.6182
		MeanAnomaly     -134.101
	}
}

DwarfMoon	"Tion System 5.D43"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.25602e-011
	Radius          3.48897
	InertiaMoment   0.399719

	RotationPeriod  2013.88
	Obliquity       -58.2253
	EqAscendNode    -183.658
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.686 0.589 0.456)

	Surface
	{
		SurfStyle       0.124508
		OceanStyle      0.584538
		Randomize      (-0.979, -0.870, 0.042)
		colorDistMagn   0.714894
		colorDistFreq   0.00582181
		detailScale     95.272
		colorConversion true
		snowLevel       2
		tropicLatitude  0.35912
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.427598
		terraceProb     0.455421
		erosion         0
		montesMagn      0.404779
		montesFreq      2.1943
		montesSpiky     0.873984
		montesFraction  0.48506
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0193176
		hillsFraction   0.636248
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238501
		craterFreq      0.250226
		craterDensity   0.969799
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540779
		volcanoTemp     1843.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.188, 0.146, 0.000)
		colorShelf     (0.288, 0.206, 0.160, 0.000)
		colorBeach     (0.309, 0.212, 0.164, 0.000)
		colorDesert    (0.322, 0.230, 0.178, 0.000)
		colorLowland   (0.343, 0.241, 0.187, 0.000)
		colorUpland    (0.364, 0.247, 0.192, 0.000)
		colorRock      (0.377, 0.259, 0.201, 0.000)
		colorSnow      (0.398, 0.259, 0.205, 1.000)
		BumpHeight      3.14007
		BumpOffset      0.628014
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
		SemiMajorAxis   0.216527
		Period          2.02774
		Eccentricity    0.302052
		Inclination     -78.9682
		AscendingNode   -176.145
		ArgOfPericenter 100.54
		MeanAnomaly     -112.349
	}
}

DwarfMoon	"Tion System 5.D44"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            2.55236e-011
	Radius          4.20526
	InertiaMoment   0.397641

	RotationPeriod  1762.3
	Obliquity       -62.812
	EqAscendNode    -162.895
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.528 0.451 0.339)

	Surface
	{
		SurfStyle       0.549901
		OceanStyle      0.970198
		Randomize      (0.838, -0.945, -0.217)
		colorDistMagn   0.80902
		colorDistFreq   0.0111671
		detailScale     114.832
		colorConversion true
		snowLevel       2
		tropicLatitude  0.328998
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.37309
		terraceProb     0.375487
		erosion         0
		montesMagn      0.575433
		montesFreq      2.93164
		montesSpiky     0.919051
		montesFraction  0.481733
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0342217
		hillsFraction   0.727234
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223082
		craterFreq      0.210341
		craterDensity   0.768243
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463864
		volcanoTemp     1819.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.153, 0.158, 0.136, 0.000)
		colorShelf     (0.174, 0.194, 0.156, 0.000)
		colorBeach     (0.190, 0.212, 0.176, 0.000)
		colorDesert    (0.232, 0.239, 0.200, 0.000)
		colorLowland   (0.259, 0.271, 0.220, 0.000)
		colorUpland    (0.338, 0.370, 0.298, 0.000)
		colorRock      (0.296, 0.325, 0.268, 0.000)
		colorSnow      (0.296, 0.316, 0.268, 1.000)
		BumpHeight      3.78473
		BumpOffset      0.756947
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
		SemiMajorAxis   0.217176
		Period          2.03686
		Eccentricity    0.393455
		Inclination     -57.5899
		AscendingNode   -158.653
		ArgOfPericenter 57.4166
		MeanAnomaly     118.779
	}
}

DwarfMoon	"Tion System 5.D45"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            4.72046e-011
	Radius          4.95849
	InertiaMoment   0.398917

	RotationPeriod  1571.57
	Obliquity       -6.81273
	EqAscendNode    2.72111
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.414 0.410 0.407)

	Surface
	{
		SurfStyle       0.342864
		OceanStyle      0.149219
		Randomize      (0.023, 0.044, -0.993)
		colorDistMagn   0.235519
		colorDistFreq   0.0201883
		detailScale     135.4
		colorConversion true
		snowLevel       2
		tropicLatitude  0.379949
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.30321
		terraceProb     0.236507
		erosion         0
		montesMagn      0.412584
		montesFreq      3.64499
		montesSpiky     0.893905
		montesFraction  0.649022
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0561532
		hillsFraction   0.712123
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241974
		craterFreq      0.203996
		craterDensity   0.923373
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531976
		volcanoTemp     1783.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.119, 0.094, 0.000)
		colorShelf     (0.166, 0.115, 0.110, 0.000)
		colorBeach     (0.195, 0.139, 0.126, 0.000)
		colorDesert    (0.211, 0.152, 0.126, 0.000)
		colorLowland   (0.232, 0.164, 0.143, 0.000)
		colorUpland    (0.257, 0.189, 0.171, 0.000)
		colorRock      (0.278, 0.209, 0.183, 0.000)
		colorSnow      (0.302, 0.225, 0.200, 1.000)
		BumpHeight      4.46264
		BumpOffset      0.892528
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
		SemiMajorAxis   0.217394
		Period          2.03992
		Eccentricity    0.170078
		Inclination     -15.5728
		AscendingNode   8.68478
		ArgOfPericenter -120.01
		MeanAnomaly     -34.9329
	}
}

DwarfMoon	"Tion System 5.D46"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            8.16892e-011
	Radius          5.62155
	InertiaMoment   0.399845

	RotationPeriod  1389.77
	Obliquity       -20.5479
	EqAscendNode    -72.8201
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.515 0.405 0.296)

	Surface
	{
		SurfStyle       0.72406
		OceanStyle      0.221775
		Randomize      (-0.229, 0.345, -0.287)
		colorDistMagn   0.165319
		colorDistFreq   0.011659
		detailScale     153.506
		colorConversion true
		snowLevel       2
		tropicLatitude  0.368669
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.581972
		terraceProb     0.316991
		erosion         0
		montesMagn      0.318104
		montesFreq      3.36727
		montesSpiky     0.880564
		montesFraction  0.689796
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0740361
		hillsFraction   0.508351
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230769
		craterFreq      0.173021
		craterDensity   0.956229
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.513425
		volcanoTemp     1633.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.432, 0.227, 0.086, 0.000)
		colorShelf     (0.412, 0.251, 0.103, 0.000)
		colorBeach     (0.443, 0.227, 0.092, 0.000)
		colorDesert    (0.427, 0.235, 0.092, 0.000)
		colorLowland   (0.437, 0.243, 0.101, 0.000)
		colorUpland    (0.432, 0.227, 0.083, 0.000)
		colorRock      (0.417, 0.243, 0.098, 0.000)
		colorSnow      (0.427, 0.251, 0.101, 1.000)
		BumpHeight      5.0594
		BumpOffset      1.01188
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
		SemiMajorAxis   0.217628
		Period          2.04322
		Eccentricity    0.389032
		Inclination     -3.33132
		AscendingNode   -75.1249
		ArgOfPericenter -149.315
		MeanAnomaly     -157.549
	}
}

DwarfMoon	"Tion System 5.D47"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.34558e-010
	Radius          7.76718
	InertiaMoment   0.397875

	RotationPeriod  1476.12
	Obliquity       84.6841
	EqAscendNode    77.6773
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.722 0.673 0.649)

	Surface
	{
		SurfStyle       0.41204
		OceanStyle      0.375818
		Randomize      (0.318, -0.180, 0.122)
		colorDistMagn   0.183946
		colorDistFreq   0.0203064
		detailScale     212.096
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999211
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.561434
		terraceProb     0.403691
		erosion         0
		montesMagn      0.362669
		montesFreq      2.82745
		montesSpiky     0.821635
		montesFraction  0.458394
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.076497
		hillsFraction   0.655981
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.207779
		craterFreq      0.209485
		craterDensity   1.01376
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483758
		volcanoTemp     1423.17
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.236, 0.259, 0.050)
		colorShelf     (0.289, 0.276, 0.298, 0.040)
		colorBeach     (0.332, 0.316, 0.337, 0.030)
		colorDesert    (0.376, 0.357, 0.383, 0.020)
		colorLowland   (0.419, 0.397, 0.422, 0.030)
		colorUpland    (0.462, 0.438, 0.461, 0.050)
		colorRock      (0.506, 0.478, 0.512, 0.020)
		colorSnow      (0.506, 0.478, 0.512, 1.000)
		BumpHeight      6.99046
		BumpOffset      1.39809
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
		SemiMajorAxis   0.217954
		Period          2.0478
		Eccentricity    0.0974992
		Inclination     47.9546
		AscendingNode   82.0891
		ArgOfPericenter -25.4325
		MeanAnomaly     21.7808
	}
}

DwarfMoon	"Tion System 5.D48"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            2.13378e-010
	Radius          8.58587
	InertiaMoment   0.399059

	RotationPeriod  1324.82
	Obliquity       52.5678
	EqAscendNode    -159.141
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.646 0.640 0.637)

	Surface
	{
		SurfStyle       0.843352
		OceanStyle      0.49133
		Randomize      (-0.364, 0.611, 0.908)
		colorDistMagn   0.867268
		colorDistFreq   0.0341867
		detailScale     234.451
		colorConversion true
		snowLevel       2
		tropicLatitude  0.776337
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.509086
		terraceProb     0.159812
		erosion         0
		montesMagn      0.56263
		montesFreq      2.60467
		montesSpiky     0.947528
		montesFraction  0.417573
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.249622
		hillsFraction   0.621357
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.219318
		craterFreq      0.238699
		craterDensity   0.832178
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478869
		volcanoTemp     1632.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.523, 0.320, 0.121, 0.550)
		colorShelf     (0.542, 0.345, 0.102, 0.480)
		colorBeach     (0.491, 0.301, 0.115, 0.600)
		colorDesert    (0.536, 0.326, 0.121, 0.600)
		colorLowland   (0.529, 0.339, 0.115, 0.630)
		colorUpland    (0.529, 0.333, 0.115, 0.550)
		colorRock      (0.536, 0.339, 0.115, 0.420)
		colorSnow      (0.536, 0.345, 0.134, 1.000)
		BumpHeight      7.72728
		BumpOffset      1.54546
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
		SemiMajorAxis   0.218604
		Period          2.05698
		Eccentricity    0.414956
		Inclination     1.84746
		AscendingNode   -153.007
		ArgOfPericenter 103.795
		MeanAnomaly     -53.9148
	}
}

DwarfMoon	"Tion System 5.D49"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            3.28358e-010
	Radius          9.52086
	InertiaMoment   0.39997

	RotationPeriod  1204.9
	Obliquity       16.363
	EqAscendNode    -43.2797
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.459 0.455 0.450)

	Surface
	{
		SurfStyle       0.124533
		OceanStyle      0.423923
		Randomize      (-0.248, 0.061, 0.335)
		colorDistMagn   0.0806798
		colorDistFreq   0.0445248
		detailScale     259.983
		colorConversion true
		snowLevel       2
		tropicLatitude  0.717015
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.408557
		terraceProb     0.196004
		erosion         0
		montesMagn      0.435261
		montesFreq      2.53125
		montesSpiky     0.95475
		montesFraction  0.762506
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.166794
		hillsFraction   0.765969
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259838
		craterFreq      0.238087
		craterDensity   0.730368
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487934
		volcanoTemp     1306.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.146, 0.144, 0.000)
		colorShelf     (0.193, 0.159, 0.158, 0.000)
		colorBeach     (0.207, 0.164, 0.162, 0.000)
		colorDesert    (0.216, 0.178, 0.176, 0.000)
		colorLowland   (0.230, 0.187, 0.185, 0.000)
		colorUpland    (0.243, 0.191, 0.189, 0.000)
		colorRock      (0.252, 0.200, 0.198, 0.000)
		colorSnow      (0.266, 0.200, 0.203, 1.000)
		BumpHeight      8.56877
		BumpOffset      1.71375
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
		SemiMajorAxis   0.219258
		Period          2.06621
		Eccentricity    0.346652
		Inclination     31.59
		AscendingNode   -35.4235
		ArgOfPericenter 84.5716
		MeanAnomaly     -179.66
	}
}

DwarfMoon	"Tion System 5.D50"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            4.93209e-010
	Radius          10.3646
	InertiaMoment   0.398084

	RotationPeriod  1084.59
	Obliquity       -168.974
	EqAscendNode    -145.1
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.523 0.517 0.515)

	Surface
	{
		SurfStyle       0.418274
		OceanStyle      0.994664
		Randomize      (-0.423, 0.847, -0.134)
		colorDistMagn   0.522027
		colorDistFreq   0.035119
		detailScale     283.024
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995141
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.468973
		terraceProb     0.339936
		erosion         0
		montesMagn      0.495948
		montesFreq      2.7793
		montesSpiky     0.851853
		montesFraction  0.288866
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.157676
		hillsFraction   0.37716
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246651
		craterFreq      0.18866
		craterDensity   1.03892
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.590245
		volcanoTemp     1849.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.181, 0.206, 0.050)
		colorShelf     (0.209, 0.212, 0.237, 0.040)
		colorBeach     (0.240, 0.243, 0.268, 0.030)
		colorDesert    (0.272, 0.274, 0.304, 0.020)
		colorLowland   (0.303, 0.305, 0.335, 0.030)
		colorUpland    (0.334, 0.336, 0.365, 0.050)
		colorRock      (0.366, 0.367, 0.407, 0.020)
		colorSnow      (0.366, 0.367, 0.407, 1.000)
		BumpHeight      9.32818
		BumpOffset      1.86564
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
		SemiMajorAxis   0.219797
		Period          2.07384
		Eccentricity    0.128338
		Inclination     -87.7869
		AscendingNode   -135.521
		ArgOfPericenter -73.4023
		MeanAnomaly     153.731
	}
}

DwarfMoon	"Tion System 5.D51"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            7.26301e-010
	Radius          13.7811
	InertiaMoment   0.399197

	RotationPeriod  1176.74
	Obliquity       16.1266
	EqAscendNode    -141.495
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.408 0.405 0.402)

	Surface
	{
		SurfStyle       0.338099
		OceanStyle      0.703662
		Randomize      (-0.594, -0.540, -0.548)
		colorDistMagn   0.858243
		colorDistFreq   0.0849126
		detailScale     376.317
		colorConversion true
		snowLevel       2
		tropicLatitude  0.778507
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.338754
		terraceProb     0.273348
		erosion         0
		montesMagn      0.656042
		montesFreq      2.64427
		montesSpiky     0.954269
		montesFraction  0.777247
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.540376
		hillsFraction   0.406551
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.218125
		craterFreq      0.21493
		craterDensity   1.04073
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485275
		volcanoTemp     1724.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.159, 0.117, 0.092, 0.000)
		colorShelf     (0.163, 0.113, 0.108, 0.000)
		colorBeach     (0.192, 0.138, 0.124, 0.000)
		colorDesert    (0.208, 0.150, 0.124, 0.000)
		colorLowland   (0.229, 0.162, 0.141, 0.000)
		colorUpland    (0.253, 0.186, 0.169, 0.000)
		colorRock      (0.274, 0.207, 0.181, 0.000)
		colorSnow      (0.298, 0.223, 0.197, 1.000)
		BumpHeight      12.403
		BumpOffset      2.4806
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
		SemiMajorAxis   0.220114
		Period          2.07833
		Eccentricity    0.102237
		Inclination     -36.5933
		AscendingNode   -150.18
		ArgOfPericenter -4.97297
		MeanAnomaly     -25.5766
	}
}

DwarfMoon	"Tion System 5.D52"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.0522e-009
	Radius          14.7044
	InertiaMoment   0.395847

	RotationPeriod  1055.25
	Obliquity       -49.0751
	EqAscendNode    -114.505
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.791 0.757 0.720)

	Surface
	{
		SurfStyle       0.867833
		OceanStyle      0.123789
		Randomize      (0.982, 0.391, -0.205)
		colorDistMagn   0.712224
		colorDistFreq   0.10417
		detailScale     401.527
		colorConversion true
		snowLevel       2
		tropicLatitude  0.720933
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.603187
		terraceProb     0.241983
		erosion         0
		montesMagn      0.263486
		montesFreq      2.58143
		montesSpiky     0.723377
		montesFraction  0.496659
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.536728
		hillsFraction   0.46917
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214098
		craterFreq      0.21398
		craterDensity   0.634606
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.569265
		volcanoTemp     1521.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.640, 0.371, 0.058, 0.000)
		colorShelf     (0.664, 0.341, 0.050, 0.000)
		colorBeach     (0.601, 0.333, 0.072, 0.000)
		colorDesert    (0.656, 0.341, 0.065, 0.000)
		colorLowland   (0.648, 0.371, 0.058, 0.000)
		colorUpland    (0.648, 0.348, 0.050, 0.000)
		colorRock      (0.656, 0.356, 0.050, 0.000)
		colorSnow      (0.656, 0.341, 0.065, 1.000)
		BumpHeight      13.2339
		BumpOffset      2.64679
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
		SemiMajorAxis   0.220751
		Period          2.08735
		Eccentricity    0.124278
		Inclination     -35.8389
		AscendingNode   -111.476
		ArgOfPericenter 144.918
		MeanAnomaly     -163.177
	}
}

DwarfMoon	"Tion System 5.D53"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.50372e-009
	Radius          15.9012
	InertiaMoment   0.398273

	RotationPeriod  967.98
	Obliquity       47.1949
	EqAscendNode    47.4004
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.633 0.464 0.360)

	Surface
	{
		SurfStyle       0.553598
		OceanStyle      0.390715
		Randomize      (0.882, -0.347, -0.478)
		colorDistMagn   0.809755
		colorDistFreq   0.130256
		detailScale     434.21
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994292
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.443409
		terraceProb     0.122693
		erosion         0
		montesMagn      0.412895
		montesFreq      3.01547
		montesSpiky     0.907352
		montesFraction  0.368543
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.545028
		hillsFraction   0.519967
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259488
		craterFreq      0.199513
		craterDensity   0.970985
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511937
		volcanoTemp     1570.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.184, 0.163, 0.144, 0.000)
		colorShelf     (0.209, 0.200, 0.165, 0.000)
		colorBeach     (0.228, 0.218, 0.187, 0.000)
		colorDesert    (0.278, 0.246, 0.212, 0.000)
		colorLowland   (0.310, 0.279, 0.234, 0.000)
		colorUpland    (0.405, 0.381, 0.317, 0.000)
		colorRock      (0.354, 0.334, 0.284, 0.000)
		colorSnow      (0.354, 0.325, 0.284, 1.000)
		BumpHeight      14.3111
		BumpOffset      2.86222
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
		SemiMajorAxis   0.221001
		Period          2.0909
		Eccentricity    0.00256656
		Inclination     46.4418
		AscendingNode   47.1547
		ArgOfPericenter -41.8147
		MeanAnomaly     -98.6555
	}
}

DwarfMoon	"Tion System 5.D54"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            2.12474e-009
	Radius          17.0298
	InertiaMoment   0.39933

	RotationPeriod  882.615
	Obliquity       -12.7697
	EqAscendNode    40.7615
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.531 0.528 0.525)

	Surface
	{
		SurfStyle       0.139838
		OceanStyle      0.267594
		Randomize      (0.622, -0.120, -0.993)
		colorDistMagn   0.723445
		colorDistFreq   0.242568
		detailScale     465.026
		colorConversion true
		snowLevel       2
		tropicLatitude  0.174429
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.443763
		terraceProb     0.494733
		erosion         0
		montesMagn      0.34185
		montesFreq      3.85645
		montesSpiky     0.991731
		montesFraction  0.71067
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.731711
		hillsFraction   0.639075
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259378
		craterFreq      0.148308
		craterDensity   0.887388
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522708
		volcanoTemp     1869.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.169, 0.168, 0.000)
		colorShelf     (0.223, 0.185, 0.184, 0.000)
		colorBeach     (0.239, 0.190, 0.189, 0.000)
		colorDesert    (0.250, 0.206, 0.205, 0.000)
		colorLowland   (0.266, 0.217, 0.215, 0.000)
		colorUpland    (0.282, 0.222, 0.220, 0.000)
		colorRock      (0.292, 0.232, 0.231, 0.000)
		colorSnow      (0.308, 0.232, 0.236, 1.000)
		BumpHeight      15.3268
		BumpOffset      3.06536
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
		SemiMajorAxis   0.221415
		Period          2.09678
		Eccentricity    0.467115
		Inclination     12.466
		AscendingNode   47.2354
		ArgOfPericenter 83.0573
		MeanAnomaly     -73.323
	}
}

DwarfMoon	"Tion System 5.D55"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            2.97392e-009
	Radius          22.3547
	InertiaMoment   0.396584

	RotationPeriod  966.354
	Obliquity       -4.40368
	EqAscendNode    105.881
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.590 0.511 0.383)

	Surface
	{
		SurfStyle       0.121959
		OceanStyle      0.299367
		Randomize      (0.770, 0.274, -0.973)
		colorDistMagn   0.686322
		colorDistFreq   0.0178498
		detailScale     610.432
		colorConversion true
		snowLevel       2
		tropicLatitude  0.534605
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.362412
		terraceProb     0.206953
		erosion         0
		montesMagn      0.479698
		montesFreq      3.21435
		montesSpiky     0.99592
		montesFraction  0.709726
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.37225
		hillsFraction   0.655899
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248168
		craterFreq      0.261816
		craterDensity   0.887711
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46384
		volcanoTemp     1337.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.164, 0.123, 0.000)
		colorShelf     (0.248, 0.179, 0.134, 0.000)
		colorBeach     (0.265, 0.184, 0.138, 0.000)
		colorDesert    (0.277, 0.199, 0.150, 0.000)
		colorLowland   (0.295, 0.209, 0.157, 0.000)
		colorUpland    (0.312, 0.215, 0.161, 0.000)
		colorRock      (0.324, 0.225, 0.169, 0.000)
		colorSnow      (0.342, 0.225, 0.173, 1.000)
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
		SemiMajorAxis   0.221725
		Period          2.10119
		Eccentricity    0.170818
		Inclination     -33.1375
		AscendingNode   104.083
		ArgOfPericenter -3.97535
		MeanAnomaly     94.5487
	}
}

DwarfMoon	"Tion System 5.D56"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            4.12977e-009
	Radius          23.3448
	InertiaMoment   0.398448

	RotationPeriod  868.724
	Obliquity       -90.7031
	EqAscendNode    168.209
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.568 0.564 0.561)

	Surface
	{
		SurfStyle       0.146763
		OceanStyle      0.320821
		Randomize      (-0.041, 0.743, 0.823)
		colorDistMagn   0.693259
		colorDistFreq   0.165033
		detailScale     637.469
		colorConversion true
		snowLevel       2
		tropicLatitude  0.627031
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.438123
		terraceProb     0.347359
		erosion         0
		montesMagn      0.565219
		montesFreq      3.29217
		montesSpiky     0.791613
		montesFraction  0.715163
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.923361
		hillsFraction   0.870312
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241105
		craterFreq      0.17463
		craterDensity   0.840428
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514827
		volcanoTemp     1473.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.180, 0.179, 0.000)
		colorShelf     (0.238, 0.197, 0.196, 0.000)
		colorBeach     (0.255, 0.203, 0.202, 0.000)
		colorDesert    (0.267, 0.220, 0.219, 0.000)
		colorLowland   (0.284, 0.231, 0.230, 0.000)
		colorUpland    (0.301, 0.237, 0.236, 0.000)
		colorRock      (0.312, 0.248, 0.247, 0.000)
		colorSnow      (0.329, 0.248, 0.252, 1.000)
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
		SemiMajorAxis   0.222054
		Period          2.10586
		Eccentricity    0.221677
		Inclination     -53.4689
		AscendingNode   168.132
		ArgOfPericenter 106.296
		MeanAnomaly     146.993
	}
}

DwarfMoon	"Tion System 5.D57"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            5.69773e-009
	Radius          24.9301
	InertiaMoment   0.399461

	RotationPeriod  797.817
	Obliquity       -50.0619
	EqAscendNode    92.1203
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.707 0.703 0.701)

	Surface
	{
		SurfStyle       0.165315
		OceanStyle      0.907197
		Randomize      (-0.551, 0.212, 0.896)
		colorDistMagn   0.378904
		colorDistFreq   0.411415
		detailScale     680.758
		colorConversion true
		snowLevel       2
		tropicLatitude  0.824763
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479454
		terraceProb     0.553379
		erosion         0
		montesMagn      0.451988
		montesFreq      3.28959
		montesSpiky     0.951779
		montesFraction  0.344942
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.14584
		hillsFraction   0.639715
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220357
		craterFreq      0.154018
		craterDensity   0.988075
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.440403
		volcanoTemp     1879.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.274, 0.281, 0.000)
		colorShelf     (0.240, 0.295, 0.295, 0.000)
		colorBeach     (0.255, 0.316, 0.309, 0.000)
		colorDesert    (0.262, 0.330, 0.330, 0.000)
		colorLowland   (0.269, 0.351, 0.344, 0.000)
		colorUpland    (0.283, 0.373, 0.372, 0.000)
		colorRock      (0.318, 0.387, 0.386, 0.000)
		colorSnow      (0.311, 0.408, 0.407, 1.000)
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
		SemiMajorAxis   0.222649
		Period          2.11433
		Eccentricity    0.24628
		Inclination     -26.8177
		AscendingNode   88.768
		ArgOfPericenter -77.2503
		MeanAnomaly     76.1139
	}
}

DwarfMoon	"Tion System 5.D58"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            7.81967e-009
	Radius          26.5113
	InertiaMoment   0.39703

	RotationPeriod  728.078
	Obliquity       -82.6139
	EqAscendNode    -27.7167
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.626 0.546 0.451)

	Surface
	{
		SurfStyle       0.205286
		OceanStyle      0.264276
		Randomize      (0.709, -0.987, 0.619)
		colorDistMagn   0.813623
		colorDistFreq   0.49452
		detailScale     723.934
		colorConversion true
		snowLevel       2
		tropicLatitude  0.510814
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.422172
		terraceProb     0.440647
		erosion         0
		montesMagn      0.532408
		montesFreq      3.21517
		montesSpiky     0.907506
		montesFraction  0.590239
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.75691
		hillsFraction   0.728544
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259769
		craterFreq      0.237085
		craterDensity   0.968347
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.419711
		volcanoTemp     1423.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.186, 0.126, 0.000)
		colorShelf     (0.251, 0.191, 0.144, 0.000)
		colorBeach     (0.294, 0.224, 0.171, 0.000)
		colorDesert    (0.320, 0.240, 0.167, 0.000)
		colorLowland   (0.351, 0.257, 0.189, 0.000)
		colorUpland    (0.388, 0.311, 0.230, 0.000)
		colorRock      (0.420, 0.339, 0.248, 0.000)
		colorSnow      (0.457, 0.361, 0.261, 1.000)
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
		SemiMajorAxis   0.22298
		Period          2.11904
		Eccentricity    0.484528
		Inclination     -73.3612
		AscendingNode   -19.3507
		ArgOfPericenter -156.611
		MeanAnomaly     -153.647
	}
}

DwarfMoon	"Tion System 5.D59"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.06871e-008
	Radius          34.8652
	InertiaMoment   0.398611

	RotationPeriod  812.776
	Obliquity       -17.9996
	EqAscendNode    77.4451
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.429 0.423 0.418)

	Surface
	{
		SurfStyle       0.849184
		OceanStyle      0.99781
		Randomize      (-0.051, 0.360, 0.768)
		colorDistMagn   0.60811
		colorDistFreq   0.114952
		detailScale     952.051
		colorConversion true
		snowLevel       2
		tropicLatitude  0.540573
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.736045
		terraceProb     0.377884
		erosion         0
		montesMagn      0.643515
		montesFreq      2.29088
		montesSpiky     0.897524
		montesFraction  0.584277
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.44759
		hillsFraction   0.68829
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.177811
		craterFreq      0.193306
		craterDensity   0.764321
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.476257
		volcanoTemp     1466.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.348, 0.212, 0.079, 0.550)
		colorShelf     (0.361, 0.228, 0.067, 0.480)
		colorBeach     (0.326, 0.199, 0.075, 0.600)
		colorDesert    (0.356, 0.216, 0.079, 0.600)
		colorLowland   (0.352, 0.224, 0.075, 0.630)
		colorUpland    (0.352, 0.220, 0.075, 0.550)
		colorRock      (0.356, 0.224, 0.075, 0.420)
		colorSnow      (0.356, 0.228, 0.088, 1.000)
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
		SemiMajorAxis   0.223398
		Period          2.12501
		Eccentricity    0.415608
		Inclination     -22.7393
		AscendingNode   72.5395
		ArgOfPericenter 87.2918
		MeanAnomaly     -50.7485
	}
}

DwarfMoon	"Tion System 5.D60"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.456e-008
	Radius          35.7732
	InertiaMoment   0.39959

	RotationPeriod  722.995
	Obliquity       138.917
	EqAscendNode    36.8199
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.603 0.597 0.592)

	Surface
	{
		SurfStyle       0.871717
		OceanStyle      0.352554
		Randomize      (-0.066, -0.859, 0.044)
		colorDistMagn   0.0252805
		colorDistFreq   0.568421
		detailScale     976.848
		colorConversion true
		snowLevel       2
		tropicLatitude  0.773225
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.347086
		terraceProb     0.616557
		erosion         0
		montesMagn      0.367306
		montesFreq      2.86691
		montesSpiky     0.947938
		montesFraction  0.459019
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.15916
		hillsFraction   0.563919
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264383
		craterFreq      0.251944
		craterDensity   0.885378
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520033
		volcanoTemp     1643.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.488, 0.292, 0.047, 0.000)
		colorShelf     (0.506, 0.269, 0.041, 0.000)
		colorBeach     (0.458, 0.263, 0.059, 0.000)
		colorDesert    (0.500, 0.269, 0.053, 0.000)
		colorLowland   (0.494, 0.292, 0.047, 0.000)
		colorUpland    (0.494, 0.275, 0.041, 0.000)
		colorRock      (0.500, 0.281, 0.041, 0.000)
		colorSnow      (0.500, 0.269, 0.053, 1.000)
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
		SemiMajorAxis   0.223644
		Period          2.12853
		Eccentricity    0.415222
		Inclination     80.2002
		AscendingNode   38.6345
		ArgOfPericenter 9.06786
		MeanAnomaly     -89.2789
	}
}

DwarfMoon	"Tion System 5.D61"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.97922e-008
	Radius          37.9686
	InertiaMoment   0.397363

	RotationPeriod  661.221
	Obliquity       -26.4564
	EqAscendNode    -21.1505
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.527 0.520 0.518)

	Surface
	{
		SurfStyle       0.702079
		OceanStyle      0.662488
		Randomize      (-0.870, 0.910, -0.620)
		colorDistMagn   0.418758
		colorDistFreq   1.03413
		detailScale     1036.79
		colorConversion true
		snowLevel       2
		tropicLatitude  0.698424
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.675123
		terraceProb     0.32111
		erosion         0
		montesMagn      0.459347
		montesFreq      3.56507
		montesSpiky     0.891784
		montesFraction  0.565671
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.40142
		hillsFraction   0.610056
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214353
		craterFreq      0.240738
		craterDensity   0.945249
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506638
		volcanoTemp     1278.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.442, 0.291, 0.150, 0.000)
		colorShelf     (0.421, 0.323, 0.181, 0.000)
		colorBeach     (0.453, 0.291, 0.161, 0.000)
		colorDesert    (0.437, 0.302, 0.161, 0.000)
		colorLowland   (0.448, 0.312, 0.176, 0.000)
		colorUpland    (0.442, 0.291, 0.145, 0.000)
		colorRock      (0.427, 0.312, 0.171, 0.000)
		colorSnow      (0.437, 0.323, 0.176, 1.000)
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
		SemiMajorAxis   0.224208
		Period          2.13657
		Eccentricity    0.444066
		Inclination     -19.1966
		AscendingNode   -27.61
		ArgOfPericenter -44.1913
		MeanAnomaly     150.805
	}
}

DwarfMoon	"Tion System 5.D62"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            2.68689e-008
	Radius          40.3013
	InertiaMoment   0.398766

	RotationPeriod  607.336
	Obliquity       64.7268
	EqAscendNode    127.588
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.591 0.588 0.582)

	Surface
	{
		SurfStyle       0.621189
		OceanStyle      0.669132
		Randomize      (0.946, 0.057, 0.357)
		colorDistMagn   0.690721
		colorDistFreq   0.379031
		detailScale     1100.5
		colorConversion true
		snowLevel       2
		tropicLatitude  0.830075
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.445155
		terraceProb     0.37063
		erosion         0
		montesMagn      0.293152
		montesFreq      3.00442
		montesSpiky     0.785692
		montesFraction  0.847671
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.36998
		hillsFraction   0.588956
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250958
		craterFreq      0.247578
		craterDensity   1.09555
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.448413
		volcanoTemp     1555.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.497, 0.382, 0.116, 0.950)
		colorShelf     (0.473, 0.394, 0.151, 0.980)
		colorBeach     (0.509, 0.394, 0.128, 0.000)
		colorDesert    (0.491, 0.400, 0.128, 0.000)
		colorLowland   (0.503, 0.406, 0.145, 0.930)
		colorUpland    (0.497, 0.382, 0.122, 0.950)
		colorRock      (0.479, 0.388, 0.134, 0.920)
		colorSnow      (0.491, 0.417, 0.134, 1.000)
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
		SemiMajorAxis   0.22483
		Period          2.14547
		Eccentricity    0.267551
		Inclination     18.0054
		AscendingNode   122.85
		ArgOfPericenter -93.458
		MeanAnomaly     -4.0538
	}
}

DwarfMoon	"Tion System 5.D63"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            3.64592e-008
	Radius          53.9296
	InertiaMoment   0.399716

	RotationPeriod  691.946
	Obliquity       -106.982
	EqAscendNode    111.493
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.643 0.640 0.635)

	Surface
	{
		SurfStyle       0.0588514
		OceanStyle      0.840049
		Randomize      (0.997, -0.031, 0.642)
		colorDistMagn   0.830068
		colorDistFreq   2.31273
		detailScale     1472.64
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996336
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.365963
		terraceProb     0.244516
		erosion         0
		montesMagn      0.294538
		montesFreq      3.20405
		montesSpiky     0.880242
		montesFraction  0.329737
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.50128
		hillsFraction   0.691745
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248578
		craterFreq      0.248886
		craterDensity   0.981562
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.530711
		volcanoTemp     1717.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.256, 0.209, 0.000)
		colorShelf     (0.251, 0.269, 0.229, 0.000)
		colorBeach     (0.270, 0.288, 0.254, 0.000)
		colorDesert    (0.283, 0.301, 0.248, 0.000)
		colorLowland   (0.302, 0.320, 0.273, 0.000)
		colorUpland    (0.321, 0.339, 0.286, 0.000)
		colorRock      (0.328, 0.352, 0.298, 0.000)
		colorSnow      (0.347, 0.371, 0.305, 1.000)
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
		SemiMajorAxis   0.225214
		Period          2.15098
		Eccentricity    0.206785
		Inclination     -47.7369
		AscendingNode   113.476
		ArgOfPericenter -65.8152
		MeanAnomaly     123.752
	}
}

DwarfMoon	"Tion System 5.D64"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            4.94923e-008
	Radius          54.1802
	InertiaMoment   0.397636

	RotationPeriod  601.34
	Obliquity       5.19493
	EqAscendNode    164.765
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.507 0.501 0.496)

	Surface
	{
		SurfStyle       0.288226
		OceanStyle      0.415194
		Randomize      (-0.111, 0.959, -0.056)
		colorDistMagn   0.967108
		colorDistFreq   1.95187
		detailScale     1479.48
		colorConversion true
		snowLevel       2
		tropicLatitude  0.566917
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.279323
		terraceProb     0.420086
		erosion         0
		montesMagn      0.412333
		montesFreq      3.23553
		montesSpiky     0.797852
		montesFraction  0.594979
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.80205
		hillsFraction   0.468039
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.235977
		craterFreq      0.257471
		craterDensity   0.855676
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.508607
		volcanoTemp     1406.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.145, 0.154, 0.000)
		colorShelf     (0.203, 0.160, 0.178, 0.000)
		colorBeach     (0.238, 0.185, 0.213, 0.000)
		colorDesert    (0.259, 0.195, 0.193, 0.000)
		colorLowland   (0.284, 0.210, 0.233, 0.000)
		colorUpland    (0.314, 0.256, 0.273, 0.000)
		colorRock      (0.340, 0.281, 0.302, 0.000)
		colorSnow      (0.370, 0.286, 0.317, 1.000)
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
		SemiMajorAxis   0.225516
		Period          2.1553
		Eccentricity    0.420795
		Inclination     -29.5265
		AscendingNode   163.473
		ArgOfPericenter -30.0036
		MeanAnomaly     80.2585
	}
}

DwarfMoon	"Tion System 5.D65"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            6.72698e-008
	Radius          57.4086
	InertiaMoment   0.398914

	RotationPeriod  550.66
	Obliquity       -25.4851
	EqAscendNode    -13.8096
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.592 0.589 0.586)

	Surface
	{
		SurfStyle       0.716762
		OceanStyle      0.239299
		Randomize      (0.807, -0.334, -0.037)
		colorDistMagn   0.692286
		colorDistFreq   1.95322
		detailScale     1567.64
		colorConversion true
		snowLevel       2
		tropicLatitude  0.355403
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.532901
		terraceProb     0.283688
		erosion         0
		montesMagn      0.655495
		montesFreq      3.15532
		montesSpiky     0.759172
		montesFraction  0.56634
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.33993
		hillsFraction   0.674881
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.199993
		craterFreq      0.183343
		craterDensity   0.838797
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.426439
		volcanoTemp     1951.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.497, 0.330, 0.170, 0.000)
		colorShelf     (0.473, 0.365, 0.205, 0.000)
		colorBeach     (0.509, 0.330, 0.182, 0.000)
		colorDesert    (0.491, 0.341, 0.182, 0.000)
		colorLowland   (0.503, 0.353, 0.199, 0.000)
		colorUpland    (0.497, 0.330, 0.164, 0.000)
		colorRock      (0.479, 0.353, 0.193, 0.000)
		colorSnow      (0.491, 0.365, 0.199, 1.000)
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
		SemiMajorAxis   0.226046
		Period          2.16291
		Eccentricity    0.220007
		Inclination     45.7659
		AscendingNode   -8.38068
		ArgOfPericenter -49.4688
		MeanAnomaly     -130.3
	}
}

DwarfMoon	"Tion System 5.D66"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            9.16307e-008
	Radius          61.0741
	InertiaMoment   0.399842

	RotationPeriod  505.182
	Obliquity       -33.3753
	EqAscendNode    85.4395
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.703 0.701 0.699)

	Surface
	{
		SurfStyle       0.132557
		OceanStyle      0.100258
		Randomize      (-0.462, -0.653, -0.134)
		colorDistMagn   0.772298
		colorDistFreq   1.25814
		detailScale     1667.73
		colorConversion true
		snowLevel       2
		tropicLatitude  0.913457
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.566617
		terraceProb     0.499964
		erosion         0
		montesMagn      0.619171
		montesFreq      2.69891
		montesSpiky     0.998498
		montesFraction  0.632709
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.31249
		hillsFraction   0.510593
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252774
		craterFreq      0.233106
		craterDensity   1.00354
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467356
		volcanoTemp     1697.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.224, 0.224, 0.000)
		colorShelf     (0.295, 0.245, 0.245, 0.000)
		colorBeach     (0.316, 0.252, 0.252, 0.000)
		colorDesert    (0.330, 0.273, 0.273, 0.000)
		colorLowland   (0.352, 0.287, 0.287, 0.000)
		colorUpland    (0.373, 0.294, 0.294, 0.000)
		colorRock      (0.387, 0.308, 0.308, 0.000)
		colorSnow      (0.408, 0.308, 0.315, 1.000)
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
		SemiMajorAxis   0.226591
		Period          2.17073
		Eccentricity    0.410972
		Inclination     -56.0976
		AscendingNode   82.5936
		ArgOfPericenter -12.9074
		MeanAnomaly     -143.229
	}
}

DwarfMoon	"Tion System 5.D67"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.25201e-007
	Radius          86.7355
	InertiaMoment   0.397871

	RotationPeriod  605.579
	Obliquity       -35.7371
	EqAscendNode    -78.0741
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.585 0.583 0.579)

	Surface
	{
		SurfStyle       0.351272
		OceanStyle      0.942525
		Randomize      (-0.284, -0.432, -0.151)
		colorDistMagn   0.939085
		colorDistFreq   4.98501
		detailScale     2368.46
		colorConversion true
		snowLevel       2
		tropicLatitude  0.757223
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.3381
		terraceProb     0.193578
		erosion         0
		montesMagn      0.540065
		montesFreq      3.22781
		montesSpiky     0.930431
		montesFraction  0.3356
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.1616
		hillsFraction   0.732846
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240579
		craterFreq      0.264871
		craterDensity   0.841184
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515155
		volcanoTemp     1306.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.228, 0.221, 0.185, 0.000)
		colorShelf     (0.234, 0.227, 0.208, 0.000)
		colorBeach     (0.275, 0.274, 0.255, 0.000)
		colorDesert    (0.298, 0.291, 0.249, 0.000)
		colorLowland   (0.328, 0.315, 0.289, 0.000)
		colorUpland    (0.339, 0.361, 0.324, 0.000)
		colorRock      (0.369, 0.390, 0.353, 0.000)
		colorSnow      (0.410, 0.425, 0.376, 1.000)
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
		SemiMajorAxis   0.227105
		Period          2.17813
		Eccentricity    0.17234
		Inclination     -32.4639
		AscendingNode   -84.1959
		ArgOfPericenter -162.315
		MeanAnomaly     61.3936
	}
}

DwarfMoon	"Tion System 5.D68"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.71774e-007
	Radius          82.6796
	InertiaMoment   0.399056

	RotationPeriod  499.462
	Obliquity       7.43077
	EqAscendNode    -3.88335
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.513 0.509 0.501)

	Surface
	{
		SurfStyle       0.37944
		OceanStyle      0.112281
		Randomize      (0.342, 0.889, -0.450)
		colorDistMagn   0.0781944
		colorDistFreq   2.56402
		detailScale     2257.7
		colorConversion true
		snowLevel       2
		tropicLatitude  0.585873
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.5243
		terraceProb     0.201174
		erosion         0
		montesMagn      0.550055
		montesFreq      3.49151
		montesSpiky     0.977421
		montesFraction  0.46952
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.2985
		hillsFraction   0.575304
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.1955
		craterFreq      0.258766
		craterDensity   0.850698
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.460787
		volcanoTemp     1624.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.193, 0.160, 0.000)
		colorShelf     (0.205, 0.198, 0.180, 0.000)
		colorBeach     (0.241, 0.239, 0.220, 0.000)
		colorDesert    (0.262, 0.254, 0.215, 0.000)
		colorLowland   (0.287, 0.275, 0.251, 0.000)
		colorUpland    (0.297, 0.315, 0.281, 0.000)
		colorRock      (0.323, 0.341, 0.306, 0.000)
		colorSnow      (0.359, 0.371, 0.326, 1.000)
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
		SemiMajorAxis   0.227372
		Period          2.18196
		Eccentricity    0.462089
		Inclination     -43.2812
		AscendingNode   -3.28406
		ArgOfPericenter -158.531
		MeanAnomaly     -74.0189
	}
}

DwarfMoon	"Tion System 5.D69"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            2.36899e-007
	Radius          87.8407
	InertiaMoment   0.399967

	RotationPeriod  454.674
	Obliquity       99.0495
	EqAscendNode    128.358
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.637 0.632 0.628)

	Surface
	{
		SurfStyle       0.454363
		OceanStyle      0.294162
		Randomize      (-0.669, 0.771, 0.812)
		colorDistMagn   0.530178
		colorDistFreq   4.13686
		detailScale     2398.64
		colorConversion true
		snowLevel       2
		tropicLatitude  0.972414
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.377659
		terraceProb     0.289656
		erosion         0
		montesMagn      0.475806
		montesFreq      3.35755
		montesSpiky     0.93882
		montesFraction  0.743038
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.1452
		hillsFraction   0.670834
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269109
		craterFreq      0.282645
		craterDensity   0.896656
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535081
		volcanoTemp     1155.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.253, 0.245, 0.000)
		colorShelf     (0.261, 0.291, 0.270, 0.000)
		colorBeach     (0.293, 0.329, 0.295, 0.000)
		colorDesert    (0.338, 0.373, 0.345, 0.000)
		colorLowland   (0.376, 0.411, 0.389, 0.000)
		colorUpland    (0.401, 0.449, 0.396, 0.000)
		colorRock      (0.465, 0.499, 0.471, 0.000)
		colorSnow      (0.452, 0.499, 0.471, 1.000)
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
		SemiMajorAxis   0.22787
		Period          2.18913
		Eccentricity    0.456002
		Inclination     34.3412
		AscendingNode   130.68
		ArgOfPericenter 75.7112
		MeanAnomaly     -4.79337
	}
}

DwarfMoon	"Tion System 5.D70"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            3.28815e-007
	Radius          94.0992
	InertiaMoment   0.398079

	RotationPeriod  414.34
	Obliquity       -125.544
	EqAscendNode    55.2142
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.613 0.610 0.606)

	Surface
	{
		SurfStyle       0.170649
		OceanStyle      0.77477
		Randomize      (-0.438, 0.738, 0.972)
		colorDistMagn   0.261921
		colorDistFreq   4.0879
		detailScale     2569.54
		colorConversion true
		snowLevel       2
		tropicLatitude  0.881671
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.552683
		terraceProb     0.115481
		erosion         0
		montesMagn      0.466848
		montesFreq      2.20361
		montesSpiky     0.957334
		montesFraction  0.752319
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.5613
		hillsFraction   0.398811
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.267865
		craterFreq      0.215974
		craterDensity   0.978766
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544136
		volcanoTemp     1327.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.202, 0.238, 0.242, 0.000)
		colorShelf     (0.208, 0.256, 0.255, 0.000)
		colorBeach     (0.221, 0.274, 0.267, 0.000)
		colorDesert    (0.227, 0.287, 0.285, 0.000)
		colorLowland   (0.233, 0.305, 0.297, 0.000)
		colorUpland    (0.245, 0.323, 0.321, 0.000)
		colorRock      (0.276, 0.335, 0.333, 0.000)
		colorSnow      (0.270, 0.354, 0.352, 1.000)
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
		SemiMajorAxis   0.228492
		Period          2.1981
		Eccentricity    0.0173908
		Inclination     -84.2715
		AscendingNode   59.2589
		ArgOfPericenter -104.759
		MeanAnomaly     108.267
	}
}

DwarfMoon	"Tion System 5.D71"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            4.59962e-007
	Radius          97.9455
	InertiaMoment   0.399194

	RotationPeriod  367.052
	Obliquity       37.4386
	EqAscendNode    -56.7102
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.574 0.504 0.427)

	Surface
	{
		SurfStyle       0.344355
		OceanStyle      0.398486
		Randomize      (0.649, 0.074, -0.615)
		colorDistMagn   0.647218
		colorDistFreq   5.17284
		detailScale     2674.57
		colorConversion true
		snowLevel       2
		tropicLatitude  0.801691
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.398103
		terraceProb     0.370334
		erosion         0
		montesMagn      0.627493
		montesFreq      2.84559
		montesSpiky     0.829941
		montesFraction  0.375266
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.0166
		hillsFraction   0.649716
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233369
		craterFreq      0.370011
		craterDensity   0.627388
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533514
		volcanoTemp     1338.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.146, 0.098, 0.000)
		colorShelf     (0.229, 0.141, 0.115, 0.000)
		colorBeach     (0.270, 0.172, 0.132, 0.000)
		colorDesert    (0.293, 0.187, 0.132, 0.000)
		colorLowland   (0.321, 0.202, 0.149, 0.000)
		colorUpland    (0.356, 0.232, 0.179, 0.000)
		colorRock      (0.384, 0.257, 0.192, 0.000)
		colorSnow      (0.419, 0.277, 0.209, 1.000)
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
		SemiMajorAxis   0.228763
		Period          2.20201
		Eccentricity    0.198076
		Inclination     24.7228
		AscendingNode   -60.941
		ArgOfPericenter 14.3996
		MeanAnomaly     -136.353
	}
}

DwarfMoon	"Tion System 5.D72"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            6.49469e-007
	Radius          129.926
	InertiaMoment   0.395823

	RotationPeriod  406.322
	Obliquity       19.0845
	EqAscendNode    -49.4379
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.723 0.615 0.510)

	Surface
	{
		SurfStyle       0.613248
		OceanStyle      0.261154
		Randomize      (-0.738, -0.720, -0.450)
		colorDistMagn   0.991842
		colorDistFreq   14.6865
		detailScale     3547.84
		colorConversion true
		snowLevel       2
		tropicLatitude  0.711437
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.619951
		terraceProb     0.22597
		erosion         0
		montesMagn      0.404427
		montesFreq      2.76352
		montesSpiky     0.902825
		montesFraction  0.615989
		dunesFraction   0
		hillsMagn       0
		hillsFreq       46.1584
		hillsFraction   0.525366
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.260214
		craterFreq      0.577333
		craterDensity   0.765697
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485113
		volcanoTemp     1316.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.621, 0.468, 0.296, 0.000)
		colorShelf     (0.318, 0.209, 0.128, 0.000)
		colorBeach     (0.723, 0.517, 0.000, 0.000)
		colorDesert    (0.556, 0.431, 0.179, 0.000)
		colorLowland   (0.600, 0.418, 0.112, 0.270)
		colorUpland    (0.434, 0.246, 0.041, 0.000)
		colorRock      (0.159, 0.117, 0.056, 0.000)
		colorSnow      (0.564, 0.480, 0.398, 1.000)
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
		SemiMajorAxis   0.229007
		Period          2.20554
		Eccentricity    0.270611
		Inclination     32.3662
		AscendingNode   -56.945
		ArgOfPericenter -68.5014
		MeanAnomaly     -83.6101
	}
}

DwarfMoon	"Tion System 5.D73"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            9.27404e-007
	Radius          139.246
	InertiaMoment   0.398269

	RotationPeriod  367.141
	Obliquity       38.6492
	EqAscendNode    60.2057
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.647 0.571 0.454)

	Surface
	{
		SurfStyle       0.465104
		OceanStyle      0.746465
		Randomize      (0.769, -0.153, 0.590)
		colorDistMagn   0.866761
		colorDistFreq   1.8441
		detailScale     3802.34
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994949
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.263987
		terraceProb     0.166775
		erosion         0
		montesMagn      0.649333
		montesFreq      2.60019
		montesSpiky     0.915638
		montesFraction  0.733827
		dunesFraction   0
		hillsMagn       0
		hillsFreq       37.811
		hillsFraction   0.628243
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.193066
		craterFreq      0.677348
		craterDensity   0.758182
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.460596
		volcanoTemp     1594.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.166, 0.182, 0.000)
		colorShelf     (0.233, 0.194, 0.209, 0.000)
		colorBeach     (0.265, 0.223, 0.236, 0.000)
		colorDesert    (0.304, 0.240, 0.268, 0.000)
		colorLowland   (0.330, 0.280, 0.295, 0.000)
		colorUpland    (0.369, 0.303, 0.322, 0.000)
		colorRock      (0.401, 0.331, 0.359, 0.000)
		colorSnow      (0.401, 0.331, 0.359, 1.000)
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
		SemiMajorAxis   0.22957
		Period          2.21368
		Eccentricity    0.291759
		Inclination     77.9289
		AscendingNode   64.4195
		ArgOfPericenter 55.7677
		MeanAnomaly     147.856
	}
}

DwarfMoon	"Tion System 5.D74"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.3422e-006
	Radius          151.3
	InertiaMoment   0.399327

	RotationPeriod  333.267
	Obliquity       -4.22969
	EqAscendNode    121.914
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.689 0.567 0.439)

	Surface
	{
		SurfStyle       0.0908344
		OceanStyle      0.444652
		Randomize      (0.376, 0.862, 0.146)
		colorDistMagn   0.115921
		colorDistFreq   12.9645
		detailScale     4131.49
		colorConversion true
		snowLevel       2
		tropicLatitude  0.400441
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.423544
		terraceProb     0.41055
		erosion         0
		montesMagn      0.40901
		montesFreq      3.12834
		montesSpiky     0.678032
		montesFraction  0.245115
		dunesFraction   0
		hillsMagn       0
		hillsFreq       51.442
		hillsFraction   0.738945
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271663
		craterFreq      0.859206
		craterDensity   0.759894
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516784
		volcanoTemp     1900.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.187, 0.176, 0.000)
		colorShelf     (0.262, 0.193, 0.185, 0.000)
		colorBeach     (0.283, 0.204, 0.198, 0.000)
		colorDesert    (0.290, 0.221, 0.207, 0.000)
		colorLowland   (0.317, 0.232, 0.220, 0.000)
		colorUpland    (0.324, 0.238, 0.233, 0.000)
		colorRock      (0.338, 0.244, 0.242, 0.000)
		colorSnow      (0.358, 0.255, 0.255, 1.000)
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
		SemiMajorAxis   0.229871
		Period          2.21804
		Eccentricity    0.19722
		Inclination     21.0547
		AscendingNode   122.851
		ArgOfPericenter -103.189
		MeanAnomaly     107.995
	}
}

DwarfMoon	"Tion System 5.D75"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.97415e-006
	Radius          162.414
	InertiaMoment   0.396573

	RotationPeriod  295.191
	Obliquity       32.7566
	EqAscendNode    -34.2573
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.797 0.699 0.654)

	Surface
	{
		SurfStyle       0.556727
		OceanStyle      0.727275
		Randomize      (0.405, 0.188, -0.265)
		colorDistMagn   0.610014
		colorDistFreq   19.7931
		detailScale     4434.99
		colorConversion true
		snowLevel       2
		tropicLatitude  0.593676
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.369011
		terraceProb     0.380224
		erosion         0
		montesMagn      0.431947
		montesFreq      2.66619
		montesSpiky     0.902762
		montesFraction  0.345057
		dunesFraction   0
		hillsMagn       0
		hillsFreq       47.9193
		hillsFraction   0.596303
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222857
		craterFreq      0.9847
		craterDensity   0.981884
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.452036
		volcanoTemp     1381.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.245, 0.261, 0.000)
		colorShelf     (0.263, 0.301, 0.301, 0.000)
		colorBeach     (0.287, 0.329, 0.340, 0.000)
		colorDesert    (0.351, 0.371, 0.386, 0.000)
		colorLowland   (0.391, 0.419, 0.425, 0.000)
		colorUpland    (0.510, 0.573, 0.575, 0.000)
		colorRock      (0.446, 0.503, 0.516, 0.000)
		colorSnow      (0.446, 0.489, 0.516, 1.000)
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
		SemiMajorAxis   0.230489
		Period          2.22699
		Eccentricity    0.427609
		Inclination     4.05025
		AscendingNode   -26.5977
		ArgOfPericenter -123.441
		MeanAnomaly     -69.8925
	}
}

DwarfMoon	"Tion System 5.D76"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            2.96093e-006
	Radius          217.548
	InertiaMoment   0.398444

	RotationPeriod  322.725
	Obliquity       107.605
	EqAscendNode    -81.5758
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.647 0.643 0.641)

	Surface
	{
		SurfStyle       0.768522
		OceanStyle      0.227719
		Randomize      (-0.110, 0.186, 0.580)
		colorDistMagn   0.668213
		colorDistFreq   40.6518
		detailScale     5940.51
		colorConversion true
		snowLevel       2
		tropicLatitude  0.944379
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.368859
		terraceProb     0.489778
		erosion         0
		montesMagn      0.546402
		montesFreq      3.48082
		montesSpiky     0.922854
		montesFraction  0.439806
		dunesFraction   0
		hillsMagn       0
		hillsFreq       89.4129
		hillsFraction   0.627512
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238386
		craterFreq      1.06468
		craterDensity   0.869072
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498932
		volcanoTemp     1522.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.544, 0.334, 0.077, 0.000)
		colorShelf     (0.518, 0.360, 0.122, 0.000)
		colorBeach     (0.556, 0.334, 0.077, 0.000)
		colorDesert    (0.537, 0.347, 0.077, 0.000)
		colorLowland   (0.550, 0.373, 0.103, 0.000)
		colorUpland    (0.544, 0.334, 0.077, 0.000)
		colorRock      (0.524, 0.334, 0.083, 0.000)
		colorSnow      (0.537, 0.347, 0.077, 1.000)
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
		SemiMajorAxis   0.231156
		Period          2.23665
		Eccentricity    0.0856789
		Inclination     24.9083
		AscendingNode   -82.1922
		ArgOfPericenter -76.2774
		MeanAnomaly     -81.8892
	}
}

DwarfMoon	"Tion System 5.D77"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            4.54825e-006
	Radius          237.99
	InertiaMoment   0.399458

	RotationPeriod  286.338
	Obliquity       34.443
	EqAscendNode    -122.794
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.829 0.789 0.717)

	Surface
	{
		SurfStyle       0.652102
		OceanStyle      0.116884
		Randomize      (-0.073, -0.730, 0.984)
		colorDistMagn   0.948421
		colorDistFreq   29.8333
		detailScale     6498.7
		colorConversion true
		snowLevel       2
		tropicLatitude  0.482315
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.350667
		terraceProb     0.142929
		erosion         0
		montesMagn      0.419338
		montesFreq      3.54187
		montesSpiky     0.989825
		montesFraction  0.445618
		dunesFraction   0
		hillsMagn       0
		hillsFreq       140.991
		hillsFraction   0.482302
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240679
		craterFreq      1.54039
		craterDensity   0.709745
		craterOctaves   17
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484494
		volcanoTemp     1607.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.696, 0.544, 0.086, 0.000)
		colorShelf     (0.663, 0.568, 0.115, 0.000)
		colorBeach     (0.713, 0.560, 0.100, 0.000)
		colorDesert    (0.688, 0.560, 0.093, 0.000)
		colorLowland   (0.704, 0.584, 0.108, 0.000)
		colorUpland    (0.696, 0.544, 0.079, 0.000)
		colorRock      (0.671, 0.560, 0.108, 0.000)
		colorSnow      (0.688, 0.568, 0.093, 1.000)
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
		SemiMajorAxis   0.231603
		Period          2.24316
		Eccentricity    0.1248
		Inclination     17.739
		AscendingNode   -121.687
		ArgOfPericenter -109.255
		MeanAnomaly     -113.693
	}
}

DwarfMoon	"Tion System 5.D78"
{
	ParentBody     "Tion System 5"
	Class	       "Asteroid"

	Mass            1.24741e-011
	Radius          3.19972
	InertiaMoment   0.397022

	RotationPeriod  1921.85
	Obliquity       -36.1747
	EqAscendNode    -143.832
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.604 0.428 0.353)

	Surface
	{
		SurfStyle       0.341106
		OceanStyle      0.931244
		Randomize      (0.820, 0.660, -0.349)
		colorDistMagn   0.357272
		colorDistFreq   0.00686845
		detailScale     87.3736
		colorConversion true
		snowLevel       2
		tropicLatitude  0.737293
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.315201
		terraceProb     0.147075
		erosion         0
		montesMagn      0.54827
		montesFreq      4.03839
		montesSpiky     0.869784
		montesFraction  0.208809
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0208455
		hillsFraction   0.777107
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223831
		craterFreq      0.150746
		craterDensity   0.991702
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51709
		volcanoTemp     1540.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.124, 0.081, 0.000)
		colorShelf     (0.242, 0.120, 0.095, 0.000)
		colorBeach     (0.284, 0.145, 0.109, 0.000)
		colorDesert    (0.308, 0.158, 0.109, 0.000)
		colorLowland   (0.338, 0.171, 0.124, 0.000)
		colorUpland    (0.375, 0.197, 0.148, 0.000)
		colorRock      (0.405, 0.218, 0.159, 0.000)
		colorSnow      (0.441, 0.235, 0.173, 1.000)
		BumpHeight      2.87975
		BumpOffset      0.575949
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
		SemiMajorAxis   0.231899
		Period          2.24746
		Eccentricity    0.068685
		Inclination     13.0766
		AscendingNode   -146
		ArgOfPericenter -6.74562
		MeanAnomaly     51.6462
	}
}

Planet	"Tion System 6"
{
	ParentBody     "Tion System"
	Class	       "IceGiant"

	Mass            15.6252
	Radius          20342.4
	InertiaMoment   0.230965

	Oblateness      0.0262254

	RotationPeriod  10.3415
	Obliquity       -107.188
	EqAscendNode    44.5127
	Precession      0

	AlbedoBond      0.494518
	AlbedoGeom      0.593421
	Brightness      2

	Surface
	{
		SurfStyle       0.640993
		Randomize      (0.972, -0.642, 0.010)
		detailScale     52321.7
		colorConversion true
		tropicLatitude  0.964647
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0.166577
		stripeZones     4.05967
		stripeFluct     0.398023
		stripeTwist     12.3657
		cycloneMagn     8.76945
		cycloneFreq     0.858768
		cycloneDensity  0.489109
		cycloneOctaves  1
		colorLayer0    (0.510, 0.520, 0.560, 1.000)
		colorLayer1    (0.960, 0.960, 0.880, 1.000)
		colorLayer2    (0.920, 0.760, 0.560, 1.000)
		colorLayer3    (0.580, 0.420, 0.270, 1.000)
		colorLayer4    (0.740, 0.720, 0.690, 1.000)
		colorLayer5    (0.580, 0.420, 0.270, 1.000)
		colorLayer6    (0.820, 0.780, 0.600, 1.000)
		colorLayer7    (0.810, 0.850, 0.890, 1.000)
		colorLowPlants (0.740, 0.720, 0.690, 1.000)
		colorUpPlants  (0.580, 0.420, 0.270, 1.000)
		BumpHeight      16.137
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          91.0508
		Velocity        1276.24
		BumpHeight      60.32
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.20515
		mainOctaves     12
		Coverage        0.472589
		stripeZones     4.05967
		stripeFluct     0.398023
		stripeTwist     12.3657
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          203.424
		Density         1164.12
		Pressure        161075
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0456556
		Saturation      0.536239

		Composition
		{
			H2    	93.3783
			He    	6.31902
			CH4   	0.263426
			N2    	0.0286611
			O2    	0.00750796
			C2H4  	0.00133177
			Ne    	0.000914735
			Ar    	0.000735775
			C2H2  	4.88832e-005
			C2H6  	3.34402e-005
		}
	}

	Aurora
	{
		Height      359.338
		NorthLat    65.305
		NorthLon    -41.9295
		NorthRadius 3239.6
		NorthWidth  675.005
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -80.2005
		SouthLon    134.582
		SouthRadius 6808.22
		SouthWidth  2324.4
		SouthRings  3
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
		SemiMajorAxis   43.1824
		Period          115.91
		Eccentricity    0.0142229
		Inclination     -177.306
		AscendingNode   45.1961
		ArgOfPericenter 359.769
		MeanAnomaly     37.4137
	}
}

DwarfMoon	"Tion System 6.D1"
{
	ParentBody     "Tion System 6"
	Class	       "Asteroid"

	Mass            1.28172e-009
	Radius          14.7205
	InertiaMoment   0.39981

	Oblateness      0.249

	Obliquity       -0.00896145
	EqAscendNode    -166.24
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.516 0.466 0.369)

	Surface
	{
		SurfStyle       0.0457256
		OceanStyle      0.637079
		Randomize      (0.320, 0.211, -0.003)
		colorDistMagn   0.889856
		colorDistFreq   0.100117
		detailScale     401.968
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.560447
		terraceProb     0.523717
		erosion         0
		montesMagn      0.450243
		montesFreq      3.2327
		montesSpiky     0.947976
		montesFraction  0.448057
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.492144
		hillsFraction   0.781418
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21134
		craterFreq      0.181775
		craterDensity   0.730043
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.428734
		volcanoTemp     1578.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.191, 0.186, 0.122, 0.000)
		colorShelf     (0.201, 0.196, 0.133, 0.000)
		colorBeach     (0.217, 0.210, 0.148, 0.000)
		colorDesert    (0.227, 0.219, 0.144, 0.000)
		colorLowland   (0.243, 0.233, 0.159, 0.000)
		colorUpland    (0.258, 0.247, 0.166, 0.000)
		colorRock      (0.263, 0.256, 0.173, 0.000)
		colorSnow      (0.279, 0.270, 0.177, 1.000)
		BumpHeight      13.2484
		BumpOffset      2.64969
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
		SemiMajorAxis   0.000292777
		Period          0.000732945
		Eccentricity    8.51435e-005
		Inclination     -0.00896145
		AscendingNode   -166.24
		ArgOfPericenter -104.818
		MeanAnomaly     118.377
	}
}

DwarfMoon	"Tion System 6.D2"
{
	ParentBody     "Tion System 6"
	Class	       "Asteroid"

	Mass            1.81991e-009
	Radius          21.3312
	InertiaMoment   0.397814

	Oblateness      0.249

	Obliquity       0.00885162
	EqAscendNode    -129.363
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.807 0.703 0.668)

	Surface
	{
		SurfStyle       0.106068
		OceanStyle      0.242682
		Randomize      (0.856, 0.398, -0.670)
		colorDistMagn   0.342556
		colorDistFreq   0.26597
		detailScale     582.483
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.528496
		terraceProb     0.429013
		erosion         0
		montesMagn      0.441456
		montesFreq      3.05151
		montesSpiky     0.950885
		montesFraction  0.609376
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.19934
		hillsFraction   0.601786
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236522
		craterFreq      0.23161
		craterDensity   0.962508
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466039
		volcanoTemp     1747.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.290, 0.232, 0.267, 0.000)
		colorShelf     (0.307, 0.239, 0.281, 0.000)
		colorBeach     (0.331, 0.253, 0.301, 0.000)
		colorDesert    (0.339, 0.274, 0.314, 0.000)
		colorLowland   (0.371, 0.288, 0.334, 0.000)
		colorUpland    (0.379, 0.295, 0.354, 0.000)
		colorRock      (0.395, 0.302, 0.368, 0.000)
		colorSnow      (0.420, 0.316, 0.388, 1.000)
		BumpHeight      19.1981
		BumpOffset      3.83961
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
		SemiMajorAxis   0.000371304
		Period          0.00104679
		Eccentricity    7.40911e-005
		Inclination     0.00885162
		AscendingNode   -129.363
		ArgOfPericenter 104.993
		MeanAnomaly     54.3997
	}
}

DwarfMoon	"Tion System 6.D3"
{
	ParentBody     "Tion System 6"
	Class	       "Asteroid"

	Mass            2.55764e-009
	Radius          20.3491
	InertiaMoment   0.399021

	Oblateness      0.249

	Obliquity       0.00636634
	EqAscendNode    53.5848
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.584 0.506 0.460)

	Surface
	{
		SurfStyle       0.706734
		OceanStyle      0.405869
		Randomize      (0.418, -0.261, -0.012)
		colorDistMagn   0.401583
		colorDistFreq   0.0843605
		detailScale     555.667
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.717623
		terraceProb     0.284192
		erosion         0
		montesMagn      0.611959
		montesFreq      3.78139
		montesSpiky     0.971396
		montesFraction  0.564769
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.31369
		hillsFraction   0.536494
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233791
		craterFreq      0.270422
		craterDensity   1.01013
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.546824
		volcanoTemp     1668.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.490, 0.283, 0.133, 0.000)
		colorShelf     (0.467, 0.313, 0.161, 0.000)
		colorBeach     (0.502, 0.283, 0.143, 0.000)
		colorDesert    (0.484, 0.293, 0.143, 0.000)
		colorLowland   (0.496, 0.303, 0.156, 0.000)
		colorUpland    (0.490, 0.283, 0.129, 0.000)
		colorRock      (0.473, 0.303, 0.152, 0.000)
		colorSnow      (0.484, 0.313, 0.156, 1.000)
		BumpHeight      18.3142
		BumpOffset      3.66285
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
		SemiMajorAxis   0.000413463
		Period          0.00123005
		Eccentricity    8.55095e-005
		Inclination     0.00636634
		AscendingNode   53.5848
		ArgOfPericenter 68.675
		MeanAnomaly     70.1895
	}
}

Moon	"Tion System 6.1"
{
	ParentBody     "Tion System 6"
	Class	       "Selena"

	Mass            0.000344198
	Radius          617.354
	InertiaMoment   0.399183

	Oblateness      0.0139074

	Obliquity       0.706643
	EqAscendNode    99.4187
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.648 0.645 0.641)

	Surface
	{
		SurfStyle       0.451887
		OceanStyle      0.836484
		Randomize      (0.861, -0.268, 0.273)
		colorDistMagn   0.0602806
		colorDistFreq   79.1779
		detailScale     1587.87
		colorConversion true
		drivenDarkening 0
		seaLevel        0.171158
		snowLevel       2
		tropicLatitude  0.0159492
		icecapLatitude  0.716211
		icecapHeight    0.180136
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.5531
		venusFreq       1.70437
		venusMagn       0
		mareFreq        0.0117693
		mareDensity     0.000182085
		terraceProb     0.13305
		erosion         0
		montesMagn      0.0754981
		montesFreq      35.5715
		montesSpiky     0.924602
		montesFraction  0.203472
		dunesMagn       0.0420477
		dunesFreq       818.7
		dunesFraction   0.743443
		hillsMagn       0.138818
		hillsFreq       69.8055
		hillsFraction   0.981988
		hills2Fraction  0
		riversMagn      58.39
		riversFreq      4.61301
		riversSin       5.73515
		riversOctaves   0
		canyonsMagn     0.485164
		canyonsFreq     0.190955
		canyonFraction  0.447329
		cracksMagn      0.0429859
		cracksFreq      0.392559
		cracksOctaves   0
		craterMagn      0.579813
		craterFreq      1.67497
		craterDensity   0.780786
		craterOctaves   7.87597
		craterRayedFactor 0.104391
		volcanoMagn     0.19224
		volcanoFreq     0.557322
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.234934
		volcanoRadius   0.142732
		volcanoTemp     1591.8
		lavaCoverTidal  0.138769
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.850, 0.820, 0.900, 0.000)
		colorShelf     (0.460, 0.380, 0.470, 0.000)
		colorBeach     (0.279, 0.232, 0.231, 0.000)
		colorDesert    (0.123, 0.103, 0.122, 0.000)
		colorLowland   (0.233, 0.232, 0.231, 0.000)
		colorUpland    (0.343, 0.316, 0.333, 0.000)
		colorRock      (0.380, 0.350, 0.350, 0.000)
		colorSnow      (0.470, 0.420, 0.470, 1.000)
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
		SemiMajorAxis   0.000657763
		Period          0.00246812
		Eccentricity    0.0458318
		Inclination     0.706643
		AscendingNode   99.4187
		ArgOfPericenter 93.1241
		MeanAnomaly     145.681
	}
}

Moon	"Tion System 6.2"
{
	ParentBody     "Tion System 6"
	Class	       "IceWorld"

	Mass            0.000403656
	Radius          612.653
	InertiaMoment   0.398652

	Oblateness      0.00306188

	Obliquity       -0.745537
	EqAscendNode    97.4216
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.784 0.753 0.719)

	Surface
	{
		SurfStyle       0.702813
		OceanStyle      0.257695
		Randomize      (0.022, 0.491, -0.417)
		colorDistMagn   0.071319
		colorDistFreq   71.4631
		detailScale     1575.78
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.19796
		snowLevel       2
		tropicLatitude  0.0171727
		icecapLatitude  0.827041
		icecapHeight    0.20523
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.90828
		venusFreq       1.36493
		venusMagn       0.219932
		mareFreq        0.00875468
		mareDensity     0.000293468
		terraceProb     0.121167
		erosion         0
		montesMagn      0.0781564
		montesFreq      30.1613
		montesSpiky     0.997146
		montesFraction  0.316474
		dunesMagn       0.0327541
		dunesFreq       807.596
		dunesFraction   0.399942
		hillsMagn       0.126604
		hillsFreq       61.5097
		hillsFraction   0.402336
		hills2Fraction  0.0317819
		riversMagn      55.3087
		riversFreq      2.1316
		riversSin       4.61205
		riversOctaves   0
		canyonsMagn     0.418298
		canyonsFreq     0.241349
		canyonFraction  0
		cracksMagn      0.0527467
		cracksFreq      0.111736
		cracksOctaves   0
		craterMagn      0.629374
		craterFreq      1.13723
		craterDensity   0.944899
		craterOctaves   9
		craterRayedFactor 0.1825
		volcanoMagn     0.170133
		volcanoFreq     0.806233
		volcanoDensity  0.151545
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.242782
		volcanoRadius   0.159999
		volcanoTemp     1875.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.572, 0.399, 0.252, 0.000)
		colorShelf     (0.698, 0.527, 0.374, 0.000)
		colorBeach     (0.596, 0.444, 0.374, 0.000)
		colorDesert    (0.502, 0.293, 0.172, 0.000)
		colorLowland   (0.439, 0.226, 0.129, 0.000)
		colorUpland    (0.635, 0.482, 0.208, 0.000)
		colorRock      (0.420, 0.180, 0.110, 0.000)
		colorSnow      (1.000, 1.000, 0.990, 0.154)
		colorLowPlants (0.439, 0.226, 0.129, 0.000)
		colorUpPlants  (0.635, 0.482, 0.208, 0.000)
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
		SemiMajorAxis   0.00102443
		Period          0.00479712
		Eccentricity    0.0404831
		Inclination     -0.745537
		AscendingNode   97.4216
		ArgOfPericenter -6.40544
		MeanAnomaly     149.978
	}
}

DwarfMoon	"Tion System 6.D4"
{
	ParentBody     "Tion System 6"
	Class	       "Asteroid"

	Mass            6.78176e-009
	Radius          24.053
	InertiaMoment   0.399159

	Oblateness      0.00292484

	Obliquity       0.478183
	EqAscendNode    -140.08
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.630 0.625 0.622)

	Surface
	{
		SurfStyle       0.995116
		OceanStyle      0.553067
		Randomize      (-0.730, -0.694, -0.619)
		colorDistMagn   0.736173
		colorDistFreq   0.2573
		detailScale     656.807
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00569427
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.435824
		terraceProb     0.233223
		erosion         0
		montesMagn      0.461674
		montesFreq      2.18165
		montesSpiky     0.860977
		montesFraction  0.20328
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.11229
		hillsFraction   0.703175
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222512
		craterFreq      0.269711
		craterDensity   0.949925
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.528195
		volcanoTemp     1590.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.510, 0.313, 0.193, 0.000)
		colorShelf     (0.529, 0.331, 0.180, 0.000)
		colorBeach     (0.479, 0.288, 0.168, 0.000)
		colorDesert    (0.523, 0.325, 0.193, 0.000)
		colorLowland   (0.516, 0.344, 0.205, 0.000)
		colorUpland    (0.516, 0.325, 0.199, 0.000)
		colorRock      (0.523, 0.331, 0.199, 0.000)
		colorSnow      (0.523, 0.331, 0.205, 1.000)
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
		SemiMajorAxis   0.00159548
		Period          0.00932401
		Eccentricity    0.0204382
		Inclination     0.478183
		AscendingNode   -140.08
		ArgOfPericenter 9.70097
		MeanAnomaly     149.909
	}
}

Moon	"Tion System 6.3"
{
	ParentBody     "Tion System 6"
	Class	       "IceWorld"

	Mass            0.000548779
	Radius          720.692
	InertiaMoment   0.397014

	Obliquity       -0.192099
	EqAscendNode    113.396
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.817 0.684 0.597)

	Surface
	{
		SurfStyle       0.749987
		OceanStyle      0.164541
		Randomize      (0.976, -0.482, -0.923)
		colorDistMagn   0.079233
		colorDistFreq   93.2269
		detailScale     1853.66
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.286556
		snowLevel       2
		tropicLatitude  0.00368644
		icecapLatitude  0.692508
		icecapHeight    0.312352
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.7121
		venusFreq       1.11426
		venusMagn       0
		mareFreq        0.0998145
		mareDensity     0.00025294
		terraceProb     0.329151
		erosion         0
		montesMagn      0.0644832
		montesFreq      35.972
		montesSpiky     0.826274
		montesFraction  0.385551
		dunesMagn       0.0247646
		dunesFreq       943.105
		dunesFraction   0.174368
		hillsMagn       0.144785
		hillsFreq       69.0135
		hillsFraction   0.0849675
		hills2Fraction  0.229118
		riversMagn      65.0579
		riversFreq      2.46312
		riversSin       5.56729
		riversOctaves   0
		canyonsMagn     0.403242
		canyonsFreq     0.268537
		canyonFraction  0
		cracksMagn      0.0583842
		cracksFreq      0.2027
		cracksOctaves   0
		craterMagn      0.598951
		craterFreq      1.69971
		craterDensity   0.954772
		craterOctaves   10
		craterRayedFactor 0.0563821
		volcanoMagn     0.196012
		volcanoFreq     0.744498
		volcanoDensity  0.144005
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.275018
		volcanoRadius   0.145735
		volcanoTemp     1499.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.319, 0.267, 0.233, 0.000)
		colorShelf     (0.384, 0.322, 0.280, 0.000)
		colorBeach     (0.409, 0.342, 0.298, 0.000)
		colorDesert    (0.572, 0.479, 0.418, 0.200)
		colorLowland   (0.368, 0.308, 0.268, 0.000)
		colorUpland    (0.490, 0.411, 0.358, 0.800)
		colorRock      (0.800, 0.800, 0.800, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.368, 0.308, 0.268, 0.000)
		colorUpPlants  (0.490, 0.411, 0.358, 0.800)
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
		SemiMajorAxis   0.00248486
		Period          0.0181222
		Eccentricity    0.0172543
		Inclination     -0.192099
		AscendingNode   113.396
		ArgOfPericenter 19.9984
		MeanAnomaly     133.159
	}
}

Moon	"Tion System 6.4"
{
	ParentBody     "Tion System 6"
	Class	       "IceWorld"

	Mass            0.000637237
	Radius          712.804
	InertiaMoment   0.399882

	Obliquity       -0.350327
	EqAscendNode    177.536
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.434 0.428 0.422)

	Surface
	{
		SurfStyle       0.307054
		OceanStyle      0.956656
		Randomize      (-0.570, 0.184, 0.189)
		colorDistMagn   0.048333
		colorDistFreq   88.0565
		detailScale     1833.37
		colorConversion true
		drivenDarkening 0.491916
		seaLevel        0.233923
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  0.596387
		icecapHeight    0.26537
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.99518
		venusFreq       0.480266
		venusMagn       0.214137
		mareFreq        0.095991
		mareDensity     0.000347463
		terraceProb     0.309583
		erosion         0
		montesMagn      0.0513023
		montesFreq      44.7549
		montesSpiky     0.950551
		montesFraction  0.0513336
		dunesMagn       0.0435733
		dunesFreq       939.355
		dunesFraction   0.319014
		hillsMagn       0.130219
		hillsFreq       79.5453
		hillsFraction   0.931107
		hills2Fraction  0.195359
		riversMagn      55.197
		riversFreq      3.44201
		riversSin       4.66371
		riversOctaves   0
		canyonsMagn     0.620952
		canyonsFreq     0.259044
		canyonFraction  0
		cracksMagn      0.0370759
		cracksFreq      0.203703
		cracksOctaves   0
		craterMagn      0.627926
		craterFreq      2.54666
		craterDensity   0.890511
		craterOctaves   10
		craterRayedFactor 0.101374
		volcanoMagn     0.156256
		volcanoFreq     0.509457
		volcanoDensity  0.15974
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.267568
		volcanoRadius   0.143001
		volcanoTemp     1360.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.130, 0.107, 0.093, 0.000)
		colorShelf     (0.161, 0.133, 0.118, 0.000)
		colorBeach     (0.282, 0.368, 0.371, 0.200)
		colorDesert    (0.256, 0.325, 0.338, 0.500)
		colorLowland   (0.404, 0.406, 0.401, 0.800)
		colorUpland    (0.391, 0.419, 0.413, 1.000)
		colorRock      (0.600, 0.600, 0.600, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.404, 0.406, 0.401, 0.800)
		colorUpPlants  (0.391, 0.419, 0.413, 1.000)
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
		SemiMajorAxis   0.00387001
		Period          0.035223
		Eccentricity    0.0307095
		Inclination     -0.350327
		AscendingNode   177.536
		ArgOfPericenter 153.611
		MeanAnomaly     150.577
	}
}

Moon	"Tion System 6.5"
{
	ParentBody     "Tion System 6"
	Class	       "IceWorld"

	Mass            0.000738625
	Radius          795.29
	InertiaMoment   0.399416

	Obliquity       0.359009
	EqAscendNode    -57.2816
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.416 0.411 0.407)

	Surface
	{
		SurfStyle       0.455356
		OceanStyle      0.851701
		Randomize      (0.237, 0.006, -0.049)
		colorDistMagn   0.0596039
		colorDistFreq   100.444
		detailScale     2045.53
		colorConversion true
		drivenDarkening 0.31585
		seaLevel        0.207853
		snowLevel       2
		tropicLatitude  0.0109997
		icecapLatitude  0.717597
		icecapHeight    0.229164
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.7125
		venusFreq       0.983129
		venusMagn       0
		mareFreq        0.16891
		mareDensity     0.000370485
		terraceProb     0.227138
		erosion         0
		montesMagn      0.0489449
		montesFreq      33.5008
		montesSpiky     0.852608
		montesFraction  0.201937
		dunesMagn       0.0371967
		dunesFreq       1040.44
		dunesFraction   0.0674876
		hillsMagn       0.10975
		hillsFreq       89.6791
		hillsFraction   0.104424
		hills2Fraction  0.0932691
		riversMagn      65.4849
		riversFreq      3.38466
		riversSin       6.1431
		riversOctaves   0
		canyonsMagn     0.65342
		canyonsFreq     0.256426
		canyonFraction  0
		cracksMagn      0.0449938
		cracksFreq      0.207077
		cracksOctaves   0
		craterMagn      0.525571
		craterFreq      2.53653
		craterDensity   0.889644
		craterOctaves   10
		craterRayedFactor 0.171369
		volcanoMagn     0.165268
		volcanoFreq     0.708027
		volcanoDensity  0.224508
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.432117
		volcanoRadius   0.12876
		volcanoTemp     1521.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.154, 0.127, 0.110, 0.000)
		colorShelf     (0.262, 0.218, 0.191, 0.000)
		colorBeach     (0.395, 0.403, 0.346, 0.000)
		colorDesert    (0.303, 0.099, 0.041, 0.000)
		colorLowland   (0.341, 0.193, 0.085, 0.000)
		colorUpland    (0.387, 0.382, 0.370, 0.000)
		colorRock      (0.830, 0.830, 0.830, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.341, 0.193, 0.085, 0.000)
		colorUpPlants  (0.387, 0.382, 0.370, 0.000)
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
		SemiMajorAxis   0.00602731
		Period          0.0684606
		Eccentricity    0.00528277
		Inclination     0.359009
		AscendingNode   -57.2816
		ArgOfPericenter -51.6544
		MeanAnomaly     -172.391
	}
}

Moon	"Tion System 6.6"
{
	ParentBody     "Tion System 6"
	Class	       "IceWorld"

	Mass            0.000855153
	Radius          785.772
	InertiaMoment   0.398916

	RotationPeriod  202.628
	Obliquity       1.56191
	EqAscendNode    116.344
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.555 0.551 0.545)

	Surface
	{
		SurfStyle       0.115258
		OceanStyle      0.369102
		Randomize      (0.668, -0.799, 0.923)
		colorDistMagn   0.0792125
		colorDistFreq   110.81
		detailScale     2021.05
		colorConversion true
		drivenDarkening 0.202801
		seaLevel        0.235545
		snowLevel       2
		tropicLatitude  0.0251196
		icecapLatitude  0.668823
		icecapHeight    0.259607
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.86906
		venusFreq       1.18319
		venusMagn       0.168934
		mareFreq        0.132229
		mareDensity     0.000570971
		terraceProb     0.264429
		erosion         0
		montesMagn      0.0723154
		montesFreq      41.9894
		montesSpiky     0.987347
		montesFraction  0.104468
		dunesMagn       0.048288
		dunesFreq       1040.19
		dunesFraction   0.540593
		hillsMagn       0.128672
		hillsFreq       93.5923
		hillsFraction   0.605056
		hills2Fraction  0.0991631
		riversMagn      69.3055
		riversFreq      3.70697
		riversSin       5.10013
		riversOctaves   0
		canyonsMagn     0.592507
		canyonsFreq     0.286441
		canyonFraction  0
		cracksMagn      0.0671652
		cracksFreq      0.326681
		cracksOctaves   0
		craterMagn      0.598827
		craterFreq      2.32564
		craterDensity   0.957396
		craterOctaves   10
		craterRayedFactor 0.100021
		volcanoMagn     0.176419
		volcanoFreq     0.674648
		volcanoDensity  0.182379
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.431289
		volcanoRadius   0.142224
		volcanoTemp     1700.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.167, 0.154, 0.136, 0.000)
		colorShelf     (0.228, 0.209, 0.196, 0.000)
		colorBeach     (0.244, 0.220, 0.207, 0.000)
		colorDesert    (0.344, 0.314, 0.289, 0.000)
		colorLowland   (0.322, 0.286, 0.256, 0.000)
		colorUpland    (0.416, 0.397, 0.387, 0.000)
		colorRock      (0.730, 0.670, 0.630, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.322, 0.286, 0.256, 0.000)
		colorUpPlants  (0.416, 0.397, 0.387, 0.000)
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
		SemiMajorAxis   0.00938716
		Period          0.133062
		Eccentricity    0.00114975
		Inclination     1.02347
		AscendingNode   116.269
		ArgOfPericenter -136.29
		MeanAnomaly     150.162
	}
}

Moon	"Tion System 6.7"
{
	ParentBody     "Tion System 6"
	Class	       "IceWorld"

	Mass            0.00989517
	Radius          1628.29
	InertiaMoment   0.376402

	Oblateness      0.00218537

	RotationPeriod  41.781
	Obliquity       10.5004
	EqAscendNode    -31.7525
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.773 0.769 0.768)

	Surface
	{
		SurfStyle       0.56357
		OceanStyle      0.16207
		Randomize      (0.734, 0.558, 0.105)
		colorDistMagn   0.0894832
		colorDistFreq   193.321
		detailScale     4188.05
		colorConversion true
		drivenDarkening 0.130214
		seaLevel        0.168161
		snowLevel       2
		tropicLatitude  0.183733
		icecapLatitude  0.671925
		icecapHeight    0.185626
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.76747
		venusFreq       0.868846
		venusMagn       0
		mareFreq        0.689227
		mareDensity     0.00379606
		terraceProb     0.38201
		erosion         0
		montesMagn      0.0561265
		montesFreq      68.422
		montesSpiky     0.943736
		montesFraction  0.636382
		dunesMagn       0.0225647
		dunesFreq       2128.09
		dunesFraction   0.293704
		hillsMagn       0.117673
		hillsFreq       179.893
		hillsFraction   0.582554
		hills2Fraction  0.222073
		riversMagn      56.7809
		riversFreq      4.16135
		riversSin       6.18368
		riversOctaves   0
		canyonsMagn     0.560026
		canyonsFreq     0.574539
		canyonFraction  0
		cracksMagn      0.0527564
		cracksFreq      0.839199
		cracksOctaves   1
		craterMagn      0.619274
		craterFreq      5.7349
		craterDensity   0.987516
		craterOctaves   11
		craterRayedFactor 0.155275
		volcanoMagn     0.225219
		volcanoFreq     0.861733
		volcanoDensity  0.194493
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.231968
		volcanoRadius   0.199496
		volcanoTemp     1651.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.208, 0.192, 0.000)
		colorShelf     (0.371, 0.346, 0.315, 0.000)
		colorBeach     (0.595, 0.531, 0.430, 0.000)
		colorDesert    (0.634, 0.577, 0.453, 0.000)
		colorLowland   (0.565, 0.562, 0.514, 0.000)
		colorUpland    (0.534, 0.454, 0.407, 0.000)
		colorRock      (0.530, 0.430, 0.330, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.565, 0.562, 0.514, 0.000)
		colorUpPlants  (0.534, 0.454, 0.407, 0.000)
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
		SemiMajorAxis   0.0146199
		Period          0.258551
		Eccentricity    0.0432202
		Inclination     0.0931838
		AscendingNode   -21.3235
		ArgOfPericenter 28.4119
		MeanAnomaly     10.6558
	}
}

Moon	"Tion System 6.8"
{
	ParentBody     "Tion System 6"
	Class	       "IceWorld"

	Mass            0.00114503
	Radius          919.587
	InertiaMoment   0.397563

	Oblateness      0.00132506

	RotationPeriod  69.6509
	Obliquity       -7.42071
	EqAscendNode    6.09306
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.659 0.655 0.652)

	Surface
	{
		SurfStyle       0.246046
		OceanStyle      0.580109
		Randomize      (0.304, 0.066, -0.938)
		colorDistMagn   0.0621356
		colorDistFreq   119.528
		detailScale     2365.23
		colorConversion true
		drivenDarkening 0.083608
		seaLevel        0.333728
		snowLevel       2
		tropicLatitude  0.144989
		icecapLatitude  0.811001
		icecapHeight    0.338885
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.09291
		venusFreq       1.64602
		venusMagn       0
		mareFreq        0.27
		mareDensity     0.000383268
		terraceProb     0.474528
		erosion         0
		montesMagn      0.0621745
		montesFreq      32.0538
		montesSpiky     0.870475
		montesFraction  0.347987
		dunesMagn       0.035538
		dunesFreq       1247.51
		dunesFraction   0.129265
		hillsMagn       0.112533
		hillsFreq       95.5267
		hillsFraction   0.898383
		hills2Fraction  0.0974964
		riversMagn      57.767
		riversFreq      3.02832
		riversSin       3.95215
		riversOctaves   0
		canyonsMagn     0.515083
		canyonsFreq     0.359869
		canyonFraction  0
		cracksMagn      0.0416425
		cracksFreq      0.303472
		cracksOctaves   0
		craterMagn      0.624525
		craterFreq      2.13627
		craterDensity   0.872924
		craterOctaves   10
		craterRayedFactor 0.201474
		volcanoMagn     0.209756
		volcanoFreq     0.578238
		volcanoDensity  0.203741
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.462103
		volcanoRadius   0.17218
		volcanoTemp     1425.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.164, 0.143, 0.000)
		colorShelf     (0.244, 0.203, 0.182, 0.000)
		colorBeach     (0.369, 0.308, 0.274, 0.200)
		colorDesert    (0.461, 0.459, 0.456, 0.500)
		colorLowland   (0.461, 0.459, 0.456, 0.800)
		colorUpland    (0.428, 0.426, 0.424, 1.000)
		colorRock      (0.600, 0.600, 0.600, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.461, 0.459, 0.456, 0.800)
		colorUpPlants  (0.428, 0.426, 0.424, 1.000)
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
		SemiMajorAxis   0.0227696
		Period          0.502671
		Eccentricity    0.0130647
		Inclination     -0.924277
		AscendingNode   8.15575
		ArgOfPericenter -175.471
		MeanAnomaly     -64.2098
	}
}

DwarfMoon	"Tion System 6.D5"
{
	ParentBody     "Tion System 6"
	Class	       "Asteroid"

	Mass            5.85502e-008
	Radius          53.5898
	InertiaMoment   0.396922

	RotationPeriod  570.48
	Obliquity       -2.80764
	EqAscendNode    -33.2478
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.672 0.667 0.664)

	Surface
	{
		SurfStyle       0.589887
		OceanStyle      0.231511
		Randomize      (0.235, -0.467, 0.050)
		colorDistMagn   0.470862
		colorDistFreq   1.83446
		detailScale     1463.36
		colorConversion true
		snowLevel       2
		tropicLatitude  0.598777
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.341775
		terraceProb     0.186162
		erosion         0
		montesMagn      0.268957
		montesFreq      2.21462
		montesSpiky     0.931819
		montesFraction  0.211956
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.34592
		hillsFraction   0.530329
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21951
		craterFreq      0.217995
		craterDensity   0.903689
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.597793
		volcanoTemp     1324.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.578, 0.507, 0.385, 0.000)
		colorShelf     (0.296, 0.227, 0.166, 0.000)
		colorBeach     (0.672, 0.560, 0.000, 0.000)
		colorDesert    (0.518, 0.467, 0.232, 0.000)
		colorLowland   (0.558, 0.454, 0.146, 0.270)
		colorUpland    (0.403, 0.267, 0.053, 0.000)
		colorRock      (0.148, 0.127, 0.073, 0.000)
		colorSnow      (0.524, 0.520, 0.518, 1.000)
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
		SemiMajorAxis   0.117041
		Period          5.85833
		Eccentricity    0.200705
		Inclination     39.3189
		AscendingNode   -24.6326
		ArgOfPericenter -47.1352
		MeanAnomaly     1.5435
	}
}

DwarfMoon	"Tion System 6.D6"
{
	ParentBody     "Tion System 6"
	Class	       "Asteroid"

	Mass            7.96665e-008
	Radius          56.4494
	InertiaMoment   0.398567

	RotationPeriod  517.404
	Obliquity       88.2271
	EqAscendNode    35.3625
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.766 0.764 0.761)

	Surface
	{
		SurfStyle       0.536191
		OceanStyle      0.305835
		Randomize      (0.874, 0.119, -0.214)
		colorDistMagn   0.729671
		colorDistFreq   1.50275
		detailScale     1541.45
		colorConversion true
		snowLevel       2
		tropicLatitude  0.87476
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.258093
		terraceProb     0.148226
		erosion         0
		montesMagn      0.51713
		montesFreq      2.56968
		montesSpiky     0.950316
		montesFraction  0.625583
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.44113
		hillsFraction   0.625719
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241691
		craterFreq      0.240419
		craterDensity   0.932359
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.575157
		volcanoTemp     1465.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.252, 0.305, 0.000)
		colorShelf     (0.352, 0.313, 0.343, 0.000)
		colorBeach     (0.398, 0.344, 0.388, 0.000)
		colorDesert    (0.452, 0.397, 0.426, 0.000)
		colorLowland   (0.498, 0.435, 0.472, 0.000)
		colorUpland    (0.544, 0.466, 0.502, 0.000)
		colorRock      (0.605, 0.527, 0.594, 0.000)
		colorSnow      (0.605, 0.512, 0.579, 1.000)
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
		SemiMajorAxis   0.117663
		Period          5.90505
		Eccentricity    0.381245
		Inclination     36.356
		AscendingNode   30.7008
		ArgOfPericenter 154.859
		MeanAnomaly     -75.5647
	}
}

DwarfMoon	"Tion System 6.D7"
{
	ParentBody     "Tion System 6"
	Class	       "Asteroid"

	Mass            1.08688e-007
	Radius          73.1703
	InertiaMoment   0.399554

	RotationPeriod  573.66
	Obliquity       -63.8376
	EqAscendNode    147.145
	Precession      0

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.557 0.492 0.441)

	Surface
	{
		SurfStyle       0.301809
		OceanStyle      0.250763
		Randomize      (0.136, 0.632, 0.092)
		colorDistMagn   0.874795
		colorDistFreq   2.84488
		detailScale     1998.04
		colorConversion true
		snowLevel       2
		tropicLatitude  0.487316
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.616195
		terraceProb     0.426232
		erosion         0
		montesMagn      0.486962
		montesFreq      3.13867
		montesSpiky     0.795782
		montesFraction  0.383049
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.8328
		hillsFraction   0.628261
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234546
		craterFreq      0.191933
		craterDensity   0.866148
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.492761
		volcanoTemp     1621.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.143, 0.137, 0.000)
		colorShelf     (0.223, 0.157, 0.159, 0.000)
		colorBeach     (0.262, 0.182, 0.190, 0.000)
		colorDesert    (0.284, 0.192, 0.172, 0.000)
		colorLowland   (0.312, 0.207, 0.207, 0.000)
		colorUpland    (0.345, 0.251, 0.243, 0.000)
		colorRock      (0.373, 0.275, 0.269, 0.000)
		colorSnow      (0.407, 0.280, 0.282, 1.000)
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
		SemiMajorAxis   0.117908
		Period          5.92352
		Eccentricity    0.230733
		Inclination     -49.707
		AscendingNode   149.207
		ArgOfPericenter 89.0094
		MeanAnomaly     -90.07
	}
}

Barycenter     "Tion System 7-7.1"
{
	ParentBody     "Tion System"
	Mass            0.00613562
	Radius          314.787
	RotationPeriod  24
	Obliquity       0
	EqAscendNode    0
	Precession      0


	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   71.1659
		Period          245.227
		Eccentricity    0.0163473
		Inclination     -174.7
		AscendingNode   50.2061
		ArgOfPericenter 67.1629
		MeanAnomaly     251.211
	}
}

DwarfPlanet	"Tion System 7"
{
	ParentBody     "Tion System 7-7.1"
	Class	       "IceWorld"

	Mass            0.00578033
	Radius          1476.8
	InertiaMoment   0.389193

	Oblateness      0.0132263

	Obliquity       1.39889
	EqAscendNode    32.2862
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.729 0.722 0.718)

	Surface
	{
		SurfStyle       0.731481
		OceanStyle      0.882702
		Randomize      (-0.413, -0.227, -0.725)
		colorDistMagn   0.0419767
		colorDistFreq   189.832
		detailScale     3798.41
		colorConversion true
		drivenDarkening 0
		seaLevel        0.226569
		snowLevel       2
		tropicLatitude  0.0468875
		icecapLatitude  0.728472
		icecapHeight    0.248254
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.88087
		venusFreq       1.16941
		venusMagn       0
		mareFreq        0.793996
		mareDensity     0.00214994
		terraceProb     0.344284
		erosion         0
		montesMagn      0.0456637
		montesFreq      72.1497
		montesSpiky     0.774559
		montesFraction  0.720615
		dunesMagn       0.0248648
		dunesFreq       1984.88
		dunesFraction   0.164648
		hillsMagn       0.128609
		hillsFreq       153.717
		hillsFraction   0.75269
		hills2Fraction  0.100954
		riversMagn      62.2044
		riversFreq      1.9873
		riversSin       8.92264
		riversOctaves   0
		canyonsMagn     0.384875
		canyonsFreq     0.55781
		canyonFraction  0
		cracksMagn      0.0382415
		cracksFreq      0.954419
		cracksOctaves   1
		craterMagn      0.641934
		craterFreq      3.22997
		craterDensity   0.957825
		craterOctaves   11
		craterRayedFactor 0.205001
		volcanoMagn     0.206476
		volcanoFreq     0.770221
		volcanoDensity  0.32094
		volcanoOctaves  3
		volcanoActivity 1.1935
		volcanoFlows    0.0732512
		volcanoRadius   0.162223
		volcanoTemp     1525.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.634, 0.585, 0.330, 0.000)
		colorShelf     (0.714, 0.679, 0.330, 0.000)
		colorBeach     (0.488, 0.383, 0.165, 0.000)
		colorDesert    (0.452, 0.340, 0.151, 0.000)
		colorLowland   (0.408, 0.390, 0.144, 0.200)
		colorUpland    (0.452, 0.433, 0.187, 0.500)
		colorRock      (0.860, 0.630, 0.260, 0.100)
		colorSnow      (0.800, 0.410, 0.160, 0.154)
		colorLowPlants (0.408, 0.390, 0.144, 0.200)
		colorUpPlants  (0.452, 0.433, 0.187, 0.500)
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
		SemiMajorAxis   2.61652e-006
		Period          0.00224257
		Eccentricity    0.011378
		Inclination     1.39889
		AscendingNode   32.2862
		ArgOfPericenter 14.5454
		MeanAnomaly     104.54
	}
}

Moon	"Tion System 7.1"
{
	ParentBody     "Tion System 7-7.1"
	Class	       "Selena"

	Mass            0.000355292
	Radius          623.889
	InertiaMoment   0.398868

	Oblateness      0.0168234

	Obliquity       1.39889
	EqAscendNode    32.2862
	Precession      0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.750 0.747 0.742)

	Surface
	{
		SurfStyle       0.664412
		OceanStyle      0.970803
		Randomize      (-0.089, 0.441, 0.351)
		colorDistMagn   0.0444845
		colorDistFreq   65.7518
		detailScale     1604.68
		colorConversion true
		drivenDarkening 0
		seaLevel        0.173889
		snowLevel       2
		tropicLatitude  0.0468875
		icecapLatitude  0.664773
		icecapHeight    0.199207
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.96965
		venusFreq       0.268244
		venusMagn       0
		mareFreq        0.0174138
		mareDensity     0.000256464
		terraceProb     0.49916
		erosion         0
		montesMagn      0.0501834
		montesFreq      34.4484
		montesSpiky     0.972212
		montesFraction  0.0911716
		dunesMagn       0.047208
		dunesFreq       834.363
		dunesFraction   0.619017
		hillsMagn       0.125439
		hillsFreq       70.2585
		hillsFraction   0.85122
		hills2Fraction  0
		riversMagn      65.1663
		riversFreq      4.6667
		riversSin       4.45162
		riversOctaves   0
		canyonsMagn     0.470712
		canyonsFreq     0.263741
		canyonFraction  0.645781
		cracksMagn      0.0369945
		cracksFreq      0.229755
		cracksOctaves   0
		craterMagn      0.583062
		craterFreq      1.28086
		craterDensity   0.723733
		craterOctaves   8.82971
		craterRayedFactor 0.127764
		volcanoMagn     0.187524
		volcanoFreq     0.695121
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.328276
		volcanoRadius   0.168707
		volcanoTemp     1593.58
		lavaCoverTidal  0.0210233
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.160, 0.200, 0.200, 0.000)
		colorShelf     (0.310, 0.360, 0.360, 0.000)
		colorBeach     (0.405, 0.381, 0.349, 0.000)
		colorDesert    (0.442, 0.418, 0.393, 0.200)
		colorLowland   (0.450, 0.471, 0.482, 0.500)
		colorUpland    (0.495, 0.508, 0.520, 0.800)
		colorRock      (0.710, 0.730, 0.750, 1.000)
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
		SemiMajorAxis   4.25687e-005
		Period          0.00224257
		Eccentricity    0.011378
		Inclination     1.39889
		AscendingNode   32.2862
		ArgOfPericenter -165.455
		MeanAnomaly     104.54
	}
}

Planet	"Tion System 8"
{
	ParentBody     "Tion System"
	Class	       "IceWorld"

	Mass            0.0318918
	Radius          2744.28
	InertiaMoment   0.357004

	Oblateness      0.00357644

	RotationPeriod  38.3927
	Obliquity       -204.719
	EqAscendNode    46.4332
	Precession      0

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.530 0.523 0.516)

	Surface
	{
		SurfStyle       0.0686022
		OceanStyle      0.253559
		Randomize      (-0.527, 0.675, 0.276)
		colorDistMagn   0.05847
		colorDistFreq   248.385
		detailScale     7058.45
		colorConversion true
		drivenDarkening 0
		seaLevel        0.105936
		snowLevel       2
		tropicLatitude  0.401097
		icecapLatitude  1
		icecapHeight    0.105936
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.68391
		venusFreq       1.26178
		venusMagn       0.165341
		mareFreq        1.79828
		mareDensity     0.00312046
		terraceProb     0.172904
		erosion         0
		montesMagn      0.134778
		montesFreq      103.408
		montesSpiky     0.902156
		montesFraction  0.619645
		dunesMagn       0.0268427
		dunesFreq       3677.19
		dunesFraction   0.709889
		hillsMagn       0.12281
		hillsFreq       323.723
		hillsFraction   0.0940442
		hills2Fraction  0.0673756
		riversMagn      67.0158
		riversFreq      3.49623
		riversSin       7.48868
		riversOctaves   0
		canyonsMagn     0.558049
		canyonsFreq     1.0166
		canyonFraction  0
		cracksMagn      0.0488908
		cracksFreq      0.999859
		cracksOctaves   1
		craterMagn      0.620674
		craterFreq      6.99352
		craterDensity   0.981114
		craterOctaves   12
		craterRayedFactor 0.119701
		volcanoMagn     0.464847
		volcanoFreq     0.668102
		volcanoDensity  0.187851
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.315299
		volcanoRadius   0.521753
		volcanoTemp     1252.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.159, 0.131, 0.114, 0.000)
		colorShelf     (0.196, 0.162, 0.145, 0.000)
		colorBeach     (0.297, 0.246, 0.217, 0.200)
		colorDesert    (0.270, 0.230, 0.191, 0.500)
		colorLowland   (0.207, 0.178, 0.145, 0.800)
		colorUpland    (0.349, 0.314, 0.269, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.207, 0.178, 0.145, 0.800)
		colorUpPlants  (0.349, 0.314, 0.269, 1.000)
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
		SemiMajorAxis   127.784
		Period          590.03
		Eccentricity    0.0249204
		Inclination     -178.37
		AscendingNode   47.5212
		ArgOfPericenter 158.479
		MeanAnomaly     277.053
	}
}

DwarfMoon	"Tion System 8.D1"
{
	ParentBody     "Tion System 8"
	Class	       "Asteroid"

	Mass            9.27064e-010
	Radius          13.622
	InertiaMoment   0.399362

	Oblateness      0.249

	Obliquity       -0.0128734
	EqAscendNode    -168.735
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.641 0.605 0.553)

	Surface
	{
		SurfStyle       0.607331
		OceanStyle      0.775115
		Randomize      (-0.930, 0.832, -0.971)
		colorDistMagn   0.711638
		colorDistFreq   0.0943875
		detailScale     371.973
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.350906
		terraceProb     0.536825
		erosion         0
		montesMagn      0.365071
		montesFreq      2.65318
		montesSpiky     0.895373
		montesFraction  0.561956
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.384378
		hillsFraction   0.693977
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212402
		craterFreq      0.245678
		craterDensity   0.879747
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.562618
		volcanoTemp     1517.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.551, 0.459, 0.321, 0.000)
		colorShelf     (0.282, 0.206, 0.138, 0.000)
		colorBeach     (0.641, 0.508, 0.000, 0.000)
		colorDesert    (0.494, 0.423, 0.193, 0.000)
		colorLowland   (0.532, 0.411, 0.122, 0.270)
		colorUpland    (0.385, 0.242, 0.044, 0.000)
		colorRock      (0.141, 0.115, 0.061, 0.000)
		colorSnow      (0.500, 0.472, 0.431, 1.000)
		BumpHeight      12.2598
		BumpOffset      2.45197
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
		SemiMajorAxis   4.15782e-005
		Period          0.000868238
		Eccentricity    7.14122e-005
		Inclination     -0.0128734
		AscendingNode   -168.735
		ArgOfPericenter -16.5565
		MeanAnomaly     115.772
	}
}

DwarfMoon	"Tion System 8.D2"
{
	ParentBody     "Tion System 8"
	Class	       "Asteroid"

	Mass            1.33078e-009
	Radius          14.7094
	InertiaMoment   0.396707

	Oblateness      0.192729

	Obliquity       0.0136956
	EqAscendNode    -167.053
	Precession      0
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.649 0.646 0.642)

	Surface
	{
		SurfStyle       0.922552
		OceanStyle      0.836784
		Randomize      (0.518, 0.947, 0.788)
		colorDistMagn   0.594778
		colorDistFreq   0.12074
		detailScale     401.664
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.466505
		terraceProb     0.170732
		erosion         0
		montesMagn      0.539049
		montesFreq      3.57082
		montesSpiky     0.911027
		montesFraction  0.405756
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.401207
		hillsFraction   0.665112
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226428
		craterFreq      0.218563
		craterDensity   0.847491
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450715
		volcanoTemp     1559.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.526, 0.233, 0.115, 0.000)
		colorShelf     (0.545, 0.271, 0.103, 0.000)
		colorBeach     (0.493, 0.226, 0.103, 0.000)
		colorDesert    (0.539, 0.246, 0.115, 0.000)
		colorLowland   (0.532, 0.252, 0.115, 0.000)
		colorUpland    (0.532, 0.252, 0.115, 0.000)
		colorRock      (0.539, 0.252, 0.109, 0.000)
		colorSnow      (0.539, 0.265, 0.128, 1.000)
		BumpHeight      13.2384
		BumpOffset      2.64769
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
		SemiMajorAxis   5.25694e-005
		Period          0.00123435
		Eccentricity    7.31481e-005
		Inclination     0.0136956
		AscendingNode   -167.053
		ArgOfPericenter 80.4323
		MeanAnomaly     145.206
	}
}
