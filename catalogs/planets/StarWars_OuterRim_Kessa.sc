// http://starwars.wikia.com/wiki/Kessel
// Region : Outer Rim
// Sector : Kessel Sector
// Grid location : T10
// X : 12545.08, Y : -170.54, Z : -558.8218393371664
Planet	"Senna"
{
	ParentBody     "Kessa"
	Class	       "Selena"

	Mass            0.25
	Radius          2745.5
	InertiaMoment   0.1975344

	Albedo          0.5
	Color          (1.000 1.000 1.000)
	
	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Orbit
	{
		SemiMajorAxis   0.947
		//Period          0.864
		Eccentricity    0.003
		Inclination     2.4555
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Planet	"Kessel"
{
	ParentBody     "Kessa"
	Class	       "Asteroid"

	Mass            0.00034
	Radius          445.5
	RotationPeriod	26
	InertiaMoment   0.1975344

	Albedo          0.75
	Color          (1.000 1.000 1.000)
	
	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
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
		SemiMajorAxis   6.4
		//Period          0.881606783
		Eccentricity    0.002
		Inclination     5.4555
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

DwarfMoon	"Garrison Moon"
{
	ParentBody     "Kessel"
	Class	       "Selena"

	Mass            0.00024
	Radius          376.5
	RotationPeriod	13
	InertiaMoment   0.3975344

	Albedo          0.5
	Color          (1.000 1.000 1.000)
	
	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Life
	{
		Class   "Exotic"
		Type    "Unicellular"
		Biome   "Terrestrial"
	}

	Orbit
	{
		SemiMajorAxis   0.00503697009
		//Period          1.76321357
		Eccentricity    0.002
		Inclination     5.4555
		AscendingNode   343.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}

Planet	"Karedda"
{
	ParentBody     "Kessa"
	Class	       "IceWorld"

	Mass            0.25
	Radius          5735
	InertiaMoment   0.1975344

	Albedo          0.852
	Color          (1.000 1.000 1.000)
	
	NoClouds			true
	
	NoAtmosphere			true
	
	NoAurora			true

	Orbit
	{
		SemiMajorAxis   28.33
		//Period          6.453
		Eccentricity    0.03
		Inclination     23.4555
		AscendingNode   313.4993
		ArgOfPericenter 75.89897
		MeanAnomaly     142.8083
		RefPlane       "Equator"
	}
}
