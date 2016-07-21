package com.google.android.gms.location.places;

public final class AutocompleteFilter$Builder
{
  private boolean zzaPg = false;
  private int zzaPi = 0;
  
  public final AutocompleteFilter build()
  {
    return new AutocompleteFilter(1, zzaPg, AutocompleteFilter.zzhK(zzaPi));
  }
  
  public final Builder setTypeFilter(int paramInt)
  {
    zzaPi = paramInt;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.AutocompleteFilter.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */