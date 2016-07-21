package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class ParcelableEvent
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzc();
  final int mVersionCode;
  final String zzLq;
  final String zzauL;
  final List zzauR;
  final boolean zzauS;
  final boolean zzauT;
  final boolean zzauU;
  final String zzauV;
  final TextInsertedDetails zzauW;
  final TextDeletedDetails zzauX;
  final ValuesAddedDetails zzauY;
  final ValuesRemovedDetails zzauZ;
  final ValuesSetDetails zzava;
  final ValueChangedDetails zzavb;
  final ReferenceShiftedDetails zzavc;
  final ObjectChangedDetails zzavd;
  final FieldChangedDetails zzave;
  final String zzrG;
  
  ParcelableEvent(int paramInt, String paramString1, String paramString2, List paramList, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString3, String paramString4, TextInsertedDetails paramTextInsertedDetails, TextDeletedDetails paramTextDeletedDetails, ValuesAddedDetails paramValuesAddedDetails, ValuesRemovedDetails paramValuesRemovedDetails, ValuesSetDetails paramValuesSetDetails, ValueChangedDetails paramValueChangedDetails, ReferenceShiftedDetails paramReferenceShiftedDetails, ObjectChangedDetails paramObjectChangedDetails, FieldChangedDetails paramFieldChangedDetails)
  {
    mVersionCode = paramInt;
    zzLq = paramString1;
    zzrG = paramString2;
    zzauR = paramList;
    zzauS = paramBoolean1;
    zzauT = paramBoolean2;
    zzauU = paramBoolean3;
    zzauL = paramString3;
    zzauV = paramString4;
    zzauW = paramTextInsertedDetails;
    zzauX = paramTextDeletedDetails;
    zzauY = paramValuesAddedDetails;
    zzauZ = paramValuesRemovedDetails;
    zzava = paramValuesSetDetails;
    zzavb = paramValueChangedDetails;
    zzavc = paramReferenceShiftedDetails;
    zzavd = paramObjectChangedDetails;
    zzave = paramFieldChangedDetails;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.event.ParcelableEvent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */