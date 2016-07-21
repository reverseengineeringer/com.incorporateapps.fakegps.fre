package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmr;
import java.util.Set;

public final class UserDataType
  implements SafeParcelable
{
  public static final zzm CREATOR = new zzm();
  public static final UserDataType zzaPX = zzy("test_type", 1);
  public static final UserDataType zzaPY = zzy("labeled_place", 6);
  public static final UserDataType zzaPZ = zzy("here_content", 7);
  public static final Set zzaQa = zzmr.zza(zzaPX, zzaPY, zzaPZ);
  final int mVersionCode;
  final String zzJN;
  final int zzaQb;
  
  UserDataType(int paramInt1, String paramString, int paramInt2)
  {
    zzx.zzcM(paramString);
    mVersionCode = paramInt1;
    zzJN = paramString;
    zzaQb = paramInt2;
  }
  
  private static UserDataType zzy(String paramString, int paramInt)
  {
    return new UserDataType(0, paramString, paramInt);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof UserDataType)) {
        return false;
      }
      paramObject = (UserDataType)paramObject;
    } while ((zzJN.equals(zzJN)) && (zzaQb == zzaQb));
    return false;
  }
  
  public final int hashCode()
  {
    return zzJN.hashCode();
  }
  
  public final String toString()
  {
    return zzJN;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzm.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.UserDataType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */