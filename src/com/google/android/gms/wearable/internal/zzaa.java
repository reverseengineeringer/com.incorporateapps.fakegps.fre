package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataItemAsset;

public class zzaa
  implements DataItemAsset
{
  private final String zzvs;
  private final String zzyv;
  
  public zzaa(DataItemAsset paramDataItemAsset)
  {
    zzyv = paramDataItemAsset.getId();
    zzvs = paramDataItemAsset.getDataItemKey();
  }
  
  public String getDataItemKey()
  {
    return zzvs;
  }
  
  public String getId()
  {
    return zzyv;
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DataItemAssetEntity[");
    localStringBuilder.append("@");
    localStringBuilder.append(Integer.toHexString(hashCode()));
    if (zzyv == null) {
      localStringBuilder.append(",noid");
    }
    for (;;)
    {
      localStringBuilder.append(", key=");
      localStringBuilder.append(zzvs);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
      localStringBuilder.append(",");
      localStringBuilder.append(zzyv);
    }
  }
  
  public DataItemAsset zzIL()
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzaa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */