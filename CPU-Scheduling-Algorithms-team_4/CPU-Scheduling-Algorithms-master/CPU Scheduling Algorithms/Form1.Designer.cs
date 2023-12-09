
namespace CPU_Scheduling_Algorithms
{
    partial class MainForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle1 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle2 = new System.Windows.Forms.DataGridViewCellStyle();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(MainForm));
            this.txtConsole = new System.Windows.Forms.TextBox();
            this.CountTime = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.ClearBtn = new System.Windows.Forms.Button();
            this.GanttChartPanel = new System.Windows.Forms.Panel();
            this.deleteBtn = new System.Windows.Forms.Button();
            this.addBtn = new System.Windows.Forms.Button();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.stt = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.CotThoiGianDen = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.CotThoiGianXuLy = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.panel1 = new System.Windows.Forms.Panel();
            this.PreemptiveBtn = new System.Windows.Forms.RadioButton();
            this.NonPreemptiveBtn = new System.Windows.Forms.RadioButton();
            this.label4 = new System.Windows.Forms.Label();
            this.RunBtn = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.toolStripMenuItem1 = new System.Windows.Forms.ToolStripMenuItem();
            this.FCFS_menu = new System.Windows.Forms.ToolStripMenuItem();
            this.SJF_menu = new System.Windows.Forms.ToolStripMenuItem();
            this.RR_menu = new System.Windows.Forms.ToolStripMenuItem();
            this.Priority_menu = new System.Windows.Forms.ToolStripMenuItem();
            this.chọnThuậtToánTạiĐâyToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.panel2 = new System.Windows.Forms.Panel();
            this.Algorithm = new System.Windows.Forms.TextBox();
            this.toolTip1 = new System.Windows.Forms.ToolTip(this.components);
            this.qInput = new System.Windows.Forms.NumericUpDown();
            this.label5 = new System.Windows.Forms.Label();
            this.RRPanel = new System.Windows.Forms.Panel();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            this.panel1.SuspendLayout();
            this.menuStrip1.SuspendLayout();
            this.panel2.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.qInput)).BeginInit();
            this.RRPanel.SuspendLayout();
            this.SuspendLayout();
            // 
            // txtConsole
            // 
            this.txtConsole.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.txtConsole.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(64)))), ((int)(((byte)(64)))));
            this.txtConsole.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtConsole.ForeColor = System.Drawing.Color.Lime;
            this.txtConsole.Location = new System.Drawing.Point(47, 502);
            this.txtConsole.Margin = new System.Windows.Forms.Padding(4);
            this.txtConsole.Multiline = true;
            this.txtConsole.Name = "txtConsole";
            this.txtConsole.ReadOnly = true;
            this.txtConsole.ScrollBars = System.Windows.Forms.ScrollBars.Both;
            this.txtConsole.Size = new System.Drawing.Size(911, 160);
            this.txtConsole.TabIndex = 22;
            this.txtConsole.WordWrap = false;
            // 
            // CountTime
            // 
            this.CountTime.AutoSize = true;
            this.CountTime.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(128)))), ((int)(((byte)(255)))));
            this.CountTime.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(163)));
            this.CountTime.ForeColor = System.Drawing.Color.White;
            this.CountTime.Location = new System.Drawing.Point(109, 443);
            this.CountTime.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.CountTime.Name = "CountTime";
            this.CountTime.Size = new System.Drawing.Size(19, 20);
            this.CountTime.TabIndex = 18;
            this.CountTime.Text = "0";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(128)))), ((int)(((byte)(255)))));
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(163)));
            this.label2.ForeColor = System.Drawing.Color.White;
            this.label2.Location = new System.Drawing.Point(52, 443);
            this.label2.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(56, 20);
            this.label2.TabIndex = 16;
            this.label2.Text = "Time:";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(192)))), ((int)(((byte)(128)))));
            this.label3.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.ForeColor = System.Drawing.Color.Black;
            this.label3.Location = new System.Drawing.Point(47, 326);
            this.label3.Margin = new System.Windows.Forms.Padding(8, 0, 4, 0);
            this.label3.Name = "label3";
            this.label3.Padding = new System.Windows.Forms.Padding(4);
            this.label3.Size = new System.Drawing.Size(105, 28);
            this.label3.TabIndex = 27;
            this.label3.Text = "Gantt Chart";
            // 
            // ClearBtn
            // 
            this.ClearBtn.BackColor = System.Drawing.Color.Red;
            this.ClearBtn.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.ClearBtn.ForeColor = System.Drawing.Color.White;
            this.ClearBtn.Location = new System.Drawing.Point(216, 264);
            this.ClearBtn.Margin = new System.Windows.Forms.Padding(4);
            this.ClearBtn.Name = "ClearBtn";
            this.ClearBtn.Size = new System.Drawing.Size(94, 58);
            this.ClearBtn.TabIndex = 26;
            this.ClearBtn.Text = "Reset";
            this.toolTip1.SetToolTip(this.ClearBtn, "Nút làm lại cuộc đời");
            this.ClearBtn.UseVisualStyleBackColor = false;
            this.ClearBtn.Click += new System.EventHandler(this.ClearBtn_Click);
            // 
            // GanttChartPanel
            // 
            this.GanttChartPanel.AutoScroll = true;
            this.GanttChartPanel.AutoScrollMargin = new System.Drawing.Size(5000, 0);
            this.GanttChartPanel.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.GanttChartPanel.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.GanttChartPanel.Location = new System.Drawing.Point(47, 361);
            this.GanttChartPanel.Margin = new System.Windows.Forms.Padding(4);
            this.GanttChartPanel.Name = "GanttChartPanel";
            this.GanttChartPanel.Size = new System.Drawing.Size(911, 67);
            this.GanttChartPanel.TabIndex = 25;
            // 
            // deleteBtn
            // 
            this.deleteBtn.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(255)))), ((int)(((byte)(255)))));
            this.deleteBtn.Location = new System.Drawing.Point(864, 141);
            this.deleteBtn.Margin = new System.Windows.Forms.Padding(4);
            this.deleteBtn.Name = "deleteBtn";
            this.deleteBtn.Size = new System.Drawing.Size(94, 47);
            this.deleteBtn.TabIndex = 24;
            this.deleteBtn.Text = "Remove";
            this.deleteBtn.UseVisualStyleBackColor = false;
            this.deleteBtn.Click += new System.EventHandler(this.deleteBtn_Click);
            // 
            // addBtn
            // 
            this.addBtn.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(255)))), ((int)(((byte)(128)))));
            this.addBtn.Location = new System.Drawing.Point(864, 87);
            this.addBtn.Margin = new System.Windows.Forms.Padding(4);
            this.addBtn.Name = "addBtn";
            this.addBtn.Size = new System.Drawing.Size(94, 47);
            this.addBtn.TabIndex = 23;
            this.addBtn.Text = "Add";
            this.addBtn.UseVisualStyleBackColor = false;
            this.addBtn.Click += new System.EventHandler(this.addBtn_Click);
            // 
            // dataGridView1
            // 
            this.dataGridView1.BackgroundColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(255)))), ((int)(((byte)(192)))));
            dataGridViewCellStyle1.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleCenter;
            dataGridViewCellStyle1.BackColor = System.Drawing.SystemColors.Control;
            dataGridViewCellStyle1.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(163)));
            dataGridViewCellStyle1.ForeColor = System.Drawing.SystemColors.WindowText;
            dataGridViewCellStyle1.SelectionBackColor = System.Drawing.SystemColors.Highlight;
            dataGridViewCellStyle1.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle1.WrapMode = System.Windows.Forms.DataGridViewTriState.True;
            this.dataGridView1.ColumnHeadersDefaultCellStyle = dataGridViewCellStyle1;
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.stt,
            this.CotThoiGianDen,
            this.CotThoiGianXuLy});
            dataGridViewCellStyle2.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleCenter;
            dataGridViewCellStyle2.BackColor = System.Drawing.SystemColors.Window;
            dataGridViewCellStyle2.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(163)));
            dataGridViewCellStyle2.ForeColor = System.Drawing.SystemColors.ControlText;
            dataGridViewCellStyle2.SelectionBackColor = System.Drawing.SystemColors.Highlight;
            dataGridViewCellStyle2.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle2.WrapMode = System.Windows.Forms.DataGridViewTriState.False;
            this.dataGridView1.DefaultCellStyle = dataGridViewCellStyle2;
            this.dataGridView1.Location = new System.Drawing.Point(322, 89);
            this.dataGridView1.Margin = new System.Windows.Forms.Padding(4);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.RowHeadersWidth = 51;
            this.dataGridView1.RowTemplate.Height = 24;
            this.dataGridView1.Size = new System.Drawing.Size(533, 243);
            this.dataGridView1.TabIndex = 19;
            this.dataGridView1.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridView1_CellContentClick);
            // 
            // stt
            // 
            this.stt.HeaderText = "Process";
            this.stt.MinimumWidth = 6;
            this.stt.Name = "stt";
            this.stt.ReadOnly = true;
            this.stt.Width = 125;
            // 
            // CotThoiGianDen
            // 
            this.CotThoiGianDen.HeaderText = "Arrival time";
            this.CotThoiGianDen.MinimumWidth = 6;
            this.CotThoiGianDen.Name = "CotThoiGianDen";
            this.CotThoiGianDen.Width = 190;
            // 
            // CotThoiGianXuLy
            // 
            this.CotThoiGianXuLy.HeaderText = "Burst time";
            this.CotThoiGianXuLy.MinimumWidth = 6;
            this.CotThoiGianXuLy.Name = "CotThoiGianXuLy";
            this.CotThoiGianXuLy.Width = 190;
            // 
            // panel1
            // 
            this.panel1.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.panel1.Controls.Add(this.PreemptiveBtn);
            this.panel1.Controls.Add(this.NonPreemptiveBtn);
            this.panel1.Enabled = false;
            this.panel1.Location = new System.Drawing.Point(112, 132);
            this.panel1.Margin = new System.Windows.Forms.Padding(4);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(201, 85);
            this.panel1.TabIndex = 21;
            // 
            // PreemptiveBtn
            // 
            this.PreemptiveBtn.AutoSize = true;
            this.PreemptiveBtn.Font = new System.Drawing.Font("Microsoft Sans Serif", 7.6F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.PreemptiveBtn.Location = new System.Drawing.Point(19, 45);
            this.PreemptiveBtn.Margin = new System.Windows.Forms.Padding(4);
            this.PreemptiveBtn.Name = "PreemptiveBtn";
            this.PreemptiveBtn.Size = new System.Drawing.Size(181, 20);
            this.PreemptiveBtn.TabIndex = 3;
            this.PreemptiveBtn.Text = "Không độc quyền (SRTN)";
            this.PreemptiveBtn.UseVisualStyleBackColor = true;
            // 
            // NonPreemptiveBtn
            // 
            this.NonPreemptiveBtn.AutoSize = true;
            this.NonPreemptiveBtn.Checked = true;
            this.NonPreemptiveBtn.Location = new System.Drawing.Point(19, 16);
            this.NonPreemptiveBtn.Margin = new System.Windows.Forms.Padding(4);
            this.NonPreemptiveBtn.Name = "NonPreemptiveBtn";
            this.NonPreemptiveBtn.Size = new System.Drawing.Size(141, 22);
            this.NonPreemptiveBtn.TabIndex = 2;
            this.NonPreemptiveBtn.TabStop = true;
            this.NonPreemptiveBtn.Text = "Độc quyền (SJF)";
            this.NonPreemptiveBtn.UseVisualStyleBackColor = true;
            this.NonPreemptiveBtn.CheckedChanged += new System.EventHandler(this.NonPreemptiveBtn_CheckedChanged_1);
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(192)))), ((int)(((byte)(128)))));
            this.label4.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(47, 475);
            this.label4.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label4.Name = "label4";
            this.label4.Padding = new System.Windows.Forms.Padding(10, 4, 10, 4);
            this.label4.Size = new System.Drawing.Size(78, 28);
            this.label4.TabIndex = 28;
            this.label4.Text = "Result";
            // 
            // RunBtn
            // 
            this.RunBtn.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(255)))));
            this.RunBtn.Location = new System.Drawing.Point(864, 273);
            this.RunBtn.Margin = new System.Windows.Forms.Padding(4);
            this.RunBtn.Name = "RunBtn";
            this.RunBtn.Size = new System.Drawing.Size(94, 58);
            this.RunBtn.TabIndex = 20;
            this.RunBtn.Text = "Run";
            this.RunBtn.UseVisualStyleBackColor = false;
            this.RunBtn.Click += new System.EventHandler(this.startBtn_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(255)))), ((int)(((byte)(192)))));
            this.label1.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.label1.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 13.8F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(163)));
            this.label1.Location = new System.Drawing.Point(351, 41);
            this.label1.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(385, 31);
            this.label1.TabIndex = 17;
            this.label1.Text = "Process moderation algorithms.";
            // 
            // menuStrip1
            // 
            this.menuStrip1.BackColor = System.Drawing.Color.LightSkyBlue;
            this.menuStrip1.ImageScalingSize = new System.Drawing.Size(20, 20);
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.toolStripMenuItem1,
            this.chọnThuậtToánTạiĐâyToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Padding = new System.Windows.Forms.Padding(9, 2, 0, 2);
            this.menuStrip1.Size = new System.Drawing.Size(1016, 31);
            this.menuStrip1.TabIndex = 33;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // toolStripMenuItem1
            // 
            this.toolStripMenuItem1.BackColor = System.Drawing.Color.DeepSkyBlue;
            this.toolStripMenuItem1.Checked = true;
            this.toolStripMenuItem1.CheckState = System.Windows.Forms.CheckState.Checked;
            this.toolStripMenuItem1.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.FCFS_menu,
            this.SJF_menu,
            this.RR_menu,
            this.Priority_menu});
            this.toolStripMenuItem1.Font = new System.Drawing.Font("Segoe UI", 10F);
            this.toolStripMenuItem1.ForeColor = System.Drawing.Color.Black;
            this.toolStripMenuItem1.ImageScaling = System.Windows.Forms.ToolStripItemImageScaling.None;
            this.toolStripMenuItem1.Name = "toolStripMenuItem1";
            this.toolStripMenuItem1.Size = new System.Drawing.Size(155, 27);
            this.toolStripMenuItem1.Text = "Chọn Thuật Toán";
            // 
            // FCFS_menu
            // 
            this.FCFS_menu.DoubleClickEnabled = true;
            this.FCFS_menu.Name = "FCFS_menu";
            this.FCFS_menu.Size = new System.Drawing.Size(206, 28);
            this.FCFS_menu.Text = "FCFS";
            this.FCFS_menu.Click += new System.EventHandler(this.FCFS_menu_Click);
            // 
            // SJF_menu
            // 
            this.SJF_menu.Name = "SJF_menu";
            this.SJF_menu.Size = new System.Drawing.Size(206, 28);
            this.SJF_menu.Text = "SJF";
            this.SJF_menu.Click += new System.EventHandler(this.SJF_menu_Click);
            // 
            // RR_menu
            // 
            this.RR_menu.Name = "RR_menu";
            this.RR_menu.Size = new System.Drawing.Size(206, 28);
            this.RR_menu.Text = "Round Robin";
            this.RR_menu.Click += new System.EventHandler(this.RR_menu_Click);
            // 
            // Priority_menu
            // 
            this.Priority_menu.Name = "Priority_menu";
            this.Priority_menu.Size = new System.Drawing.Size(206, 28);
            this.Priority_menu.Text = "----------------";
            this.Priority_menu.Click += new System.EventHandler(this.Priority_menu_Click);
            // 
            // chọnThuậtToánTạiĐâyToolStripMenuItem
            // 
            this.chọnThuậtToánTạiĐâyToolStripMenuItem.Enabled = false;
            this.chọnThuậtToánTạiĐâyToolStripMenuItem.Font = new System.Drawing.Font("Segoe UI", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(163)));
            this.chọnThuậtToánTạiĐâyToolStripMenuItem.Name = "chọnThuậtToánTạiĐâyToolStripMenuItem";
            this.chọnThuậtToánTạiĐâyToolStripMenuItem.ShowShortcutKeys = false;
            this.chọnThuậtToánTạiĐâyToolStripMenuItem.Size = new System.Drawing.Size(227, 27);
            this.chọnThuậtToánTạiĐâyToolStripMenuItem.Text = "<---- Chọn thuật toán tại đây";
            // 
            // panel2
            // 
            this.panel2.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.panel2.Controls.Add(this.Algorithm);
            this.panel2.Location = new System.Drawing.Point(112, 79);
            this.panel2.Margin = new System.Windows.Forms.Padding(4);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(201, 47);
            this.panel2.TabIndex = 34;
            // 
            // Algorithm
            // 
            this.Algorithm.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Algorithm.ForeColor = System.Drawing.Color.Black;
            this.Algorithm.Location = new System.Drawing.Point(16, 9);
            this.Algorithm.Margin = new System.Windows.Forms.Padding(4);
            this.Algorithm.Name = "Algorithm";
            this.Algorithm.ReadOnly = true;
            this.Algorithm.Size = new System.Drawing.Size(150, 24);
            this.Algorithm.TabIndex = 0;
            this.Algorithm.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // qInput
            // 
            this.qInput.Location = new System.Drawing.Point(90, 2);
            this.qInput.Margin = new System.Windows.Forms.Padding(4, 3, 4, 3);
            this.qInput.Name = "qInput";
            this.qInput.Size = new System.Drawing.Size(94, 24);
            this.qInput.TabIndex = 35;
            this.qInput.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(163)));
            this.label5.Location = new System.Drawing.Point(4, 4);
            this.label5.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(76, 18);
            this.label5.TabIndex = 36;
            this.label5.Text = "Quantum";
            // 
            // RRPanel
            // 
            this.RRPanel.Controls.Add(this.qInput);
            this.RRPanel.Controls.Add(this.label5);
            this.RRPanel.Location = new System.Drawing.Point(112, 223);
            this.RRPanel.Margin = new System.Windows.Forms.Padding(4, 3, 4, 3);
            this.RRPanel.Name = "RRPanel";
            this.RRPanel.Size = new System.Drawing.Size(202, 36);
            this.RRPanel.TabIndex = 37;
            this.RRPanel.Visible = false;
            // 
            // MainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(9F, 18F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1016, 664);
            this.Controls.Add(this.panel2);
            this.Controls.Add(this.menuStrip1);
            this.Controls.Add(this.txtConsole);
            this.Controls.Add(this.CountTime);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.ClearBtn);
            this.Controls.Add(this.GanttChartPanel);
            this.Controls.Add(this.deleteBtn);
            this.Controls.Add(this.addBtn);
            this.Controls.Add(this.dataGridView1);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.RunBtn);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.RRPanel);
            this.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(163)));
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MainMenuStrip = this.menuStrip1;
            this.Margin = new System.Windows.Forms.Padding(4);
            this.Name = "MainForm";
            this.Text = "Algorithms_Team.4";
            this.Load += new System.EventHandler(this.MainForm_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.panel2.ResumeLayout(false);
            this.panel2.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.qInput)).EndInit();
            this.RRPanel.ResumeLayout(false);
            this.RRPanel.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox txtConsole;
        private System.Windows.Forms.Label CountTime;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Button ClearBtn;
        private System.Windows.Forms.Panel GanttChartPanel;
        private System.Windows.Forms.Button deleteBtn;
        private System.Windows.Forms.Button addBtn;
        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.RadioButton PreemptiveBtn;
        private System.Windows.Forms.RadioButton NonPreemptiveBtn;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Button RunBtn;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem toolStripMenuItem1;
        private System.Windows.Forms.ToolStripMenuItem FCFS_menu;
        private System.Windows.Forms.ToolStripMenuItem SJF_menu;
        private System.Windows.Forms.ToolStripMenuItem Priority_menu;
        private System.Windows.Forms.ToolStripMenuItem RR_menu;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.TextBox Algorithm;
        private System.Windows.Forms.ToolStripMenuItem chọnThuậtToánTạiĐâyToolStripMenuItem;
        private System.Windows.Forms.ToolTip toolTip1;
        private System.Windows.Forms.NumericUpDown qInput;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Panel RRPanel;
        private System.Windows.Forms.DataGridViewTextBoxColumn stt;
        private System.Windows.Forms.DataGridViewTextBoxColumn CotThoiGianDen;
        private System.Windows.Forms.DataGridViewTextBoxColumn CotThoiGianXuLy;
    }
}

