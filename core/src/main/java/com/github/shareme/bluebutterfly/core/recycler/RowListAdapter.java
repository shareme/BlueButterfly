/*
Copyright 2015 Marcin Korniluk 'Zielony'
Modifications Copyright(C) 2016 Fred Grott(GrottWorkShop)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

 */
package com.github.shareme.bluebutterfly.core.recycler;

import android.view.ViewGroup;

import com.github.shareme.bluebutterfly.core.widget.RecyclerView;

import java.util.List;


/**
 * Created by Marcin on 2016-06-10.
 */
@SuppressWarnings("unused")
public class RowListAdapter<Type> extends RecyclerView.ListAdapter<RowViewHolder, Type> {
    private RowFactory factory;

    public RowListAdapter(RowFactory factory) {
        this.factory = factory;
    }

    public RowListAdapter(List<Type> items, RowFactory factory) {
        super(items);
        this.factory = factory;
    }

    @Override
    public RowViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        Row row = factory.create(viewGroup);
        RowViewHolder viewHolder = new RowViewHolder(row.getView());
        viewHolder.setRow(row);
        return viewHolder;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void onBindViewHolder(final RowViewHolder holder, final int position) {
        Type data = getItem(position);
        Row row = holder.getRow();
        row.bind(data);
        row.getView().setOnClickListener(view -> fireOnItemClickedEvent(holder.getAdapterPosition()));
    }

    @Override
    public int getItemViewType(int arg0) {
        return 0;
    }


}

