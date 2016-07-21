package com.google.android.gms.location.places;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class zza
{
  static List zzf(Collection paramCollection)
  {
    if ((paramCollection == null) || (paramCollection.isEmpty())) {
      return Collections.emptyList();
    }
    return new ArrayList(paramCollection);
  }
  
  static Set zzw(List paramList)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      return Collections.emptySet();
    }
    return Collections.unmodifiableSet(new HashSet(paramList));
  }
  
  public abstract Set getPlaceIds();
  
  public boolean isRestrictedToPlacesOpenNow()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */