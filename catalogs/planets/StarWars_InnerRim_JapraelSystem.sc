// http://starwars.wikia.com/wiki/Onderon
// Region : Inner Rim
// Sector : Japrael Sector
// Grid location : O9
// X : 5559.23, Y : 261.08, Z : 18.110478964135723

// http://starwars.wikia.com/wiki/Bara
Planet	"Bara/Japrael System 1"
{
	ParentBody     "Prael"
	Class	       "Selena"

	Mass            0.0291861
	Radius          2036.41
	InertiaMoment   0.352656

	RotationPeriod  379.052
	Obliquity       0.630104
	EqAscendNode    44.4384

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (1.036 1.034 0.975)

	Surface
	{
		SurfStyle       0.964844
		OceanStyle      0.675948
		Randomize      (0.143, -0.664, -0.221)
		colorDistMagn   0.0883594
		colorDistFreq   205.12
		detailScale     5237.77
		colorConversion true
		drivenDarkening 0
		seaLevel        0.21699
		snowLevel       2
		tropicLatitude  0.0203609
		icecapLatitude  10
		icecapHeight    0.158501
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.73306
		venusFreq       0.843646
		venusMagn       0
		mareFreq        1.35392
		mareDensity     0.0124858
		terraceProb     0.1236
		erosion         0
		montesMagn      0.100358
		montesFreq      102.151
		montesSpiky     0.979878
		montesFraction  0.209959
		dunesMagn       0.0419946
		dunesFreq       2743.5
		dunesFraction   0.448852
		hillsMagn       0.117678
		hillsFreq       263.743
		hillsFraction   0.723857
		hills2Fraction  0
		riversMagn      54.4294
		riversFreq      2.88636
		riversSin       7.90037
		riversOctaves   0
		canyonsMagn     0.450094
		canyonsFreq     0.830243
		canyonFraction  0.834522
		cracksMagn      0.0252126
		cracksFreq      0.839334
		cracksOctaves   0
		craterMagn      0.584434
		craterFreq      4.66153
		craterDensity   0.0762202
		craterOctaves   1.1
		craterRayedFactor 0
		volcanoMagn     0.289928
		volcanoFreq     0.707022
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.218948
		volcanoRadius   0.285346
		volcanoTemp     1773.07
		lavaCoverTidal  0
		lavaCoverSun    2.11208
		lavaCoverYoung  0
		colorSea       (0.390, 0.400, 0.160, 0.000)
		colorShelf     (0.580, 0.550, 0.240, 0.000)
		colorBeach     (0.524, 0.479, 0.279, 0.000)
		colorDesert    (0.605, 0.535, 0.285, 0.000)
		colorLowland   (0.465, 0.387, 0.206, 0.000)
		colorUpland    (0.436, 0.359, 0.192, 0.000)
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
		SemiMajorAxis   3.123425
		Period          0.0216211
		Eccentricity    0.079091
		Inclination     0.630104
		AscendingNode   44.4384
		ArgOfPericenter 75.7196
		MeanAnomaly     183.464
	}
}

Moon	"Japrael System 1.1"
{
	ParentBody     "Japrael System 1"
	Class	       "Selena"

	Mass            5.19539e-009
	Radius          12.7386
	InertiaMoment   0.397597

	Oblateness      0.0186084

	Obliquity       -6.95588
	EqAscendNode    36.6729
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.688 0.684 0.682)

	Surface
	{
		SurfStyle       0.981504
		OceanStyle      0.958479
		Randomize      (0.247, 0.674, 0.329)
		colorDistMagn   0.569295
		colorDistFreq   0.12096
		detailScale     347.85
		colorConversion true
		snowLevel       2
		tropicLatitude  0.228388
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.554611
		terraceProb     0.510321
		erosion         0
		montesMagn      0.416015
		montesFreq      3.23505
		montesSpiky     0.989785
		montesFraction  0.491345
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.389274
		hillsFraction   0.473879
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275685
		craterFreq      0.275959
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538525
		volcanoTemp     1264.16
		lavaCoverTidal  0
		lavaCoverSun    2.11208
		lavaCoverYoung  0
		colorSea       (0.234, 0.239, 0.273, 0.050)
		colorShelf     (0.275, 0.280, 0.314, 0.040)
		colorBeach     (0.316, 0.322, 0.354, 0.030)
		colorDesert    (0.358, 0.363, 0.402, 0.020)
		colorLowland   (0.399, 0.404, 0.443, 0.030)
		colorUpland    (0.440, 0.445, 0.484, 0.050)
		colorRock      (0.482, 0.486, 0.539, 0.020)
		colorSnow      (0.482, 0.486, 0.539, 1.000)
		BumpHeight      11.4648
		BumpOffset      2.29296
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
		SemiMajorAxis   6.12566e-005
		Period          0.00162301
		Eccentricity    0.0842179
		Inclination     -6.95588
		AscendingNode   36.6729
		ArgOfPericenter 7.27334
		MeanAnomaly     -7.62601
	}
}

// http://starwars.wikia.com/wiki/Onderon/Legends
// Temperate
// Standard Gravity
Planet	"Onderon/Japrael System 2"
{
	ParentBody     "Prael"
	Class	       "Terra"

	Mass            1.46178
	Radius          7595 // wookieepedia
	InertiaMoment   0.329157

	RotationPeriod  28 // wookieepedia
	Obliquity       -0.300342
	EqAscendNode    14.8604

	AlbedoBond      0.283831
	AlbedoGeom      0.340597
	Brightness      2
	Color          (0.432 0.506 0.343)
	
	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
		Panspermia "false"
	}

	Surface
	{
		SurfStyle       0.962812
		OceanStyle      0.676439
		Randomize      (0.197, 0.050, -0.285)
		colorDistMagn   0.0606753
		colorDistFreq   973.164
		detailScale     19534.8
		colorConversion true
		drivenDarkening -1
		seaLevel        0.0158779
		snowLevel       0.85
		tropicLatitude  0.456799
		icecapLatitude  1
		icecapHeight    0
		climatePole     1
		climateTropic   0.396825
		climateEquator  0.52381
		heightTempGrad  0.492063
		tropicWidth     0.619048
		mainFreq        2.61905
		venusFreq       0.85
		venusMagn       0
		mareFreq        1.3895
		mareDensity     0.0276128
		terraceProb     0.388889
		erosion         0.849206
		montesMagn      0.31746
		montesFreq      51.5873
		montesSpiky     0.047619
		montesFraction  0.285714
		dunesMagn       1.66667
		dunesFreq       37.3016
		dunesFraction   0.482529
		hillsMagn       1.5873
		hillsFreq       341.27
		hillsFraction   0.642857
		hills2Fraction  0.992997
		riversMagn      58.8302
		riversFreq      10
		riversSin       6.70027
		riversOctaves   2
		canyonsMagn     0.15873
		canyonsFreq     6.34921
		canyonFraction  0.357284
		cracksMagn      0.119694
		cracksFreq      0.15873
		cracksOctaves   0
		craterMagn      0.591942
		craterFreq      5.2381
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.166667
		volcanoFreq     0.206349
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.60924
		volcanoFlows    0.749832
		volcanoRadius   0.246032
		volcanoTemp     1875.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.97729
		stripeFluct     0
		stripeTwist     0.0664068
		cycloneMagn     2.83283
		cycloneFreq     1.05742
		cycloneDensity  0.401564
		cycloneOctaves  4
		colorSea       (0.040, 0.200, 0.200, 1.000)
		colorShelf     (0.150, 0.370, 0.370, 1.000)
		colorBeach     (0.480, 0.380, 0.280, 0.000)
		colorDesert    (0.410, 0.280, 0.180, 0.000)
		colorLowland   (0.310, 0.230, 0.170, 0.000)
		colorUpland    (0.510, 0.330, 0.190, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.100, 0.160, 0.070, 0.000)
		colorUpPlants  (0.090, 0.110, 0.040, 0.000)
		BumpHeight      20
		BumpOffset      4.29168
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecularPower   25
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          5.64453
		Velocity        25.196
		BumpHeight      5.64433
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.961617
		mainOctaves     10
		Coverage        0.139718
		stripeZones     1.97729
		stripeFluct     0
		stripeTwist     0.0664068
	}

	Clouds
	{
		Height          11.2886
		Velocity        102.513
		BumpHeight      5.64433
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.961617
		mainOctaves     10
		Coverage        0.139718
		stripeZones     1.97729
		stripeFluct     0
		stripeTwist     0.0664068
	}

	Ocean
	{
		Height          0.317559
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          94.6652
		Density         1.07584
		Pressure        1.07584
		Greenhouse      0
		Bright          2.22222
		Opacity         0
		SkyLight        3.33333
		Hue             -0.261905
		Saturation      0.793651

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
		Height      139.036
		NorthLat    47.7648
		NorthLon    -44.2708
		NorthRadius 2246.56
		NorthWidth  776.464
		NorthRings  4
		NorthBright 0.3
		NorthParticles 0
		SouthLat    -52.5734
		SouthLon    111.297
		SouthRadius 1951.44
		SouthWidth  653.853
		SouthRings  3
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
		SemiMajorAxis   8.86151
		Period          1.108829568788501 // wookieepedia
		Eccentricity    0.0250836
		Inclination     -0.297734
		AscendingNode   14.8601
		ArgOfPericenter 113.268
		MeanAnomaly     166.639
	}
}

// http://starwars.wikia.com/wiki/Dxun
// Temperate
// Standard Gravity
Moon	"Dxun/Japrael System 2.1"
{
	ParentBody     "Japrael System 2"
	Class      	   "Terra"

	Mass	   0.0555
	Radius     1500   // or Mass 1.5
	InertiaMoment   0.395252
	RotationPeriod  26 // wookieepedia

	Oblateness      0.05163

	Obliquity       0.00559508
	EqAscendNode    103.735
	TidalLocked     true

	AlbedoBond      0.698413
	AlbedoGeom      0.340597
	Brightness      2
	Color          (0.432 0.506 0.343)
	
	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
		Panspermia "false"
	}

	Surface
	{
		SurfStyle       0.962812
		OceanStyle      0.676439
		Randomize      (0.197, 0.050, -0.285)
		colorDistMagn   0.0606753
		colorDistFreq   973.164
		detailScale     19534.8
		colorConversion true
		drivenDarkening -1
		seaLevel        0.0158779
		snowLevel       0.85
		tropicLatitude  0.456799
		icecapLatitude  1
		icecapHeight    0
		climatePole     1
		climateTropic   0.396825
		climateEquator  0.52381
		heightTempGrad  0.492063
		tropicWidth     0.619048
		mainFreq        2.61905
		venusFreq       0.85
		venusMagn       0
		mareFreq        1.3895
		mareDensity     0.0276128
		terraceProb     0.388889
		erosion         0.849206
		montesMagn      0.31746
		montesFreq      51.5873
		montesSpiky     0.047619
		montesFraction  0.285714
		dunesMagn       1.66667
		dunesFreq       37.3016
		dunesFraction   0.482529
		hillsMagn       1.5873
		hillsFreq       341.27
		hillsFraction   0.642857
		hills2Fraction  0.992997
		riversMagn      58.8302
		riversFreq      10
		riversSin       6.70027
		riversOctaves   2
		canyonsMagn     0.15873
		canyonsFreq     6.34921
		canyonFraction  0.357284
		cracksMagn      0.119694
		cracksFreq      0.15873
		cracksOctaves   0
		craterMagn      0.591942
		craterFreq      5.2381
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.166667
		volcanoFreq     0.206349
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.60924
		volcanoFlows    0.749832
		volcanoRadius   0.246032
		volcanoTemp     1875.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.97729
		stripeFluct     0
		stripeTwist     0.0664068
		cycloneMagn     2.83283
		cycloneFreq     1.05742
		cycloneDensity  0.401564
		cycloneOctaves  4
		colorSea       (0.040, 0.200, 0.200, 1.000)
		colorShelf     (0.150, 0.370, 0.370, 1.000)
		colorBeach     (0.480, 0.380, 0.280, 0.000)
		colorDesert    (0.410, 0.280, 0.180, 0.000)
		colorLowland   (0.310, 0.230, 0.170, 0.000)
		colorUpland    (0.510, 0.330, 0.190, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.100, 0.160, 0.070, 0.000)
		colorUpPlants  (0.090, 0.110, 0.040, 0.000)
		BumpHeight      20
		BumpOffset      4.29168
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecularPower   25
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          5.64453
		Velocity        25.196
		BumpHeight      5.64433
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.961617
		mainOctaves     10
		Coverage        0.139718
		stripeZones     1.97729
		stripeFluct     0
		stripeTwist     0.0664068
	}

	Clouds
	{
		Height          11.2886
		Velocity        102.513
		BumpHeight      5.64433
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.961617
		mainOctaves     10
		Coverage        0.139718
		stripeZones     1.97729
		stripeFluct     0
		stripeTwist     0.0664068
	}

	Ocean
	{
		Height          0.317559
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          94.6652
		Density         1.07584
		Pressure        1.07584
		Greenhouse      0
		Bright          4.9
		Opacity         0.150794
		SkyLight        2.46032
		Hue             -0.119048
		Saturation      0.793651

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
		Height      139.036
		NorthLat    47.7648
		NorthLon    -44.2708
		NorthRadius 2246.56
		NorthWidth  776.464
		NorthRings  4
		NorthBright 0.3
		NorthParticles 0
		SouthLat    -52.5734
		SouthLon    111.297
		SouthRadius 1951.44
		SouthWidth  653.853
		SouthRings  3
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
		SemiMajorAxis  0.00033
		Eccentricity 0.8
		Inclination 13.14
		Period 0.8158969809111717
	}
}

// http://starwars.wikia.com/wiki/Dagri
Moon	"Dagri/Japrael System 2.2"
{
	ParentBody     "Japrael System 2"
	Class	       "Selena"

	Mass            0.3
	Radius          1002
	InertiaMoment   0.398198

	Oblateness      0.120316

	Obliquity       0.0113259
	EqAscendNode    -100.182
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color 			(0.85 0.85 1.0)

	Surface
	{
		SurfStyle       0.138783
		OceanStyle      0.632622
		Randomize      (-0.702, -0.468, 0.032)
		colorDistMagn   0.813722
		colorDistFreq   1.00808
		detailScale     1292.01
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.448482
		terraceProb     0.164914
		erosion         0
		montesMagn      0.327801
		montesFreq      3.72691
		montesSpiky     0.962884
		montesFraction  0.407916
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.47443
		hillsFraction   0.682753
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253815
		craterFreq      0.255672
		craterDensity   0
		craterOctaves   0.918002
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478123
		volcanoTemp     1293.97
		lavaCoverTidal  0
		lavaCoverSun    0.779977
		lavaCoverYoung  0
		colorSea       (0.261, 0.258, 0.257, 0.000)
		colorShelf     (0.277, 0.275, 0.273, 0.000)
		colorBeach     (0.293, 0.291, 0.289, 0.000)
		colorDesert    (0.309, 0.307, 0.305, 0.000)
		colorLowland   (0.326, 0.323, 0.321, 0.000)
		colorUpland    (0.342, 0.339, 0.338, 0.000)
		colorRock      (0.358, 0.355, 0.354, 0.000)
		colorSnow      (0.375, 0.371, 0.370, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   25.0
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		SemiMajorAxis  0.0006
		Eccentricity 0.4
		Period 1.0158969809111717
	}
}
// http://starwars.wikia.com/wiki/Evas
Moon	"Evas/Japrael System 2.3"
{
	ParentBody     "Japrael System 2"
	Class	       "Selena"

	Mass            1.87163e-007
	Radius     		859
	InertiaMoment   0.399276

	Oblateness      0.23864

	Obliquity       -0.528438
	EqAscendNode    34.694
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color 			(0.85 0.85 1.0)

	Surface
	{
		SurfStyle       0.0621084
		OceanStyle      0.291575
		Randomize      (-0.420, 0.762, 0.919)
		colorDistMagn   0.745534
		colorDistFreq   2.14576
		detailScale     2297.14
		colorConversion true
		seaLevel        -0.71699
		snowLevel       2
		tropicLatitude  0.0176045
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.703047
		terraceProb     0.165118
		erosion         0
		montesMagn      0.44117
		montesFreq      3.07115
		montesSpiky     0.933621
		montesFraction  0.4824
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.1935
		hillsFraction   0.505072
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242154
		craterFreq      0.225935
		craterDensity   0
		craterOctaves   0.983573
		volcanoActivity 0.469443
		volcanoFlows    0
		volcanoRadius   0.442807
		volcanoTemp     1799.25
		lavaCoverTidal  0
		lavaCoverSun    0.779977
		lavaCoverYoung  0
		colorSea       (0.325, 0.309, 0.293, 0.000)
		colorShelf     (0.345, 0.328, 0.312, 0.000)
		colorBeach     (0.366, 0.347, 0.330, 0.000)
		colorDesert    (0.386, 0.367, 0.348, 0.000)
		colorLowland   (0.406, 0.386, 0.367, 0.000)
		colorUpland    (0.426, 0.405, 0.385, 0.000)
		colorRock      (0.447, 0.424, 0.403, 0.000)
		colorSnow      (0.467, 0.444, 0.421, 1.000)
		BumpHeight      20
		BumpOffset      4
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   25.0
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		SemiMajorAxis  0.00082
		Eccentricity 0.3
		Period 1.58969809111717
	}
}

// http://starwars.wikia.com/wiki/Suthre
Moon	"Suthre/Japrael System 2.4"
{
	ParentBody     "Japrael System 2"
	Class	       "Selena"

	Mass            0.0862666
	Radius          1458
	InertiaMoment   0.334198

	Oblateness      0.00869217

	Obliquity       0
	EqAscendNode    0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.95
	Color          (0.739 0.753 0.921)

	Surface
	{
		DiffMap        "Moon/Surface-JVV"
		DiffTileSize    258
		DiffTileBorder  1
		BumpMap        "Moon/Bump-SE"
		BumpTileSize    258
		BumpTileBorder  1
		GlowTileSize    256
		GlowTileBorder  2
		BumpHeight      19.851
		BumpOffset      9.058
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
		Model          "Neptune"
		Height          69.0834
		Density         0.00352873
		Pressure        0.0061054
		Greenhouse      38.0952
		Bright          4.44444
		Opacity         0.230159
		SkyLight        1.34921
		Hue             -0.111111
		Saturation      2

		Composition
		{
			CO2   	94.0504
			SO2   	5.9301
			C3H8  	0.0194429
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00097
		Period 			1.1158969809111717
		Eccentricity    0.2
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

// http://starwars.wikia.com/wiki/Fillata
// Toxic world 3 moons
Planet	"Fillata/Japrael System 3"
{
	ParentBody     "Prael"
	Class	       "Desert"

	Mass            0.698733
	Radius          7500.69
	InertiaMoment   0.330244

	Oblateness      0.0063611

	RotationPeriod  14.1601
	Obliquity       -37.3515
	EqAscendNode    -89.4945

	AbsMagn         -3.05887
	SlopeParam      5.63081
	AlbedoBond      0.27694
	AlbedoGeom      0.332328
	Brightness      2
	Color 			(0.85 0.85 1.0)

	Surface
	{
		SurfStyle       0.0975838
		OceanStyle      0.887657
		Randomize      (-0.095, -0.145, -0.101)
		colorDistMagn   0.0407101
		colorDistFreq   551.843
		detailScale     12718
		colorConversion true
		seaLevel        0.135236
		snowLevel       2
		tropicLatitude  0.615081
		icecapLatitude  10
		icecapHeight    0.208326
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.673356
		venusFreq       0.775527
		venusMagn       0.433567
		mareFreq        2.45858
		mareDensity     0.208246
		terraceProb     0.239414
		erosion         0
		montesMagn      0.252456
		montesFreq      217.351
		montesSpiky     0.990452
		montesFraction  0.172704
		dunesMagn       0.055252
		dunesFreq       39.1851
		dunesFraction   0.63505
		hillsMagn       0.108538
		hillsFreq       517.348
		hillsFraction   0
		hills2Fraction  0
		riversMagn      60.94
		riversFreq      2.74832
		riversSin       6.14622
		riversOctaves   0
		canyonsMagn     0.0236725
		canyonsFreq     115.928
		canyonFraction  0
		cracksMagn      0.102579
		cracksFreq      0.515879
		cracksOctaves   0
		craterMagn      0.701124
		craterFreq      14.3476
		craterDensity   0.227077
		craterOctaves   3.40226
		volcanoMagn     0.798396
		volcanoFreq     0.864751
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.983198
		volcanoRadius   0.545455
		volcanoTemp     1597.74
		lavaCoverTidal  0
		lavaCoverSun    0.172212
		lavaCoverYoung  0
		stripeZones     2.29516
		stripeTwist     0
		cycloneMagn     2.41178
		cycloneFreq     1.09585
		cycloneDensity  0.379986
		cycloneOctaves  2
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
		BumpHeight      18.5489
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   25.0
		Hapke           0.7458
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          15.1699
		Velocity        98.8731
		BumpHeight      5.65665
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.05851
		mainOctaves     10
		Coverage        0.15388
		stripeZones     2.29516
		stripeTwist     0
	}

	Clouds
	{
		Height          21.0654
		Velocity        65.5586
		BumpHeight      5.8955
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.05851
		mainOctaves     10
		Coverage        0.15388
		stripeZones     2.29516
		stripeTwist     0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          247.234
		Density         0.02542
		Pressure        0.117721
		Greenhouse      32.9272
		Bright          7.60388
		Opacity         1
		SkyLight        2.53463
		Hue             0
		Saturation      1

		Composition
		{
			H2O   	37.9724
			CH4   	34.8301
			H2S   	10.1715
			CO2   	8.15995
			C2H2  	6.02949
			C2H4  	1.18466
			NH3   	0.970581
			SO2   	0.270151
			N2    	0.243894
			C2H6  	0.155209
			C3H8  	0.0119698
			CO    	3.81817e-005
			Cl2   	1.2291e-005
		}
	}

	Aurora
	{
		Height      121.957
		NorthLat    58.1647
		NorthLon    -109.561
		NorthRadius 1187.41
		NorthWidth  385.326
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -80.2232
		SouthLon    70.4904
		SouthRadius 1602.6
		SouthWidth  456.161
		SouthRings  2
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   1.02769
		GasToDust   0
		Particles   2633
		GasBright   0.0582659
		DustBright  0.143249
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.12365
		Period          0.152927
		Eccentricity    0.0399461
		Inclination     -2.20826
		AscendingNode   -75.4478
		ArgOfPericenter 187.921
		MeanAnomaly     288.746
	}
}

Moon	"Japrael System 3.1"
{
	ParentBody     "Japrael System 3"
	Class	       "Selena"

	Mass            2.25998e-011
	Radius          2.11754
	InertiaMoment   0.399636

	Oblateness      0.101094

	Obliquity       0.0103364
	EqAscendNode    31.4192
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.664 0.611 0.523)

	Surface
	{
		SurfStyle       0.115032
		OceanStyle      0.862694
		Randomize      (-0.188, -0.760, -0.801)
		colorDistMagn   0.496184
		colorDistFreq   0.0034028
		detailScale     57.823
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.624042
		terraceProb     0.143686
		erosion         0
		montesMagn      0.377632
		montesFreq      3.21593
		montesSpiky     0.878652
		montesFraction  0.562418
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0133363
		hillsFraction   0.865333
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247172
		craterFreq      0.201483
		craterDensity   0.607017
		craterOctaves   6.2954
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.566388
		volcanoTemp     1358.58
		lavaCoverTidal  0
		lavaCoverSun    0.172212
		lavaCoverYoung  0
		colorSea       (0.266, 0.244, 0.209, 0.000)
		colorShelf     (0.282, 0.260, 0.222, 0.000)
		colorBeach     (0.299, 0.275, 0.235, 0.000)
		colorDesert    (0.316, 0.290, 0.248, 0.000)
		colorLowland   (0.332, 0.305, 0.262, 0.000)
		colorUpland    (0.349, 0.321, 0.275, 0.000)
		colorRock      (0.365, 0.336, 0.288, 0.000)
		colorSnow      (0.382, 0.351, 0.301, 1.000)
		BumpHeight      1.90579
		BumpOffset      0.381157
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
		SemiMajorAxis   0.00302529
		Period          0.000718277
		Eccentricity    3.87908e-005
		Inclination     0.0103364
		AscendingNode   31.4192
		ArgOfPericenter 83.2552
		MeanAnomaly     172.75
	}
}

Moon    "Japrael System 3.2"
{
	ParentBody     "Japrael System 3"
	Class	       "Selena"

	Mass            0.0154684
	Radius          1500
	InertiaMoment   0.365876

	Oblateness      0.0277108

	Obliquity       0
	EqAscendNode    0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.692 0.689 0.687)

	Surface
	{
		SurfStyle       0.107521
		OceanStyle      0.234092
		Randomize      (-0.546, -0.726, 0.566)
		colorDistMagn   0.0961477
		colorDistFreq   186.357
		detailScale     3858.08
		colorConversion true
		drivenDarkening 0
		seaLevel        0.122999
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  10
		icecapHeight    0.197477
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.02969
		venusFreq       0.496549
		venusMagn       0
		mareFreq        0.701477
		mareDensity     0.0137751
		terraceProb     0.210809
		erosion         0
		montesMagn      0.0630682
		montesFreq      92.4818
		montesSpiky     0.900321
		montesFraction  0.242422
		dunesMagn       0.051306
		dunesFreq       1960.59
		dunesFraction   0.354872
		hillsMagn       0.140703
		hillsFreq       140.691
		hillsFraction   0.874208
		hills2Fraction  0
		riversMagn      61.1357
		riversFreq      3.25785
		riversSin       6.53888
		riversOctaves   0
		canyonsMagn     0.482587
		canyonsFreq     0.500525
		canyonFraction  0.0727222
		cracksMagn      0.0327127
		cracksFreq      0.363634
		cracksOctaves   0
		craterMagn      0.622426
		craterFreq      3.15753
		craterDensity   0.750886
		craterOctaves   9.29571
		craterRayedFactor 0.179778
		volcanoMagn     0.175282
		volcanoFreq     0.589215
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.433456
		volcanoRadius   0.168821
		volcanoTemp     1749.93
		lavaCoverTidal  0
		lavaCoverSun    0.17215
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.346, 0.344, 0.343, 0.000)
		colorDesert    (0.429, 0.413, 0.391, 0.200)
		colorLowland   (0.464, 0.441, 0.439, 0.500)
		colorUpland    (0.485, 0.461, 0.453, 0.800)
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
		RefPlane        "Extrasolar"
		SemiMajorAxis   0.00122529
		Period          0.00092817
		Eccentricity    0
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Moon    "Japrael System 3.3"
{
	ParentBody     "Japrael System 3"
	Class	       "Selena"

	Mass            0.0424452
	Radius          2100
	InertiaMoment   0.348984

	Oblateness      0.0140024

	Obliquity       0
	EqAscendNode    0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.434 0.430 0.428)

	Surface
	{
		SurfStyle       0.317635
		OceanStyle      0.76231
		Randomize      (-0.173, -0.648, -0.849)
		colorDistMagn   0.0838035
		colorDistFreq   263.997
		detailScale     5401.32
		colorConversion true
		drivenDarkening 0
		seaLevel        0.198261
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  10
		icecapHeight    0.147142
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.93584
		venusFreq       0.952256
		venusMagn       0
		mareFreq        0.941831
		mareDensity     0.020496
		terraceProb     0.167782
		erosion         0
		montesMagn      0.0905107
		montesFreq      67.2878
		montesSpiky     0.838605
		montesFraction  0.452592
		dunesMagn       0.0541116
		dunesFreq       2825.16
		dunesFraction   0.42728
		hillsMagn       0.13028
		hillsFreq       262.047
		hillsFraction   0.449298
		hills2Fraction  0
		riversMagn      62.2353
		riversFreq      3.32178
		riversSin       4.57034
		riversOctaves   0
		canyonsMagn     0.47649
		canyonsFreq     0.66166
		canyonFraction  0.0975838
		cracksMagn      0.0574185
		cracksFreq      1.33727
		cracksOctaves   0
		craterMagn      0.631099
		craterFreq      6.64779
		craterDensity   0.688585
		craterOctaves   9.29586
		craterRayedFactor 0.119948
		volcanoMagn     0.342681
		volcanoFreq     0.688994
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.248164
		volcanoRadius   0.262928
		volcanoTemp     1532.19
		lavaCoverTidal  0
		lavaCoverSun    0.172135
		lavaCoverYoung  0
		colorSea       (0.420, 0.420, 0.430, 0.000)
		colorShelf     (0.470, 0.480, 0.480, 0.000)
		colorBeach     (0.239, 0.245, 0.257, 0.000)
		colorDesert    (0.208, 0.198, 0.197, 0.000)
		colorLowland   (0.265, 0.262, 0.239, 0.000)
		colorUpland    (0.282, 0.279, 0.261, 0.000)
		colorRock      (0.340, 0.340, 0.340, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999999
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
		Height          105
		Density         5.10071e-008
		Pressure        4.05156e-008
		Bright          0.551475
		Opacity         0
		SkyLight        0.183825
		Hue             0
		Saturation      1

		Composition
		{
			Xe    	84.5635
			Kr    	15.4365
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Extrasolar"
		SemiMajorAxis   0.00192529
		Period          0.00126546
		Eccentricity    0
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

// http://starwars.wikia.com/wiki/Morvolo
Planet	"Morvolo/Japrael System 4"
{
	ParentBody     "Prael"
	Class	       "IceWorld"

	Mass            3.34043
	Radius          2598.64
	InertiaMoment   0.331415

	Oblateness      0.0100122

	RotationPeriod  10.2464
	Obliquity       -48.9036
	EqAscendNode    -1.98068

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.612 0.606 0.601)

	Surface
	{
		SurfStyle       0.382588
		OceanStyle      0.0457619
		Randomize      (0.862, 0.596, 0.756)
		colorDistMagn   0.0487828
		colorDistFreq   940.187
		detailScale     20058.5
		colorConversion true
		seaLevel        0.128014
		snowLevel       2
		tropicLatitude  0.745435
		icecapLatitude  10
		icecapHeight    0.17249
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.31641
		venusFreq       1.26992
		venusMagn       0.394272
		mareFreq        1.51393
		mareDensity     0.200925
		terraceProb     0.222825
		erosion         0
		montesMagn      0.259693
		montesFreq      413.062
		montesSpiky     0.94273
		montesFraction  0.272617
		dunesMagn       0.0727169
		dunesFreq       60.6468
		dunesFraction   0.820256
		hillsMagn       0.130733
		hillsFreq       680.973
		hillsFraction   0
		hills2Fraction  0
		riversMagn      63.4484
		riversFreq      2.78587
		riversSin       6.70757
		riversOctaves   0
		canyonsMagn     0.0543674
		canyonsFreq     194.502
		canyonFraction  0
		cracksMagn      0.0817279
		cracksFreq      0.676497
		cracksOctaves   0
		craterMagn      0.831101
		craterFreq      24.1411
		craterDensity   0.213814
		craterOctaves   3.36063
		volcanoMagn     0.748469
		volcanoFreq     0.503518
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.608377
		volcanoRadius   0.472128
		volcanoTemp     1375.5
		lavaCoverTidal  0
		lavaCoverSun    0.00506774
		lavaCoverYoung  0.498557
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
		BumpHeight      13.3799
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.801728
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	NoAtmosphere

	Aurora
	{
		Height      205.537
		NorthLat    45.9891
		NorthLon    -0.13501
		NorthRadius 2315.25
		NorthWidth  859.412
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -14.5433
		SouthLon    161.698
		SouthRadius 1446.22
		SouthWidth  350.122
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
		SemiMajorAxis   11.559656
		Period          0.468756
		Eccentricity    0.0222701
		Inclination     0.709862
		AscendingNode   -4.94194
		ArgOfPericenter 17.7027
		MeanAnomaly     305.417
	}
}

Moon	"Japrael System 4.1"
{
	ParentBody     "Japrael System 4"
	Class	       "Selena"

	Mass            1.71351e-009
	Radius          8.74033
	InertiaMoment   0.399074

	Oblateness      0.249

	Obliquity       0.00168313
	EqAscendNode    101.24
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.490 0.486 0.482)

	Surface
	{
		SurfStyle       0.505336
		OceanStyle      0.404756
		Randomize      (0.437, -0.950, 0.272)
		colorDistMagn   0.176772
		colorDistFreq   0.0409538
		detailScale     238.669
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.438352
		terraceProb     0.465456
		erosion         0
		montesMagn      0.506409
		montesFreq      3.60263
		montesSpiky     0.825957
		montesFraction  0.718315
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.187232
		hillsFraction   0.860447
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247453
		craterFreq      0.232468
		craterDensity   0.731766
		craterOctaves   10.8943
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.404443
		volcanoTemp     1821.09
		lavaCoverTidal  0
		lavaCoverSun    0.00506774
		lavaCoverYoung  0
		colorSea       (0.191, 0.165, 0.135, 0.000)
		colorShelf     (0.196, 0.170, 0.154, 0.000)
		colorBeach     (0.230, 0.199, 0.183, 0.000)
		colorDesert    (0.250, 0.214, 0.178, 0.000)
		colorLowland   (0.275, 0.228, 0.202, 0.000)
		colorUpland    (0.304, 0.277, 0.246, 0.000)
		colorRock      (0.329, 0.301, 0.265, 0.000)
		colorSnow      (0.358, 0.321, 0.279, 1.000)
		BumpHeight      7.8663
		BumpOffset      1.57326
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
		SemiMajorAxis   0.000116681
		Period          0.000398824
		Eccentricity    8.28316e-005
		Inclination     0.00168313
		AscendingNode   101.24
		ArgOfPericenter 90.24
		MeanAnomaly     37.2191
	}
}

Moon	"Japrael System 4.2"
{
	ParentBody     "Japrael System 4"
	Class	       "Selena"

	Mass            2.41211e-009
	Radius          8.93997
	InertiaMoment   0.399984

	Oblateness      0.097863

	Obliquity       0.00384345
	EqAscendNode    130.256
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.457 0.450 0.446)

	Surface
	{
		SurfStyle       0.624876
		OceanStyle      0.670832
		Randomize      (0.280, 0.971, -0.698)
		colorDistMagn   0.772134
		colorDistFreq   0.0534689
		detailScale     244.121
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.411475
		terraceProb     0.175692
		erosion         0
		montesMagn      0.490754
		montesFreq      3.00489
		montesSpiky     0.949409
		montesFraction  0.308207
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.177549
		hillsFraction   0.512693
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202234
		craterFreq      0.227198
		craterDensity   0.843645
		craterOctaves   10.8943
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.487754
		volcanoTemp     1578.56
		lavaCoverTidal  0
		lavaCoverSun    0.00506774
		lavaCoverYoung  0
		colorSea       (0.178, 0.153, 0.125, 0.000)
		colorShelf     (0.183, 0.158, 0.143, 0.000)
		colorBeach     (0.215, 0.185, 0.169, 0.000)
		colorDesert    (0.233, 0.198, 0.165, 0.000)
		colorLowland   (0.256, 0.212, 0.187, 0.000)
		colorUpland    (0.283, 0.257, 0.227, 0.000)
		colorRock      (0.306, 0.279, 0.245, 0.000)
		colorSnow      (0.333, 0.297, 0.259, 1.000)
		BumpHeight      8.04598
		BumpOffset      1.6092
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
		SemiMajorAxis   0.000155468
		Period          0.000613394
		Eccentricity    5.02501e-005
		Inclination     0.00384345
		AscendingNode   130.256
		ArgOfPericenter 131.401
		MeanAnomaly     56.0337
	}
}

Moon	"Japrael System 4.3"
{
	ParentBody     "4Japrael System 4"
	Class	       "Selena"

	Mass            3.36559e-009
	Radius          12.5975
	InertiaMoment   0.398105

	Oblateness      0.0937689

	Obliquity       -0.000608094
	EqAscendNode    -127.522
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.665 0.660 0.655)

	Surface
	{
		SurfStyle       0.660395
		OceanStyle      0.661321
		Randomize      (0.184, 0.873, 0.470)
		colorDistMagn   0.662899
		colorDistFreq   0.116763
		detailScale     343.997
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.408771
		terraceProb     0.198846
		erosion         0
		montesMagn      0.482349
		montesFreq      2.73018
		montesSpiky     0.908598
		montesFraction  0.368497
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.360651
		hillsFraction   0.692287
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212755
		craterFreq      0.242781
		craterDensity   0.702547
		craterOctaves   11.8847
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51338
		volcanoTemp     1482.92
		lavaCoverTidal  0
		lavaCoverSun    0.00506774
		lavaCoverYoung  0
		colorSea       (0.259, 0.224, 0.183, 0.000)
		colorShelf     (0.266, 0.231, 0.210, 0.000)
		colorBeach     (0.313, 0.271, 0.249, 0.000)
		colorDesert    (0.339, 0.290, 0.242, 0.000)
		colorLowland   (0.373, 0.310, 0.275, 0.000)
		colorUpland    (0.412, 0.376, 0.334, 0.000)
		colorRock      (0.446, 0.409, 0.360, 0.000)
		colorSnow      (0.486, 0.436, 0.380, 1.000)
		BumpHeight      11.3378
		BumpOffset      2.26756
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
		SemiMajorAxis   0.000198397
		Period          0.000884262
		Eccentricity    1.30983e-005
		Inclination     -0.000608094
		AscendingNode   -127.522
		ArgOfPericenter -138.215
		MeanAnomaly     -146.989
	}
}

Moon	"Japrael System 4.4"
{
	ParentBody     "Japrael System 4"
	Class	       "Selena"

	Mass            0.00935588
	Radius          1404.88
	InertiaMoment   0.377039

	Oblateness      0.0046121

	Obliquity       0.850567
	EqAscendNode    -87.2715
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.472 0.466 0.460)

	Surface
	{
		SurfStyle       0.836701
		OceanStyle      0.169415
		Randomize      (0.325, -0.300, -0.364)
		colorDistMagn   0.0523795
		colorDistFreq   196.446
		detailScale     3613.43
		colorConversion true
		drivenDarkening 0
		seaLevel        0.179268
		snowLevel       2
		tropicLatitude  0.0214859
		icecapLatitude  10
		icecapHeight    0.149855
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.82042
		venusFreq       1.48265
		venusMagn       0
		mareFreq        0.735129
		mareDensity     0.00490625
		terraceProb     0.114475
		erosion         0
		montesMagn      0.0601511
		montesFreq      59.0277
		montesSpiky     0.949612
		montesFraction  0.139612
		dunesMagn       0.0248015
		dunesFreq       1857.45
		dunesFraction   0.582137
		hillsMagn       0.130759
		hillsFreq       167.82
		hillsFraction   0.453521
		hills2Fraction  0
		riversMagn      53.678
		riversFreq      3.27864
		riversSin       5.44108
		riversOctaves   0
		canyonsMagn     0.309818
		canyonsFreq     0.585295
		canyonFraction  0.506455
		cracksMagn      0.0416836
		cracksFreq      0.590025
		cracksOctaves   0
		craterMagn      0.596746
		craterFreq      5.30074
		craterDensity   0.714539
		craterOctaves   8.04636
		craterRayedFactor 0.0969405
		volcanoMagn     0.173684
		volcanoFreq     0.645027
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.0724882
		volcanoRadius   0.144794
		volcanoTemp     1251.77
		lavaCoverTidal  0.293279
		lavaCoverSun    0.00506774
		lavaCoverYoung  0
		colorSea       (0.400, 0.350, 0.320, 0.000)
		colorShelf     (0.470, 0.410, 0.380, 0.000)
		colorBeach     (0.264, 0.219, 0.193, 0.000)
		colorDesert    (0.241, 0.205, 0.170, 0.000)
		colorLowland   (0.184, 0.159, 0.129, 0.000)
		colorUpland    (0.312, 0.280, 0.239, 0.000)
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
		SemiMajorAxis   0.000418714
		Period          0.00270737
		Eccentricity    0.0226122
		Inclination     0.850567
		AscendingNode   -87.2715
		ArgOfPericenter 88.6327
		MeanAnomaly     -133.94
	}
}

DwarfMoon	"Japrael System 4.D5"
{
	ParentBody     "4"
	Class	       "Asteroid"

	Mass            8.79328e-009
	Radius          14.0659
	InertiaMoment   0.398292

	Obliquity       72.9653
	EqAscendNode    -10.0873
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.757 0.753 0.750)

	Surface
	{
		SurfStyle       0.239605
		OceanStyle      0.361817
		Randomize      (-0.278, 0.323, -0.434)
		colorDistMagn   0.0965095
		colorDistFreq   0.168137
		detailScale     384.093
		colorConversion true
		snowLevel       2
		tropicLatitude  0.580545
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.395955
		terraceProb     0.441805
		erosion         0
		montesMagn      0.366665
		montesFreq      3.09973
		montesSpiky     0.905776
		montesFraction  0.61709
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.588216
		hillsFraction   0.53481
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224938
		craterFreq      0.186162
		craterDensity   1.00502
		craterOctaves   11.8847
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.544044
		volcanoTemp     1680.77
		lavaCoverTidal  0
		lavaCoverSun    0.00506774
		lavaCoverYoung  0
		colorSea       (0.303, 0.301, 0.300, 0.000)
		colorShelf     (0.322, 0.320, 0.319, 0.000)
		colorBeach     (0.340, 0.339, 0.338, 0.000)
		colorDesert    (0.359, 0.358, 0.356, 0.000)
		colorLowland   (0.378, 0.377, 0.375, 0.000)
		colorUpland    (0.397, 0.395, 0.394, 0.000)
		colorRock      (0.416, 0.414, 0.413, 0.000)
		colorSnow      (0.435, 0.433, 0.431, 1.000)
		BumpHeight      12.6593
		BumpOffset      2.53186
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
		SemiMajorAxis   0.00176193
		Period          0.0234024
		Eccentricity    0.0294469
		Inclination     72.9653
		AscendingNode   -10.0873
		ArgOfPericenter -28.2107
		MeanAnomaly     -153.433
	}
}

// http://starwars.wikia.com/wiki/Mulchoop
Planet	"Mulchoop/Japrael System 5"
{
	ParentBody     "Prael"
	Class	       "GasGiant"

	Mass            16.7381
	Radius          23561.5
	InertiaMoment   0.287631

	Oblateness      0.0296969

	RotationPeriod  12.9012
	Obliquity       -59.7485
	EqAscendNode    -109.885

	AlbedoBond      0.491191
	AlbedoGeom      0.58943
	Brightness      2

	Surface
	{
		SurfStyle       0.0747453
		Randomize      (0.709, 0.278, 0.986)
		detailScale     60601.5
		colorConversion true
		tropicLatitude  0.855684
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0.877262
		stripeZones     2.6952
		stripeFluct     0.476364
		stripeTwist     11.2343
		cycloneMagn     20.8175
		cycloneFreq     1.0329
		cycloneDensity  0.362635
		cycloneOctaves  1
		colorLayer0    (0.280, 0.260, 0.250, 1.000)
		colorLayer1    (0.300, 0.280, 0.270, 1.000)
		colorLayer2    (0.360, 0.330, 0.320, 1.000)
		colorLayer3    (0.400, 0.370, 0.360, 1.000)
		colorLayer4    (0.440, 0.430, 0.420, 1.000)
		colorLayer5    (0.520, 0.470, 0.460, 1.000)
		colorLayer6    (0.640, 0.620, 0.590, 1.000)
		colorLayer7    (0.610, 0.590, 0.700, 1.000)
		colorLowPlants (0.440, 0.430, 0.420, 1.000)
		colorUpPlants  (0.520, 0.470, 0.460, 1.000)
		BumpHeight      18.0587
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          39.8145
		Velocity        1308.41
		BumpHeight      21.7556
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.65977
		mainOctaves     12
		Coverage        0.455957
		stripeZones     2.6952
		stripeFluct     0.476364
		stripeTwist     11.2343
	}

	Clouds
	{
		Height          61.5703
		Velocity        1396.23
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.777)
		mainFreq        0.65977
		mainOctaves     12
		Coverage        0.455957
		stripeZones     2.6952
		stripeFluct     0.476364
		stripeTwist     11.2343
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          235.615
		Density         628.271
		Pressure        116409
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0483945
		Saturation      0.962743

		Composition
		{
			H2    	92.7539
			He    	6.84848
			CH4   	0.322735
			N2    	0.0343968
			NH3   	0.0248623
			O2    	0.00779536
			C2H2  	0.0036706
			C2H4  	0.00141885
			Ne    	0.00111516
			Ar    	0.00076977
			C2H6  	0.000550338
			C3H8  	0.000314366
		}
	}

	Aurora
	{
		Height      733.537
		NorthLat    62.6868
		NorthLon    97.9019
		NorthRadius 6865.41
		NorthWidth  1748.49
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -74.658
		SouthLon    297.377
		SouthRadius 5325.65
		SouthWidth  1144.97
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
		SemiMajorAxis   14.97146
		Period          1.38023
		Eccentricity    0.0185608
		Inclination     -2.19715
		AscendingNode   -115.145
		ArgOfPericenter 90.9868
		MeanAnomaly     281.45
	}
}

DwarfMoon	"Japrael System 5.D1"
{
	ParentBody     "Japrael System 5"
	Class	       "Asteroid"

	Mass            3.86254e-007
	Radius          96.7951
	InertiaMoment   0.399478

	Oblateness      0.249

	Obliquity       0.00316768
	EqAscendNode    -97.3783
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.753 0.749 0.746)

	Surface
	{
		SurfStyle       0.836564
		OceanStyle      0.728187
		Randomize      (-0.769, -0.906, 0.076)
		colorDistMagn   0.376451
		colorDistFreq   7.31202
		detailScale     2643.15
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.538998
		terraceProb     0.325293
		erosion         0
		montesMagn      0.558996
		montesFreq      2.70011
		montesSpiky     0.934809
		montesFraction  0.445395
		dunesFraction   0
		hillsMagn       0
		hillsFreq       24.657
		hillsFraction   0.523627
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247091
		craterFreq      0.322078
		craterDensity   0.90628
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.422811
		volcanoTemp     1173.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.293, 0.255, 0.209, 0.000)
		colorShelf     (0.301, 0.262, 0.239, 0.000)
		colorBeach     (0.354, 0.307, 0.283, 0.000)
		colorDesert    (0.384, 0.330, 0.276, 0.000)
		colorLowland   (0.421, 0.352, 0.313, 0.000)
		colorUpland    (0.467, 0.427, 0.380, 0.000)
		colorRock      (0.504, 0.464, 0.410, 0.000)
		colorSnow      (0.549, 0.494, 0.433, 1.000)
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
		SemiMajorAxis   0.000378007
		Period          0.000875691
		Eccentricity    7.72895e-005
		Inclination     0.00316768
		AscendingNode   -97.3783
		ArgOfPericenter 33.199
		MeanAnomaly     66.1419
	}
}

DwarfMoon	"Japrael System 5.D2"
{
	ParentBody     "Japrael System 5"
	Class	       "Asteroid"

	Mass            5.42642e-007
	Radius          127.604
	InertiaMoment   0.397077

	Oblateness      0.249

	Obliquity       -0.0113054
	EqAscendNode    -90.1777
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.524 0.521 0.519)

	Surface
	{
		SurfStyle       0.782806
		OceanStyle      0.19591
		Randomize      (0.219, 0.023, -0.736)
		colorDistMagn   0.185536
		colorDistFreq   11.8352
		detailScale     3484.43
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.384933
		terraceProb     0.235959
		erosion         0
		montesMagn      0.529482
		montesFreq      3.12521
		montesSpiky     0.883864
		montesFraction  0.267264
		dunesFraction   0
		hillsMagn       0
		hillsFreq       24.2394
		hillsFraction   0.527998
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259692
		craterFreq      0.622598
		craterDensity   0.969583
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.542729
		volcanoTemp     1629.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.205, 0.177, 0.145, 0.000)
		colorShelf     (0.210, 0.182, 0.166, 0.000)
		colorBeach     (0.246, 0.214, 0.197, 0.000)
		colorDesert    (0.267, 0.229, 0.192, 0.000)
		colorLowland   (0.294, 0.245, 0.218, 0.000)
		colorUpland    (0.325, 0.297, 0.265, 0.000)
		colorRock      (0.351, 0.323, 0.286, 0.000)
		colorSnow      (0.383, 0.344, 0.301, 1.000)
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
		SemiMajorAxis   0.000466874
		Period          0.00120199
		Eccentricity    5.57532e-005
		Inclination     -0.0113054
		AscendingNode   -90.1777
		ArgOfPericenter 32.9733
		MeanAnomaly     104.278
	}
}

Moon	"Japrael System 5.1"
{
	ParentBody     "Japrael System 5"
	Class	       "Selena"

	Mass            0.00712104
	Radius          1581.6
	InertiaMoment   0.379807

	Oblateness      0.0148341

	Obliquity       1.05777
	EqAscendNode    -44.9136
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.661 0.533 0.406)

	Surface
	{
		SurfStyle       0.194472
		OceanStyle      0.873253
		Randomize      (-0.772, 0.953, 0.885)
		colorDistMagn   0.0935325
		colorDistFreq   170.577
		detailScale     4067.95
		colorConversion true
		drivenDarkening 0
		seaLevel        0.242479
		snowLevel       2
		tropicLatitude  0.0341171
		icecapLatitude  0.923292
		icecapHeight    0.248525
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.85425
		venusFreq       1.37375
		venusMagn       0
		mareFreq        0.660921
		mareDensity     0.00165334
		terraceProb     0.235832
		erosion         0
		montesMagn      0.0789873
		montesFreq      58.4665
		montesSpiky     0.954577
		montesFraction  0.699018
		dunesMagn       0.0474454
		dunesFreq       2096.03
		dunesFraction   0.950716
		hillsMagn       0.131395
		hillsFreq       220.874
		hillsFraction   0.417102
		hills2Fraction  0
		riversMagn      54.0102
		riversFreq      2.83651
		riversSin       6.32511
		riversOctaves   0
		canyonsMagn     0.537361
		canyonsFreq     0.600246
		canyonFraction  0.60696
		cracksMagn      0.0434636
		cracksFreq      0.716006
		cracksOctaves   0
		craterMagn      0.53164
		craterFreq      3.41458
		craterDensity   0.642202
		craterOctaves   8.5806
		craterRayedFactor 0.143859
		volcanoMagn     0.219701
		volcanoFreq     0.842679
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.176908
		volcanoRadius   0.174884
		volcanoTemp     1655.25
		lavaCoverTidal  0.244384
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.331, 0.266, 0.203, 0.000)
		colorDesert    (0.410, 0.320, 0.231, 0.200)
		colorLowland   (0.443, 0.341, 0.260, 0.500)
		colorUpland    (0.463, 0.357, 0.268, 0.800)
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
		SemiMajorAxis   0.000672496
		Period          0.00207763
		Eccentricity    0.00651303
		Inclination     1.05777
		AscendingNode   -44.9136
		ArgOfPericenter -54.5834
		MeanAnomaly     -12.7921
	}
}

Moon	"Japrael System 5.2"
{
	ParentBody     "Japrael System 5"
	Class	       "Desert"

	Mass            0.0860724
	Radius          3781.9
	InertiaMoment   0.335097

	Oblateness      0.00180322

	Obliquity       -0.701811
	EqAscendNode    82.572
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.730 0.728 0.723)

	Surface
	{
		SurfStyle       0.461778
		OceanStyle      0.339411
		Randomize      (0.338, -0.377, -0.471)
		colorDistMagn   0.0499289
		colorDistFreq   493.765
		detailScale     9727.25
		colorConversion true
		seaLevel        0.0684247
		snowLevel       2
		tropicLatitude  0.0184055
		icecapLatitude  0.875249
		icecapHeight    0.0748355
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.06284
		venusFreq       1.13692
		venusMagn       0
		mareFreq        1.80701
		mareDensity     0.0120478
		terraceProb     0.636458
		erosion         0
		montesMagn      0.195372
		montesFreq      221.774
		montesSpiky     0.952005
		montesFraction  0.212069
		dunesMagn       0.0546384
		dunesFreq       37.4737
		dunesFraction   0.0637196
		hillsMagn       0.157066
		hillsFreq       424.327
		hillsFraction   0
		hills2Fraction  0
		riversMagn      64.5677
		riversFreq      2.3895
		riversSin       4.99903
		riversOctaves   0
		canyonsMagn     0.0233646
		canyonsFreq     86.8481
		canyonFraction  0
		cracksMagn      0.0888486
		cracksFreq      0.213522
		cracksOctaves   0
		craterMagn      0.579368
		craterFreq      11.0468
		craterDensity   0.487353
		craterOctaves   6.63287
		volcanoMagn     0.700088
		volcanoFreq     0.815175
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.710687
		volcanoRadius   0.532725
		volcanoTemp     1400.84
		lavaCoverTidal  0.207996
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
		Hapke           0.790198
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
		Height          89.4054
		Density         0.0209802
		Pressure        0.00911753
		Greenhouse      1.57912
		Bright          7.31749
		Opacity         1
		SkyLight        2.43916
		Hue             0
		Saturation      1

		Composition
		{
			CH4   	99.9743
			N2    	0.0248738
			Ar    	0.000724794
			Ne    	0.000112393
			CO    	3.1463e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00133997
		Period          0.00583377
		Eccentricity    0.00756503
		Inclination     -0.701811
		AscendingNode   82.572
		ArgOfPericenter 76.8906
		MeanAnomaly     -140.912
	}
}

Moon	"Japrael System 5.3"
{
	ParentBody     "Japrael System 5"
	Class	       "IceWorld"

	Mass            0.0105373
	Radius          1798.58
	InertiaMoment   0.376462

	Obliquity       1.04314
	EqAscendNode    173.882
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.837 0.759 0.681)

	Surface
	{
		SurfStyle       0.499616
		OceanStyle      0.69622
		Randomize      (-0.514, 0.435, -0.763)
		colorDistMagn   0.0523795
		colorDistFreq   211.455
		detailScale     4626.04
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.180321
		snowLevel       2
		tropicLatitude  0.00195312
		icecapLatitude  0.718461
		icecapHeight    0.190951
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.8916
		venusFreq       0.247511
		venusMagn       0
		mareFreq        1.02114
		mareDensity     0.00193206
		terraceProb     0.193017
		erosion         0
		montesMagn      0.101324
		montesFreq      67.7635
		montesSpiky     0.861823
		montesFraction  0.632773
		dunesMagn       0.0266509
		dunesFreq       2368.96
		dunesFraction   0.437922
		hillsMagn       0.104844
		hillsFreq       201.324
		hillsFraction   0.674049
		hills2Fraction  0.210161
		riversMagn      60.3095
		riversFreq      3.0709
		riversSin       4.67204
		riversOctaves   0
		canyonsMagn     0.430057
		canyonsFreq     0.641211
		canyonFraction  0
		cracksMagn      0.062266
		cracksFreq      0.787955
		cracksOctaves   2
		craterMagn      0.577647
		craterFreq      5.55149
		craterDensity   0.978722
		craterOctaves   11
		craterRayedFactor 0.0743646
		volcanoMagn     0.281241
		volcanoFreq     0.691208
		volcanoDensity  0.218888
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.191741
		volcanoRadius   0.228582
		volcanoTemp     1057.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.190, 0.150, 0.000)
		colorShelf     (0.310, 0.235, 0.191, 0.000)
		colorBeach     (0.469, 0.357, 0.286, 0.200)
		colorDesert    (0.427, 0.334, 0.252, 0.500)
		colorLowland   (0.326, 0.258, 0.191, 0.800)
		colorUpland    (0.552, 0.455, 0.354, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.326, 0.258, 0.191, 0.800)
		colorUpPlants  (0.552, 0.455, 0.354, 1.000)
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
		SemiMajorAxis   0.00189146
		Period          0.00979936
		Eccentricity    0.0110365
		Inclination     1.04314
		AscendingNode   173.882
		ArgOfPericenter 19.0151
		MeanAnomaly     141.118
	}
}

Moon	"Japrael System 5.4"
{
	ParentBody     "Japrael System 5"
	Class	       "IceWorld"

	Mass            0.0131138
	Radius          2053.63
	InertiaMoment   0.371089

	Obliquity       -0.392445
	EqAscendNode    37.4067
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.747 0.645 0.558)

	Surface
	{
		SurfStyle       0.00633283
		OceanStyle      0.389249
		Randomize      (0.793, 0.771, 0.810)
		colorDistMagn   0.058107
		colorDistFreq   243.643
		detailScale     5282.06
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.167728
		snowLevel       2
		tropicLatitude  0.0129737
		icecapLatitude  0.550315
		icecapHeight    0.205894
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.6122
		venusFreq       0.835535
		venusMagn       0
		mareFreq        1.07148
		mareDensity     0.00313184
		terraceProb     0.196381
		erosion         0
		montesMagn      0.0971272
		montesFreq      112.881
		montesSpiky     0.783655
		montesFraction  0.792552
		dunesMagn       0.0431974
		dunesFreq       2679.27
		dunesFraction   0.761096
		hillsMagn       0.14063
		hillsFreq       221.735
		hillsFraction   0.403115
		hills2Fraction  0.245432
		riversMagn      64.1889
		riversFreq      4.28583
		riversSin       6.96346
		riversOctaves   0
		canyonsMagn     0.543233
		canyonsFreq     0.732878
		canyonFraction  0
		cracksMagn      0.0562791
		cracksFreq      1.28251
		cracksOctaves   1
		craterMagn      0.501519
		craterFreq      4.78576
		craterDensity   0.934818
		craterOctaves   11
		craterRayedFactor 0.136492
		volcanoMagn     0.334317
		volcanoFreq     0.6875
		volcanoDensity  0.187947
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.136082
		volcanoRadius   0.334113
		volcanoTemp     1245.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.747, 0.645, 0.558, 0.500)
		colorShelf     (0.709, 0.612, 0.530, 0.500)
		colorBeach     (0.523, 0.451, 0.390, 0.750)
		colorDesert    (0.635, 0.548, 0.474, 1.000)
		colorLowland   (0.657, 0.567, 0.491, 1.000)
		colorUpland    (0.694, 0.599, 0.519, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.657, 0.567, 0.491, 1.000)
		colorUpPlants  (0.694, 0.599, 0.519, 1.000)
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
		SemiMajorAxis   0.00266992
		Period          0.0164334
		Eccentricity    0.0180503
		Inclination     -0.392445
		AscendingNode   37.4067
		ArgOfPericenter 130.961
		MeanAnomaly     -41.6023
	}
}

Moon	"Japrael System 5.5"
{
	ParentBody     "Japrael System 5"
	Class	       "IceWorld"

	Mass            0.0166788
	Radius          2090.1
	InertiaMoment   0.365255

	Obliquity       -0.955044
	EqAscendNode    137.913
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.407 0.402 0.401)

	Surface
	{
		SurfStyle       0.483468
		OceanStyle      0.461264
		Randomize      (0.142, -0.717, 0.891)
		colorDistMagn   0.0465819
		colorDistFreq   234.521
		detailScale     5375.86
		colorConversion true
		drivenDarkening 0.564307
		seaLevel        0.215101
		snowLevel       2
		tropicLatitude  0.0119701
		icecapLatitude  0.9563
		icecapHeight    0.217474
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.99776
		venusFreq       0.474896
		venusMagn       0.21378
		mareFreq        1.19321
		mareDensity     0.00331646
		terraceProb     0.296445
		erosion         0
		montesMagn      0.141698
		montesFreq      110.195
		montesSpiky     0.859078
		montesFraction  0.768399
		dunesMagn       0.0392329
		dunesFreq       2726.6
		dunesFraction   0.149587
		hillsMagn       0.139504
		hillsFreq       261.645
		hillsFraction   0.977266
		hills2Fraction  0.204576
		riversMagn      63.8977
		riversFreq      2.36083
		riversSin       5.51718
		riversOctaves   0
		canyonsMagn     0.456927
		canyonsFreq     0.577903
		canyonFraction  0
		cracksMagn      0.0604334
		cracksFreq      0.413211
		cracksOctaves   2
		craterMagn      0.546056
		craterFreq      4.59085
		craterDensity   0.841141
		craterOctaves   11
		craterRayedFactor 0
		volcanoMagn     0.351442
		volcanoFreq     0.938527
		volcanoDensity  0.175811
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.315219
		volcanoRadius   0.327216
		volcanoTemp     1868.18
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.122, 0.100, 0.088, 0.000)
		colorShelf     (0.150, 0.125, 0.112, 0.000)
		colorBeach     (0.228, 0.189, 0.168, 0.200)
		colorDesert    (0.207, 0.177, 0.148, 0.500)
		colorLowland   (0.159, 0.137, 0.112, 0.800)
		colorUpland    (0.268, 0.241, 0.208, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.159, 0.137, 0.112, 0.800)
		colorUpPlants  (0.268, 0.241, 0.208, 1.000)
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
		SemiMajorAxis   0.00376878
		Period          0.027558
		Eccentricity    0.042738
		Inclination     -0.955044
		AscendingNode   137.913
		ArgOfPericenter -124.795
		MeanAnomaly     91.8836
	}
}

Moon	"Japrael System 5.6"
{
	ParentBody     "Japrael System 5"
	Class	       "IceWorld"

	Mass            0.0218552
	Radius          2426.64
	InertiaMoment   0.358454

	Obliquity       -0.454632
	EqAscendNode    162.17
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.691 0.499 0.376)

	Surface
	{
		SurfStyle       0.652289
		OceanStyle      0.0309337
		Randomize      (0.549, -0.297, -0.903)
		colorDistMagn   0.0422316
		colorDistFreq   297.177
		detailScale     6241.46
		colorConversion true
		drivenDarkening 0.399773
		seaLevel        0.216796
		snowLevel       2
		tropicLatitude  0.0024657
		icecapLatitude  0.621041
		icecapHeight    0.239591
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.88097
		venusFreq       0.669111
		venusMagn       0.163077
		mareFreq        1.19618
		mareDensity     0.0036081
		terraceProb     0.155699
		erosion         0
		montesMagn      0.15221
		montesFreq      98.2492
		montesSpiky     0.957692
		montesFraction  0.474515
		dunesMagn       0.0399079
		dunesFreq       3196.29
		dunesFraction   0.0739291
		hillsMagn       0.100318
		hillsFreq       298.185
		hillsFraction   0.130648
		hills2Fraction  0.257793
		riversMagn      62.1601
		riversFreq      3.99262
		riversSin       5.24158
		riversOctaves   0
		canyonsMagn     0.377358
		canyonsFreq     0.805407
		canyonFraction  0
		cracksMagn      0.0455125
		cracksFreq      1.52416
		cracksOctaves   1
		craterMagn      0.541169
		craterFreq      7.55956
		craterDensity   0.718981
		craterOctaves   12
		craterRayedFactor 0.144523
		volcanoMagn     0.406256
		volcanoFreq     0.692725
		volcanoDensity  0.224807
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.28197
		volcanoRadius   0.365573
		volcanoTemp     1683.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.442, 0.319, 0.252, 0.250)
		colorShelf     (0.484, 0.364, 0.285, 0.250)
		colorBeach     (0.394, 0.269, 0.218, 0.200)
		colorDesert    (0.366, 0.244, 0.192, 0.200)
		colorLowland   (0.269, 0.189, 0.158, 0.200)
		colorUpland    (0.511, 0.369, 0.285, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.269, 0.189, 0.158, 0.200)
		colorUpPlants  (0.511, 0.369, 0.285, 0.250)
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
		SemiMajorAxis   0.0053199
		Period          0.0462119
		Eccentricity    0.00829368
		Inclination     -0.454632
		AscendingNode   162.17
		ArgOfPericenter -13.5185
		MeanAnomaly     -28.2239
	}
}

Moon	"Japrael System 5.7"
{
	ParentBody     "Japrael System 5"
	Class	       "IceWorld"

	Mass            0.00012752
	Radius          417.863
	InertiaMoment   0.399839

	Obliquity       -1.22401
	EqAscendNode    99.8392
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.805 0.706 0.613)

	Surface
	{
		SurfStyle       0.973321
		OceanStyle      0.327277
		Randomize      (0.465, -0.524, 0.312)
		colorDistMagn   0.0574663
		colorDistFreq   55.2986
		detailScale     1074.77
		colorConversion true
		drivenDarkening 0.283212
		seaLevel        0.125663
		snowLevel       2
		tropicLatitude  0.0275041
		icecapLatitude  0.905986
		icecapHeight    0.128471
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.90473
		venusFreq       1.16128
		venusMagn       0
		mareFreq        0
		mareDensity     0.00013688
		terraceProb     0.304039
		erosion         0
		montesMagn      0.0468624
		montesFreq      17.6442
		montesSpiky     0.905122
		montesFraction  0.474514
		dunesMagn       0.0364102
		dunesFreq       561.862
		dunesFraction   0.947041
		hillsMagn       0.106184
		hillsFreq       48.8752
		hillsFraction   0.348385
		hills2Fraction  0.0540932
		riversMagn      64.8345
		riversFreq      3.41131
		riversSin       6.31503
		riversOctaves   0
		canyonsMagn     0.413301
		canyonsFreq     0.140598
		canyonFraction  0
		cracksMagn      0.062022
		cracksFreq      0.147107
		cracksOctaves   0
		craterMagn      0.603833
		craterFreq      1.48277
		craterDensity   0.923276
		craterOctaves   9
		craterRayedFactor 0.117912
		volcanoMagn     0.184118
		volcanoFreq     0.677894
		volcanoDensity  0.215232
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.282971
		volcanoRadius   0.140566
		volcanoTemp     1321.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.612, 0.501, 0.355, 1.000)
		colorShelf     (0.612, 0.501, 0.355, 1.000)
		colorBeach     (0.564, 0.438, 0.306, 1.000)
		colorDesert    (0.564, 0.438, 0.306, 1.000)
		colorLowland   (0.684, 0.572, 0.466, 1.000)
		colorUpland    (0.716, 0.628, 0.527, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.684, 0.572, 0.466, 1.000)
		colorUpPlants  (0.716, 0.628, 0.527, 1.000)
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
		SemiMajorAxis   0.00750941
		Period          0.0775367
		Eccentricity    0.00365481
		Inclination     -1.22401
		AscendingNode   99.8392
		ArgOfPericenter -31.5842
		MeanAnomaly     -119.102
	}
}

DwarfMoon	"Japrael System 5.D3"
{
	ParentBody     "Japrael System 5"
	Class	       "Asteroid"

	Mass            3.44914e-011
	Radius          5.38077
	InertiaMoment   0.399858

	RotationPeriod  9652.56
	Obliquity       82.6052
	EqAscendNode    158.373

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.804 0.757 0.736)

	Surface
	{
		SurfStyle       0.958848
		OceanStyle      0.752164
		Randomize      (-0.089, -0.617, -0.186)
		colorDistMagn   0.480013
		colorDistFreq   0.00843265
		detailScale     146.931
		colorConversion true
		snowLevel       2
		tropicLatitude  0.365613
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.599478
		terraceProb     0.504278
		erosion         0
		montesMagn      0.653848
		montesFreq      2.38756
		montesSpiky     0.946001
		montesFraction  0.601661
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0637092
		hillsFraction   0.696527
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244347
		craterFreq      0.279583
		craterDensity   0.899675
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46703
		volcanoTemp     1601.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.265, 0.294, 0.050)
		colorShelf     (0.321, 0.310, 0.339, 0.040)
		colorBeach     (0.370, 0.356, 0.383, 0.030)
		colorDesert    (0.418, 0.401, 0.434, 0.020)
		colorLowland   (0.466, 0.446, 0.478, 0.030)
		colorUpland    (0.514, 0.492, 0.522, 0.050)
		colorRock      (0.563, 0.537, 0.581, 0.020)
		colorSnow      (0.563, 0.537, 0.581, 1.000)
		BumpHeight      4.84269
		BumpOffset      0.968539
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
		SemiMajorAxis   0.0313281
		Period          0.660696
		Eccentricity    0.119011
		Inclination     82.6052
		AscendingNode   158.373
		ArgOfPericenter -50.6735
		MeanAnomaly     -46.1544
	}
}

DwarfMoon	"Japrael System 5.D4"
{
	ParentBody     "Japrael System 5"
	Class	       "Asteroid"

	Mass            6.16491e-011
	Radius          5.84697
	InertiaMoment   0.397899

	RotationPeriod  11922
	Obliquity       52.9017
	EqAscendNode    -178.521

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.579 0.573 0.570)

	Surface
	{
		SurfStyle       0.329947
		OceanStyle      0.999834
		Randomize      (0.100, -0.170, -0.776)
		colorDistMagn   0.386068
		colorDistFreq   0.0113839
		detailScale     159.661
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0205879
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.347191
		terraceProb     0.125297
		erosion         0
		montesMagn      0.545464
		montesFreq      3.12949
		montesSpiky     0.758189
		montesFraction  0.251151
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0454753
		hillsFraction   0.706265
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26697
		craterFreq      0.249196
		craterDensity   0.919737
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.558763
		volcanoTemp     1423.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.229, 0.228, 0.000)
		colorShelf     (0.246, 0.244, 0.242, 0.000)
		colorBeach     (0.261, 0.258, 0.257, 0.000)
		colorDesert    (0.275, 0.272, 0.271, 0.000)
		colorLowland   (0.290, 0.287, 0.285, 0.000)
		colorUpland    (0.304, 0.301, 0.299, 0.000)
		colorRock      (0.319, 0.315, 0.314, 0.000)
		colorSnow      (0.333, 0.330, 0.328, 1.000)
		BumpHeight      5.26227
		BumpOffset      1.05245
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
		SemiMajorAxis   0.0319364
		Period          0.680031
		Eccentricity    0.297715
		Inclination     52.9017
		AscendingNode   -178.521
		ArgOfPericenter 106.119
		MeanAnomaly     -39.0323
	}
}

DwarfMoon	"Japrael System 5.D5"
{
	ParentBody     "Japrael System 5"
	Class	       "Asteroid"

	Mass            1.04042e-010
	Radius          6.6537
	InertiaMoment   0.399074

	RotationPeriod  4013.65
	Obliquity       -72.0556
	EqAscendNode    -113.595

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.801 0.703 0.636)

	Surface
	{
		SurfStyle       0.45259
		OceanStyle      0.232685
		Randomize      (0.396, -0.029, 0.886)
		colorDistMagn   0.479408
		colorDistFreq   0.018494
		detailScale     181.69
		colorConversion true
		snowLevel       2
		tropicLatitude  0.889362
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.590254
		terraceProb     0.351975
		erosion         0
		montesMagn      0.586571
		montesFreq      2.2861
		montesSpiky     0.949295
		montesFraction  0.562122
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.105485
		hillsFraction   0.622951
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229837
		craterFreq      0.163864
		craterDensity   0.925668
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.547144
		volcanoTemp     1736.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.321, 0.281, 0.254, 0.000)
		colorShelf     (0.341, 0.299, 0.270, 0.000)
		colorBeach     (0.361, 0.317, 0.286, 0.000)
		colorDesert    (0.381, 0.334, 0.302, 0.000)
		colorLowland   (0.401, 0.352, 0.318, 0.000)
		colorUpland    (0.421, 0.369, 0.334, 0.000)
		colorRock      (0.441, 0.387, 0.350, 0.000)
		colorSnow      (0.461, 0.404, 0.365, 1.000)
		BumpHeight      5.98833
		BumpOffset      1.19767
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
		SemiMajorAxis   0.0321484
		Period          0.686814
		Eccentricity    0.434029
		Inclination     -72.0556
		AscendingNode   -113.595
		ArgOfPericenter 112.525
		MeanAnomaly     35.4923
	}
}

DwarfMoon	"Japrael System 5.D6"
{
	ParentBody     "Japrael System 5"
	Class	       "Asteroid"

	Mass            1.68121e-010
	Radius          7.49563
	InertiaMoment   0.399983

	RotationPeriod  3437.39
	Obliquity       -39.9222
	EqAscendNode    151.862

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.706 0.705 0.703)

	Surface
	{
		SurfStyle       0.296206
		OceanStyle      0.00351889
		Randomize      (-0.532, -0.628, -0.352)
		colorDistMagn   0.740442
		colorDistFreq   0.0239752
		detailScale     204.681
		colorConversion true
		snowLevel       2
		tropicLatitude  0.308294
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.553631
		terraceProb     0.346386
		erosion         0
		montesMagn      0.55752
		montesFreq      3.46462
		montesSpiky     0.93824
		montesFraction  0.248855
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.128925
		hillsFraction   0.848904
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211993
		craterFreq      0.220262
		craterDensity   0.826597
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.427933
		volcanoTemp     1624.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.282, 0.281, 0.000)
		colorShelf     (0.300, 0.300, 0.299, 0.000)
		colorBeach     (0.318, 0.317, 0.316, 0.000)
		colorDesert    (0.336, 0.335, 0.334, 0.000)
		colorLowland   (0.353, 0.352, 0.352, 0.000)
		colorUpland    (0.371, 0.370, 0.369, 0.000)
		colorRock      (0.388, 0.388, 0.387, 0.000)
		colorSnow      (0.406, 0.405, 0.404, 1.000)
		BumpHeight      6.74607
		BumpOffset      1.34921
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
		SemiMajorAxis   0.0327186
		Period          0.705168
		Eccentricity    0.470812
		Inclination     -39.9337
		AscendingNode   151.855
		ArgOfPericenter 46.1884
		MeanAnomaly     17.0483
	}
}

DwarfMoon	"Japrael System 5.D7"
{
	ParentBody     "Japrael System 5"
	Class	       "Asteroid"

	Mass            2.62614e-010
	Radius          7.84263
	InertiaMoment   0.398104

	RotationPeriod  2184.12
	Obliquity       83.0537
	EqAscendNode    144.192

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.558 0.495 0.441)

	Surface
	{
		SurfStyle       0.0864202
		OceanStyle      0.816096
		Randomize      (0.669, 0.550, -0.145)
		colorDistMagn   0.606349
		colorDistFreq   0.0467676
		detailScale     214.156
		colorConversion true
		snowLevel       2
		tropicLatitude  0.578251
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.37386
		terraceProb     0.378226
		erosion         0
		montesMagn      0.492999
		montesFreq      3.13297
		montesSpiky     0.946638
		montesFraction  0.729627
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.124952
		hillsFraction   0.708049
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258959
		craterFreq      0.263026
		craterDensity   0.940904
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.555974
		volcanoTemp     1555.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.198, 0.176, 0.000)
		colorShelf     (0.237, 0.211, 0.187, 0.000)
		colorBeach     (0.251, 0.223, 0.199, 0.000)
		colorDesert    (0.265, 0.235, 0.210, 0.000)
		colorLowland   (0.279, 0.248, 0.221, 0.000)
		colorUpland    (0.293, 0.260, 0.232, 0.000)
		colorRock      (0.307, 0.273, 0.243, 0.000)
		colorSnow      (0.321, 0.285, 0.254, 1.000)
		BumpHeight      7.05837
		BumpOffset      1.41167
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
		SemiMajorAxis   0.0330735
		Period          0.716672
		Eccentricity    0.277651
		Inclination     82.6146
		AscendingNode   144.388
		ArgOfPericenter 23.4364
		MeanAnomaly     178.052
	}
}

DwarfMoon	"Japrael System 5.D8"
{
	ParentBody     "Japrael System 5"
	Class	       "Asteroid"

	Mass            3.99264e-010
	Radius          10.9879
	InertiaMoment   0.399211

	RotationPeriod  2564.13
	Obliquity       -68.2273
	EqAscendNode    137.527

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.574 0.568 0.564)

	Surface
	{
		SurfStyle       0.345539
		OceanStyle      0.463504
		Randomize      (0.508, 0.859, -0.712)
		colorDistMagn   0.371102
		colorDistFreq   0.0835746
		detailScale     300.044
		colorConversion true
		snowLevel       2
		tropicLatitude  0.633563
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.374904
		terraceProb     0.182181
		erosion         0
		montesMagn      0.355341
		montesFreq      2.61314
		montesSpiky     0.936861
		montesFraction  0.577821
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.327005
		hillsFraction   0.528416
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249623
		craterFreq      0.244711
		craterDensity   0.964276
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.486695
		volcanoTemp     1466.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.227, 0.226, 0.000)
		colorShelf     (0.244, 0.241, 0.240, 0.000)
		colorBeach     (0.258, 0.255, 0.254, 0.000)
		colorDesert    (0.273, 0.270, 0.268, 0.000)
		colorLowland   (0.287, 0.284, 0.282, 0.000)
		colorUpland    (0.301, 0.298, 0.296, 0.000)
		colorRock      (0.316, 0.312, 0.310, 0.000)
		colorSnow      (0.330, 0.326, 0.324, 1.000)
		BumpHeight      9.88913
		BumpOffset      1.97783
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
		SemiMajorAxis   0.033346
		Period          0.725548
		Eccentricity    0.247397
		Inclination     -68.6845
		AscendingNode   137.599
		ArgOfPericenter -54.2697
		MeanAnomaly     123.93
	}
}

DwarfMoon	"Japrael System 5.D9"
{
	ParentBody     "Japrael System 5"
	Class	       "Asteroid"

	Mass            5.93825e-010
	Radius          11.9591
	InertiaMoment   0.395955

	RotationPeriod  1981.82
	Obliquity       49.8181
	EqAscendNode    -98.7746

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.743 0.692 0.635)

	Surface
	{
		SurfStyle       0.195411
		OceanStyle      0.118287
		Randomize      (0.830, 0.338, -0.301)
		colorDistMagn   0.0544651
		colorDistFreq   0.0985111
		detailScale     326.564
		colorConversion true
		snowLevel       2
		tropicLatitude  0.86333
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.456779
		terraceProb     0.264337
		erosion         0
		montesMagn      0.434958
		montesFreq      3.04893
		montesSpiky     0.872028
		montesFraction  0.376968
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.330962
		hillsFraction   0.712398
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216421
		craterFreq      0.198221
		craterDensity   0.897657
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.529429
		volcanoTemp     1787.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.277, 0.254, 0.000)
		colorShelf     (0.316, 0.294, 0.270, 0.000)
		colorBeach     (0.334, 0.311, 0.286, 0.000)
		colorDesert    (0.353, 0.328, 0.302, 0.000)
		colorLowland   (0.371, 0.346, 0.318, 0.000)
		colorUpland    (0.390, 0.363, 0.333, 0.000)
		colorRock      (0.408, 0.380, 0.349, 0.000)
		colorSnow      (0.427, 0.398, 0.365, 1.000)
		BumpHeight      10.7632
		BumpOffset      2.15265
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
		SemiMajorAxis   0.0336529
		Period          0.735586
		Eccentricity    0.102857
		Inclination     49.5279
		AscendingNode   -98.4938
		ArgOfPericenter 154.073
		MeanAnomaly     138.283
	}
}

DwarfMoon	"Japrael System 5.D10"
{
	ParentBody     "Japrael System 5"
	Class	       "Asteroid"

	Mass            8.67386e-010
	Radius          13.0329
	InertiaMoment   0.398292

	RotationPeriod  1576.57
	Obliquity       -21.2951
	EqAscendNode    -8.26268

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.803 0.770 0.738)

	Surface
	{
		SurfStyle       0.984026
		OceanStyle      0.103094
		Randomize      (0.077, -0.904, -0.173)
		colorDistMagn   0.404391
		colorDistFreq   0.11237
		detailScale     355.886
		colorConversion true
		snowLevel       2
		tropicLatitude  0.653063
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.552445
		terraceProb     0.395903
		erosion         0
		montesMagn      0.463419
		montesFreq      2.49488
		montesSpiky     0.916377
		montesFraction  0.672788
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.308408
		hillsFraction   0.666706
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249511
		craterFreq      0.192271
		craterDensity   0.925543
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.440565
		volcanoTemp     1494.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.269, 0.295, 0.050)
		colorShelf     (0.321, 0.316, 0.340, 0.040)
		colorBeach     (0.369, 0.362, 0.384, 0.030)
		colorDesert    (0.417, 0.408, 0.436, 0.020)
		colorLowland   (0.466, 0.454, 0.480, 0.030)
		colorUpland    (0.514, 0.500, 0.524, 0.050)
		colorRock      (0.562, 0.547, 0.583, 0.020)
		colorSnow      (0.562, 0.547, 0.583, 1.000)
		BumpHeight      11.7296
		BumpOffset      2.34593
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
		SemiMajorAxis   0.0342219
		Period          0.75432
		Eccentricity    0.0091283
		Inclination     -19.5916
		AscendingNode   -8.37612
		ArgOfPericenter -113.451
		MeanAnomaly     -95.0318
	}
}

DwarfMoon	"Japrael System 5.D11"
{
	ParentBody     "Japrael System 5"
	Class	       "Asteroid"

	Mass            1.24813e-009
	Radius          13.7916
	InertiaMoment   0.399344

	RotationPeriod  1266.63
	Obliquity       -80.8853
	EqAscendNode    -115.932

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.828 0.766 0.726)

	Surface
	{
		SurfStyle       0.572402
		OceanStyle      0.815348
		Randomize      (0.650, 0.509, -0.194)
		colorDistMagn   0.978892
		colorDistFreq   0.076552
		detailScale     376.603
		colorConversion true
		snowLevel       2
		tropicLatitude  0.898706
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.438598
		terraceProb     0.320509
		erosion         0
		montesMagn      0.520927
		montesFreq      2.74781
		montesSpiky     0.955811
		montesFraction  0.809387
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.431064
		hillsFraction   0.593674
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225964
		craterFreq      0.254458
		craterDensity   0.873606
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496527
		volcanoTemp     1221.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.323, 0.260, 0.203, 0.000)
		colorShelf     (0.331, 0.268, 0.232, 0.000)
		colorBeach     (0.389, 0.314, 0.276, 0.000)
		colorDesert    (0.422, 0.337, 0.269, 0.000)
		colorLowland   (0.464, 0.360, 0.305, 0.000)
		colorUpland    (0.514, 0.436, 0.370, 0.000)
		colorRock      (0.555, 0.475, 0.399, 0.000)
		colorSnow      (0.605, 0.505, 0.421, 1.000)
		BumpHeight      12.4125
		BumpOffset      2.48249
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
		SemiMajorAxis   0.0347921
		Period          0.773251
		Eccentricity    0.226919
		Inclination     -80.0916
		AscendingNode   -115.015
		ArgOfPericenter 144.967
		MeanAnomaly     -163.695
	}
}

DwarfMoon	"Japrael System 5.D12"
{
	ParentBody     "Japrael System 5"
	Class	       "Asteroid"

	Mass            1.7737e-009
	Radius          18.2271
	InertiaMoment   0.39664

	RotationPeriod  1355.96
	Obliquity       11.2714
	EqAscendNode    -171.726

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.799 0.797 0.796)

	Surface
	{
		SurfStyle       0.844844
		OceanStyle      0.979876
		Randomize      (0.715, -0.451, 0.564)
		colorDistMagn   0.565765
		colorDistFreq   0.0761279
		detailScale     497.723
		colorConversion true
		snowLevel       2
		tropicLatitude  0.329971
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.393069
		terraceProb     0.179976
		erosion         0
		montesMagn      0.587104
		montesFreq      3.03868
		montesSpiky     0.916294
		montesFraction  0.557366
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.614999
		hillsFraction   0.655898
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24957
		craterFreq      0.231802
		craterDensity   0.866393
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496725
		volcanoTemp     1397.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.271, 0.223, 0.000)
		colorShelf     (0.320, 0.279, 0.255, 0.000)
		colorBeach     (0.376, 0.327, 0.302, 0.000)
		colorDesert    (0.408, 0.351, 0.294, 0.000)
		colorLowland   (0.448, 0.375, 0.334, 0.000)
		colorUpland    (0.496, 0.454, 0.406, 0.000)
		colorRock      (0.536, 0.494, 0.438, 0.000)
		colorSnow      (0.584, 0.526, 0.462, 1.000)
		BumpHeight      16.4044
		BumpOffset      3.28089
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
		SemiMajorAxis   0.0354115
		Period          0.793994
		Eccentricity    0.172119
		Inclination     30.3423
		AscendingNode   -171.347
		ArgOfPericenter 13.9991
		MeanAnomaly     -96.2279
	}
}

DwarfMoon	"Japrael System 5.D13"
{
	ParentBody     "Japrael System 5"
	Class	       "Asteroid"

	Mass            2.49445e-009
	Radius          19.4094
	InertiaMoment   0.398465

	RotationPeriod  1180.31
	Obliquity       -22.8213
	EqAscendNode    -80.1504

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.623 0.619 0.614)

	Surface
	{
		SurfStyle       0.369762
		OceanStyle      0.400698
		Randomize      (-0.210, 0.060, -0.764)
		colorDistMagn   0.0303662
		colorDistFreq   0.186712
		detailScale     530.007
		colorConversion true
		snowLevel       2
		tropicLatitude  0.626971
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.38881
		terraceProb     0.471673
		erosion         0
		montesMagn      0.44268
		montesFreq      3.14445
		montesSpiky     0.844532
		montesFraction  0.471232
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.32038
		hillsFraction   0.361001
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232038
		craterFreq      0.254153
		craterDensity   0.771375
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495812
		volcanoTemp     1316.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.248, 0.246, 0.000)
		colorShelf     (0.265, 0.263, 0.261, 0.000)
		colorBeach     (0.280, 0.279, 0.276, 0.000)
		colorDesert    (0.296, 0.294, 0.292, 0.000)
		colorLowland   (0.312, 0.310, 0.307, 0.000)
		colorUpland    (0.327, 0.325, 0.322, 0.000)
		colorRock      (0.343, 0.341, 0.338, 0.000)
		colorSnow      (0.358, 0.356, 0.353, 1.000)
		BumpHeight      17.4685
		BumpOffset      3.4937
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
		SemiMajorAxis   0.03562
		Period          0.801015
		Eccentricity    0.381623
		Inclination     -28.0986
		AscendingNode   -79.2605
		ArgOfPericenter 112.821
		MeanAnomaly     -68.7837
	}
}

DwarfMoon	"Japrael System 5.D14"
{
	ParentBody     "Japrael System 5"
	Class	       "Asteroid"

	Mass            3.47772e-009
	Radius          20.8287
	InertiaMoment   0.399475

	RotationPeriod  1035.37
	Obliquity       82.6603
	EqAscendNode    25.1991

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.620 0.476 0.391)

	Surface
	{
		SurfStyle       0.298738
		OceanStyle      0.584892
		Randomize      (0.572, -0.930, 0.184)
		colorDistMagn   0.756139
		colorDistFreq   0.374576
		detailScale     568.761
		colorConversion true
		snowLevel       2
		tropicLatitude  0.57129
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.451162
		terraceProb     0.21243
		erosion         0
		montesMagn      0.620643
		montesFreq      3.19801
		montesSpiky     0.987655
		montesFraction  0.559524
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.12361
		hillsFraction   0.608956
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241108
		craterFreq      0.226429
		craterDensity   0.967296
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516833
		volcanoTemp     1976.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.190, 0.156, 0.000)
		colorShelf     (0.264, 0.202, 0.166, 0.000)
		colorBeach     (0.279, 0.214, 0.176, 0.000)
		colorDesert    (0.295, 0.226, 0.186, 0.000)
		colorLowland   (0.310, 0.238, 0.195, 0.000)
		colorUpland    (0.326, 0.250, 0.205, 0.000)
		colorRock      (0.341, 0.262, 0.215, 0.000)
		colorSnow      (0.357, 0.274, 0.225, 1.000)
		BumpHeight      18.7458
		BumpOffset      3.74916
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
		SemiMajorAxis   0.0360234
		Period          0.81466
		Eccentricity    0.385395
		Inclination     71.7118
		AscendingNode   23.9189
		ArgOfPericenter -140.745
		MeanAnomaly     -89.4479
	}
}

DwarfMoon	"Japrael System 5.D15"
{
	ParentBody     "Japrael System 5"
	Class	       "Asteroid"

	Mass            4.81376e-009
	Radius          21.9789
	InertiaMoment   0.397069

	RotationPeriod  898.061
	Obliquity       67.983
	EqAscendNode    152.417

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.801 0.706 0.674)

	Surface
	{
		SurfStyle       0.496961
		OceanStyle      0.81736
		Randomize      (0.820, 0.359, 0.259)
		colorDistMagn   0.338095
		colorDistFreq   0.309677
		detailScale     600.17
		colorConversion true
		snowLevel       2
		tropicLatitude  0.488947
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.658789
		terraceProb     0.313214
		erosion         0
		montesMagn      0.464204
		montesFreq      3.40325
		montesSpiky     0.93891
		montesFraction  0.300479
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.212
		hillsFraction   0.677271
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.261507
		craterFreq      0.248735
		craterDensity   0.743731
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515203
		volcanoTemp     1061.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.321, 0.282, 0.270, 0.000)
		colorShelf     (0.341, 0.300, 0.286, 0.000)
		colorBeach     (0.361, 0.318, 0.303, 0.000)
		colorDesert    (0.381, 0.335, 0.320, 0.000)
		colorLowland   (0.401, 0.353, 0.337, 0.000)
		colorUpland    (0.421, 0.371, 0.354, 0.000)
		colorRock      (0.441, 0.388, 0.371, 0.000)
		colorSnow      (0.461, 0.406, 0.388, 1.000)
		BumpHeight      19.781
		BumpOffset      3.9562
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
		SemiMajorAxis   0.0364402
		Period          0.828841
		Eccentricity    0.484794
		Inclination     78.6043
		AscendingNode   151.444
		ArgOfPericenter 66.4083
		MeanAnomaly     -20.0338
	}
}

DwarfMoon	"Japrael System 5.D16"
{
	ParentBody     "Japrael System 5"
	Class	       "Asteroid"

	Mass            6.62388e-009
	Radius          28.5714
	InertiaMoment   0.398628

	RotationPeriod  982.104
	Obliquity       -78.3809
	EqAscendNode    -112.19

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.751 0.689 0.640)

	Surface
	{
		SurfStyle       0.944017
		OceanStyle      0.71166
		Randomize      (-0.327, -0.011, -0.752)
		colorDistMagn   0.035207
		colorDistFreq   0.367931
		detailScale     780.19
		colorConversion true
		snowLevel       2
		tropicLatitude  0.895587
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.72838
		terraceProb     0.187362
		erosion         0
		montesMagn      0.689921
		montesFreq      2.71759
		montesSpiky     0.980615
		montesFraction  0.175703
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.03023
		hillsFraction   0.651557
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239592
		craterFreq      0.227323
		craterDensity   0.911658
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53187
		volcanoTemp     1646.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.241, 0.256, 0.050)
		colorShelf     (0.300, 0.282, 0.295, 0.040)
		colorBeach     (0.345, 0.324, 0.333, 0.030)
		colorDesert    (0.391, 0.365, 0.378, 0.020)
		colorLowland   (0.436, 0.407, 0.416, 0.030)
		colorUpland    (0.481, 0.448, 0.455, 0.050)
		colorRock      (0.526, 0.489, 0.506, 0.020)
		colorSnow      (0.526, 0.489, 0.506, 1.000)
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
		SemiMajorAxis   0.036966
		Period          0.846846
		Eccentricity    0.437141
		Inclination     -73.0195
		AscendingNode   -114.337
		ArgOfPericenter 71.8134
		MeanAnomaly     64.6204
	}
}

DwarfMoon	"Japrael System 5.D17"
{
	ParentBody     "Japrael System 5"
	Class	       "Asteroid"

	Mass            9.07157e-009
	Radius          30.0284
	InertiaMoment   0.399603

	RotationPeriod  860.429
	Obliquity       -8.23533
	EqAscendNode    68.6694

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.455 0.453 0.450)

	Surface
	{
		SurfStyle       0.423243
		OceanStyle      0.473797
		Randomize      (-0.260, -0.448, -0.055)
		colorDistMagn   0.894539
		colorDistFreq   0.398281
		detailScale     819.975
		colorConversion true
		snowLevel       2
		tropicLatitude  0.179191
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.503298
		terraceProb     0.213059
		erosion         0
		montesMagn      0.52021
		montesFreq      3.05618
		montesSpiky     0.958397
		montesFraction  0.229171
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.23537
		hillsFraction   0.79424
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.283393
		craterFreq      0.274684
		craterDensity   0.926954
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484682
		volcanoTemp     1233.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.181, 0.180, 0.000)
		colorShelf     (0.194, 0.193, 0.191, 0.000)
		colorBeach     (0.205, 0.204, 0.202, 0.000)
		colorDesert    (0.216, 0.215, 0.214, 0.000)
		colorLowland   (0.228, 0.227, 0.225, 0.000)
		colorUpland    (0.239, 0.238, 0.236, 0.000)
		colorRock      (0.250, 0.249, 0.247, 0.000)
		colorSnow      (0.262, 0.261, 0.259, 1.000)
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
		SemiMajorAxis   0.0375402
		Period          0.866652
		Eccentricity    0.0465414
		Inclination     9.87594
		AscendingNode   69.0308
		ArgOfPericenter -160.929
		MeanAnomaly     -100.145
	}
}

DwarfMoon	"Japrael System 5.D18"
{
	ParentBody     "Japrael System 5"
	Class	       "Asteroid"

	Mass            1.2378e-008
	Radius          31.9863
	InertiaMoment   0.397394

	RotationPeriod  767.329
	Obliquity       -54.0413
	EqAscendNode    -71.0925

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.624 0.543 0.426)

	Surface
	{
		SurfStyle       0.754043
		OceanStyle      0.145945
		Randomize      (-0.404, -0.160, -0.582)
		colorDistMagn   0.78117
		colorDistFreq   0.478619
		detailScale     873.438
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997451
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.650389
		terraceProb     0.599028
		erosion         0
		montesMagn      0.538439
		montesFreq      2.82531
		montesSpiky     0.96052
		montesFraction  0.26718
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.01533
		hillsFraction   0.655444
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248755
		craterFreq      0.222123
		craterDensity   0.79783
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494571
		volcanoTemp     1324.25
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.185, 0.119, 0.000)
		colorShelf     (0.250, 0.190, 0.136, 0.000)
		colorBeach     (0.293, 0.223, 0.162, 0.000)
		colorDesert    (0.318, 0.239, 0.158, 0.000)
		colorLowland   (0.350, 0.255, 0.179, 0.000)
		colorUpland    (0.387, 0.310, 0.217, 0.000)
		colorRock      (0.418, 0.337, 0.234, 0.000)
		colorSnow      (0.456, 0.359, 0.247, 1.000)
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
		SemiMajorAxis   0.0381492
		Period          0.887827
		Eccentricity    0.160953
		Inclination     -60.8997
		AscendingNode   -72.3683
		ArgOfPericenter -168.012
		MeanAnomaly     156.891
	}
}

DwarfMoon	"Japrael System 5.D19"
{
	ParentBody     "Japrael System 5"
	Class	       "Asteroid"

	Mass            1.68439e-008
	Radius          33.7467
	InertiaMoment   0.398782

	RotationPeriod  688.683
	Obliquity       50.3801
	EqAscendNode    64.7463

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.687 0.598 0.441)

	Surface
	{
		SurfStyle       0.0652213
		OceanStyle      0.668324
		Randomize      (-0.028, -0.712, -0.851)
		colorDistMagn   0.463894
		colorDistFreq   0.15013
		detailScale     921.51
		colorConversion true
		snowLevel       2
		tropicLatitude  0.935374
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.407968
		terraceProb     0.242507
		erosion         0
		montesMagn      0.416434
		montesFreq      2.51289
		montesSpiky     0.975352
		montesFraction  0.273243
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.27521
		hillsFraction   0.523409
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246784
		craterFreq      0.265726
		craterDensity   0.902272
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455454
		volcanoTemp     1482.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.275, 0.239, 0.176, 0.000)
		colorShelf     (0.292, 0.254, 0.188, 0.000)
		colorBeach     (0.309, 0.269, 0.199, 0.000)
		colorDesert    (0.326, 0.284, 0.210, 0.000)
		colorLowland   (0.343, 0.299, 0.221, 0.000)
		colorUpland    (0.361, 0.314, 0.232, 0.000)
		colorRock      (0.378, 0.329, 0.243, 0.000)
		colorSnow      (0.395, 0.344, 0.254, 1.000)
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
		SemiMajorAxis   0.038527
		Period          0.901047
		Eccentricity    0.0755084
		Inclination     34.7571
		AscendingNode   67.1888
		ArgOfPericenter 101.222
		MeanAnomaly     -8.96601
	}
}

DwarfMoon	"Japrael System 5.D20"
{
	ParentBody     "Japrael System 5"
	Class	       "Asteroid"

	Mass            2.288e-008
	Radius          43.7159
	InertiaMoment   0.39973

	RotationPeriod  758.438
	Obliquity       106.02
	EqAscendNode    -176.152

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.455 0.453 0.450)

	Surface
	{
		SurfStyle       0.708007
		OceanStyle      0.349267
		Randomize      (-0.304, -0.919, 0.286)
		colorDistMagn   0.878178
		colorDistFreq   1.53239
		detailScale     1193.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0.395721
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.488584
		terraceProb     0.46356
		erosion         0
		montesMagn      0.528242
		montesFreq      3.33999
		montesSpiky     0.914789
		montesFraction  0.337657
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.52126
		hillsFraction   0.596744
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248285
		craterFreq      0.233096
		craterDensity   0.754729
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506322
		volcanoTemp     1928.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.154, 0.126, 0.000)
		colorShelf     (0.182, 0.158, 0.144, 0.000)
		colorBeach     (0.214, 0.186, 0.171, 0.000)
		colorDesert    (0.232, 0.199, 0.166, 0.000)
		colorLowland   (0.255, 0.213, 0.189, 0.000)
		colorUpland    (0.282, 0.258, 0.229, 0.000)
		colorRock      (0.305, 0.281, 0.247, 0.000)
		colorSnow      (0.332, 0.299, 0.261, 1.000)
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
		SemiMajorAxis   0.0390181
		Period          0.918333
		Eccentricity    0.342085
		Inclination     82.7616
		AscendingNode   -178.417
		ArgOfPericenter 23.4163
		MeanAnomaly     12.3782
	}
}

DwarfMoon	"Japrael System 5.D21"
{
	ParentBody     "Japrael System 5"
	Class	       "Asteroid"

	Mass            3.10507e-008
	Radius          45.5386
	InertiaMoment   0.397662

	RotationPeriod  670.319
	Obliquity       45.2275
	EqAscendNode    118.458

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.453 0.451 0.448)

	Surface
	{
		SurfStyle       0.467507
		OceanStyle      0.315302
		Randomize      (0.500, 0.391, -0.607)
		colorDistMagn   0.847435
		colorDistFreq   1.5353
		detailScale     1243.51
		colorConversion true
		snowLevel       2
		tropicLatitude  0.804334
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.612001
		terraceProb     0.351423
		erosion         0
		montesMagn      0.550033
		montesFreq      3.99187
		montesSpiky     0.958588
		montesFraction  0.442844
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.61319
		hillsFraction   0.757469
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262197
		craterFreq      0.238256
		craterDensity   0.814893
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57815
		volcanoTemp     1275.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.180, 0.179, 0.000)
		colorShelf     (0.193, 0.192, 0.190, 0.000)
		colorBeach     (0.204, 0.203, 0.202, 0.000)
		colorDesert    (0.215, 0.214, 0.213, 0.000)
		colorLowland   (0.227, 0.225, 0.224, 0.000)
		colorUpland    (0.238, 0.237, 0.235, 0.000)
		colorRock      (0.249, 0.248, 0.246, 0.000)
		colorSnow      (0.261, 0.259, 0.258, 1.000)
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
		SemiMajorAxis   0.0395928
		Period          0.938694
		Eccentricity    0.485125
		Inclination     60.8173
		AscendingNode   113.866
		ArgOfPericenter 132.845
		MeanAnomaly     -120.993
	}
}

DwarfMoon	"Japrael System 5.D22"
{
	ParentBody     "Japrael System 5"
	Class	       "Asteroid"

	Mass            4.2137e-008
	Radius          48.3914
	InertiaMoment   0.398929

	RotationPeriod  609.153
	Obliquity       -58.7349
	EqAscendNode    -49.834

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.592 0.588 0.587)

	Surface
	{
		SurfStyle       0.380217
		OceanStyle      0.251489
		Randomize      (0.532, -0.571, 0.553)
		colorDistMagn   0.0628883
		colorDistFreq   0.599542
		detailScale     1321.41
		colorConversion true
		snowLevel       2
		tropicLatitude  0.968953
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.39179
		terraceProb     0.374414
		erosion         0
		montesMagn      0.471519
		montesFreq      2.37142
		montesSpiky     0.882042
		montesFraction  0.52425
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.57592
		hillsFraction   0.73801
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240497
		craterFreq      0.237538
		craterDensity   0.695081
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.401081
		volcanoTemp     1517.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.235, 0.235, 0.000)
		colorShelf     (0.252, 0.250, 0.250, 0.000)
		colorBeach     (0.267, 0.265, 0.264, 0.000)
		colorDesert    (0.281, 0.280, 0.279, 0.000)
		colorLowland   (0.296, 0.294, 0.294, 0.000)
		colorUpland    (0.311, 0.309, 0.308, 0.000)
		colorRock      (0.326, 0.324, 0.323, 0.000)
		colorSnow      (0.341, 0.338, 0.338, 1.000)
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
		SemiMajorAxis   0.0400828
		Period          0.956174
		Eccentricity    0.123704
		Inclination     -24.3573
		AscendingNode   -50.2212
		ArgOfPericenter -74.4467
		MeanAnomaly     -127.3
	}
}

DwarfMoon	"Japrael System 5.D23"
{
	ParentBody     "Japrael System 5"
	Class	       "Asteroid"

	Mass            5.7228e-008
	Radius          51.1987
	InertiaMoment   0.399855

	RotationPeriod  552.138
	Obliquity       73.7708
	EqAscendNode    -137.06

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.574 0.568 0.565)

	Surface
	{
		SurfStyle       0.0831579
		OceanStyle      0.648516
		Randomize      (0.114, -0.215, -0.994)
		colorDistMagn   0.211006
		colorDistFreq   0.769639
		detailScale     1398.07
		colorConversion true
		snowLevel       2
		tropicLatitude  0.665635
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.713988
		terraceProb     0.283208
		erosion         0
		montesMagn      0.376594
		montesFreq      2.88422
		montesSpiky     0.978028
		montesFraction  0.656642
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.18847
		hillsFraction   0.608868
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257397
		craterFreq      0.20779
		craterDensity   0.985574
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502336
		volcanoTemp     1394.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.229, 0.227, 0.226, 0.000)
		colorShelf     (0.244, 0.241, 0.240, 0.000)
		colorBeach     (0.258, 0.255, 0.254, 0.000)
		colorDesert    (0.273, 0.270, 0.268, 0.000)
		colorLowland   (0.287, 0.284, 0.282, 0.000)
		colorUpland    (0.301, 0.298, 0.297, 0.000)
		colorRock      (0.316, 0.312, 0.311, 0.000)
		colorSnow      (0.330, 0.326, 0.325, 1.000)
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
		SemiMajorAxis   0.0404998
		Period          0.971134
		Eccentricity    0.499855
		Inclination     71.4479
		AscendingNode   -136.234
		ArgOfPericenter -84.0052
		MeanAnomaly     -22.8698
	}
}

DwarfMoon	"Japrael System 5.D24"
{
	ParentBody     "Japrael System 5"
	Class	       "Asteroid"

	Mass            7.7855e-008
	Radius          66.7474
	InertiaMoment   0.397894

	RotationPeriod  612.036
	Obliquity       -46.2976
	EqAscendNode    71.9728

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.736 0.734 0.729)

	Surface
	{
		SurfStyle       0.776595
		OceanStyle      0.343044
		Randomize      (0.605, -0.172, 0.778)
		colorDistMagn   0.668385
		colorDistFreq   3.07356
		detailScale     1822.65
		colorConversion true
		snowLevel       2
		tropicLatitude  0.855861
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.504854
		terraceProb     0.365744
		erosion         0
		montesMagn      0.521745
		montesFreq      2.42572
		montesSpiky     0.976295
		montesFraction  0.745108
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.11532
		hillsFraction   0.661366
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24817
		craterFreq      0.208954
		craterDensity   0.733714
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.495781
		volcanoTemp     1173.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.250, 0.204, 0.000)
		colorShelf     (0.295, 0.257, 0.233, 0.000)
		colorBeach     (0.346, 0.301, 0.277, 0.000)
		colorDesert    (0.375, 0.323, 0.270, 0.000)
		colorLowland   (0.412, 0.345, 0.306, 0.000)
		colorUpland    (0.456, 0.418, 0.372, 0.000)
		colorRock      (0.493, 0.455, 0.401, 0.000)
		colorSnow      (0.537, 0.484, 0.423, 1.000)
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
		SemiMajorAxis   0.0407617
		Period          0.98057
		Eccentricity    0.413135
		Inclination     -30.3393
		AscendingNode   77.4921
		ArgOfPericenter 26.176
		MeanAnomaly     58.5739
	}
}

// http://starwars.wikia.com/wiki/Caloma
Planet	"Caloma/Japrael System 6"
{
	ParentBody     "Prael"
	Class	       "GazGiant"

	Mass            18.2229
	Radius          22653
	InertiaMoment   0.200096

	Oblateness      0.0304734

	RotationPeriod  9.92323
	Obliquity       49.4146
	EqAscendNode    76.5579

	AlbedoBond      0.516129
	AlbedoGeom      0.619355
	Brightness      2

	Surface
	{
		SurfStyle       0.187423
		Randomize      (0.737, -0.320, 0.702)
		detailScale     58264.8
		colorConversion true
		tropicLatitude  0.755103
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0.882635
		stripeZones     7.53359
		stripeFluct     0.373656
		stripeTwist     9.68768
		cycloneMagn     11.8943
		cycloneFreq     0.713942
		cycloneDensity  0.528078
		cycloneOctaves  1
		colorLayer0    (0.810, 0.810, 0.810, 1.000)
		colorLayer1    (0.630, 0.650, 0.650, 1.000)
		colorLayer2    (0.580, 0.560, 0.580, 1.000)
		colorLayer3    (0.610, 0.610, 0.630, 1.000)
		colorLayer4    (0.720, 0.720, 0.720, 1.000)
		colorLayer5    (0.780, 0.780, 0.780, 1.000)
		colorLayer6    (0.540, 0.540, 0.560, 1.000)
		colorLayer7    (0.690, 0.660, 0.620, 1.000)
		colorLowPlants (0.720, 0.720, 0.720, 1.000)
		colorUpPlants  (0.780, 0.780, 0.780, 1.000)
		BumpHeight      16.64
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          58.6172
		Velocity        1446.94
		BumpHeight      41.978
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.936696
		mainOctaves     12
		Coverage        0.580644
		stripeZones     7.53359
		stripeFluct     0.373656
		stripeTwist     9.68768
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          226.53
		Density         913.208
		Pressure        168496
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0158539
		Saturation      0.521253

		Composition
		{
			H2    	92.0285
			He    	7.61319
			CH4   	0.285495
			N2    	0.0323112
			NH3   	0.025854
			O2    	0.00744732
			C2H2  	0.00335939
			Ne    	0.00117183
			C2H4  	0.00112437
			Ar    	0.000711264
			C2H6  	0.000541038
			C3H8  	0.000289133
		}
	}

	Aurora
	{
		Height      469.618
		NorthLat    83.4532
		NorthLon    -146.058
		NorthRadius 5420.77
		NorthWidth  1555.83
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -86.0504
		SouthLon    47.755
		SouthRadius 6624.99
		SouthWidth  1663.63
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
		SemiMajorAxis   21.31253
		Period          4.4655
		Eccentricity    0.0928262
		Inclination     -2.17266
		AscendingNode   79.0008
		ArgOfPericenter 126.026
		MeanAnomaly     48.1919
	}
}

Moon	"Japrael System 6.1"
{
	ParentBody     "Japrael System 6"
	Class	       "Selena"

	Mass            0.00558634
	Radius          1460.31
	InertiaMoment   0.389788

	Oblateness      0.0135171

	Obliquity       -0.0540247
	EqAscendNode    40.435
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.573 0.569 0.567)

	Surface
	{
		SurfStyle       0.55917
		OceanStyle      0.0919357
		Randomize      (-0.026, 0.493, -0.461)
		colorDistMagn   0.0488213
		colorDistFreq   171.599
		detailScale     3756
		colorConversion true
		drivenDarkening 0
		seaLevel        0.244138
		snowLevel       2
		tropicLatitude  0.00176052
		icecapLatitude  10
		icecapHeight    0.0977517
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.74507
		venusFreq       0.8599
		venusMagn       0
		mareFreq        0.694406
		mareDensity     0.00117636
		terraceProb     0.292463
		erosion         0
		montesMagn      0.0611834
		montesFreq      75.693
		montesSpiky     0.964345
		montesFraction  0.559494
		dunesMagn       0.0315432
		dunesFreq       1896.66
		dunesFraction   0.0665219
		hillsMagn       0.114824
		hillsFreq       195.995
		hillsFraction   0.555559
		hills2Fraction  0
		riversMagn      57.6069
		riversFreq      3.43593
		riversSin       7.10217
		riversOctaves   0
		canyonsMagn     0.562783
		canyonsFreq     0.459333
		canyonFraction  0.446781
		cracksMagn      0.0616465
		cracksFreq      0.567619
		cracksOctaves   0
		craterMagn      0.56687
		craterFreq      3.19773
		craterDensity   0.66033
		craterOctaves   7.3194
		craterRayedFactor 0.0776001
		volcanoMagn     0.213714
		volcanoFreq     0.76759
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.127813
		volcanoRadius   0.131408
		volcanoTemp     1736.12
		lavaCoverTidal  0.371778
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.356, 0.347, 0.306, 0.000)
		colorDesert    (0.373, 0.353, 0.312, 0.000)
		colorLowland   (0.292, 0.262, 0.238, 0.000)
		colorUpland    (0.430, 0.404, 0.351, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.998172
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
		Height          109.523
		Density         0.00018285
		Pressure        8.97776e-005
		Greenhouse      0.0269595
		Bright          2.83412
		Opacity         0
		SkyLight        0.944708
		Hue             -0.00789355
		Saturation      1

		Composition
		{
			CO2   	84.1247
			SO2   	15.4533
			C3H8  	0.421949
			Cl2   	2.59134e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.000768937
		Period          0.00222129
		Eccentricity    0.0285052
		Inclination     -0.0540247
		AscendingNode   40.435
		ArgOfPericenter -9.39977
		MeanAnomaly     -149.925
	}
}

Moon	"Japrael System 6.2"
{
	ParentBody     "Japrael System 6"
	Class	       "Selena"

	Mass            0.00658853
	Radius          1638.44
	InertiaMoment   0.38544

	Oblateness      0.00483892

	Obliquity       -1.40729
	EqAscendNode    109.379
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.659 0.654 0.651)

	Surface
	{
		SurfStyle       0.750871
		OceanStyle      0.106099
		Randomize      (0.791, 0.758, 0.013)
		colorDistMagn   0.0778783
		colorDistFreq   239.082
		detailScale     4214.16
		colorConversion true
		drivenDarkening 0
		seaLevel        0.226871
		snowLevel       2
		tropicLatitude  0.0283889
		icecapLatitude  0.598734
		icecapHeight    0.255435
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.53506
		venusFreq       0.406146
		venusMagn       0
		mareFreq        0.894325
		mareDensity     0.00176153
		terraceProb     0.292639
		erosion         0
		montesMagn      0.0868856
		montesFreq      84.6768
		montesSpiky     0.972826
		montesFraction  0.844125
		dunesMagn       0.0359859
		dunesFreq       2128.83
		dunesFraction   0.21577
		hillsMagn       0.100481
		hillsFreq       183.548
		hillsFraction   0.99783
		hills2Fraction  0
		riversMagn      66.415
		riversFreq      1.92546
		riversSin       7.14074
		riversOctaves   0
		canyonsMagn     0.460516
		canyonsFreq     0.597507
		canyonFraction  0.922951
		cracksMagn      0.0306944
		cracksFreq      1.0511
		cracksOctaves   0
		craterMagn      0.567404
		craterFreq      5.24878
		craterDensity   0.619228
		craterOctaves   8.64402
		craterRayedFactor 0.131911
		volcanoMagn     0.211184
		volcanoFreq     0.864238
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.159649
		volcanoRadius   0.173515
		volcanoTemp     1146.62
		lavaCoverTidal  0.237978
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.470, 0.400, 0.340, 0.000)
		colorShelf     (0.640, 0.600, 0.470, 0.000)
		colorBeach     (0.415, 0.399, 0.312, 0.000)
		colorDesert    (0.442, 0.406, 0.319, 0.000)
		colorLowland   (0.362, 0.301, 0.254, 0.000)
		colorUpland    (0.514, 0.465, 0.338, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.998278
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
		Height          122.883
		Density         0.000172175
		Pressure        4.61441e-005
		Greenhouse      0.0307712
		Bright          2.80023
		Opacity         0
		SkyLight        0.93341
		Hue             -0.000142157
		Saturation      1

		Composition
		{
			CO2   	99.3051
			C3H8  	0.691426
			Ar    	0.00334191
			SO2   	9.6013e-005
			Cl2   	2.63852e-005
			Kr    	1.50983e-005
			Xe    	1.43732e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00114379
		Period          0.0040298
		Eccentricity    0.0299954
		Inclination     -1.40729
		AscendingNode   109.379
		ArgOfPericenter 37.3282
		MeanAnomaly     37.266
	}
}

Moon	"Japrael System 6.3"
{
	ParentBody     "Japrael System 6"
	Class	       "Selena"

	Mass            0.00782161
	Radius          1631.09
	InertiaMoment   0.381038

	Oblateness      0.00120191

	Obliquity       0.278242
	EqAscendNode    11.7983
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.610 0.603 0.600)

	Surface
	{
		SurfStyle       0.75464
		OceanStyle      0.597951
		Randomize      (0.001, 0.782, -0.690)
		colorDistMagn   0.0525519
		colorDistFreq   227.2
		detailScale     4195.25
		colorConversion true
		drivenDarkening 0
		seaLevel        0.202549
		snowLevel       2
		tropicLatitude  0.0096612
		icecapLatitude  0.666859
		icecapHeight    0.217667
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.03241
		venusFreq       0.968753
		venusMagn       0
		mareFreq        0.96849
		mareDensity     0.00196832
		terraceProb     0.221889
		erosion         0
		montesMagn      0.0683872
		montesFreq      79.9
		montesSpiky     0.938687
		montesFraction  0.943062
		dunesMagn       0.0378795
		dunesFreq       2136.66
		dunesFraction   0.546846
		hillsMagn       0.103149
		hillsFreq       179.652
		hillsFraction   0.660217
		hills2Fraction  0
		riversMagn      66.383
		riversFreq      4.13916
		riversSin       5.22659
		riversOctaves   0
		canyonsMagn     0.598206
		canyonsFreq     0.53925
		canyonFraction  0.327769
		cracksMagn      0.0377894
		cracksFreq      0.571897
		cracksOctaves   0
		craterMagn      0.60423
		craterFreq      5.40669
		craterDensity   0.860609
		craterOctaves   10.1558
		craterRayedFactor 0.0868218
		volcanoMagn     0.249588
		volcanoFreq     0.897465
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.338353
		volcanoRadius   0.182904
		volcanoTemp     1441.24
		lavaCoverTidal  0.0852677
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.470, 0.400, 0.340, 0.000)
		colorShelf     (0.640, 0.600, 0.470, 0.000)
		colorBeach     (0.384, 0.368, 0.288, 0.000)
		colorDesert    (0.408, 0.374, 0.294, 0.000)
		colorLowland   (0.335, 0.278, 0.234, 0.000)
		colorUpland    (0.475, 0.428, 0.312, 0.000)
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

	Atmosphere
	{
		Model          "Sun"
		Height          81.5544
		Density         3.43045e-008
		Pressure        5.02078e-009
		Greenhouse      0.000397677
		Bright          0.509413
		Opacity         0
		SkyLight        0.169804
		Hue             0.00760923
		Saturation      1

		Composition
		{
			Ar    	99.7014
			Kr    	0.298398
			O2    	0.000162086
			Xe    	1.72122e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00170139
		Period          0.00731071
		Eccentricity    0.0362012
		Inclination     0.278242
		AscendingNode   11.7983
		ArgOfPericenter -76.0564
		MeanAnomaly     -6.75727
	}
}

Moon	"Japrael System 6.4"
{
	ParentBody     "Japrael System 6"
	Class	       "IceWorld"

	Mass            0.00936134
	Radius          1838.82
	InertiaMoment   0.376307

	Obliquity       1.46602
	EqAscendNode    157.451
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.785 0.780 0.777)

	Surface
	{
		SurfStyle       0.469877
		OceanStyle      0.87545
		Randomize      (-0.212, 0.579, 0.852)
		colorDistMagn   0.0426306
		colorDistFreq   181.265
		detailScale     4729.55
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.209157
		snowLevel       2
		tropicLatitude  0.0100067
		icecapLatitude  0.691817
		icecapHeight    0.232993
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.9325
		venusFreq       0.67186
		venusMagn       0.209659
		mareFreq        1.03602
		mareDensity     0.00171179
		terraceProb     0.221154
		erosion         0
		montesMagn      0.0834392
		montesFreq      100.739
		montesSpiky     0.987138
		montesFraction  0.013066
		dunesMagn       0.0254765
		dunesFreq       2439.84
		dunesFraction   0.969833
		hillsMagn       0.128521
		hillsFreq       200.95
		hillsFraction   0.773043
		hills2Fraction  0.124956
		riversMagn      57.9979
		riversFreq      3.29857
		riversSin       6.53733
		riversOctaves   0
		canyonsMagn     0.457236
		canyonsFreq     0.614536
		canyonFraction  0
		cracksMagn      0.0676879
		cracksFreq      1.15289
		cracksOctaves   1
		craterMagn      0.617834
		craterFreq      5.00034
		craterDensity   0.820736
		craterOctaves   11
		craterRayedFactor 0.115171
		volcanoMagn     0.25223
		volcanoFreq     0.481609
		volcanoDensity  0.180805
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.0801191
		volcanoRadius   0.24144
		volcanoTemp     1083.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.195, 0.171, 0.000)
		colorShelf     (0.291, 0.242, 0.218, 0.000)
		colorBeach     (0.440, 0.367, 0.326, 0.200)
		colorDesert    (0.401, 0.343, 0.288, 0.500)
		colorLowland   (0.306, 0.265, 0.218, 0.800)
		colorUpland    (0.518, 0.468, 0.404, 1.000)
		colorRock      (0.670, 0.620, 0.550, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.306, 0.265, 0.218, 0.800)
		colorUpPlants  (0.518, 0.468, 0.404, 1.000)
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
		SemiMajorAxis   0.00253082
		Period          0.0132628
		Eccentricity    0.0158611
		Inclination     1.46602
		AscendingNode   157.451
		ArgOfPericenter 58.7511
		MeanAnomaly     -131.108
	}
}

Moon	"Japrael System 6.5"
{
	ParentBody     "Japrael System 6"
	Class	       "Selena"

	Mass            0.113186
	Radius          3880.91
	InertiaMoment   0.325689

	Obliquity       -1.15492
	EqAscendNode    60.2505
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.456 0.451 0.446)

	Surface
	{
		SurfStyle       0.575763
		OceanStyle      0.94512
		Randomize      (-0.952, 0.543, 0.735)
		colorDistMagn   0.0726623
		colorDistFreq   379.263
		detailScale     9981.92
		colorConversion true
		drivenDarkening 0
		seaLevel        0.318885
		snowLevel       2
		tropicLatitude  0.0348615
		icecapLatitude  0.790899
		icecapHeight    0.332762
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.5494
		venusFreq       0.598686
		venusMagn       0
		mareFreq        1.7375
		mareDensity     0.0179677
		terraceProb     0.260865
		erosion         0
		montesMagn      0.164642
		montesFreq      170.316
		montesSpiky     0.945904
		montesFraction  0.875764
		dunesMagn       0.0405767
		dunesFreq       5105.91
		dunesFraction   0.47791
		hillsMagn       0.138497
		hillsFreq       407.689
		hillsFraction   0.135153
		hills2Fraction  0
		riversMagn      62.3104
		riversFreq      3.42374
		riversSin       4.99789
		riversOctaves   0
		canyonsMagn     0.697422
		canyonsFreq     0.957255
		canyonFraction  0.00974053
		cracksMagn      0.0581568
		cracksFreq      1.85431
		cracksOctaves   0
		craterMagn      0.662008
		craterFreq      12.796
		craterDensity   0.819581
		craterOctaves   11.5853
		craterRayedFactor 0.100262
		volcanoMagn     0.660755
		volcanoFreq     0.626262
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.119415
		volcanoRadius   0.457225
		volcanoTemp     1589.5
		lavaCoverTidal  0.038397
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.430, 0.400, 0.370, 0.000)
		colorShelf     (0.620, 0.600, 0.530, 0.000)
		colorBeach     (0.283, 0.275, 0.241, 0.000)
		colorDesert    (0.297, 0.280, 0.245, 0.000)
		colorLowland   (0.233, 0.208, 0.187, 0.000)
		colorUpland    (0.342, 0.321, 0.276, 0.000)
		colorRock      (0.300, 0.260, 0.220, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           0.999999
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
		Height          99.35
		Density         7.57871e-008
		Pressure        9.84046e-009
		Greenhouse      0.00159787
		Bright          0.596924
		Opacity         0
		SkyLight        0.198975
		Hue             0.023112
		Saturation      1

		Composition
		{
			N2    	61.4748
			Ne    	38.5246
			Ar    	0.000525267
			CO    	7.94335e-005
			O2    	1.17431e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00376459
		Period          0.0240209
		Eccentricity    0.0486525
		Inclination     -1.15492
		AscendingNode   60.2505
		ArgOfPericenter -163.462
		MeanAnomaly     63.1426
	}
}

Moon	"Japrael System 6.6"
{
	ParentBody     "Japrael System 6"
	Class	       "IceWorld"

	Mass            0.0138622
	Radius          2091.28
	InertiaMoment   0.371981

	Obliquity       -0.326797
	EqAscendNode    -125.28
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.421 0.410 0.407)

	Surface
	{
		SurfStyle       0.397582
		OceanStyle      0.36095
		Randomize      (0.293, 0.042, 0.657)
		colorDistMagn   0.072839
		colorDistFreq   285.047
		detailScale     5378.89
		colorConversion true
		drivenDarkening 0.408943
		seaLevel        0.26422
		snowLevel       2
		tropicLatitude  0.00524759
		icecapLatitude  0.588244
		icecapHeight    0.290835
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.52794
		venusFreq       0.659796
		venusMagn       0.203169
		mareFreq        1.09483
		mareDensity     0.00235365
		terraceProb     0.358919
		erosion         0
		montesMagn      0.106652
		montesFreq      83.7946
		montesSpiky     0.926295
		montesFraction  0.280049
		dunesMagn       0.0370492
		dunesFreq       2718.21
		dunesFraction   0.434047
		hillsMagn       0.106527
		hillsFreq       253.6
		hillsFraction   0.504524
		hills2Fraction  0.138816
		riversMagn      56.8786
		riversFreq      1.73006
		riversSin       5.64731
		riversOctaves   0
		canyonsMagn     0.697958
		canyonsFreq     0.566989
		canyonFraction  0
		cracksMagn      0.0605504
		cracksFreq      0.489229
		cracksOctaves   1
		craterMagn      0.59657
		craterFreq      4.97027
		craterDensity   0.862717
		craterOctaves   11
		craterRayedFactor 0.101299
		volcanoMagn     0.347445
		volcanoFreq     0.678489
		volcanoDensity  0.16879
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.20545
		volcanoRadius   0.357872
		volcanoTemp     1813.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.421, 0.410, 0.407, 0.500)
		colorShelf     (0.400, 0.389, 0.386, 0.500)
		colorBeach     (0.294, 0.287, 0.285, 0.750)
		colorDesert    (0.357, 0.348, 0.346, 1.000)
		colorLowland   (0.370, 0.361, 0.358, 1.000)
		colorUpland    (0.391, 0.381, 0.378, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.370, 0.361, 0.358, 1.000)
		colorUpPlants  (0.391, 0.381, 0.378, 1.000)
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
		SemiMajorAxis   0.00559983
		Period          0.0436489
		Eccentricity    0.0344607
		Inclination     -0.326797
		AscendingNode   -125.28
		ArgOfPericenter -158.255
		MeanAnomaly     130.941
	}
}

Moon	"Japrael System 6.7"
{
	ParentBody     "Japrael System 6"
	Class	       "IceWorld"

	Mass            0.0172607
	Radius          2113.64
	InertiaMoment   0.366378

	Obliquity       -1.48303
	EqAscendNode    152.695
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.738 0.681 0.648)

	Surface
	{
		SurfStyle       0.435279
		OceanStyle      0.838008
		Randomize      (-0.186, 0.345, -0.006)
		colorDistMagn   0.0458559
		colorDistFreq   284.439
		detailScale     5436.39
		colorConversion true
		drivenDarkening 0
		seaLevel        0.172584
		snowLevel       2
		tropicLatitude  0.0122166
		icecapLatitude  0.929271
		icecapHeight    0.178181
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.85707
		venusFreq       1.77337
		venusMagn       0
		mareFreq        1.07159
		mareDensity     0.00422457
		terraceProb     0.342909
		erosion         0
		montesMagn      0.0941187
		montesFreq      119.498
		montesSpiky     0.958168
		montesFraction  0.637271
		dunesMagn       0.0326097
		dunesFreq       2770.21
		dunesFraction   0.208766
		hillsMagn       0.125664
		hillsFreq       267.36
		hillsFraction   0.703578
		hills2Fraction  0.227538
		riversMagn      65.9934
		riversFreq      3.53493
		riversSin       6.45352
		riversOctaves   0
		canyonsMagn     0.380334
		canyonsFreq     0.887321
		canyonFraction  0
		cracksMagn      0.0672563
		cracksFreq      0.655274
		cracksOctaves   2
		craterMagn      0.633084
		craterFreq      5.33879
		craterDensity   0.839665
		craterOctaves   11
		craterRayedFactor 0.0998059
		volcanoMagn     0.363663
		volcanoFreq     0.807065
		volcanoDensity  0.185877
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.471293
		volcanoRadius   0.301507
		volcanoTemp     1384.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.738, 0.681, 0.648, 0.500)
		colorShelf     (0.701, 0.647, 0.616, 0.500)
		colorBeach     (0.517, 0.477, 0.454, 0.750)
		colorDesert    (0.627, 0.579, 0.551, 1.000)
		colorLowland   (0.649, 0.599, 0.570, 1.000)
		colorUpland    (0.686, 0.633, 0.603, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.649, 0.599, 0.570, 1.000)
		colorUpPlants  (0.686, 0.633, 0.603, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999972
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
		Height          118.804
		Density         2.8249e-006
		Pressure        2.69663e-007
		Greenhouse      0.00357204
		Bright          1.23084
		Opacity         0
		SkyLight        0.410279
		Hue             0.0386148
		Saturation      1

		Composition
		{
			Ne    	100
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00832974
		Period          0.0791834
		Eccentricity    0.0197208
		Inclination     -1.48303
		AscendingNode   152.695
		ArgOfPericenter 7.40493
		MeanAnomaly     54.956
	}
}

Moon	"Japrael System 6.8"
{
	ParentBody     "Japrael System 6"
	Class	       "IceWorld"

	Mass            0.0219684
	Radius          2430.73
	InertiaMoment   0.360556

	Obliquity       -1.28319
	EqAscendNode    149.912
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.702 0.697 0.694)

	Surface
	{
		SurfStyle       0.129
		OceanStyle      0.438461
		Randomize      (0.122, 0.829, 0.588)
		colorDistMagn   0.0891924
		colorDistFreq   273.99
		detailScale     6251.98
		colorConversion true
		drivenDarkening 0
		seaLevel        0.186525
		snowLevel       2
		tropicLatitude  0.0116266
		icecapLatitude  0.611374
		icecapHeight    0.216112
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.82678
		venusFreq       0.757441
		venusMagn       0
		mareFreq        1.46552
		mareDensity     0.00362914
		terraceProb     0.384823
		erosion         0
		montesMagn      0.146027
		montesFreq      153.196
		montesSpiky     0.864811
		montesFraction  0.427139
		dunesMagn       0.0327736
		dunesFreq       3213.52
		dunesFraction   0.714219
		hillsMagn       0.14801
		hillsFreq       270.921
		hillsFraction   0.0968772
		hills2Fraction  0.201905
		riversMagn      54.2231
		riversFreq      2.9506
		riversSin       4.81002
		riversOctaves   0
		canyonsMagn     0.529811
		canyonsFreq     1.21175
		canyonFraction  0
		cracksMagn      0.052566
		cracksFreq      0.658316
		cracksOctaves   2
		craterMagn      0.628592
		craterFreq      8.85314
		craterDensity   0.883431
		craterOctaves   12
		craterRayedFactor 0.175556
		volcanoMagn     0.414982
		volcanoFreq     0.785164
		volcanoDensity  0.195166
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.447387
		volcanoRadius   0.331186
		volcanoTemp     1480.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.702, 0.697, 0.694, 0.500)
		colorShelf     (0.667, 0.663, 0.659, 0.500)
		colorBeach     (0.491, 0.488, 0.486, 0.750)
		colorDesert    (0.596, 0.593, 0.590, 1.000)
		colorLowland   (0.618, 0.614, 0.611, 1.000)
		colorUpland    (0.653, 0.649, 0.645, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.618, 0.614, 0.611, 1.000)
		colorUpPlants  (0.653, 0.649, 0.645, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.997568
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
		Height          122.022
		Density         0.000243174
		Pressure        2.35656e-005
		Greenhouse      0.0216628
		Bright          3.00043
		Opacity         0
		SkyLight        1.00014
		Hue             0.0463662
		Saturation      1

		Composition
		{
			Ne    	100
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0123905
		Period          0.143644
		Eccentricity    0.00521998
		Inclination     -1.28319
		AscendingNode   149.912
		ArgOfPericenter 115.353
		MeanAnomaly     76.4534
	}
}

Moon	"Japrael System 6.9"
{
	ParentBody     "Japrael System 6"
	Class	       "IceWorld"

	Mass            5.72491e-006
	Radius          256.964
	InertiaMoment   0.395722

	Obliquity       -1.01144
	EqAscendNode    13.052
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.647 0.644 0.643)

	Surface
	{
		SurfStyle       0.763305
		OceanStyle      0.322542
		Randomize      (0.656, 0.437, -0.256)
		colorDistMagn   0.067512
		colorDistFreq   32.0326
		detailScale     660.925
		colorConversion true
		drivenDarkening 0.124249
		seaLevel        0.0797933
		snowLevel       2
		tropicLatitude  0.0350694
		icecapLatitude  0.500457
		icecapHeight    0.139627
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.6623
		venusFreq       0.616668
		venusMagn       0
		mareFreq        0
		mareDensity     1.33426e-006
		terraceProb     0.250378
		erosion         0
		montesMagn      0.0575743
		montesFreq      13.359
		montesSpiky     0.962608
		montesFraction  0.525829
		dunesMagn       0.034525
		dunesFreq       335.328
		dunesFraction   0.0203675
		hillsMagn       0.113191
		hillsFreq       26.9796
		hillsFraction   0.42986
		hills2Fraction  0.229282
		riversMagn      62.0179
		riversFreq      2.30326
		riversSin       4.36262
		riversOctaves   0
		canyonsMagn     0.515664
		canyonsFreq     0.0784549
		canyonFraction  0
		cracksMagn      0.0542829
		cracksFreq      0.0855385
		cracksOctaves   0
		craterMagn      0.813168
		craterFreq      0.729684
		craterDensity   0.879654
		craterOctaves   8
		craterRayedFactor 0.0925939
		volcanoMagn     0.159728
		volcanoFreq     0.764421
		volcanoDensity  0.213583
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.248196
		volcanoRadius   0.163737
		volcanoTemp     1530.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.414, 0.412, 0.431, 0.250)
		colorShelf     (0.453, 0.470, 0.488, 0.250)
		colorBeach     (0.369, 0.348, 0.373, 0.200)
		colorDesert    (0.343, 0.316, 0.328, 0.200)
		colorLowland   (0.252, 0.245, 0.270, 0.200)
		colorUpland    (0.479, 0.477, 0.488, 0.250)
		colorRock      (0.640, 0.630, 0.660, 0.150)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.252, 0.245, 0.270, 0.200)
		colorUpPlants  (0.479, 0.477, 0.488, 0.250)
		BumpHeight      12.8482
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
		SemiMajorAxis   0.0184308
		Period          0.260691
		Eccentricity    0.0170035
		Inclination     -1.01144
		AscendingNode   13.052
		ArgOfPericenter 139.601
		MeanAnomaly     -94.6888
	}
}

Moon	"Japrael System 6.10"
{
	ParentBody     "Japrael System 6"
	Class	       "IceWorld"

	Mass            0.000172456
	Radius          490.753
	InertiaMoment   0.396741

	Obliquity       0.24375
	EqAscendNode    168.466
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.504 0.500 0.495)

	Surface
	{
		SurfStyle       0.225295
		OceanStyle      0.983491
		Randomize      (0.616, -0.013, 0.168)
		colorDistMagn   0.0472893
		colorDistFreq   68.2088
		detailScale     1262.24
		colorConversion true
		drivenDarkening 0.0835286
		seaLevel        0.239018
		snowLevel       2
		tropicLatitude  0.000845728
		icecapLatitude  0.679403
		icecapHeight    0.260435
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.91991
		venusFreq       1.17369
		venusMagn       0
		mareFreq        0
		mareDensity     0.000118598
		terraceProb     0.516681
		erosion         0
		montesMagn      0.046144
		montesFreq      26.1028
		montesSpiky     0.870001
		montesFraction  0.0878365
		dunesMagn       0.0390212
		dunesFreq       641.592
		dunesFraction   0.315338
		hillsMagn       0.115318
		hillsFreq       61.9867
		hillsFraction   0.484096
		hills2Fraction  0.167948
		riversMagn      48.7785
		riversFreq      2.55051
		riversSin       7.59492
		riversOctaves   0
		canyonsMagn     0.416124
		canyonsFreq     0.168967
		canyonFraction  0
		cracksMagn      0.0274269
		cracksFreq      0.0938411
		cracksOctaves   0
		craterMagn      0.584837
		craterFreq      1.31144
		craterDensity   0.975231
		craterOctaves   9
		craterRayedFactor 0.118092
		volcanoMagn     0.192698
		volcanoFreq     0.867646
		volcanoDensity  0.169152
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.221413
		volcanoRadius   0.149696
		volcanoTemp     1252.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.504, 0.500, 0.495, 0.500)
		colorShelf     (0.479, 0.475, 0.470, 0.500)
		colorBeach     (0.353, 0.350, 0.346, 0.750)
		colorDesert    (0.429, 0.425, 0.421, 1.000)
		colorLowland   (0.444, 0.440, 0.436, 1.000)
		colorUpland    (0.469, 0.465, 0.460, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.444, 0.440, 0.436, 1.000)
		colorUpPlants  (0.469, 0.465, 0.460, 1.000)
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
		SemiMajorAxis   0.0274159
		Period          0.472945
		Eccentricity    0.0232097
		Inclination     0.24375
		AscendingNode   168.466
		ArgOfPericenter 154.487
		MeanAnomaly     170.695
	}
}

DwarfMoon	"Japrael System 6.D1"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            3.50821e-011
	Radius          4.29234
	InertiaMoment   0.399316

	RotationPeriod  1913.06
	Obliquity       -29.577
	EqAscendNode    115.826

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.703 0.701 0.700)

	Surface
	{
		SurfStyle       0.567109
		OceanStyle      0.560056
		Randomize      (-0.415, 0.303, -0.412)
		colorDistMagn   0.446191
		colorDistFreq   0.00324733
		detailScale     117.21
		colorConversion true
		snowLevel       2
		tropicLatitude  0.746451
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.44796
		terraceProb     0.319662
		erosion         0
		montesMagn      0.421467
		montesFreq      3.21177
		montesSpiky     0.925238
		montesFraction  0.55658
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0588748
		hillsFraction   0.554204
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252864
		craterFreq      0.212248
		craterDensity   0.84316
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.444923
		volcanoTemp     1351.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.238, 0.196, 0.000)
		colorShelf     (0.281, 0.245, 0.224, 0.000)
		colorBeach     (0.330, 0.287, 0.266, 0.000)
		colorDesert    (0.359, 0.308, 0.259, 0.000)
		colorLowland   (0.394, 0.330, 0.294, 0.000)
		colorUpland    (0.436, 0.400, 0.357, 0.000)
		colorRock      (0.471, 0.435, 0.385, 0.000)
		colorSnow      (0.513, 0.463, 0.406, 1.000)
		BumpHeight      3.86311
		BumpOffset      0.772621
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
		SemiMajorAxis   2.70963
		Period          464.701
		Eccentricity    0.250265
		Inclination     -55.7147
		AscendingNode   115.493
		ArgOfPericenter 10.3126
		MeanAnomaly     30.2687
	}
}

DwarfMoon	"Japrael System 6.D2"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            6.25901e-011
	Radius          6.08377
	InertiaMoment   0.396525

	RotationPeriod  2022.79
	Obliquity       105.36
	EqAscendNode    -60.5454

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.591 0.587 0.584)

	Surface
	{
		SurfStyle       0.632995
		OceanStyle      0.526964
		Randomize      (0.239, 0.081, -0.761)
		colorDistMagn   0.64666
		colorDistFreq   0.00848631
		detailScale     166.127
		colorConversion true
		snowLevel       2
		tropicLatitude  0.828559
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.51774
		terraceProb     0.423175
		erosion         0
		montesMagn      0.543397
		montesFreq      3.61178
		montesSpiky     0.834643
		montesFraction  0.689154
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.11284
		hillsFraction   0.765044
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232295
		craterFreq      0.170771
		craterDensity   0.940398
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510926
		volcanoTemp     1242.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.200, 0.163, 0.000)
		colorShelf     (0.236, 0.206, 0.187, 0.000)
		colorBeach     (0.278, 0.241, 0.222, 0.000)
		colorDesert    (0.301, 0.258, 0.216, 0.000)
		colorLowland   (0.331, 0.276, 0.245, 0.000)
		colorUpland    (0.366, 0.335, 0.298, 0.000)
		colorRock      (0.396, 0.364, 0.321, 0.000)
		colorSnow      (0.431, 0.388, 0.339, 1.000)
		BumpHeight      5.47539
		BumpOffset      1.09508
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
		SemiMajorAxis   2.70992
		Period          464.774
		Eccentricity    0.147424
		Inclination     65.2247
		AscendingNode   -59.155
		ArgOfPericenter -57.3721
		MeanAnomaly     168.698
	}
}

DwarfMoon	"Japrael System 6.D3"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            1.05486e-010
	Radius          6.82899
	InertiaMoment   0.398429

	RotationPeriod  1753.42
	Obliquity       21.3394
	EqAscendNode    18.5832

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.636 0.630 0.626)

	Surface
	{
		SurfStyle       0.668855
		OceanStyle      0.486385
		Randomize      (0.387, 0.137, -0.702)
		colorDistMagn   0.773608
		colorDistFreq   0.0316705
		detailScale     186.477
		colorConversion true
		snowLevel       2
		tropicLatitude  0.923047
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.364046
		terraceProb     0.397777
		erosion         0
		montesMagn      0.489765
		montesFreq      3.13986
		montesSpiky     0.927983
		montesFraction  0.641892
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0904398
		hillsFraction   0.746359
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223672
		craterFreq      0.189764
		craterDensity   0.865896
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.427172
		volcanoTemp     1378.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.214, 0.175, 0.000)
		colorShelf     (0.254, 0.220, 0.200, 0.000)
		colorBeach     (0.299, 0.258, 0.238, 0.000)
		colorDesert    (0.324, 0.277, 0.232, 0.000)
		colorLowland   (0.356, 0.296, 0.263, 0.000)
		colorUpland    (0.394, 0.359, 0.319, 0.000)
		colorRock      (0.426, 0.390, 0.345, 0.000)
		colorSnow      (0.464, 0.416, 0.363, 1.000)
		BumpHeight      6.14609
		BumpOffset      1.22922
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
		SemiMajorAxis   2.71036
		Period          464.889
		Eccentricity    0.32722
		Inclination     47.2057
		AscendingNode   21.6967
		ArgOfPericenter -158.872
		MeanAnomaly     -130.467
	}
}

DwarfMoon	"Japrael System 6.D4"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            1.70277e-010
	Radius          7.69099
	InertiaMoment   0.399447

	RotationPeriod  1556.43
	Obliquity       -16.984
	EqAscendNode    69.9889

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.644 0.639 0.634)

	Surface
	{
		SurfStyle       0.556623
		OceanStyle      0.180409
		Randomize      (0.607, 0.548, 0.107)
		colorDistMagn   0.978503
		colorDistFreq   0.0245011
		detailScale     210.015
		colorConversion true
		snowLevel       2
		tropicLatitude  0.331106
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.485202
		terraceProb     0.312144
		erosion         0
		montesMagn      0.526907
		montesFreq      3.93826
		montesSpiky     0.969258
		montesFraction  0.913175
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.181171
		hillsFraction   0.712415
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246757
		craterFreq      0.25965
		craterDensity   0.91945
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.576731
		volcanoTemp     1200
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.217, 0.178, 0.000)
		colorShelf     (0.258, 0.224, 0.203, 0.000)
		colorBeach     (0.303, 0.262, 0.241, 0.000)
		colorDesert    (0.329, 0.281, 0.235, 0.000)
		colorLowland   (0.361, 0.300, 0.266, 0.000)
		colorUpland    (0.399, 0.364, 0.323, 0.000)
		colorRock      (0.432, 0.396, 0.349, 0.000)
		colorSnow      (0.470, 0.422, 0.368, 1.000)
		BumpHeight      6.92189
		BumpOffset      1.38438
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
		SemiMajorAxis   2.71087
		Period          465.021
		Eccentricity    0.187554
		Inclination     -5.11577
		AscendingNode   69.8253
		ArgOfPericenter -109.246
		MeanAnomaly     14.8991
	}
}

DwarfMoon	"Japrael System 6.D5"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            2.6576e-010
	Radius          8.51325
	InertiaMoment   0.396988

	RotationPeriod  1374.9
	Obliquity       -73.4584
	EqAscendNode    162.316

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.501 0.452 0.387)

	Surface
	{
		SurfStyle       0.599392
		OceanStyle      0.894524
		Randomize      (-0.765, -0.153, -0.328)
		colorDistMagn   0.601473
		colorDistFreq   0.0442459
		detailScale     232.468
		colorConversion true
		snowLevel       2
		tropicLatitude  0.659261
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.406618
		terraceProb     0.239054
		erosion         0
		montesMagn      0.471085
		montesFreq      2.43057
		montesSpiky     0.971557
		montesFraction  0.440959
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.119476
		hillsFraction   0.803299
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252246
		craterFreq      0.272863
		craterDensity   0.842233
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488175
		volcanoTemp     1649.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.154, 0.108, 0.000)
		colorShelf     (0.200, 0.158, 0.124, 0.000)
		colorBeach     (0.235, 0.185, 0.147, 0.000)
		colorDesert    (0.255, 0.199, 0.143, 0.000)
		colorLowland   (0.280, 0.213, 0.163, 0.000)
		colorUpland    (0.310, 0.258, 0.197, 0.000)
		colorRock      (0.335, 0.280, 0.213, 0.000)
		colorSnow      (0.365, 0.299, 0.225, 1.000)
		BumpHeight      7.66192
		BumpOffset      1.53238
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
		SemiMajorAxis   2.71133
		Period          465.138
		Eccentricity    0.171645
		Inclination     -35.5881
		AscendingNode   158.876
		ArgOfPericenter -60.4136
		MeanAnomaly     -120.048
	}
}

DwarfMoon	"Japrael System 6.D6"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            4.03777e-010
	Radius          11.4817
	InertiaMoment   0.398594

	RotationPeriod  1507.32
	Obliquity       87.4147
	EqAscendNode    65.8435

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.729 0.727 0.725)

	Surface
	{
		SurfStyle       0.138993
		OceanStyle      0.856501
		Randomize      (-0.194, -0.426, -0.265)
		colorDistMagn   0.184498
		colorDistFreq   0.0448023
		detailScale     313.526
		colorConversion true
		snowLevel       2
		tropicLatitude  0.982197
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.491993
		terraceProb     0.146608
		erosion         0
		montesMagn      0.517564
		montesFreq      2.16705
		montesSpiky     0.900775
		montesFraction  0.269051
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.209553
		hillsFraction   0.476656
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234433
		craterFreq      0.181471
		craterDensity   0.813687
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.615246
		volcanoTemp     1442.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.291, 0.290, 0.000)
		colorShelf     (0.310, 0.309, 0.308, 0.000)
		colorBeach     (0.328, 0.327, 0.326, 0.000)
		colorDesert    (0.346, 0.345, 0.344, 0.000)
		colorLowland   (0.365, 0.363, 0.362, 0.000)
		colorUpland    (0.383, 0.381, 0.381, 0.000)
		colorRock      (0.401, 0.400, 0.399, 0.000)
		colorSnow      (0.419, 0.418, 0.417, 1.000)
		BumpHeight      10.3335
		BumpOffset      2.0667
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
		SemiMajorAxis   2.712
		Period          465.309
		Eccentricity    0.218225
		Inclination     31.2869
		AscendingNode   64.126
		ArgOfPericenter -120.769
		MeanAnomaly     69.8306
	}
}

DwarfMoon	"Japrael System 6.D7"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            6.0021e-010
	Radius          12.2703
	InertiaMoment   0.399576

	RotationPeriod  1322.96
	Obliquity       20.6694
	EqAscendNode    154.748

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.572 0.567 0.561)

	Surface
	{
		SurfStyle       0.777544
		OceanStyle      0.186561
		Randomize      (-0.400, 0.563, -0.381)
		colorDistMagn   0.462153
		colorDistFreq   0.122524
		detailScale     335.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0.49223
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.479855
		terraceProb     0.207666
		erosion         0
		montesMagn      0.300939
		montesFreq      2.66168
		montesSpiky     0.972114
		montesFraction  0.443252
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.376988
		hillsFraction   0.465365
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.190489
		craterFreq      0.247522
		craterDensity   1.03358
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512316
		volcanoTemp     1191.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.223, 0.193, 0.157, 0.000)
		colorShelf     (0.229, 0.199, 0.180, 0.000)
		colorBeach     (0.269, 0.233, 0.213, 0.000)
		colorDesert    (0.291, 0.250, 0.208, 0.000)
		colorLowland   (0.320, 0.267, 0.236, 0.000)
		colorUpland    (0.354, 0.323, 0.286, 0.000)
		colorRock      (0.383, 0.352, 0.309, 0.000)
		colorSnow      (0.417, 0.374, 0.326, 1.000)
		BumpHeight      11.0432
		BumpOffset      2.20865
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
		SemiMajorAxis   2.7124
		Period          465.412
		Eccentricity    0.117988
		Inclination     -9.45637
		AscendingNode   154.753
		ArgOfPericenter -42.2874
		MeanAnomaly     79.1094
	}
}

DwarfMoon	"Japrael System 6.D8"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            8.76315e-010
	Radius          13.3537
	InertiaMoment   0.39733

	RotationPeriod  1188.28
	Obliquity       -37.5433
	EqAscendNode    -133.13

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.795 0.793 0.792)

	Surface
	{
		SurfStyle       0.869759
		OceanStyle      0.0517563
		Randomize      (0.556, -0.310, 0.721)
		colorDistMagn   0.954065
		colorDistFreq   0.136326
		detailScale     364.644
		colorConversion true
		snowLevel       2
		tropicLatitude  0.90328
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.278966
		terraceProb     0.331497
		erosion         0
		montesMagn      0.497922
		montesFreq      1.72949
		montesSpiky     0.811911
		montesFraction  0.699459
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.303302
		hillsFraction   0.45753
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225685
		craterFreq      0.217517
		craterDensity   0.872136
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.467716
		volcanoTemp     1693.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.278, 0.317, 0.050)
		colorShelf     (0.318, 0.325, 0.364, 0.040)
		colorBeach     (0.366, 0.373, 0.412, 0.030)
		colorDesert    (0.414, 0.421, 0.467, 0.020)
		colorLowland   (0.461, 0.468, 0.515, 0.030)
		colorUpland    (0.509, 0.516, 0.562, 0.050)
		colorRock      (0.557, 0.563, 0.625, 0.020)
		colorSnow      (0.557, 0.563, 0.625, 1.000)
		BumpHeight      12.0183
		BumpOffset      2.40366
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
		SemiMajorAxis   2.71267
		Period          465.482
		Eccentricity    0.276279
		Inclination     -81.6671
		AscendingNode   -121.401
		ArgOfPericenter -55.1335
		MeanAnomaly     -166.248
	}
}

DwarfMoon	"Japrael System 6.D9"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            1.2605e-009
	Radius          14.4232
	InertiaMoment   0.39875

	RotationPeriod  1072.11
	Obliquity       -60.8106
	EqAscendNode    -44.017

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.450 0.446 0.440)

	Surface
	{
		SurfStyle       0.269945
		OceanStyle      0.0722276
		Randomize      (0.667, -0.352, 0.023)
		colorDistMagn   0.264143
		colorDistFreq   0.168722
		detailScale     393.851
		colorConversion true
		snowLevel       2
		tropicLatitude  0.866043
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.637599
		terraceProb     0.50823
		erosion         0
		montesMagn      0.685819
		montesFreq      3.03427
		montesSpiky     0.779553
		montesFraction  0.871522
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.379661
		hillsFraction   0.454649
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.276293
		craterFreq      0.228749
		craterDensity   0.904249
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.450782
		volcanoTemp     1723.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.180, 0.178, 0.176, 0.000)
		colorShelf     (0.191, 0.190, 0.187, 0.000)
		colorBeach     (0.202, 0.201, 0.198, 0.000)
		colorDesert    (0.214, 0.212, 0.209, 0.000)
		colorLowland   (0.225, 0.223, 0.220, 0.000)
		colorUpland    (0.236, 0.234, 0.231, 0.000)
		colorRock      (0.247, 0.245, 0.242, 0.000)
		colorSnow      (0.259, 0.256, 0.253, 1.000)
		BumpHeight      12.9809
		BumpOffset      2.59618
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
		SemiMajorAxis   2.71295
		Period          465.554
		Eccentricity    0.382047
		Inclination     1.06755
		AscendingNode   -40.5655
		ArgOfPericenter 30.2264
		MeanAnomaly     175.565
	}
}

DwarfMoon	"Japrael System 6.D10"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            1.79073e-009
	Radius          19.203
	InertiaMoment   0.399703

	RotationPeriod  1198.93
	Obliquity       -43.8206
	EqAscendNode    21.5536

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.624 0.622 0.620)

	Surface
	{
		SurfStyle       0.593859
		OceanStyle      0.0844207
		Randomize      (0.008, 0.741, 0.452)
		colorDistMagn   0.817608
		colorDistFreq   0.240169
		detailScale     524.369
		colorConversion true
		snowLevel       2
		tropicLatitude  0.905373
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.353033
		terraceProb     0.114811
		erosion         0
		montesMagn      0.586343
		montesFreq      2.71004
		montesSpiky     0.936224
		montesFraction  0.77497
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.18223
		hillsFraction   0.568453
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247201
		craterFreq      0.203659
		craterDensity   0.986063
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.426844
		volcanoTemp     1521.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.243, 0.212, 0.174, 0.000)
		colorShelf     (0.250, 0.218, 0.198, 0.000)
		colorBeach     (0.293, 0.255, 0.236, 0.000)
		colorDesert    (0.318, 0.274, 0.229, 0.000)
		colorLowland   (0.349, 0.292, 0.260, 0.000)
		colorUpland    (0.387, 0.355, 0.316, 0.000)
		colorRock      (0.418, 0.386, 0.341, 0.000)
		colorSnow      (0.455, 0.411, 0.359, 1.000)
		BumpHeight      17.2827
		BumpOffset      3.45654
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
		SemiMajorAxis   2.71341
		Period          465.674
		Eccentricity    0.483032
		Inclination     -75.9405
		AscendingNode   26.7281
		ArgOfPericenter -146.583
		MeanAnomaly     129.15
	}
}

DwarfMoon	"Japrael System 6.D11"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            2.51773e-009
	Radius          19.9237
	InertiaMoment   0.397608

	RotationPeriod  1046.4
	Obliquity       -39.4826
	EqAscendNode    -33.9892

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.413 0.411 0.408)

	Surface
	{
		SurfStyle       0.401002
		OceanStyle      0.513081
		Randomize      (0.196, -0.544, 0.622)
		colorDistMagn   0.851491
		colorDistFreq   0.260762
		detailScale     544.051
		colorConversion true
		snowLevel       2
		tropicLatitude  0.691804
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.306904
		terraceProb     0.555346
		erosion         0
		montesMagn      0.525845
		montesFreq      2.17452
		montesSpiky     0.815353
		montesFraction  0.547522
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.943104
		hillsFraction   0.629475
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254341
		craterFreq      0.213525
		craterDensity   0.908972
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509416
		volcanoTemp     1449.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.165, 0.164, 0.163, 0.000)
		colorShelf     (0.175, 0.175, 0.174, 0.000)
		colorBeach     (0.186, 0.185, 0.184, 0.000)
		colorDesert    (0.196, 0.195, 0.194, 0.000)
		colorLowland   (0.206, 0.205, 0.204, 0.000)
		colorUpland    (0.217, 0.216, 0.214, 0.000)
		colorRock      (0.227, 0.226, 0.225, 0.000)
		colorSnow      (0.237, 0.236, 0.235, 1.000)
		BumpHeight      17.9314
		BumpOffset      3.58627
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
		SemiMajorAxis   2.71384
		Period          465.784
		Eccentricity    0.467218
		Inclination     -5.6005
		AscendingNode   -42.0917
		ArgOfPericenter -12.9571
		MeanAnomaly     -48.6436
	}
}

DwarfMoon	"Japrael System 6.D12"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            3.50941e-009
	Radius          21.3253
	InertiaMoment   0.398898

	RotationPeriod  950.24
	Obliquity       -41.334
	EqAscendNode    -100.489

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.609 0.605 0.604)

	Surface
	{
		SurfStyle       0.794634
		OceanStyle      0.559128
		Randomize      (0.118, -0.797, 0.609)
		colorDistMagn   0.309506
		colorDistFreq   0.073369
		detailScale     582.322
		colorConversion true
		snowLevel       2
		tropicLatitude  0.849737
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.521082
		terraceProb     0.243752
		erosion         0
		montesMagn      0.572173
		montesFreq      3.96901
		montesSpiky     0.994775
		montesFraction  0.724034
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.35718
		hillsFraction   0.675682
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245896
		craterFreq      0.231902
		craterDensity   0.864192
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468872
		volcanoTemp     1291.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.206, 0.169, 0.000)
		colorShelf     (0.243, 0.212, 0.193, 0.000)
		colorBeach     (0.286, 0.248, 0.229, 0.000)
		colorDesert    (0.310, 0.266, 0.223, 0.000)
		colorLowland   (0.341, 0.284, 0.254, 0.000)
		colorUpland    (0.377, 0.345, 0.308, 0.000)
		colorRock      (0.408, 0.375, 0.332, 0.000)
		colorSnow      (0.444, 0.399, 0.350, 1.000)
		BumpHeight      19.1927
		BumpOffset      3.83855
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
		SemiMajorAxis   2.71433
		Period          465.911
		Eccentricity    0.450521
		Inclination     -61.4498
		AscendingNode   -106.869
		ArgOfPericenter 112.082
		MeanAnomaly     -116.764
	}
}

DwarfMoon	"Japrael System 6.D13"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            4.85675e-009
	Radius          22.7797
	InertiaMoment   0.399828

	RotationPeriod  863.881
	Obliquity       -73.604
	EqAscendNode    7.20219

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.634 0.630 0.625)

	Surface
	{
		SurfStyle       0.711512
		OceanStyle      0.0975521
		Randomize      (0.055, 0.339, 0.946)
		colorDistMagn   0.358096
		colorDistFreq   0.305117
		detailScale     622.037
		colorConversion true
		snowLevel       2
		tropicLatitude  0.626038
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.489433
		terraceProb     0.458521
		erosion         0
		montesMagn      0.40364
		montesFreq      3.81591
		montesSpiky     0.914599
		montesFraction  0.439613
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.6163
		hillsFraction   0.656515
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.278027
		craterFreq      0.262658
		craterDensity   0.907577
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471663
		volcanoTemp     1635.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.214, 0.175, 0.000)
		colorShelf     (0.254, 0.220, 0.200, 0.000)
		colorBeach     (0.298, 0.258, 0.237, 0.000)
		colorDesert    (0.323, 0.277, 0.231, 0.000)
		colorLowland   (0.355, 0.296, 0.262, 0.000)
		colorUpland    (0.393, 0.359, 0.319, 0.000)
		colorRock      (0.425, 0.390, 0.344, 0.000)
		colorSnow      (0.463, 0.416, 0.362, 1.000)
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
		SemiMajorAxis   2.71469
		Period          466.003
		Eccentricity    0.0707421
		Inclination     -67.7179
		AscendingNode   2.54576
		ArgOfPericenter 5.77256
		MeanAnomaly     4.49615
	}
}

DwarfMoon	"Japrael System 6.D14"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            6.68207e-009
	Radius          30.5851
	InertiaMoment   0.397847

	RotationPeriod  986.344
	Obliquity       86.6374
	EqAscendNode    8.99202

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.609 0.601 0.597)

	Surface
	{
		SurfStyle       0.0953983
		OceanStyle      0.101222
		Randomize      (-0.022, -0.703, -0.316)
		colorDistMagn   0.936471
		colorDistFreq   0.512078
		detailScale     835.176
		colorConversion true
		snowLevel       2
		tropicLatitude  0.819955
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.391472
		terraceProb     0.272262
		erosion         0
		montesMagn      0.558759
		montesFreq      3.93346
		montesSpiky     0.984012
		montesFraction  0.121081
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.75651
		hillsFraction   0.729272
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.210026
		craterFreq      0.262262
		craterDensity   0.921052
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.517995
		volcanoTemp     1801.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.244, 0.240, 0.239, 0.000)
		colorShelf     (0.259, 0.255, 0.254, 0.000)
		colorBeach     (0.274, 0.270, 0.269, 0.000)
		colorDesert    (0.289, 0.285, 0.284, 0.000)
		colorLowland   (0.304, 0.300, 0.299, 0.000)
		colorUpland    (0.320, 0.315, 0.314, 0.000)
		colorRock      (0.335, 0.330, 0.329, 0.000)
		colorSnow      (0.350, 0.345, 0.343, 1.000)
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
		SemiMajorAxis   2.71501
		Period          466.086
		Eccentricity    0.187756
		Inclination     38.5254
		AscendingNode   6.05861
		ArgOfPericenter 102.007
		MeanAnomaly     110.45
	}
}

DwarfMoon	"Japrael System 6.D15"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            9.1502e-009
	Radius          30.8549
	InertiaMoment   0.399041

	RotationPeriod  851.655
	Obliquity       38.581
	EqAscendNode    -118.189

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.668 0.664 0.663)

	Surface
	{
		SurfStyle       0.816333
		OceanStyle      0.439752
		Randomize      (-0.536, 0.999, -0.331)
		colorDistMagn   0.808903
		colorDistFreq   0.735938
		detailScale     842.545
		colorConversion true
		snowLevel       2
		tropicLatitude  0.568492
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.452172
		terraceProb     0.391823
		erosion         0
		montesMagn      0.387766
		montesFreq      2.9378
		montesSpiky     0.888889
		montesFraction  0.523064
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.48434
		hillsFraction   0.686989
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224714
		craterFreq      0.249873
		craterDensity   0.82849
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515618
		volcanoTemp     1627.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.226, 0.186, 0.000)
		colorShelf     (0.267, 0.232, 0.212, 0.000)
		colorBeach     (0.314, 0.272, 0.252, 0.000)
		colorDesert    (0.340, 0.292, 0.245, 0.000)
		colorLowland   (0.374, 0.312, 0.278, 0.000)
		colorUpland    (0.414, 0.379, 0.338, 0.000)
		colorRock      (0.447, 0.412, 0.364, 0.000)
		colorSnow      (0.487, 0.438, 0.384, 1.000)
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
		SemiMajorAxis   2.71546
		Period          466.2
		Eccentricity    0.489961
		Inclination     16.4711
		AscendingNode   -114.399
		ArgOfPericenter -175.779
		MeanAnomaly     -28.5257
	}
}

DwarfMoon	"Japrael System 6.D16"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            1.24842e-008
	Radius          32.7376
	InertiaMoment   0.399954

	RotationPeriod  774.521
	Obliquity       38.0306
	EqAscendNode    -0.619784

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.530 0.525 0.523)

	Surface
	{
		SurfStyle       0.545025
		OceanStyle      0.400421
		Randomize      (0.873, -0.078, 0.840)
		colorDistMagn   0.891699
		colorDistFreq   0.272299
		detailScale     893.956
		colorConversion true
		snowLevel       2
		tropicLatitude  0.983513
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.400512
		terraceProb     0.108175
		erosion         0
		montesMagn      0.568909
		montesFreq      2.10775
		montesSpiky     0.831506
		montesFraction  0.498322
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.69888
		hillsFraction   0.693675
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226971
		craterFreq      0.224636
		craterDensity   1.0402
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524664
		volcanoTemp     1202.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.179, 0.146, 0.000)
		colorShelf     (0.212, 0.184, 0.167, 0.000)
		colorBeach     (0.249, 0.215, 0.199, 0.000)
		colorDesert    (0.271, 0.231, 0.193, 0.000)
		colorLowland   (0.297, 0.247, 0.220, 0.000)
		colorUpland    (0.329, 0.299, 0.267, 0.000)
		colorRock      (0.355, 0.326, 0.288, 0.000)
		colorSnow      (0.387, 0.347, 0.303, 1.000)
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
		SemiMajorAxis   2.71589
		Period          466.313
		Eccentricity    0.00697105
		Inclination     41.9227
		AscendingNode   -10.1072
		ArgOfPericenter 170.784
		MeanAnomaly     -25.0423
	}
}

DwarfMoon	"Japrael System 6.D17"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            1.69874e-008
	Radius          34.8143
	InertiaMoment   0.398058

	RotationPeriod  704.44
	Obliquity       11.2081
	EqAscendNode    164.475

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.648 0.645 0.642)

	Surface
	{
		SurfStyle       0.470327
		OceanStyle      0.55919
		Randomize      (-0.156, -0.987, -0.293)
		colorDistMagn   0.967904
		colorDistFreq   0.440512
		detailScale     950.662
		colorConversion true
		snowLevel       2
		tropicLatitude  0.175688
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.482405
		terraceProb     0.17527
		erosion         0
		montesMagn      0.554726
		montesFreq      3.17271
		montesSpiky     0.817122
		montesFraction  0.573389
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.59705
		hillsFraction   0.395499
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245101
		craterFreq      0.186417
		craterDensity   0.975356
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.503738
		volcanoTemp     1139.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.259, 0.258, 0.257, 0.000)
		colorShelf     (0.275, 0.274, 0.273, 0.000)
		colorBeach     (0.291, 0.290, 0.289, 0.000)
		colorDesert    (0.308, 0.306, 0.305, 0.000)
		colorLowland   (0.324, 0.322, 0.321, 0.000)
		colorUpland    (0.340, 0.338, 0.337, 0.000)
		colorRock      (0.356, 0.354, 0.353, 0.000)
		colorSnow      (0.372, 0.371, 0.369, 1.000)
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
		SemiMajorAxis   2.71619
		Period          466.389
		Eccentricity    0.0285628
		Inclination     1.10212
		AscendingNode   171.71
		ArgOfPericenter 112.89
		MeanAnomaly     -10.2427
	}
}

DwarfMoon	"Japrael System 6.S1"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            1.55988e-012
	Radius          1.99927
	InertiaMoment   0.399179

	Oblateness      0.249

	Obliquity       1.37031
	EqAscendNode    84.96
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.749 0.684 0.571)

	Surface
	{
		SurfStyle       0.273602
		OceanStyle      0.3701
		Randomize      (0.608, -0.843, -0.488)
		colorDistMagn   0.664762
		colorDistFreq   0.00306706
		detailScale     54.5935
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0352692
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.423696
		terraceProb     0.281493
		erosion         0
		montesMagn      0.604453
		montesFreq      3.07061
		montesSpiky     0.899981
		montesFraction  0.636663
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00798733
		hillsFraction   0.535573
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247002
		craterFreq      0.212367
		craterDensity   0.733313
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.491566
		volcanoTemp     1628.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.273, 0.229, 0.000)
		colorShelf     (0.318, 0.291, 0.243, 0.000)
		colorBeach     (0.337, 0.308, 0.257, 0.000)
		colorDesert    (0.356, 0.325, 0.271, 0.000)
		colorLowland   (0.374, 0.342, 0.286, 0.000)
		colorUpland    (0.393, 0.359, 0.300, 0.000)
		colorRock      (0.412, 0.376, 0.314, 0.000)
		colorSnow      (0.430, 0.393, 0.329, 1.000)
		BumpHeight      1.79935
		BumpOffset      0.359869
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
		SemiMajorAxis   0.000307548
		Period          0.000561923
		Eccentricity    0
		Inclination     1.37031
		AscendingNode   84.96
		ArgOfPericenter 2.77227
		MeanAnomaly     129.507
	}
}

DwarfMoon	"Japrael System 6.S2"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            2.20836e-012
	Radius          1.93616
	InertiaMoment   0.395695

	Oblateness      0.249

	Obliquity       0.980415
	EqAscendNode    124.949
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.511 0.506 0.500)

	Surface
	{
		SurfStyle       0.44963
		OceanStyle      0.570621
		Randomize      (-0.268, 0.948, -0.255)
		colorDistMagn   0.0980855
		colorDistFreq   0.00148356
		detailScale     52.8701
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0158141
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.661382
		terraceProb     0.463663
		erosion         0
		montesMagn      0.460446
		montesFreq      2.2251
		montesSpiky     0.872779
		montesFraction  0.526704
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00860702
		hillsFraction   0.503431
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2712
		craterFreq      0.22404
		craterDensity   0.832182
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.582997
		volcanoTemp     1359.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.204, 0.202, 0.200, 0.000)
		colorShelf     (0.217, 0.215, 0.212, 0.000)
		colorBeach     (0.230, 0.228, 0.225, 0.000)
		colorDesert    (0.243, 0.240, 0.237, 0.000)
		colorLowland   (0.256, 0.253, 0.250, 0.000)
		colorUpland    (0.268, 0.266, 0.262, 0.000)
		colorRock      (0.281, 0.278, 0.275, 0.000)
		colorSnow      (0.294, 0.291, 0.287, 1.000)
		BumpHeight      1.74255
		BumpOffset      0.348509
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
		SemiMajorAxis   0.000318138
		Period          0.000591196
		Eccentricity    0
		Inclination     0.980415
		AscendingNode   124.949
		ArgOfPericenter -12.1814
		MeanAnomaly     113.273
	}
}

DwarfMoon	"Japrael System 6.S3"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            3.13557e-012
	Radius          2.07731
	InertiaMoment   0.398249

	Oblateness      0.249

	Obliquity       -1.45134
	EqAscendNode    134.586
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.542 0.382 0.316)

	Surface
	{
		SurfStyle       0.382545
		OceanStyle      0.346625
		Randomize      (0.826, 0.780, 0.818)
		colorDistMagn   0.20654
		colorDistFreq   0.000547741
		detailScale     56.7244
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0195517
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.314394
		terraceProb     0.296261
		erosion         0
		montesMagn      0.568175
		montesFreq      1.85727
		montesSpiky     0.98539
		montesFraction  0.417091
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00767294
		hillsFraction   0.553022
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258893
		craterFreq      0.224017
		craterDensity   0.974646
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50241
		volcanoTemp     1409.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.153, 0.126, 0.000)
		colorShelf     (0.231, 0.162, 0.134, 0.000)
		colorBeach     (0.244, 0.172, 0.142, 0.000)
		colorDesert    (0.258, 0.181, 0.150, 0.000)
		colorLowland   (0.271, 0.191, 0.158, 0.000)
		colorUpland    (0.285, 0.200, 0.166, 0.000)
		colorRock      (0.298, 0.210, 0.174, 0.000)
		colorSnow      (0.312, 0.219, 0.182, 1.000)
		BumpHeight      1.86958
		BumpOffset      0.373916
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
		SemiMajorAxis   0.00033496
		Period          0.0006387
		Eccentricity    0
		Inclination     -1.45134
		AscendingNode   134.586
		ArgOfPericenter 0.28818
		MeanAnomaly     150.394
	}
}

DwarfMoon	"Japrael System 6.S4"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            4.47124e-012
	Radius          2.24538
	InertiaMoment   0.399313

	Oblateness      0.249

	Obliquity       -0.937706
	EqAscendNode    122.444
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.648 0.642 0.638)

	Surface
	{
		SurfStyle       0.754705
		OceanStyle      0.205643
		Randomize      (0.211, 0.266, -0.772)
		colorDistMagn   0.72824
		colorDistFreq   0.00332779
		detailScale     61.3139
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0157575
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.301306
		terraceProb     0.132729
		erosion         0
		montesMagn      0.354081
		montesFreq      3.00508
		montesSpiky     0.97248
		montesFraction  0.364265
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00919564
		hillsFraction   0.55854
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254329
		craterFreq      0.186173
		craterDensity   0.95324
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.455385
		volcanoTemp     1384.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.218, 0.179, 0.000)
		colorShelf     (0.259, 0.225, 0.204, 0.000)
		colorBeach     (0.304, 0.263, 0.243, 0.000)
		colorDesert    (0.330, 0.283, 0.236, 0.000)
		colorLowland   (0.363, 0.302, 0.268, 0.000)
		colorUpland    (0.402, 0.366, 0.326, 0.000)
		colorRock      (0.434, 0.398, 0.351, 0.000)
		colorSnow      (0.473, 0.424, 0.370, 1.000)
		BumpHeight      2.02084
		BumpOffset      0.404169
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
		SemiMajorAxis   0.000355285
		Period          0.000697707
		Eccentricity    0
		Inclination     -0.937706
		AscendingNode   122.444
		ArgOfPericenter -112.404
		MeanAnomaly     121.973
	}
}

DwarfMoon	"Japrael System 6.S5"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            6.41289e-012
	Radius          2.3542
	InertiaMoment   0.396512

	Oblateness      0.249

	Obliquity       -1.31867
	EqAscendNode    -163.852
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.454 0.451 0.448)

	Surface
	{
		SurfStyle       0.282163
		OceanStyle      0.285408
		Randomize      (0.844, -0.570, 0.216)
		colorDistMagn   0.68359
		colorDistFreq   0.00483754
		detailScale     64.2854
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00646854
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.667038
		terraceProb     0.340672
		erosion         0
		montesMagn      0.497398
		montesFreq      2.72053
		montesSpiky     0.842793
		montesFraction  0.391917
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00952652
		hillsFraction   0.667964
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231479
		craterFreq      0.240906
		craterDensity   0.894004
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532015
		volcanoTemp     1310.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.182, 0.180, 0.179, 0.000)
		colorShelf     (0.193, 0.192, 0.190, 0.000)
		colorBeach     (0.204, 0.203, 0.201, 0.000)
		colorDesert    (0.216, 0.214, 0.213, 0.000)
		colorLowland   (0.227, 0.226, 0.224, 0.000)
		colorUpland    (0.238, 0.237, 0.235, 0.000)
		colorRock      (0.250, 0.248, 0.246, 0.000)
		colorSnow      (0.261, 0.259, 0.257, 1.000)
		BumpHeight      2.11878
		BumpOffset      0.423756
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
		SemiMajorAxis   0.000360341
		Period          0.000712654
		Eccentricity    0
		Inclination     -1.31867
		AscendingNode   -163.852
		ArgOfPericenter 122.037
		MeanAnomaly     -117.518
	}
}

DwarfMoon	"Japrael System 6.S6"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            9.26651e-012
	Radius          3.14995
	InertiaMoment   0.398425

	Oblateness      0.249

	Obliquity       -1.29273
	EqAscendNode    -73.5092
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.612 0.607 0.604)

	Surface
	{
		SurfStyle       0.705142
		OceanStyle      0.0128329
		Randomize      (-0.712, 0.077, 0.899)
		colorDistMagn   0.171361
		colorDistFreq   0.00536288
		detailScale     86.0145
		colorConversion true
		snowLevel       2
		tropicLatitude  0.036145
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.424146
		terraceProb     0.518564
		erosion         0
		montesMagn      0.660836
		montesFreq      2.49146
		montesSpiky     0.793431
		montesFraction  0.343033
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0227051
		hillsFraction   0.551726
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246305
		craterFreq      0.223716
		craterDensity   0.896324
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471635
		volcanoTemp     1334.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.239, 0.206, 0.169, 0.000)
		colorShelf     (0.245, 0.213, 0.193, 0.000)
		colorBeach     (0.288, 0.249, 0.229, 0.000)
		colorDesert    (0.312, 0.267, 0.223, 0.000)
		colorLowland   (0.343, 0.285, 0.254, 0.000)
		colorUpland    (0.379, 0.346, 0.308, 0.000)
		colorRock      (0.410, 0.377, 0.332, 0.000)
		colorSnow      (0.447, 0.401, 0.350, 1.000)
		BumpHeight      2.83495
		BumpOffset      0.56699
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
		SemiMajorAxis   0.000372872
		Period          0.000750149
		Eccentricity    0
		Inclination     -1.29273
		AscendingNode   -73.5092
		ArgOfPericenter 108.554
		MeanAnomaly     49.6992
	}
}

DwarfMoon	"Japrael System 6.S7"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            1.35156e-011
	Radius          3.40035
	InertiaMoment   0.399444

	Oblateness      0.249

	Obliquity       1.08322
	EqAscendNode    -75.0153
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.653 0.650 0.645)

	Surface
	{
		SurfStyle       0.421155
		OceanStyle      0.919132
		Randomize      (0.013, 0.330, -0.994)
		colorDistMagn   0.441909
		colorDistFreq   0.00368661
		detailScale     92.8521
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0299892
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.44291
		terraceProb     0.27547
		erosion         0
		montesMagn      0.479785
		montesFreq      2.2984
		montesSpiky     0.773037
		montesFraction  0.613075
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0194735
		hillsFraction   0.588257
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.225462
		craterFreq      0.206934
		craterDensity   0.924089
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484726
		volcanoTemp     1730.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.261, 0.260, 0.258, 0.000)
		colorShelf     (0.278, 0.276, 0.274, 0.000)
		colorBeach     (0.294, 0.293, 0.290, 0.000)
		colorDesert    (0.310, 0.309, 0.306, 0.000)
		colorLowland   (0.327, 0.325, 0.323, 0.000)
		colorUpland    (0.343, 0.341, 0.339, 0.000)
		colorRock      (0.359, 0.358, 0.355, 0.000)
		colorSnow      (0.376, 0.374, 0.371, 1.000)
		BumpHeight      3.06031
		BumpOffset      0.612062
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
		SemiMajorAxis   0.000396836
		Period          0.000823618
		Eccentricity    0
		Inclination     1.08322
		AscendingNode   -75.0153
		ArgOfPericenter 113.062
		MeanAnomaly     158.07
	}
}

DwarfMoon	"Japrael System 6.S8"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            1.99423e-011
	Radius          3.71856
	InertiaMoment   0.39698

	Oblateness      0.249

	Obliquity       -0.549534
	EqAscendNode    55.1588
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.412 0.408 0.407)

	Surface
	{
		SurfStyle       0.786178
		OceanStyle      0.353732
		Randomize      (-0.699, 0.112, -0.813)
		colorDistMagn   0.754755
		colorDistFreq   0.00701036
		detailScale     101.541
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0170018
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.608487
		terraceProb     0.765211
		erosion         0
		montesMagn      0.368099
		montesFreq      3.7746
		montesSpiky     0.911286
		montesFraction  0.501578
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0276108
		hillsFraction   0.645997
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.206425
		craterFreq      0.260454
		craterDensity   0.877775
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518576
		volcanoTemp     1193.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.161, 0.139, 0.114, 0.000)
		colorShelf     (0.165, 0.143, 0.130, 0.000)
		colorBeach     (0.194, 0.167, 0.155, 0.000)
		colorDesert    (0.210, 0.180, 0.151, 0.000)
		colorLowland   (0.231, 0.192, 0.171, 0.000)
		colorUpland    (0.256, 0.233, 0.208, 0.000)
		colorRock      (0.276, 0.253, 0.224, 0.000)
		colorSnow      (0.301, 0.270, 0.236, 1.000)
		BumpHeight      3.3467
		BumpOffset      0.66934
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
		SemiMajorAxis   0.000412933
		Period          0.000874232
		Eccentricity    0
		Inclination     -0.549534
		AscendingNode   55.1588
		ArgOfPericenter 125.312
		MeanAnomaly     -87.7054
	}
}

DwarfMoon	"Japrael System 6.S9"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            2.98449e-011
	Radius          4.01321
	InertiaMoment   0.39859

	Oblateness      0.249

	Obliquity       1.07256
	EqAscendNode    127.613
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.765 0.761 0.759)

	Surface
	{
		SurfStyle       0.279246
		OceanStyle      0.391464
		Randomize      (0.916, 0.633, -0.550)
		colorDistMagn   0.910947
		colorDistFreq   0.0116969
		detailScale     109.587
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0165254
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.563891
		terraceProb     0.399058
		erosion         0
		montesMagn      0.53142
		montesFreq      1.90129
		montesSpiky     0.834615
		montesFraction  0.833403
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0276748
		hillsFraction   0.471469
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.209615
		craterFreq      0.181293
		craterDensity   0.928521
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.534618
		volcanoTemp     1313.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.306, 0.305, 0.303, 0.000)
		colorShelf     (0.325, 0.324, 0.322, 0.000)
		colorBeach     (0.344, 0.343, 0.341, 0.000)
		colorDesert    (0.363, 0.362, 0.360, 0.000)
		colorLowland   (0.382, 0.381, 0.379, 0.000)
		colorUpland    (0.401, 0.400, 0.398, 0.000)
		colorRock      (0.421, 0.419, 0.417, 0.000)
		colorSnow      (0.440, 0.438, 0.436, 1.000)
		BumpHeight      3.61189
		BumpOffset      0.722378
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
		SemiMajorAxis   0.000427825
		Period          0.00092195
		Eccentricity    0
		Inclination     1.07256
		AscendingNode   127.613
		ArgOfPericenter -24.1185
		MeanAnomaly     -162.714
	}
}

DwarfMoon	"Japrael System 6.S10"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            4.54492e-011
	Radius          5.40403
	InertiaMoment   0.399573

	Oblateness      0.249

	Obliquity       0.024803
	EqAscendNode    38.1574
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.657 0.653 0.649)

	Surface
	{
		SurfStyle       0.186032
		OceanStyle      0.84032
		Randomize      (-0.671, 0.946, -0.022)
		colorDistMagn   0.496634
		colorDistFreq   0.0203016
		detailScale     147.566
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000845728
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.319896
		terraceProb     0.123105
		erosion         0
		montesMagn      0.40231
		montesFreq      2.36113
		montesSpiky     0.911189
		montesFraction  0.341967
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0656635
		hillsFraction   0.47083
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246468
		craterFreq      0.175536
		craterDensity   0.793939
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.554111
		volcanoTemp     1591.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.263, 0.261, 0.260, 0.000)
		colorShelf     (0.279, 0.277, 0.276, 0.000)
		colorBeach     (0.296, 0.294, 0.292, 0.000)
		colorDesert    (0.312, 0.310, 0.308, 0.000)
		colorLowland   (0.328, 0.326, 0.324, 0.000)
		colorUpland    (0.345, 0.343, 0.341, 0.000)
		colorRock      (0.361, 0.359, 0.357, 0.000)
		colorSnow      (0.378, 0.375, 0.373, 1.000)
		BumpHeight      4.86363
		BumpOffset      0.972726
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
		SemiMajorAxis   0.000430594
		Period          0.000930914
		Eccentricity    0
		Inclination     0.024803
		AscendingNode   38.1574
		ArgOfPericenter 6.9292
		MeanAnomaly     -75.5916
	}
}

DwarfMoon	"Japrael System 6.S11"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            7.07123e-011
	Radius          5.93823
	InertiaMoment   0.397324

	Oblateness      0.249

	Obliquity       -1.03741
	EqAscendNode    -57.1986
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.437 0.427 0.424)

	Surface
	{
		SurfStyle       0.928734
		OceanStyle      0.0289554
		Randomize      (-0.005, -0.130, -0.508)
		colorDistMagn   0.803264
		colorDistFreq   0.00349986
		detailScale     162.153
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0317887
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.269677
		terraceProb     0.280563
		erosion         0
		montesMagn      0.489996
		montesFreq      2.93244
		montesSpiky     0.88006
		montesFraction  0.197424
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0911022
		hillsFraction   0.800984
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224514
		craterFreq      0.195773
		craterDensity   0.934493
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518542
		volcanoTemp     1316.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.149, 0.150, 0.170, 0.050)
		colorShelf     (0.175, 0.175, 0.195, 0.040)
		colorBeach     (0.201, 0.201, 0.221, 0.030)
		colorDesert    (0.227, 0.226, 0.250, 0.020)
		colorLowland   (0.253, 0.252, 0.276, 0.030)
		colorUpland    (0.280, 0.278, 0.301, 0.050)
		colorRock      (0.306, 0.303, 0.335, 0.020)
		colorSnow      (0.306, 0.303, 0.335, 1.000)
		BumpHeight      5.3444
		BumpOffset      1.06888
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
		SemiMajorAxis   0.000443788
		Period          0.000974028
		Eccentricity    0
		Inclination     -1.03741
		AscendingNode   -57.1986
		ArgOfPericenter -170.337
		MeanAnomaly     -13.3936
	}
}

DwarfMoon	"Japrael System 6.S12"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            1.12992e-010
	Radius          6.66824
	InertiaMoment   0.398746

	Oblateness      0.249

	Obliquity       0.598415
	EqAscendNode    14.8553
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.489 0.406 0.360)

	Surface
	{
		SurfStyle       0.893797
		OceanStyle      0.458233
		Randomize      (0.367, 0.807, -0.079)
		colorDistMagn   0.0969406
		colorDistFreq   0.0278777
		detailScale     182.087
		colorConversion true
		snowLevel       2
		tropicLatitude  0.020712
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.660893
		terraceProb     0.126319
		erosion         0
		montesMagn      0.453856
		montesFreq      3.95519
		montesSpiky     0.982886
		montesFraction  0.604316
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.120496
		hillsFraction   0.775605
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233887
		craterFreq      0.223475
		craterDensity   1.03493
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.538857
		volcanoTemp     1220.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.166, 0.142, 0.144, 0.050)
		colorShelf     (0.195, 0.166, 0.166, 0.040)
		colorBeach     (0.225, 0.191, 0.187, 0.030)
		colorDesert    (0.254, 0.215, 0.212, 0.020)
		colorLowland   (0.283, 0.239, 0.234, 0.030)
		colorUpland    (0.313, 0.264, 0.256, 0.050)
		colorRock      (0.342, 0.288, 0.284, 0.020)
		colorSnow      (0.342, 0.288, 0.284, 1.000)
		BumpHeight      6.00142
		BumpOffset      1.20028
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
		SemiMajorAxis   0.00045561
		Period          0.00101321
		Eccentricity    0
		Inclination     0.598415
		AscendingNode   14.8553
		ArgOfPericenter 124.361
		MeanAnomaly     151.529
	}
}

DwarfMoon	"Japrael System 6.S13"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            1.86733e-010
	Radius          7.49056
	InertiaMoment   0.3997

	Oblateness      0.246713

	Obliquity       -0.76669
	EqAscendNode    159.446
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.774 0.771 0.769)

	Surface
	{
		SurfStyle       0.225648
		OceanStyle      0.227344
		Randomize      (-0.458, -0.480, 0.461)
		colorDistMagn   0.349537
		colorDistFreq   0.0287373
		detailScale     204.542
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00477167
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.392913
		terraceProb     0.183037
		erosion         0
		montesMagn      0.50552
		montesFreq      3.5138
		montesSpiky     0.900513
		montesFraction  0.744092
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.158296
		hillsFraction   0.64088
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243668
		craterFreq      0.219183
		craterDensity   0.754605
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504084
		volcanoTemp     1367.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.308, 0.308, 0.000)
		colorShelf     (0.329, 0.328, 0.327, 0.000)
		colorBeach     (0.348, 0.347, 0.346, 0.000)
		colorDesert    (0.368, 0.366, 0.365, 0.000)
		colorLowland   (0.387, 0.385, 0.385, 0.000)
		colorUpland    (0.407, 0.405, 0.404, 0.000)
		colorRock      (0.426, 0.424, 0.423, 0.000)
		colorSnow      (0.445, 0.443, 0.442, 1.000)
		BumpHeight      6.7415
		BumpOffset      1.3483
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
		SemiMajorAxis   0.00047081
		Period          0.00106433
		Eccentricity    0
		Inclination     -0.76669
		AscendingNode   159.446
		ArgOfPericenter -53.2702
		MeanAnomaly     4.12369
	}
}

DwarfMoon	"Japrael System 6.S14"
{
	ParentBody     "Japrael System 6"
	Class	       "Asteroid"

	Mass            3.22282e-010
	Radius          10.4994
	InertiaMoment   0.397603

	Oblateness      0.249

	Obliquity       0.105108
	EqAscendNode    -54.7377
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.775 0.736 0.701)

	Surface
	{
		SurfStyle       0.572376
		OceanStyle      0.601429
		Randomize      (-0.657, -0.709, -0.701)
		colorDistMagn   0.416912
		colorDistFreq   0.018023
		detailScale     286.703
		colorConversion true
		snowLevel       2
		tropicLatitude  0.00325724
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.435124
		terraceProb     0.206397
		erosion         0
		montesMagn      0.663387
		montesFreq      3.81199
		montesSpiky     0.943521
		montesFraction  0.49013
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.218615
		hillsFraction   0.758585
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23798
		craterFreq      0.22412
		craterDensity   0.954085
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.418951
		volcanoTemp     1607.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.302, 0.250, 0.196, 0.000)
		colorShelf     (0.310, 0.258, 0.224, 0.000)
		colorBeach     (0.364, 0.302, 0.267, 0.000)
		colorDesert    (0.395, 0.324, 0.260, 0.000)
		colorLowland   (0.434, 0.346, 0.295, 0.000)
		colorUpland    (0.480, 0.420, 0.358, 0.000)
		colorRock      (0.519, 0.456, 0.386, 0.000)
		colorSnow      (0.565, 0.486, 0.407, 1.000)
		BumpHeight      9.44946
		BumpOffset      1.88989
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
		SemiMajorAxis   0.000480222
		Period          0.0010964
		Eccentricity    0
		Inclination     0.105108
		AscendingNode   -54.7377
		ArgOfPericenter 170.368
		MeanAnomaly     155.208
	}
}

// http://starwars.wikia.com/wiki/Twing
Planet	"Twing/Japrael System 7"
{
	ParentBody     "Prael"
	Class	       "GasGiant"

	Mass            1154.39
	Radius          77262
	InertiaMoment   0.182451

	Oblateness      0.0296645

	RotationPeriod  7.73796
	Obliquity       -0.0331689
	EqAscendNode    143.084

	AlbedoBond      0.455654
	AlbedoGeom      0.546785
	Brightness      2

	Surface
	{
		SurfStyle       0.799064
		Randomize      (-0.878, -0.179, -0.649)
		detailScale     198722
		colorConversion true
		tropicLatitude  0.00799344
		icecapLatitude  0.907993
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     6.54243
		stripeFluct     0.41743
		stripeTwist     12.1558
		cycloneMagn     9.12412
		cycloneFreq     0.850626
		cycloneDensity  0.519587
		cycloneOctaves  5
		colorLayer0    (0.190, 0.430, 0.850, 1.100)
		colorLayer1    (0.170, 0.450, 0.800, 0.600)
		colorLayer2    (0.180, 0.450, 0.830, 0.100)
		colorLayer3    (0.160, 0.460, 0.890, 0.000)
		colorLayer4    (0.180, 0.480, 0.860, 0.000)
		colorLayer5    (0.100, 0.450, 0.830, 0.000)
		colorLayer6    (0.190, 0.440, 0.860, 0.000)
		colorLayer7    (0.180, 0.430, 0.850, 1.000)
		colorLowPlants (0.180, 0.480, 0.860, 0.000)
		colorUpPlants  (0.100, 0.450, 0.830, 0.000)
		BumpHeight      7.13059
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          16.4141
		Velocity        -148.676
		BumpHeight      9.28694
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.883662
		mainOctaves     12
		Coverage        0.0565375
		stripeZones     6.54243
		stripeFluct     0.41743
		stripeTwist     12.1558
	}

	Clouds
	{
		Height          25.7031
		Velocity        1462.22
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.800)
		mainFreq        0.883662
		mainOctaves     12
		Coverage        0.0565375
		stripeZones     6.54243
		stripeFluct     0.41743
		stripeTwist     12.1558
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          100
		Density         7704.34
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.544048
		Saturation      0.975191

		Composition
		{
			H2    	92.6799
			He    	7.27997
			N2    	0.0291427
			O2    	0.00639724
			CH4   	0.00275514
			Ne    	0.00100121
			Ar    	0.000850186
		}
	}

	Aurora
	{
		Height      5469.5
		NorthLat    81.1345
		NorthLon    -87.0707
		NorthRadius 23204.8
		NorthWidth  13605
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -80.9525
		SouthLon    85.3781
		SouthRadius 22472.7
		SouthWidth  9385.73
		SouthRings  3
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     92655.8
		OuterRadius     151098
		RotationPeriod  3.46967
		RotationOffset  0
		FrontBright     0.949036
		BackBright      0.5288
		Density         0.71561
		Brightness      1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   34.28029
		Period          14.0967
		Eccentricity    0.0905971
		Inclination     2.45088
		AscendingNode   -51.0474
		ArgOfPericenter 352.88
		MeanAnomaly     2.14196
	}
}

DwarfMoon	"Japrael System 7.D1"
{
	ParentBody     "Japrael System 7"
	Class	       "Asteroid"

	Mass            1.61427e-010
	Radius          7.34572
	InertiaMoment   0.398019

	Oblateness      0.249

	Obliquity       -0.0148984
	EqAscendNode    -70.0381
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.765 0.676 0.599)

	Surface
	{
		SurfStyle       0.782682
		OceanStyle      0.203657
		Randomize      (-0.805, -0.751, -0.789)
		colorDistMagn   0.796687
		colorDistFreq   0.0232069
		detailScale     200.587
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000488281
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.570874
		terraceProb     0.169869
		erosion         0
		montesMagn      0.580699
		montesFreq      3.05555
		montesSpiky     0.909857
		montesFraction  0.22259
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.119563
		hillsFraction   0.448554
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211576
		craterFreq      0.1922
		craterDensity   1.01409
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.437805
		volcanoTemp     1176.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.230, 0.168, 0.000)
		colorShelf     (0.306, 0.237, 0.192, 0.000)
		colorBeach     (0.360, 0.277, 0.228, 0.000)
		colorDesert    (0.390, 0.297, 0.222, 0.000)
		colorLowland   (0.429, 0.318, 0.251, 0.000)
		colorUpland    (0.475, 0.385, 0.305, 0.000)
		colorRock      (0.513, 0.419, 0.329, 0.000)
		colorSnow      (0.559, 0.446, 0.347, 1.000)
		BumpHeight      6.61115
		BumpOffset      1.32223
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
		SemiMajorAxis   0.00157249
		Period          0.00106141
		Eccentricity    6.70719e-005
		Inclination     -0.0148984
		AscendingNode   -70.0381
		ArgOfPericenter 114.656
		MeanAnomaly     -172.098
	}
}

DwarfMoon	"Japrael System 7.D2"
{
	ParentBody     "Japrael System 7"
	Class	       "Asteroid"

	Mass            2.52831e-010
	Radius          10.4472
	InertiaMoment   0.399153

	Oblateness      0.249

	Obliquity       0.00773845
	EqAscendNode    -1.43014
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.593 0.545 0.494)

	Surface
	{
		SurfStyle       0.418044
		OceanStyle      0.792513
		Randomize      (-0.828, 0.485, -0.192)
		colorDistMagn   0.383027
		colorDistFreq   0.0552335
		detailScale     285.279
		colorConversion true
		snowLevel       2
		tropicLatitude  0.000345267
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.625378
		terraceProb     0.402246
		erosion         0
		montesMagn      0.543006
		montesFreq      2.76156
		montesSpiky     0.978071
		montesFraction  0.679084
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.306702
		hillsFraction   0.597698
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234758
		craterFreq      0.235035
		craterDensity   0.939644
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480367
		volcanoTemp     1485.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.237, 0.218, 0.197, 0.000)
		colorShelf     (0.252, 0.231, 0.210, 0.000)
		colorBeach     (0.267, 0.245, 0.222, 0.000)
		colorDesert    (0.282, 0.259, 0.234, 0.000)
		colorLowland   (0.296, 0.272, 0.247, 0.000)
		colorUpland    (0.311, 0.286, 0.259, 0.000)
		colorRock      (0.326, 0.300, 0.271, 0.000)
		colorSnow      (0.341, 0.313, 0.284, 1.000)
		BumpHeight      9.40251
		BumpOffset      1.8805
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
		SemiMajorAxis   0.00163556
		Period          0.0011259
		Eccentricity    3.56627e-005
		Inclination     0.00773845
		AscendingNode   -1.43014
		ArgOfPericenter -112.665
		MeanAnomaly     -99.8033
	}
}

Moon	"Japrael System 7.1"
{
	ParentBody     "Japrael System 7"
	Class	       "Desert"

	Mass            0.0797301
	Radius          3469.48
	InertiaMoment   0.335892

	Oblateness      0.0053819

	Obliquity       -0.0508532
	EqAscendNode    96.3896
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.469 0.464 0.456)

	Surface
	{
		SurfStyle       0.532056
		OceanStyle      0.0694528
		Randomize      (-0.219, 0.177, -0.837)
		colorDistMagn   0.0766723
		colorDistFreq   360.318
		detailScale     8923.71
		colorConversion true
		seaLevel        0.0874344
		snowLevel       2
		tropicLatitude  0.00119604
		icecapLatitude  0.914092
		icecapHeight    0.0898466
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.352135
		venusFreq       1.00415
		venusMagn       0.440837
		mareFreq        1.39951
		mareDensity     0.0145692
		terraceProb     0.503256
		erosion         0
		montesMagn      0.152505
		montesFreq      175.545
		montesSpiky     0.908112
		montesFraction  0.0662884
		dunesMagn       0.0597289
		dunesFreq       29.9611
		dunesFraction   0.917985
		hillsMagn       0.123796
		hillsFreq       269.994
		hillsFraction   0
		hills2Fraction  0
		riversMagn      60.3847
		riversFreq      3.02861
		riversSin       7.43909
		riversOctaves   0
		canyonsMagn     0.0615711
		canyonsFreq     91.7244
		canyonFraction  0
		cracksMagn      0.117442
		cracksFreq      0.260176
		cracksOctaves   0
		craterMagn      0.552419
		craterFreq      10.6084
		craterDensity   0.324865
		craterOctaves   4.22786
		volcanoMagn     0.632178
		volcanoFreq     0.773518
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.571826
		volcanoRadius   0.544459
		volcanoTemp     1411.43
		lavaCoverTidal  0.453127
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
		Hapke           0.828072
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
		Height          173.474
		Density         0.0171928
		Pressure        0.0164114
		Greenhouse      3.32133
		Bright          7.03185
		Opacity         1
		SkyLight        2.34395
		Hue             0.222238
		Saturation      1

		Composition
		{
			H2O   	53.2153
			NH3   	19.7632
			C2H2  	9.69462
			CO2   	7.90057
			H2S   	4.49606
			SO2   	3.59928
			C2H4  	0.745762
			N2    	0.290223
			C2H6  	0.240259
			C3H8  	0.0275559
			CH4   	0.0255862
			CO    	0.00126185
			O2    	0.000126829
			Ar    	0.000116298
			Ne    	8.43898e-005
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00320432
		Period          0.00308739
		Eccentricity    0.0137194
		Inclination     -0.0508532
		AscendingNode   96.3896
		ArgOfPericenter 1.24408
		MeanAnomaly     -19.0498
	}
}

Moon	"Japrael System 7.2"
{
	ParentBody     "Japrael System 7"
	Class	       "Selena"

	Mass            0.00994295
	Radius          1875.54
	InertiaMoment   0.377084

	Oblateness      0.00159459

	Obliquity       -0.247443
	EqAscendNode    54.9855
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.619 0.514 0.454)

	Surface
	{
		SurfStyle       0.157328
		OceanStyle      0.67071
		Randomize      (0.038, 0.411, -0.314)
		colorDistMagn   0.0857545
		colorDistFreq   248.415
		detailScale     4824.01
		colorConversion true
		drivenDarkening 0
		seaLevel        0.144602
		snowLevel       2
		tropicLatitude  0.00765834
		icecapLatitude  0.786899
		icecapHeight    0.158214
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.82432
		venusFreq       0.719529
		venusMagn       0
		mareFreq        0.870139
		mareDensity     0.00240525
		terraceProb     0.132661
		erosion         0
		montesMagn      0.117532
		montesFreq      73.6224
		montesSpiky     0.867622
		montesFraction  0.462269
		dunesMagn       0.0411442
		dunesFreq       2436.26
		dunesFraction   0.394878
		hillsMagn       0.148749
		hillsFreq       184.674
		hillsFraction   0.503786
		hills2Fraction  0
		riversMagn      61.1238
		riversFreq      2.47766
		riversSin       7.40604
		riversOctaves   0
		canyonsMagn     0.509304
		canyonsFreq     0.598368
		canyonFraction  0.00368778
		cracksMagn      0.0546439
		cracksFreq      0.961224
		cracksOctaves   0
		craterMagn      0.632589
		craterFreq      5.81997
		craterDensity   0.727961
		craterOctaves   9.41271
		craterRayedFactor 0.108268
		volcanoMagn     0.266955
		volcanoFreq     0.712179
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.278745
		volcanoRadius   0.198903
		volcanoTemp     1299.29
		lavaCoverTidal  0.160332
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.310, 0.257, 0.227, 0.000)
		colorDesert    (0.384, 0.309, 0.259, 0.200)
		colorLowland   (0.415, 0.329, 0.291, 0.500)
		colorUpland    (0.433, 0.345, 0.300, 0.800)
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
		SemiMajorAxis   0.00547205
		Period          0.00689011
		Eccentricity    0.0382263
		Inclination     -0.247443
		AscendingNode   54.9855
		ArgOfPericenter 4.50044
		MeanAnomaly     -101.916
	}
}

Moon	"Japrael System 7.3"
{
	ParentBody     "Japrael System 7"
	Class	       "IceWorld"

	Mass            0.0121917
	Radius          1886.56
	InertiaMoment   0.372025

	Obliquity       -0.948704
	EqAscendNode    108.462
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.568 0.562 0.559)

	Surface
	{
		SurfStyle       0.951416
		OceanStyle      0.319862
		Randomize      (0.145, 0.485, 0.094)
		colorDistMagn   0.0832237
		colorDistFreq   232.704
		detailScale     4852.34
		colorConversion true
		drivenDarkening 0.7
		seaLevel        0.281286
		snowLevel       2
		tropicLatitude  0.0193556
		icecapLatitude  0.86601
		icecapHeight    0.289449
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.8259
		venusFreq       1.35099
		venusMagn       0
		mareFreq        0.866235
		mareDensity     0.00224205
		terraceProb     0.278652
		erosion         0
		montesMagn      0.0843568
		montesFreq      91.3025
		montesSpiky     0.771914
		montesFraction  0.832041
		dunesMagn       0.0338297
		dunesFreq       2483.72
		dunesFraction   0.558834
		hillsMagn       0.132061
		hillsFreq       192.759
		hillsFraction   0.0401961
		hills2Fraction  0.196462
		riversMagn      64.8652
		riversFreq      1.48379
		riversSin       4.61572
		riversOctaves   0
		canyonsMagn     0.538586
		canyonsFreq     0.802934
		canyonFraction  0
		cracksMagn      0.0604849
		cracksFreq      0.752283
		cracksOctaves   1
		craterMagn      0.581585
		craterFreq      6.29769
		craterDensity   0.859553
		craterOctaves   11
		craterRayedFactor 0.219645
		volcanoMagn     0.286777
		volcanoFreq     0.740363
		volcanoDensity  0.208177
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.359035
		volcanoRadius   0.246542
		volcanoTemp     1522.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.431, 0.399, 0.324, 1.000)
		colorShelf     (0.431, 0.399, 0.324, 1.000)
		colorBeach     (0.397, 0.348, 0.280, 1.000)
		colorDesert    (0.397, 0.348, 0.280, 1.000)
		colorLowland   (0.482, 0.455, 0.425, 1.000)
		colorUpland    (0.505, 0.500, 0.481, 1.000)
		colorRock      (0.930, 0.910, 0.860, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.482, 0.455, 0.425, 1.000)
		colorUpPlants  (0.505, 0.500, 0.481, 1.000)
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
		SemiMajorAxis   0.00934467
		Period          0.0153761
		Eccentricity    0.0125164
		Inclination     -0.948704
		AscendingNode   108.462
		ArgOfPericenter 3.3044
		MeanAnomaly     16.0733
	}
}

DwarfMoon	"Japrael System 7.D3"
{
	ParentBody     "Japrael System 7"
	Class	       "Asteroid"

	Mass            1.20955e-009
	Radius          13.0251
	InertiaMoment   0.396397

	Obliquity       -47.853
	EqAscendNode    32.1023
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.523 0.516 0.512)

	Surface
	{
		SurfStyle       0.31272
		OceanStyle      0.610797
		Randomize      (-0.216, 0.823, -0.946)
		colorDistMagn   0.711116
		colorDistFreq   0.0314515
		detailScale     355.672
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999882
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.454722
		terraceProb     0.189211
		erosion         0
		montesMagn      0.526147
		montesFreq      2.77725
		montesSpiky     0.957971
		montesFraction  0.321165
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.459105
		hillsFraction   0.656449
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253444
		craterFreq      0.183627
		craterDensity   0.82714
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.445583
		volcanoTemp     1666.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.206, 0.205, 0.000)
		colorShelf     (0.222, 0.219, 0.218, 0.000)
		colorBeach     (0.235, 0.232, 0.230, 0.000)
		colorDesert    (0.248, 0.245, 0.243, 0.000)
		colorLowland   (0.261, 0.258, 0.256, 0.000)
		colorUpland    (0.274, 0.271, 0.269, 0.000)
		colorRock      (0.287, 0.284, 0.282, 0.000)
		colorSnow      (0.300, 0.296, 0.294, 1.000)
		BumpHeight      11.7226
		BumpOffset      2.34452
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
		SemiMajorAxis   0.0381135
		Period          0.126655
		Eccentricity    0.0507311
		Inclination     -47.853
		AscendingNode   32.1023
		ArgOfPericenter 63.1958
		MeanAnomaly     -40.33
	}
}

DwarfMoon	"Japrael System 7.D4"
{
	ParentBody     "Japrael System 7"
	Class	       "Asteroid"

	Mass            1.72061e-009
	Radius          17.8794
	InertiaMoment   0.398393

	RotationPeriod  3387.41
	Obliquity       10.5928
	EqAscendNode    101.394

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.655 0.651 0.647)

	Surface
	{
		SurfStyle       0.0620917
		OceanStyle      0.36571
		Randomize      (-0.481, 0.046, -0.530)
		colorDistMagn   0.381652
		colorDistFreq   0.176857
		detailScale     488.226
		colorConversion true
		snowLevel       2
		tropicLatitude  0.231297
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.354032
		terraceProb     0.406189
		erosion         0
		montesMagn      0.450823
		montesFreq      3.37367
		montesSpiky     0.974731
		montesFraction  0.900513
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.729112
		hillsFraction   0.690997
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266512
		craterFreq      0.195437
		craterDensity   0.89423
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488571
		volcanoTemp     1442.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.262, 0.261, 0.259, 0.000)
		colorShelf     (0.278, 0.277, 0.275, 0.000)
		colorBeach     (0.295, 0.293, 0.291, 0.000)
		colorDesert    (0.311, 0.309, 0.307, 0.000)
		colorLowland   (0.327, 0.326, 0.324, 0.000)
		colorUpland    (0.344, 0.342, 0.340, 0.000)
		colorRock      (0.360, 0.358, 0.356, 0.000)
		colorSnow      (0.376, 0.375, 0.372, 1.000)
		BumpHeight      16.0914
		BumpOffset      3.21829
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
		SemiMajorAxis   0.0385449
		Period          0.128811
		Eccentricity    0.378427
		Inclination     10.5928
		AscendingNode   101.394
		ArgOfPericenter -80.5672
		MeanAnomaly     179.262
	}
}

DwarfMoon	"Japrael System 7.D5"
{
	ParentBody     "Japrael System 7"
	Class	       "Asteroid"

	Mass            2.42183e-009
	Radius          19.106
	InertiaMoment   0.399419

	Obliquity       -50.1125
	EqAscendNode    -116.312
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.499 0.392 0.346)

	Surface
	{
		SurfStyle       0.367451
		OceanStyle      0.952935
		Randomize      (0.153, -0.527, -0.574)
		colorDistMagn   0.771923
		colorDistFreq   0.143498
		detailScale     521.721
		colorConversion true
		snowLevel       2
		tropicLatitude  0.740358
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.372874
		terraceProb     0.170603
		erosion         0
		montesMagn      0.55935
		montesFreq      3.91296
		montesSpiky     0.975493
		montesFraction  0.376821
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.827058
		hillsFraction   0.812043
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23435
		craterFreq      0.195445
		craterDensity   0.914125
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50377
		volcanoTemp     1707.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.157, 0.139, 0.000)
		colorShelf     (0.212, 0.167, 0.147, 0.000)
		colorBeach     (0.225, 0.177, 0.156, 0.000)
		colorDesert    (0.237, 0.186, 0.165, 0.000)
		colorLowland   (0.250, 0.196, 0.173, 0.000)
		colorUpland    (0.262, 0.206, 0.182, 0.000)
		colorRock      (0.275, 0.216, 0.191, 0.000)
		colorSnow      (0.287, 0.226, 0.199, 1.000)
		BumpHeight      17.1954
		BumpOffset      3.43908
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
		SemiMajorAxis   0.0389151
		Period          0.130671
		Eccentricity    0.0391302
		Inclination     -50.1125
		AscendingNode   -116.312
		ArgOfPericenter 104.641
		MeanAnomaly     -103.581
	}
}

DwarfMoon	"Japrael System 7.D6"
{
	ParentBody     "Japrael System 7"
	Class	       "Asteroid"

	Mass            3.37882e-009
	Radius          20.5053
	InertiaMoment   0.396903

	RotationPeriod  2333.97
	Obliquity       32.8317
	EqAscendNode    -93.877

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.721 0.718 0.714)

	Surface
	{
		SurfStyle       0.826183
		OceanStyle      0.780073
		Randomize      (0.741, 0.393, -0.467)
		colorDistMagn   0.815371
		colorDistFreq   0.233729
		detailScale     559.932
		colorConversion true
		snowLevel       2
		tropicLatitude  0.687776
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.303697
		terraceProb     0.473543
		erosion         0
		montesMagn      0.471343
		montesFreq      3.04286
		montesSpiky     0.941032
		montesFraction  0.136774
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.694201
		hillsFraction   0.564544
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236026
		craterFreq      0.238582
		craterDensity   0.922343
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.405811
		volcanoTemp     1833.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.281, 0.244, 0.200, 0.000)
		colorShelf     (0.289, 0.251, 0.228, 0.000)
		colorBeach     (0.339, 0.294, 0.271, 0.000)
		colorDesert    (0.368, 0.316, 0.264, 0.000)
		colorLowland   (0.404, 0.338, 0.300, 0.000)
		colorUpland    (0.447, 0.409, 0.364, 0.000)
		colorRock      (0.483, 0.445, 0.393, 0.000)
		colorSnow      (0.527, 0.474, 0.414, 1.000)
		BumpHeight      18.4548
		BumpOffset      3.69095
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
		SemiMajorAxis   0.0394016
		Period          0.133129
		Eccentricity    0.33426
		Inclination     32.8317
		AscendingNode   -93.877
		ArgOfPericenter 84.0708
		MeanAnomaly     64.6234
	}
}

DwarfMoon	"Japrael System 7.D7"
{
	ParentBody     "Japrael System 7"
	Class	       "Asteroid"

	Mass            4.67958e-009
	Radius          21.421
	InertiaMoment   0.39856

	Obliquity       17.1423
	EqAscendNode    81.1544
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.686 0.595 0.480)

	Surface
	{
		SurfStyle       0.800026
		OceanStyle      0.26869
		Randomize      (0.106, 0.395, -0.891)
		colorDistMagn   0.438811
		colorDistFreq   0.242581
		detailScale     584.936
		colorConversion true
		snowLevel       2
		tropicLatitude  0.436372
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.676024
		terraceProb     0.310929
		erosion         0
		montesMagn      0.540012
		montesFreq      2.82421
		montesSpiky     0.895766
		montesFraction  0.783747
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.27987
		hillsFraction   0.53893
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.285402
		craterFreq      0.23802
		craterDensity   0.943962
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.489269
		volcanoTemp     1404.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.267, 0.202, 0.134, 0.000)
		colorShelf     (0.274, 0.208, 0.154, 0.000)
		colorBeach     (0.322, 0.244, 0.183, 0.000)
		colorDesert    (0.350, 0.262, 0.178, 0.000)
		colorLowland   (0.384, 0.280, 0.202, 0.000)
		colorUpland    (0.425, 0.339, 0.245, 0.000)
		colorRock      (0.460, 0.369, 0.264, 0.000)
		colorSnow      (0.501, 0.393, 0.279, 1.000)
		BumpHeight      19.2789
		BumpOffset      3.85578
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
		SemiMajorAxis   0.0399864
		Period          0.136104
		Eccentricity    0.476435
		Inclination     17.1423
		AscendingNode   81.1544
		ArgOfPericenter 28.7854
		MeanAnomaly     31.2071
	}
}

DwarfMoon	"Japrael System 7.D8"
{
	ParentBody     "Japrael System 7"
	Class	       "Asteroid"

	Mass            6.44227e-009
	Radius          28.0153
	InertiaMoment   0.399548

	RotationPeriod  4862.5
	Obliquity       71.5389
	EqAscendNode    105.443

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.517 0.474 0.414)

	Surface
	{
		SurfStyle       0.0968344
		OceanStyle      0.518779
		Randomize      (-0.526, -0.671, 0.149)
		colorDistMagn   0.794586
		colorDistFreq   0.34975
		detailScale     765.005
		colorConversion true
		snowLevel       2
		tropicLatitude  0.940476
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.415653
		terraceProb     0.182724
		erosion         0
		montesMagn      0.591886
		montesFreq      3.76078
		montesSpiky     0.984747
		montesFraction  0.497124
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.6003
		hillsFraction   0.540422
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251173
		craterFreq      0.210275
		craterDensity   0.947321
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.550344
		volcanoTemp     1889.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.207, 0.189, 0.165, 0.000)
		colorShelf     (0.220, 0.201, 0.176, 0.000)
		colorBeach     (0.233, 0.213, 0.186, 0.000)
		colorDesert    (0.246, 0.225, 0.197, 0.000)
		colorLowland   (0.259, 0.237, 0.207, 0.000)
		colorUpland    (0.272, 0.249, 0.217, 0.000)
		colorRock      (0.284, 0.260, 0.228, 0.000)
		colorSnow      (0.297, 0.272, 0.238, 1.000)
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
		SemiMajorAxis   0.0404889
		Period          0.138678
		Eccentricity    0.213205
		Inclination     71.5389
		AscendingNode   105.443
		ArgOfPericenter -124.963
		MeanAnomaly     100.437
	}
}

DwarfMoon	"Japrael System 7.D9"
{
	ParentBody     "Japrael System 7"
	Class	       "Asteroid"

	Mass            8.82613e-009
	Radius          29.5746
	InertiaMoment   0.397264

	Obliquity       -75.2133
	EqAscendNode    116.453
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.426 0.421 0.416)

	Surface
	{
		SurfStyle       0.128513
		OceanStyle      0.886239
		Randomize      (0.290, 0.898, -0.879)
		colorDistMagn   0.407609
		colorDistFreq   0.236508
		detailScale     807.583
		colorConversion true
		snowLevel       2
		tropicLatitude  0.876403
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.675334
		terraceProb     0.609593
		erosion         0
		montesMagn      0.445814
		montesFreq      2.26057
		montesSpiky     0.947309
		montesFraction  0.935642
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.63656
		hillsFraction   0.45551
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247557
		craterFreq      0.259148
		craterDensity   0.833851
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.463177
		volcanoTemp     1589.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.168, 0.167, 0.000)
		colorShelf     (0.181, 0.179, 0.177, 0.000)
		colorBeach     (0.191, 0.190, 0.187, 0.000)
		colorDesert    (0.202, 0.200, 0.198, 0.000)
		colorLowland   (0.213, 0.211, 0.208, 0.000)
		colorUpland    (0.223, 0.221, 0.219, 0.000)
		colorRock      (0.234, 0.232, 0.229, 0.000)
		colorSnow      (0.245, 0.242, 0.239, 1.000)
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
		SemiMajorAxis   0.0410623
		Period          0.141634
		Eccentricity    0.454413
		Inclination     -75.2133
		AscendingNode   116.453
		ArgOfPericenter 76.533
		MeanAnomaly     -167.613
	}
}

DwarfMoon	"Japrael System 7.D10"
{
	ParentBody     "Japrael System 7"
	Class	       "Asteroid"

	Mass            1.20466e-008
	Radius          31.5132
	InertiaMoment   0.398717

	Obliquity       62.8008
	EqAscendNode    -75.3964
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.714 0.710 0.708)

	Surface
	{
		SurfStyle       0.838666
		OceanStyle      0.346096
		Randomize      (-0.059, 0.626, 0.608)
		colorDistMagn   0.568482
		colorDistFreq   0.802825
		detailScale     860.519
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999955
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.378686
		terraceProb     0.172876
		erosion         0
		montesMagn      0.518366
		montesFreq      3.51784
		montesSpiky     0.775117
		montesFraction  0.37664
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.20115
		hillsFraction   0.643992
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.216507
		craterFreq      0.194749
		craterDensity   0.973015
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.451557
		volcanoTemp     1569.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.279, 0.242, 0.198, 0.000)
		colorShelf     (0.286, 0.249, 0.227, 0.000)
		colorBeach     (0.336, 0.291, 0.269, 0.000)
		colorDesert    (0.364, 0.313, 0.262, 0.000)
		colorLowland   (0.400, 0.334, 0.298, 0.000)
		colorUpland    (0.443, 0.405, 0.361, 0.000)
		colorRock      (0.478, 0.440, 0.390, 0.000)
		colorSnow      (0.521, 0.469, 0.411, 1.000)
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
		SemiMajorAxis   0.0414088
		Period          0.143431
		Eccentricity    0.104821
		Inclination     62.8008
		AscendingNode   -75.3964
		ArgOfPericenter 120.557
		MeanAnomaly     119.654
	}
}

DwarfMoon	"Japrael System 7.D11"
{
	ParentBody     "Japrael System 7"
	Class	       "Asteroid"

	Mass            1.63961e-008
	Radius          33.0649
	InertiaMoment   0.399676

	Obliquity       24.7451
	EqAscendNode    151.168
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.579 0.575 0.571)

	Surface
	{
		SurfStyle       0.388261
		OceanStyle      0.747974
		Randomize      (-0.938, -0.221, 0.020)
		colorDistMagn   0.932594
		colorDistFreq   0.442449
		detailScale     902.893
		colorConversion true
		snowLevel       2
		tropicLatitude  0.207282
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.37942
		terraceProb     0.442661
		erosion         0
		montesMagn      0.369512
		montesFreq      3.33547
		montesSpiky     0.979185
		montesFraction  0.75732
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.97602
		hillsFraction   0.540305
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249166
		craterFreq      0.258038
		craterDensity   0.948855
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.439728
		volcanoTemp     1487.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.230, 0.228, 0.000)
		colorShelf     (0.246, 0.244, 0.243, 0.000)
		colorBeach     (0.260, 0.259, 0.257, 0.000)
		colorDesert    (0.275, 0.273, 0.271, 0.000)
		colorLowland   (0.289, 0.288, 0.286, 0.000)
		colorUpland    (0.304, 0.302, 0.300, 0.000)
		colorRock      (0.318, 0.316, 0.314, 0.000)
		colorSnow      (0.333, 0.331, 0.328, 1.000)
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
		SemiMajorAxis   0.0418074
		Period          0.145507
		Eccentricity    0.102159
		Inclination     24.7451
		AscendingNode   151.168
		ArgOfPericenter 100.916
		MeanAnomaly     5.14569
	}
}

DwarfMoon	"Japrael System 7.D12"
{
	ParentBody     "Japrael System 7"
	Class	       "Asteroid"

	Mass            2.22744e-008
	Radius          42.8004
	InertiaMoment   0.397553

	Obliquity       5.84473
	EqAscendNode    129.286
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.776 0.731 0.705)

	Surface
	{
		SurfStyle       0.550988
		OceanStyle      0.896615
		Randomize      (-0.274, 0.262, 0.998)
		colorDistMagn   0.833833
		colorDistFreq   0.960576
		detailScale     1168.74
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0871385
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.409459
		terraceProb     0.269671
		erosion         0
		montesMagn      0.364297
		montesFreq      3.01345
		montesSpiky     0.970912
		montesFraction  0.379901
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.2044
		hillsFraction   0.740842
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245711
		craterFreq      0.153412
		craterDensity   0.925457
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523304
		volcanoTemp     1572.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.303, 0.249, 0.197, 0.000)
		colorShelf     (0.311, 0.256, 0.226, 0.000)
		colorBeach     (0.365, 0.300, 0.268, 0.000)
		colorDesert    (0.396, 0.322, 0.261, 0.000)
		colorLowland   (0.435, 0.344, 0.296, 0.000)
		colorUpland    (0.481, 0.417, 0.360, 0.000)
		colorRock      (0.520, 0.453, 0.388, 0.000)
		colorSnow      (0.567, 0.482, 0.409, 1.000)
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
		SemiMajorAxis   0.0424597
		Period          0.148925
		Eccentricity    0.0156247
		Inclination     5.84473
		AscendingNode   129.286
		ArgOfPericenter -154.252
		MeanAnomaly     136.273
	}
}

DwarfMoon	"Japrael System 7.D13"
{
	ParentBody     "Japrael System 7"
	Class	       "Asteroid"

	Mass            3.02303e-008
	Radius          44.8496
	InertiaMoment   0.398867

	RotationPeriod  884.6
	Obliquity       23.5447
	EqAscendNode    112.156

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.819 0.714 0.669)

	Surface
	{
		SurfStyle       0.288324
		OceanStyle      0.00157545
		Randomize      (-0.147, -0.212, -0.813)
		colorDistMagn   0.488542
		colorDistFreq   0.735833
		detailScale     1224.69
		colorConversion true
		snowLevel       2
		tropicLatitude  0.434634
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.611186
		terraceProb     0.154487
		erosion         0
		montesMagn      0.683791
		montesFreq      2.52021
		montesSpiky     0.915762
		montesFraction  0.572368
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.48017
		hillsFraction   0.79382
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.213591
		craterFreq      0.224874
		craterDensity   0.780118
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494066
		volcanoTemp     1646.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.328, 0.285, 0.267, 0.000)
		colorShelf     (0.348, 0.303, 0.284, 0.000)
		colorBeach     (0.369, 0.321, 0.301, 0.000)
		colorDesert    (0.389, 0.339, 0.318, 0.000)
		colorLowland   (0.410, 0.357, 0.334, 0.000)
		colorUpland    (0.430, 0.375, 0.351, 0.000)
		colorRock      (0.451, 0.393, 0.368, 0.000)
		colorSnow      (0.471, 0.410, 0.385, 1.000)
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
		SemiMajorAxis   0.0429235
		Period          0.151372
		Eccentricity    0.134567
		Inclination     23.5447
		AscendingNode   112.156
		ArgOfPericenter -42.4402
		MeanAnomaly     -45.6051
	}
}

Moon	"Japrael System 7.4"
{
	ParentBody     "Japrael System 7"
	Class	       "IceWorld"

	Mass            0.0826135
	Radius          3509.23
	InertiaMoment   0.332097

	RotationPeriod  2249.94
	Obliquity       -45.9257
	EqAscendNode    -157.404

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.752 0.648 0.540)

	Surface
	{
		SurfStyle       0.398248
		OceanStyle      0.0887613
		Randomize      (-0.371, -0.161, 0.776)
		colorDistMagn   0.0676242
		colorDistFreq   526.988
		detailScale     9025.94
		colorConversion true
		drivenDarkening 0
		seaLevel        0.280402
		snowLevel       2
		tropicLatitude  0.278697
		icecapLatitude  1
		icecapHeight    0.280402
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.78233
		venusFreq       1.0732
		venusMagn       0
		mareFreq        1.57691
		mareDensity     0.0124199
		terraceProb     0.237614
		erosion         0
		montesMagn      0.225779
		montesFreq      189.208
		montesSpiky     0.89764
		montesFraction  0.20214
		dunesMagn       0.0340822
		dunesFreq       4660.78
		dunesFraction   0.556395
		hillsMagn       0.120543
		hillsFreq       441.393
		hillsFraction   0.832193
		hills2Fraction  0.0317944
		riversMagn      58.7957
		riversFreq      3.26285
		riversSin       6.04193
		riversOctaves   0
		canyonsMagn     0.43393
		canyonsFreq     1.46513
		canyonFraction  0
		cracksMagn      0.0493715
		cracksFreq      1.07421
		cracksOctaves   4
		craterMagn      0.565115
		craterFreq      8.72461
		craterDensity   0.961226
		craterOctaves   12
		craterRayedFactor 0.160979
		volcanoMagn     0.605901
		volcanoFreq     0.669071
		volcanoDensity  0.180151
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.104708
		volcanoRadius   0.478072
		volcanoTemp     1454.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.752, 0.648, 0.540, 0.500)
		colorShelf     (0.715, 0.615, 0.513, 0.500)
		colorBeach     (0.526, 0.453, 0.378, 0.750)
		colorDesert    (0.639, 0.550, 0.459, 1.000)
		colorLowland   (0.662, 0.570, 0.475, 1.000)
		colorUpland    (0.699, 0.602, 0.502, 1.000)
		colorRock      (1.000, 1.000, 1.000, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 0.154)
		colorLowPlants (0.662, 0.570, 0.475, 1.000)
		colorUpPlants  (0.699, 0.602, 0.502, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.965276
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
		Height          128.804
		Density         0.00347245
		Pressure        0.000676516
		Greenhouse      0.230778
		Bright          5.10654
		Opacity         0
		SkyLight        1.70218
		Hue             -0.0433833
		Saturation      1

		Composition
		{
			N2    	99.1361
			CH4   	0.355165
			CO    	0.268105
			Ar    	0.198478
			Ne    	0.0415395
			O2    	0.00063404
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0434205
		Period          0.154004
		Eccentricity    0.0923259
		Inclination     -45.9257
		AscendingNode   -157.404
		ArgOfPericenter -76.2183
		MeanAnomaly     -78.5466
	}
}

DwarfMoon	"Japrael System 7.D14"
{
	ParentBody     "Japrael System 7"
	Class	       "Asteroid"

	Mass            5.57084e-008
	Radius          50.2743
	InertiaMoment   0.397798

	Obliquity       -70.4162
	EqAscendNode    137.752
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.778 0.776 0.773)

	Surface
	{
		SurfStyle       0.0932105
		OceanStyle      0.453601
		Randomize      (0.943, -0.378, 0.929)
		colorDistMagn   0.945189
		colorDistFreq   1.56153
		detailScale     1372.82
		colorConversion true
		snowLevel       2
		tropicLatitude  0.638731
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.471063
		terraceProb     0.367665
		erosion         0
		montesMagn      0.427781
		montesFreq      2.93829
		montesSpiky     0.987634
		montesFraction  0.243554
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.56265
		hillsFraction   0.746548
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.20085
		craterFreq      0.206193
		craterDensity   0.849383
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.552577
		volcanoTemp     1538.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.311, 0.310, 0.309, 0.000)
		colorShelf     (0.330, 0.330, 0.329, 0.000)
		colorBeach     (0.350, 0.349, 0.348, 0.000)
		colorDesert    (0.369, 0.369, 0.367, 0.000)
		colorLowland   (0.389, 0.388, 0.387, 0.000)
		colorUpland    (0.408, 0.407, 0.406, 0.000)
		colorRock      (0.428, 0.427, 0.425, 0.000)
		colorSnow      (0.447, 0.446, 0.445, 1.000)
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
		SemiMajorAxis   0.0439041
		Period          0.156589
		Eccentricity    0.0415284
		Inclination     -70.4162
		AscendingNode   137.752
		ArgOfPericenter -90.4587
		MeanAnomaly     175.927
	}
}

DwarfMoon	"Japrael System 7.D15"
{
	ParentBody     "Japrael System 7"
	Class	       "Asteroid"

	Mass            7.57737e-008
	Radius          65.1531
	InertiaMoment   0.399011

	Obliquity       -71.881
	EqAscendNode    -36.3948
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.579 0.523 0.467)

	Surface
	{
		SurfStyle       0.312455
		OceanStyle      0.00410733
		Randomize      (-0.228, -0.949, -0.079)
		colorDistMagn   0.609078
		colorDistFreq   0.911296
		detailScale     1779.11
		colorConversion true
		snowLevel       2
		tropicLatitude  0.776285
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.386311
		terraceProb     0.521932
		erosion         0
		montesMagn      0.491347
		montesFreq      3.77876
		montesSpiky     0.861918
		montesFraction  0.463008
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.2748
		hillsFraction   0.687883
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248361
		craterFreq      0.216919
		craterDensity   0.777444
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.407782
		volcanoTemp     1651.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.232, 0.209, 0.187, 0.000)
		colorShelf     (0.246, 0.222, 0.198, 0.000)
		colorBeach     (0.261, 0.236, 0.210, 0.000)
		colorDesert    (0.275, 0.249, 0.222, 0.000)
		colorLowland   (0.289, 0.262, 0.233, 0.000)
		colorUpland    (0.304, 0.275, 0.245, 0.000)
		colorRock      (0.318, 0.288, 0.257, 0.000)
		colorSnow      (0.333, 0.301, 0.268, 1.000)
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
		SemiMajorAxis   0.0443083
		Period          0.158756
		Eccentricity    0.428829
		Inclination     -71.881
		AscendingNode   -36.3948
		ArgOfPericenter 130.373
		MeanAnomaly     137.73
	}
}

DwarfMoon	"Japrael System 7.D16"
{
	ParentBody     "Japrael System 7"
	Class	       "Asteroid"

	Mass            1.03326e-007
	Radius          67.9826
	InertiaMoment   0.399927

	RotationPeriod  2103.62
	Obliquity       -18.1963
	EqAscendNode    176.529

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.673 0.587 0.421)

	Surface
	{
		SurfStyle       0.376728
		OceanStyle      0.186074
		Randomize      (0.343, -0.661, 0.846)
		colorDistMagn   0.115372
		colorDistFreq   0.784416
		detailScale     1856.38
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0189134
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.586441
		terraceProb     0.280775
		erosion         0
		montesMagn      0.360863
		montesFreq      3.25929
		montesSpiky     0.94622
		montesFraction  0.276316
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.8853
		hillsFraction   0.558926
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.262467
		craterFreq      0.230548
		craterDensity   1.06302
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469772
		volcanoTemp     977.757
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.269, 0.235, 0.168, 0.000)
		colorShelf     (0.286, 0.249, 0.179, 0.000)
		colorBeach     (0.303, 0.264, 0.189, 0.000)
		colorDesert    (0.320, 0.279, 0.200, 0.000)
		colorLowland   (0.336, 0.293, 0.210, 0.000)
		colorUpland    (0.353, 0.308, 0.221, 0.000)
		colorRock      (0.370, 0.323, 0.231, 0.000)
		colorSnow      (0.387, 0.337, 0.242, 1.000)
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
		SemiMajorAxis   0.0445369
		Period          0.159987
		Eccentricity    0.422116
		Inclination     -18.1963
		AscendingNode   176.529
		ArgOfPericenter -78.3091
		MeanAnomaly     -102.571
	}
}

DwarfMoon	"Japrael System 7.D17"
{
	ParentBody     "Japrael System 7"
	Class	       "Asteroid"

	Mass            1.41388e-007
	Radius          72.4424
	InertiaMoment   0.398014

	Obliquity       -9.7964
	EqAscendNode    -140.7
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.452 0.449 0.445)

	Surface
	{
		SurfStyle       0.977246
		OceanStyle      0.408491
		Randomize      (0.611, 0.830, 0.327)
		colorDistMagn   0.553491
		colorDistFreq   1.71419
		detailScale     1978.16
		colorConversion true
		snowLevel       2
		tropicLatitude  0.114246
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.605068
		terraceProb     0.343071
		erosion         0
		montesMagn      0.378274
		montesFreq      4.13671
		montesSpiky     0.879189
		montesFraction  0.329504
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.3146
		hillsFraction   0.83119
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242798
		craterFreq      0.2254
		craterDensity   0.910643
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511485
		volcanoTemp     1681.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.154, 0.157, 0.178, 0.050)
		colorShelf     (0.181, 0.184, 0.205, 0.040)
		colorBeach     (0.208, 0.211, 0.231, 0.030)
		colorDesert    (0.235, 0.238, 0.262, 0.020)
		colorLowland   (0.262, 0.265, 0.289, 0.030)
		colorUpland    (0.290, 0.292, 0.316, 0.050)
		colorRock      (0.317, 0.319, 0.351, 0.020)
		colorSnow      (0.317, 0.319, 0.351, 1.000)
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
		SemiMajorAxis   0.0448833
		Period          0.161857
		Eccentricity    0.313545
		Inclination     -9.7964
		AscendingNode   -140.7
		ArgOfPericenter 74.262
		MeanAnomaly     8.60548
	}
}

// http://starwars.wikia.com/wiki/Overt
Planet	"Overt/Japrael System 8"
{
	ParentBody     "Prael"
	Class	       "GasGiant"

	Mass            124.697
	Radius          62646.6
	InertiaMoment   0.236088

	Oblateness      0.0803841

	RotationPeriod  11.3976
	Obliquity       27.741
	EqAscendNode    -30.4776

	AlbedoBond      0.50217
	AlbedoGeom      0.602604
	Brightness      2

	Surface
	{
		SurfStyle       0.146974
		Randomize      (-0.840, -0.758, -0.398)
		detailScale     161131
		colorConversion true
		tropicLatitude  0.446437
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0.949101
		stripeZones     3.72353
		stripeFluct     0.431075
		stripeTwist     11.261
		cycloneMagn     12.111
		cycloneFreq     0.72021
		cycloneDensity  0.516849
		cycloneOctaves  5
		colorLayer0    (0.810, 0.810, 0.810, 1.100)
		colorLayer1    (0.630, 0.650, 0.650, 0.800)
		colorLayer2    (0.580, 0.560, 0.580, 0.200)
		colorLayer3    (0.610, 0.610, 0.630, 0.050)
		colorLayer4    (0.720, 0.720, 0.720, 0.000)
		colorLayer5    (0.780, 0.780, 0.780, 0.000)
		colorLayer6    (0.540, 0.540, 0.560, 0.000)
		colorLayer7    (0.690, 0.660, 0.620, 1.000)
		colorLowPlants (0.720, 0.720, 0.720, 0.000)
		colorUpPlants  (0.780, 0.780, 0.780, 0.000)
		BumpHeight      17.5916
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          261.141
		Velocity        -2283.38
		BumpHeight      53.4531
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.926617
		mainOctaves     12
		Coverage        0.521699
		stripeZones     3.72353
		stripeFluct     0.431075
		stripeTwist     11.261
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          626.466
		Density         5415.97
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0492274
		Saturation      0.638273

		Composition
		{
			H2    	92.3383
			He    	7.27495
			CH4   	0.302143
			N2    	0.0385594
			NH3   	0.0285899
			O2    	0.00919257
			C2H2  	0.00380554
			Ne    	0.00132322
			C2H4  	0.00126287
			Ar    	0.000821259
			C2H6  	0.000707185
			C3H8  	0.000330775
		}
	}

	Aurora
	{
		Height      1723.24
		NorthLat    87.5967
		NorthLon    17.342
		NorthRadius 16810.8
		NorthWidth  12268.2
		NorthRings  5
		NorthBright 1
		NorthParticles 10000
		SouthLat    -86.4616
		SouthLon    199.384
		SouthRadius 18032.4
		SouthWidth  9632.69
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
		SemiMajorAxis   41.1124
		Period          29.2924
		Eccentricity    0.0764167
		Inclination     -1.56781
		AscendingNode   -37.63
		ArgOfPericenter 283.695
		MeanAnomaly     302.576
	}
}

DwarfMoon	"Japrael System 8.D1"
{
	ParentBody     "Japrael System 8"
	Class	       "Asteroid"

	Mass            3.60732e-009
	Radius          22.301
	InertiaMoment   0.399213

	Oblateness      0.249

	Obliquity       -0.00614076
	EqAscendNode    96.2501
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.796 0.729 0.673)

	Surface
	{
		SurfStyle       0.964197
		OceanStyle      0.94214
		Randomize      (0.074, 0.604, 0.961)
		colorDistMagn   0.443331
		colorDistFreq   0.121098
		detailScale     608.967
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.512449
		terraceProb     0.449661
		erosion         0
		montesMagn      0.447599
		montesFreq      3.1566
		montesSpiky     0.833307
		montesFraction  0.32479
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.1337
		hillsFraction   0.812059
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229139
		craterFreq      0.209155
		craterDensity   0.909562
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52119
		volcanoTemp     1567.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.255, 0.269, 0.050)
		colorShelf     (0.318, 0.299, 0.310, 0.040)
		colorBeach     (0.366, 0.342, 0.350, 0.030)
		colorDesert    (0.414, 0.386, 0.397, 0.020)
		colorLowland   (0.462, 0.430, 0.438, 0.030)
		colorUpland    (0.509, 0.474, 0.478, 0.050)
		colorRock      (0.557, 0.517, 0.532, 0.020)
		colorSnow      (0.557, 0.517, 0.532, 1.000)
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
		SemiMajorAxis   0.000613558
		Period          0.000787111
		Eccentricity    5.53691e-005
		Inclination     -0.00614076
		AscendingNode   96.2501
		ArgOfPericenter -93.2376
		MeanAnomaly     32.0082
	}
}

DwarfMoon	"Japrael System 8.D2"
{
	ParentBody     "Japrael System 8"
	Class	       "Asteroid"

	Mass            4.98957e-009
	Radius          23.8379
	InertiaMoment   0.395967

	Oblateness      0.20169

	Obliquity       0.00787166
	EqAscendNode    165.603
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.586 0.581 0.574)

	Surface
	{
		SurfStyle       0.922074
		OceanStyle      0.544051
		Randomize      (-0.787, -0.203, -0.323)
		colorDistMagn   0.215693
		colorDistFreq   0.356787
		detailScale     650.933
		colorConversion true
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.654364
		terraceProb     0.531842
		erosion         0
		montesMagn      0.624117
		montesFreq      2.52488
		montesSpiky     0.997198
		montesFraction  0.516604
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.31162
		hillsFraction   0.745071
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224982
		craterFreq      0.258986
		craterDensity   0.937629
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.533718
		volcanoTemp     1191.84
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.199, 0.203, 0.230, 0.050)
		colorShelf     (0.234, 0.238, 0.264, 0.040)
		colorBeach     (0.270, 0.273, 0.299, 0.030)
		colorDesert    (0.305, 0.308, 0.339, 0.020)
		colorLowland   (0.340, 0.343, 0.373, 0.030)
		colorUpland    (0.375, 0.377, 0.408, 0.050)
		colorRock      (0.410, 0.412, 0.454, 0.020)
		colorSnow      (0.410, 0.412, 0.454, 1.000)
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
		SemiMajorAxis   0.000850156
		Period          0.00128381
		Eccentricity    9.60872e-005
		Inclination     0.00787165
		AscendingNode   165.603
		ArgOfPericenter -36.0142
		MeanAnomaly     -50.8306
	}
}

DwarfMoon	"Japrael System 8.D3"
{
	ParentBody     "Japrael System 8"
	Class	       "Asteroid"

	Mass            6.86179e-009
	Radius          25.3615
	InertiaMoment   0.398294

	Oblateness      0.0246487

	Obliquity       -1.19856
	EqAscendNode    -7.62772
	TidalLocked     true

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.448 0.446 0.442)

	Surface
	{
		SurfStyle       0.173007
		OceanStyle      0.342639
		Randomize      (0.818, 0.231, -0.722)
		colorDistMagn   0.461604
		colorDistFreq   0.421469
		detailScale     692.539
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0417325
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.420488
		terraceProb     0.127002
		erosion         0
		montesMagn      0.424522
		montesFreq      2.79031
		montesSpiky     0.901451
		montesFraction  0.736821
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.49072
		hillsFraction   0.865976
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227044
		craterFreq      0.204743
		craterDensity   0.934479
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483236
		volcanoTemp     1201.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.178, 0.177, 0.000)
		colorShelf     (0.190, 0.189, 0.188, 0.000)
		colorBeach     (0.202, 0.201, 0.199, 0.000)
		colorDesert    (0.213, 0.212, 0.210, 0.000)
		colorLowland   (0.224, 0.223, 0.221, 0.000)
		colorUpland    (0.235, 0.234, 0.232, 0.000)
		colorRock      (0.246, 0.245, 0.243, 0.000)
		colorSnow      (0.258, 0.256, 0.254, 1.000)
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
		SemiMajorAxis   0.00164377
		Period          0.00345155
		Eccentricity    0.0248949
		Inclination     -1.19856
		AscendingNode   -7.62772
		ArgOfPericenter 41.8473
		MeanAnomaly     29.7873
	}
}

Moon	"Japrael System 8.1"
{
	ParentBody     "Japrael System 8"
	Class	       "Selena"

	Mass            0.00440403
	Radius          1248.11
	InertiaMoment   0.395578

	Obliquity       0.251389
	EqAscendNode    -23.3704
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.608 0.489 0.367)

	Surface
	{
		SurfStyle       0.0524991
		OceanStyle      0.268496
		Randomize      (-0.875, -0.394, -0.562)
		colorDistMagn   0.0472245
		colorDistFreq   140.146
		detailScale     3210.22
		colorConversion true
		drivenDarkening 0
		seaLevel        0.207511
		snowLevel       2
		tropicLatitude  0.00859006
		icecapLatitude  9.88805
		icecapHeight    0.153639
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.82674
		venusFreq       0.797261
		venusMagn       0
		mareFreq        0.519313
		mareDensity     0.00226976
		terraceProb     0.233408
		erosion         0
		montesMagn      0.061756
		montesFreq      62.2579
		montesSpiky     0.934108
		montesFraction  0.688974
		dunesMagn       0.0447103
		dunesFreq       1680.95
		dunesFraction   0.506386
		hillsMagn       0.104028
		hillsFreq       121.196
		hillsFraction   0.778274
		hills2Fraction  0
		riversMagn      56.8112
		riversFreq      2.49576
		riversSin       6.76861
		riversOctaves   0
		canyonsMagn     0.582185
		canyonsFreq     0.456756
		canyonFraction  0.151133
		cracksMagn      0.0274491
		cracksFreq      0.512441
		cracksOctaves   0
		craterMagn      0.502694
		craterFreq      3.91721
		craterDensity   0.92956
		craterOctaves   10
		craterRayedFactor 0
		volcanoMagn     0.152617
		volcanoFreq     0.792921
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.98634
		volcanoFlows    0.126207
		volcanoRadius   0.145733
		volcanoTemp     1327.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.304, 0.244, 0.184, 0.000)
		colorDesert    (0.377, 0.293, 0.209, 0.200)
		colorLowland   (0.408, 0.313, 0.235, 0.500)
		colorUpland    (0.426, 0.328, 0.242, 0.800)
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
		SemiMajorAxis   0.00280533
		Period          0.0076952
		Eccentricity    0.0339649
		Inclination     0.251389
		AscendingNode   -23.3704
		ArgOfPericenter 8.13802
		MeanAnomaly     13.4312
	}
}

Moon	"Japrael System 8.2"
{
	ParentBody     "Japrael System 8"
	Class	       "Desert"

	Mass            0.0511352
	Radius          3007.41
	InertiaMoment   0.344595

	Obliquity       -1.00803
	EqAscendNode    -23.0223
	TidalLocked     true

	AlbedoBond      0.353128
	AlbedoGeom      0.423753
	Brightness      2
	Color          (0.621 0.489 0.406)

	Surface
	{
		SurfStyle       0.0235691
		OceanStyle      0.666386
		Randomize      (0.144, -0.192, -0.902)
		colorDistMagn   0.0738443
		colorDistFreq   369.636
		detailScale     7735.23
		colorConversion true
		seaLevel        0.0893555
		snowLevel       0.85
		tropicLatitude  0.0344715
		icecapLatitude  0.869646
		icecapHeight    0.100636
		climatePole     0.9375
		climateTropic   0.389564
		climateEquator  0.6875
		heightTempGrad  0.547936
		tropicWidth     0.110859
		mainFreq        0.5725
		venusFreq       1.69584
		venusMagn       0.38838
		mareFreq        2.2885
		mareDensity     0.0112227
		terraceProb     0.181758
		erosion         0
		montesMagn      0.172341
		montesFreq      138.545
		montesSpiky     0.986021
		montesFraction  0.584103
		dunesMagn       0.0407529
		dunesFreq       22.5849
		dunesFraction   0.411393
		hillsMagn       0.158414
		hillsFreq       453.196
		hillsFraction   0
		hills2Fraction  0
		riversMagn      62.9854
		riversFreq      3.20601
		riversSin       6.2773
		riversOctaves   0
		canyonsMagn     0.0466033
		canyonsFreq     86.8163
		canyonFraction  0
		cracksMagn      0.0919077
		cracksFreq      0.233022
		cracksOctaves   0
		craterMagn      0.650296
		craterFreq      8.68519
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.620412
		volcanoFreq     0.677085
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.704797
		volcanoRadius   0.429434
		volcanoTemp     1353.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.38363
		stripeTwist     1.09781
		cycloneMagn     2.87127
		cycloneFreq     0.746456
		cycloneDensity  0.315309
		cycloneOctaves  3
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
		Height          14.3567
		Velocity        130.938
		BumpHeight      4.35679
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.00597
		mainOctaves     10
		Coverage        0.306255
		stripeZones     1.38363
		stripeTwist     1.09781
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          150.371
		Density         3.40914
		Pressure        1.42603
		Greenhouse      1.05197
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0460333
		Saturation      0.987406

		Composition
		{
			CO2   	93.7091
			SO2   	6.14485
			C3H8  	0.146061
			Cl2   	1.46593e-005
		}
	}

	Aurora
	{
		Height      29.0725
		NorthLat    53.7845
		NorthLon    12.6999
		NorthRadius 1057.56
		NorthWidth  285.57
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -59.0254
		SouthLon    194.667
		SouthRadius 589.421
		SouthWidth  179.721
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
		SemiMajorAxis   0.00478768
		Period          0.0171535
		Eccentricity    0.00813542
		Inclination     -1.00803
		AscendingNode   -23.0223
		ArgOfPericenter -68.8836
		MeanAnomaly     100.023
	}
}

Moon	"Japrael System 8.3"
{
	ParentBody     "Japrael System 8"
	Class	       "Selena"

	Mass            0.00592678
	Radius          1376.19
	InertiaMoment   0.387316

	Obliquity       1.04831
	EqAscendNode    119.811
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.481 0.475 0.470)

	Surface
	{
		SurfStyle       0.0834324
		OceanStyle      0.472839
		Randomize      (0.700, 0.358, -0.557)
		colorDistMagn   0.0708416
		colorDistFreq   168.979
		detailScale     3539.63
		colorConversion true
		drivenDarkening 0
		seaLevel        0.189096
		snowLevel       2
		tropicLatitude  0.0183472
		icecapLatitude  9.79766
		icecapHeight    0.144488
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.87728
		venusFreq       1.10955
		venusMagn       0
		mareFreq        0.61983
		mareDensity     0.00220052
		terraceProb     0.337792
		erosion         0
		montesMagn      0.0709016
		montesFreq      84.5657
		montesSpiky     0.920924
		montesFraction  0.282433
		dunesMagn       0.0236582
		dunesFreq       1832.13
		dunesFraction   0.165566
		hillsMagn       0.125142
		hillsFreq       133.624
		hillsFraction   0.577371
		hills2Fraction  0
		riversMagn      54.0259
		riversFreq      3.19017
		riversSin       7.71756
		riversOctaves   0
		canyonsMagn     0.428264
		canyonsFreq     0.482455
		canyonFraction  0.34769
		cracksMagn      0.0787372
		cracksFreq      0.369762
		cracksOctaves   0
		craterMagn      0.66638
		craterFreq      4.77342
		craterDensity   0.701997
		craterOctaves   11
		craterRayedFactor 0.161462
		volcanoMagn     0.198816
		volcanoFreq     0.558236
		volcanoDensity  0.228225
		volcanoOctaves  3
		volcanoActivity 0.0813311
		volcanoFlows    0.271347
		volcanoRadius   0.158849
		volcanoTemp     1273.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.240, 0.237, 0.235, 0.000)
		colorDesert    (0.298, 0.285, 0.268, 0.200)
		colorLowland   (0.322, 0.304, 0.301, 0.500)
		colorUpland    (0.337, 0.318, 0.310, 0.800)
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
		SemiMajorAxis   0.00817086
		Period          0.038251
		Eccentricity    0.0353598
		Inclination     1.04831
		AscendingNode   119.811
		ArgOfPericenter 109.906
		MeanAnomaly     -73.5622
	}
}

Moon	"Japrael System 8.4"
{
	ParentBody     "Japrael System 8"
	Class	       "Selena"

	Mass            0.0068616
	Radius          1562.43
	InertiaMoment   0.383403

	RotationPeriod  75.1731
	Obliquity       -7.12758
	EqAscendNode    -61.5425

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      3.5
	Color          (0.759 0.688 0.578)

	Surface
	{
		SurfStyle       0.0754884
		OceanStyle      0.592506
		Randomize      (-0.118, 0.206, -0.061)
		colorDistMagn   0.0639564
		colorDistFreq   169.379
		detailScale     4018.66
		colorConversion true
		drivenDarkening 0
		seaLevel        0.251715
		snowLevel       2
		tropicLatitude  0.122349
		icecapLatitude  9.89423
		icecapHeight    0.137767
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.01661
		venusFreq       0.948235
		venusMagn       0
		mareFreq        0.561038
		mareDensity     0.00192659
		terraceProb     0.243775
		erosion         0
		montesMagn      0.060271
		montesFreq      80.6903
		montesSpiky     0.956684
		montesFraction  0.416833
		dunesMagn       0.0207073
		dunesFreq       2067.46
		dunesFraction   0.595852
		hillsMagn       0.139394
		hillsFreq       195.759
		hillsFraction   0.187773
		hills2Fraction  0
		riversMagn      57.3488
		riversFreq      3.0192
		riversSin       6.78264
		riversOctaves   0
		canyonsMagn     0.455972
		canyonsFreq     0.515772
		canyonFraction  0.08809
		cracksMagn      0.0658017
		cracksFreq      0.352826
		cracksOctaves   0
		craterMagn      0.550903
		craterFreq      3.73007
		craterDensity   0.859302
		craterOctaves   11
		craterRayedFactor 0.221705
		volcanoMagn     0.214654
		volcanoFreq     0.676963
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.34966
		volcanoFlows    0.29682
		volcanoRadius   0.153812
		volcanoTemp     1435.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.320, 0.320, 0.320, 0.000)
		colorShelf     (0.370, 0.370, 0.370, 0.000)
		colorBeach     (0.379, 0.344, 0.289, 0.000)
		colorDesert    (0.470, 0.413, 0.329, 0.200)
		colorLowland   (0.508, 0.441, 0.370, 0.500)
		colorUpland    (0.531, 0.461, 0.381, 0.800)
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
		SemiMajorAxis   0.0139447
		Period          0.0852815
		Eccentricity    0.0115738
		Inclination     0.217192
		AscendingNode   -61.8481
		ArgOfPericenter 154.293
		MeanAnomaly     -162.629
	}
}

DwarfMoon	"Japrael System 8.D4"
{
	ParentBody     "Japrael System 8"
	Class	       "Asteroid"

	Mass            3.21257e-008
	Radius          51.5252
	InertiaMoment   0.397073

	RotationPeriod  671.148
	Obliquity       -29.3724
	EqAscendNode    106.682

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.676 0.604 0.527)

	Surface
	{
		SurfStyle       0.0067483
		OceanStyle      0.946326
		Randomize      (0.093, -0.674, 0.297)
		colorDistMagn   0.371623
		colorDistFreq   1.31887
		detailScale     1406.98
		colorConversion true
		snowLevel       2
		tropicLatitude  0.836217
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.45093
		terraceProb     0.209853
		erosion         0
		montesMagn      0.288275
		montesFreq      2.8688
		montesSpiky     0.931862
		montesFraction  0.685356
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.4337
		hillsFraction   0.506838
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240525
		craterFreq      0.154086
		craterDensity   1.02584
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50324
		volcanoTemp     1282.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.242, 0.211, 0.000)
		colorShelf     (0.287, 0.257, 0.224, 0.000)
		colorBeach     (0.304, 0.272, 0.237, 0.000)
		colorDesert    (0.321, 0.287, 0.250, 0.000)
		colorLowland   (0.338, 0.302, 0.264, 0.000)
		colorUpland    (0.355, 0.317, 0.277, 0.000)
		colorRock      (0.372, 0.332, 0.290, 0.000)
		colorSnow      (0.389, 0.347, 0.303, 1.000)
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
		SemiMajorAxis   0.0875953
		Period          1.34268
		Eccentricity    0.461578
		Inclination     -60.9188
		AscendingNode   106.931
		ArgOfPericenter 30.5817
		MeanAnomaly     10.686
	}
}

DwarfMoon	"Japrael System 8.D5"
{
	ParentBody     "8"
	Class	       "Asteroid"

	Mass            4.3598e-008
	Radius          51.899
	InertiaMoment   0.39863

	RotationPeriod  590.893
	Obliquity       68.456
	EqAscendNode    -3.9236

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.634 0.632 0.629)

	Surface
	{
		SurfStyle       0.477026
		OceanStyle      0.518364
		Randomize      (0.078, -0.730, 0.459)
		colorDistMagn   0.896922
		colorDistFreq   1.32018
		detailScale     1417.19
		colorConversion true
		snowLevel       2
		tropicLatitude  0.786013
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.56255
		terraceProb     0.38757
		erosion         0
		montesMagn      0.613511
		montesFreq      3.27527
		montesSpiky     0.944406
		montesFraction  0.508521
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.45652
		hillsFraction   0.609455
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244726
		craterFreq      0.23478
		craterDensity   1.06853
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48144
		volcanoTemp     1650.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.254, 0.253, 0.251, 0.000)
		colorShelf     (0.270, 0.268, 0.267, 0.000)
		colorBeach     (0.286, 0.284, 0.283, 0.000)
		colorDesert    (0.301, 0.300, 0.299, 0.000)
		colorLowland   (0.317, 0.316, 0.314, 0.000)
		colorUpland    (0.333, 0.332, 0.330, 0.000)
		colorRock      (0.349, 0.347, 0.346, 0.000)
		colorSnow      (0.365, 0.363, 0.361, 1.000)
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
		SemiMajorAxis   0.0880589
		Period          1.35336
		Eccentricity    0.431088
		Inclination     -17.0741
		AscendingNode   -11.9487
		ArgOfPericenter 51.5961
		MeanAnomaly     65.9148
	}
}

DwarfMoon	"Japrael System 8.D6"
{
	ParentBody     "Japrael System 8"
	Class	       "Asteroid"

	Mass            5.92208e-008
	Radius          54.9901
	InertiaMoment   0.399605

	RotationPeriod  542.987
	Obliquity       -3.98563
	EqAscendNode    -142.107

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      3.5
	Color          (0.507 0.499 0.497)

	Surface
	{
		SurfStyle       0.855178
		OceanStyle      0.00653998
		Randomize      (-0.809, -0.889, -0.586)
		colorDistMagn   0.541629
		colorDistFreq   1.29088
		detailScale     1501.6
		colorConversion true
		snowLevel       2
		tropicLatitude  0.335627
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.326529
		terraceProb     0.130231
		erosion         0
		montesMagn      0.587372
		montesFreq      3.06006
		montesSpiky     0.964601
		montesFraction  0.584882
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.85633
		hillsFraction   0.414219
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253653
		craterFreq      0.254933
		craterDensity   0.95575
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57793
		volcanoTemp     1308.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.175, 0.199, 0.050)
		colorShelf     (0.203, 0.205, 0.228, 0.040)
		colorBeach     (0.233, 0.235, 0.258, 0.030)
		colorDesert    (0.264, 0.265, 0.293, 0.020)
		colorLowland   (0.294, 0.295, 0.323, 0.030)
		colorUpland    (0.325, 0.325, 0.353, 0.050)
		colorRock      (0.355, 0.355, 0.392, 0.020)
		colorSnow      (0.355, 0.355, 0.392, 1.000)
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
		SemiMajorAxis   0.0884033
		Period          1.3613
		Eccentricity    0.429877
		Inclination     16.4554
		AscendingNode   -138.412
		ArgOfPericenter 79.9581
		MeanAnomaly     11.3392
	}
}

Comet	"Japrael System C1"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            6.0765e-015
	Radius          0.259577
	InertiaMoment   0.397352

	Oblateness      0.00542713

	RotationPeriod  70.8237
	Obliquity       314.845
	EqAscendNode    263.751

	AbsMagn         0.0773187
	SlopeParam      3.63162
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.693 0.615 0.462)

	Surface
	{
		SurfStyle       0.288784
		OceanStyle      0.0370425
		Randomize      (-0.224, 0.069, 0.309)
		colorDistMagn   0.556553
		colorDistFreq   4.05765e-005
		detailScale     7.08817
		colorConversion true
		snowLevel       2
		tropicLatitude  0.90762
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.653232
		terraceProb     0.315424
		erosion         0
		montesMagn      0.463244
		montesFreq      2.95591
		montesSpiky     0.996168
		montesFraction  0.60223
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000153186
		hillsFraction   0.575805
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22325
		craterFreq      0.214999
		craterDensity   0.933853
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.473572
		volcanoTemp     1448.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.277, 0.246, 0.185, 0.000)
		colorShelf     (0.294, 0.261, 0.196, 0.000)
		colorBeach     (0.312, 0.277, 0.208, 0.000)
		colorDesert    (0.329, 0.292, 0.219, 0.000)
		colorLowland   (0.346, 0.307, 0.231, 0.000)
		colorUpland    (0.364, 0.323, 0.243, 0.000)
		colorRock      (0.381, 0.338, 0.254, 0.000)
		colorSnow      (0.398, 0.354, 0.266, 1.000)
		BumpHeight      0.233619
		BumpOffset      0.0467238
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

	CometTail
	{
		MaxLength   0.106977
		GasToDust   0.25
		Particles   1195
		GasBright   0.279238
		DustBright  0.289439
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   101.535
		Period          510.151
		Eccentricity    0.941576
		Inclination     -140.28
		AscendingNode   105.703
		ArgOfPericenter -46.8915
		MeanAnomaly     -32.1223
	}
}

Comet	"Japrael System C2"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            4.69974e-011
	Radius          4.54688
	InertiaMoment   0.399413

	Oblateness      0.00404478

	RotationPeriod  68.6525
	Obliquity       268.051
	EqAscendNode    248.328

	AbsMagn         9.85409
	SlopeParam      4.19587
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.637 0.635 0.633)

	Surface
	{
		SurfStyle       0.228483
		OceanStyle      0.449101
		Randomize      (-0.951, -0.440, -0.349)
		colorDistMagn   0.0143757
		colorDistFreq   0.0156003
		detailScale     124.16
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999431
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.444427
		terraceProb     0.373974
		erosion         0
		montesMagn      0.326635
		montesFreq      2.96972
		montesSpiky     0.890199
		montesFraction  0.675525
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0377164
		hillsFraction   0.787754
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275002
		craterFreq      0.25465
		craterDensity   0.774813
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.391366
		volcanoTemp     1433.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.255, 0.254, 0.253, 0.000)
		colorShelf     (0.271, 0.270, 0.269, 0.000)
		colorBeach     (0.287, 0.286, 0.285, 0.000)
		colorDesert    (0.303, 0.302, 0.301, 0.000)
		colorLowland   (0.319, 0.317, 0.316, 0.000)
		colorUpland    (0.335, 0.333, 0.332, 0.000)
		colorRock      (0.351, 0.349, 0.348, 0.000)
		colorSnow      (0.366, 0.365, 0.364, 1.000)
		BumpHeight      4.0922
		BumpOffset      0.818439
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

	CometTail
	{
		MaxLength   0.588169
		GasToDust   0.25
		Particles   2168
		GasBright   0.0126775
		DustBright  0.240487
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   83.6113
		Period          381.217
		Eccentricity    0.896011
		Inclination     -0.0624028
		AscendingNode   -105.98
		ArgOfPericenter -46.9348
		MeanAnomaly     -137.15
	}
}

Comet	"Japrael System C3"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            3.6349e-007
	Radius          101.449
	InertiaMoment   0.398141

	Oblateness      0.00615132

	RotationPeriod  66.554
	Obliquity       221.256
	EqAscendNode    232.906

	AbsMagn         6.35839
	SlopeParam      4.77651
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.495 0.488 0.483)

	Surface
	{
		SurfStyle       0.671066
		OceanStyle      0.0583361
		Randomize      (-0.838, -0.459, -0.974)
		colorDistMagn   0.0333467
		colorDistFreq   5.84705
		detailScale     2770.23
		colorConversion true
		snowLevel       2
		tropicLatitude  0.974805
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.578824
		terraceProb     0.405101
		erosion         0
		montesMagn      0.389984
		montesFreq      2.94763
		montesSpiky     0.928835
		montesFraction  0.691371
		dunesFraction   0
		hillsMagn       0
		hillsFreq       27.6546
		hillsFraction   0.584669
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246166
		craterFreq      0.289716
		craterDensity   0.874854
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50316
		volcanoTemp     1367.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.193, 0.166, 0.135, 0.000)
		colorShelf     (0.198, 0.171, 0.155, 0.000)
		colorBeach     (0.233, 0.200, 0.184, 0.000)
		colorDesert    (0.253, 0.215, 0.179, 0.000)
		colorLowland   (0.277, 0.229, 0.203, 0.000)
		colorUpland    (0.307, 0.278, 0.246, 0.000)
		colorRock      (0.332, 0.302, 0.266, 0.000)
		colorSnow      (0.362, 0.322, 0.280, 1.000)
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

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.0804935
		DustBright  0.657157
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   73.113
		Period          311.721
		Eccentricity    0.866981
		Inclination     73.9962
		AscendingNode   91.4281
		ArgOfPericenter 132.31
		MeanAnomaly     -50.6099
	}
}

Comet	"Japrael System C4"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.11921e-014
	Radius          0.280385
	InertiaMoment   0.39984

	Oblateness      0.00451692

	RotationPeriod  64.5168
	Obliquity       174.462
	EqAscendNode    217.483

	AbsMagn         18.432
	SlopeParam      5.43302
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.498 0.488 0.484)

	Surface
	{
		SurfStyle       0.888596
		OceanStyle      0.295838
		Randomize      (0.289, -0.384, -0.017)
		colorDistMagn   0.947828
		colorDistFreq   3.74507e-005
		detailScale     7.65638
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999859
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.591439
		terraceProb     0.326524
		erosion         0
		montesMagn      0.425691
		montesFreq      2.6594
		montesSpiky     0.839626
		montesFraction  0.728795
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000202399
		hillsFraction   0.563354
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.266426
		craterFreq      0.195767
		craterDensity   1.02225
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553799
		volcanoTemp     1388.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.169, 0.171, 0.194, 0.050)
		colorShelf     (0.199, 0.200, 0.223, 0.040)
		colorBeach     (0.229, 0.229, 0.252, 0.030)
		colorDesert    (0.259, 0.259, 0.286, 0.020)
		colorLowland   (0.289, 0.288, 0.315, 0.030)
		colorUpland    (0.319, 0.317, 0.344, 0.050)
		colorRock      (0.348, 0.346, 0.382, 0.020)
		colorSnow      (0.348, 0.346, 0.382, 1.000)
		BumpHeight      0.252347
		BumpOffset      0.0504693
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

	CometTail
	{
		MaxLength   0.139803
		GasToDust   0.25
		Particles   1262
		GasBright   0.0709894
		DustBright  0.351148
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   66.0011
		Period          267.363
		Eccentricity    0.868279
		Inclination     92.4856
		AscendingNode   51.5668
		ArgOfPericenter -171.705
		MeanAnomaly     -81.401
	}
}

Comet	"Japrael System C5"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            8.6563e-011
	Radius          6.28391
	InertiaMoment   0.398712

	Oblateness      0.00696887

	RotationPeriod  62.5312
	Obliquity       127.668
	EqAscendNode    202.06

	AbsMagn         9.62474
	SlopeParam      6.30302
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.775 0.725 0.659)

	Surface
	{
		SurfStyle       0.209376
		OceanStyle      0.365597
		Randomize      (0.036, 0.858, -0.216)
		colorDistMagn   0.384759
		colorDistFreq   0.0241505
		detailScale     171.593
		colorConversion true
		snowLevel       2
		tropicLatitude  0.996218
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.484895
		terraceProb     0.264267
		erosion         0
		montesMagn      0.638264
		montesFreq      1.99014
		montesSpiky     0.931978
		montesFraction  0.563938
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0791927
		hillsFraction   0.424705
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237236
		craterFreq      0.226256
		craterDensity   0.868102
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.540472
		volcanoTemp     1442.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.290, 0.264, 0.000)
		colorShelf     (0.330, 0.308, 0.280, 0.000)
		colorBeach     (0.349, 0.326, 0.296, 0.000)
		colorDesert    (0.368, 0.345, 0.313, 0.000)
		colorLowland   (0.388, 0.363, 0.329, 0.000)
		colorUpland    (0.407, 0.381, 0.346, 0.000)
		colorRock      (0.426, 0.399, 0.362, 0.000)
		colorSnow      (0.446, 0.417, 0.379, 1.000)
		BumpHeight      5.65552
		BumpOffset      1.1311
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

	CometTail
	{
		MaxLength   0.620995
		GasToDust   0.25
		Particles   2234
		GasBright   0.205996
		DustBright  0.700628
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   101.834
		Period          512.408
		Eccentricity    0.888017
		Inclination     66.9802
		AscendingNode   102.049
		ArgOfPericenter 135.348
		MeanAnomaly     58.9918
	}
}

Comet	"Japrael System C6"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            6.69503e-007
	Radius          108.917
	InertiaMoment   0.39674

	Oblateness      0.00496065

	RotationPeriod  60.5888
	Obliquity       80.8735
	EqAscendNode    186.638

	AbsMagn         6.12861
	SlopeParam      8.47148
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.651 0.611 0.539)

	Surface
	{
		SurfStyle       0.374539
		OceanStyle      0.915771
		Randomize      (-0.567, -0.100, 0.846)
		colorDistMagn   0.990038
		colorDistFreq   5.19717
		detailScale     2974.16
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998203
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.515207
		terraceProb     0.32447
		erosion         0
		montesMagn      0.458468
		montesFreq      3.96156
		montesSpiky     0.853149
		montesFraction  0.52433
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.5686
		hillsFraction   0.464888
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234624
		craterFreq      0.424637
		craterDensity   0.795756
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.576925
		volcanoTemp     1683.26
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.260, 0.244, 0.216, 0.000)
		colorShelf     (0.277, 0.260, 0.229, 0.000)
		colorBeach     (0.293, 0.275, 0.243, 0.000)
		colorDesert    (0.309, 0.290, 0.256, 0.000)
		colorLowland   (0.325, 0.306, 0.270, 0.000)
		colorUpland    (0.342, 0.321, 0.283, 0.000)
		colorRock      (0.358, 0.336, 0.297, 0.000)
		colorSnow      (0.374, 0.351, 0.310, 1.000)
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

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.16921
		DustBright  0.421901
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   83.3693
		Period          379.563
		Eccentricity    0.841884
		Inclination     150.071
		AscendingNode   113.621
		ArgOfPericenter -82.4661
		MeanAnomaly     82.4788
	}
}

Comet	"Japrael System C7"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            2.06145e-014
	Radius          0.389236
	InertiaMoment   0.399193

	Oblateness      0.00791102

	RotationPeriod  58.6824
	Obliquity       34.0792
	EqAscendNode    171.215

	AbsMagn         15.8152
	SlopeParam      2.70125
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.714 0.711 0.709)

	Surface
	{
		SurfStyle       0.483105
		OceanStyle      0.436003
		Randomize      (-0.413, -0.622, 0.715)
		colorDistMagn   0.339944
		colorDistFreq   0.000112168
		detailScale     10.6287
		colorConversion true
		snowLevel       2
		tropicLatitude  0.758347
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.286278
		terraceProb     0.19179
		erosion         0
		montesMagn      0.503618
		montesFreq      3.20606
		montesSpiky     0.944672
		montesFraction  0.535795
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000465072
		hillsFraction   0.420406
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264522
		craterFreq      0.241949
		craterDensity   1.00851
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526017
		volcanoTemp     1239.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.284, 0.283, 0.000)
		colorShelf     (0.303, 0.302, 0.301, 0.000)
		colorBeach     (0.321, 0.320, 0.319, 0.000)
		colorDesert    (0.339, 0.338, 0.337, 0.000)
		colorLowland   (0.357, 0.355, 0.354, 0.000)
		colorUpland    (0.375, 0.373, 0.372, 0.000)
		colorRock      (0.393, 0.391, 0.390, 0.000)
		colorSnow      (0.410, 0.409, 0.408, 1.000)
		BumpHeight      0.350313
		BumpOffset      0.0700625
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

	CometTail
	{
		MaxLength   0.172629
		GasToDust   0.25
		Particles   1328
		GasBright   0.0951644
		DustBright  0.180433
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   96.1661
		Period          470.227
		Eccentricity    0.876388
		Inclination     -103.158
		AscendingNode   148.117
		ArgOfPericenter -54.2209
		MeanAnomaly     65.6959
	}
}

Comet	"Japrael System C8"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.59439e-010
	Radius          6.68147
	InertiaMoment   0.397794

	Oblateness      0.00549219

	RotationPeriod  56.8056
	Obliquity       347.285
	EqAscendNode    155.793

	AbsMagn         9.40061
	SlopeParam      3.33695
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.711 0.710 0.708)

	Surface
	{
		SurfStyle       0.286732
		OceanStyle      0.638653
		Randomize      (-0.116, 0.957, 0.765)
		colorDistMagn   0.924303
		colorDistFreq   0.00811217
		detailScale     182.449
		colorConversion true
		snowLevel       2
		tropicLatitude  0.157921
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.443416
		terraceProb     0.465151
		erosion         0
		montesMagn      0.463691
		montesFreq      3.73691
		montesSpiky     0.873983
		montesFraction  0.642476
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.131437
		hillsFraction   0.748997
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24966
		craterFreq      0.197728
		craterDensity   1.01409
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.461691
		volcanoTemp     1138.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.284, 0.283, 0.000)
		colorShelf     (0.302, 0.302, 0.301, 0.000)
		colorBeach     (0.320, 0.319, 0.319, 0.000)
		colorDesert    (0.338, 0.337, 0.336, 0.000)
		colorLowland   (0.356, 0.355, 0.354, 0.000)
		colorUpland    (0.374, 0.372, 0.372, 0.000)
		colorRock      (0.391, 0.390, 0.389, 0.000)
		colorSnow      (0.409, 0.408, 0.407, 1.000)
		BumpHeight      6.01333
		BumpOffset      1.20267
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

	CometTail
	{
		MaxLength   0.653821
		GasToDust   0.25
		Particles   2300
		GasBright   0.307338
		DustBright  0.452746
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   74.1187
		Period          318.175
		Eccentricity    0.95156
		Inclination     5.91907
		AscendingNode   40.8245
		ArgOfPericenter -157.627
		MeanAnomaly     -132.688
	}
}

Comet	"Japrael System C9"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            4.90923e-018
	Radius          0.02411
	InertiaMoment   0.399631

	Oblateness      0.0090178

	RotationPeriod  54.9524
	Obliquity       300.491
	EqAscendNode    140.37

	AbsMagn         5.89248
	SlopeParam      3.91074
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.412 0.408 0.401)

	Surface
	{
		SurfStyle       0.532341
		OceanStyle      0.869505
		Randomize      (-0.389, -0.170, -0.222)
		colorDistMagn   0.858081
		colorDistFreq   2.23509e-007
		detailScale     0.658364
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995866
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.472136
		terraceProb     0.239842
		erosion         0
		montesMagn      0.521946
		montesFreq      2.78934
		montesSpiky     0.910888
		montesFraction  0.382099
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.53876e-007
		hillsFraction   0.820839
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.264289
		craterFreq      0.264267
		craterDensity   0.929008
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511229
		volcanoTemp     1412.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.161, 0.139, 0.112, 0.000)
		colorShelf     (0.165, 0.143, 0.128, 0.000)
		colorBeach     (0.194, 0.167, 0.152, 0.000)
		colorDesert    (0.210, 0.179, 0.148, 0.000)
		colorLowland   (0.231, 0.192, 0.168, 0.000)
		colorUpland    (0.255, 0.232, 0.205, 0.000)
		colorRock      (0.276, 0.253, 0.221, 0.000)
		colorSnow      (0.301, 0.269, 0.233, 1.000)
		BumpHeight      0.021699
		BumpOffset      0.0043398
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.206011
		DustBright  0.23856
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   103.537
		Period          525.314
		Eccentricity    0.891527
		Inclination     -91.7898
		AscendingNode   -97.1147
		ArgOfPericenter -34.018
		MeanAnomaly     -48.0641
	}
}

Comet	"Japrael System C10"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            3.79694e-014
	Radius          0.400131
	InertiaMoment   0.398446

	Oblateness      0.00567891

	RotationPeriod  53.1174
	Obliquity       253.696
	EqAscendNode    124.948

	AbsMagn         14.7327
	SlopeParam      4.47713
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.444 0.438 0.432)

	Surface
	{
		SurfStyle       0.292649
		OceanStyle      0.321569
		Randomize      (0.297, 0.420, 0.827)
		colorDistMagn   0.593692
		colorDistFreq   5.48592e-005
		detailScale     10.9263
		colorConversion true
		snowLevel       2
		tropicLatitude  0.621219
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.539907
		terraceProb     0.179259
		erosion         0
		montesMagn      0.450037
		montesFreq      2.11773
		montesSpiky     0.986606
		montesFraction  0.750523
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000373852
		hillsFraction   0.64125
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208842
		craterFreq      0.152051
		craterDensity   0.702087
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.385442
		volcanoTemp     1674.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.175, 0.173, 0.000)
		colorShelf     (0.189, 0.186, 0.184, 0.000)
		colorBeach     (0.200, 0.197, 0.195, 0.000)
		colorDesert    (0.211, 0.208, 0.205, 0.000)
		colorLowland   (0.222, 0.219, 0.216, 0.000)
		colorUpland    (0.233, 0.230, 0.227, 0.000)
		colorRock      (0.244, 0.241, 0.238, 0.000)
		colorSnow      (0.255, 0.252, 0.249, 1.000)
		BumpHeight      0.360118
		BumpOffset      0.0720236
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

	CometTail
	{
		MaxLength   0.205455
		GasToDust   0.25
		Particles   1394
		GasBright   0.0208463
		DustBright  0.908211
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   97.9089
		Period          483.067
		Eccentricity    0.864094
		Inclination     141.471
		AscendingNode   19.3691
		ArgOfPericenter -59.7063
		MeanAnomaly     161.255
	}
}

Comet	"Japrael System C11"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            2.93666e-010
	Radius          9.42284
	InertiaMoment   0.395371

	Oblateness      0.0101645

	RotationPeriod  51.2957
	Obliquity       206.902
	EqAscendNode    109.525

	AbsMagn         9.18081
	SlopeParam      5.08553
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.638 0.635 0.629)

	Surface
	{
		SurfStyle       0.50218
		OceanStyle      0.963021
		Randomize      (-0.463, 0.664, 0.392)
		colorDistMagn   0.837228
		colorDistFreq   0.0381196
		detailScale     257.306
		colorConversion true
		snowLevel       2
		tropicLatitude  0.468299
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.545324
		terraceProb     0.309176
		erosion         0
		montesMagn      0.427048
		montesFreq      3.79995
		montesSpiky     0.780924
		montesFraction  0.610501
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.149002
		hillsFraction   0.497098
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214614
		craterFreq      0.234274
		craterDensity   0.862429
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.598292
		volcanoTemp     1501.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.216, 0.176, 0.000)
		colorShelf     (0.255, 0.222, 0.201, 0.000)
		colorBeach     (0.300, 0.260, 0.239, 0.000)
		colorDesert    (0.325, 0.279, 0.233, 0.000)
		colorLowland   (0.357, 0.298, 0.264, 0.000)
		colorUpland    (0.395, 0.362, 0.321, 0.000)
		colorRock      (0.427, 0.393, 0.346, 0.000)
		colorSnow      (0.465, 0.419, 0.365, 1.000)
		BumpHeight      8.48055
		BumpOffset      1.69611
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

	CometTail
	{
		MaxLength   0.686647
		GasToDust   0.25
		Particles   2366
		GasBright   0.0499936
		DustBright  0.56355
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   107.046
		Period          552.241
		Eccentricity    0.869098
		Inclination     178.811
		AscendingNode   148.629
		ArgOfPericenter 19.4203
		MeanAnomaly     -96.9809
	}
}

Comet	"Japrael System C12"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            9.04217e-018
	Radius          0.0375589
	InertiaMoment   0.398963

	Oblateness      0.0227706

	RotationPeriod  49.4823
	Obliquity       160.108
	EqAscendNode    94.1024

	AbsMagn         5.64877
	SlopeParam      5.8188
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.478 0.474 0.471)

	Surface
	{
		SurfStyle       0.700345
		OceanStyle      0.350673
		Randomize      (0.165, 0.024, -0.545)
		colorDistMagn   0.290788
		colorDistFreq   1.416e-007
		detailScale     1.02561
		colorConversion true
		snowLevel       2
		tropicLatitude  0.885839
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.742968
		terraceProb     0.242626
		erosion         0
		montesMagn      0.542809
		montesFreq      2.78133
		montesSpiky     0.843166
		montesFraction  0.826007
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.38781e-006
		hillsFraction   0.63785
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237355
		craterFreq      0.229459
		craterDensity   0.968517
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51997
		volcanoTemp     1196.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.186, 0.161, 0.132, 0.000)
		colorShelf     (0.191, 0.166, 0.151, 0.000)
		colorBeach     (0.225, 0.194, 0.179, 0.000)
		colorDesert    (0.244, 0.208, 0.174, 0.000)
		colorLowland   (0.268, 0.223, 0.198, 0.000)
		colorUpland    (0.296, 0.270, 0.240, 0.000)
		colorRock      (0.320, 0.294, 0.259, 0.000)
		colorSnow      (0.349, 0.313, 0.273, 1.000)
		BumpHeight      0.033803
		BumpOffset      0.00676061
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0418818
		DustBright  0.256148
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   98.6291
		Period          488.408
		Eccentricity    0.920572
		Inclination     109.273
		AscendingNode   118.574
		ArgOfPericenter 53.184
		MeanAnomaly     78.5042
	}
}

Comet	"Japrael System C13"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            6.99347e-014
	Radius          0.583669
	InertiaMoment   0.397365

	Oblateness      0.0118324

	RotationPeriod  47.6728
	Obliquity       113.313
	EqAscendNode    78.6798

	AbsMagn         13.9947
	SlopeParam      6.95917
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.657 0.654 0.653)

	Surface
	{
		SurfStyle       0.825187
		OceanStyle      0.77293
		Randomize      (-0.740, -0.159, 0.531)
		colorDistMagn   0.589585
		colorDistFreq   0.000265063
		detailScale     15.9381
		colorConversion true
		snowLevel       2
		tropicLatitude  0.986775
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.338319
		terraceProb     0.332767
		erosion         0
		montesMagn      0.480326
		montesFreq      3.86279
		montesSpiky     0.982618
		montesFraction  0.49056
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00099625
		hillsFraction   0.605074
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248995
		craterFreq      0.203509
		craterDensity   0.80326
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.331466
		volcanoTemp     1714.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.256, 0.222, 0.183, 0.000)
		colorShelf     (0.263, 0.229, 0.209, 0.000)
		colorBeach     (0.309, 0.268, 0.248, 0.000)
		colorDesert    (0.335, 0.288, 0.242, 0.000)
		colorLowland   (0.368, 0.307, 0.274, 0.000)
		colorUpland    (0.407, 0.373, 0.333, 0.000)
		colorRock      (0.440, 0.406, 0.359, 0.000)
		colorSnow      (0.480, 0.432, 0.379, 1.000)
		BumpHeight      0.525302
		BumpOffset      0.10506
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

	CometTail
	{
		MaxLength   0.238281
		GasToDust   0.25
		Particles   1461
		GasBright   0.15617
		DustBright  0.626347
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   111.962
		Period          590.718
		Eccentricity    0.935137
		Inclination     -101.392
		AscendingNode   105.479
		ArgOfPericenter -94.5897
		MeanAnomaly     -40.9211
	}
}

Comet	"Japrael System C14"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            5.40895e-010
	Radius          14.2909
	InertiaMoment   0.399418

	Oblateness      0.0244514

	RotationPeriod  45.8624
	Obliquity       66.5191
	EqAscendNode    63.2572

	AbsMagn         8.96451
	SlopeParam      2.3256
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.576 0.572 0.569)

	Surface
	{
		SurfStyle       0.145764
		OceanStyle      0.270572
		Randomize      (-0.702, -0.751, 0.704)
		colorDistMagn   0.722657
		colorDistFreq   0.0698899
		detailScale     390.237
		colorConversion true
		snowLevel       2
		tropicLatitude  0.924411
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.353396
		terraceProb     0.345219
		erosion         0
		montesMagn      0.46669
		montesFreq      2.97166
		montesSpiky     0.904629
		montesFraction  0.414331
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.441707
		hillsFraction   0.796887
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247026
		craterFreq      0.206591
		craterDensity   0.915681
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.355282
		volcanoTemp     1719.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.229, 0.228, 0.000)
		colorShelf     (0.245, 0.243, 0.242, 0.000)
		colorBeach     (0.259, 0.258, 0.256, 0.000)
		colorDesert    (0.273, 0.272, 0.270, 0.000)
		colorLowland   (0.288, 0.286, 0.285, 0.000)
		colorUpland    (0.302, 0.300, 0.299, 0.000)
		colorRock      (0.317, 0.315, 0.313, 0.000)
		colorSnow      (0.331, 0.329, 0.327, 1.000)
		BumpHeight      12.8618
		BumpOffset      2.57236
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

	CometTail
	{
		MaxLength   0.719473
		GasToDust   0.25
		Particles   2433
		GasBright   0.120776
		DustBright  0.346227
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   96.4727
		Period          472.477
		Eccentricity    0.911625
		Inclination     128.369
		AscendingNode   150.963
		ArgOfPericenter -131.645
		MeanAnomaly     -47.5053
	}
}

Comet	"Japrael System C15"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.66546e-017
	Radius          0.0361537
	InertiaMoment   0.398149

	Oblateness      0.0138734

	RotationPeriod  44.0465
	Obliquity       19.7248
	EqAscendNode    47.8346

	AbsMagn         5.39598
	SlopeParam      3.02706
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.682 0.608 0.548)

	Surface
	{
		SurfStyle       0.115977
		OceanStyle      0.114719
		Randomize      (0.529, 0.745, -0.656)
		colorDistMagn   0.609659
		colorDistFreq   9.637e-007
		detailScale     0.987237
		colorConversion true
		snowLevel       2
		tropicLatitude  0.855843
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.60811
		terraceProb     0.141038
		erosion         0
		montesMagn      0.413211
		montesFreq      2.45458
		montesSpiky     0.926521
		montesFraction  0.34319
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.13945e-006
		hillsFraction   0.520712
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.224826
		craterFreq      0.23062
		craterDensity   0.808361
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523392
		volcanoTemp     1658.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.273, 0.243, 0.219, 0.000)
		colorShelf     (0.290, 0.258, 0.233, 0.000)
		colorBeach     (0.307, 0.274, 0.247, 0.000)
		colorDesert    (0.324, 0.289, 0.260, 0.000)
		colorLowland   (0.341, 0.304, 0.274, 0.000)
		colorUpland    (0.358, 0.319, 0.288, 0.000)
		colorRock      (0.375, 0.334, 0.301, 0.000)
		colorSnow      (0.392, 0.350, 0.315, 1.000)
		BumpHeight      0.0325383
		BumpOffset      0.00650766
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.302254
		DustBright  0.649235
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   93.6906
		Period          452.187
		Eccentricity    0.894816
		Inclination     -78.5524
		AscendingNode   2.74845
		ArgOfPericenter 66.3858
		MeanAnomaly     49.5292
	}
}

Comet	"Japrael System C16"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.28811e-013
	Radius          0.870792
	InertiaMoment   0.399845

	Oblateness      0.0274527

	RotationPeriod  42.2206
	Obliquity       332.931
	EqAscendNode    32.412

	AbsMagn         13.418
	SlopeParam      3.62377
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.613 0.609 0.606)

	Surface
	{
		SurfStyle       0.205971
		OceanStyle      0.0365867
		Randomize      (-0.831, 0.784, -0.453)
		colorDistMagn   0.786889
		colorDistFreq   0.000662877
		detailScale     23.7784
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997375
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.449836
		terraceProb     0.399593
		erosion         0
		montesMagn      0.619523
		montesFreq      2.24649
		montesSpiky     0.963779
		montesFraction  0.397626
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00196528
		hillsFraction   0.618271
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250048
		craterFreq      0.151355
		craterDensity   0.887953
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4699
		volcanoTemp     1469.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.245, 0.244, 0.242, 0.000)
		colorShelf     (0.261, 0.259, 0.257, 0.000)
		colorBeach     (0.276, 0.274, 0.273, 0.000)
		colorDesert    (0.291, 0.289, 0.288, 0.000)
		colorLowland   (0.307, 0.305, 0.303, 0.000)
		colorUpland    (0.322, 0.320, 0.318, 0.000)
		colorRock      (0.337, 0.335, 0.333, 0.000)
		colorSnow      (0.353, 0.350, 0.348, 1.000)
		BumpHeight      0.783713
		BumpOffset      0.156743
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

	CometTail
	{
		MaxLength   0.271107
		GasToDust   0.25
		Particles   1527
		GasBright   0.239578
		DustBright  0.396398
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   65.247
		Period          262.794
		Eccentricity    0.923785
		Inclination     92.1889
		AscendingNode   94.8444
		ArgOfPericenter 92.0539
		MeanAnomaly     31.6061
	}
}

Comet	"Japrael System C17"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            9.96262e-010
	Radius          14.1299
	InertiaMoment   0.398718

	Oblateness      0.0165093

	RotationPeriod  40.3796
	Obliquity       286.136
	EqAscendNode    16.9894

	AbsMagn         8.751
	SlopeParam      4.18812
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.541 0.537 0.531)

	Surface
	{
		SurfStyle       0.620803
		OceanStyle      0.144915
		Randomize      (0.498, -0.920, 0.874)
		colorDistMagn   0.703111
		colorDistFreq   0.119947
		detailScale     385.84
		colorConversion true
		snowLevel       2
		tropicLatitude  0.994602
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.625209
		terraceProb     0.305327
		erosion         0
		montesMagn      0.40501
		montesFreq      3.41215
		montesSpiky     0.997009
		montesFraction  0.508927
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.306213
		hillsFraction   0.70307
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.195507
		craterFreq      0.20642
		craterDensity   0.948195
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484134
		volcanoTemp     1613.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.182, 0.149, 0.000)
		colorShelf     (0.217, 0.188, 0.170, 0.000)
		colorBeach     (0.254, 0.220, 0.202, 0.000)
		colorDesert    (0.276, 0.236, 0.197, 0.000)
		colorLowland   (0.303, 0.252, 0.223, 0.000)
		colorUpland    (0.336, 0.306, 0.271, 0.000)
		colorRock      (0.363, 0.333, 0.292, 0.000)
		colorSnow      (0.395, 0.354, 0.308, 1.000)
		BumpHeight      12.7169
		BumpOffset      2.54338
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

	CometTail
	{
		MaxLength   0.752299
		GasToDust   0.25
		Particles   2499
		GasBright   0.139643
		DustBright  0.18082
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   73.5871
		Period          314.758
		Eccentricity    0.896921
		Inclination     -150.807
		AscendingNode   -107.24
		ArgOfPericenter -152.336
		MeanAnomaly     50.0161
	}
}

Comet	"Japrael System C18"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            3.06757e-017
	Radius          0.0533062
	InertiaMoment   0.39676

	Oblateness      0.0314066

	RotationPeriod  38.5185
	Obliquity       239.342
	EqAscendNode    1.56681

	AbsMagn         5.13235
	SlopeParam      4.76819
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.623 0.621 0.618)

	Surface
	{
		SurfStyle       0.227972
		OceanStyle      0.593135
		Randomize      (0.630, 0.640, -0.195)
		colorDistMagn   0.54838
		colorDistFreq   1.26951e-006
		detailScale     1.45562
		colorConversion true
		snowLevel       2
		tropicLatitude  0.144335
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.572918
		terraceProb     0.2964
		erosion         0
		montesMagn      0.587094
		montesFreq      3.36084
		montesSpiky     0.872605
		montesFraction  0.45257
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.23839e-006
		hillsFraction   0.655777
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240391
		craterFreq      0.216499
		craterDensity   1.00812
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484894
		volcanoTemp     1886.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.248, 0.247, 0.000)
		colorShelf     (0.265, 0.264, 0.263, 0.000)
		colorBeach     (0.280, 0.279, 0.278, 0.000)
		colorDesert    (0.296, 0.295, 0.293, 0.000)
		colorLowland   (0.311, 0.310, 0.309, 0.000)
		colorUpland    (0.327, 0.326, 0.324, 0.000)
		colorRock      (0.343, 0.342, 0.340, 0.000)
		colorSnow      (0.358, 0.357, 0.355, 1.000)
		BumpHeight      0.0479756
		BumpOffset      0.00959512
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.398289
		DustBright  0.40666
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   81.619
		Period          367.673
		Eccentricity    0.889921
		Inclination     -51.0583
		AscendingNode   -0.611387
		ArgOfPericenter 135.484
		MeanAnomaly     -82.635
	}
}

Comet	"Japrael System C19"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            2.37254e-013
	Radius          0.875237
	InertiaMoment   0.399199

	Oblateness      0.0200559

	RotationPeriod  36.6317
	Obliquity       192.548
	EqAscendNode    346.144

	AbsMagn         12.9361
	SlopeParam      5.42307
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.713 0.710 0.707)

	Surface
	{
		SurfStyle       0.429302
		OceanStyle      0.405801
		Randomize      (0.750, 0.566, 0.012)
		colorDistMagn   0.8643
		colorDistFreq   0.000636026
		detailScale     23.8998
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995768
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.481943
		terraceProb     0.243963
		erosion         0
		montesMagn      0.566481
		montesFreq      3.27081
		montesSpiky     0.964485
		montesFraction  0.710705
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0021919
		hillsFraction   0.676923
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.25551
		craterFreq      0.270468
		craterDensity   1.09116
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.518465
		volcanoTemp     1527.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.284, 0.283, 0.000)
		colorShelf     (0.303, 0.302, 0.300, 0.000)
		colorBeach     (0.321, 0.320, 0.318, 0.000)
		colorDesert    (0.339, 0.337, 0.336, 0.000)
		colorLowland   (0.357, 0.355, 0.353, 0.000)
		colorUpland    (0.374, 0.373, 0.371, 0.000)
		colorRock      (0.392, 0.391, 0.389, 0.000)
		colorSnow      (0.410, 0.409, 0.406, 1.000)
		BumpHeight      0.787713
		BumpOffset      0.157543
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

	CometTail
	{
		MaxLength   0.303933
		GasToDust   0.25
		Particles   1593
		GasBright   0.0263539
		DustBright  0.463082
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   92.724
		Period          445.208
		Eccentricity    0.853586
		Inclination     88.3694
		AscendingNode   107.176
		ArgOfPericenter -170.289
		MeanAnomaly     -138.128
	}
}

Comet	"Japrael System C20"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.83499e-009
	Radius          20.6435
	InertiaMoment   0.397804

	Oblateness      0.037692

	RotationPeriod  34.7131
	Obliquity       145.753
	EqAscendNode    330.722

	AbsMagn         8.5396
	SlopeParam      6.28811
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.707 0.701 0.698)

	Surface
	{
		SurfStyle       0.429403
		OceanStyle      0.947313
		Randomize      (0.271, -0.175, 0.365)
		colorDistMagn   0.676778
		colorDistFreq   0.107281
		detailScale     563.704
		colorConversion true
		snowLevel       2
		tropicLatitude  0.6068
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.374841
		terraceProb     0.511936
		erosion         0
		montesMagn      0.462276
		montesFreq      3.28155
		montesSpiky     0.979384
		montesFraction  0.473883
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.1114
		hillsFraction   0.485797
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248419
		craterFreq      0.188781
		craterDensity   1.03465
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485844
		volcanoTemp     1334.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.283, 0.280, 0.279, 0.000)
		colorShelf     (0.300, 0.298, 0.297, 0.000)
		colorBeach     (0.318, 0.315, 0.314, 0.000)
		colorDesert    (0.336, 0.333, 0.332, 0.000)
		colorLowland   (0.353, 0.350, 0.349, 0.000)
		colorUpland    (0.371, 0.368, 0.366, 0.000)
		colorRock      (0.389, 0.385, 0.384, 0.000)
		colorSnow      (0.406, 0.403, 0.401, 1.000)
		BumpHeight      18.5791
		BumpOffset      3.71582
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

	CometTail
	{
		MaxLength   0.785125
		GasToDust   0.25
		Particles   2565
		GasBright   0.109947
		DustBright  0.863976
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   117.556
		Period          635.536
		Eccentricity    0.92857
		Inclination     14.504
		AscendingNode   92.2054
		ArgOfPericenter -126.683
		MeanAnomaly     -174.852
	}
}

Comet	"Japrael System C21"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            5.65006e-017
	Radius          0.0542141
	InertiaMoment   0.399636

	Oblateness      0.0250731

	RotationPeriod  32.7559
	Obliquity       98.9591
	EqAscendNode    315.299

	AbsMagn         4.85561
	SlopeParam      8.38213
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.681 0.675 0.673)

	Surface
	{
		SurfStyle       0.0276285
		OceanStyle      0.550328
		Randomize      (-0.257, 0.629, 0.391)
		colorDistMagn   0.471905
		colorDistFreq   3.01409e-007
		detailScale     1.48041
		colorConversion true
		snowLevel       2
		tropicLatitude  0.956878
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.358697
		terraceProb     0.118804
		erosion         0
		montesMagn      0.514377
		montesFreq      2.69717
		montesSpiky     0.779746
		montesFraction  0.437723
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.86188e-006
		hillsFraction   0.654729
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.212425
		craterFreq      0.220548
		craterDensity   0.953847
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.589742
		volcanoTemp     1641.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.272, 0.270, 0.269, 0.000)
		colorShelf     (0.289, 0.287, 0.286, 0.000)
		colorBeach     (0.306, 0.304, 0.303, 0.000)
		colorDesert    (0.323, 0.321, 0.320, 0.000)
		colorLowland   (0.340, 0.338, 0.337, 0.000)
		colorUpland    (0.357, 0.354, 0.353, 0.000)
		colorRock      (0.374, 0.371, 0.370, 0.000)
		colorSnow      (0.391, 0.388, 0.387, 1.000)
		BumpHeight      0.0487927
		BumpOffset      0.00975854
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.113204
		DustBright  0.545205
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   117.405
		Period          634.318
		Eccentricity    0.848194
		Inclination     -120.697
		AscendingNode   115.823
		ArgOfPericenter -47.0929
		MeanAnomaly     -125.931
	}
}

Comet	"Japrael System C22"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            4.36991e-013
	Radius          1.26918
	InertiaMoment   0.398453

	Oblateness      0.0469797

	RotationPeriod  30.7527
	Obliquity       52.1648
	EqAscendNode    299.876

	AbsMagn         12.5169
	SlopeParam      2.6917
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.781 0.778 0.776)

	Surface
	{
		SurfStyle       0.445518
		OceanStyle      0.942872
		Randomize      (0.352, 0.136, -0.057)
		colorDistMagn   0.967443
		colorDistFreq   0.00123882
		detailScale     34.6571
		colorConversion true
		snowLevel       2
		tropicLatitude  0.209903
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.453994
		terraceProb     0.218001
		erosion         0
		montesMagn      0.338907
		montesFreq      2.97089
		montesSpiky     0.943701
		montesFraction  0.922486
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00368378
		hillsFraction   0.7475
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.258735
		craterFreq      0.155152
		craterDensity   0.914645
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535429
		volcanoTemp     1706.14
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.311, 0.310, 0.000)
		colorShelf     (0.332, 0.331, 0.330, 0.000)
		colorBeach     (0.351, 0.350, 0.349, 0.000)
		colorDesert    (0.371, 0.369, 0.368, 0.000)
		colorLowland   (0.390, 0.389, 0.388, 0.000)
		colorUpland    (0.410, 0.408, 0.407, 0.000)
		colorRock      (0.429, 0.428, 0.427, 0.000)
		colorSnow      (0.449, 0.447, 0.446, 1.000)
		BumpHeight      1.14226
		BumpOffset      0.228453
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

	CometTail
	{
		MaxLength   0.336758
		GasToDust   0.25
		Particles   1660
		GasBright   0.0792025
		DustBright  0.263693
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   74.8909
		Period          323.161
		Eccentricity    0.864499
		Inclination     137.812
		AscendingNode   9.42279
		ArgOfPericenter 74.708
		MeanAnomaly     67.3852
	}
}

Comet	"Japrael System C23"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            3.37981e-009
	Radius          21.1885
	InertiaMoment   0.395444

	Oblateness      0.0320988

	RotationPeriod  28.6945
	Obliquity       5.37047
	EqAscendNode    284.454

	AbsMagn         8.32971
	SlopeParam      3.32879
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.758 0.756 0.754)

	Surface
	{
		SurfStyle       0.964581
		OceanStyle      0.965596
		Randomize      (-0.661, -0.378, -0.261)
		colorDistMagn   0.299296
		colorDistFreq   0.382578
		detailScale     578.587
		colorConversion true
		snowLevel       2
		tropicLatitude  0.898907
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.722298
		terraceProb     0.162632
		erosion         0
		montesMagn      0.651831
		montesFreq      2.41882
		montesSpiky     0.996269
		montesFraction  0.705553
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.931932
		hillsFraction   0.60037
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.208335
		craterFreq      0.224297
		craterDensity   0.916894
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.549404
		volcanoTemp     1403.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.265, 0.302, 0.050)
		colorShelf     (0.303, 0.310, 0.347, 0.040)
		colorBeach     (0.349, 0.356, 0.392, 0.030)
		colorDesert    (0.394, 0.401, 0.445, 0.020)
		colorLowland   (0.440, 0.446, 0.490, 0.030)
		colorUpland    (0.485, 0.492, 0.535, 0.050)
		colorRock      (0.531, 0.537, 0.596, 0.020)
		colorSnow      (0.531, 0.537, 0.596, 1.000)
		BumpHeight      19.0697
		BumpOffset      3.81393
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

	CometTail
	{
		MaxLength   0.81795
		GasToDust   0.25
		Particles   2632
		GasBright   0.239963
		DustBright  0.58742
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   107.203
		Period          553.46
		Eccentricity    0.88455
		Inclination     -62.2372
		AscendingNode   108.025
		ArgOfPericenter -85.1865
		MeanAnomaly     7.67125
	}
}

Comet	"Japrael System C24"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.04067e-016
	Radius          0.0781232
	InertiaMoment   0.398969

	Oblateness      0.0617484

	RotationPeriod  26.5711
	Obliquity       318.576
	EqAscendNode    269.031

	AbsMagn         4.56294
	SlopeParam      3.90301
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.455 0.451 0.447)

	Surface
	{
		SurfStyle       0.529153
		OceanStyle      0.858724
		Randomize      (-0.564, 0.011, -0.705)
		colorDistMagn   0.996675
		colorDistFreq   3.56453e-006
		detailScale     2.13329
		colorConversion true
		snowLevel       2
		tropicLatitude  0.461425
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.441664
		terraceProb     0.272267
		erosion         0
		montesMagn      0.351544
		montesFreq      2.69792
		montesSpiky     0.884796
		montesFraction  0.419734
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.42764e-005
		hillsFraction   0.665039
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.222733
		craterFreq      0.230518
		craterDensity   1.01074
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496976
		volcanoTemp     1552.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.178, 0.153, 0.125, 0.000)
		colorShelf     (0.182, 0.158, 0.143, 0.000)
		colorBeach     (0.214, 0.185, 0.170, 0.000)
		colorDesert    (0.232, 0.198, 0.165, 0.000)
		colorLowland   (0.255, 0.212, 0.188, 0.000)
		colorUpland    (0.282, 0.257, 0.228, 0.000)
		colorRock      (0.305, 0.279, 0.246, 0.000)
		colorSnow      (0.332, 0.297, 0.259, 1.000)
		BumpHeight      0.0703109
		BumpOffset      0.0140622
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.178679
		DustBright  0.33319
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   99.5543
		Period          495.296
		Eccentricity    0.890475
		Inclination     -121.249
		AscendingNode   28.2649
		ArgOfPericenter 66.8146
		MeanAnomaly     -160.737
	}
}

Comet	"Japrael System C25"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            8.04884e-013
	Radius          1.31247
	InertiaMoment   0.397377

	Oblateness      0.0447334

	RotationPeriod  24.3704
	Obliquity       271.782
	EqAscendNode    253.609

	AbsMagn         12.1421
	SlopeParam      4.46919
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.644 0.640 0.639)

	Surface
	{
		SurfStyle       0.727517
		OceanStyle      0.240837
		Randomize      (-0.992, 0.147, 0.326)
		colorDistMagn   0.644913
		colorDistFreq   0.000833502
		detailScale     35.8391
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997191
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.39423
		terraceProb     0.168539
		erosion         0
		montesMagn      0.59292
		montesFreq      3.70153
		montesSpiky     0.992757
		montesFraction  0.908532
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00340506
		hillsFraction   0.695061
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211638
		craterFreq      0.25148
		craterDensity   0.902134
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.419182
		volcanoTemp     1556.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.251, 0.218, 0.179, 0.000)
		colorShelf     (0.258, 0.224, 0.204, 0.000)
		colorBeach     (0.303, 0.263, 0.243, 0.000)
		colorDesert    (0.328, 0.282, 0.236, 0.000)
		colorLowland   (0.361, 0.301, 0.268, 0.000)
		colorUpland    (0.399, 0.365, 0.326, 0.000)
		colorRock      (0.431, 0.397, 0.351, 0.000)
		colorSnow      (0.470, 0.423, 0.370, 1.000)
		BumpHeight      1.18122
		BumpOffset      0.236244
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

	CometTail
	{
		MaxLength   0.369584
		GasToDust   0.25
		Particles   1726
		GasBright   0.40663
		DustBright  0.589726
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   102.186
		Period          515.064
		Eccentricity    0.928424
		Inclination     -10.9014
		AscendingNode   -103.574
		ArgOfPericenter 39.9367
		MeanAnomaly     -137.213
	}
}

Comet	"Japrael System C26"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            6.2252e-009
	Radius          30.368
	InertiaMoment   0.399424

	Oblateness      0.0879734

	RotationPeriod  22.0776
	Obliquity       224.988
	EqAscendNode    238.186

	AbsMagn         8.12072
	SlopeParam      5.0766
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.763 0.761 0.759)

	Surface
	{
		SurfStyle       0.619109
		OceanStyle      0.570403
		Randomize      (0.159, 0.539, -0.723)
		colorDistMagn   0.0161411
		colorDistFreq   0.125255
		detailScale     829.25
		colorConversion true
		snowLevel       2
		tropicLatitude  0.978776
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.368098
		terraceProb     0.133495
		erosion         0
		montesMagn      0.564915
		montesFreq      3.97773
		montesSpiky     0.843812
		montesFraction  0.337729
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.96328
		hillsFraction   0.740251
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248979
		craterFreq      0.188412
		craterDensity   0.971954
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.552308
		volcanoTemp     1995.32
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.259, 0.213, 0.000)
		colorShelf     (0.305, 0.266, 0.243, 0.000)
		colorBeach     (0.359, 0.312, 0.288, 0.000)
		colorDesert    (0.389, 0.335, 0.281, 0.000)
		colorLowland   (0.427, 0.358, 0.319, 0.000)
		colorUpland    (0.473, 0.434, 0.387, 0.000)
		colorRock      (0.511, 0.472, 0.418, 0.000)
		colorSnow      (0.557, 0.502, 0.440, 1.000)
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

	CometTail
	{
		MaxLength   0.850776
		GasToDust   0.25
		Particles   2698
		GasBright   0.318064
		DustBright  0.362778
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   81.847
		Period          369.215
		Eccentricity    0.908268
		Inclination     58.5466
		AscendingNode   -17.8697
		ArgOfPericenter -169.191
		MeanAnomaly     -13.0739
	}
}

Comet	"Japrael System C27"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.91679e-016
	Radius          0.0812974
	InertiaMoment   0.398157

	Oblateness      0.0686984

	RotationPeriod  19.6744
	Obliquity       178.193
	EqAscendNode    222.764

	AbsMagn         4.25059
	SlopeParam      5.80717
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.411 0.405 0.401)

	Surface
	{
		SurfStyle       0.195374
		OceanStyle      0.442419
		Randomize      (-0.443, -0.698, 0.724)
		colorDistMagn   0.666711
		colorDistFreq   9.6029e-007
		detailScale     2.21996
		colorConversion true
		snowLevel       2
		tropicLatitude  0.28717
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.451843
		terraceProb     0.131024
		erosion         0
		montesMagn      0.689875
		montesFreq      1.17627
		montesSpiky     0.905859
		montesFraction  0.810069
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.20678e-005
		hillsFraction   0.443772
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248768
		craterFreq      0.181573
		craterDensity   0.987843
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.488183
		volcanoTemp     1423.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.164, 0.162, 0.160, 0.000)
		colorShelf     (0.175, 0.172, 0.170, 0.000)
		colorBeach     (0.185, 0.182, 0.180, 0.000)
		colorDesert    (0.195, 0.192, 0.190, 0.000)
		colorLowland   (0.205, 0.203, 0.200, 0.000)
		colorUpland    (0.216, 0.213, 0.210, 0.000)
		colorRock      (0.226, 0.223, 0.220, 0.000)
		colorSnow      (0.236, 0.233, 0.230, 1.000)
		BumpHeight      0.0731677
		BumpOffset      0.0146335
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.00957434
		DustBright  0.355754
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   115.779
		Period          621.181
		Eccentricity    0.887471
		Inclination     -165.115
		AscendingNode   -176.677
		ArgOfPericenter 101.995
		MeanAnomaly     -31.9748
	}
}

Comet	"Japrael System C28"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.48249e-012
	Radius          1.87217
	InertiaMoment   0.39985

	Oblateness      0.143874

	RotationPeriod  17.1379
	Obliquity       131.399
	EqAscendNode    207.341

	AbsMagn         11.8006
	SlopeParam      6.9363
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.431 0.428 0.423)

	Surface
	{
		SurfStyle       0.040264
		OceanStyle      0.634933
		Randomize      (-0.328, 0.905, 0.998)
		colorDistMagn   0.458464
		colorDistFreq   0.00238535
		detailScale     51.1227
		colorConversion true
		snowLevel       2
		tropicLatitude  0.481554
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.540382
		terraceProb     0.147797
		erosion         0
		montesMagn      0.597214
		montesFreq      2.55228
		montesSpiky     0.987711
		montesFraction  0.686351
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00708428
		hillsFraction   0.472376
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.275609
		craterFreq      0.193964
		craterDensity   0.848729
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483902
		volcanoTemp     1235.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.171, 0.169, 0.000)
		colorShelf     (0.183, 0.182, 0.180, 0.000)
		colorBeach     (0.194, 0.192, 0.191, 0.000)
		colorDesert    (0.205, 0.203, 0.201, 0.000)
		colorLowland   (0.215, 0.214, 0.212, 0.000)
		colorUpland    (0.226, 0.225, 0.222, 0.000)
		colorRock      (0.237, 0.235, 0.233, 0.000)
		colorSnow      (0.248, 0.246, 0.243, 1.000)
		BumpHeight      1.68495
		BumpOffset      0.336991
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

	CometTail
	{
		MaxLength   0.40241
		GasToDust   0.25
		Particles   1792
		GasBright   0.0724491
		DustBright  0.777366
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   80.3519
		Period          359.144
		Eccentricity    0.921621
		Inclination     -77.3435
		AscendingNode   178.17
		ArgOfPericenter 50.3971
		MeanAnomaly     38.1838
	}
}

Comet	"Japrael System C29"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.1466e-008
	Radius          31.7735
	InertiaMoment   0.398725

	Oblateness      0.127583

	RotationPeriod  14.4379
	Obliquity       84.6047
	EqAscendNode    191.918

	AbsMagn         7.91206
	SlopeParam      2.31462
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.591 0.512 0.442)

	Surface
	{
		SurfStyle       0.564421
		OceanStyle      0.526558
		Randomize      (-0.079, -0.144, -0.729)
		colorDistMagn   0.52226
		colorDistFreq   0.12301
		detailScale     867.629
		colorConversion true
		snowLevel       2
		tropicLatitude  0.989965
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.471195
		terraceProb     0.158686
		erosion         0
		montesMagn      0.433594
		montesFreq      2.8654
		montesSpiky     0.960757
		montesFraction  0.853641
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.42204
		hillsFraction   0.817197
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.269095
		craterFreq      0.265069
		craterDensity   0.977735
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524602
		volcanoTemp     1122.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.174, 0.124, 0.000)
		colorShelf     (0.236, 0.179, 0.142, 0.000)
		colorBeach     (0.278, 0.210, 0.168, 0.000)
		colorDesert    (0.302, 0.225, 0.164, 0.000)
		colorLowland   (0.331, 0.241, 0.186, 0.000)
		colorUpland    (0.367, 0.292, 0.226, 0.000)
		colorRock      (0.396, 0.317, 0.243, 0.000)
		colorSnow      (0.432, 0.338, 0.257, 1.000)
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

	CometTail
	{
		MaxLength   0.883602
		GasToDust   0.25
		Particles   2764
		GasBright   0.0770987
		DustBright  0.457203
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   87.7558
		Period          409.91
		Eccentricity    0.909582
		Inclination     -7.94152
		AscendingNode   69.4916
		ArgOfPericenter 58.6825
		MeanAnomaly     172.445
	}
}

Comet	"Japrael System C30"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            3.53047e-016
	Radius          0.11548
	InertiaMoment   0.396779

	Oblateness      0.249

	RotationPeriod  11.5346
	Obliquity       37.8104
	EqAscendNode    176.496

	AbsMagn         3.91352
	SlopeParam      3.01836
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.605 0.494 0.425)

	Surface
	{
		SurfStyle       0.748137
		OceanStyle      0.101976
		Randomize      (0.755, -0.267, -0.836)
		colorDistMagn   0.771109
		colorDistFreq   6.1225e-006
		detailScale     3.15337
		colorConversion true
		snowLevel       2
		tropicLatitude  0.558812
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.308122
		terraceProb     0.492033
		erosion         0
		montesMagn      0.266699
		montesFreq      3.02726
		montesSpiky     0.811445
		montesFraction  0.478569
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.47889e-005
		hillsFraction   0.602559
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226956
		craterFreq      0.195201
		craterDensity   0.857841
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523779
		volcanoTemp     1342.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.236, 0.168, 0.119, 0.000)
		colorShelf     (0.242, 0.173, 0.136, 0.000)
		colorBeach     (0.284, 0.203, 0.162, 0.000)
		colorDesert    (0.308, 0.217, 0.157, 0.000)
		colorLowland   (0.339, 0.232, 0.179, 0.000)
		colorUpland    (0.375, 0.282, 0.217, 0.000)
		colorRock      (0.405, 0.306, 0.234, 0.000)
		colorSnow      (0.441, 0.326, 0.247, 1.000)
		BumpHeight      0.103932
		BumpOffset      0.0207864
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0444891
		DustBright  0.174299
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   95.5509
		Period          465.722
		Eccentricity    0.882612
		Inclination     -3.84115
		AscendingNode   -2.63468
		ArgOfPericenter 112.83
		MeanAnomaly     -64.2901
	}
}

Comet	"Japrael System C31"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            2.73057e-012
	Radius          1.96813
	InertiaMoment   0.399204

	Oblateness      0.249

	RotationPeriod  8.37237
	Obliquity       351.016
	EqAscendNode    161.073

	AbsMagn         11.4847
	SlopeParam      3.61591
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.447 0.442 0.439)

	Surface
	{
		SurfStyle       0.241009
		OceanStyle      0.502657
		Randomize      (0.860, -0.956, -0.543)
		colorDistMagn   0.780494
		colorDistFreq   0.00334659
		detailScale     53.7431
		colorConversion true
		snowLevel       2
		tropicLatitude  0.918818
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.677441
		terraceProb     0.150749
		erosion         0
		montesMagn      0.552326
		montesFreq      2.40281
		montesSpiky     0.954504
		montesFraction  0.711133
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0102378
		hillsFraction   0.674398
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251903
		craterFreq      0.224973
		craterDensity   0.97368
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.394742
		volcanoTemp     1193.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.179, 0.177, 0.176, 0.000)
		colorShelf     (0.190, 0.188, 0.187, 0.000)
		colorBeach     (0.201, 0.199, 0.198, 0.000)
		colorDesert    (0.212, 0.210, 0.209, 0.000)
		colorLowland   (0.224, 0.221, 0.220, 0.000)
		colorUpland    (0.235, 0.232, 0.231, 0.000)
		colorRock      (0.246, 0.243, 0.241, 0.000)
		colorSnow      (0.257, 0.254, 0.252, 1.000)
		BumpHeight      1.77132
		BumpOffset      0.354264
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

	CometTail
	{
		MaxLength   0.435236
		GasToDust   0.25
		Particles   1859
		GasBright   0.184531
		DustBright  0.518744
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   102.634
		Period          518.455
		Eccentricity    0.884257
		Inclination     104.562
		AscendingNode   165.513
		ArgOfPericenter 178.938
		MeanAnomaly     -139.99
	}
}

Comet	"Japrael System C32"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            2.1119e-008
	Radius          44.963
	InertiaMoment   0.397814

	Oblateness      0.249

	RotationPeriod  4.87049
	Obliquity       304.222
	EqAscendNode    145.651

	AbsMagn         7.70316
	SlopeParam      4.18037
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.485 0.481 0.479)

	Surface
	{
		SurfStyle       0.344095
		OceanStyle      0.429293
		Randomize      (0.115, 0.245, -0.745)
		colorDistMagn   0.593481
		colorDistFreq   0.654009
		detailScale     1227.79
		colorConversion true
		snowLevel       2
		tropicLatitude  0.779126
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.528318
		terraceProb     0.36267
		erosion         0
		montesMagn      0.480869
		montesFreq      3.28106
		montesSpiky     0.796191
		montesFraction  0.60103
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.41184
		hillsFraction   0.715889
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227417
		craterFreq      0.220287
		craterDensity   0.863658
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509013
		volcanoTemp     1329.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.194, 0.193, 0.192, 0.000)
		colorShelf     (0.206, 0.205, 0.204, 0.000)
		colorBeach     (0.218, 0.217, 0.216, 0.000)
		colorDesert    (0.230, 0.229, 0.228, 0.000)
		colorLowland   (0.242, 0.241, 0.240, 0.000)
		colorUpland    (0.254, 0.253, 0.252, 0.000)
		colorRock      (0.267, 0.265, 0.264, 0.000)
		colorSnow      (0.279, 0.277, 0.276, 1.000)
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

	CometTail
	{
		MaxLength   0.916428
		GasToDust   0.25
		Particles   2831
		GasBright   0.12464
		DustBright  0.263122
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   93.4748
		Period          450.626
		Eccentricity    0.872956
		Inclination     -168.356
		AscendingNode   -62.8933
		ArgOfPericenter -177.578
		MeanAnomaly     -7.25283
	}
}

Comet	"Japrael System C33"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            6.5027e-016
	Radius          0.121911
	InertiaMoment   0.399642

	Oblateness      0.00143636

	RotationPeriod  136.033
	Obliquity       257.427
	EqAscendNode    130.228

	AbsMagn         3.5446
	SlopeParam      4.75989
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.781 0.687 0.629)

	Surface
	{
		SurfStyle       0.177019
		OceanStyle      0.21898
		Randomize      (0.363, -0.533, 0.178)
		colorDistMagn   0.838892
		colorDistFreq   1.08592e-005
		detailScale     3.32899
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99928
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.432942
		terraceProb     0.541798
		erosion         0
		montesMagn      0.628897
		montesFreq      2.50114
		montesSpiky     0.928659
		montesFraction  0.59302
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.61014e-005
		hillsFraction   0.47774
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.241299
		craterFreq      0.257856
		craterDensity   0.837986
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502182
		volcanoTemp     1466.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.312, 0.275, 0.252, 0.000)
		colorShelf     (0.332, 0.292, 0.267, 0.000)
		colorBeach     (0.351, 0.309, 0.283, 0.000)
		colorDesert    (0.371, 0.326, 0.299, 0.000)
		colorLowland   (0.390, 0.344, 0.315, 0.000)
		colorUpland    (0.410, 0.361, 0.330, 0.000)
		colorRock      (0.429, 0.378, 0.346, 0.000)
		colorSnow      (0.449, 0.395, 0.362, 1.000)
		BumpHeight      0.10972
		BumpOffset      0.021944
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.331872
		DustBright  0.540376
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   70.7222
		Period          296.557
		Eccentricity    0.92365
		Inclination     167.483
		AscendingNode   145.606
		ArgOfPericenter -157.293
		MeanAnomaly     -13.4569
	}
}

Comet	"Japrael System C34"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            5.02937e-012
	Radius          2.77562
	InertiaMoment   0.39846

	Oblateness      0.00293955

	RotationPeriod  117.203
	Obliquity       210.633
	EqAscendNode    114.805

	AbsMagn         11.1892
	SlopeParam      5.41315
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.632 0.593 0.524)

	Surface
	{
		SurfStyle       0.627439
		OceanStyle      0.401102
		Randomize      (0.494, -0.119, -0.088)
		colorDistMagn   0.807401
		colorDistFreq   0.0023621
		detailScale     75.793
		colorConversion true
		snowLevel       2
		tropicLatitude  0.495581
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.736231
		terraceProb     0.241137
		erosion         0
		montesMagn      0.427718
		montesFreq      2.66523
		montesSpiky     0.881762
		montesFraction  0.47701
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0265454
		hillsFraction   0.656502
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234588
		craterFreq      0.232521
		craterDensity   0.929608
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.416589
		volcanoTemp     1385.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.202, 0.147, 0.000)
		colorShelf     (0.253, 0.208, 0.168, 0.000)
		colorBeach     (0.297, 0.243, 0.199, 0.000)
		colorDesert    (0.322, 0.261, 0.194, 0.000)
		colorLowland   (0.354, 0.279, 0.220, 0.000)
		colorUpland    (0.392, 0.338, 0.267, 0.000)
		colorRock      (0.423, 0.368, 0.288, 0.000)
		colorSnow      (0.461, 0.391, 0.304, 1.000)
		BumpHeight      2.49806
		BumpOffset      0.499612
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

	CometTail
	{
		MaxLength   0.468062
		GasToDust   0.25
		Particles   1925
		GasBright   0.244698
		DustBright  0.312036
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   92.6649
		Period          444.782
		Eccentricity    0.942686
		Inclination     9.60674
		AscendingNode   -103.729
		ArgOfPericenter 146.567
		MeanAnomaly     151.311
	}
}

Comet	"Japrael System C35"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            3.88986e-008
	Radius          47.6467
	InertiaMoment   0.395512

	Oblateness      0.00223238

	RotationPeriod  108.166
	Obliquity       163.839
	EqAscendNode    99.3828

	AbsMagn         7.49345
	SlopeParam      6.27333
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.454 0.449 0.448)

	Surface
	{
		SurfStyle       0.300484
		OceanStyle      0.440202
		Randomize      (0.412, 0.204, -0.572)
		colorDistMagn   0.354503
		colorDistFreq   1.62685
		detailScale     1301.07
		colorConversion true
		snowLevel       2
		tropicLatitude  0.930808
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.68829
		terraceProb     0.308253
		erosion         0
		montesMagn      0.543571
		montesFreq      3.23972
		montesSpiky     0.970273
		montesFraction  0.730229
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.00512
		hillsFraction   0.664853
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.268082
		craterFreq      0.251846
		craterDensity   0.899969
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.528184
		volcanoTemp     1383.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.180, 0.179, 0.000)
		colorShelf     (0.193, 0.191, 0.190, 0.000)
		colorBeach     (0.204, 0.202, 0.201, 0.000)
		colorDesert    (0.215, 0.213, 0.213, 0.000)
		colorLowland   (0.227, 0.225, 0.224, 0.000)
		colorUpland    (0.238, 0.236, 0.235, 0.000)
		colorRock      (0.249, 0.247, 0.246, 0.000)
		colorSnow      (0.261, 0.258, 0.257, 1.000)
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

	CometTail
	{
		MaxLength   0.949254
		GasToDust   0.25
		Particles   2897
		GasBright   0.120266
		DustBright  0.120956
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   87.6554
		Period          409.207
		Eccentricity    0.901899
		Inclination     -116.307
		AscendingNode   103.951
		ArgOfPericenter 53.2102
		MeanAnomaly     99.1777
	}
}

Comet	"Japrael System C36"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.19772e-015
	Radius          0.171395
	InertiaMoment   0.398975

	Oblateness      0.00385674

	RotationPeriod  101.841
	Obliquity       117.045
	EqAscendNode    83.9602

	AbsMagn         3.13329
	SlopeParam      8.30075
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.650 0.557 0.418)

	Surface
	{
		SurfStyle       0.779711
		OceanStyle      0.726195
		Randomize      (-0.366, -0.753, -0.392)
		colorDistMagn   0.911455
		colorDistFreq   2.28098e-005
		detailScale     4.68022
		colorConversion true
		snowLevel       2
		tropicLatitude  0.108976
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.297814
		terraceProb     0.263967
		erosion         0
		montesMagn      0.559588
		montesFreq      3.3033
		montesSpiky     0.859544
		montesFraction  0.368487
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.10977e-005
		hillsFraction   0.760997
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247185
		craterFreq      0.259766
		craterDensity   1.0153
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.526109
		volcanoTemp     1425.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.189, 0.117, 0.000)
		colorShelf     (0.260, 0.195, 0.134, 0.000)
		colorBeach     (0.305, 0.228, 0.159, 0.000)
		colorDesert    (0.331, 0.245, 0.155, 0.000)
		colorLowland   (0.364, 0.262, 0.175, 0.000)
		colorUpland    (0.403, 0.318, 0.213, 0.000)
		colorRock      (0.435, 0.345, 0.230, 0.000)
		colorSnow      (0.474, 0.368, 0.242, 1.000)
		BumpHeight      0.154255
		BumpOffset      0.030851
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

	CometTail
	{
		MaxLength   0.0196963
		GasToDust   0.25
		Particles   1019
		GasBright   0.0418115
		DustBright  0.683896
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   78.7889
		Period          348.716
		Eccentricity    0.831041
		Inclination     111.333
		AscendingNode   -177.2
		ArgOfPericenter 114.254
		MeanAnomaly     -17.1102
	}
}

Comet	"Japrael System C37"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            9.26344e-012
	Radius          2.95136
	InertiaMoment   0.39739

	Oblateness      0.002799

	RotationPeriod  96.8431
	Obliquity       70.2503
	EqAscendNode    68.5376

	AbsMagn         10.9102
	SlopeParam      2.68213
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.430 0.425 0.421)

	Surface
	{
		SurfStyle       0.378415
		OceanStyle      0.285819
		Randomize      (-0.511, -0.790, -0.292)
		colorDistMagn   0.559691
		colorDistFreq   0.00231924
		detailScale     80.5918
		colorConversion true
		snowLevel       2
		tropicLatitude  0.684922
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.733935
		terraceProb     0.108334
		erosion         0
		montesMagn      0.429743
		montesFreq      2.75798
		montesSpiky     0.924283
		montesFraction  0.343191
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.026258
		hillsFraction   0.650644
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.238585
		craterFreq      0.210689
		craterDensity   0.852277
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506887
		volcanoTemp     1419.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.170, 0.169, 0.000)
		colorShelf     (0.183, 0.181, 0.179, 0.000)
		colorBeach     (0.193, 0.191, 0.190, 0.000)
		colorDesert    (0.204, 0.202, 0.200, 0.000)
		colorLowland   (0.215, 0.212, 0.211, 0.000)
		colorUpland    (0.226, 0.223, 0.221, 0.000)
		colorRock      (0.236, 0.234, 0.232, 0.000)
		colorSnow      (0.247, 0.244, 0.242, 1.000)
		BumpHeight      2.65622
		BumpOffset      0.531245
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

	CometTail
	{
		MaxLength   0.500888
		GasToDust   0.25
		Particles   1991
		GasBright   0.0478533
		DustBright  0.362341
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   104.723
		Period          534.364
		Eccentricity    0.887556
		Inclination     112.992
		AscendingNode   -46.4791
		ArgOfPericenter -58.2936
		MeanAnomaly     58.311
	}
}

Comet	"Japrael System C38"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            7.16463e-008
	Radius          66.7953
	InertiaMoment   0.399429

	Oblateness      0.00461952

	RotationPeriod  92.6418
	Obliquity       23.456
	EqAscendNode    53.115

	AbsMagn         7.28233
	SlopeParam      3.32062
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.567 0.468 0.377)

	Surface
	{
		SurfStyle       0.457218
		OceanStyle      0.841323
		Randomize      (-0.575, 0.031, -0.156)
		colorDistMagn   0.922094
		colorDistFreq   3.1459
		detailScale     1823.96
		colorConversion true
		snowLevel       2
		tropicLatitude  0.412421
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.66383
		terraceProb     0.229828
		erosion         0
		montesMagn      0.514811
		montesFreq      3.20913
		montesSpiky     0.974473
		montesFraction  0.613681
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.0871
		hillsFraction   0.620775
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254567
		craterFreq      0.210275
		craterDensity   0.805782
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49213
		volcanoTemp     1017.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.187, 0.151, 0.000)
		colorShelf     (0.241, 0.199, 0.160, 0.000)
		colorBeach     (0.255, 0.211, 0.170, 0.000)
		colorDesert    (0.269, 0.222, 0.179, 0.000)
		colorLowland   (0.283, 0.234, 0.188, 0.000)
		colorUpland    (0.297, 0.246, 0.198, 0.000)
		colorRock      (0.312, 0.257, 0.207, 0.000)
		colorSnow      (0.326, 0.269, 0.217, 1.000)
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

	CometTail
	{
		MaxLength   0.98208
		GasToDust   0.25
		Particles   2963
		GasBright   0.1572
		DustBright  0.737481
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   63.2969
		Period          251.101
		Eccentricity    0.940109
		Inclination     -135.706
		AscendingNode   -156.22
		ArgOfPericenter -52.9206
		MeanAnomaly     151.653
	}
}

Comet	"Japrael System C39"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            2.20604e-015
	Radius          0.182815
	InertiaMoment   0.398165

	Oblateness      0.003319

	RotationPeriod  88.9737
	Obliquity       336.662
	EqAscendNode    37.6924

	AbsMagn         2.66286
	SlopeParam      3.89529
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.801 0.768 0.753)

	Surface
	{
		SurfStyle       0.65375
		OceanStyle      0.661864
		Randomize      (-0.928, -0.961, -0.617)
		colorDistMagn   0.0282547
		colorDistFreq   1.18977e-005
		detailScale     4.99207
		colorConversion true
		snowLevel       2
		tropicLatitude  0.878247
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.399397
		terraceProb     0.313307
		erosion         0
		montesMagn      0.690024
		montesFreq      2.97717
		montesSpiky     0.980891
		montesFraction  0.658884
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.13722e-005
		hillsFraction   0.57394
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230786
		craterFreq      0.228863
		craterDensity   0.802622
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.522113
		volcanoTemp     1365.91
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.313, 0.261, 0.211, 0.000)
		colorShelf     (0.321, 0.269, 0.241, 0.000)
		colorBeach     (0.377, 0.315, 0.286, 0.000)
		colorDesert    (0.409, 0.338, 0.279, 0.000)
		colorLowland   (0.449, 0.361, 0.316, 0.000)
		colorUpland    (0.497, 0.438, 0.384, 0.000)
		colorRock      (0.537, 0.476, 0.414, 0.000)
		colorSnow      (0.585, 0.507, 0.437, 1.000)
		BumpHeight      0.164534
		BumpOffset      0.0329067
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

	CometTail
	{
		MaxLength   0.0525221
		GasToDust   0.25
		Particles   1085
		GasBright   0.13596
		DustBright  0.443208
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   101.28
		Period          508.227
		Eccentricity    0.900861
		Inclination     -66.2548
		AscendingNode   107.407
		ArgOfPericenter -135.24
		MeanAnomaly     -17.9423
	}
}

Comet	"Japrael System C40"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.70621e-011
	Radius          4.12659
	InertiaMoment   0.399855

	Oblateness      0.00535504

	RotationPeriod  85.688
	Obliquity       289.867
	EqAscendNode    22.2698

	AbsMagn         10.6447
	SlopeParam      4.46126
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.562 0.558 0.555)

	Surface
	{
		SurfStyle       0.662501
		OceanStyle      0.676831
		Randomize      (-0.635, -0.981, -0.561)
		colorDistMagn   0.756813
		colorDistFreq   0.00931348
		detailScale     112.683
		colorConversion true
		snowLevel       2
		tropicLatitude  0.998183
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.622135
		terraceProb     0.417705
		erosion         0
		montesMagn      0.646308
		montesFreq      2.58529
		montesSpiky     0.992225
		montesFraction  0.850267
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0372499
		hillsFraction   0.570544
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.190648
		craterFreq      0.216704
		craterDensity   0.915869
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.509596
		volcanoTemp     1348.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.190, 0.155, 0.000)
		colorShelf     (0.225, 0.195, 0.178, 0.000)
		colorBeach     (0.264, 0.229, 0.211, 0.000)
		colorDesert    (0.287, 0.246, 0.205, 0.000)
		colorLowland   (0.315, 0.262, 0.233, 0.000)
		colorUpland    (0.349, 0.318, 0.283, 0.000)
		colorRock      (0.377, 0.346, 0.305, 0.000)
		colorSnow      (0.411, 0.368, 0.322, 1.000)
		BumpHeight      3.71393
		BumpOffset      0.742787
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

	CometTail
	{
		MaxLength   0.533714
		GasToDust   0.25
		Particles   2058
		GasBright   0.0774605
		DustBright  0.186194
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   46.7373
		Period          159.32
		Eccentricity    0.861176
		Inclination     -139.965
		AscendingNode   -121.985
		ArgOfPericenter -17.2331
		MeanAnomaly     -59.8495
	}
}

Comet	"Japrael System C41"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.31963e-007
	Radius          71.45
	InertiaMoment   0.398731

	Oblateness      0.00384312

	RotationPeriod  82.6895
	Obliquity       243.073
	EqAscendNode    6.84724

	AbsMagn         7.06919
	SlopeParam      5.06769
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.742 0.741 0.739)

	Surface
	{
		SurfStyle       0.23604
		OceanStyle      0.108398
		Randomize      (-0.567, 0.630, -0.545)
		colorDistMagn   0.845931
		colorDistFreq   1.90209
		detailScale     1951.06
		colorConversion true
		snowLevel       2
		tropicLatitude  0.849747
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.470099
		terraceProb     0.297903
		erosion         0
		montesMagn      0.561579
		montesFreq      2.73495
		montesSpiky     0.87477
		montesFraction  0.571311
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.52332
		hillsFraction   0.459052
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.247704
		craterFreq      0.219257
		craterDensity   0.905605
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57098
		volcanoTemp     1431.92
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.296, 0.296, 0.000)
		colorShelf     (0.315, 0.315, 0.314, 0.000)
		colorBeach     (0.334, 0.333, 0.333, 0.000)
		colorDesert    (0.352, 0.352, 0.351, 0.000)
		colorLowland   (0.371, 0.370, 0.369, 0.000)
		colorUpland    (0.389, 0.389, 0.388, 0.000)
		colorRock      (0.408, 0.407, 0.406, 0.000)
		colorSnow      (0.427, 0.426, 0.425, 1.000)
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

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.263975
		DustBright  0.484166
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   103.819
		Period          527.459
		Eccentricity    0.935437
		Inclination     117.026
		AscendingNode   -157.35
		ArgOfPericenter -65.9919
		MeanAnomaly     -146.797
	}
}

Comet	"Japrael System C42"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            4.06325e-015
	Radius          0.254989
	InertiaMoment   0.396798

	Oblateness      0.00603013

	RotationPeriod  79.9142
	Obliquity       196.279
	EqAscendNode    351.425

	AbsMagn         2.10418
	SlopeParam      5.79559
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.507 0.438 0.302)

	Surface
	{
		SurfStyle       0.336764
		OceanStyle      0.56823
		Randomize      (-0.578, 0.659, 0.565)
		colorDistMagn   0.506296
		colorDistFreq   4.17562e-005
		detailScale     6.96291
		colorConversion true
		snowLevel       2
		tropicLatitude  0.478291
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.263297
		terraceProb     0.208584
		erosion         0
		montesMagn      0.328591
		montesFreq      3.06918
		montesSpiky     0.89816
		montesFraction  0.542277
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000144822
		hillsFraction   0.853496
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24998
		craterFreq      0.249173
		craterDensity   1.07718
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.571575
		volcanoTemp     1270
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.203, 0.175, 0.121, 0.000)
		colorShelf     (0.216, 0.186, 0.128, 0.000)
		colorBeach     (0.228, 0.197, 0.136, 0.000)
		colorDesert    (0.241, 0.208, 0.143, 0.000)
		colorLowland   (0.254, 0.219, 0.151, 0.000)
		colorUpland    (0.266, 0.230, 0.158, 0.000)
		colorRock      (0.279, 0.241, 0.166, 0.000)
		colorSnow      (0.292, 0.252, 0.173, 1.000)
		BumpHeight      0.22949
		BumpOffset      0.0458981
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

	CometTail
	{
		MaxLength   0.0853481
		GasToDust   0.25
		Particles   1152
		GasBright   0.178193
		DustBright  0.254434
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   68.6533
		Period          283.64
		Eccentricity    0.873421
		Inclination     44.5684
		AscendingNode   171.112
		ArgOfPericenter 71.1806
		MeanAnomaly     -162.485
	}
}

Comet	"Japrael System C43"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            3.14263e-011
	Radius          4.42581
	InertiaMoment   0.39921

	Oblateness      0.00439488

	RotationPeriod  77.3167
	Obliquity       149.485
	EqAscendNode    336.002

	AbsMagn         10.3903
	SlopeParam      6.91382
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.472 0.469 0.467)

	Surface
	{
		SurfStyle       0.308499
		OceanStyle      0.0643881
		Randomize      (-0.621, 0.719, -0.094)
		colorDistMagn   0.67669
		colorDistFreq   0.00710529
		detailScale     120.854
		colorConversion true
		snowLevel       2
		tropicLatitude  0.993804
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.585199
		terraceProb     0.203762
		erosion         0
		montesMagn      0.375823
		montesFreq      3.2538
		montesSpiky     0.925249
		montesFraction  0.775039
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0355085
		hillsFraction   0.675973
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.250316
		craterFreq      0.193982
		craterDensity   0.919481
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.506241
		volcanoTemp     1385.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.188, 0.187, 0.000)
		colorShelf     (0.201, 0.199, 0.198, 0.000)
		colorBeach     (0.212, 0.211, 0.210, 0.000)
		colorDesert    (0.224, 0.223, 0.222, 0.000)
		colorLowland   (0.236, 0.234, 0.233, 0.000)
		colorUpland    (0.248, 0.246, 0.245, 0.000)
		colorRock      (0.260, 0.258, 0.257, 0.000)
		colorSnow      (0.271, 0.270, 0.268, 1.000)
		BumpHeight      3.98323
		BumpOffset      0.796645
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

	CometTail
	{
		MaxLength   0.56654
		GasToDust   0.25
		Particles   2124
		GasBright   0.431898
		DustBright  0.485216
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   91.3544
		Period          435.381
		Eccentricity    0.853191
		Inclination     53.2568
		AscendingNode   -173.435
		ArgOfPericenter 98.421
		MeanAnomaly     -131.345
	}
}

Comet	"Japrael System C44"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            2.4306e-007
	Radius          99.4321
	InertiaMoment   0.397823

	Oblateness      0.00683718

	RotationPeriod  74.8636
	Obliquity       102.69
	EqAscendNode    320.579

	AbsMagn         6.85338
	SlopeParam      2.30359
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.768 0.732 0.683)

	Surface
	{
		SurfStyle       0.725642
		OceanStyle      0.432014
		Randomize      (-0.912, -0.127, 0.661)
		colorDistMagn   0.722079
		colorDistFreq   1.86894
		detailScale     2715.16
		colorConversion true
		snowLevel       2
		tropicLatitude  0.78834
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.370555
		terraceProb     0.141689
		erosion         0
		montesMagn      0.640501
		montesFreq      3.85781
		montesSpiky     0.947274
		montesFraction  0.641814
		dunesFraction   0
		hillsMagn       0
		hillsFreq       23.4031
		hillsFraction   0.837838
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21528
		craterFreq      0.307254
		craterDensity   0.88874
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.490977
		volcanoTemp     1161.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.300, 0.249, 0.191, 0.000)
		colorShelf     (0.307, 0.256, 0.219, 0.000)
		colorBeach     (0.361, 0.300, 0.260, 0.000)
		colorDesert    (0.392, 0.322, 0.253, 0.000)
		colorLowland   (0.430, 0.344, 0.287, 0.000)
		colorUpland    (0.476, 0.417, 0.348, 0.000)
		colorRock      (0.515, 0.454, 0.376, 0.000)
		colorSnow      (0.561, 0.483, 0.396, 1.000)
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

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.0180341
		DustBright  0.583566
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   98.1646
		Period          484.961
		Eccentricity    0.883649
		Inclination     -58.7395
		AscendingNode   -126.946
		ArgOfPericenter 162.842
		MeanAnomaly     -169.831
	}
}

Comet	"Japrael System C45"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            7.48401e-015
	Radius          0.274147
	InertiaMoment   0.399647

	Oblateness      0.00499238

	RotationPeriod  72.5293
	Obliquity       55.8959
	EqAscendNode    305.157

	AbsMagn         1.39871
	SlopeParam      3.00965
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.406 0.402 0.398)

	Surface
	{
		SurfStyle       0.0548563
		OceanStyle      0.982198
		Randomize      (0.464, -0.707, -0.908)
		colorDistMagn   0.729173
		colorDistFreq   4.99386e-005
		detailScale     7.48603
		colorConversion true
		snowLevel       2
		tropicLatitude  0.706701
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.545429
		terraceProb     0.235409
		erosion         0
		montesMagn      0.379169
		montesFreq      2.95151
		montesSpiky     0.897393
		montesFraction  0.135203
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000186183
		hillsFraction   0.470137
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.22213
		craterFreq      0.197247
		craterDensity   0.944806
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.551879
		volcanoTemp     1226.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.162, 0.161, 0.159, 0.000)
		colorShelf     (0.172, 0.171, 0.169, 0.000)
		colorBeach     (0.183, 0.181, 0.179, 0.000)
		colorDesert    (0.193, 0.191, 0.189, 0.000)
		colorLowland   (0.203, 0.201, 0.199, 0.000)
		colorUpland    (0.213, 0.211, 0.209, 0.000)
		colorRock      (0.223, 0.221, 0.219, 0.000)
		colorSnow      (0.233, 0.231, 0.229, 1.000)
		BumpHeight      0.246732
		BumpOffset      0.0493464
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

	CometTail
	{
		MaxLength   0.118174
		GasToDust   0.25
		Particles   1218
		GasBright   0.025468
		DustBright  0.260619
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   103.158
		Period          522.434
		Eccentricity    0.919185
		Inclination     11.3469
		AscendingNode   165.572
		ArgOfPericenter -20.9266
		MeanAnomaly     91.4
	}
}

Comet	"Japrael System C46"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            5.78832e-011
	Radius          6.14607
	InertiaMoment   0.398467

	Oblateness      0.0077091

	RotationPeriod  70.2939
	Obliquity       9.10164
	EqAscendNode    289.734

	AbsMagn         10.1453
	SlopeParam      3.60805
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.597 0.478 0.334)

	Surface
	{
		SurfStyle       0.782572
		OceanStyle      0.578876
		Randomize      (-0.470, -0.809, -0.141)
		colorDistMagn   0.588008
		colorDistFreq   0.0328463
		detailScale     167.829
		colorConversion true
		snowLevel       2
		tropicLatitude  0.862463
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.48058
		terraceProb     0.2292
		erosion         0
		montesMagn      0.527504
		montesFreq      3.11812
		montesSpiky     0.902609
		montesFraction  0.575516
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0664304
		hillsFraction   0.722108
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232695
		craterFreq      0.236081
		craterDensity   0.78721
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.531657
		volcanoTemp     997.183
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.163, 0.094, 0.000)
		colorShelf     (0.239, 0.167, 0.107, 0.000)
		colorBeach     (0.280, 0.196, 0.127, 0.000)
		colorDesert    (0.304, 0.210, 0.124, 0.000)
		colorLowland   (0.334, 0.225, 0.140, 0.000)
		colorUpland    (0.370, 0.273, 0.170, 0.000)
		colorRock      (0.400, 0.297, 0.184, 0.000)
		colorSnow      (0.436, 0.316, 0.194, 1.000)
		BumpHeight      5.53146
		BumpOffset      1.10629
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

	CometTail
	{
		MaxLength   0.599366
		GasToDust   0.25
		Particles   2190
		GasBright   0.114097
		DustBright  0.656477
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   88.3041
		Period          413.757
		Eccentricity    0.912091
		Inclination     -113.775
		AscendingNode   138.28
		ArgOfPericenter -70.0569
		MeanAnomaly     -124.975
	}
}

Comet	"Japrael System C47"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            4.47685e-007
	Radius          107.145
	InertiaMoment   0.395574

	Oblateness      0.00555919

	RotationPeriod  68.1414
	Obliquity       322.307
	EqAscendNode    274.312

	AbsMagn         6.63417
	SlopeParam      4.17263
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.630 0.520 0.397)

	Surface
	{
		SurfStyle       0.620585
		OceanStyle      0.568692
		Randomize      (-0.430, 0.771, -0.383)
		colorDistMagn   0.418157
		colorDistFreq   8.79778
		detailScale     2925.78
		colorConversion true
		snowLevel       2
		tropicLatitude  0.99725
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.548127
		terraceProb     0.360274
		erosion         0
		montesMagn      0.431273
		montesFreq      3.10482
		montesSpiky     0.858327
		montesFraction  0.251065
		dunesFraction   0
		hillsMagn       0
		hillsFreq       33.0828
		hillsFraction   0.900701
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.244882
		craterFreq      0.341643
		craterDensity   0.824433
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.480882
		volcanoTemp     1562.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.177, 0.111, 0.000)
		colorShelf     (0.252, 0.182, 0.127, 0.000)
		colorBeach     (0.296, 0.213, 0.151, 0.000)
		colorDesert    (0.322, 0.229, 0.147, 0.000)
		colorLowland   (0.353, 0.244, 0.167, 0.000)
		colorUpland    (0.391, 0.296, 0.202, 0.000)
		colorRock      (0.422, 0.322, 0.218, 0.000)
		colorSnow      (0.460, 0.343, 0.230, 1.000)
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

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.0942487
		DustBright  0.360811
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   90.4392
		Period          428.854
		Eccentricity    0.926098
		Inclination     90.3363
		AscendingNode   96.5232
		ArgOfPericenter -103.593
		MeanAnomaly     124.952
	}
}

Comet	"Japrael System C48"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.37846e-014
	Radius          0.379951
	InertiaMoment   0.398981

	Oblateness      0.00867693

	RotationPeriod  66.0586
	Obliquity       275.513
	EqAscendNode    258.889

	AbsMagn         0.394733
	SlopeParam      4.7516
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.763 0.700 0.630)

	Surface
	{
		SurfStyle       0.750045
		OceanStyle      0.4252
		Randomize      (0.845, -0.199, 0.669)
		colorDistMagn   0.481957
		colorDistFreq   6.86534e-005
		detailScale     10.3752
		colorConversion true
		snowLevel       2
		tropicLatitude  0.94943
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.627928
		terraceProb     0.363299
		erosion         0
		montesMagn      0.414505
		montesFreq      2.92551
		montesSpiky     0.906226
		montesFraction  0.665987
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000192513
		hillsFraction   0.704436
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.236717
		craterFreq      0.175946
		craterDensity   0.890258
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.444938
		volcanoTemp     1618.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.238, 0.176, 0.000)
		colorShelf     (0.305, 0.245, 0.202, 0.000)
		colorBeach     (0.359, 0.287, 0.239, 0.000)
		colorDesert    (0.389, 0.308, 0.233, 0.000)
		colorLowland   (0.428, 0.329, 0.264, 0.000)
		colorUpland    (0.473, 0.399, 0.321, 0.000)
		colorRock      (0.512, 0.434, 0.346, 0.000)
		colorSnow      (0.557, 0.462, 0.365, 1.000)
		BumpHeight      0.341956
		BumpOffset      0.0683911
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

	CometTail
	{
		MaxLength   0.151
		GasToDust   0.25
		Particles   1284
		GasBright   0.250068
		DustBright  0.689479
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   59.3679
		Period          228.088
		Eccentricity    0.810892
		Inclination     36.213
		AscendingNode   -131.739
		ArgOfPericenter -60.1333
		MeanAnomaly     35.1885
	}
}

Comet	"Japrael System C49"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.06614e-010
	Radius          6.63686
	InertiaMoment   0.397402

	Oblateness      0.00632573

	RotationPeriod  64.0346
	Obliquity       228.719
	EqAscendNode    243.467

	AbsMagn         9.90802
	SlopeParam      5.40326
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.541 0.536 0.528)

	Surface
	{
		SurfStyle       0.717029
		OceanStyle      0.751196
		Randomize      (0.873, 0.063, -0.060)
		colorDistMagn   0.48961
		colorDistFreq   0.00782569
		detailScale     181.231
		colorConversion true
		snowLevel       2
		tropicLatitude  0.781994
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.515552
		terraceProb     0.110289
		erosion         0
		montesMagn      0.546389
		montesFreq      3.315
		montesSpiky     0.918027
		montesFraction  0.478418
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.131934
		hillsFraction   0.654679
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.243394
		craterFreq      0.241485
		craterDensity   0.909972
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.499551
		volcanoTemp     1209.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.211, 0.182, 0.148, 0.000)
		colorShelf     (0.216, 0.188, 0.169, 0.000)
		colorBeach     (0.254, 0.220, 0.201, 0.000)
		colorDesert    (0.276, 0.236, 0.195, 0.000)
		colorLowland   (0.303, 0.252, 0.222, 0.000)
		colorUpland    (0.335, 0.306, 0.269, 0.000)
		colorRock      (0.363, 0.333, 0.290, 0.000)
		colorSnow      (0.395, 0.354, 0.306, 1.000)
		BumpHeight      5.97317
		BumpOffset      1.19463
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

	CometTail
	{
		MaxLength   0.632192
		GasToDust   0.25
		Particles   2256
		GasBright   0.202938
		DustBright  0.421096
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   73.4249
		Period          313.718
		Eccentricity    0.87074
		Inclination     -176.465
		AscendingNode   40.5303
		ArgOfPericenter -150.004
		MeanAnomaly     -109.69
	}
}

Comet	"Japrael System C50"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            3.28272e-018
	Radius          0.0234915
	InertiaMoment   0.399435

	Oblateness      0.00977343

	RotationPeriod  62.0601
	Obliquity       181.924
	EqAscendNode    228.044

	AbsMagn         6.41078
	SlopeParam      6.25867
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.847 0.808 0.742)

	Surface
	{
		SurfStyle       0.661516
		OceanStyle      0.696689
		Randomize      (0.207, 0.010, 0.106)
		colorDistMagn   0.672891
		colorDistFreq   3.46926e-007
		detailScale     0.641474
		colorConversion true
		snowLevel       2
		tropicLatitude  0.498629
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.633207
		terraceProb     0.149778
		erosion         0
		montesMagn      0.373961
		montesFreq      3.63984
		montesSpiky     0.971052
		montesFraction  0.474856
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.21265e-006
		hillsFraction   0.694164
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257456
		craterFreq      0.246159
		craterDensity   0.772904
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.502308
		volcanoTemp     1706.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.330, 0.275, 0.208, 0.000)
		colorShelf     (0.339, 0.283, 0.237, 0.000)
		colorBeach     (0.398, 0.331, 0.282, 0.000)
		colorDesert    (0.432, 0.355, 0.274, 0.000)
		colorLowland   (0.474, 0.380, 0.311, 0.000)
		colorUpland    (0.525, 0.460, 0.378, 0.000)
		colorRock      (0.568, 0.501, 0.408, 0.000)
		colorSnow      (0.619, 0.533, 0.430, 1.000)
		BumpHeight      0.0211423
		BumpOffset      0.00422846
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.118548
		DustBright  0.189972
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   66.9389
		Period          273.081
		Eccentricity    0.841628
		Inclination     29.003
		AscendingNode   -63.4188
		ArgOfPericenter 61.1973
		MeanAnomaly     -81.8373
	}
}

Comet	"Japrael System C51"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            2.53895e-014
	Radius          0.411105
	InertiaMoment   0.398173

	Oblateness      0.00718102

	RotationPeriod  60.1271
	Obliquity       135.13
	EqAscendNode    212.621

	AbsMagn         -1.66848
	SlopeParam      8.22593
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.746 0.671 0.566)

	Surface
	{
		SurfStyle       0.466208
		OceanStyle      0.326958
		Randomize      (0.167, 0.859, 0.760)
		colorDistMagn   0.089302
		colorDistFreq   0.000115439
		detailScale     11.2259
		colorConversion true
		snowLevel       2
		tropicLatitude  0.95479
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.355908
		terraceProb     0.361612
		erosion         0
		montesMagn      0.399943
		montesFreq      2.79409
		montesSpiky     0.903388
		montesFraction  0.691047
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000414616
		hillsFraction   0.519268
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245135
		craterFreq      0.141479
		craterDensity   0.824278
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.585065
		volcanoTemp     1395.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.269, 0.227, 0.000)
		colorShelf     (0.317, 0.285, 0.241, 0.000)
		colorBeach     (0.336, 0.302, 0.255, 0.000)
		colorDesert    (0.354, 0.319, 0.269, 0.000)
		colorLowland   (0.373, 0.336, 0.283, 0.000)
		colorUpland    (0.392, 0.353, 0.297, 0.000)
		colorRock      (0.410, 0.369, 0.311, 0.000)
		colorSnow      (0.429, 0.386, 0.326, 1.000)
		BumpHeight      0.369995
		BumpOffset      0.0739989
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

	CometTail
	{
		MaxLength   0.183826
		GasToDust   0.25
		Particles   1351
		GasBright   0.351535
		DustBright  0.441472
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   86.6425
		Period          402.134
		Eccentricity    0.872705
		Inclination     -124.837
		AscendingNode   -100.706
		ArgOfPericenter 50.8156
		MeanAnomaly     65.4078
	}
}

Comet	"Japrael System C52"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.96369e-010
	Radius          9.16517
	InertiaMoment   0.399861

	Oblateness      0.0110395

	RotationPeriod  58.2284
	Obliquity       88.3359
	EqAscendNode    197.199

	AbsMagn         9.67732
	SlopeParam      2.67253
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.437 0.435 0.432)

	Surface
	{
		SurfStyle       0.398399
		OceanStyle      0.808828
		Randomize      (-0.292, 0.914, -0.303)
		colorDistMagn   0.758097
		colorDistFreq   0.0187478
		detailScale     250.27
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991924
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.568092
		terraceProb     0.627753
		erosion         0
		montesMagn      0.464443
		montesFreq      3.16307
		montesSpiky     0.979063
		montesFraction  0.246523
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.223515
		hillsFraction   0.479908
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.271061
		craterFreq      0.190852
		craterDensity   1.0986
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.514375
		volcanoTemp     1705.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.175, 0.174, 0.173, 0.000)
		colorShelf     (0.186, 0.185, 0.183, 0.000)
		colorBeach     (0.197, 0.196, 0.194, 0.000)
		colorDesert    (0.208, 0.206, 0.205, 0.000)
		colorLowland   (0.219, 0.217, 0.216, 0.000)
		colorUpland    (0.229, 0.228, 0.227, 0.000)
		colorRock      (0.240, 0.239, 0.237, 0.000)
		colorSnow      (0.251, 0.250, 0.248, 1.000)
		BumpHeight      8.24865
		BumpOffset      1.64973
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

	CometTail
	{
		MaxLength   0.665018
		GasToDust   0.25
		Particles   2323
		GasBright   0.00111678
		DustBright  0.476376
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   83.7146
		Period          381.923
		Eccentricity    0.953041
		Inclination     16.2922
		AscendingNode   56.5154
		ArgOfPericenter 142.239
		MeanAnomaly     -63.449
	}
}

Comet	"Japrael System C53"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            6.04637e-018
	Radius          0.025465
	InertiaMoment   0.398738

	Oblateness      0.00817465

	RotationPeriod  56.3577
	Obliquity       41.5416
	EqAscendNode    181.776

	AbsMagn         6.18232
	SlopeParam      3.31244
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.748 0.671 0.554)

	Surface
	{
		SurfStyle       0.0811496
		OceanStyle      0.716618
		Randomize      (-0.615, 0.115, 0.018)
		colorDistMagn   0.149681
		colorDistFreq   3.69871e-007
		detailScale     0.695363
		colorConversion true
		snowLevel       2
		tropicLatitude  0.995914
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.550615
		terraceProb     0.295161
		erosion         0
		montesMagn      0.590166
		montesFreq      3.60145
		montesSpiky     0.814455
		montesFraction  0.547253
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.05965e-007
		hillsFraction   0.602978
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.298023
		craterFreq      0.238438
		craterDensity   0.903168
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.483638
		volcanoTemp     1395.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.268, 0.222, 0.000)
		colorShelf     (0.318, 0.285, 0.235, 0.000)
		colorBeach     (0.337, 0.302, 0.249, 0.000)
		colorDesert    (0.356, 0.319, 0.263, 0.000)
		colorLowland   (0.374, 0.335, 0.277, 0.000)
		colorUpland    (0.393, 0.352, 0.291, 0.000)
		colorRock      (0.412, 0.369, 0.305, 0.000)
		colorSnow      (0.430, 0.386, 0.319, 1.000)
		BumpHeight      0.0229185
		BumpOffset      0.00458369
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0590502
		DustBright  0.902929
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   42.864
		Period          139.931
		Eccentricity    0.898076
		Inclination     69.4914
		AscendingNode   73.9314
		ArgOfPericenter 126.003
		MeanAnomaly     27.0681
	}
}

Comet	"Japrael System C54"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            4.67641e-014
	Radius          0.56678
	InertiaMoment   0.396817

	Oblateness      0.012368

	RotationPeriod  54.5094
	Obliquity       354.747
	EqAscendNode    166.354

	AbsMagn         16.1704
	SlopeParam      3.88756
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.710 0.706 0.703)

	Surface
	{
		SurfStyle       0.179676
		OceanStyle      0.770014
		Randomize      (0.600, -0.982, 0.629)
		colorDistMagn   0.344607
		colorDistFreq   0.000177555
		detailScale     15.4769
		colorConversion true
		snowLevel       2
		tropicLatitude  0.246987
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.596044
		terraceProb     0.147707
		erosion         0
		montesMagn      0.435184
		montesFreq      2.82812
		montesSpiky     0.940265
		montesFraction  0.590593
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00088987
		hillsFraction   0.585342
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.21711
		craterFreq      0.19816
		craterDensity   1.0461
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498701
		volcanoTemp     1671.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.284, 0.283, 0.281, 0.000)
		colorShelf     (0.302, 0.300, 0.299, 0.000)
		colorBeach     (0.319, 0.318, 0.316, 0.000)
		colorDesert    (0.337, 0.335, 0.334, 0.000)
		colorLowland   (0.355, 0.353, 0.351, 0.000)
		colorUpland    (0.373, 0.371, 0.369, 0.000)
		colorRock      (0.390, 0.388, 0.387, 0.000)
		colorSnow      (0.408, 0.406, 0.404, 1.000)
		BumpHeight      0.510102
		BumpOffset      0.10202
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

	CometTail
	{
		MaxLength   0.216652
		GasToDust   0.25
		Particles   1417
		GasBright   0.0778535
		DustBright  0.568613
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   85.362
		Period          393.252
		Eccentricity    0.857582
		Inclination     -170.913
		AscendingNode   171.105
		ArgOfPericenter 82.031
		MeanAnomaly     71.2598
	}
}

Comet	"Japrael System C55"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            3.61687e-010
	Radius          9.95251
	InertiaMoment   0.399216

	Oblateness      0.0093546

	RotationPeriod  52.678
	Obliquity       307.953
	EqAscendNode    150.931

	AbsMagn         9.45207
	SlopeParam      4.45334
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.632 0.516 0.465)

	Surface
	{
		SurfStyle       0.793974
		OceanStyle      0.368207
		Randomize      (0.154, 0.310, 0.468)
		colorDistMagn   0.542193
		colorDistFreq   0.0622516
		detailScale     271.77
		colorConversion true
		snowLevel       2
		tropicLatitude  0.972445
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.32654
		terraceProb     0.191473
		erosion         0
		montesMagn      0.43411
		montesFreq      3.31389
		montesSpiky     0.855667
		montesFraction  0.641412
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.264595
		hillsFraction   0.706741
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23528
		craterFreq      0.222322
		craterDensity   0.73316
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.535912
		volcanoTemp     1065.39
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.246, 0.176, 0.130, 0.000)
		colorShelf     (0.253, 0.181, 0.149, 0.000)
		colorBeach     (0.297, 0.212, 0.177, 0.000)
		colorDesert    (0.322, 0.227, 0.172, 0.000)
		colorLowland   (0.354, 0.243, 0.195, 0.000)
		colorUpland    (0.392, 0.294, 0.237, 0.000)
		colorRock      (0.423, 0.320, 0.256, 0.000)
		colorSnow      (0.461, 0.341, 0.270, 1.000)
		BumpHeight      8.95726
		BumpOffset      1.79145
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

	CometTail
	{
		MaxLength   0.697844
		GasToDust   0.25
		Particles   2389
		GasBright   0.0593976
		DustBright  0.271555
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   133.551
		Period          769.565
		Eccentricity    0.940356
		Inclination     -127.515
		AscendingNode   166.304
		ArgOfPericenter -123.872
		MeanAnomaly     135.457
	}
}

Comet	"Japrael System C56"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.11366e-017
	Radius          0.0350532
	InertiaMoment   0.397833

	Oblateness      0.0141666

	RotationPeriod  50.8588
	Obliquity       261.159
	EqAscendNode    135.508

	AbsMagn         5.94776
	SlopeParam      5.0588
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.543 0.539 0.537)

	Surface
	{
		SurfStyle       0.518944
		OceanStyle      0.497104
		Randomize      (0.107, -0.882, -0.742)
		colorDistMagn   0.70108
		colorDistFreq   8.71468e-007
		detailScale     0.957187
		colorConversion true
		snowLevel       2
		tropicLatitude  0.906676
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.39467
		terraceProb     0.203
		erosion         0
		montesMagn      0.648022
		montesFreq      2.72075
		montesSpiky     0.970655
		montesFraction  0.791779
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.8115e-006
		hillsFraction   0.638806
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221821
		craterFreq      0.163967
		craterDensity   0.976812
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52554
		volcanoTemp     1512.28
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.212, 0.183, 0.150, 0.000)
		colorShelf     (0.217, 0.189, 0.172, 0.000)
		colorBeach     (0.255, 0.221, 0.204, 0.000)
		colorDesert    (0.277, 0.237, 0.199, 0.000)
		colorLowland   (0.304, 0.253, 0.226, 0.000)
		colorUpland    (0.336, 0.307, 0.274, 0.000)
		colorRock      (0.363, 0.334, 0.296, 0.000)
		colorSnow      (0.396, 0.356, 0.312, 1.000)
		BumpHeight      0.0315479
		BumpOffset      0.00630958
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.194498
		DustBright  0.620941
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   93.8294
		Period          453.193
		Eccentricity    0.88448
		Inclination     -124.407
		AscendingNode   -114.261
		ArgOfPericenter 13.8628
		MeanAnomaly     97.2019
	}
}

Comet	"Japrael System C57"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            8.61338e-014
	Radius          0.616485
	InertiaMoment   0.399652

	Oblateness      0.0107871

	RotationPeriod  49.0468
	Obliquity       214.364
	EqAscendNode    120.086

	AbsMagn         14.9407
	SlopeParam      5.78407
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.622 0.616 0.613)

	Surface
	{
		SurfStyle       0.394166
		OceanStyle      0.21073
		Randomize      (0.368, -0.676, 0.090)
		colorDistMagn   0.0395895
		colorDistFreq   0.00019764
		detailScale     16.8342
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999145
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.65419
		terraceProb     0.360965
		erosion         0
		montesMagn      0.565376
		montesFreq      2.2923
		montesSpiky     0.998954
		montesFraction  0.522276
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000977402
		hillsFraction   0.682077
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226967
		craterFreq      0.182067
		craterDensity   1.07481
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49067
		volcanoTemp     1665.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.249, 0.246, 0.245, 0.000)
		colorShelf     (0.264, 0.262, 0.261, 0.000)
		colorBeach     (0.280, 0.277, 0.276, 0.000)
		colorDesert    (0.296, 0.293, 0.291, 0.000)
		colorLowland   (0.311, 0.308, 0.307, 0.000)
		colorUpland    (0.327, 0.323, 0.322, 0.000)
		colorRock      (0.342, 0.339, 0.337, 0.000)
		colorSnow      (0.358, 0.354, 0.353, 1.000)
		BumpHeight      0.554837
		BumpOffset      0.110967
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

	CometTail
	{
		MaxLength   0.249478
		GasToDust   0.25
		Particles   1483
		GasBright   0.14876
		DustBright  0.351165
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   97.5379
		Period          480.324
		Eccentricity    0.902038
		Inclination     -114.061
		AscendingNode   42.8462
		ArgOfPericenter 144.954
		MeanAnomaly     81.0344
	}
}

Comet	"Japrael System C58"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            6.66183e-010
	Radius          13.6798
	InertiaMoment   0.398474

	Oblateness      0.0163561

	RotationPeriod  47.2374
	Obliquity       167.57
	EqAscendNode    104.663

	AbsMagn         9.23134
	SlopeParam      6.8917
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.501 0.467 0.400)

	Surface
	{
		SurfStyle       0.817456
		OceanStyle      0.672428
		Randomize      (-0.483, -0.757, 0.882)
		colorDistMagn   0.832405
		colorDistFreq   0.113726
		detailScale     373.548
		colorConversion true
		snowLevel       2
		tropicLatitude  0.243884
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.629756
		terraceProb     0.575596
		erosion         0
		montesMagn      0.594679
		montesFreq      3.12033
		montesSpiky     0.907976
		montesFraction  0.387887
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.529953
		hillsFraction   0.542046
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242289
		craterFreq      0.17292
		craterDensity   0.812093
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.38382
		volcanoTemp     1464.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.196, 0.159, 0.112, 0.000)
		colorShelf     (0.201, 0.163, 0.128, 0.000)
		colorBeach     (0.236, 0.191, 0.152, 0.000)
		colorDesert    (0.256, 0.205, 0.148, 0.000)
		colorLowland   (0.281, 0.219, 0.168, 0.000)
		colorUpland    (0.311, 0.266, 0.204, 0.000)
		colorRock      (0.336, 0.289, 0.220, 0.000)
		colorSnow      (0.366, 0.308, 0.232, 1.000)
		BumpHeight      12.3118
		BumpOffset      2.46236
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

	CometTail
	{
		MaxLength   0.73067
		GasToDust   0.25
		Particles   2455
		GasBright   0.351052
		DustBright  0.633361
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   126.196
		Period          706.871
		Eccentricity    0.912577
		Inclination     171.607
		AscendingNode   -96.7706
		ArgOfPericenter -118.71
		MeanAnomaly     -168.5
	}
}

Comet	"Japrael System C59"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            2.05123e-017
	Radius          0.0381867
	InertiaMoment   0.395633

	Oblateness      0.0123623

	RotationPeriod  45.4261
	Obliquity       120.776
	EqAscendNode    89.2406

	AbsMagn         5.70592
	SlopeParam      2.2925
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.619 0.436 0.335)

	Surface
	{
		SurfStyle       0.634965
		OceanStyle      0.697962
		Randomize      (0.288, -0.713, 0.480)
		colorDistMagn   0.0201858
		colorDistFreq   9.0549e-007
		detailScale     1.04275
		colorConversion true
		snowLevel       2
		tropicLatitude  0.486171
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.436972
		terraceProb     0.202044
		erosion         0
		montesMagn      0.500768
		montesFreq      2.89198
		montesSpiky     0.991126
		montesFraction  0.797698
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.6143e-006
		hillsFraction   0.805987
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248346
		craterFreq      0.252999
		craterDensity   0.998336
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.439063
		volcanoTemp     2030.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.241, 0.148, 0.094, 0.000)
		colorShelf     (0.247, 0.153, 0.107, 0.000)
		colorBeach     (0.291, 0.179, 0.127, 0.000)
		colorDesert    (0.316, 0.192, 0.124, 0.000)
		colorLowland   (0.346, 0.205, 0.141, 0.000)
		colorUpland    (0.384, 0.248, 0.171, 0.000)
		colorRock      (0.415, 0.270, 0.184, 0.000)
		colorSnow      (0.452, 0.288, 0.194, 1.000)
		BumpHeight      0.0343681
		BumpOffset      0.00687361
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.278032
		DustBright  0.390867
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   87.9172
		Period          411.041
		Eccentricity    0.890309
		Inclination     34.1223
		AscendingNode   20.8934
		ArgOfPericenter -158.293
		MeanAnomaly     134.011
	}
}

Comet	"Japrael System C60"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.58648e-013
	Radius          0.846178
	InertiaMoment   0.398987

	Oblateness      0.01911

	RotationPeriod  43.6083
	Obliquity       73.9815
	EqAscendNode    73.818

	AbsMagn         14.1475
	SlopeParam      3.00092
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.712 0.666 0.598)

	Surface
	{
		SurfStyle       0.434595
		OceanStyle      0.518359
		Randomize      (0.617, 0.798, 0.812)
		colorDistMagn   0.500067
		colorDistFreq   0.000352786
		detailScale     23.1063
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997517
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.337848
		terraceProb     0.133701
		erosion         0
		montesMagn      0.615888
		montesFreq      2.58819
		montesSpiky     0.86298
		montesFraction  0.305088
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00157764
		hillsFraction   0.841942
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.252543
		craterFreq      0.18566
		craterDensity   0.968252
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.441298
		volcanoTemp     1457.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.285, 0.266, 0.239, 0.000)
		colorShelf     (0.303, 0.283, 0.254, 0.000)
		colorBeach     (0.321, 0.300, 0.269, 0.000)
		colorDesert    (0.338, 0.316, 0.284, 0.000)
		colorLowland   (0.356, 0.333, 0.299, 0.000)
		colorUpland    (0.374, 0.349, 0.314, 0.000)
		colorRock      (0.392, 0.366, 0.329, 0.000)
		colorSnow      (0.410, 0.383, 0.344, 1.000)
		BumpHeight      0.76156
		BumpOffset      0.152312
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

	CometTail
	{
		MaxLength   0.282304
		GasToDust   0.25
		Particles   1550
		GasBright   0.167752
		DustBright  0.185633
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   81.1057
		Period          364.209
		Eccentricity    0.846019
		Inclination     23.4054
		AscendingNode   61.3912
		ArgOfPericenter -153.35
		MeanAnomaly     124.188
	}
}

Comet	"Japrael System C61"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.22702e-009
	Radius          14.9246
	InertiaMoment   0.397414

	Oblateness      0.0146831

	RotationPeriod  41.7792
	Obliquity       27.1872
	EqAscendNode    58.3954

	AbsMagn         9.0143
	SlopeParam      3.60018
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.566 0.462 0.364)

	Surface
	{
		SurfStyle       0.919127
		OceanStyle      0.476293
		Randomize      (0.620, 0.201, 0.751)
		colorDistMagn   0.432291
		colorDistFreq   0.15401
		detailScale     407.54
		colorConversion true
		snowLevel       2
		tropicLatitude  0.076648
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.495188
		terraceProb     0.135311
		erosion         0
		montesMagn      0.607266
		montesFreq      3.34761
		montesSpiky     0.929752
		montesFraction  0.740326
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.511883
		hillsFraction   0.424961
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.246167
		craterFreq      0.248323
		craterDensity   1.01544
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.431785
		volcanoTemp     1710.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.162, 0.146, 0.050)
		colorShelf     (0.226, 0.189, 0.168, 0.040)
		colorBeach     (0.260, 0.217, 0.189, 0.030)
		colorDesert    (0.294, 0.245, 0.215, 0.020)
		colorLowland   (0.328, 0.273, 0.237, 0.030)
		colorUpland    (0.362, 0.300, 0.259, 0.050)
		colorRock      (0.396, 0.328, 0.288, 0.020)
		colorSnow      (0.396, 0.328, 0.288, 1.000)
		BumpHeight      13.4321
		BumpOffset      2.68642
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

	CometTail
	{
		MaxLength   0.763496
		GasToDust   0.25
		Particles   2522
		GasBright   0.0282749
		DustBright  0.809597
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   121.697
		Period          669.409
		Eccentricity    0.899479
		Inclination     -157.081
		AscendingNode   177.51
		ArgOfPericenter -84.1593
		MeanAnomaly     -103.703
	}
}

Comet	"Japrael System C62"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            3.77809e-017
	Radius          0.052345
	InertiaMoment   0.39944

	Oblateness      0.0226911

	RotationPeriod  39.9338
	Obliquity       340.393
	EqAscendNode    42.9728

	AbsMagn         5.45539
	SlopeParam      4.16488
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.595 0.590 0.587)

	Surface
	{
		SurfStyle       0.351624
		OceanStyle      0.932919
		Randomize      (-0.737, 0.557, -0.116)
		colorDistMagn   0.750493
		colorDistFreq   8.58988e-007
		detailScale     1.42937
		colorConversion true
		snowLevel       2
		tropicLatitude  0.421535
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.266768
		terraceProb     0.296106
		erosion         0
		montesMagn      0.44661
		montesFreq      3.19879
		montesSpiky     0.946559
		montesFraction  0.504876
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.80943e-006
		hillsFraction   0.603237
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.240882
		craterFreq      0.235592
		craterDensity   0.781458
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469256
		volcanoTemp     1643.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.238, 0.236, 0.235, 0.000)
		colorShelf     (0.253, 0.251, 0.250, 0.000)
		colorBeach     (0.268, 0.265, 0.264, 0.000)
		colorDesert    (0.283, 0.280, 0.279, 0.000)
		colorLowland   (0.297, 0.295, 0.294, 0.000)
		colorUpland    (0.312, 0.310, 0.308, 0.000)
		colorRock      (0.327, 0.324, 0.323, 0.000)
		colorSnow      (0.342, 0.339, 0.338, 1.000)
		BumpHeight      0.0471105
		BumpOffset      0.0094221
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0484704
		DustBright  0.473888
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   69.8612
		Period          291.158
		Eccentricity    0.743679
		Inclination     163.138
		AscendingNode   93.1202
		ArgOfPericenter 92.0783
		MeanAnomaly     -88.5831
	}
}

Comet	"Japrael System C63"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            2.92209e-013
	Radius          0.924466
	InertiaMoment   0.398181

	Oblateness      0.0177017

	RotationPeriod  38.0671
	Obliquity       293.599
	EqAscendNode    27.5503

	AbsMagn         13.5414
	SlopeParam      4.74333
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.637 0.635 0.633)

	Surface
	{
		SurfStyle       0.898947
		OceanStyle      0.117648
		Randomize      (-0.441, 0.025, 0.593)
		colorDistMagn   0.567942
		colorDistFreq   0.000333775
		detailScale     25.2441
		colorConversion true
		snowLevel       2
		tropicLatitude  0.710673
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.667392
		terraceProb     0.108097
		erosion         0
		montesMagn      0.510827
		montesFreq      3.92402
		montesSpiky     0.924243
		montesFraction  0.661546
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00220311
		hillsFraction   0.547905
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.253191
		craterFreq      0.215344
		craterDensity   0.933047
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.484948
		volcanoTemp     1181.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.222, 0.253, 0.050)
		colorShelf     (0.255, 0.261, 0.291, 0.040)
		colorBeach     (0.293, 0.299, 0.329, 0.030)
		colorDesert    (0.331, 0.337, 0.374, 0.020)
		colorLowland   (0.370, 0.375, 0.412, 0.030)
		colorUpland    (0.408, 0.413, 0.450, 0.050)
		colorRock      (0.446, 0.451, 0.500, 0.020)
		colorSnow      (0.446, 0.451, 0.500, 1.000)
		BumpHeight      0.832019
		BumpOffset      0.166404
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

	CometTail
	{
		MaxLength   0.315129
		GasToDust   0.25
		Particles   1616
		GasBright   0.0314067
		DustBright  0.175439
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   77.0761
		Period          337.407
		Eccentricity    0.94771
		Inclination     91.4651
		AscendingNode   -139.183
		ArgOfPericenter -115.7
		MeanAnomaly     -44.0417
	}
}

Comet	"Japrael System C64"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            2.26002e-009
	Radius          20.4323
	InertiaMoment   0.399866

	Oblateness      0.0275388

	RotationPeriod  36.1732
	Obliquity       246.804
	EqAscendNode    12.1277

	AbsMagn         8.8002
	SlopeParam      5.39341
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.566 0.561 0.558)

	Surface
	{
		SurfStyle       0.98304
		OceanStyle      0.6301
		Randomize      (0.618, 0.814, 0.309)
		colorDistMagn   0.979419
		colorDistFreq   0.0358918
		detailScale     557.938
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991906
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.588981
		terraceProb     0.242928
		erosion         0
		montesMagn      0.322632
		montesFreq      2.42526
		montesSpiky     0.983378
		montesFraction  0.537765
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.960916
		hillsFraction   0.666256
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.190739
		craterFreq      0.223586
		craterDensity   0.836866
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498015
		volcanoTemp     1323.83
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.192, 0.196, 0.223, 0.050)
		colorShelf     (0.226, 0.230, 0.256, 0.040)
		colorBeach     (0.260, 0.264, 0.290, 0.030)
		colorDesert    (0.294, 0.297, 0.329, 0.020)
		colorLowland   (0.328, 0.331, 0.362, 0.030)
		colorUpland    (0.362, 0.365, 0.396, 0.050)
		colorRock      (0.396, 0.398, 0.440, 0.020)
		colorSnow      (0.396, 0.398, 0.440, 1.000)
		BumpHeight      18.3891
		BumpOffset      3.67782
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

	CometTail
	{
		MaxLength   0.796321
		GasToDust   0.25
		Particles   2588
		GasBright   0.145789
		DustBright  0.545542
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   83.6191
		Period          381.27
		Eccentricity    0.973242
		Inclination     136.715
		AscendingNode   -131.029
		ArgOfPericenter 13.0217
		MeanAnomaly     131.157
	}
}

Comet	"Japrael System C65"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            6.95879e-017
	Radius          0.0572638
	InertiaMoment   0.398744

	Oblateness      0.0218746

	RotationPeriod  34.2459
	Obliquity       200.01
	EqAscendNode    356.705

	AbsMagn         5.19444
	SlopeParam      6.24413
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.586 0.481 0.331)

	Surface
	{
		SurfStyle       0.231877
		OceanStyle      0.742311
		Randomize      (-0.981, 0.028, -0.931)
		colorDistMagn   0.638581
		colorDistFreq   1.77945e-006
		detailScale     1.56368
		colorConversion true
		snowLevel       2
		tropicLatitude  0.989691
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.62365
		terraceProb     0.122058
		erosion         0
		montesMagn      0.552552
		montesFreq      2.14654
		montesSpiky     0.902521
		montesFraction  0.781243
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.12141e-005
		hillsFraction   0.546252
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.248203
		craterFreq      0.191147
		craterDensity   0.734737
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541474
		volcanoTemp     1281.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.234, 0.192, 0.132, 0.000)
		colorShelf     (0.249, 0.204, 0.141, 0.000)
		colorBeach     (0.264, 0.216, 0.149, 0.000)
		colorDesert    (0.278, 0.228, 0.157, 0.000)
		colorLowland   (0.293, 0.240, 0.165, 0.000)
		colorUpland    (0.308, 0.253, 0.174, 0.000)
		colorRock      (0.322, 0.265, 0.182, 0.000)
		colorSnow      (0.337, 0.277, 0.190, 1.000)
		BumpHeight      0.0515374
		BumpOffset      0.0103075
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.101444
		DustBright  0.274375
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   115.219
		Period          616.682
		Eccentricity    0.866989
		Inclination     76.2939
		AscendingNode   -76.1788
		ArgOfPericenter -128.711
		MeanAnomaly     -35.8308
	}
}

Comet	"Japrael System C66"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            5.38212e-013
	Radius          1.26411
	InertiaMoment   0.396835

	Oblateness      0.0340035

	RotationPeriod  32.2784
	Obliquity       153.216
	EqAscendNode    341.283

	AbsMagn         13.0412
	SlopeParam      8.15659
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.486 0.479 0.473)

	Surface
	{
		SurfStyle       0.354879
		OceanStyle      0.0740861
		Randomize      (-0.027, -0.993, -0.204)
		colorDistMagn   0.460332
		colorDistFreq   0.000706794
		detailScale     34.5188
		colorConversion true
		snowLevel       2
		tropicLatitude  0.531939
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.532686
		terraceProb     0.492666
		erosion         0
		montesMagn      0.45058
		montesFreq      2.1704
		montesSpiky     0.96749
		montesFraction  0.353308
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00370134
		hillsFraction   0.830391
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26716
		craterFreq      0.204445
		craterDensity   0.985298
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.433605
		volcanoTemp     1740.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.195, 0.191, 0.189, 0.000)
		colorShelf     (0.207, 0.203, 0.201, 0.000)
		colorBeach     (0.219, 0.215, 0.213, 0.000)
		colorDesert    (0.231, 0.227, 0.225, 0.000)
		colorLowland   (0.243, 0.239, 0.237, 0.000)
		colorUpland    (0.255, 0.251, 0.249, 0.000)
		colorRock      (0.267, 0.263, 0.260, 0.000)
		colorSnow      (0.280, 0.275, 0.272, 1.000)
		BumpHeight      1.1377
		BumpOffset      0.227541
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

	CometTail
	{
		MaxLength   0.347955
		GasToDust   0.25
		Particles   1682
		GasBright   0.283017
		DustBright  0.577288
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   84.1974
		Period          385.232
		Eccentricity    0.940665
		Inclination     -55.7992
		AscendingNode   -157.767
		ArgOfPericenter 44.257
		MeanAnomaly     101.398
	}
}

Comet	"Japrael System C67"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            4.16269e-009
	Radius          22.3805
	InertiaMoment   0.399221

	Oblateness      0.0280055

	RotationPeriod  30.2628
	Obliquity       106.421
	EqAscendNode    325.86

	AbsMagn         8.58838
	SlopeParam      2.6629
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.796 0.793 0.792)

	Surface
	{
		SurfStyle       0.534826
		OceanStyle      0.279344
		Randomize      (-0.653, -0.977, -0.364)
		colorDistMagn   0.643296
		colorDistFreq   0.376913
		detailScale     611.136
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999806
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.628589
		terraceProb     0.404482
		erosion         0
		montesMagn      0.593719
		montesFreq      2.38828
		montesSpiky     0.979318
		montesFraction  0.500408
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.3911
		hillsFraction   0.406914
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26431
		craterFreq      0.248328
		craterDensity   0.963137
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.606925
		volcanoTemp     1472.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.310, 0.270, 0.222, 0.000)
		colorShelf     (0.318, 0.278, 0.253, 0.000)
		colorBeach     (0.374, 0.325, 0.301, 0.000)
		colorDesert    (0.406, 0.349, 0.293, 0.000)
		colorLowland   (0.446, 0.373, 0.332, 0.000)
		colorUpland    (0.493, 0.452, 0.404, 0.000)
		colorRock      (0.533, 0.492, 0.435, 0.000)
		colorSnow      (0.581, 0.524, 0.459, 1.000)
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

	CometTail
	{
		MaxLength   0.829147
		GasToDust   0.25
		Particles   2654
		GasBright   0.211389
		DustBright  0.333403
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   73.6193
		Period          314.965
		Eccentricity    0.865055
		Inclination     -152.027
		AscendingNode   120.743
		ArgOfPericenter -119.465
		MeanAnomaly     -25.3358
	}
}

Comet	"Japrael System C68"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.28172e-016
	Radius          0.0782132
	InertiaMoment   0.397842

	Oblateness      0.0445082

	RotationPeriod  28.1899
	Obliquity       59.6271
	EqAscendNode    310.437

	AbsMagn         4.92096
	SlopeParam      3.30425
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.744 0.704 0.668)

	Surface
	{
		SurfStyle       0.323445
		OceanStyle      0.39988
		Randomize      (0.724, 0.567, 0.782)
		colorDistMagn   0.330275
		colorDistFreq   3.20844e-006
		detailScale     2.13574
		colorConversion true
		snowLevel       2
		tropicLatitude  0.879459
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.341393
		terraceProb     0.338981
		erosion         0
		montesMagn      0.532332
		montesFreq      2.99032
		montesSpiky     0.874185
		montesFraction  0.791327
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.13272e-006
		hillsFraction   0.46868
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.255339
		craterFreq      0.176133
		craterDensity   0.786109
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469305
		volcanoTemp     1329.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.298, 0.282, 0.267, 0.000)
		colorShelf     (0.316, 0.299, 0.284, 0.000)
		colorBeach     (0.335, 0.317, 0.301, 0.000)
		colorDesert    (0.354, 0.334, 0.317, 0.000)
		colorLowland   (0.372, 0.352, 0.334, 0.000)
		colorUpland    (0.391, 0.370, 0.351, 0.000)
		colorRock      (0.409, 0.387, 0.367, 0.000)
		colorSnow      (0.428, 0.405, 0.384, 1.000)
		BumpHeight      0.0703918
		BumpOffset      0.0140784
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.102502
		DustBright  0.126776
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   116.296
		Period          625.345
		Eccentricity    0.881123
		Inclination     172.703
		AscendingNode   -103.485
		ArgOfPericenter -1.59529
		MeanAnomaly     40.858
	}
}

Comet	"Japrael System C69"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            9.91321e-013
	Radius          1.3863
	InertiaMoment   0.399658

	Oblateness      0.0377842

	RotationPeriod  26.0491
	Obliquity       12.8328
	EqAscendNode    295.015

	AbsMagn         12.6094
	SlopeParam      3.87983
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.734 0.729 0.726)

	Surface
	{
		SurfStyle       0.889813
		OceanStyle      0.636684
		Randomize      (0.814, 0.336, -0.171)
		colorDistMagn   0.834622
		colorDistFreq   0.000412791
		detailScale     37.8553
		colorConversion true
		snowLevel       2
		tropicLatitude  0.751114
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.638877
		terraceProb     0.244263
		erosion         0
		montesMagn      0.614921
		montesFreq      2.53262
		montesSpiky     0.886792
		montesFraction  0.289381
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00576067
		hillsFraction   0.643494
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26824
		craterFreq      0.229921
		craterDensity   1.03724
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.553096
		volcanoTemp     1508.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.250, 0.255, 0.291, 0.050)
		colorShelf     (0.294, 0.299, 0.334, 0.040)
		colorBeach     (0.338, 0.343, 0.378, 0.030)
		colorDesert    (0.382, 0.387, 0.429, 0.020)
		colorLowland   (0.426, 0.430, 0.472, 0.030)
		colorUpland    (0.470, 0.474, 0.516, 0.050)
		colorRock      (0.514, 0.518, 0.574, 0.020)
		colorSnow      (0.514, 0.518, 0.574, 1.000)
		BumpHeight      1.24767
		BumpOffset      0.249534
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

	CometTail
	{
		MaxLength   0.380781
		GasToDust   0.25
		Particles   1749
		GasBright   0.0043598
		DustBright  0.709405
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   101.682
		Period          511.261
		Eccentricity    0.932618
		Inclination     -139.753
		AscendingNode   -54.1565
		ArgOfPericenter -99.9445
		MeanAnomaly     5.69232
	}
}

Comet	"Japrael System C70"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            7.66714e-009
	Radius          30.5349
	InertiaMoment   0.398481

	Oblateness      0.0621171

	RotationPeriod  23.8277
	Obliquity       326.039
	EqAscendNode    279.592

	AbsMagn         8.37819
	SlopeParam      4.44543
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.622 0.618 0.613)

	Surface
	{
		SurfStyle       0.813588
		OceanStyle      0.986468
		Randomize      (0.615, -0.184, 0.062)
		colorDistMagn   0.223207
		colorDistFreq   0.345043
		detailScale     833.805
		colorConversion true
		snowLevel       2
		tropicLatitude  0.910686
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.593246
		terraceProb     0.184562
		erosion         0
		montesMagn      0.508579
		montesFreq      3.12216
		montesSpiky     0.971246
		montesFraction  0.705481
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.22729
		hillsFraction   0.685018
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.263967
		craterFreq      0.245373
		craterDensity   0.799388
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.433548
		volcanoTemp     1473.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.242, 0.210, 0.172, 0.000)
		colorShelf     (0.249, 0.216, 0.196, 0.000)
		colorBeach     (0.292, 0.253, 0.233, 0.000)
		colorDesert    (0.317, 0.272, 0.227, 0.000)
		colorLowland   (0.348, 0.290, 0.258, 0.000)
		colorUpland    (0.385, 0.352, 0.313, 0.000)
		colorRock      (0.417, 0.383, 0.337, 0.000)
		colorSnow      (0.454, 0.408, 0.356, 1.000)
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

	CometTail
	{
		MaxLength   0.861973
		GasToDust   0.25
		Particles   2721
		GasBright   0.0259474
		DustBright  0.372304
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   102.877
		Period          520.301
		Eccentricity    0.894007
		Inclination     -98.2383
		AscendingNode   -164.186
		ArgOfPericenter 36.9454
		MeanAnomaly     12.1811
	}
}

Comet	"Japrael System C71"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            2.36077e-016
	Radius          0.0858707
	InertiaMoment   0.395689

	Oblateness      0.0544839

	RotationPeriod  21.5102
	Obliquity       279.244
	EqAscendNode    264.17

	AbsMagn         4.63227
	SlopeParam      5.04994
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.760 0.723 0.681)

	Surface
	{
		SurfStyle       0.883497
		OceanStyle      0.741501
		Randomize      (0.297, -0.392, 0.241)
		colorDistMagn   0.438606
		colorDistFreq   2.05801e-006
		detailScale     2.34484
		colorConversion true
		snowLevel       2
		tropicLatitude  0.946929
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.642755
		terraceProb     0.235256
		erosion         0
		montesMagn      0.636512
		montesFreq      3.13043
		montesSpiky     0.835406
		montesFraction  0.233862
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.79698e-005
		hillsFraction   0.50988
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230908
		craterFreq      0.206127
		craterDensity   0.841114
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.515721
		volcanoTemp     1481.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.258, 0.253, 0.273, 0.050)
		colorShelf     (0.304, 0.296, 0.313, 0.040)
		colorBeach     (0.350, 0.340, 0.354, 0.030)
		colorDesert    (0.395, 0.383, 0.402, 0.020)
		colorLowland   (0.441, 0.426, 0.443, 0.030)
		colorUpland    (0.487, 0.470, 0.484, 0.050)
		colorRock      (0.532, 0.513, 0.538, 0.020)
		colorSnow      (0.532, 0.513, 0.538, 1.000)
		BumpHeight      0.0772836
		BumpOffset      0.0154567
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.109635
		DustBright  0.773103
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   45.8757
		Period          154.935
		Eccentricity    0.728808
		Inclination     -168.323
		AscendingNode   34.7542
		ArgOfPericenter 119.424
		MeanAnomaly     -15.5301
	}
}

Comet	"Japrael System C72"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.82588e-012
	Radius          1.88944
	InertiaMoment   0.398993

	Oblateness      0.0965939

	RotationPeriod  19.0773
	Obliquity       232.45
	EqAscendNode    248.747

	AbsMagn         12.2255
	SlopeParam      5.77262
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.589 0.585 0.581)

	Surface
	{
		SurfStyle       0.775377
		OceanStyle      0.205117
		Randomize      (-0.597, -0.571, -0.362)
		colorDistMagn   0.351889
		colorDistFreq   0.00196364
		detailScale     51.5943
		colorConversion true
		snowLevel       2
		tropicLatitude  0.884029
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.455884
		terraceProb     0.242813
		erosion         0
		montesMagn      0.505491
		montesFreq      2.67709
		montesSpiky     0.848501
		montesFraction  0.772342
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00604998
		hillsFraction   0.616583
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217082
		craterFreq      0.236281
		craterDensity   0.888028
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.474919
		volcanoTemp     1271.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.230, 0.199, 0.163, 0.000)
		colorShelf     (0.235, 0.205, 0.186, 0.000)
		colorBeach     (0.277, 0.240, 0.221, 0.000)
		colorDesert    (0.300, 0.258, 0.215, 0.000)
		colorLowland   (0.330, 0.275, 0.244, 0.000)
		colorUpland    (0.365, 0.334, 0.296, 0.000)
		colorRock      (0.394, 0.363, 0.319, 0.000)
		colorSnow      (0.430, 0.386, 0.337, 1.000)
		BumpHeight      1.7005
		BumpOffset      0.340099
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

	CometTail
	{
		MaxLength   0.413607
		GasToDust   0.25
		Particles   1815
		GasBright   0.10394
		DustBright  0.463284
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   87.4938
		Period          408.075
		Eccentricity    0.856736
		Inclination     -58.7558
		AscendingNode   77.1008
		ArgOfPericenter -46.2649
		MeanAnomaly     -32.3567
	}
}

Comet	"Japrael System C73"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.41219e-008
	Radius          33.5609
	InertiaMoment   0.397426

	Oblateness      0.0929624

	RotationPeriod  16.5045
	Obliquity       185.656
	EqAscendNode    233.324

	AbsMagn         8.16904
	SlopeParam      6.86992
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.686 0.681 0.678)

	Surface
	{
		SurfStyle       0.425849
		OceanStyle      0.326411
		Randomize      (0.842, -0.595, 0.906)
		colorDistMagn   0.425538
		colorDistFreq   0.877954
		detailScale     916.435
		colorConversion true
		snowLevel       2
		tropicLatitude  0.811577
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.531397
		terraceProb     0.264975
		erosion         0
		montesMagn      0.581654
		montesFreq      3.23023
		montesSpiky     0.989632
		montesFraction  0.421275
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.00494
		hillsFraction   0.865344
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.259756
		craterFreq      0.200585
		craterDensity   0.798176
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.512643
		volcanoTemp     1295.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.274, 0.273, 0.271, 0.000)
		colorShelf     (0.291, 0.290, 0.288, 0.000)
		colorBeach     (0.309, 0.307, 0.305, 0.000)
		colorDesert    (0.326, 0.324, 0.322, 0.000)
		colorLowland   (0.343, 0.341, 0.339, 0.000)
		colorUpland    (0.360, 0.358, 0.356, 0.000)
		colorRock      (0.377, 0.375, 0.373, 0.000)
		colorSnow      (0.394, 0.392, 0.390, 1.000)
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

	CometTail
	{
		MaxLength   0.894799
		GasToDust   0.25
		Particles   2787
		GasBright   0.0609868
		DustBright  0.190724
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   83.5895
		Period          381.068
		Eccentricity    0.850532
		Inclination     59.781
		AscendingNode   168.304
		ArgOfPericenter 179.532
		MeanAnomaly     74.1335
	}
}

Comet	"Japrael System C74"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            4.34824e-016
	Radius          0.116921
	InertiaMoment   0.399446

	Oblateness      0.185069

	RotationPeriod  13.7597
	Obliquity       138.861
	EqAscendNode    217.902

	AbsMagn         4.32487
	SlopeParam      2.28137
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.575 0.571 0.563)

	Surface
	{
		SurfStyle       0.754316
		OceanStyle      0.91713
		Randomize      (-0.677, 0.569, -0.989)
		colorDistMagn   0.438278
		colorDistFreq   9.91122e-006
		detailScale     3.19271
		colorConversion true
		snowLevel       2
		tropicLatitude  0.474764
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.615067
		terraceProb     0.287157
		erosion         0
		montesMagn      0.389997
		montesFreq      2.43725
		montesSpiky     0.894725
		montesFraction  0.833675
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.06439e-005
		hillsFraction   0.601316
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.214854
		craterFreq      0.226258
		craterDensity   0.904981
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.520324
		volcanoTemp     1731.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.224, 0.194, 0.158, 0.000)
		colorShelf     (0.230, 0.200, 0.180, 0.000)
		colorBeach     (0.270, 0.234, 0.214, 0.000)
		colorDesert    (0.293, 0.251, 0.208, 0.000)
		colorLowland   (0.322, 0.269, 0.237, 0.000)
		colorUpland    (0.357, 0.326, 0.287, 0.000)
		colorRock      (0.386, 0.354, 0.310, 0.000)
		colorSnow      (0.420, 0.377, 0.327, 1.000)
		BumpHeight      0.105228
		BumpOffset      0.0210457
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.221842
		DustBright  0.514356
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   95.3751
		Period          464.437
		Eccentricity    0.911609
		Inclination     -118.268
		AscendingNode   25.3953
		ArgOfPericenter 11.0207
		MeanAnomaly     177.355
	}
}

Comet	"Japrael System C75"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            3.36305e-012
	Radius          2.07884
	InertiaMoment   0.398189

	Oblateness      0.217286

	RotationPeriod  10.7999
	Obliquity       92.067
	EqAscendNode    202.479

	AbsMagn         11.8771
	SlopeParam      2.99216
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.619 0.616 0.614)

	Surface
	{
		SurfStyle       0.301193
		OceanStyle      0.0412751
		Randomize      (-0.555, 0.776, 0.192)
		colorDistMagn   0.727613
		colorDistFreq   0.00197982
		detailScale     56.7661
		colorConversion true
		snowLevel       2
		tropicLatitude  0.863843
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.555894
		terraceProb     0.37807
		erosion         0
		montesMagn      0.382419
		montesFreq      3.34723
		montesSpiky     0.932465
		montesFraction  0.586178
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00635683
		hillsFraction   0.87169
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.23422
		craterFreq      0.248673
		craterDensity   0.916482
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504283
		volcanoTemp     1225.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.247, 0.245, 0.000)
		colorShelf     (0.263, 0.262, 0.261, 0.000)
		colorBeach     (0.278, 0.277, 0.276, 0.000)
		colorDesert    (0.294, 0.293, 0.291, 0.000)
		colorLowland   (0.309, 0.308, 0.307, 0.000)
		colorUpland    (0.325, 0.324, 0.322, 0.000)
		colorRock      (0.340, 0.339, 0.337, 0.000)
		colorSnow      (0.356, 0.354, 0.353, 1.000)
		BumpHeight      1.87095
		BumpOffset      0.37419
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

	CometTail
	{
		MaxLength   0.446433
		GasToDust   0.25
		Particles   1881
		GasBright   0.151606
		DustBright  0.269078
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.031 0.066 0.051)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   58.7489
		Period          224.53
		Eccentricity    0.895622
		Inclination     147.677
		AscendingNode   -1.15261
		ArgOfPericenter -25.1387
		MeanAnomaly     -56.8067
	}
}

Comet	"Japrael System C76"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            2.60108e-008
	Radius          45.6528
	InertiaMoment   0.399871

	Oblateness      0.249

	RotationPeriod  7.56456
	Obliquity       45.2727
	EqAscendNode    187.057

	AbsMagn         7.96035
	SlopeParam      3.5923
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.716 0.715 0.714)

	Surface
	{
		SurfStyle       0.205591
		OceanStyle      0.854981
		Randomize      (0.675, -0.681, -0.206)
		colorDistMagn   0.698863
		colorDistFreq   1.1877
		detailScale     1246.63
		colorConversion true
		snowLevel       2
		tropicLatitude  0.992501
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.533788
		terraceProb     0.319009
		erosion         0
		montesMagn      0.508666
		montesFreq      2.77444
		montesSpiky     0.775631
		montesFraction  0.707157
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.17921
		hillsFraction   0.476781
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.24161
		craterFreq      0.239907
		craterDensity   1.07358
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.471781
		volcanoTemp     1584.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.286, 0.285, 0.000)
		colorShelf     (0.304, 0.304, 0.303, 0.000)
		colorBeach     (0.322, 0.322, 0.321, 0.000)
		colorDesert    (0.340, 0.340, 0.339, 0.000)
		colorLowland   (0.358, 0.358, 0.357, 0.000)
		colorUpland    (0.376, 0.375, 0.375, 0.000)
		colorRock      (0.394, 0.393, 0.392, 0.000)
		colorSnow      (0.412, 0.411, 0.410, 1.000)
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

	CometTail
	{
		MaxLength   0.927625
		GasToDust   0.25
		Particles   2853
		GasBright   0.379651
		DustBright  0.525519
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   113.779
		Period          605.158
		Eccentricity    0.924802
		Inclination     117.411
		AscendingNode   -108.656
		ArgOfPericenter 87.9562
		MeanAnomaly     -120.035
	}
}

Comet	"Japrael System C77"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            8.00893e-016
	Radius          0.128768
	InertiaMoment   0.398751

	Oblateness      0.249

	RotationPeriod  3.96464
	Obliquity       358.478
	EqAscendNode    171.634

	AbsMagn         3.99406
	SlopeParam      4.15714
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.467 0.458 0.453)

	Surface
	{
		SurfStyle       0.870689
		OceanStyle      0.0259477
		Randomize      (0.450, -0.078, 0.786)
		colorDistMagn   0.0678269
		colorDistFreq   3.89845e-006
		detailScale     3.51622
		colorConversion true
		snowLevel       2
		tropicLatitude  0.0327723
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.368555
		terraceProb     0.567308
		erosion         0
		montesMagn      0.651696
		montesFreq      2.73011
		montesSpiky     0.977129
		montesFraction  0.645618
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.66537e-005
		hillsFraction   0.619254
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.233466
		craterFreq      0.258395
		craterDensity   1.02661
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.462235
		volcanoTemp     1356.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.159, 0.160, 0.181, 0.050)
		colorShelf     (0.187, 0.188, 0.209, 0.040)
		colorBeach     (0.215, 0.215, 0.236, 0.030)
		colorDesert    (0.243, 0.243, 0.268, 0.020)
		colorLowland   (0.271, 0.270, 0.295, 0.030)
		colorUpland    (0.299, 0.298, 0.322, 0.050)
		colorRock      (0.327, 0.325, 0.358, 0.020)
		colorSnow      (0.327, 0.325, 0.358, 1.000)
		BumpHeight      0.115891
		BumpOffset      0.0231782
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.282133
		DustBright  0.307524
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   102.997
		Period          521.211
		Eccentricity    0.919996
		Inclination     -176.781
		AscendingNode   -20.9064
		ArgOfPericenter -151.758
		MeanAnomaly     -142.514
	}
}

Comet	"Japrael System C78"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            6.1943e-012
	Radius          2.82527
	InertiaMoment   0.396853

	Oblateness      0.00205928

	RotationPeriod  129.188
	Obliquity       311.684
	EqAscendNode    156.211

	AbsMagn         11.5558
	SlopeParam      4.73507
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.632 0.628 0.622)

	Surface
	{
		SurfStyle       0.0197616
		OceanStyle      0.900629
		Randomize      (0.199, -0.386, 0.326)
		colorDistMagn   0.718115
		colorDistFreq   0.00546742
		detailScale     77.1488
		colorConversion true
		snowLevel       2
		tropicLatitude  0.936423
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.733419
		terraceProb     0.37369
		erosion         0
		montesMagn      0.620594
		montesFreq      2.54991
		montesSpiky     0.946768
		montesFraction  0.661979
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0207114
		hillsFraction   0.602819
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232868
		craterFreq      0.20799
		craterDensity   0.745294
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501075
		volcanoTemp     1068.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.253, 0.251, 0.249, 0.000)
		colorShelf     (0.269, 0.267, 0.265, 0.000)
		colorBeach     (0.284, 0.283, 0.280, 0.000)
		colorDesert    (0.300, 0.298, 0.296, 0.000)
		colorLowland   (0.316, 0.314, 0.311, 0.000)
		colorUpland    (0.332, 0.330, 0.327, 0.000)
		colorRock      (0.348, 0.345, 0.342, 0.000)
		colorSnow      (0.363, 0.361, 0.358, 1.000)
		BumpHeight      2.54275
		BumpOffset      0.508549
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

	CometTail
	{
		MaxLength   0.479259
		GasToDust   0.25
		Particles   1947
		GasBright   0.0102846
		DustBright  0.263859
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   84.1943
		Period          385.211
		Eccentricity    0.926935
		Inclination     -158.533
		AscendingNode   -168.699
		ArgOfPericenter 21.6177
		MeanAnomaly     -84.1382
	}
}

Comet	"Japrael System C79"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            4.79086e-008
	Radius          50.326
	InertiaMoment   0.399227

	Oblateness      0.00192863

	RotationPeriod  114.624
	Obliquity       264.89
	EqAscendNode    140.789

	AbsMagn         7.75156
	SlopeParam      5.38359
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.514 0.510 0.504)

	Surface
	{
		SurfStyle       0.381469
		OceanStyle      0.0490778
		Randomize      (-0.368, 0.712, -0.361)
		colorDistMagn   0.336813
		colorDistFreq   0.0351529
		detailScale     1374.24
		colorConversion true
		snowLevel       2
		tropicLatitude  0.774684
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.432755
		terraceProb     0.203938
		erosion         0
		montesMagn      0.315539
		montesFreq      3.18194
		montesSpiky     0.885511
		montesFraction  0.474286
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.708
		hillsFraction   0.696345
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251558
		craterFreq      0.266994
		craterDensity   0.956404
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.511743
		volcanoTemp     1482.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.206, 0.204, 0.201, 0.000)
		colorShelf     (0.218, 0.217, 0.214, 0.000)
		colorBeach     (0.231, 0.230, 0.227, 0.000)
		colorDesert    (0.244, 0.242, 0.239, 0.000)
		colorLowland   (0.257, 0.255, 0.252, 0.000)
		colorUpland    (0.270, 0.268, 0.264, 0.000)
		colorRock      (0.283, 0.281, 0.277, 0.000)
		colorSnow      (0.295, 0.293, 0.290, 1.000)
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

	CometTail
	{
		MaxLength   0.960451
		GasToDust   0.25
		Particles   2920
		GasBright   0.0732539
		DustBright  0.685377
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   68.1264
		Period          280.381
		Eccentricity    0.912715
		Inclination     50.644
		AscendingNode   -26.5667
		ArgOfPericenter 178.125
		MeanAnomaly     -5.37087
	}
}

Comet	"Japrael System C80"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.47514e-015
	Radius          0.174852
	InertiaMoment   0.397851

	Oblateness      0.00302891

	RotationPeriod  106.475
	Obliquity       218.096
	EqAscendNode    125.366

	AbsMagn         3.6333
	SlopeParam      6.2297
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.436 0.430 0.425)

	Surface
	{
		SurfStyle       0.728278
		OceanStyle      0.787475
		Randomize      (0.313, 0.698, 0.330)
		colorDistMagn   0.903993
		colorDistFreq   2.09988e-005
		detailScale     4.77463
		colorConversion true
		snowLevel       2
		tropicLatitude  0.786988
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.535468
		terraceProb     0.196858
		erosion         0
		montesMagn      0.434707
		montesFreq      2.87441
		montesSpiky     0.816142
		montesFraction  0.316741
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.23617e-005
		hillsFraction   0.609947
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.232235
		craterFreq      0.198999
		craterDensity   0.863069
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.449743
		volcanoTemp     1352.33
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.146, 0.119, 0.000)
		colorShelf     (0.175, 0.151, 0.136, 0.000)
		colorBeach     (0.205, 0.176, 0.162, 0.000)
		colorDesert    (0.223, 0.189, 0.157, 0.000)
		colorLowland   (0.244, 0.202, 0.179, 0.000)
		colorUpland    (0.270, 0.245, 0.217, 0.000)
		colorRock      (0.292, 0.267, 0.234, 0.000)
		colorSnow      (0.318, 0.284, 0.247, 1.000)
		BumpHeight      0.157367
		BumpOffset      0.0314734
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

	CometTail
	{
		MaxLength   0.0308931
		GasToDust   0.25
		Particles   1042
		GasBright   0.0689516
		DustBright  0.374165
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   80.1693
		Period          357.921
		Eccentricity    0.883329
		Inclination     13.9706
		AscendingNode   9.90032
		ArgOfPericenter 60.5195
		MeanAnomaly     -17.1221
	}
}

Comet	"Japrael System C81"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.14091e-011
	Radius          3.1173
	InertiaMoment   0.399663

	Oblateness      0.00250562

	RotationPeriod  100.544
	Obliquity       171.301
	EqAscendNode    109.944

	AbsMagn         11.256
	SlopeParam      8.09192
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.523 0.515 0.509)

	Surface
	{
		SurfStyle       0.25655
		OceanStyle      0.764361
		Randomize      (-0.600, 0.466, 0.786)
		colorDistMagn   0.338001
		colorDistFreq   0.00200775
		detailScale     85.123
		colorConversion true
		snowLevel       2
		tropicLatitude  0.867076
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.47394
		terraceProb     0.312151
		erosion         0
		montesMagn      0.330735
		montesFreq      3.59159
		montesSpiky     0.975545
		montesFraction  0.533529
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0184642
		hillsFraction   0.621567
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.223747
		craterFreq      0.234433
		craterDensity   1.02844
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.542329
		volcanoTemp     1506.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.209, 0.206, 0.204, 0.000)
		colorShelf     (0.222, 0.219, 0.216, 0.000)
		colorBeach     (0.235, 0.232, 0.229, 0.000)
		colorDesert    (0.248, 0.245, 0.242, 0.000)
		colorLowland   (0.262, 0.258, 0.255, 0.000)
		colorUpland    (0.275, 0.270, 0.267, 0.000)
		colorRock      (0.288, 0.283, 0.280, 0.000)
		colorSnow      (0.301, 0.296, 0.293, 1.000)
		BumpHeight      2.80557
		BumpOffset      0.561114
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

	CometTail
	{
		MaxLength   0.512085
		GasToDust   0.25
		Particles   2014
		GasBright   0.199111
		DustBright  0.728492
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   61.5417
		Period          240.729
		Eccentricity    0.79484
		Inclination     114.706
		AscendingNode   -128.232
		ArgOfPericenter -1.65774
		MeanAnomaly     140.971
	}
}

Comet	"Japrael System C82"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            8.82416e-008
	Radius          68.2807
	InertiaMoment   0.398488

	Oblateness      0.00373574

	RotationPeriod  95.7721
	Obliquity       124.507
	EqAscendNode    94.521

	AbsMagn         7.54209
	SlopeParam      2.65323
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.761 0.703 0.626)

	Surface
	{
		SurfStyle       0.584739
		OceanStyle      0.710495
		Randomize      (0.250, -0.772, 0.290)
		colorDistMagn   0.85952
		colorDistFreq   2.86861
		detailScale     1864.52
		colorConversion true
		snowLevel       2
		tropicLatitude  0.507177
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.723495
		terraceProb     0.201276
		erosion         0
		montesMagn      0.438122
		montesFreq      2.36198
		montesSpiky     0.97727
		montesFraction  0.850371
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.984
		hillsFraction   0.596149
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.254588
		craterFreq      0.162091
		craterDensity   0.932966
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.541824
		volcanoTemp     1042.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.239, 0.175, 0.000)
		colorShelf     (0.304, 0.246, 0.200, 0.000)
		colorBeach     (0.358, 0.288, 0.238, 0.000)
		colorDesert    (0.388, 0.309, 0.231, 0.000)
		colorLowland   (0.426, 0.331, 0.263, 0.000)
		colorUpland    (0.472, 0.401, 0.319, 0.000)
		colorRock      (0.510, 0.436, 0.344, 0.000)
		colorSnow      (0.556, 0.464, 0.363, 1.000)
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

	CometTail
	{
		MaxLength   0.993277
		GasToDust   0.25
		Particles   2986
		GasBright   0.167527
		DustBright  0.444563
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   63.0741
		Period          249.776
		Eccentricity    0.869257
		Inclination     142.27
		AscendingNode   145.142
		ArgOfPericenter -9.3708
		MeanAnomaly     -125.507
	}
}

Comet	"Japrael System C83"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            2.71703e-015
	Radius          0.193092
	InertiaMoment   0.395741

	Oblateness      0.0029611

	RotationPeriod  91.7174
	Obliquity       77.7126
	EqAscendNode    79.0984

	AbsMagn         3.233
	SlopeParam      3.29605
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.577 0.508 0.378)

	Surface
	{
		SurfStyle       0.35395
		OceanStyle      0.120981
		Randomize      (-0.277, -0.100, -0.049)
		colorDistMagn   0.273781
		colorDistFreq   1.58222e-005
		detailScale     5.27269
		colorConversion true
		snowLevel       2
		tropicLatitude  0.969909
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.435838
		terraceProb     0.232746
		erosion         0
		montesMagn      0.649459
		montesFreq      2.81876
		montesSpiky     0.897494
		montesFraction  0.235864
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000108448
		hillsFraction   0.822633
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.203639
		craterFreq      0.210297
		craterDensity   0.989567
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498848
		volcanoTemp     1530.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.231, 0.203, 0.151, 0.000)
		colorShelf     (0.245, 0.216, 0.161, 0.000)
		colorBeach     (0.259, 0.228, 0.170, 0.000)
		colorDesert    (0.274, 0.241, 0.180, 0.000)
		colorLowland   (0.288, 0.254, 0.189, 0.000)
		colorUpland    (0.303, 0.267, 0.198, 0.000)
		colorRock      (0.317, 0.279, 0.208, 0.000)
		colorSnow      (0.332, 0.292, 0.217, 1.000)
		BumpHeight      0.173782
		BumpOffset      0.0347565
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

	CometTail
	{
		MaxLength   0.0637191
		GasToDust   0.25
		Particles   1108
		GasBright   0.0986834
		DustBright  0.197893
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   124.824
		Period          695.38
		Eccentricity    0.914232
		Inclination     37.32
		AscendingNode   45.8368
		ArgOfPericenter 50.3755
		MeanAnomaly     131.048
	}
}

Comet	"Japrael System C84"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            2.10143e-011
	Radius          4.22609
	InertiaMoment   0.398999

	Oblateness      0.00439846

	RotationPeriod  88.1524
	Obliquity       30.9183
	EqAscendNode    63.6759

	AbsMagn         10.9735
	SlopeParam      3.8721
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.633 0.627 0.622)

	Surface
	{
		SurfStyle       0.73443
		OceanStyle      0.0448364
		Randomize      (0.439, 0.773, 0.808)
		colorDistMagn   0.00826144
		colorDistFreq   0.0126632
		detailScale     115.4
		colorConversion true
		snowLevel       2
		tropicLatitude  0.892736
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.454169
		terraceProb     0.413007
		erosion         0
		montesMagn      0.444663
		montesFreq      2.78168
		montesSpiky     0.989273
		montesFraction  0.40285
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0365556
		hillsFraction   0.689362
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.26848
		craterFreq      0.183456
		craterDensity   1.03364
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.507928
		volcanoTemp     1706.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.247, 0.213, 0.174, 0.000)
		colorShelf     (0.253, 0.219, 0.199, 0.000)
		colorBeach     (0.298, 0.257, 0.236, 0.000)
		colorDesert    (0.323, 0.276, 0.230, 0.000)
		colorLowland   (0.355, 0.295, 0.261, 0.000)
		colorUpland    (0.393, 0.357, 0.317, 0.000)
		colorRock      (0.424, 0.389, 0.342, 0.000)
		colorSnow      (0.462, 0.414, 0.361, 1.000)
		BumpHeight      3.80348
		BumpOffset      0.760696
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

	CometTail
	{
		MaxLength   0.544911
		GasToDust   0.25
		Particles   2080
		GasBright   0.30601
		DustBright  0.475053
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   58.5813
		Period          223.57
		Eccentricity    0.806528
		Inclination     33.8842
		AscendingNode   -24.0373
		ArgOfPericenter 173.884
		MeanAnomaly     20.5375
	}
}

Comet	"Japrael System C85"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.6253e-007
	Radius          75.4654
	InertiaMoment   0.397438

	Oblateness      0.0034672

	RotationPeriod  84.943
	Obliquity       344.124
	EqAscendNode    48.2533

	AbsMagn         7.33135
	SlopeParam      4.43752
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.558 0.552 0.545)

	Surface
	{
		SurfStyle       0.805459
		OceanStyle      0.551892
		Randomize      (0.547, -0.031, 0.994)
		colorDistMagn   0.443099
		colorDistFreq   3.38603
		detailScale     2060.71
		colorConversion true
		snowLevel       2
		tropicLatitude  0.875128
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.317066
		terraceProb     0.268202
		erosion         0
		montesMagn      0.461758
		montesFreq      3.35116
		montesSpiky     0.992206
		montesFraction  0.381252
		dunesFraction   0
		hillsMagn       0
		hillsFreq       15.2387
		hillsFraction   0.569824
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242649
		craterFreq      0.227886
		craterDensity   0.966787
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.469332
		volcanoTemp     1571.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.218, 0.188, 0.153, 0.000)
		colorShelf     (0.223, 0.193, 0.174, 0.000)
		colorBeach     (0.262, 0.226, 0.207, 0.000)
		colorDesert    (0.285, 0.243, 0.202, 0.000)
		colorLowland   (0.313, 0.259, 0.229, 0.000)
		colorUpland    (0.346, 0.314, 0.278, 0.000)
		colorRock      (0.374, 0.342, 0.300, 0.000)
		colorSnow      (0.408, 0.364, 0.316, 1.000)
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

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.209885
		DustBright  0.255665
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   50.6295
		Period          179.631
		Eccentricity    0.784605
		Inclination     46.704
		AscendingNode   -151.954
		ArgOfPericenter -171.879
		MeanAnomaly     -50.4648
	}
}

Comet	"Japrael System C86"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            5.00441e-015
	Radius          0.261573
	InertiaMoment   0.399451

	Oblateness      0.00506954

	RotationPeriod  82.0032
	Obliquity       297.33
	EqAscendNode    32.8307

	AbsMagn         2.77824
	SlopeParam      5.04109
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.773 0.770 0.770)

	Surface
	{
		SurfStyle       0.0528189
		OceanStyle      0.659341
		Randomize      (0.626, -0.447, 0.212)
		colorDistMagn   0.354012
		colorDistFreq   4.09647e-005
		detailScale     7.1427
		colorConversion true
		snowLevel       2
		tropicLatitude  0.823685
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.367608
		terraceProb     0.348384
		erosion         0
		montesMagn      0.452596
		montesFreq      2.6224
		montesSpiky     0.976371
		montesFraction  0.773649
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000133112
		hillsFraction   0.384818
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.205494
		craterFreq      0.227308
		craterDensity   1.03778
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.383257
		volcanoTemp     1528.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.309, 0.308, 0.308, 0.000)
		colorShelf     (0.328, 0.327, 0.327, 0.000)
		colorBeach     (0.348, 0.347, 0.346, 0.000)
		colorDesert    (0.367, 0.366, 0.366, 0.000)
		colorLowland   (0.386, 0.385, 0.385, 0.000)
		colorUpland    (0.406, 0.404, 0.404, 0.000)
		colorRock      (0.425, 0.424, 0.423, 0.000)
		colorSnow      (0.444, 0.443, 0.442, 1.000)
		BumpHeight      0.235416
		BumpOffset      0.0470832
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

	CometTail
	{
		MaxLength   0.0965448
		GasToDust   0.25
		Particles   1174
		GasBright   0.00938399
		DustBright  0.940652
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   69.1064
		Period          286.452
		Eccentricity    0.825578
		Inclination     41.8884
		AscendingNode   -67.6804
		ArgOfPericenter 179.206
		MeanAnomaly     -109.606
	}
}

Comet	"Japrael System C87"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            3.87056e-011
	Radius          4.67446
	InertiaMoment   0.398197

	Oblateness      0.00398396

	RotationPeriod  79.2743
	Obliquity       250.535
	EqAscendNode    17.4081

	AbsMagn         10.705
	SlopeParam      5.76122
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.500 0.458 0.399)

	Surface
	{
		SurfStyle       0.487949
		OceanStyle      0.814597
		Randomize      (0.681, -0.774, 0.495)
		colorDistMagn   0.930398
		colorDistFreq   0.0167494
		detailScale     127.644
		colorConversion true
		snowLevel       2
		tropicLatitude  0.944817
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.694286
		terraceProb     0.310632
		erosion         0
		montesMagn      0.64126
		montesFreq      3.92438
		montesSpiky     0.859689
		montesFraction  0.676466
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0459661
		hillsFraction   0.584992
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.211524
		craterFreq      0.212524
		craterDensity   0.876471
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.485031
		volcanoTemp     1785.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.200, 0.183, 0.159, 0.000)
		colorShelf     (0.212, 0.195, 0.169, 0.000)
		colorBeach     (0.225, 0.206, 0.179, 0.000)
		colorDesert    (0.237, 0.217, 0.189, 0.000)
		colorLowland   (0.250, 0.229, 0.199, 0.000)
		colorUpland    (0.262, 0.240, 0.209, 0.000)
		colorRock      (0.275, 0.252, 0.219, 0.000)
		colorSnow      (0.287, 0.263, 0.229, 1.000)
		BumpHeight      4.20701
		BumpOffset      0.841403
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

	CometTail
	{
		MaxLength   0.577737
		GasToDust   0.25
		Particles   2146
		GasBright   0.0437331
		DustBright  0.59079
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   68.2943
		Period          281.418
		Eccentricity    0.876713
		Inclination     -20.9836
		AscendingNode   -87.2032
		ArgOfPericenter 135.155
		MeanAnomaly     -144.301
	}
}

Comet	"Japrael System C88"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            2.99359e-007
	Radius          102.156
	InertiaMoment   0.399876

	Oblateness      0.00577745

	RotationPeriod  76.7143
	Obliquity       203.741
	EqAscendNode    1.9855

	AbsMagn         7.11874
	SlopeParam      6.84848
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.696 0.691 0.688)

	Surface
	{
		SurfStyle       0.515923
		OceanStyle      0.480391
		Randomize      (0.925, -0.815, -0.091)
		colorDistMagn   0.126923
		colorDistFreq   5.55188
		detailScale     2789.53
		colorConversion true
		snowLevel       2
		tropicLatitude  0.639021
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.290483
		terraceProb     0.20554
		erosion         0
		montesMagn      0.522152
		montesFreq      2.58036
		montesSpiky     0.998235
		montesFraction  0.674498
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.4711
		hillsFraction   0.526026
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.202913
		craterFreq      0.320636
		craterDensity   0.929923
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.516334
		volcanoTemp     1648.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.271, 0.235, 0.193, 0.000)
		colorShelf     (0.278, 0.242, 0.220, 0.000)
		colorBeach     (0.327, 0.283, 0.262, 0.000)
		colorDesert    (0.355, 0.304, 0.255, 0.000)
		colorLowland   (0.390, 0.325, 0.289, 0.000)
		colorUpland    (0.431, 0.394, 0.351, 0.000)
		colorRock      (0.466, 0.428, 0.379, 0.000)
		colorSnow      (0.508, 0.456, 0.399, 1.000)
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

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.040823
		DustBright  0.278187
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   55.8718
		Period          208.24
		Eccentricity    0.733672
		Inclination     162.809
		AscendingNode   -152.235
		ArgOfPericenter 46.0165
		MeanAnomaly     18.7013
	}
}

Comet	"Japrael System C89"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            9.2175e-015
	Radius          0.289544
	InertiaMoment   0.398757

	Oblateness      0.00453648

	RotationPeriod  74.2919
	Obliquity       156.947
	EqAscendNode    346.563

	AbsMagn         2.24366
	SlopeParam      2.27018
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.463 0.459 0.458)

	Surface
	{
		SurfStyle       0.755239
		OceanStyle      0.33656
		Randomize      (-0.443, 0.812, -0.546)
		colorDistMagn   0.651058
		colorDistFreq   4.05299e-005
		detailScale     7.90647
		colorConversion true
		snowLevel       2
		tropicLatitude  0.522461
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.43757
		terraceProb     0.377781
		erosion         0
		montesMagn      0.238959
		montesFreq      2.67572
		montesSpiky     0.98417
		montesFraction  0.687067
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000148533
		hillsFraction   0.739161
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.257829
		craterFreq      0.177086
		craterDensity   0.935144
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.496504
		volcanoTemp     1718.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.181, 0.156, 0.128, 0.000)
		colorShelf     (0.185, 0.161, 0.146, 0.000)
		colorBeach     (0.218, 0.188, 0.174, 0.000)
		colorDesert    (0.236, 0.202, 0.169, 0.000)
		colorLowland   (0.259, 0.216, 0.192, 0.000)
		colorUpland    (0.287, 0.262, 0.233, 0.000)
		colorRock      (0.310, 0.285, 0.252, 0.000)
		colorSnow      (0.338, 0.303, 0.265, 1.000)
		BumpHeight      0.260589
		BumpOffset      0.0521179
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

	CometTail
	{
		MaxLength   0.129371
		GasToDust   0.25
		Particles   1241
		GasBright   0.150264
		DustBright  0.653232
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   120.6
		Period          660.384
		Eccentricity    0.917311
		Inclination     52.4986
		AscendingNode   -19.688
		ArgOfPericenter -5.49925
		MeanAnomaly     170.352
	}
}

Comet	"Japrael System C90"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            7.12908e-011
	Radius          6.32329
	InertiaMoment   0.396871

	Oblateness      0.00646155

	RotationPeriod  71.9831
	Obliquity       110.153
	EqAscendNode    331.14

	AbsMagn         10.4483
	SlopeParam      2.98339
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.742 0.740 0.738)

	Surface
	{
		SurfStyle       0.224263
		OceanStyle      0.825728
		Randomize      (0.791, -0.148, 0.945)
		colorDistMagn   0.920561
		colorDistFreq   0.0252981
		detailScale     172.668
		colorConversion true
		snowLevel       2
		tropicLatitude  0.991235
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.381616
		terraceProb     0.106995
		erosion         0
		montesMagn      0.522938
		montesFreq      2.36685
		montesSpiky     0.926456
		montesFraction  0.616581
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.139133
		hillsFraction   0.656126
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245343
		craterFreq      0.271727
		craterDensity   0.827069
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.439807
		volcanoTemp     1563.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.297, 0.296, 0.295, 0.000)
		colorShelf     (0.315, 0.314, 0.314, 0.000)
		colorBeach     (0.334, 0.333, 0.332, 0.000)
		colorDesert    (0.353, 0.351, 0.351, 0.000)
		colorLowland   (0.371, 0.370, 0.369, 0.000)
		colorUpland    (0.390, 0.388, 0.388, 0.000)
		colorRock      (0.408, 0.407, 0.406, 0.000)
		colorSnow      (0.427, 0.425, 0.424, 1.000)
		BumpHeight      5.69096
		BumpOffset      1.13819
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

	CometTail
	{
		MaxLength   0.610563
		GasToDust   0.25
		Particles   2213
		GasBright   0.120072
		DustBright  0.36791
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   100.764
		Period          504.353
		Eccentricity    0.907975
		Inclination     147.014
		AscendingNode   34.5243
		ArgOfPericenter -139.745
		MeanAnomaly     93.559
	}
}

Comet	"Japrael System C91"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            5.51383e-007
	Radius          113.161
	InertiaMoment   0.399233

	Oblateness      0.00514231

	RotationPeriod  69.769
	Obliquity       63.3583
	EqAscendNode    315.718

	AbsMagn         6.9036
	SlopeParam      3.58442
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.436 0.434 0.432)

	Surface
	{
		SurfStyle       0.579108
		OceanStyle      0.184065
		Randomize      (-0.986, 0.980, 0.119)
		colorDistMagn   0.778703
		colorDistFreq   6.32019
		detailScale     3090.05
		colorConversion true
		snowLevel       2
		tropicLatitude  0.953489
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.69569
		terraceProb     0.421112
		erosion         0
		montesMagn      0.255071
		montesFreq      3.87734
		montesSpiky     0.998173
		montesFraction  0.486379
		dunesFraction   0
		hillsMagn       0
		hillsFreq       28.6568
		hillsFraction   0.522972
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251894
		craterFreq      0.535124
		craterDensity   0.834179
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.523766
		volcanoTemp     1021.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.170, 0.147, 0.121, 0.000)
		colorShelf     (0.175, 0.152, 0.138, 0.000)
		colorBeach     (0.205, 0.178, 0.164, 0.000)
		colorDesert    (0.223, 0.191, 0.160, 0.000)
		colorLowland   (0.244, 0.204, 0.181, 0.000)
		colorUpland    (0.271, 0.247, 0.220, 0.000)
		colorRock      (0.292, 0.269, 0.238, 0.000)
		colorSnow      (0.319, 0.286, 0.250, 1.000)
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

	CometTail
	{
		MaxLength   1
		GasToDust   0.25
		Particles   3000
		GasBright   0.296704
		DustBright  0.675765
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   108.975
		Period          567.235
		Eccentricity    0.936367
		Inclination     134.115
		AscendingNode   162.966
		ArgOfPericenter 150.891
		MeanAnomaly     5.30454
	}
}

Comet	"Japrael System C92"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.69775e-014
	Radius          0.391414
	InertiaMoment   0.397861

	Oblateness      0.00731666

	RotationPeriod  67.6343
	Obliquity       16.564
	EqAscendNode    300.295

	AbsMagn         1.58029
	SlopeParam      4.1494
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.551 0.545 0.538)

	Surface
	{
		SurfStyle       0.999948
		OceanStyle      0.899966
		Randomize      (0.514, 0.965, -0.448)
		colorDistMagn   0.573603
		colorDistFreq   0.000105532
		detailScale     10.6882
		colorConversion true
		snowLevel       2
		tropicLatitude  0.997365
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.477089
		terraceProb     0.349421
		erosion         0
		montesMagn      0.503297
		montesFreq      3.32181
		montesSpiky     0.960319
		montesFraction  0.482371
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000429462
		hillsFraction   0.696473
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237816
		craterFreq      0.235914
		craterDensity   0.790448
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53176
		volcanoTemp     1537.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.187, 0.191, 0.215, 0.050)
		colorShelf     (0.220, 0.224, 0.247, 0.040)
		colorBeach     (0.253, 0.256, 0.280, 0.030)
		colorDesert    (0.286, 0.289, 0.317, 0.020)
		colorLowland   (0.320, 0.322, 0.350, 0.030)
		colorUpland    (0.353, 0.355, 0.382, 0.050)
		colorRock      (0.386, 0.387, 0.425, 0.020)
		colorSnow      (0.386, 0.387, 0.425, 1.000)
		BumpHeight      0.352273
		BumpOffset      0.0704545
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

	CometTail
	{
		MaxLength   0.162197
		GasToDust   0.25
		Particles   1307
		GasBright   0.23923
		DustBright  0.417726
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   68.5902
		Period          283.249
		Eccentricity    0.881217
		Inclination     -98.4013
		AscendingNode   41.0779
		ArgOfPericenter 162.892
		MeanAnomaly     -52.7716
	}
}

Comet	"Japrael System C93"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.31309e-010
	Radius          7.00936
	InertiaMoment   0.399668

	Oblateness      0.00582011

	RotationPeriod  65.5666
	Obliquity       329.77
	EqAscendNode    284.873

	AbsMagn         10.2012
	SlopeParam      4.72682
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.826 0.783 0.709)

	Surface
	{
		SurfStyle       0.0263175
		OceanStyle      0.391431
		Randomize      (0.470, 0.711, 0.643)
		colorDistMagn   0.973525
		colorDistFreq   0.00271255
		detailScale     191.402
		colorConversion true
		snowLevel       2
		tropicLatitude  0.632879
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.714705
		terraceProb     0.485614
		erosion         0
		montesMagn      0.673331
		montesFreq      2.93391
		montesSpiky     0.854629
		montesFraction  0.8224
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.102963
		hillsFraction   0.593196
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.251802
		craterFreq      0.208071
		craterDensity   1.09815
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.501287
		volcanoTemp     1594.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.330, 0.313, 0.284, 0.000)
		colorShelf     (0.351, 0.333, 0.301, 0.000)
		colorBeach     (0.372, 0.352, 0.319, 0.000)
		colorDesert    (0.392, 0.372, 0.337, 0.000)
		colorLowland   (0.413, 0.391, 0.355, 0.000)
		colorUpland    (0.434, 0.411, 0.372, 0.000)
		colorRock      (0.454, 0.431, 0.390, 0.000)
		colorSnow      (0.475, 0.450, 0.408, 1.000)
		BumpHeight      6.30842
		BumpOffset      1.26168
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

	CometTail
	{
		MaxLength   0.643389
		GasToDust   0.25
		Particles   2279
		GasBright   0.144496
		DustBright  0.196946
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   102.889
		Period          520.392
		Eccentricity    0.885036
		Inclination     18.6941
		AscendingNode   -105.887
		ArgOfPericenter -154.464
		MeanAnomaly     -24.6796
	}
}

Comet	"Japrael System C94"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            4.0431e-018
	Radius          0.0242293
	InertiaMoment   0.398495

	Oblateness      0.00827275

	RotationPeriod  63.5553
	Obliquity       282.975
	EqAscendNode    269.45

	AbsMagn         6.68525
	SlopeParam      5.3738
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.404 0.401 0.398)

	Surface
	{
		SurfStyle       0.875866
		OceanStyle      0.535915
		Randomize      (0.809, 0.115, 0.893)
		colorDistMagn   0.0804912
		colorDistFreq   1.68088e-007
		detailScale     0.661622
		colorConversion true
		snowLevel       2
		tropicLatitude  0.987538
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.364588
		terraceProb     0.155007
		erosion         0
		montesMagn      0.496763
		montesFreq      3.55079
		montesSpiky     0.943761
		montesFraction  0.516634
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.2033e-006
		hillsFraction   0.512162
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.239502
		craterFreq      0.187035
		craterDensity   0.994657
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.532467
		volcanoTemp     1435.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.137, 0.140, 0.159, 0.050)
		colorShelf     (0.162, 0.164, 0.183, 0.040)
		colorBeach     (0.186, 0.188, 0.207, 0.030)
		colorDesert    (0.210, 0.212, 0.235, 0.020)
		colorLowland   (0.235, 0.236, 0.259, 0.030)
		colorUpland    (0.259, 0.260, 0.283, 0.050)
		colorRock      (0.283, 0.285, 0.315, 0.020)
		colorSnow      (0.283, 0.285, 0.315, 1.000)
		BumpHeight      0.0218064
		BumpOffset      0.00436127
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.398296
		DustBright  0.427633
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   105.972
		Period          543.956
		Eccentricity    0.931593
		Inclination     -174.216
		AscendingNode   132.235
		ArgOfPericenter -49.0556
		MeanAnomaly     -150.664
	}
}

Comet	"Japrael System C95"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            3.12704e-014
	Radius          0.434168
	InertiaMoment   0.39579

	Oblateness      0.00648695

	RotationPeriod  61.5915
	Obliquity       236.181
	EqAscendNode    254.027

	AbsMagn         0.670426
	SlopeParam      6.2154
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.557 0.552 0.543)

	Surface
	{
		SurfStyle       0.847158
		OceanStyle      0.919759
		Randomize      (-0.370, -0.832, 0.623)
		colorDistMagn   0.757935
		colorDistFreq   0.000118871
		detailScale     11.8557
		colorConversion true
		snowLevel       2
		tropicLatitude  0.834977
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.448249
		terraceProb     0.294944
		erosion         0
		montesMagn      0.628272
		montesFreq      2.81764
		montesSpiky     0.931613
		montesFraction  0.847039
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000421617
		hillsFraction   0.627259
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.234527
		craterFreq      0.177726
		craterDensity   0.914678
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.576799
		volcanoTemp     1662.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.217, 0.188, 0.152, 0.000)
		colorShelf     (0.223, 0.193, 0.174, 0.000)
		colorBeach     (0.262, 0.226, 0.206, 0.000)
		colorDesert    (0.284, 0.243, 0.201, 0.000)
		colorLowland   (0.312, 0.259, 0.228, 0.000)
		colorUpland    (0.345, 0.315, 0.277, 0.000)
		colorRock      (0.373, 0.342, 0.299, 0.000)
		colorSnow      (0.406, 0.364, 0.315, 1.000)
		BumpHeight      0.390751
		BumpOffset      0.0781503
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

	CometTail
	{
		MaxLength   0.195023
		GasToDust   0.25
		Particles   1373
		GasBright   0.0210724
		DustBright  0.489343
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   68.2455
		Period          281.116
		Eccentricity    0.845882
		Inclination     0.568303
		AscendingNode   -40.5882
		ArgOfPericenter -176.61
		MeanAnomaly     -107.434
	}
}

Comet	"Japrael System C96"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            2.41854e-010
	Radius          9.46359
	InertiaMoment   0.399005

	Oblateness      0.00936736

	RotationPeriod  59.6673
	Obliquity       189.387
	EqAscendNode    238.605

	AbsMagn         9.96231
	SlopeParam      8.03126
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.435 0.429 0.422)

	Surface
	{
		SurfStyle       0.359429
		OceanStyle      0.0910052
		Randomize      (-0.946, -0.963, 0.146)
		colorDistMagn   0.931972
		colorDistFreq   0.0360869
		detailScale     258.419
		colorConversion true
		snowLevel       2
		tropicLatitude  0.165013
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.414256
		terraceProb     0.210643
		erosion         0
		montesMagn      0.523585
		montesFreq      3.51555
		montesSpiky     0.902756
		montesFraction  0.647614
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.238951
		hillsFraction   0.507788
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.2596
		craterFreq      0.217512
		craterDensity   0.90516
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.448746
		volcanoTemp     1280.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.174, 0.172, 0.169, 0.000)
		colorShelf     (0.185, 0.182, 0.180, 0.000)
		colorBeach     (0.196, 0.193, 0.190, 0.000)
		colorDesert    (0.207, 0.204, 0.201, 0.000)
		colorLowland   (0.218, 0.215, 0.211, 0.000)
		colorUpland    (0.228, 0.225, 0.222, 0.000)
		colorRock      (0.239, 0.236, 0.232, 0.000)
		colorSnow      (0.250, 0.247, 0.243, 1.000)
		BumpHeight      8.51723
		BumpOffset      1.70345
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

	CometTail
	{
		MaxLength   0.676215
		GasToDust   0.25
		Particles   2345
		GasBright   0.0998186
		DustBright  0.895084
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   92.2046
		Period          441.472
		Eccentricity    0.909041
		Inclination     -1.19969
		AscendingNode   91.714
		ArgOfPericenter -169.007
		MeanAnomaly     102.579
	}
}

Comet	"Japrael System C97"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            7.44686e-018
	Radius          0.0268929
	InertiaMoment   0.39745

	Oblateness      0.0074027

	RotationPeriod  57.7759
	Obliquity       142.592
	EqAscendNode    223.182

	AbsMagn         6.4629
	SlopeParam      2.64354
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.583 0.580 0.576)

	Surface
	{
		SurfStyle       0.182484
		OceanStyle      0.023173
		Randomize      (0.354, 0.054, -0.245)
		colorDistMagn   0.921525
		colorDistFreq   3.05152e-007
		detailScale     0.734356
		colorConversion true
		snowLevel       2
		tropicLatitude  0.999593
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.439279
		terraceProb     0.533672
		erosion         0
		montesMagn      0.431891
		montesFreq      2.68205
		montesSpiky     0.987025
		montesFraction  0.641926
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.30788e-006
		hillsFraction   0.648864
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.249918
		craterFreq      0.241993
		craterDensity   0.837267
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.603954
		volcanoTemp     1443.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.233, 0.232, 0.230, 0.000)
		colorShelf     (0.248, 0.246, 0.245, 0.000)
		colorBeach     (0.262, 0.261, 0.259, 0.000)
		colorDesert    (0.277, 0.275, 0.274, 0.000)
		colorLowland   (0.291, 0.290, 0.288, 0.000)
		colorUpland    (0.306, 0.304, 0.302, 0.000)
		colorRock      (0.321, 0.319, 0.317, 0.000)
		colorSnow      (0.335, 0.333, 0.331, 1.000)
		BumpHeight      0.0242036
		BumpOffset      0.00484073
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.108278
		DustBright  0.571111
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   90.0304
		Period          425.95
		Eccentricity    0.970973
		Inclination     -62.2846
		AscendingNode   50.6596
		ArgOfPericenter 52.915
		MeanAnomaly     83.5682
	}
}

Comet	"Japrael System C98"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            5.75962e-014
	Radius          0.585843
	InertiaMoment   0.399457

	Oblateness      0.0106455

	RotationPeriod  55.9111
	Obliquity       95.7982
	EqAscendNode    207.76

	AbsMagn         -0.948625
	SlopeParam      3.28783
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.472 0.467 0.463)

	Surface
	{
		SurfStyle       0.143348
		OceanStyle      0.178624
		Randomize      (-0.613, 0.533, -0.577)
		colorDistMagn   0.984303
		colorDistFreq   0.000292941
		detailScale     15.9974
		colorConversion true
		snowLevel       2
		tropicLatitude  0.915885
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.485729
		terraceProb     0.291887
		erosion         0
		montesMagn      0.449979
		montesFreq      2.59827
		montesSpiky     0.944222
		montesFraction  0.370846
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.000937912
		hillsFraction   0.668356
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227986
		craterFreq      0.163848
		craterDensity   0.854354
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.478921
		volcanoTemp     1779.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.189, 0.187, 0.185, 0.000)
		colorShelf     (0.201, 0.198, 0.197, 0.000)
		colorBeach     (0.212, 0.210, 0.208, 0.000)
		colorDesert    (0.224, 0.222, 0.220, 0.000)
		colorLowland   (0.236, 0.233, 0.232, 0.000)
		colorUpland    (0.248, 0.245, 0.243, 0.000)
		colorRock      (0.260, 0.257, 0.255, 0.000)
		colorSnow      (0.271, 0.268, 0.266, 1.000)
		BumpHeight      0.527259
		BumpOffset      0.105452
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

	CometTail
	{
		MaxLength   0.227849
		GasToDust   0.25
		Particles   1440
		GasBright   0.0794778
		DustBright  0.284397
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   70.2946
		Period          293.871
		Eccentricity    0.922543
		Inclination     20.2823
		AscendingNode   27.22
		ArgOfPericenter -114.803
		MeanAnomaly     -59.0753
	}
}

Comet	"Japrael System C99"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            4.45465e-010
	Radius          10.5103
	InertiaMoment   0.398205

	Oblateness      0.00845938

	RotationPeriod  54.0674
	Obliquity       49.0039
	EqAscendNode    192.337

	AbsMagn         9.7302
	SlopeParam      3.86437
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.736 0.699 0.651)

	Surface
	{
		SurfStyle       0.822946
		OceanStyle      0.848345
		Randomize      (0.632, 0.033, -0.004)
		colorDistMagn   0.647334
		colorDistFreq   0.0388358
		detailScale     287.002
		colorConversion true
		snowLevel       2
		tropicLatitude  0.677422
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.360751
		terraceProb     0.28262
		erosion         0
		montesMagn      0.489437
		montesFreq      3.44172
		montesSpiky     0.903328
		montesFraction  0.428027
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.278167
		hillsFraction   0.537258
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.220657
		craterFreq      0.26918
		craterDensity   0.807924
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.576074
		volcanoTemp     1639.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.287, 0.238, 0.182, 0.000)
		colorShelf     (0.294, 0.244, 0.208, 0.000)
		colorBeach     (0.346, 0.286, 0.247, 0.000)
		colorDesert    (0.375, 0.307, 0.241, 0.000)
		colorLowland   (0.412, 0.328, 0.273, 0.000)
		colorUpland    (0.456, 0.398, 0.332, 0.000)
		colorRock      (0.493, 0.433, 0.358, 0.000)
		colorSnow      (0.537, 0.461, 0.377, 1.000)
		BumpHeight      9.45931
		BumpOffset      1.89186
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

	CometTail
	{
		MaxLength   0.709041
		GasToDust   0.25
		Particles   2412
		GasBright   0.235391
		DustBright  0.61297
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   80.1649
		Period          357.891
		Eccentricity    0.870793
		Inclination     48.3987
		AscendingNode   122.115
		ArgOfPericenter 78.3457
		MeanAnomaly     -151.338
	}
}

Comet	"Japrael System C100"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.37162e-017
	Radius          0.0362675
	InertiaMoment   0.399882

	Oblateness      0.0121682

	RotationPeriod  52.2394
	Obliquity       2.20959
	EqAscendNode    176.914

	AbsMagn         6.2357
	SlopeParam      4.42962
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.804 0.775 0.755)

	Surface
	{
		SurfStyle       0.515037
		OceanStyle      0.942505
		Randomize      (0.759, -0.943, -0.869)
		colorDistMagn   0.312147
		colorDistFreq   1.80383e-007
		detailScale     0.990343
		colorConversion true
		snowLevel       2
		tropicLatitude  0.697541
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.740049
		terraceProb     0.302719
		erosion         0
		montesMagn      0.459501
		montesFreq      2.69761
		montesSpiky     0.940893
		montesFraction  0.586832
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.10357e-006
		hillsFraction   0.656146
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.217594
		craterFreq      0.199766
		craterDensity   0.998167
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.510079
		volcanoTemp     1453.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.313, 0.263, 0.211, 0.000)
		colorShelf     (0.321, 0.271, 0.242, 0.000)
		colorBeach     (0.378, 0.318, 0.287, 0.000)
		colorDesert    (0.410, 0.341, 0.279, 0.000)
		colorLowland   (0.450, 0.364, 0.317, 0.000)
		colorUpland    (0.498, 0.441, 0.385, 0.000)
		colorRock      (0.538, 0.480, 0.415, 0.000)
		colorSnow      (0.587, 0.511, 0.438, 1.000)
		BumpHeight      0.0326407
		BumpOffset      0.00652814
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.179309
		DustBright  0.353539
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   77.8022
		Period          342.186
		Eccentricity    0.857434
		Inclination     -136.843
		AscendingNode   -61.977
		ArgOfPericenter 169.81
		MeanAnomaly     50.316
	}
}

Comet	"Japrael System C101"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.06085e-013
	Radius          0.65102
	InertiaMoment   0.398763

	Oblateness      0.00972673

	RotationPeriod  50.4223
	Obliquity       315.415
	EqAscendNode    161.492

	AbsMagn         16.6048
	SlopeParam      5.03227
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.746 0.743 0.739)

	Surface
	{
		SurfStyle       0.388711
		OceanStyle      0.742532
		Randomize      (0.875, -0.162, -0.165)
		colorDistMagn   0.450209
		colorDistFreq   0.000254634
		detailScale     17.7772
		colorConversion true
		snowLevel       2
		tropicLatitude  0.888746
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.437045
		terraceProb     0.14037
		erosion         0
		montesMagn      0.422075
		montesFreq      3.04826
		montesSpiky     0.996124
		montesFraction  0.726995
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00106372
		hillsFraction   0.95484
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.237396
		craterFreq      0.242841
		craterDensity   0.782478
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.560002
		volcanoTemp     1617.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.299, 0.297, 0.296, 0.000)
		colorShelf     (0.317, 0.316, 0.314, 0.000)
		colorBeach     (0.336, 0.334, 0.333, 0.000)
		colorDesert    (0.355, 0.353, 0.351, 0.000)
		colorLowland   (0.373, 0.371, 0.369, 0.000)
		colorUpland    (0.392, 0.390, 0.388, 0.000)
		colorRock      (0.411, 0.408, 0.406, 0.000)
		colorSnow      (0.429, 0.427, 0.425, 1.000)
		BumpHeight      0.585918
		BumpOffset      0.117184
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

	CometTail
	{
		MaxLength   0.260675
		GasToDust   0.25
		Particles   1506
		GasBright   0.0859682
		DustBright  0.131367
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   72.4589
		Period          307.548
		Eccentricity    0.909521
		Inclination     -159.692
		AscendingNode   149.329
		ArgOfPericenter -155.542
		MeanAnomaly     -96.0517
	}
}

Comet	"Japrael System C102"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            8.2049e-010
	Radius          14.1665
	InertiaMoment   0.396889

	Oblateness      0.0138442

	RotationPeriod  48.6113
	Obliquity       268.621
	EqAscendNode    146.069

	AbsMagn         9.50377
	SlopeParam      5.74987
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.547 0.504 0.428)

	Surface
	{
		SurfStyle       0.146895
		OceanStyle      0.68092
		Randomize      (-0.171, 0.888, 0.080)
		colorDistMagn   0.495568
		colorDistFreq   0.168874
		detailScale     386.839
		colorConversion true
		snowLevel       2
		tropicLatitude  0.625476
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.458797
		terraceProb     0.100061
		erosion         0
		montesMagn      0.480084
		montesFreq      3.21843
		montesSpiky     0.947576
		montesFraction  0.308494
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.478589
		hillsFraction   0.578293
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.242086
		craterFreq      0.202494
		craterDensity   0.985413
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504644
		volcanoTemp     1194.98
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.219, 0.202, 0.171, 0.000)
		colorShelf     (0.233, 0.214, 0.182, 0.000)
		colorBeach     (0.246, 0.227, 0.193, 0.000)
		colorDesert    (0.260, 0.239, 0.203, 0.000)
		colorLowland   (0.274, 0.252, 0.214, 0.000)
		colorUpland    (0.287, 0.264, 0.225, 0.000)
		colorRock      (0.301, 0.277, 0.235, 0.000)
		colorSnow      (0.315, 0.290, 0.246, 1.000)
		BumpHeight      12.7498
		BumpOffset      2.54997
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

	CometTail
	{
		MaxLength   0.741867
		GasToDust   0.25
		Particles   2478
		GasBright   0.319049
		DustBright  0.382772
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   97.5928
		Period          480.73
		Eccentricity    0.888835
		Inclination     -60.9626
		AscendingNode   -154.964
		ArgOfPericenter -113.806
		MeanAnomaly     71.8744
	}
}

Comet	"Japrael System C103"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            2.52636e-017
	Radius          0.0403247
	InertiaMoment   0.399238

	Oblateness      0.0112862

	RotationPeriod  46.8019
	Obliquity       221.827
	EqAscendNode    130.647

	AbsMagn         6.00265
	SlopeParam      6.82737
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.729 0.619 0.505)

	Surface
	{
		SurfStyle       0.0528399
		OceanStyle      0.558825
		Randomize      (-0.914, 0.202, -0.299)
		colorDistMagn   0.465329
		colorDistFreq   6.82548e-007
		detailScale     1.10113
		colorConversion true
		snowLevel       2
		tropicLatitude  0.773759
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.424954
		terraceProb     0.42821
		erosion         0
		montesMagn      0.389164
		montesFreq      2.75239
		montesSpiky     0.994969
		montesFraction  0.141225
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.99864e-006
		hillsFraction   0.634152
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.231591
		craterFreq      0.199651
		craterDensity   0.837814
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.498284
		volcanoTemp     1289.78
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.292, 0.248, 0.202, 0.000)
		colorShelf     (0.310, 0.263, 0.215, 0.000)
		colorBeach     (0.328, 0.278, 0.227, 0.000)
		colorDesert    (0.346, 0.294, 0.240, 0.000)
		colorLowland   (0.364, 0.309, 0.253, 0.000)
		colorUpland    (0.383, 0.325, 0.265, 0.000)
		colorRock      (0.401, 0.340, 0.278, 0.000)
		colorSnow      (0.419, 0.356, 0.290, 1.000)
		BumpHeight      0.0362922
		BumpOffset      0.00725845
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.00527188
		DustBright  0.381036
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   95.9483
		Period          468.631
		Eccentricity    0.894947
		Inclination     -147.801
		AscendingNode   90.4709
		ArgOfPericenter -86.169
		MeanAnomaly     165.745
	}
}

Comet	"Japrael System C104"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.95395e-013
	Radius          0.877033
	InertiaMoment   0.39787

	Oblateness      0.0161637

	RotationPeriod  44.9895
	Obliquity       175.032
	EqAscendNode    115.224

	AbsMagn         15.1694
	SlopeParam      2.25893
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.693 0.608 0.494)

	Surface
	{
		SurfStyle       0.794428
		OceanStyle      0.10889
		Randomize      (0.904, -0.142, -0.524)
		colorDistMagn   0.933571
		colorDistFreq   0.000422295
		detailScale     23.9488
		colorConversion true
		snowLevel       2
		tropicLatitude  0.330217
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.366976
		terraceProb     0.276626
		erosion         0
		montesMagn      0.484876
		montesFreq      3.31714
		montesSpiky     0.943243
		montesFraction  0.757469
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.002159
		hillsFraction   0.816416
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.230374
		craterFreq      0.193399
		craterDensity   0.913934
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.415828
		volcanoTemp     1611.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.270, 0.207, 0.138, 0.000)
		colorShelf     (0.277, 0.213, 0.158, 0.000)
		colorBeach     (0.326, 0.249, 0.188, 0.000)
		colorDesert    (0.353, 0.267, 0.183, 0.000)
		colorLowland   (0.388, 0.286, 0.207, 0.000)
		colorUpland    (0.430, 0.346, 0.252, 0.000)
		colorRock      (0.464, 0.377, 0.271, 0.000)
		colorSnow      (0.506, 0.401, 0.286, 1.000)
		BumpHeight      0.78933
		BumpOffset      0.157866
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

	CometTail
	{
		MaxLength   0.293501
		GasToDust   0.25
		Particles   1572
		GasBright   0.0632999
		DustBright  0.807495
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   81.7876
		Period          368.813
		Eccentricity    0.833569
		Inclination     16.1086
		AscendingNode   123.394
		ArgOfPericenter -95.6599
		MeanAnomaly     87.6025
	}
}

Comet	"Japrael System C105"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            1.51124e-009
	Radius          15.7597
	InertiaMoment   0.399674

	Oblateness      0.0132593

	RotationPeriod  43.1694
	Obliquity       128.238
	EqAscendNode    99.8015

	AbsMagn         9.28207
	SlopeParam      2.9746
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.430 0.425 0.419)

	Surface
	{
		SurfStyle       0.319178
		OceanStyle      0.287336
		Randomize      (-0.984, -0.133, -0.711)
		colorDistMagn   0.353807
		colorDistFreq   0.118026
		detailScale     430.344
		colorConversion true
		snowLevel       2
		tropicLatitude  0.851654
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.45986
		terraceProb     0.472578
		erosion         0
		montesMagn      0.445989
		montesFreq      3.21876
		montesSpiky     0.922932
		montesFraction  0.356038
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.249592
		hillsFraction   0.745276
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.227529
		craterFreq      0.273047
		craterDensity   0.938265
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.466604
		volcanoTemp     1244.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.172, 0.170, 0.168, 0.000)
		colorShelf     (0.183, 0.181, 0.178, 0.000)
		colorBeach     (0.193, 0.191, 0.189, 0.000)
		colorDesert    (0.204, 0.202, 0.199, 0.000)
		colorLowland   (0.215, 0.213, 0.210, 0.000)
		colorUpland    (0.226, 0.223, 0.220, 0.000)
		colorRock      (0.236, 0.234, 0.231, 0.000)
		colorSnow      (0.247, 0.244, 0.241, 1.000)
		BumpHeight      14.1837
		BumpOffset      2.83674
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

	CometTail
	{
		MaxLength   0.774693
		GasToDust   0.25
		Particles   2544
		GasBright   0.0731513
		DustBright  0.48213
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   99.0611
		Period          491.62
		Eccentricity    0.886007
		Inclination     88.0368
		AscendingNode   50.1596
		ArgOfPericenter -3.38281
		MeanAnomaly     77.5403
	}
}

Comet	"Japrael System C106"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            4.65322e-017
	Radius          0.0542973
	InertiaMoment   0.398502

	Oblateness      0.0191234

	RotationPeriod  41.3368
	Obliquity       81.4438
	EqAscendNode    84.3789

	AbsMagn         5.76261
	SlopeParam      3.57654
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.583 0.580 0.577)

	Surface
	{
		SurfStyle       0.750505
		OceanStyle      0.223371
		Randomize      (0.567, 0.376, 0.515)
		colorDistMagn   0.907798
		colorDistFreq   4.94314e-007
		detailScale     1.48268
		colorConversion true
		snowLevel       2
		tropicLatitude  0.865795
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.638133
		terraceProb     0.178571
		erosion         0
		montesMagn      0.369473
		montesFreq      2.17663
		montesSpiky     0.96464
		montesFraction  0.539129
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.5069e-006
		hillsFraction   0.758182
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.245052
		craterFreq      0.22893
		craterDensity   0.826408
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.468513
		volcanoTemp     1540.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.227, 0.197, 0.162, 0.000)
		colorShelf     (0.233, 0.203, 0.185, 0.000)
		colorBeach     (0.274, 0.238, 0.219, 0.000)
		colorDesert    (0.297, 0.255, 0.214, 0.000)
		colorLowland   (0.326, 0.273, 0.242, 0.000)
		colorUpland    (0.361, 0.331, 0.294, 0.000)
		colorRock      (0.391, 0.360, 0.318, 0.000)
		colorSnow      (0.426, 0.383, 0.335, 1.000)
		BumpHeight      0.0488676
		BumpOffset      0.00977352
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.0457435
		DustBright  0.194024
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   93.4104
		Period          450.161
		Eccentricity    0.86147
		Inclination     -130.477
		AscendingNode   -122.47
		ArgOfPericenter -1.12342
		MeanAnomaly     -31.4126
	}
}

Comet	"Japrael System C107"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            3.59893e-013
	Radius          0.97616
	InertiaMoment   0.395837

	Oblateness      0.0155884

	RotationPeriod  39.4868
	Obliquity       34.6495
	EqAscendNode    68.9563

	AbsMagn         14.3098
	SlopeParam      4.14167
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.469 0.461 0.457)

	Surface
	{
		SurfStyle       0.698646
		OceanStyle      0.170171
		Randomize      (-0.716, 0.346, 0.793)
		colorDistMagn   0.934916
		colorDistFreq   0.000550754
		detailScale     26.6557
		colorConversion true
		snowLevel       2
		tropicLatitude  0.584782
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.545794
		terraceProb     0.150407
		erosion         0
		montesMagn      0.520921
		montesFreq      2.8078
		montesSpiky     0.881417
		montesFraction  0.478656
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00149017
		hillsFraction   0.701102
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.226572
		craterFreq      0.265503
		craterDensity   0.969936
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.504094
		volcanoTemp     1794.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.183, 0.157, 0.128, 0.000)
		colorShelf     (0.188, 0.161, 0.146, 0.000)
		colorBeach     (0.221, 0.189, 0.173, 0.000)
		colorDesert    (0.239, 0.203, 0.169, 0.000)
		colorLowland   (0.263, 0.217, 0.192, 0.000)
		colorUpland    (0.291, 0.263, 0.233, 0.000)
		colorRock      (0.314, 0.286, 0.251, 0.000)
		colorSnow      (0.343, 0.305, 0.265, 1.000)
		BumpHeight      0.878544
		BumpOffset      0.175709
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

	CometTail
	{
		MaxLength   0.326326
		GasToDust   0.25
		Particles   1639
		GasBright   0.180939
		DustBright  0.543315
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   121.318
		Period          666.288
		Eccentricity    0.969455
		Inclination     -176.367
		AscendingNode   -74.2114
		ArgOfPericenter 112.804
		MeanAnomaly     39.4459
	}
}

Comet	"Japrael System C108"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            2.78352e-009
	Radius          21.2104
	InertiaMoment   0.399011

	Oblateness      0.0230589

	RotationPeriod  37.614
	Obliquity       347.855
	EqAscendNode    53.5337

	AbsMagn         9.06424
	SlopeParam      4.71858
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.495 0.439 0.398)

	Surface
	{
		SurfStyle       0.264336
		OceanStyle      0.920967
		Randomize      (0.851, -0.715, -0.735)
		colorDistMagn   0.344905
		colorDistFreq   0.207901
		detailScale     579.186
		colorConversion true
		snowLevel       2
		tropicLatitude  0.828007
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.397514
		terraceProb     0.277936
		erosion         0
		montesMagn      0.419248
		montesFreq      2.2976
		montesSpiky     0.934873
		montesFraction  0.633982
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.875756
		hillsFraction   0.620875
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.221231
		craterFreq      0.225986
		craterDensity   0.930497
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.525565
		volcanoTemp     1594.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.198, 0.176, 0.159, 0.000)
		colorShelf     (0.210, 0.187, 0.169, 0.000)
		colorBeach     (0.223, 0.198, 0.179, 0.000)
		colorDesert    (0.235, 0.209, 0.189, 0.000)
		colorLowland   (0.248, 0.220, 0.199, 0.000)
		colorUpland    (0.260, 0.231, 0.209, 0.000)
		colorRock      (0.272, 0.242, 0.219, 0.000)
		colorSnow      (0.285, 0.253, 0.229, 1.000)
		BumpHeight      19.0894
		BumpOffset      3.81788
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

	CometTail
	{
		MaxLength   0.807518
		GasToDust   0.25
		Particles   2611
		GasBright   0.126249
		DustBright  0.282492
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   98.8238
		Period          489.854
		Eccentricity    0.882536
		Inclination     -135.712
		AscendingNode   -161.244
		ArgOfPericenter 157.591
		MeanAnomaly     -174.296
	}
}

Comet	"Japrael System C109"
{
	ParentBody     "Prael"
	Class	       "Asteroid"

	Mass            8.57066e-017
	Radius          0.0604636
	InertiaMoment   0.397462

	Oblateness      0.0191331

	RotationPeriod  35.7127
	Obliquity       301.061
	EqAscendNode    38.1111

	AbsMagn         5.51423
	SlopeParam      5.36405
	AlbedoBond      0.05
	AlbedoGeom      0.06
	Brightness      1
	Color          (0.619 0.617 0.615)

	Surface
	{
		SurfStyle       0.218608
		OceanStyle      0.138675
		Randomize      (-0.225, -0.634, -0.196)
		colorDistMagn   0.820137
		colorDistFreq   1.65778e-006
		detailScale     1.65106
		colorConversion true
		snowLevel       2
		tropicLatitude  0.386637
		icecapLatitude  1
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        0.633974
		terraceProb     0.303702
		erosion         0
		montesMagn      0.493729
		montesFreq      3.58853
		montesSpiky     0.996363
		montesFraction  0.414231
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.10799e-006
		hillsFraction   0.559305
		hills2Fraction  0
		canyonFraction  0
		craterMagn      0.229348
		craterFreq      0.150466
		craterDensity   0.883547
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.539983
		volcanoTemp     1452.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.248, 0.247, 0.246, 0.000)
		colorShelf     (0.263, 0.262, 0.262, 0.000)
		colorBeach     (0.279, 0.277, 0.277, 0.000)
		colorDesert    (0.294, 0.293, 0.292, 0.000)
		colorLowland   (0.310, 0.308, 0.308, 0.000)
		colorUpland    (0.325, 0.324, 0.323, 0.000)
		colorRock      (0.341, 0.339, 0.338, 0.000)
		colorSnow      (0.356, 0.354, 0.354, 1.000)
		BumpHeight      0.0544173
		BumpOffset      0.0108835
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

	CometTail
	{
		MaxLength   0.01
		GasToDust   0.25
		Particles   1000
		GasBright   0.328635
		DustBright  0.564593
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   119.276
		Period          649.539
		Eccentricity    0.945864
		Inclination     -134.212
		AscendingNode   -23.6442
		ArgOfPericenter 66.9799
		MeanAnomaly     -19.8496
	}
}