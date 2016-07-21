package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person.Organizations;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class PersonEntity$OrganizationsEntity
  extends FastSafeParcelableJsonResponse
  implements Person.Organizations
{
  public static final zzh CREATOR = new zzh();
  private static final HashMap zzbeM;
  String mName;
  final int mVersionCode;
  int zzabB;
  String zzapg;
  String zzaxl;
  final Set zzbeN;
  String zzbfA;
  String zzbfk;
  String zzbgp;
  String zzbgq;
  boolean zzbgr;
  
  static
  {
    HashMap localHashMap = new HashMap();
    zzbeM = localHashMap;
    localHashMap.put("department", FastJsonResponse.Field.zzl("department", 2));
    zzbeM.put("description", FastJsonResponse.Field.zzl("description", 3));
    zzbeM.put("endDate", FastJsonResponse.Field.zzl("endDate", 4));
    zzbeM.put("location", FastJsonResponse.Field.zzl("location", 5));
    zzbeM.put("name", FastJsonResponse.Field.zzl("name", 6));
    zzbeM.put("primary", FastJsonResponse.Field.zzk("primary", 7));
    zzbeM.put("startDate", FastJsonResponse.Field.zzl("startDate", 8));
    zzbeM.put("title", FastJsonResponse.Field.zzl("title", 9));
    zzbeM.put("type", FastJsonResponse.Field.zza("type", 10, new StringToIntConverter().zzh("work", 0).zzh("school", 1), false));
  }
  
  public PersonEntity$OrganizationsEntity()
  {
    mVersionCode = 1;
    zzbeN = new HashSet();
  }
  
  PersonEntity$OrganizationsEntity(Set paramSet, int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean, String paramString6, String paramString7, int paramInt2)
  {
    zzbeN = paramSet;
    mVersionCode = paramInt1;
    zzbgp = paramString1;
    zzaxl = paramString2;
    zzbfk = paramString3;
    zzbgq = paramString4;
    mName = paramString5;
    zzbgr = paramBoolean;
    zzbfA = paramString6;
    zzapg = paramString7;
    zzabB = paramInt2;
  }
  
  public final int describeContents()
  {
    zzh localzzh = CREATOR;
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof OrganizationsEntity)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    paramObject = (OrganizationsEntity)paramObject;
    Iterator localIterator = zzbeM.values().iterator();
    while (localIterator.hasNext())
    {
      FastJsonResponse.Field localField = (FastJsonResponse.Field)localIterator.next();
      if (zza(localField))
      {
        if (((OrganizationsEntity)paramObject).zza(localField))
        {
          if (!zzb(localField).equals(((OrganizationsEntity)paramObject).zzb(localField))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (((OrganizationsEntity)paramObject).zza(localField)) {
        return false;
      }
    }
    return true;
  }
  
  public final String getDepartment()
  {
    return zzbgp;
  }
  
  public final String getDescription()
  {
    return zzaxl;
  }
  
  public final String getEndDate()
  {
    return zzbfk;
  }
  
  public final String getLocation()
  {
    return zzbgq;
  }
  
  public final String getName()
  {
    return mName;
  }
  
  public final String getStartDate()
  {
    return zzbfA;
  }
  
  public final String getTitle()
  {
    return zzapg;
  }
  
  public final int getType()
  {
    return zzabB;
  }
  
  public final boolean hasDepartment()
  {
    return zzbeN.contains(Integer.valueOf(2));
  }
  
  public final boolean hasDescription()
  {
    return zzbeN.contains(Integer.valueOf(3));
  }
  
  public final boolean hasEndDate()
  {
    return zzbeN.contains(Integer.valueOf(4));
  }
  
  public final boolean hasLocation()
  {
    return zzbeN.contains(Integer.valueOf(5));
  }
  
  public final boolean hasName()
  {
    return zzbeN.contains(Integer.valueOf(6));
  }
  
  public final boolean hasPrimary()
  {
    return zzbeN.contains(Integer.valueOf(7));
  }
  
  public final boolean hasStartDate()
  {
    return zzbeN.contains(Integer.valueOf(8));
  }
  
  public final boolean hasTitle()
  {
    return zzbeN.contains(Integer.valueOf(9));
  }
  
  public final boolean hasType()
  {
    return zzbeN.contains(Integer.valueOf(10));
  }
  
  public final int hashCode()
  {
    Iterator localIterator = zzbeM.values().iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      FastJsonResponse.Field localField = (FastJsonResponse.Field)localIterator.next();
      if (!zza(localField)) {
        break label68;
      }
      int j = localField.zzrs();
      i = zzb(localField).hashCode() + (i + j);
    }
    label68:
    for (;;)
    {
      break;
      return i;
    }
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final boolean isPrimary()
  {
    return zzbgr;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh localzzh = CREATOR;
    zzh.zza(this, paramParcel, paramInt);
  }
  
  public final HashMap zzFl()
  {
    return zzbeM;
  }
  
  public final OrganizationsEntity zzFw()
  {
    return this;
  }
  
  protected final boolean zza(FastJsonResponse.Field paramField)
  {
    return zzbeN.contains(Integer.valueOf(paramField.zzrs()));
  }
  
  protected final Object zzb(FastJsonResponse.Field paramField)
  {
    switch (paramField.zzrs())
    {
    default: 
      throw new IllegalStateException("Unknown safe parcelable id=" + paramField.zzrs());
    case 2: 
      return zzbgp;
    case 3: 
      return zzaxl;
    case 4: 
      return zzbfk;
    case 5: 
      return zzbgq;
    case 6: 
      return mName;
    case 7: 
      return Boolean.valueOf(zzbgr);
    case 8: 
      return zzbfA;
    case 9: 
      return zzapg;
    }
    return Integer.valueOf(zzabB);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.model.people.PersonEntity.OrganizationsEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */