package com.google.android.gms.location.places;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class PlaceFilter$zza
{
  private boolean zzaPA = false;
  private Collection zzaPB = null;
  private Collection zzaPC = null;
  private String[] zzaPD = null;
  
  public final PlaceFilter zzze()
  {
    List localList = null;
    ArrayList localArrayList1;
    if (zzaPB != null)
    {
      localArrayList1 = new ArrayList(zzaPB);
      if (zzaPC == null) {
        break label75;
      }
    }
    label75:
    for (ArrayList localArrayList2 = new ArrayList(zzaPC);; localArrayList2 = null)
    {
      if (zzaPD != null) {
        localList = Arrays.asList(zzaPD);
      }
      return new PlaceFilter(localArrayList1, zzaPA, localList, localArrayList2);
      localArrayList1 = null;
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.PlaceFilter.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */