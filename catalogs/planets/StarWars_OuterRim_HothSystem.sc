// http://starwars.wikia.com/wiki/Hoth
// Region : Outer Rim
// Sector : Anoat Sector
// Grid location : K18
// X : -1421.32, Y : -12880.35, Z : 253.66398066000374
Planet	"Shron"
{
	ParentBody     "Hoth System"
	Class	       "Desert"

	Mass            0.2529387
	Radius          4060.591
	InertiaMoment   0.3301671

	Oblateness      0.00518818

	RotationPeriod  19.39042
	RotationOffset  50.17097
	Obliquity       -107.1669
	EqAscendNode    76.36935

	Albedo          0.2
	Color          (0.451 0.423 0.464)

	Orbit
	{
		SemiMajorAxis   5.184448
		//Period          0.373
		Eccentricity    0.07987595
		Inclination     186.571
		AscendingNode   70.51958
		ArgOfPericenter 14.99266
		MeanAnomaly     99.85158
		RefPlane       "Ecliptic"
	}
}

Planet	"Biosh"
{
	ParentBody     "Hoth System"
	Class	       "Selena"

	Mass            0.05162545
	Radius          2180.397
	InertiaMoment   0.3424723

	Oblateness      0.00281465

	RotationPeriod  23.45157
	RotationOffset  300.686
	Obliquity       -139.5563
	EqAscendNode    77.1922

	Albedo          0.3
	Color          (0.460 0.488 0.470)

	Orbit
	{
		SemiMajorAxis   15.7701
		//Period          0.582
		Eccentricity    0.0952381
		Inclination     187.97
		AscendingNode   72.39872
		ArgOfPericenter 83.34673
		MeanAnomaly     129.3707
		RefPlane       "Ecliptic"
	}
}

Planet	"Nushk"
{
	ParentBody     "Hoth System"
	Class	       "Titan"

	Mass            1.250126
	Radius          6609.621
	InertiaMoment   0.331743

	Obliquity       5.008956e-006
	EqAscendNode    55.81834

	Albedo          0.65
	Color          (1.000 1.000 1.000)
	
	Surface
	{
		seaLevel        1.0
	}
	
	Clouds
	{
		Height          20
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.749515
		mainOctaves     10
		Coverage        1
		twistZones      2.086567
		twistMagn       0
	}
	
	Ocean
	{
		Height          20.0
	}
	
	Atmosphere
	{
		Model          "Earth"
		Height          138.9495
		Density         4.753124
		Pressure        0.1730196
		Greenhouse      0
		Bright          3
		Opacity         0.3
		SkyLight        1
	}

	Orbit
	{
		SemiMajorAxis   38.40078
		//Period          0.724
		Eccentricity    0.1269841
		Inclination     186.1701
		AscendingNode   72.39872
		ArgOfPericenter 83.34673
		MeanAnomaly     129.3707
		RefPlane       "Ecliptic"
	}
}

Moon	"Nushk I"
{
	ParentBody     "Nushk"
	Class	       "Selena"

	Mass            0.004378199
	Radius          974.5961
	InertiaMoment   0.3935289

	Oblateness      0.001942694

	Obliquity       5.008956e-006
	EqAscendNode    20.74033

	Albedo          0.3
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.0004670149
		//Period          0.00363391
		Eccentricity    4.823663e-005
		Inclination     0.3337594
		AscendingNode   20.74033
		ArgOfPericenter 44.07561
		MeanAnomaly     315.3607
		RefPlane       "Equator"
	}
}

Moon	"Nushk II"
{
	ParentBody     "Nushk"
	Class	       "Selena"

	Mass            0.005169767
	Radius          1423.551
	InertiaMoment   0.3892253

	Oblateness      0.001729937

	Obliquity       5.008956e-006
	EqAscendNode    308.3137

	Albedo          0.3
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.0006673002
		//Period          0.006205737
		Eccentricity    0.006589286
		Inclination     1.47242
		AscendingNode   308.3137
		ArgOfPericenter 45.92802
		MeanAnomaly     43.02349
		RefPlane       "Equator"
	}
}

DwarfMoon	"Nushk III"
{
	ParentBody     "Nushk"
	Class	       "Asteroid"

	Mass            8.36082e-009
	Radius          16.89139
	InertiaMoment   0.3971882

	Obliquity       5.008956e-006
	EqAscendNode    160.3589

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.0009534806
		//Period          0.01060998
		Eccentricity    0.01341344
		Inclination     0.7560496
		AscendingNode   160.3589
		ArgOfPericenter 268.5521
		MeanAnomaly     166.0955
		RefPlane       "Equator"
	}
}

DwarfMoon	"Nushk IV"
{
	ParentBody     "Nushk"
	Class	       "Asteroid"

	Mass            1.171135e-008
	Radius          17.47316
	InertiaMoment   0.399943

	Obliquity       5.008956e-006
	EqAscendNode    56.43962

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.001362393
		//Period          0.01812177
		Eccentricity    0.02883795
		Inclination     -0.2383311
		AscendingNode   56.43962
		ArgOfPericenter 5.212941
		MeanAnomaly     356.2493
		RefPlane       "Equator"
	}
}

Planet	"Jhas"
{
	ParentBody     "Hoth System"
	Class	       "GasGiant"

	Mass            174.5444
	Radius          65936.75
	InertiaMoment   0.2090288

	Oblateness      0.08736619

	RotationPeriod  9.5411
	RotationOffset  263.5251
	Obliquity       -3.312965
	EqAscendNode    345.47

	Albedo          0.5
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   47.96964
		//Period          0.886
		Eccentricity    0.07907854
		Inclination     186.1701
		AscendingNode   72.39872
		ArgOfPericenter 83.34673
		MeanAnomaly     129.3707
		RefPlane       "Ecliptic"
	}
}

Moon	"Jhas I"
{
	ParentBody     "Jhas"
	Class	       "IceWorld"

	Mass            0.0495566
	Radius          3165.731
	InertiaMoment   0.3452092

	Oblateness      0.001864066

	Obliquity       5.008956e-006
	EqAscendNode    137.2344

	Albedo          0.3
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.002628952
		//Period          0.005899823
		Eccentricity    0.01301609
		Inclination     -1.01416
		AscendingNode   137.2344
		ArgOfPericenter 186.6287
		MeanAnomaly     123.1969
		RefPlane       "Equator"
	}
}

DwarfMoon	"Jhas II"
{
	ParentBody     "Jhas"
	Class	       "Asteroid"

	Mass            1.495834e-006
	Radius          87.96227
	InertiaMoment   0.3986685

	Obliquity       5.008956e-006
	EqAscendNode    34.80583

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.003669819
		//Period          0.009731811
		Eccentricity    0.01885655
		Inclination     0.9429623
		AscendingNode   34.80583
		ArgOfPericenter 262.2045
		MeanAnomaly     98.80862
		RefPlane       "Equator"
	}
}

DwarfMoon	"Jhas V"
{
	ParentBody     "Jhas"
	Class	       "Asteroid"

	Mass            2.032114e-006
	Radius          97.4151
	InertiaMoment   0.3980237

	Obliquity       5.008956e-006
	EqAscendNode    11.17809

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.005122792
		//Period          0.01605043
		Eccentricity    0.04056232
		Inclination     -0.3136314
		AscendingNode   11.17809
		ArgOfPericenter 91.1528
		MeanAnomaly     58.69026
		RefPlane       "Equator"
	}
}

Moon	"Jhas IX"
{
	ParentBody     "Jhas"
	Class	       "IceWorld"

	Mass            0.08993901
	Radius          2927.039
	InertiaMoment   0.3299939

	Obliquity       5.008956e-006
	EqAscendNode    354.661

	Albedo          0.3
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.007151032
		//Period          0.02646475
		Eccentricity    0.04943692
		Inclination     -1.368346
		AscendingNode   354.661
		ArgOfPericenter 268.0728
		MeanAnomaly     225.4086
		RefPlane       "Equator"
	}
}

Moon	"Jhas XII"
{
	ParentBody     "Jhas"
	Class	       "Titan"

	Mass            1.134557
	Radius          7308.584
	InertiaMoment   0.3334587

	Obliquity       5.008956e-006
	EqAscendNode    31.31653

	Albedo          0.2
	Color          (0.924 0.853 0.628)

	Orbit
	{
		SemiMajorAxis   0.009982303
		//Period          0.04351769
		Eccentricity    0.007424636
		Inclination     -0.03633542
		AscendingNode   31.31653
		ArgOfPericenter 282.0916
		MeanAnomaly     304.6827
		RefPlane       "Equator"
	}
}

Moon	"Jhas XV"
{
	ParentBody     "Jhas"
	Class	       "Titan"

	Mass            0.1469814
	Radius          4217.241
	InertiaMoment   0.3315152

	Obliquity       5.008956e-006
	EqAscendNode    130.522

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.01393454
		//Period          0.07197521
		Eccentricity    0.2116887
		Inclination     65.33208
		AscendingNode   130.522
		ArgOfPericenter 101.2425
		MeanAnomaly     99.96107
		RefPlane       "Equator"
	}
}

DwarfMoon	"Jhas XX"
{
	ParentBody     "Jhas"
	Class	       "Asteroid"

	Mass            1.445525e-011
	Radius          1.647233
	InertiaMoment   0.3989315

	Obliquity       5.008956e-006
	EqAscendNode    2.542336

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.01945157
		//Period          0.1187569
		Eccentricity    0.01216917
		Inclination     -0.1213631
		AscendingNode   2.542336
		ArgOfPericenter 177.4289
		MeanAnomaly     66.26631
		RefPlane       "Equator"
	}
}

DwarfMoon	"Jhas XXI"
{
	ParentBody     "Jhas"
	Class	       "Asteroid"

	Mass            3.155175e-011
	Radius          2.13675
	InertiaMoment   0.3983546

	Obliquity       5.008956e-006
	EqAscendNode    312.5805

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.02715293
		//Period          0.1958627
		Eccentricity    0.1995652
		Inclination     149.7046
		AscendingNode   312.5805
		ArgOfPericenter 179.1231
		MeanAnomaly     217.7523
		RefPlane       "Equator"
	}
}

DwarfMoon	"Jhas XXIV"
{
	ParentBody     "Jhas"
	Class	       "Asteroid"

	Mass            6.215187e-011
	Radius          2.67853
	InertiaMoment   0.39759

	Obliquity       5.008956e-006
	EqAscendNode    43.99004

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.03790345
		//Period          0.3230314
		Eccentricity    0.02660005
		Inclination     -84.95638
		AscendingNode   43.99004
		ArgOfPericenter 124.0482
		MeanAnomaly     44.93976
		RefPlane       "Equator"
	}
}

DwarfMoon	"Jhas III"
{
	ParentBody     "Jhas"
	Class	       "Asteroid"

	Mass            1.883751e-006
	Radius          83.47221
	InertiaMoment   0.3990521

	Obliquity       5.008956e-006
	EqAscendNode    19.46942

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.003685886
		//Period          0.006892239
		Eccentricity    0.03660993
		Inclination     1.127122
		AscendingNode   19.46942
		ArgOfPericenter 296.2263
		MeanAnomaly     224.3437
		RefPlane       "Equator"
	}
}

DwarfMoon	"Jhas VI"
{
	ParentBody     "Jhas"
	Class	       "Asteroid"

	Mass            2.566097e-006
	Radius          82.37427
	InertiaMoment   0.3984994

	Obliquity       5.008956e-006
	EqAscendNode    16.37715

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.005535128
		//Period          0.01268349
		Eccentricity    0.04443387
		Inclination     0.8622381
		AscendingNode   16.37715
		ArgOfPericenter 175.9421
		MeanAnomaly     332.4761
		RefPlane       "Equator"
	}
}

DwarfMoon	"Jhas XVIII"
{
	ParentBody     "Jhas"
	Class	       "Asteroid"

	Mass            1.167972e-011
	Radius          1.534231
	InertiaMoment   0.3997629

	Obliquity       5.008956e-006
	EqAscendNode    307.8181

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.01874497
		//Period          0.07904503
		Eccentricity    0.2158317
		Inclination     49.71103
		AscendingNode   307.8181
		ArgOfPericenter 57.22687
		MeanAnomaly     228.5229
		RefPlane       "Equator"
	}
}

DwarfMoon	"Jhas X"
{
	ParentBody     "Jhas"
	Class	       "Asteroid"

	Mass            1.055188e-010
	Radius          3.195368
	InertiaMoment   0.398502

	Obliquity       5.008956e-006
	EqAscendNode    254.8871

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.008175929
		//Period          0.01225754
		Eccentricity    0.005565626
		Inclination     1.331628
		AscendingNode   254.8871
		ArgOfPericenter 187.2645
		MeanAnomaly     274.9909
		RefPlane       "Equator"
	}
}

DwarfMoon	"Jhas XIV"
{
	ParentBody     "Jhas"
	Class	       "Asteroid"

	Mass            1.839032e-010
	Radius          3.845381
	InertiaMoment   0.3978002

	Obliquity       5.008956e-006
	EqAscendNode    94.25345

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.01164532
		//Period          0.02557796
		Eccentricity    0.03221775
		Inclination     -0.5233912
		AscendingNode   94.25345
		ArgOfPericenter 51.99901
		MeanAnomaly     27.9911
		RefPlane       "Equator"
	}
}

DwarfMoon	"Jhas XIX"
{
	ParentBody     "Jhas"
	Class	       "Asteroid"

	Mass            3.0659e-010
	Radius          4.05934
	InertiaMoment   0.3965974

	Obliquity       5.008956e-006
	EqAscendNode    47.60767

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.01901633
		//Period          0.05337385
		Eccentricity    0.04588903
		Inclination     -34.06705
		AscendingNode   47.60767
		ArgOfPericenter 70.56974
		MeanAnomaly     330.8326
		RefPlane       "Equator"
	}
}

DwarfMoon	"Jhas XXII"
{
	ParentBody     "Jhas"
	Class	       "Asteroid"

	Mass            4.933415e-010
	Radius          4.756825
	InertiaMoment   0.3997649

	Obliquity       5.008956e-006
	EqAscendNode    103.9074

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.03105287
		//Period          0.1113759
		Eccentricity    0.2327235
		Inclination     -48.9734
		AscendingNode   103.9074
		ArgOfPericenter 32.15641
		MeanAnomaly     295.4702
		RefPlane       "Equator"
	}
}

DwarfMoon	"Jhas IV"
{
	ParentBody     "Jhas"
	Class	       "Asteroid"

	Mass            1.885386e-007
	Radius          38.76699
	InertiaMoment   0.399766

	Obliquity       5.008956e-006
	EqAscendNode    321.6484

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.00430478
		//Period          0.008844536
		Eccentricity    0.04687486
		Inclination     0.8585862
		AscendingNode   321.6483
		ArgOfPericenter 342.7338
		MeanAnomaly     172.7121
		RefPlane       "Equator"
	}
}

DwarfMoon	"Jhas VIII"
{
	ParentBody     "Jhas"
	Class	       "Asteroid"

	Mass            2.538905e-007
	Radius          42.80883
	InertiaMoment   0.3992948

	Obliquity       5.008956e-006
	EqAscendNode    230.168

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.006620355
		//Period          0.01686827
		Eccentricity    0.003349106
		Inclination     1.263197
		AscendingNode   230.168
		ArgOfPericenter 116.6701
		MeanAnomaly     239.6035
		RefPlane       "Equator"
	}
}

DwarfMoon	"Jhas XIII"
{
	ParentBody     "Jhas"
	Class	       "Asteroid"

	Mass            3.41756e-007
	Radius          42.07965
	InertiaMoment   0.3987801

	Obliquity       5.008956e-006
	EqAscendNode    97.31539

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.0101815
		//Period          0.0321711
		Eccentricity    0.04528067
		Inclination     0.01156934
		AscendingNode   97.31539
		ArgOfPericenter 282.1296
		MeanAnomaly     189.513
		RefPlane       "Equator"
	}
}

DwarfMoon	"Jhas XVII"
{
	ParentBody     "Jhas"
	Class	       "Asteroid"

	Mass            4.600955e-007
	Radius          46.46248
	InertiaMoment   0.3981671

	Obliquity       5.008956e-006
	EqAscendNode    331.4359

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.0156582
		//Period          0.06135662
		Eccentricity    0.03636674
		Inclination     -31.61619
		AscendingNode   331.4359
		ArgOfPericenter 214.7737
		MeanAnomaly     0.8100387
		RefPlane       "Equator"
	}
}

DwarfMoon	"Jhas VII"
{
	ParentBody     "Jhas"
	Class	       "Asteroid"

	Mass            1.525374e-007
	Radius          32.16045
	InertiaMoment   0.3988794

	Obliquity       5.008956e-006
	EqAscendNode    91.76871

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.006192601
		//Period          0.008963292
		Eccentricity    0.03770499
		Inclination     1.425024
		AscendingNode   91.76871
		ArgOfPericenter 336.2174
		MeanAnomaly     155.4291
		RefPlane       "Equator"
	}
}

DwarfMoon	"Jhas XI"
{
	ParentBody     "Jhas"
	Class	       "Asteroid"

	Mass            2.055391e-007
	Radius          39.89855
	InertiaMoment   0.3982909

	Obliquity       5.008956e-006
	EqAscendNode    156.8016

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.009550747
		//Period          0.01716777
		Eccentricity    0.01840775
		Inclination     -1.328444
		AscendingNode   156.8016
		ArgOfPericenter 306.8472
		MeanAnomaly     209.5643
		RefPlane       "Equator"
	}
}

DwarfMoon	"Jhas XVI"
{
	ParentBody     "Jhas"
	Class	       "Asteroid"

	Mass            2.767354e-007
	Radius          39.22207
	InertiaMoment   0.3974947

	Obliquity       5.008956e-006
	EqAscendNode    132.7333

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.01472996
		//Period          0.03288217
		Eccentricity    0.1717626
		Inclination     103.5265
		AscendingNode   132.7333
		ArgOfPericenter 247.481
		MeanAnomaly     283.3032
		RefPlane       "Equator"
	}
}

DwarfMoon	"Jhas XXIII"
{
	ParentBody     "Jhas"
	Class	       "Asteroid"

	Mass            3.725014e-007
	Radius          48.642
	InertiaMoment   0.3956013

	Obliquity       5.008956e-006
	EqAscendNode    96.02232

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.03503726
		//Period          0.1206294
		Eccentricity    0.4380868
		Inclination     32.54581
		AscendingNode   96.02232
		ArgOfPericenter 159.2933
		MeanAnomaly     266.6852
		RefPlane       "Equator"
	}
}

Planet	"Ordaj"
{
	ParentBody     "Hoth System"
	Class	       "GasGiant"

	Mass            198.4262
	Radius          69268.2
	InertiaMoment   0.2260582

	Oblateness      0.08458877

	RotationPeriod  10.07052
	RotationOffset  83.27547
	Obliquity       -126.7519
	EqAscendNode    125.0117

	Albedo          0.5
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   74.85474
		//Period          1.091
		Eccentricity    0.07907854
		Inclination     186.1701
		AscendingNode   72.39872
		ArgOfPericenter 83.34673
		MeanAnomaly     129.3707
		RefPlane       "Ecliptic"
	}
}

Moon	"Ordaj III"
{
	ParentBody     "Ordaj"
	Class	       "Selena"

	Mass            0.0004597258
	Radius          462.6335
	InertiaMoment   0.3986366

	Obliquity       5.008956e-006
	EqAscendNode    53.75862

	Albedo          0.3
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.002643831
		//Period          0.006658732
		Eccentricity    0.0460595
		Inclination     -0.3974486
		AscendingNode   53.75862
		ArgOfPericenter 171.1055
		MeanAnomaly     325.6856
		RefPlane       "Equator"
	}
}

Moon	"Ordaj V"
{
	ParentBody     "Ordaj"
	Class	       "Selena"

	Mass            0.0006233357
	Radius          574.8376
	InertiaMoment   0.3979819

	Obliquity       5.008956e-006
	EqAscendNode    235.8056

	Albedo          0.3
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.004505231
		//Period          0.01481209
		Eccentricity    0.03817352
		Inclination     -0.5034433
		AscendingNode   235.8056
		ArgOfPericenter 157.9606
		MeanAnomaly     0.4200556
		RefPlane       "Equator"
	}
}

DwarfMoon	"Ordaj VII"
{
	ParentBody     "Ordaj"
	Class	       "Asteroid"

	Mass            4.236791e-010
	Radius          5.078709
	InertiaMoment   0.3969755

	Obliquity       5.008956e-006
	EqAscendNode    15.58715

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.007677157
		//Period          0.032949
		Eccentricity    0.3154686
		Inclination     -12.35108
		AscendingNode   15.58715
		ArgOfPericenter 117.8759
		MeanAnomaly     82.20769
		RefPlane       "Equator"
	}
}

DwarfMoon	"Ordaj X"
{
	ParentBody     "Ordaj"
	Class	       "Asteroid"

	Mass            6.682453e-010
	Radius          5.263148
	InertiaMoment   0.3998695

	Obliquity       5.008956e-006
	EqAscendNode    297.6953

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.01308229
		//Period          0.07329381
		Eccentricity    0.1471923
		Inclination     174.0862
		AscendingNode   297.6953
		ArgOfPericenter 244.3669
		MeanAnomaly     59.10518
		RefPlane       "Equator"
	}
}

DwarfMoon	"Ordaj XIV"
{
	ParentBody     "Ordaj"
	Class	       "Asteroid"

	Mass            1.027608e-009
	Radius          6.823598
	InertiaMoment   0.3994035

	Obliquity       5.008956e-006
	EqAscendNode    219.6404

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.02229293
		//Period          0.1630393
		Eccentricity    0.07755437
		Inclination     77.2122
		AscendingNode   219.6404
		ArgOfPericenter 225.3016
		MeanAnomaly     12.45575
		RefPlane       "Equator"
	}
}

Moon	"Ordaj Besh"
{
	ParentBody     "Ordaj"
	Class	       "Selena"

	Mass            0.03206761
	Radius          2389.181
	InertiaMoment   0.3561834

	Oblateness      0.001329423

	Obliquity       5.008956e-006
	EqAscendNode    15.58038

	Albedo          0.3
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.003824087
		//Period          0.00581068
		Eccentricity    0.007054379
		Inclination     -1.249
		AscendingNode   15.58038
		ArgOfPericenter 131.6622
		MeanAnomaly     333.5473
		RefPlane       "Equator"
	}
}

DwarfMoon	"Ordaj VI"
{
	ParentBody     "Ordaj"
	Class	       "Asteroid"

	Mass            7.02905e-008
	Radius          24.84181
	InertiaMoment   0.3993862

	Obliquity       5.008956e-006
	EqAscendNode    257.6227

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.006336176
		//Period          0.01239335
		Eccentricity    0.007383863
		Inclination     -0.8644312
		AscendingNode   257.6227
		ArgOfPericenter 301.0966
		MeanAnomaly     59.45687
		RefPlane       "Equator"
	}
}

DwarfMoon	"Ordaj IX"
{
	ParentBody     "Ordaj"
	Class	       "Asteroid"

	Mass            9.516045e-008
	Radius          30.8675
	InertiaMoment   0.3988828

	Obliquity       5.008956e-006
	EqAscendNode    252.2827

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.01049849
		//Period          0.02643247
		Eccentricity    0.03209716
		Inclination     -1.437762
		AscendingNode   252.2827
		ArgOfPericenter 79.23326
		MeanAnomaly     326.2126
		RefPlane       "Equator"
	}
}

DwarfMoon	"Ordaj XII"
{
	ParentBody     "Ordaj"
	Class	       "Asteroid"

	Mass            1.285347e-007
	Radius          30.37679
	InertiaMoment   0.3982951

	Obliquity       5.008956e-006
	EqAscendNode    247.6472

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.01739507
		//Period          0.05637505
		Eccentricity    0.3305407
		Inclination     118.2938
		AscendingNode   247.6472
		ArgOfPericenter 91.96851
		MeanAnomaly     334.5017
		RefPlane       "Equator"
	}
}

DwarfMoon	"Ordaj XV"
{
	ParentBody     "Ordaj"
	Class	       "Asteroid"

	Mass            1.733196e-007
	Radius          37.69474
	InertiaMoment   0.397501

	Obliquity       5.008956e-006
	EqAscendNode    29.01564

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.02882209
		//Period          0.1202364
		Eccentricity    0.1465628
		Inclination     1.813971
		AscendingNode   29.01565
		ArgOfPericenter 262.3363
		MeanAnomaly     112.0721
		RefPlane       "Equator"
	}
}

DwarfMoon	"Ordaj II"
{
	ParentBody     "Ordaj"
	Class	       "Asteroid"

	Mass            8.940271e-007
	Radius          80.1497
	InertiaMoment   0.3996441

	Obliquity       5.008956e-006
	EqAscendNode    132.211

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.002151685
		//Period          0.01076818
		Eccentricity    0.03239348
		Inclination     -0.5368159
		AscendingNode   132.211
		ArgOfPericenter 91.52773
		MeanAnomaly     279.2544
		RefPlane       "Equator"
	}
}

DwarfMoon	"Ordaj VIII"
{
	ParentBody     "Ordaj"
	Class	       "Asteroid"

	Mass            1.638535e-006
	Radius          79.6827
	InertiaMoment   0.3986314

	Obliquity       5.008956e-006
	EqAscendNode    231.0439

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.008
		//Period          0.04184731
		Eccentricity    0.02901913
		Inclination     -0.7537463
		AscendingNode   231.0439
		ArgOfPericenter 178.9002
		MeanAnomaly     82.36085
		RefPlane       "Equator"
	}
}

DwarfMoon	"Ordaj XI"
{
	ParentBody     "Ordaj"
	Class	       "Asteroid"

	Mass            1.955219e-006
	Radius          104.0225
	InertiaMoment   0.3973034

	Obliquity       5.008956e-006
	EqAscendNode    117.3824

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.01554894
		//Period          0.02689279
		Eccentricity    0.2464385
		Inclination     21.0397
		AscendingNode   117.3824
		ArgOfPericenter 100.0245
		MeanAnomaly     49.37345
		RefPlane       "Equator"
	}
}

DwarfMoon	"Ordaj I"
{
	ParentBody     "Ordaj"
	Class	       "Asteroid"

	Mass            2.143071e-008
	Radius          21.37175
	InertiaMoment   0.3994594

	Oblateness      0.001477686

	Obliquity       5.008956e-006
	EqAscendNode    154.2608

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.001564658
		//Period          0.006183956
		Eccentricity    0.01120428
		Inclination     0.7798035
		AscendingNode   154.2608
		ArgOfPericenter 251.5438
		MeanAnomaly     323.2848
		RefPlane       "Equator"
	}
}

DwarfMoon	"Ordaj XVII"
{
	ParentBody     "Ordaj"
	Class	       "Asteroid"

	Mass            1.832644e-007
	Radius          38.40217
	InertiaMoment   0.398681

	Obliquity       5.008956e-006
	EqAscendNode    257.3201

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.03298798
		//Period          0.5986468
		Eccentricity    0.09197713
		Inclination     -81.07972
		AscendingNode   257.3201
		ArgOfPericenter 264.4263
		MeanAnomaly     135.5205
		RefPlane       "Equator"
	}
}

DwarfMoon	"Ordaj XIII"
{
	ParentBody     "Ordaj"
	Class	       "Asteroid"

	Mass            1.809575e-008
	Radius          21.84905
	InertiaMoment   0.3996759

	Obliquity       5.008956e-006
	EqAscendNode    357.7253

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.01940131
		//Period          0.4604213
		Eccentricity    0.1156801
		Inclination     152.8182
		AscendingNode   357.7253
		ArgOfPericenter 326.59
		MeanAnomaly     210.1243
		RefPlane       "Equator"
	}
}

DwarfMoon	"Ordaj XVI"
{
	ParentBody     "Ordaj"
	Class	       "Asteroid"

	Mass            2.493947e-008
	Radius          22.47959
	InertiaMoment   0.399199

	RotationPeriod  1020
	RotationOffset  140.8264
	Obliquity       -1.002148
	EqAscendNode    311.4614

	Albedo          0.2
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.03157724
		//Period          0.9560267
		Eccentricity    0.1062224
		Inclination     142.1909
		AscendingNode   311.3195
		ArgOfPericenter 234.2229
		MeanAnomaly     61.35424
		RefPlane       "Equator"
	}
}

Planet	"Hoth/Hoth Planet"
{
	ParentBody     "Hoth System"
	Class	       "IceWorld"

	Mass            0.368
	Radius          3627.594
	InertiaMoment   0.3382797

	Oblateness      0.003239586

	RotationPeriod  22.992
	RotationOffset  120.6667
	Obliquity       -14.74154
	EqAscendNode    11.42857

	Albedo          0.3
	Color          (1.000 1.000 1.000)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Subglacial/Terrestrial"
	}

	Surface
	{
		Style           0.7091383
		Randomize      (0.150, 0.394, -0.677)
		colorDistMagn   0.05594823
		colorDistFreq   695.4943
		detailScale     12725.89
		colorConversion true
		drivenDarkening 0
		seaLevel        0
		snowLevel       0
		tropicLatitude  0
		icecapLatitude  0
		icecapHeight    0.2350882
		climatePole     0
		climateTropic   0
		climateEquator  0
		tropicWidth     0.07
		mainFreq        1.766832
		venusFreq       1.200323
		venusMagn       0.1944552
		mareFreq        1.869756
		mareDensity     0.1486551
		terraceProb     0.4048544
		erosion         0
		montesMagn      0.1744
		montesFreq      277.8555
		montesFraction  0.4300416
		dunesMagn       0.03990907
		dunesFreq       7569.676
		dunesFraction   0.1417171
		hillsMagn       0.1274694
		hillsFreq       692.4148
		hillsFraction   0.7561253
		hills2Fraction  -0.3986681
		canyonsMagn     0.05594479
		canyonsFreq     166.888
		canyonFraction  -0.02440056
		cracksMagn      0.05675313
		cracksFreq      3.105471
		cracksOctaves   2
		craterMagn      0.6260884
		craterFreq      14.36243
		craterDensity   0.4434791
		craterOctaves   6.472755
		craterRayedFactor 0.09826428
		twistZones      7.871131
		twistMagn       4.206349
		cycloneMagn     0
		cycloneFreq     0
		cycloneDensity  0
		cycloneOctaves  1
		colorSea       (1.000, 1.000, 1.000, 1.000)
		colorShelf     (1.000, 1.000, 1.000, 1.000)
		colorBeach     (1.000, 1.000, 1.000, 1.000)
		colorDesert    (1.000, 1.000, 1.000, 1.000)
		colorLowland   (1.000, 1.000, 1.000, 1.000)
		colorUpland    (1.000, 1.000, 1.000, 1.000)
		colorRock      (0.999, 0.999, 0.999, 1.000)
		colorSnow      (1.000, 1.000, 1.000, 1.000)
		colorLowPlants (1.000, 1.000, 1.000, 1.000)
		colorUpPlants  (1.000, 1.000, 1.000, 1.000)
		BumpHeight      20
		BumpOffset      4
		DiffMapAlpha   "Ice"
		SpecularBright  0.3
		SpecularPower   150
		DayAmbient      0.2
		Lommel          0
		Exposure        2
	}

	Clouds
	{
		Height          37.48486
		DayAmbient      2
		Lommel          0.2
		Exposure        2
		Color          (1.000 1.000 1.000 1.000)
		mainFreq        1.987797
		mainOctaves     10
		Coverage        0.6
		twistZones      7.871131
		twistMagn       4.206349
	}

	NoOcean         true

	Atmosphere
	{
		Model          "Earth"
		Height          80.30857
		Density         100
		Pressure        1.178
		Greenhouse      0
		Bright          6.984127
		Opacity         0.1904762
		SkyLight        0.7142857
		
		Composition // values in percent
		{
			N2  77.7729
			O2  20.8625
			Ar  0.9303
			H2O 0.4000
			CO2 0.0398
		}
	}

	NoAurora        true

	NoCometTail     true
	
	NoRings			true

	Orbit
	{
		SemiMajorAxis   93.50734
		//Period          1.504
		Eccentricity    0.00307854
		Inclination     186.1701
		AscendingNode   72.39872
		ArgOfPericenter 83.34673
		MeanAnomaly     129.3707
		RefPlane       "Ecliptic"
	}
}

Moon	"Hoth I"
{
	ParentBody     "Hoth Planet"
	Class	       "Selena"

	Mass            0.0008653703
	Radius          570.5251
	InertiaMoment   0.3999823

	Obliquity       5.008956e-006
	EqAscendNode    65.58727

	Albedo          0.3
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.0007073703
		//Period          0.005525393
		Eccentricity    0.0707514
		Inclination     17.65315
		AscendingNode   65.58728
		ArgOfPericenter 25.28913
		MeanAnomaly     306.4312
		RefPlane       "Equator"
	}
}

Moon	"Hoth III"
{
	ParentBody     "Hoth Planet"
	Class	       "Selena"

	Mass            0.033132
	Radius          2121.93
	InertiaMoment   0.3501165

	Obliquity       5.008956e-006
	EqAscendNode    342.9899

	Albedo          0.3
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.005239433
		//Period          0.01930698
		Eccentricity    0.1904762
		Inclination     11.42857
		AscendingNode   65.58728
		ArgOfPericenter 25.28913
		MeanAnomaly     306.4312
		RefPlane       "Equator"
	}
}

Moon	"Hoth II"
{
	ParentBody     "Hoth Planet"
	Class	       "Selena"

	Mass            0.001012677
	Radius          675.0717
	InertiaMoment   0.3995203

	Obliquity       5.008956e-006
	EqAscendNode    2.010725

	Albedo          0.3
	Color          (1.000 1.000 1.000)

	Orbit
	{
		SemiMajorAxis   0.001378878
		//Period          0.01075836
		Eccentricity    0.0707514
		Inclination     17.65315
		AscendingNode   65.58728
		ArgOfPericenter 25.28913
		MeanAnomaly     306.4312
		RefPlane       "Equator"
	}
}