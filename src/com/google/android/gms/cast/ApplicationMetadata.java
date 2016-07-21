package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ApplicationMetadata
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zza();
  String mName;
  private final int mVersionCode;
  String zzZC;
  List zzZD;
  String zzZE;
  Uri zzZF;
  List zzxX;
  
  private ApplicationMetadata()
  {
    mVersionCode = 1;
    zzxX = new ArrayList();
    zzZD = new ArrayList();
  }
  
  ApplicationMetadata(int paramInt, String paramString1, String paramString2, List paramList1, List paramList2, String paramString3, Uri paramUri)
  {
    mVersionCode = paramInt;
    zzZC = paramString1;
    mName = paramString2;
    zzxX = paramList1;
    zzZD = paramList2;
    zzZE = paramString3;
    zzZF = paramUri;
  }
  
  public final boolean areNamespacesSupported(List paramList)
  {
    return (zzZD != null) && (zzZD.containsAll(paramList));
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof ApplicationMetadata)) {
        return false;
      }
      paramObject = (ApplicationMetadata)paramObject;
    } while ((zzf.zza(zzZC, zzZC)) && (zzf.zza(zzxX, zzxX)) && (zzf.zza(mName, mName)) && (zzf.zza(zzZD, zzZD)) && (zzf.zza(zzZE, zzZE)) && (zzf.zza(zzZF, zzZF)));
    return false;
  }
  
  public final String getApplicationId()
  {
    return zzZC;
  }
  
  public final List getImages()
  {
    return zzxX;
  }
  
  public final String getName()
  {
    return mName;
  }
  
  public final String getSenderAppIdentifier()
  {
    return zzZE;
  }
  
  public final List getSupportedNamespaces()
  {
    return Collections.unmodifiableList(zzZD);
  }
  
  final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { Integer.valueOf(mVersionCode), zzZC, mName, zzxX, zzZD, zzZE, zzZF });
  }
  
  public final boolean isNamespaceSupported(String paramString)
  {
    return (zzZD != null) && (zzZD.contains(paramString));
  }
  
  public final String toString()
  {
    int j = 0;
    StringBuilder localStringBuilder = new StringBuilder("applicationId: ").append(zzZC).append(", name: ").append(mName).append(", images.count: ");
    if (zzxX == null)
    {
      i = 0;
      localStringBuilder = localStringBuilder.append(i).append(", namespaces.count: ");
      if (zzZD != null) {
        break label111;
      }
    }
    label111:
    for (int i = j;; i = zzZD.size())
    {
      return i + ", senderAppIdentifier: " + zzZE + ", senderAppLaunchUrl: " + zzZF;
      i = zzxX.size();
      break;
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public final Uri zznx()
  {
    return zzZF;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.ApplicationMetadata
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */