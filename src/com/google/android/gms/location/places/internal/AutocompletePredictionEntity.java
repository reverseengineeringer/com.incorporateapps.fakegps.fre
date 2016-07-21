package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.style.CharacterStyle;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.places.AutocompletePrediction;
import java.util.Collections;
import java.util.List;

public class AutocompletePredictionEntity
  implements SafeParcelable, AutocompletePrediction
{
  public static final Parcelable.Creator CREATOR = new zza();
  private static final List zzaQc = Collections.emptyList();
  final int mVersionCode;
  final String zzaPH;
  final List zzaPd;
  final String zzaQd;
  final List zzaQe;
  final int zzaQf;
  final String zzaQg;
  final List zzaQh;
  final String zzaQi;
  final List zzaQj;
  
  AutocompletePredictionEntity(int paramInt1, String paramString1, List paramList1, int paramInt2, String paramString2, List paramList2, String paramString3, List paramList3, String paramString4, List paramList4)
  {
    mVersionCode = paramInt1;
    zzaPH = paramString1;
    zzaPd = paramList1;
    zzaQf = paramInt2;
    zzaQd = paramString2;
    zzaQe = paramList2;
    zzaQg = paramString3;
    zzaQh = paramList3;
    zzaQi = paramString4;
    zzaQj = paramList4;
  }
  
  public static AutocompletePredictionEntity zza(String paramString1, List paramList1, int paramInt, String paramString2, List paramList2, String paramString3, List paramList3, String paramString4, List paramList4)
  {
    return new AutocompletePredictionEntity(0, paramString1, paramList1, paramInt, (String)zzx.zzz(paramString2), paramList2, paramString3, paramList3, paramString4, paramList4);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof AutocompletePredictionEntity)) {
        return false;
      }
      paramObject = (AutocompletePredictionEntity)paramObject;
    } while ((zzw.equal(zzaPH, zzaPH)) && (zzw.equal(zzaPd, zzaPd)) && (zzw.equal(Integer.valueOf(zzaQf), Integer.valueOf(zzaQf))) && (zzw.equal(zzaQd, zzaQd)) && (zzw.equal(zzaQe, zzaQe)) && (zzw.equal(zzaQg, zzaQg)) && (zzw.equal(zzaQh, zzaQh)) && (zzw.equal(zzaQi, zzaQi)) && (zzw.equal(zzaQj, zzaQj)));
    return false;
  }
  
  public String getDescription()
  {
    return zzaQd;
  }
  
  public CharSequence getFullText(CharacterStyle paramCharacterStyle)
  {
    return zzc.zza(zzaQd, zzaQe, paramCharacterStyle);
  }
  
  public List getMatchedSubstrings()
  {
    return zzaQe;
  }
  
  public String getPlaceId()
  {
    return zzaPH;
  }
  
  public List getPlaceTypes()
  {
    return zzaPd;
  }
  
  public CharSequence getPrimaryText(CharacterStyle paramCharacterStyle)
  {
    return zzc.zza(zzaQg, zzaQh, paramCharacterStyle);
  }
  
  public CharSequence getSecondaryText(CharacterStyle paramCharacterStyle)
  {
    return zzc.zza(zzaQi, zzaQj, paramCharacterStyle);
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzaPH, zzaPd, Integer.valueOf(zzaQf), zzaQd, zzaQe, zzaQg, zzaQh, zzaQi, zzaQj });
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("placeId", zzaPH).zzg("placeTypes", zzaPd).zzg("fullText", zzaQd).zzg("fullTextMatchedSubstrings", zzaQe).zzg("primaryText", zzaQg).zzg("primaryTextMatchedSubstrings", zzaQh).zzg("secondaryText", zzaQi).zzg("secondaryTextMatchedSubstrings", zzaQj).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public AutocompletePrediction zzzf()
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.internal.AutocompletePredictionEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */