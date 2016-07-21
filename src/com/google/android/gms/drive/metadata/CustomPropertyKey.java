package com.google.android.gms.drive.metadata;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class CustomPropertyKey
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzc();
  public static final int PRIVATE = 1;
  public static final int PUBLIC = 0;
  private static final Pattern zzasJ = Pattern.compile("[\\w.!@$%^&*()/-]+");
  final int mVersionCode;
  final int mVisibility;
  final String zzvs;
  
  CustomPropertyKey(int paramInt1, String paramString, int paramInt2)
  {
    zzx.zzb(paramString, "key");
    zzx.zzb(zzasJ.matcher(paramString).matches(), "key name characters must be alphanumeric or one of .!@$%^&*()-_/");
    boolean bool1 = bool2;
    if (paramInt2 != 0) {
      if (paramInt2 != 1) {
        break label69;
      }
    }
    label69:
    for (bool1 = bool2;; bool1 = false)
    {
      zzx.zzb(bool1, "visibility must be either PUBLIC or PRIVATE");
      mVersionCode = paramInt1;
      zzvs = paramString;
      mVisibility = paramInt2;
      return;
    }
  }
  
  public CustomPropertyKey(String paramString, int paramInt)
  {
    this(1, paramString, paramInt);
  }
  
  public static CustomPropertyKey fromJson(JSONObject paramJSONObject)
  {
    return new CustomPropertyKey(paramJSONObject.getString("key"), paramJSONObject.getInt("visibility"));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      do
      {
        return false;
        if (paramObject == this) {
          return true;
        }
      } while (!(paramObject instanceof CustomPropertyKey));
      paramObject = (CustomPropertyKey)paramObject;
    } while ((!((CustomPropertyKey)paramObject).getKey().equals(zzvs)) || (((CustomPropertyKey)paramObject).getVisibility() != mVisibility));
    return true;
  }
  
  public String getKey()
  {
    return zzvs;
  }
  
  public int getVisibility()
  {
    return mVisibility;
  }
  
  public int hashCode()
  {
    return (zzvs + mVisibility).hashCode();
  }
  
  public JSONObject toJson()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("key", getKey());
    localJSONObject.put("visibility", getVisibility());
    return localJSONObject;
  }
  
  public String toString()
  {
    return "CustomPropertyKey(" + zzvs + "," + mVisibility + ")";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.metadata.CustomPropertyKey
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */