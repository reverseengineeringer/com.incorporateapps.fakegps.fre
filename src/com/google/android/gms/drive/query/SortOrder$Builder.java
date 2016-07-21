package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.util.ArrayList;
import java.util.List;

public class SortOrder$Builder
{
  private final List zzaud = new ArrayList();
  private boolean zzaue = false;
  
  public Builder addSortAscending(SortableMetadataField paramSortableMetadataField)
  {
    zzaud.add(new FieldWithSortOrder(paramSortableMetadataField.getName(), true));
    return this;
  }
  
  public Builder addSortDescending(SortableMetadataField paramSortableMetadataField)
  {
    zzaud.add(new FieldWithSortOrder(paramSortableMetadataField.getName(), false));
    return this;
  }
  
  public SortOrder build()
  {
    return new SortOrder(zzaud, zzaue, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.query.SortOrder.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */